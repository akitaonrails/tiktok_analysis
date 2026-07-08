package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS7S0201100_25;

/* JADX INFO: renamed from: X.0tnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678940tnA {
    public static final long LIZ = C1682390tsj.LIZ(0, 0, 0, 0);
    public static final float LIZIZ = 16;
    public static final float LIZJ = 12;
    public static final InterfaceC1685750ty9 LIZLLL;

    static {
        float f = 48;
        LIZLLL = c.LIZ(InterfaceC1685750ty9.LIZ, f, f);
    }

    public static final Object LIZJ(InterfaceC1676340tiy interfaceC1676340tiy) {
        InterfaceC1679180tnY interfaceC1679180tnY;
        Object objLJJJ = interfaceC1676340tiy.LJJJ();
        if (!(objLJJJ instanceof InterfaceC1679180tnY) || (interfaceC1679180tnY = (InterfaceC1679180tnY) objLJJJ) == null) {
            return null;
        }
        return interfaceC1679180tnY.getLayoutId();
    }

    public static final int LIZLLL(AbstractC1686530tzP abstractC1686530tzP) {
        if (abstractC1686530tzP != null) {
            return abstractC1686530tzP.LLILLJJLI;
        }
        return 0;
    }

    public static final int LJ(AbstractC1686530tzP abstractC1686530tzP) {
        if (abstractC1686530tzP != null) {
            return abstractC1686530tzP.LL;
        }
        return 0;
    }

    public static final void LIZIZ(long j, C1693430uAX c1693430uAX, Float f, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Float f2;
        C1693430uAX c1693430uAX2 = c1693430uAX;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-399493340);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1693430uAX2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (c13zcLJIIJ.LJJIIJ(f)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (c13zcLJIIJ.LJII(function2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 5851) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            f2 = f;
        } else {
            f2 = null;
            if (i8 != 0) {
                c1693430uAX2 = null;
            }
            if (i9 == 0) {
                f2 = f;
            }
            C19719212De c19719212DeLIZIZ = C13Z4.LIZIZ(c13zcLJIIJ, 494684590, new AwS7S0201100_25(i3, j, f2, function2, 0));
            if (c1693430uAX2 != null) {
                c13zcLJIIJ.LJJIJIIJIL(-2009952671);
                C1682320tsc.LIZ(c1693430uAX2, c19719212DeLIZIZ, c13zcLJIIJ, ((i3 >> 3) & 14) | 48);
            } else {
                c13zcLJIIJ.LJJIJIIJIL(-2009952619);
                c19719212DeLIZIZ.invoke(c13zcLJIIJ, 6);
            }
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1678970tnD(j, c1693430uAX2, f2, function2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.EnumC1679020tnI r45, java.lang.String r46, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r47, X.InterfaceC1679160tnW r48, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r49, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r50, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r51, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r52, boolean r53, boolean r54, boolean r55, X.C0NV4 r56, X.InterfaceC1679150tnV r57, X.InterfaceC1679000tnG r58, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r59, X.InterfaceC1680500tpg r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instruction units count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1678940tnA.LIZ(X.0tnI, java.lang.String, kotlin.jvm.functions.Function2, X.0tnW, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, X.0NV4, X.0tnV, X.0tnG, kotlin.jvm.functions.Function2, X.0tpg, int, int, int):void");
    }
}
