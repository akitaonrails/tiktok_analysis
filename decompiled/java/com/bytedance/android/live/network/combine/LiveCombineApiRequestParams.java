package com.bytedance.android.live.network.combine;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveCombineApiRequestParams {

    @C09CT("delay_time")
    public long delayTime;

    @C09CT("query_params")
    public Map<String, String> queryParams;

    @C09CT("body_params")
    public String bodyParams = "";

    @C09CT("method")
    public String method = "GET";

    @C09CT("content_type")
    public String contentType = "";
}
