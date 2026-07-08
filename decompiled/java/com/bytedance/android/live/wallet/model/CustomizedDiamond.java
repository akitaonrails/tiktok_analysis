package com.bytedance.android.live.wallet.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class CustomizedDiamond {

    @C09CT("coupon_id")
    public String couponId;

    @C09CT("describe")
    public String describe;

    @C09CT("diamond_count_rate")
    public Float diamondCountRate;

    @C09CT("giving_count")
    public Integer givingCount;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id;

    @C09CT("price_max")
    public Integer priceMax;

    @C09CT("price_min")
    public Integer priceMin;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.priceMin != null) {
            sb.append(", price_min=");
            sb.append(this.priceMin);
        }
        if (this.priceMax != null) {
            sb.append(", price_max=");
            sb.append(this.priceMax);
        }
        if (this.diamondCountRate != null) {
            sb.append(", diamond_count_rate=");
            sb.append(this.diamondCountRate);
        }
        if (this.givingCount != null) {
            sb.append(", giving_count=");
            sb.append(this.givingCount);
        }
        if (this.describe != null) {
            sb.append(", describe=");
            sb.append(this.describe);
        }
        if (this.couponId != null) {
            sb.append(", coupon_id=");
            sb.append(this.couponId);
        }
        sb.replace(0, 2, "CustomizedDiamond{");
        sb.append('}');
        return sb.toString();
    }
}
