package X;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS18S0202000_8;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tTR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666710tTR {
    public static final float LIZ = 64;

    public static final void LJ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0) {
        int i3;
        int i4;
        int i5;
        C13ZC c13zc;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1780948202);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            c13zc = c13zcLJIIJ;
        } else {
            if (i6 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIJ = C1682520tsw.LJIIJ(C1675980tiO.LIZIZ(c.LJI(c.LJ(interfaceC1685750ty92, 1.0f), LIZ), C1670400tZO.LIZIZ(c13zcLJIIJ).G3(), C1669430tXp.LIZ), 20, 0.0f, 2);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIJ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                String strLIZIZ = C0MBB.LIZIZ(2131832424, c13zcLJIIJ);
                C1693430uAX c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJ;
                long jK3 = C1670400tZO.LIZIZ(c13zcLJIIJ).K3();
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                C1685190txF.LIZ(strLIZIZ, c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJFF), jK3, c1693430uAX, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 0, 0, 2032);
                c13zc = c13zcLJIIJ;
                C1668060tVc.LIZLLL(new C1668880tWw(R.raw.icon_x_mark_small), c.LJIILIIL(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJI), 40), false, "Close", function0, c13zc, ((i3 << 12) & 57344) | 3072, 4);
                c13zc.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zc.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS18S0202000_8(i, i2, interfaceC1685750ty92, function0, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(int r48, kotlin.jvm.functions.Function0<kotlin.Unit> r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, X.InterfaceC1685750ty9 r51, X.InterfaceC1680500tpg r52, int r53, int r54) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1666710tTR.LIZIZ(int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0ty9, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(X.C0M2A r30, X.C0M22 r31, boolean r32, float r33, boolean r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, X.InterfaceC1680500tpg r36, int r37) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1666710tTR.LJFF(X.0M2A, X.0M22, boolean, float, boolean, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C0M0P r39, X.C0M22 r40, boolean r41, X.InterfaceC1631630sYr<? super java.lang.String, ? super java.lang.String, ? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r42, kotlin.jvm.functions.Function0<kotlin.Unit> r43, kotlin.jvm.functions.Function0<kotlin.Unit> r44, X.InterfaceC1685750ty9 r45, X.InterfaceC1680500tpg r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1666710tTR.LIZJ(X.0M0P, X.0M22, boolean, X.0sYr, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0ty9, X.0tpg, int, int):void");
    }

    public static final void LIZ(List<C0M2A> list, Set<String> set, C0M22 c0m22, InterfaceC1631630sYr<? super String, ? super String, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, Function0<Unit> function0, Function1<? super String, Unit> function1, Function1<? super C0M2A, Unit> function12, Function1<? super C0M0P, Unit> function13, Function0<Unit> function02, Function1<? super Set<String>, Unit> function14, Function1<? super String, Unit> function15, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1144848441);
        int i14 = 4;
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(list)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(set)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c0m22)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i3 |= i11;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631630sYr)) {
                i10 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(function13)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i3 |= i6;
        }
        if ((805306368 & i) == 0) {
            if (c13zcLJIIJ.LJII(function14)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i3 |= i5;
        }
        if ((i2 & 6) == 0) {
            if (!c13zcLJIIJ.LJII(function15)) {
                i14 = 2;
            }
            i4 = i2 | i14;
        } else {
            i4 = i2;
        }
        if ((i3 & 273228947) == 273228946 && (i4 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            float f = ((Configuration) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZ)).screenHeightDp * 0.8f;
            C1672790tdF.LIZIZ(new C0NWI(f), false, false, false, false, true, null, 0L, null, function0, false, 0L, 0L, Boolean.FALSE, C13Z4.LIZJ(1159438231, new C0M4Z(f, list, set, c0m22, interfaceC1631630sYr, function0, function1, function12, function13, function14, function15), c13zcLJIIJ), c13zcLJIIJ, ((i3 << 15) & 1879048192) | 196608, 27654, 6622);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C0M2N(list, set, c0m22, interfaceC1631630sYr, function0, function1, function12, function13, function02, function14, function15, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(float r42, java.util.List<X.C0M2A> r43, java.util.Set<java.lang.String> r44, X.C0M22 r45, X.InterfaceC1631630sYr<? super java.lang.String, ? super java.lang.String, ? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r48, kotlin.jvm.functions.Function1<? super X.C0M2A, kotlin.Unit> r49, kotlin.jvm.functions.Function1<? super X.C0M0P, kotlin.Unit> r50, kotlin.jvm.functions.Function1<? super java.util.Set<java.lang.String>, kotlin.Unit> r51, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r52, X.InterfaceC1680500tpg r53, int r54, int r55) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1666710tTR.LIZLLL(float, java.util.List, java.util.Set, X.0M22, X.0sYr, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.0tpg, int, int):void");
    }
}
