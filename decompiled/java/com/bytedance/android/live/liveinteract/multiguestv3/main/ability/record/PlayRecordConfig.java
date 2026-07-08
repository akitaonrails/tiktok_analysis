package com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class PlayRecordConfig {
    public static final TypeAdapter ADAPTER = new PlayRecordConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("first_check_gift")
    public boolean firstCheckGift;

    @C09CT("validate")
    public boolean validate;

    public PlayRecordConfig() {
        this(true, false, true);
    }

    public PlayRecordConfig(boolean z, boolean z2, boolean z3) {
        this.enable = z;
        this.validate = z2;
        this.firstCheckGift = z3;
    }
}
