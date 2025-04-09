package com.entity.vo;

import com.entity.CaipinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商品
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("caipin")
public class CaipinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 商家
     */

    @TableField(value = "shangjia_id")
    private Integer shangjiaId;


    /**
     * 商品名称
     */

    @TableField(value = "caipin_name")
    private String caipinName;


    /**
     * 商品照片
     */

    @TableField(value = "caipin_photo")
    private String caipinPhoto;


    /**
     * 商品类型
     */

    @TableField(value = "caipin_types")
    private Integer caipinTypes;


    /**
     * 商品库存
     */

    @TableField(value = "caipin_kucun_number")
    private Integer caipinKucunNumber;


    /**
     * 商品原价
     */

    @TableField(value = "caipin_old_money")
    private Double caipinOldMoney;


    /**
     * 现价
     */

    @TableField(value = "caipin_new_money")
    private Double caipinNewMoney;


    /**
     * 点击次数
     */

    @TableField(value = "caipin_clicknum")
    private Integer caipinClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "caipin_delete")
    private Integer caipinDelete;


    /**
     * 商品简介
     */

    @TableField(value = "caipin_content")
    private String caipinContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：商家
	 */
    public Integer getShangjiaId() {
        return shangjiaId;
    }


    /**
	 * 获取：商家
	 */

    public void setShangjiaId(Integer shangjiaId) {
        this.shangjiaId = shangjiaId;
    }
    /**
	 * 设置：商品名称
	 */
    public String getCaipinName() {
        return caipinName;
    }


    /**
	 * 获取：商品名称
	 */

    public void setCaipinName(String caipinName) {
        this.caipinName = caipinName;
    }
    /**
	 * 设置：商品照片
	 */
    public String getCaipinPhoto() {
        return caipinPhoto;
    }


    /**
	 * 获取：商品照片
	 */

    public void setCaipinPhoto(String caipinPhoto) {
        this.caipinPhoto = caipinPhoto;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getCaipinTypes() {
        return caipinTypes;
    }


    /**
	 * 获取：商品类型
	 */

    public void setCaipinTypes(Integer caipinTypes) {
        this.caipinTypes = caipinTypes;
    }
    /**
	 * 设置：商品库存
	 */
    public Integer getCaipinKucunNumber() {
        return caipinKucunNumber;
    }


    /**
	 * 获取：商品库存
	 */

    public void setCaipinKucunNumber(Integer caipinKucunNumber) {
        this.caipinKucunNumber = caipinKucunNumber;
    }
    /**
	 * 设置：商品原价
	 */
    public Double getCaipinOldMoney() {
        return caipinOldMoney;
    }


    /**
	 * 获取：商品原价
	 */

    public void setCaipinOldMoney(Double caipinOldMoney) {
        this.caipinOldMoney = caipinOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getCaipinNewMoney() {
        return caipinNewMoney;
    }


    /**
	 * 获取：现价
	 */

    public void setCaipinNewMoney(Double caipinNewMoney) {
        this.caipinNewMoney = caipinNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getCaipinClicknum() {
        return caipinClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setCaipinClicknum(Integer caipinClicknum) {
        this.caipinClicknum = caipinClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getCaipinDelete() {
        return caipinDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setCaipinDelete(Integer caipinDelete) {
        this.caipinDelete = caipinDelete;
    }
    /**
	 * 设置：商品简介
	 */
    public String getCaipinContent() {
        return caipinContent;
    }


    /**
	 * 获取：商品简介
	 */

    public void setCaipinContent(String caipinContent) {
        this.caipinContent = caipinContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
