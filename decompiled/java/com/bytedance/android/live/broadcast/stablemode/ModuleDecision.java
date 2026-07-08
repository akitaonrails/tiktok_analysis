package com.bytedance.android.live.broadcast.stablemode;

import X.C09CT;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class ModuleDecision {
    public transient DowngradeInfo LIZ;
    public transient JSONObject LIZIZ;

    @C09CT("feature_params")
    public final Map<String, Object> featureParams;

    @C09CT("features")
    public final List<String> features;

    @C09CT("module")
    public final String module;

    public ModuleDecision(DowngradeInfo downgradeInfo, JSONObject jSONObject, String str, List<String> list, Map<String, ? extends Object> map) {
        this.LIZ = downgradeInfo;
        this.LIZIZ = jSONObject;
        this.module = str;
        this.features = list;
        this.featureParams = map;
    }
}
