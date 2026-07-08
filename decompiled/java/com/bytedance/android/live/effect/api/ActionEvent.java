package com.bytedance.android.live.effect.api;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class ActionEvent {
    public final float LIZ;

    @C09CT("visible")
    public final boolean visible;

    public ActionEvent() {
        this(false, 0.0f, 0.0f);
    }

    public ActionEvent(boolean z, float f, float f2) {
        this.visible = z;
        this.LIZ = f2;
    }
}
