package com.bytedance.android.live.wallet.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class FirstChargeRequestParams {

    @C09CT("channel")
    public String channel;

    @C09CT("currency")
    public String currency;

    @C09CT("force_source_region")
    public boolean forceSourceRegion;

    @C09CT("live_id")
    public Long liveId;

    @C09CT("platform_type")
    public String platformType = "";

    @C09CT("type")
    public Long type;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.liveId != null) {
            sb.append(", live_id=");
            sb.append(this.liveId);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        if (this.currency != null) {
            sb.append(", currency=");
            sb.append(this.currency);
        }
        sb.replace(0, 2, "FirstChargeRequestParams{");
        sb.append('}');
        return sb.toString();
    }
}
