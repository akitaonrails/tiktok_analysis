package com.bef.effectsdk.view;

import X.C08FF;

/* JADX INFO: loaded from: classes26.dex */
public enum BEFView$FitMode {
    FIT_WIDTH,
    FIT_HEIGHT,
    FILL_SCREEN,
    FIT_WIDTH_BOTTOM,
    NO_CLIP;

    public static BEFView$FitMode valueOf(String str) {
        return (BEFView$FitMode) C08FF.LIZ(BEFView$FitMode.class, str);
    }
}
