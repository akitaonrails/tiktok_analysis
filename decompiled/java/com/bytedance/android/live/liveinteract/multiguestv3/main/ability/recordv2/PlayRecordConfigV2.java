package com.bytedance.android.live.liveinteract.multiguestv3.main.ability.recordv2;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class PlayRecordConfigV2 {
    public static final TypeAdapter ADAPTER = new PlayRecordConfigV2_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("first_check_gift")
    public boolean firstCheckGift;

    @C09CT("validate")
    public boolean validate;

    public PlayRecordConfigV2() {
        this(true, false, true);
    }

    public PlayRecordConfigV2(boolean z, boolean z2, boolean z3) {
        this.enable = z;
        this.validate = z2;
        this.firstCheckGift = z3;
    }
}
