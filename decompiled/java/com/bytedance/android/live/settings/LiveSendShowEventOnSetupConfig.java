package com.bytedance.android.live.settings;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSendShowEventOnSetupConfig {
    public static final TypeAdapter ADAPTER = new LiveSendShowEventOnSetupConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("allowed_enter_from_merge")
    public List<String> allowedEnterFromMerge;

    public LiveSendShowEventOnSetupConfig() {
        this(null, 1, null);
    }

    public LiveSendShowEventOnSetupConfig(List<String> list) {
        this.allowedEnterFromMerge = list;
    }

    public LiveSendShowEventOnSetupConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
