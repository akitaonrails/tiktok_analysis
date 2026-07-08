package X;

import android.view.inputmethod.HandwritingGesture;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0uCU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694640uCU {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZJ(int i) {
        if (i == 1) {
            return 1;
        }
        return 0;
    }

    public static int LIZ(HandwritingGesture handwritingGesture, AwS604S0100000_25 awS604S0100000_25) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        awS604S0100000_25.invoke(new C1694270uBt(fallbackText, 1));
        return 5;
    }

    public static void LIZIZ(long j, C1692220u8a c1692220u8a, boolean z, AwS604S0100000_25 awS604S0100000_25) {
        int iCodePointBefore;
        if (z) {
            int iCharCount = (int) (j >> 32);
            int iLIZLLL = C1692280u8g.LIZLLL(j);
            int iCodePointAt = 10;
            if (iCharCount > 0) {
                iCodePointBefore = Character.codePointBefore(c1692220u8a, iCharCount);
            } else {
                iCodePointBefore = 10;
            }
            if (iLIZLLL < c1692220u8a.length()) {
                iCodePointAt = Character.codePointAt(c1692220u8a, iLIZLLL);
            }
            if (C1694610uCR.LJIIIIZZ(iCodePointBefore) && (C1694610uCR.LJII(iCodePointAt) || C1694610uCR.LJI(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c1692220u8a, iCharCount);
                    }
                } while (C1694610uCR.LJIIIIZZ(iCodePointBefore));
                j = C1680680tpy.LIZ(iCharCount, iLIZLLL);
            } else if (C1694610uCR.LJIIIIZZ(iCodePointAt) && (C1694610uCR.LJII(iCodePointBefore) || C1694610uCR.LJI(iCodePointBefore))) {
                do {
                    iLIZLLL += Character.charCount(iCodePointAt);
                    if (iLIZLLL == c1692220u8a.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c1692220u8a, iLIZLLL);
                    }
                } while (C1694610uCR.LJIIIIZZ(iCodePointAt));
                j = C1680680tpy.LIZ(iCharCount, iLIZLLL);
            }
        }
        awS604S0100000_25.invoke(new C1694420uC8(new InterfaceC1694390uC5[]{new C1694320uBy(C1692280u8g.LIZLLL(j), C1692280u8g.LIZLLL(j)), new C1694400uC6(C1692280u8g.LJ(j), 0)}));
    }
}
