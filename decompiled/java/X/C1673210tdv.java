package X;

import Y.AObjectS124S0000000_25;
import Y.AObjectS2S0112000_19;
import Y.AObjectS2S0302000_25;
import Y.AObjectS2S0501000_25;
import Y.AObjectS360S0200000_25;
import Y.AObjectS3S1102000_25;
import Y.AObjectS75S0000000_25;
import androidx.compose.foundation.layout.c;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673210tdv {
    public static final C13DQ LIZ = C13ZT.LIZJ(new AObjectS75S0000000_25(3));
    public static final C13DQ LIZIZ = C13ZT.LIZJ(new AObjectS75S0000000_25(4));
    public static final C13DQ LIZJ = C13ZT.LIZJ(new AObjectS75S0000000_25(5));
    public static final float LIZLLL = 12;

    public static final void LJII(final InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(581470560);
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
        if ((i3 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i5 != 0) {
                interfaceC1685750ty9 = InterfaceC1685750ty9.LIZ;
            }
            float f = 24;
            C1668690tWd.LIZJ(c.LJIILJJIL(interfaceC1685750ty9, f, f), ((InterfaceC1673170tdr) c13zcLJIIJ.LJJIL(C1689320u3u.LIZ)).LJIIIZ(c13zcLJIIJ), new C1685910tyP(C1670400tZO.LIZIZ(c13zcLJIIJ).Q3()), c13zcLJIIJ, 0, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0te2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
                    int i6 = i;
                    int i7 = i2;
                    ((Integer) obj2).intValue();
                    C1673210tdv.LJII(interfaceC1685750ty92, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i6 | 1), i7);
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LIZJ(final boolean z, final C1668880tWw c1668880tWw, final long j, InterfaceC1680500tpg interfaceC1680500tpg, final int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-2078438804);
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
            if (c13zcLJIIJ.LJJIIJ(c1668880tWw)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1673180tds c1673180tds = (C1673180tds) c13zcLJIIJ.LJJIL(LIZJ);
            if (c1673180tds != null) {
                c1673180tds.LIZ(null);
                c1673180tds.LIZJ(null);
                c1673180tds.LIZIZ(null);
            }
            InterfaceC1686200tys interfaceC1686200tys = C1670400tZO.LIZ(c13zcLJIIJ).LJJ;
            if (z) {
                f = 180.0f;
            } else {
                f = 0.0f;
            }
            C05P1 c05p1LIZIZ = C1675660ths.LIZIZ(f, C1671550tbF.LIZLLL(200, 0, interfaceC1686200tys, 2), 0.0f, null, null, c13zcLJIIJ, 0, 28);
            float f2 = 16;
            C1668930tX1.LIZIZ(c1668880tWw, null, C1666440tT0.LIZ(C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, LIZLLL, 18, 0.0f, 0.0f, 12), ((Number) c05p1LIZIZ.getValue()).floatValue()), j, f2, f2, false, c13zcLJIIJ, ((i2 >> 3) & 14) | 221232 | ((i2 << 3) & 7168), 64);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0te3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2 = z;
                    C1668880tWw c1668880tWw2 = c1668880tWw;
                    long j2 = j;
                    int i6 = i;
                    ((Integer) obj2).intValue();
                    C1673210tdv.LIZJ(z2, c1668880tWw2, j2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i6 | 1));
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LJFF(final String str, final long j, final C1693430uAX c1693430uAX, InterfaceC1680500tpg interfaceC1680500tpg, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1439645455);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1693430uAX)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = new AObjectS124S0000000_25(5);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            int i6 = (i2 & 14) | 102236160;
            int i7 = i2 << 3;
            C1685190txF.LIZ(str, C1689740u4a.LIZ(c1685760tyA, (Function1) objLJJ), j, c1693430uAX, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, i6 | (i7 & 896) | (i7 & 7168), 0, 1712);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0te1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    long j2 = j;
                    C1693430uAX c1693430uAX2 = c1693430uAX;
                    int i8 = i;
                    ((Integer) obj2).intValue();
                    C1673210tdv.LJFF(str2, j2, c1693430uAX2, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i8 | 1));
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LJI(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str) {
        int i3;
        int i4;
        int i5;
        long jQ3;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(65797045);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
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
        } else {
            if (i6 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1673170tdr interfaceC1673170tdr = (InterfaceC1673170tdr) c13zcLJIIJ.LJJIL(C1689320u3u.LIZ);
            boolean zBooleanValue = ((Boolean) c13zcLJIIJ.LJJIL(LIZ)).booleanValue();
            C1693430uAX c1693430uAXLJFF = interfaceC1673170tdr.LJFF(c13zcLJIIJ);
            if (zBooleanValue) {
                c13zcLJIIJ.LJJIIJZLJL(-1193538756);
                jQ3 = C1670400tZO.LIZIZ(c13zcLJIIJ).N3();
            } else {
                c13zcLJIIJ.LJJIIJZLJL(-1193537818);
                jQ3 = C1670400tZO.LIZIZ(c13zcLJIIJ).Q3();
            }
            c13zcLJIIJ.LJJJJL(false);
            C1685190txF.LIZ(str, LJIILIIL(interfaceC1685750ty92, true, 17, 0.0f, 4), jQ3, c1693430uAXLJFF, 0L, 0, 2, false, 1, null, null, c13zcLJIIJ, (i3 & 14) | 102236160, 0, 1712);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS3S1102000_25(i, i2, interfaceC1685750ty92, str, 0);
        }
    }

    public static final void LJIIIIZZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z) {
        int i3;
        int i4;
        int i5;
        boolean z2 = z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-633862077);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
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
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i6 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i7 != 0) {
                z2 = true;
            }
            C1673180tds c1673180tds = (C1673180tds) c13zcLJIIJ.LJJIL(LIZJ);
            if (c1673180tds != null) {
                c1673180tds.LIZ(Boolean.valueOf(z2));
                c1673180tds.LIZJ(new C20279814Wu(3));
                c1673180tds.LIZIZ(null);
            }
            boolean zBooleanValue = ((Boolean) c13zcLJIIJ.LJJIL(LIZ)).booleanValue();
            if (((Boolean) c13zcLJIIJ.LJJIL(LIZIZ)).booleanValue()) {
                c13zcLJIIJ.LJJIIJZLJL(1586417728);
                LJII(LJIILIIL(interfaceC1685750ty92, false, 14, 0.0f, 5), c13zcLJIIJ, 0, 0);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(1586553508);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = new AObjectS124S0000000_25(3);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1670100tYu.LIZ(z2, null, LJIILIIL(C1689740u4a.LIZ(interfaceC1685750ty92, (Function1) objLJJ), false, 14, 0.0f, 5), zBooleanValue, null, null, c13zcLJIIJ, ((i3 >> 3) & 14) | 48, 48);
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS2S0112000_19(i, i2, interfaceC1685750ty92, z2, 1);
        }
    }

    public static final void LJIIIZ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z) {
        int i3;
        int i4;
        int i5;
        boolean z2 = z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(707180972);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
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
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i6 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i7 != 0) {
                z2 = true;
            }
            C1673180tds c1673180tds = (C1673180tds) c13zcLJIIJ.LJJIL(LIZJ);
            if (c1673180tds != null) {
                c1673180tds.LIZ(Boolean.valueOf(z2));
                c1673180tds.LIZJ(new C20279814Wu(2));
                c1673180tds.LIZIZ(null);
            }
            boolean zBooleanValue = ((Boolean) c13zcLJIIJ.LJJIL(LIZ)).booleanValue();
            boolean zBooleanValue2 = ((Boolean) c13zcLJIIJ.LJJIL(LIZIZ)).booleanValue();
            InterfaceC1673170tdr interfaceC1673170tdr = (InterfaceC1673170tdr) c13zcLJIIJ.LJJIL(C1689320u3u.LIZ);
            if (zBooleanValue2) {
                c13zcLJIIJ.LJJIIJZLJL(814159887);
                LJII(LJIILIIL(interfaceC1685750ty92, false, (float) 7.5d, interfaceC1673170tdr.LJIIIIZZ(c13zcLJIIJ), 1), c13zcLJIIJ, 0, 0);
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(814368083);
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = new AObjectS124S0000000_25(4);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1673100tdk.LIZIZ(z2, null, LJIILIIL(C1689740u4a.LIZ(interfaceC1685750ty92, (Function1) objLJJ), false, 12, interfaceC1673170tdr.LJIIIIZZ(c13zcLJIIJ), 1), null, zBooleanValue, null, c13zcLJIIJ, ((i3 >> 3) & 14) | 48, 40);
                c13zcLJIIJ.LJJJJL(false);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS2S0112000_19(i, i2, interfaceC1685750ty92, z2, 0);
        }
    }

    public static InterfaceC1685750ty9 LJIILIIL(InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, float f, float f2, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            f = 0;
        }
        if ((i & 4) != 0) {
            f2 = 6;
        }
        return interfaceC1685750ty9.LIZ(new C1673320te6(f, f2, z));
    }

    public static final void LJIIJJI(final InterfaceC1631620sYq<? super Function1<? super C1692150u8T, Unit>, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631620sYq, InterfaceC1685750ty9 interfaceC1685750ty9, final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1861848519);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC1631620sYq)) {
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
            if (c13zcLJIIJ.LJII(function2)) {
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
            final InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            final int iLJLLJ = interfaceC1690500u5o.LJLLJ(LIZLLL);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(new C1673360teA());
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            final C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean z2 = true;
            if ((i3 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            if ((i3 & 14) != 4) {
                z2 = false;
            }
            boolean zLJIJI = z | z2 | c13zcLJIIJ.LJIJI(iLJLLJ) | c13zcLJIIJ.LJJIIJ(interfaceC1690500u5o);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJIJI || objLJJ2 == c1680520tpi) {
                objLJJ2 = new Function2() { // from class: X.0te7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Object next;
                        Object obj3;
                        int i8;
                        Object obj4;
                        int i9;
                        int i10;
                        Object obj5;
                        Object obj6;
                        int i11;
                        ArrayList arrayList;
                        Object obj7;
                        int i12;
                        Object obj8;
                        int i13;
                        Object obj9;
                        int i14;
                        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22 = function2;
                        InterfaceC1690500u5o interfaceC1690500u5o2 = interfaceC1690500u5o;
                        int i15 = iLJLLJ;
                        InterfaceC1631620sYq interfaceC1631620sYq2 = interfaceC1631620sYq;
                        C05P0 c05p02 = c05p0;
                        InterfaceC1672350tcX interfaceC1672350tcX = (InterfaceC1672350tcX) obj;
                        C1682380tsi c1682380tsi = (C1682380tsi) obj2;
                        List<InterfaceC1673370teB> listLJJLIL = interfaceC1672350tcX.LJJLIL(EnumC1673350te9.LLILLJJLI, function22);
                        ArrayList arrayList2 = new ArrayList(listLJJLIL.size());
                        int size = listLJJLIL.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            arrayList2.add(((InterfaceC1676340tiy) ListProtector.get(listLJJLIL, i16)).LJJJ());
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next instanceof C1673320te6) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C1673320te6 c1673320te6 = (C1673320te6) next;
                        C817403Hg c817403Hg = new C817403Hg();
                        c817403Hg.element = c1673320te6 != null ? c1673320te6.LIZJ : 0;
                        if (c1673320te6 != null && c1673320te6.LIZIZ) {
                            int iLJLLJ2 = interfaceC1690500u5o2.LJLLJ(86);
                            int iLJIIIIZZ = (C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ) - i15) - iLJLLJ2;
                            if (iLJIIIIZZ < 0) {
                                iLJIIIIZZ = 0;
                            }
                            List<InterfaceC1673370teB> listLJJLIL2 = interfaceC1672350tcX.LJJLIL(EnumC1673350te9.LL, new C19719212De(1479482101, new AObjectS360S0200000_25(interfaceC1631620sYq2, c05p02, 4), true));
                            ArrayList arrayList3 = new ArrayList(listLJJLIL2.size());
                            int size2 = listLJJLIL2.size();
                            for (int i17 = 0; i17 < size2; i17++) {
                                arrayList3.add(((InterfaceC1673370teB) ListProtector.get(listLJJLIL2, i17)).LJJJJZ(C1682380tsi.LIZ(0, iLJIIIIZZ, 0, C1682380tsi.LJII(c1682380tsi.LIZ))));
                            }
                            if (((C1673360teA) c05p02.getValue()).LIZ > 1) {
                                arrayList = new ArrayList(listLJJLIL.size());
                                int size3 = listLJJLIL.size();
                                for (int i18 = 0; i18 < size3; i18++) {
                                    InterfaceC1673370teB interfaceC1673370teB = (InterfaceC1673370teB) ListProtector.get(listLJJLIL, i18);
                                    long j = c1682380tsi.LIZ;
                                    arrayList.add(interfaceC1673370teB.LJJJJZ(C1682380tsi.LIZ(iLJLLJ2, iLJLLJ2, C1682380tsi.LJIIIZ(j), C1682380tsi.LJII(j))));
                                }
                            } else {
                                if (arrayList3.isEmpty()) {
                                    obj6 = null;
                                } else {
                                    obj6 = ListProtector.get(arrayList3, 0);
                                    int i19 = ((AbstractC1686530tzP) obj6).LL;
                                    int size4 = arrayList3.size() - 1;
                                    if (1 <= size4) {
                                        int i20 = 1;
                                        while (true) {
                                            Object obj10 = ListProtector.get(arrayList3, i20);
                                            int i21 = ((AbstractC1686530tzP) obj10).LL;
                                            if (i19 < i21) {
                                                obj6 = obj10;
                                                i19 = i21;
                                            }
                                            if (i20 == size4) {
                                                break;
                                            }
                                            i20++;
                                        }
                                    }
                                }
                                AbstractC1686530tzP abstractC1686530tzP = (AbstractC1686530tzP) obj6;
                                if (abstractC1686530tzP != null) {
                                    i11 = abstractC1686530tzP.LL;
                                } else {
                                    i11 = 0;
                                }
                                arrayList = new ArrayList(listLJJLIL.size());
                                int size5 = listLJJLIL.size();
                                for (int i22 = 0; i22 < size5; i22++) {
                                    InterfaceC1673370teB interfaceC1673370teB2 = (InterfaceC1673370teB) ListProtector.get(listLJJLIL, i22);
                                    long j2 = c1682380tsi.LIZ;
                                    int iLJIIIIZZ2 = (C1682380tsi.LJIIIIZZ(j2) - i11) - i15;
                                    if (iLJIIIIZZ2 < iLJLLJ2) {
                                        iLJIIIIZZ2 = iLJLLJ2;
                                    }
                                    arrayList.add(interfaceC1673370teB2.LJJJJZ(C1682380tsi.LIZ(iLJLLJ2, iLJIIIIZZ2, C1682380tsi.LJIIIZ(j2), C1682380tsi.LJII(j2))));
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = ListProtector.get(arrayList3, 0);
                                int i23 = ((AbstractC1686530tzP) obj7).LLILLJJLI;
                                int size6 = arrayList3.size() - 1;
                                if (1 <= size6) {
                                    int i24 = 1;
                                    while (true) {
                                        Object obj11 = ListProtector.get(arrayList3, i24);
                                        int i25 = ((AbstractC1686530tzP) obj11).LLILLJJLI;
                                        if (i23 < i25) {
                                            obj7 = obj11;
                                            i23 = i25;
                                        }
                                        if (i24 == size6) {
                                            break;
                                        }
                                        i24++;
                                    }
                                }
                            }
                            AbstractC1686530tzP abstractC1686530tzP2 = (AbstractC1686530tzP) obj7;
                            if (abstractC1686530tzP2 != null) {
                                i12 = abstractC1686530tzP2.LLILLJJLI;
                            } else {
                                i12 = 0;
                            }
                            if (arrayList.isEmpty()) {
                                obj8 = null;
                            } else {
                                obj8 = ListProtector.get(arrayList, 0);
                                int i26 = ((AbstractC1686530tzP) obj8).LLILLJJLI;
                                int size7 = arrayList.size() - 1;
                                if (1 <= size7) {
                                    int i27 = 1;
                                    while (true) {
                                        Object obj12 = ListProtector.get(arrayList, i27);
                                        int i28 = ((AbstractC1686530tzP) obj12).LLILLJJLI;
                                        if (i26 < i28) {
                                            obj8 = obj12;
                                            i26 = i28;
                                        }
                                        if (i27 == size7) {
                                            break;
                                        }
                                        i27++;
                                    }
                                }
                            }
                            AbstractC1686530tzP abstractC1686530tzP3 = (AbstractC1686530tzP) obj8;
                            if (abstractC1686530tzP3 != null) {
                                i13 = abstractC1686530tzP3.LLILLJJLI;
                            } else {
                                i13 = 0;
                            }
                            if (arrayList.isEmpty()) {
                                obj9 = null;
                            } else {
                                obj9 = ListProtector.get(arrayList, 0);
                                int i29 = ((AbstractC1686530tzP) obj9).LL;
                                int size8 = arrayList.size() - 1;
                                if (1 <= size8) {
                                    int i30 = 1;
                                    while (true) {
                                        Object obj13 = ListProtector.get(arrayList, i30);
                                        int i31 = ((AbstractC1686530tzP) obj13).LL;
                                        if (i29 < i31) {
                                            obj9 = obj13;
                                            i29 = i31;
                                        }
                                        if (i30 == size8) {
                                            break;
                                        }
                                        i30++;
                                    }
                                }
                            }
                            AbstractC1686530tzP abstractC1686530tzP4 = (AbstractC1686530tzP) obj9;
                            if (abstractC1686530tzP4 != null) {
                                i14 = abstractC1686530tzP4.LL;
                            } else {
                                i14 = 0;
                            }
                            int iLJIIIIZZ3 = C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ);
                            if (i12 < i13) {
                                i12 = i13;
                            }
                            return interfaceC1672350tcX.LJLJJL(iLJIIIIZZ3, i12, C2097608Jq.LJ(), new AObjectS2S0501000_25(arrayList3, arrayList, c1682380tsi, i14, interfaceC1672350tcX, c817403Hg, 1));
                        }
                        ArrayList arrayList4 = new ArrayList(listLJJLIL.size());
                        int size9 = listLJJLIL.size();
                        for (int i32 = 0; i32 < size9; i32++) {
                            InterfaceC1673370teB interfaceC1673370teB3 = (InterfaceC1673370teB) ListProtector.get(listLJJLIL, i32);
                            long j3 = c1682380tsi.LIZ;
                            arrayList4.add(interfaceC1673370teB3.LJJJJZ(C1682380tsi.LIZ(0, C1682380tsi.LJIIIIZZ(j3), 0, C1682380tsi.LJII(j3))));
                        }
                        if (arrayList4.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = ListProtector.get(arrayList4, 0);
                            int i33 = ((AbstractC1686530tzP) obj3).LL;
                            int size10 = arrayList4.size() - 1;
                            if (1 <= size10) {
                                int i34 = 1;
                                while (true) {
                                    Object obj14 = ListProtector.get(arrayList4, i34);
                                    int i35 = ((AbstractC1686530tzP) obj14).LL;
                                    if (i33 < i35) {
                                        obj3 = obj14;
                                        i33 = i35;
                                    }
                                    if (i34 == size10) {
                                        break;
                                    }
                                    i34++;
                                }
                            }
                        }
                        AbstractC1686530tzP abstractC1686530tzP5 = (AbstractC1686530tzP) obj3;
                        if (abstractC1686530tzP5 != null) {
                            i8 = abstractC1686530tzP5.LL;
                        } else {
                            i8 = 0;
                        }
                        List<InterfaceC1673370teB> listLJJLIL3 = interfaceC1672350tcX.LJJLIL(EnumC1673350te9.LL, new C19719212De(-69189524, new AObjectS360S0200000_25(interfaceC1631620sYq2, c05p02, 3), true));
                        ArrayList arrayList5 = new ArrayList(listLJJLIL3.size());
                        int size11 = listLJJLIL3.size();
                        for (int i36 = 0; i36 < size11; i36++) {
                            InterfaceC1673370teB interfaceC1673370teB4 = (InterfaceC1673370teB) ListProtector.get(listLJJLIL3, i36);
                            int iLJIIIIZZ4 = (C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ) - i15) - i8;
                            if (iLJIIIIZZ4 < 0) {
                                iLJIIIIZZ4 = 0;
                            }
                            arrayList5.add(interfaceC1673370teB4.LJJJJZ(C1682380tsi.LIZ(0, iLJIIIIZZ4, 0, C1682380tsi.LJII(c1682380tsi.LIZ))));
                        }
                        if (arrayList5.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = ListProtector.get(arrayList5, 0);
                            int i37 = ((AbstractC1686530tzP) obj4).LLILLJJLI;
                            int size12 = arrayList5.size() - 1;
                            if (1 <= size12) {
                                int i38 = 1;
                                while (true) {
                                    Object obj15 = ListProtector.get(arrayList5, i38);
                                    int i39 = ((AbstractC1686530tzP) obj15).LLILLJJLI;
                                    if (i37 < i39) {
                                        obj4 = obj15;
                                        i37 = i39;
                                    }
                                    if (i38 == size12) {
                                        break;
                                    }
                                    i38++;
                                }
                            }
                        }
                        AbstractC1686530tzP abstractC1686530tzP6 = (AbstractC1686530tzP) obj4;
                        if (abstractC1686530tzP6 != null) {
                            i9 = abstractC1686530tzP6.LLILLJJLI;
                        } else {
                            i9 = 0;
                        }
                        if (arrayList4.isEmpty()) {
                            i10 = 0;
                            obj5 = null;
                        } else {
                            i10 = 0;
                            obj5 = ListProtector.get(arrayList4, 0);
                            int i40 = ((AbstractC1686530tzP) obj5).LLILLJJLI;
                            int size13 = arrayList4.size() - 1;
                            int i41 = 1;
                            if (1 <= size13) {
                                while (true) {
                                    Object obj16 = ListProtector.get(arrayList4, i41);
                                    int i42 = ((AbstractC1686530tzP) obj16).LLILLJJLI;
                                    if (i40 < i42) {
                                        obj5 = obj16;
                                        i40 = i42;
                                    }
                                    if (i41 == size13) {
                                        break;
                                    }
                                    i41++;
                                }
                            }
                        }
                        AbstractC1686530tzP abstractC1686530tzP7 = (AbstractC1686530tzP) obj5;
                        if (abstractC1686530tzP7 != null) {
                            i10 = abstractC1686530tzP7.LLILLJJLI;
                        }
                        int iLJIIIIZZ5 = C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ);
                        if (i9 < i10) {
                            i9 = i10;
                        }
                        return interfaceC1672350tcX.LJLJJL(iLJIIIIZZ5, i9, C2097608Jq.LJ(), new AObjectS2S0501000_25(arrayList5, arrayList4, c1682380tsi, i8, interfaceC1672350tcX, c817403Hg, 0));
                    }
                };
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1683060tto.LIZ(interfaceC1685750ty92, (Function2) objLJJ2, c13zcLJIIJ, (i3 >> 3) & 14, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AObjectS2S0302000_25(interfaceC1631620sYq, interfaceC1685750ty92, function2, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIL(final kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r14, X.InterfaceC1685750ty9 r15, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r16, X.InterfaceC1680500tpg r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1673210tdv.LJIIL(kotlin.jvm.functions.Function2, X.0ty9, kotlin.jvm.functions.Function2, X.0tpg, int, int):void");
    }

    public static final void LJ(final String str, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, boolean z2, InterfaceC1680500tpg interfaceC1680500tpg, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        int i8;
        boolean z5;
        boolean z6;
        float fLIZLLL;
        long jQ3;
        long jQ32;
        boolean z7;
        boolean z8 = z2;
        boolean z9 = z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1877179316);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z9)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z8)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i10 != 0) {
                z9 = true;
            }
            if (i11 != 0) {
                z8 = false;
            }
            C1673180tds c1673180tds = (C1673180tds) c13zcLJIIJ.LJJIL(LIZJ);
            if (c1673180tds != null) {
                c1673180tds.LIZ(null);
                c1673180tds.LIZJ(null);
                c1673180tds.LIZIZ(str);
            }
            InterfaceC1673170tdr interfaceC1673170tdr = (InterfaceC1673170tdr) c13zcLJIIJ.LJJIL(C1689320u3u.LIZ);
            boolean zBooleanValue = ((Boolean) c13zcLJIIJ.LJJIL(LIZ)).booleanValue();
            float fLIZJ = interfaceC1673170tdr.LIZJ(c13zcLJIIJ);
            if (str.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = interfaceC1685750ty92.LIZ(new C1673320te6(fLIZJ, interfaceC1673170tdr.LJIIIIZZ(c13zcLJIIJ), z3));
            InterfaceC1668050tVb.LIZ.getClass();
            C1296880jqw c1296880jqw = C1668040tVa.LJIIJJI;
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(C1679930tol.LJI, c1296880jqw, c13zcLJIIJ, 54);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1687980u1k c1687980u1k = C1687980u1k.LIZ;
                if (z3) {
                    c13zcLJIIJ.LJJIIJZLJL(679725578);
                    C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZ2 = c1687980u1k.LIZ(c.LJ(c1685760tyA, 1.0f), 1.0f, true);
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJI, false);
                    int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ2);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                        if (zBooleanValue) {
                            c13zcLJIIJ.LJJIIJZLJL(739986742);
                            jQ32 = C1670400tZO.LIZIZ(c13zcLJIIJ).N3();
                        } else {
                            c13zcLJIIJ.LJJIIJZLJL(739987680);
                            jQ32 = C1670400tZO.LIZIZ(c13zcLJIIJ).Q3();
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        C1693430uAX c1693430uAXLJFF = interfaceC1673170tdr.LJFF(c13zcLJIIJ);
                        if (z8) {
                            c13zcLJIIJ.LJJIIJZLJL(1464901975);
                            C1688120u1y c1688120u1yLIZ2 = C1665750tRt.LIZ(C1679930tol.LIZ, c1296880jqw, c13zcLJIIJ, 48);
                            int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                            C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
                            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                                c13zcLJIIJ.LJJIII();
                                if (c13zcLJIIJ.LJJJI) {
                                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                                } else {
                                    c13zcLJIIJ.LJIILJJIL();
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ2, aFwS311S0000000_25);
                                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                                }
                                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                                z4 = true;
                                C1673470teL.LIZ(C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, 8, 0.0f, 11), null, 0L, 0L, c13zcLJIIJ, 6, 14);
                                z7 = false;
                                LJFF(str, jQ32, c1693430uAXLJFF, c13zcLJIIJ, i3 & 14);
                                c13zcLJIIJ.LJJJJL(true);
                                c13zcLJIIJ.LJJJJL(false);
                            } else {
                                C0MXE.LIZIZ();
                                throw null;
                            }
                        } else {
                            z4 = true;
                            z7 = false;
                            c13zcLJIIJ.LJJIIJZLJL(1465214424);
                            LJFF(str, jQ32, c1693430uAXLJFF, c13zcLJIIJ, i3 & 14);
                            c13zcLJIIJ.LJJJJL(false);
                        }
                        c13zcLJIIJ.LJJJJL(z4);
                        c13zcLJIIJ.LJJJJL(z7);
                        i8 = 16;
                        z5 = false;
                        z6 = true;
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    z4 = false;
                    c13zcLJIIJ.LJJIIJZLJL(680510839);
                    if (z8) {
                        i8 = 16;
                        z5 = false;
                        z6 = true;
                        C1673470teL.LIZ(null, null, 0L, 0L, c13zcLJIIJ, 0, 15);
                    } else {
                        i8 = 16;
                        z5 = false;
                        z6 = true;
                    }
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJIIJZLJL(576144905);
                if (z9) {
                    c13zcLJIIJ.LJJIIJZLJL(576146274);
                    if (z4) {
                        fLIZLLL = i8;
                    } else {
                        fLIZLLL = C1682440tso.LIZLLL(C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ.LIZIZ.LIZJ);
                    }
                    c13zcLJIIJ.LJJJJL(z5);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(InterfaceC1685750ty9.LIZ, fLIZLLL);
                    C1668880tWw c1668880tWw = C1670400tZO.LIZLLL(c13zcLJIIJ).LJIIJJI;
                    if (zBooleanValue) {
                        c13zcLJIIJ.LJJIIJZLJL(576156156);
                        jQ3 = interfaceC1673170tdr.LJIILIIL(c13zcLJIIJ);
                    } else {
                        c13zcLJIIJ.LJJIIJZLJL(576157249);
                        jQ3 = C1670400tZO.LIZIZ(c13zcLJIIJ).Q3();
                    }
                    c13zcLJIIJ.LJJJJL(z5);
                    float f = i8;
                    C1668930tX1.LIZIZ(c1668880tWw, null, interfaceC1685750ty9LJIILIIL, jQ3, f, f, z5, c13zcLJIIJ, 221232, 64);
                }
                c13zcLJIIJ.LJJJJL(z5);
                c13zcLJIIJ.LJJJJL(z6);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            final boolean z10 = z9;
            final boolean z11 = z8;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0iU3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    boolean z12 = z10;
                    boolean z13 = z11;
                    int i12 = i;
                    int i13 = i2;
                    ((Integer) obj2).intValue();
                    C1673210tdv.LJ(str2, interfaceC1685750ty94, z12, z13, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i12 | 1), i13);
                    return Unit.LIZ;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(final java.lang.String r26, X.InterfaceC1685750ty9 r27, X.InterfaceC1673450teJ r28, X.InterfaceC1673420teG r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, X.InterfaceC1680500tpg r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1673210tdv.LIZLLL(java.lang.String, X.0ty9, X.0teJ, X.0teG, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }

    public static final void LJIIJ(final C1692220u8a c1692220u8a, final C1692220u8a c1692220u8a2, final boolean z, final int i, final boolean z2, final EnumC1673250tdz enumC1673250tdz, Function1<? super C1692150u8T, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f;
        long jQ3;
        boolean z3;
        Function1<? super C1692150u8T, Unit> function12 = function1;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2099806204);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1692220u8a)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1692220u8a2)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i4 |= i9;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC1673250tdz.ordinal())) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i4 |= i10;
        }
        int i12 = i3 & 64;
        if (i12 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i2) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        if ((599187 & i4) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i12 != 0) {
                c13zcLJIIJ.LJJIIJZLJL(1849434622);
                Object objLJJ = c13zcLJIIJ.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = new AObjectS124S0000000_25(6);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ);
                }
                function12 = (Function1) objLJJ;
                c13zcLJIIJ.LJJJJL(false);
            }
            float fLIZJ = ((InterfaceC1673170tdr) c13zcLJIIJ.LJJIL(C1689320u3u.LIZ)).LIZJ(c13zcLJIIJ);
            if (c1692220u8a2.length() > 0) {
                f = 0;
            } else {
                f = fLIZJ;
            }
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c1685760tyA, 0.0f, fLIZJ, 0.0f, f, 5);
            C1679920tok c1679920tok = C1679930tol.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, C1668040tVa.LJIIJ, c13zcLJIIJ, 0);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, c1688120u1yLIZ, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                if (z2) {
                    c13zcLJIIJ.LJJIIJZLJL(713849755);
                    int i13 = C1673240tdy.LIZ[enumC1673250tdz.ordinal()];
                    if (i13 != 1) {
                        if (i13 == 2) {
                            c13zcLJIIJ.LJJIIJZLJL(-392609339);
                            jQ3 = C1670400tZO.LIZIZ(c13zcLJIIJ).K2();
                            z3 = false;
                            c13zcLJIIJ.LJJJJL(false);
                        } else {
                            c13zcLJIIJ.LJJIIJZLJL(-392614161);
                            c13zcLJIIJ.LJJJJL(false);
                            throw new C1954807lC();
                        }
                    } else {
                        z3 = false;
                        c13zcLJIIJ.LJJIIJZLJL(-392611713);
                        jQ3 = C1670400tZO.LIZIZ(c13zcLJIIJ).K3();
                        c13zcLJIIJ.LJJJJL(false);
                    }
                    c13zcLJIIJ.LJJJJL(z3);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(-392607447);
                    jQ3 = C1670400tZO.LIZIZ(c13zcLJIIJ).Q3();
                    c13zcLJIIJ.LJJJJL(false);
                }
                if (z) {
                    c13zcLJIIJ.LJJIIJZLJL(714142333);
                    C1692230u8b c1692230u8b = new C1692230u8b();
                    c1692230u8b.LJ(c1692220u8a);
                    C1672650td1.LIZ(c1692230u8b, "badgeId", "�");
                    C1692220u8a c1692220u8aLJIIL = c1692230u8b.LJIIL();
                    Map mapLIZJ = C2097908Jt.LIZJ(new Pair("badgeId", new C1672660td2(new C1680210tpD(C1682430tsn.LJ(7), C1682430tsn.LJ(6), 5), C1673310te5.LIZ)));
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ2 = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ2 == C1680510tph.LIZIZ) {
                        objLJJ2 = new AObjectS124S0000000_25(8);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1685190txF.LIZIZ(c1692220u8aLJIIL, C1689740u4a.LIZ(c1685760tyA, (Function1) objLJJ2), jQ3, C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ, 0L, 0, 0, false, i, mapLIZJ, function12, c13zcLJIIJ, (i4 << 15) & 234881024, (i4 >> 18) & 14, 240);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(714939529);
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ3 = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ3 == C1680510tph.LIZIZ) {
                        objLJJ3 = new AObjectS124S0000000_25(11);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1685190txF.LIZIZ(c1692220u8a, C1689740u4a.LIZ(c1685760tyA, (Function1) objLJJ3), jQ3, C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ, 0L, 0, 0, false, i, null, function12, c13zcLJIIJ, ((i4 << 15) & 234881024) | (i4 & 14), (i4 >> 18) & 14, 752);
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final Function1<? super C1692150u8T, Unit> function13 = function12;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0te0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C1692220u8a c1692220u8a3 = c1692220u8a;
                    C1692220u8a c1692220u8a4 = c1692220u8a2;
                    boolean z4 = z;
                    int i14 = i;
                    boolean z5 = z2;
                    EnumC1673250tdz enumC1673250tdz2 = enumC1673250tdz;
                    Function1 function14 = function13;
                    int i15 = i2;
                    int i16 = i3;
                    ((Integer) obj2).intValue();
                    C1673210tdv.LJIIJ(c1692220u8a3, c1692220u8a4, z4, i14, z5, enumC1673250tdz2, function14, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i15 | 1), i16);
                    return Unit.LIZ;
                }
            };
        }
    }

    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, String str, int i, String str2, boolean z, boolean z2, C1673190tdt c1673190tdt, boolean z3, AbstractC1676270tir abstractC1676270tir, boolean z4, EnumC1673250tdz enumC1673250tdz, boolean z5, boolean z6, String str3, String str4, String str5, String str6, C20279814Wu c20279814Wu, Function0<Unit> function0, Function0<Boolean> function02, Function0<Unit> function03, Function1<? super Boolean, Unit> function1, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, boolean z7, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, InterfaceC1680500tpg interfaceC1680500tpg, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iOrdinal;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z8;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function23;
        Function0<Unit> function04 = function03;
        Function0<Boolean> function05 = function02;
        Function0<Unit> function06 = function0;
        C20279814Wu c20279814Wu2 = c20279814Wu;
        String str7 = str6;
        String str8 = str5;
        String str9 = str4;
        String str10 = str3;
        boolean z9 = z6;
        boolean z10 = z5;
        AbstractC1676270tir abstractC1676270tir2 = abstractC1676270tir;
        boolean z11 = z3;
        C1673190tdt c1673190tdt2 = c1673190tdt;
        boolean z12 = z2;
        boolean z13 = z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        String str11 = str2;
        EnumC1673250tdz enumC1673250tdz2 = enumC1673250tdz;
        Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function24 = function2;
        int i32 = i;
        boolean z14 = z4;
        Function1<? super Boolean, Unit> function12 = function1;
        String str12 = str;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-224519181);
        int i33 = i5 & 1;
        if (i33 != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i2;
        } else {
            i6 = i2;
        }
        int i34 = i5 & 2;
        if (i34 != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str12)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        int i35 = i5 & 4;
        if (i35 != 0) {
            i6 |= 384;
        } else if ((i2 & 384) == 0) {
            if (c13zcLJIIJ.LJIJI(i32)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
        }
        int i36 = i5 & 8;
        int i37 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        if (i36 != 0) {
            i6 |= 3072;
        } else if ((i2 & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str11)) {
                i10 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i10 = 1024;
            }
            i6 |= i10;
        }
        int i38 = i5 & 16;
        int i39 = 16384;
        if (i38 != 0) {
            i6 |= 24576;
        } else if ((i2 & 24576) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z13)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i6 |= i11;
        }
        int i40 = i5 & 32;
        if (i40 != 0) {
            i6 |= 196608;
        } else if ((i2 & 196608) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z12)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i6 |= i12;
        }
        int i41 = i5 & 64;
        if (i41 != 0) {
            i6 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1673190tdt2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i6 |= i13;
        }
        int i42 = i5 & 128;
        if (i42 != 0) {
            i6 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z11)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i6 |= i14;
        }
        int i43 = i5 & 256;
        if (i43 != 0) {
            i6 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (c13zcLJIIJ.LJII(abstractC1676270tir2)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i6 |= i15;
        }
        int i44 = i5 & 512;
        if (i44 != 0) {
            i6 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z14)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i6 |= i16;
        }
        int i45 = i5 & 1024;
        if (i45 != 0) {
            i17 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (enumC1673250tdz2 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC1673250tdz2.ordinal();
            }
            if (c13zcLJIIJ.LJIJI(iOrdinal)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i17 = i3 | i18;
        } else {
            i17 = i3;
        }
        int i46 = i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        if (i46 != 0) {
            i17 |= 48;
        } else if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z10)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i17 |= i19;
        }
        int i47 = i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        if (i47 != 0) {
            i17 |= 384;
        } else if ((i3 & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z9)) {
                i20 = 256;
            } else {
                i20 = 128;
            }
            i17 |= i20;
        }
        int i48 = i5 & 8192;
        if (i48 != 0) {
            i17 |= 3072;
        } else {
            i48 = 0;
            if ((i3 & 3072) == 0) {
                if (c13zcLJIIJ.LJJIIJ(str10)) {
                    i21 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                } else {
                    i21 = 1024;
                }
                i17 |= i21;
            }
        }
        int i49 = i5 & 16384;
        if (i49 != 0) {
            i17 |= 24576;
        } else {
            i49 = 0;
            if ((i3 & 24576) == 0) {
                if (c13zcLJIIJ.LJJIIJ(str9)) {
                    i22 = 16384;
                } else {
                    i22 = 8192;
                }
                i17 |= i22;
            }
        }
        int i50 = i5 & 32768;
        if (i50 != 0) {
            i17 |= 196608;
        } else if ((i3 & 196608) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str8)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i17 |= i23;
        }
        int i51 = i5 & 65536;
        if (i51 != 0) {
            i17 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str7)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i17 |= i24;
        }
        int i52 = i5 & 131072;
        if (i52 != 0) {
            i17 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c20279814Wu2)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i17 |= i25;
        }
        int i53 = i5 & 262144;
        if (i53 != 0) {
            i17 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            if (c13zcLJIIJ.LJII(function06)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i17 |= i26;
        }
        int i54 = i5 & 524288;
        if (i54 != 0) {
            i17 |= 805306368;
        } else if ((i3 & 805306368) == 0) {
            if (c13zcLJIIJ.LJII(function05)) {
                i27 = 536870912;
            } else {
                i27 = 268435456;
            }
            i17 |= i27;
        }
        int i55 = i5 & 1048576;
        if (i55 != 0) {
            i28 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c13zcLJIIJ.LJII(function04)) {
                i29 = 4;
            } else {
                i29 = 2;
            }
            i28 = i4 | i29;
        } else {
            i28 = i4;
        }
        int i56 = i5 & 2097152;
        if (i56 != 0) {
            i28 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i30 = 32;
            } else {
                i30 = 16;
            }
            i28 |= i30;
        }
        int i57 = i5 & 4194304;
        if (i57 != 0) {
            i28 |= 384;
        } else if ((i4 & 384) == 0) {
            if (c13zcLJIIJ.LJII(function24)) {
                i31 = 256;
            } else {
                i31 = 128;
            }
            i28 |= i31;
        }
        int i58 = i5 & 8388608;
        if (i58 != 0) {
            i28 |= 3072;
        } else if ((i4 & 3072) == 0) {
            if (!c13zcLJIIJ.LJIIZILJ(z7)) {
                i37 = 1024;
            }
            i28 |= i37;
        }
        int i59 = i5 & 16777216;
        if (i59 != 0) {
            i28 |= 24576;
        } else if ((i4 & 24576) == 0) {
            if (!c13zcLJIIJ.LJII(function22)) {
                i39 = 8192;
            }
            i28 |= i39;
        }
        if ((i6 & 306783379) == 306783378 && (306783379 & i17) == 306783378 && (i28 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            function23 = function22;
            z8 = z7;
        } else {
            if (i33 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i34 != 0) {
                str12 = "";
            }
            if (i35 != 0) {
                i32 = Integer.MAX_VALUE;
            }
            if (i36 != 0) {
                str11 = "";
            }
            z8 = false;
            if (i38 != 0) {
                z13 = false;
            }
            if (i40 != 0) {
                z12 = false;
            }
            if (i41 != 0) {
                c1673190tdt2 = C1673190tdt.LIZIZ;
            }
            if (i42 != 0) {
                z11 = false;
            }
            function23 = null;
            if (i43 != 0) {
                abstractC1676270tir2 = null;
            }
            if (i44 != 0) {
                z14 = true;
            }
            if (i45 != 0) {
                enumC1673250tdz2 = EnumC1673250tdz.Normal;
            }
            if (i46 != 0) {
                z10 = true;
            }
            if (i47 != 0) {
                z9 = true;
            }
            if (i48 != 0) {
                str10 = null;
            }
            if (i49 != 0) {
                str9 = null;
            }
            if (i50 != 0) {
                str8 = null;
            }
            if (i51 != 0) {
                str7 = null;
            }
            if (i52 != 0) {
                c20279814Wu2 = null;
            }
            if (i53 != 0) {
                function06 = null;
            }
            if (i54 != 0) {
                function05 = null;
            }
            if (i55 != 0) {
                function04 = null;
            }
            if (i56 != 0) {
                function12 = null;
            }
            if (i57 != 0) {
                function24 = null;
            }
            if (i58 == 0) {
                z8 = z7;
            }
            if (i59 == 0) {
                function23 = function22;
            }
            interfaceC1685750ty92 = interfaceC1685750ty92;
            abstractC1676270tir2 = abstractC1676270tir2;
            str10 = str10;
            str9 = str9;
            str8 = str8;
            str7 = str7;
            c20279814Wu2 = c20279814Wu2;
            function06 = function06;
            function05 = function05;
            function04 = function04;
            function12 = function12;
            function24 = function24;
            LIZIZ(interfaceC1685750ty92, new C1692220u8a(str12), i32, new C1692220u8a(str11), z13, z12, c1673190tdt2, z11, abstractC1676270tir2, z14, enumC1673250tdz2, z10, z9, str10, str9, str8, str7, c20279814Wu2, function06, function05, function04, function12, function24, z8, function23, c13zcLJIIJ, (i6 & 14) | (i6 & 896) | (i6 & 57344) | (458752 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6) | (i6 & 1879048192), (i17 & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (1879048192 & i17), (i28 & 14) | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (i28 & 57344), 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            final InterfaceC1685750ty9 interfaceC1685750ty93 = interfaceC1685750ty92;
            final String str13 = str12;
            final int i60 = i32;
            final String str14 = str11;
            final boolean z15 = z13;
            final boolean z16 = z12;
            final C1673190tdt c1673190tdt3 = c1673190tdt2;
            final boolean z17 = z11;
            final AbstractC1676270tir abstractC1676270tir3 = abstractC1676270tir2;
            final boolean z18 = z14;
            final EnumC1673250tdz enumC1673250tdz3 = enumC1673250tdz2;
            final boolean z19 = z10;
            final boolean z20 = z9;
            final String str15 = str10;
            final String str16 = str9;
            final String str17 = str8;
            final String str18 = str7;
            final C20279814Wu c20279814Wu3 = c20279814Wu2;
            final Function0<Unit> function07 = function06;
            final Function0<Boolean> function08 = function05;
            final Function0<Unit> function09 = function04;
            final Function1<? super Boolean, Unit> function13 = function12;
            final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function25 = function24;
            final boolean z21 = z8;
            final Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function26 = function23;
            c20030013YsLJJJJZI.LIZLLL = new Function2() { // from class: X.0iSM
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1685750ty9 interfaceC1685750ty94 = interfaceC1685750ty93;
                    String str19 = str13;
                    int i61 = i60;
                    String str20 = str14;
                    boolean z22 = z15;
                    boolean z23 = z16;
                    C1673190tdt c1673190tdt4 = c1673190tdt3;
                    boolean z24 = z17;
                    AbstractC1676270tir abstractC1676270tir4 = abstractC1676270tir3;
                    boolean z25 = z18;
                    EnumC1673250tdz enumC1673250tdz4 = enumC1673250tdz3;
                    boolean z26 = z19;
                    boolean z27 = z20;
                    String str21 = str15;
                    String str22 = str16;
                    String str23 = str17;
                    String str24 = str18;
                    C20279814Wu c20279814Wu4 = c20279814Wu3;
                    Function0 function010 = function07;
                    Function0 function011 = function08;
                    Function0 function012 = function09;
                    Function1 function14 = function13;
                    Function2 function27 = function25;
                    boolean z28 = z21;
                    Function2 function28 = function26;
                    int i62 = i2;
                    int i63 = i3;
                    int i64 = i4;
                    int i65 = i5;
                    ((Integer) obj2).intValue();
                    C1673210tdv.LIZ(interfaceC1685750ty94, str19, i61, str20, z22, z23, c1673190tdt4, z24, abstractC1676270tir4, z25, enumC1673250tdz4, z26, z27, str21, str22, str23, str24, c20279814Wu4, function010, function011, function012, function14, function27, z28, function28, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i62 | 1), C341440Da2.LIZ(i63), C341440Da2.LIZ(i64), i65);
                    return Unit.LIZ;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.InterfaceC1685750ty9 r86, X.C1692220u8a r87, int r88, X.C1692220u8a r89, boolean r90, boolean r91, X.C1673190tdt r92, boolean r93, X.AbstractC1676270tir r94, boolean r95, X.EnumC1673250tdz r96, boolean r97, boolean r98, java.lang.String r99, java.lang.String r100, java.lang.String r101, java.lang.String r102, X.C20279814Wu r103, kotlin.jvm.functions.Function0<kotlin.Unit> r104, kotlin.jvm.functions.Function0<java.lang.Boolean> r105, kotlin.jvm.functions.Function0<kotlin.Unit> r106, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r107, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r108, boolean r109, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r110, X.InterfaceC1680500tpg r111, final int r112, final int r113, final int r114, final int r115) {
        /*
            Method dump skipped, instruction units count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1673210tdv.LIZIZ(X.0ty9, X.0u8a, int, X.0u8a, boolean, boolean, X.0tdt, boolean, X.0tir, boolean, X.0tdz, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.14Wu, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function2, X.0tpg, int, int, int, int):void");
    }
}
