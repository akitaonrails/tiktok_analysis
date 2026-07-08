package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.cell.PrivacyItemVM;
import kotlin.jvm.internal.AwS2S0121000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Y6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14Y6 {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C10EY r35, boolean r36, boolean r37, X.InterfaceC1680500tpg r38, int r39) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14Y6.LIZ(X.10EY, boolean, boolean, X.0tpg, int):void");
    }

    public static final void LIZIZ(boolean z, boolean z2, PrivacyItemVM privacyItemVM, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1084767426);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(privacyItemVM)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            int i6 = (i2 >> 6) & 14;
            C1688940u3I.LIZ(privacyItemVM, c13zcLJIIJ, i6);
            C05P0 c05p0LIZ = C1244280iU6.LIZ(privacyItemVM, null, c13zcLJIIJ, i6, 7);
            if (!Intrinsics.LJFF(c05p0LIZ.getValue(), C10EY.LLJI)) {
                int i7 = i2 << 3;
                LIZ((C10EY) c05p0LIZ.getValue(), z, z2, c13zcLJIIJ, (i7 & 896) | (i7 & 112));
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0121000_30(z, z2, privacyItemVM, i, 33);
        }
    }
}
