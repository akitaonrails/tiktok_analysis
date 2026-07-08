package com.bef.effectsdk.view;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes26.dex */
public /* synthetic */ class BEFView$12 {
    public static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode;

    static {
        int[] iArr = new int[BEFView$FitMode.values().length];
        $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode = iArr;
        try {
            iArr[BEFView$FitMode.FIT_WIDTH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[BEFView$FitMode.FIT_HEIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[BEFView$FitMode.FILL_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            $SwitchMap$com$bef$effectsdk$view$BEFView$FitMode[BEFView$FitMode.NO_CLIP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
