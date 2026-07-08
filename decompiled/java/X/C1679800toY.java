package X;

import androidx.compose.foundation.layout.c;
import kotlin.jvm.internal.AFwS347S0000000_25;
import kotlin.jvm.internal.AwS49S0102000_25;

/* JADX INFO: renamed from: X.0toY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679800toY {
    public static final float LIZ;
    public static final float LIZIZ;

    static {
        float f = 25;
        LIZ = f;
        LIZIZ = (f * 2.0f) / 2.4142137f;
    }

    public static final void LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(694251107);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i3 & 1, z)) {
            if (i5 != 0) {
                interfaceC1685750ty9 = InterfaceC1685750ty9.LIZ;
            }
            C1665790tRx.LIZ(C1685720ty6.LIZIZ(c.LJIILJJIL(interfaceC1685750ty9, LIZIZ, LIZ), AFwS347S0000000_25.get$arr$(27)), c13zcLJIIJ);
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS49S0102000_25(i, i2, interfaceC1685750ty9, 22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.InterfaceC1680040tow r13, X.InterfaceC1685750ty9 r14, long r15, X.InterfaceC1680500tpg r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1679800toY.LIZ(X.0tow, X.0ty9, long, X.0tpg, int, int):void");
    }
}
