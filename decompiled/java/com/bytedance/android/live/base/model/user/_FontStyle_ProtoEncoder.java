package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _FontStyle_ProtoEncoder implements InterfaceC1132110fZB<FontStyle> {
    public static int LIZLLL(FontStyle fontStyle) {
        if (fontStyle == null) {
            return 0;
        }
        return C1142340fpg.LJIIIZ(1, fontStyle.fontSize) + C1142340fpg.LJIIIZ(2, fontStyle.fontWidth) + C1142340fpg.LJIILL(3, fontStyle.fontColor) + C1142340fpg.LJIILL(4, fontStyle.borderColor);
    }

    public static void LIZIZ(C1142350fph c1142350fph, FontStyle fontStyle) {
        int i = fontStyle.fontSize;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        int i2 = fontStyle.fontWidth;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i2);
        C1142340fpg.LJFF(c1142350fph, 3, fontStyle.fontColor);
        C1142340fpg.LJFF(c1142350fph, 4, fontStyle.borderColor);
    }

    public static int LJ(int i, FontStyle fontStyle) {
        if (fontStyle == null) {
            return 0;
        }
        int iLIZLLL = LIZLLL(fontStyle);
        return iLIZLLL + C1142350fph.LIZIZ(iLIZLLL) + C1142350fph.LIZ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, FontStyle fontStyle) {
        LIZIZ(c1142350fph, fontStyle);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, FontStyle fontStyle) {
        if (fontStyle == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        c1142350fph.LJ(LIZLLL(fontStyle));
        LIZIZ(c1142350fph, fontStyle);
    }
}
