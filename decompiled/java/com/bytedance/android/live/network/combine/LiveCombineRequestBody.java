package com.bytedance.android.live.network.combine;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveCombineRequestBody {

    @C09CT("extra")
    public Map<String, ? extends Object> extraParams;

    @C09CT("request_info")
    public Map<String, LiveCombineApiRequestParams> requestInfo;

    public final Map<String, Object> getExtraParams() {
        return this.extraParams;
    }

    public final Map<String, LiveCombineApiRequestParams> getRequestInfo() {
        return this.requestInfo;
    }

    public final void setExtraParams(Map<String, ? extends Object> map) {
        this.extraParams = map;
    }

    public final void setRequestInfo(Map<String, LiveCombineApiRequestParams> map) {
        this.requestInfo = map;
    }
}
