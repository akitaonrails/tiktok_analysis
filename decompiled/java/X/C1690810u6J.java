package X;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS6S0302000_25;

/* JADX INFO: renamed from: X.0u6J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690810u6J {
    public static final float LIZJ(float f, InterfaceC1680500tpg interfaceC1680500tpg) {
        float fLLIIIJ;
        interfaceC1680500tpg.LJJIIJZLJL(-2067691975);
        if (f > 0.0f) {
            fLLIIIJ = ((InterfaceC1690500u5o) interfaceC1680500tpg.LJJIL(C20055113dV.LJII)).LLIIIJ(C497820Jfg.LIZ((Context) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ)) * f) - ((float) 52.5d);
        } else {
            fLLIIIJ = Float.NaN;
        }
        interfaceC1680500tpg.LJ();
        return fLLIIIJ;
    }

    public static final void LIZ(AbstractC1690640u62 abstractC1690640u62, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1631620sYq<? super Integer, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty9LJIJI;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1988107526);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1690640u62)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1696870uG5.LIZ(0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC1676320tiw interfaceC1676320tiw = (InterfaceC1676320tiw) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            Boolean boolValueOf = Boolean.valueOf(abstractC1690640u62.LIZIZ());
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            int i8 = i3 & 14;
            if (i8 == 4) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1690690u67(abstractC1690640u62, interfaceC1676320tiw, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ2, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(689153052);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1672150tcD.LIZ(interfaceC1685750ty92);
            c13zcLJIIJ.LJJIIJZLJL(689153600);
            if (interfaceC1676320tiw.LIZLLL() != 0) {
                interfaceC1685750ty9LJIJI = c.LJI(interfaceC1685750ty9LIZ, ((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII)).LJJI(interfaceC1676320tiw.LIZLLL()));
            } else {
                interfaceC1685750ty9LJIJI = c.LJIJI(interfaceC1685750ty9LIZ, null, 3);
            }
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJJJL(false);
            C1675550thh.LIZ(abstractC1690640u62, interfaceC1685750ty9LJIJI, null, null, 0, 0.0f, null, null, false, false, null, null, null, null, C13Z4.LIZJ(1408178491, new C1698420uIa(interfaceC1631620sYq, (InterfaceC1631620sYq<? super Integer, ? super InterfaceC1680500tpg, ? super Integer, Unit>) 7), c13zcLJIIJ), c13zcLJIIJ, i8 | 100663296, 24576, 16124);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0302000_25(abstractC1690640u62, (AbstractC1690640u62) interfaceC1685750ty92, (InterfaceC1685750ty9) interfaceC1631620sYq, (InterfaceC1631620sYq<? super Integer, ? super InterfaceC1680500tpg, ? super Integer, Unit>) i, i2, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.AbstractC1690640u62 r25, X.InterfaceC1690880u6Q r26, kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.account.login.auth.SignupViewModel> r27, X.InterfaceC1685750ty9 r28, X.InterfaceC1631630sYr<? super java.lang.Integer, ? super java.lang.Boolean, ? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r29, X.InterfaceC1680500tpg r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690810u6J.LIZIZ(X.0u62, X.0u6Q, kotlin.jvm.functions.Function0, X.0ty9, X.0sYr, X.0tpg, int, int):void");
    }
}
