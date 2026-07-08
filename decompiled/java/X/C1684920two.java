package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS2S0601000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS58S0500000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS69S0001000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0two, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684920two {
    public static final long LIZ = C1685850tyJ.LIZIZ(520093695);
    public static final long LIZIZ = C1685850tyJ.LIZLLL(2164260863L);
    public static final long LIZJ = C1685850tyJ.LIZLLL(3238002687L);
    public static final long LIZLLL = C1685850tyJ.LIZLLL(3875536895L);
    public static final /* synthetic */ int LJ = 0;

    public static final int LJIIIZ(C1690050u55 c1690050u55) {
        Object next;
        List<InterfaceC1685080tx4> listLJII = c1690050u55.LJIIIZ().LJII();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1685080tx4 interfaceC1685080tx4 : listLJII) {
            if (C1676820tjk.LIZJ(interfaceC1685080tx4.LJIIL()) >= 0) {
                arrayList.add(interfaceC1685080tx4);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int index = ((InterfaceC1685080tx4) next).getIndex();
                do {
                    Object next2 = it2.next();
                    int index2 = ((InterfaceC1685080tx4) next2).getIndex();
                    if (index > index2) {
                        next = next2;
                        index = index2;
                    }
                } while (it2.hasNext());
            }
        }
        InterfaceC1685080tx4 interfaceC1685080tx42 = (InterfaceC1685080tx4) next;
        if (interfaceC1685080tx42 == null) {
            return 0;
        }
        return interfaceC1685080tx42.getIndex();
    }

    public static final void LJII(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(152819301);
        if (i == 0 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(InterfaceC1685750ty9.LIZ);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LJFF, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZLLL);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, g.a.LIZLLL);
                C1668690tWd.LIZIZ(0.0f, 0, 7, c13zcLJIIJ, null, false);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS69S0001000_25(i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(kotlin.jvm.functions.Function1<? super X.AbstractC1146640fwc, kotlin.Unit> r46, X.InterfaceC1680500tpg r47, int r48) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684920two.LIZ(kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    public static final void LIZIZ(C1690050u55 c1690050u55, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(104298169);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1690050u55)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1EOY.LIZ.LIZIZ("anchor_panel_gift_slide_compose");
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C1300480jwk c1300480jwk = (C1300480jwk) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            if (c1300480jwk != null) {
                Unit unit = Unit.LIZ;
                c13zcLJIIJ.LJJIIJZLJL(-1633490746);
                if ((i2 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                boolean zLJII = z | c13zcLJIIJ.LJII(c1300480jwk);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (zLJII || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new C1685010twx(c1690050u55, c1300480jwk, null);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1680540tpk.LJFF(unit, (Function2) objLJJ2, c13zcLJIIJ);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(c1690050u55, i, 8);
        }
    }

    public static final void LJIIJ(C1146430fwH c1146430fwH, C1690050u55 c1690050u55, C1684970twt c1684970twt, String str) {
        int iLJI;
        C1146350fw9 c1146350fw9LIZIZ = C1146440fwI.LIZIZ(c1146430fwH);
        if (c1146350fw9LIZIZ != null) {
            C1133630fbd c1133630fbd = c1684970twt.LJ.LIZ;
            String str2 = c1684970twt.LIZ;
            int iLJI2 = c1690050u55.LJI();
            InterfaceC1685080tx4 interfaceC1685080tx4 = (InterfaceC1685080tx4) C13LP.LJJLIIIJL(c1690050u55.LJIIIZ().LJII());
            if (interfaceC1685080tx4 != null) {
                iLJI = interfaceC1685080tx4.getIndex();
            } else {
                iLJI = c1690050u55.LJI();
            }
            List listLJLIL = C13LP.LJLIL(c1146430fwH.LIZIZ, C1697810uHb.LJIIL(c1146430fwH.LIZ));
            Long lValueOf = Long.valueOf(c1146350fw9LIZIZ.LL);
            c1133630fbd.getClass();
            C1133630fbd.LIZ(iLJI2, iLJI, lValueOf, str2, str, listLJLIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(X.C1690050u55 r9, X.InterfaceC1665500tRU<? extends X.InterfaceC1146480fwM> r10, X.C1684970twt r11, X.InterfaceC1680500tpg r12, int r13) {
        /*
            r0 = 873879562(0x3416580a, float:1.4001867E-7)
            r1 = r12
            X.13ZC r6 = r1.LJIIJ(r0)
            r12 = r13
            r0 = r12 & 6
            r2 = 4
            r9 = r9
            if (r0 != 0) goto L9e
            boolean r0 = r6.LJJIIJ(r9)
            if (r0 == 0) goto L9b
            r8 = 4
        L16:
            r8 = r8 | r12
        L17:
            r0 = r12 & 48
            r10 = r10
            if (r0 != 0) goto L25
            boolean r0 = r6.LJJIIJ(r10)
            if (r0 == 0) goto L98
            r0 = 32
        L24:
            r8 = r8 | r0
        L25:
            r0 = r12 & 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r11 = r11
            if (r0 != 0) goto L35
            boolean r0 = r6.LJJIIJ(r11)
            if (r0 == 0) goto L95
            r0 = 256(0x100, float:3.59E-43)
        L34:
            r8 = r8 | r0
        L35:
            r1 = r8 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L54
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L54
            r6.LIZJ()
        L44:
            X.13Ys r0 = r6.LJJJJZI()
            if (r0 == 0) goto L53
            kotlin.jvm.internal.AwS62S0301000_25 r8 = new kotlin.jvm.internal.AwS62S0301000_25
            r13 = 11
            r8.<init>(r9, r10, r11, r12, r13)
            r0.LIZLLL = r8
        L53:
            return
        L54:
            X.05P0 r5 = X.C20028913Yh.LJIIIIZZ(r10, r6)
            kotlin.Unit r4 = kotlin.Unit.LIZ
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r6.LJJIIJZLJL(r0)
            r0 = r8 & 14
            r3 = 0
            r1 = 1
            if (r0 != r2) goto L93
            r2 = 1
        L67:
            r0 = r8 & 896(0x380, float:1.256E-42)
            if (r0 == r7) goto L6c
            r1 = 0
        L6c:
            r2 = r2 | r1
            boolean r0 = r6.LJJIIJ(r5)
            r2 = r2 | r0
            java.lang.Object r1 = r6.LJJ()
            if (r2 != 0) goto L81
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L8a
        L81:
            X.0twu r1 = new X.0twu
            r0 = 0
            r1.<init>(r9, r11, r5, r0)
            r6.LJJIJIIJI(r1)
        L8a:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r6.LJJJJL(r3)
            X.C1680540tpk.LJFF(r4, r1, r6)
            goto L44
        L93:
            r2 = 0
            goto L67
        L95:
            r0 = 128(0x80, float:1.8E-43)
            goto L34
        L98:
            r0 = 16
            goto L24
        L9b:
            r8 = 2
            goto L16
        L9e:
            r8 = r12
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684920two.LJIIIIZZ(X.0u55, X.0tRU, X.0twt, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIIJJI(int r12, X.C1684970twt r13, X.C1690050u55 r14, java.util.List<? extends X.InterfaceC1891350zJl> r15, kotlin.jvm.functions.Function0<kotlin.Unit> r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684920two.LJIIJJI(int, X.0twt, X.0u55, java.util.List, kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(X.C1146430fwH r16, kotlin.jvm.functions.Function0<X.C1092560eXO> r17, kotlin.jvm.functions.Function1<? super X.AbstractC1146640fwc, kotlin.Unit> r18, X.C05P0<java.lang.Boolean> r19, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r20, X.InterfaceC1680500tpg r21, int r22) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684920two.LJI(X.0fwH, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05P0, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.0kSq, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r22v1, types: [X.0ty9] */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v4, types: [X.0tVb] */
    /* JADX WARN: Type inference failed for: r30v5, types: [X.0tbK] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r32v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r32v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r32v4, types: [X.0tU8] */
    /* JADX WARN: Type inference failed for: r33v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v2, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v3, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r33v4, types: [X.0tU8] */
    /* JADX WARN: Type inference failed for: r34v4, types: [X.0tZf] */
    /* JADX WARN: Type inference failed for: r35v3, types: [X.05AR] */
    /* JADX WARN: Type inference failed for: r37v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r39v0, types: [X.0tVb] */
    /* JADX WARN: Type inference failed for: r40v0, types: [X.0tbK] */
    /* JADX WARN: Type inference failed for: r42v0, types: [X.0txa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C1146350fw9 r48, kotlin.jvm.functions.Function1<? super X.AbstractC1146640fwc, kotlin.Unit> r49, X.C1693430uAX r50, X.C1693430uAX r51, kotlin.jvm.functions.Function0<? extends X.AbstractC1676270tir> r52, X.C1684960tws r53, X.InterfaceC1680500tpg r54, int r55) {
        /*
            Method dump skipped, instruction units count: 1520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684920two.LIZJ(X.0fw9, kotlin.jvm.functions.Function1, X.0uAX, X.0uAX, kotlin.jvm.functions.Function0, X.0tws, X.0tpg, int):void");
    }

    public static final void LIZLLL(C1146430fwH c1146430fwH, Function0<C1092560eXO> function0, Function1<? super AbstractC1146640fwc, Unit> function1, C1684970twt c1684970twt, Function1<? super C1146350fw9, Unit> function12, Function0<Unit> function02, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1678672933);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1146430fwH)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1684970twt)) {
                i6 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((74899 & i2) == 74898 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1690050u55 c1690050u55LIZ = C1689910u4r.LIZ(c13zcLJIIJ);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p0 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            C1146350fw9 c1146350fw9LIZIZ = C1146440fwI.LIZIZ(c1146430fwH);
            C1146360fwA c1146360fwA = c1146430fwH.LIZ;
            InterfaceC1665500tRU<C1146350fw9> interfaceC1665500tRU = c1146430fwH.LIZIZ;
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c1146360fwA) | c13zcLJIIJ.LJJIIJ(interfaceC1665500tRU);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ3 == c1680520tpi) {
                objLJJ3 = C1687430u0r.LIZ(C13LP.LJLIL(c1146430fwH.LIZIZ, C1697810uHb.LJIIL(c1146430fwH.LIZ)));
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            InterfaceC1665500tRU interfaceC1665500tRU2 = (InterfaceC1665500tRU) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-103566721);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C1677470tkn.LIZ(1.0f);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            C1677480tko c1677480tko = (C1677480tko) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ2 = c13zcLJIIJ.LJJIIJ(c1146350fw9LIZIZ) | c13zcLJIIJ.LJII(c1677480tko);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ2 || objLJJ5 == c1680520tpi) {
                objLJJ5 = new C05SZ(c1146350fw9LIZIZ, c1677480tko, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(c1146350fw9LIZIZ, (Function2) objLJJ5, c13zcLJIIJ);
            c13zcLJIIJ.LJJJJL(false);
            AbstractC1676270tir abstractC1676270tirLIZ = C1A46.LIZ(R.drawable.etw, c13zcLJIIJ, 0);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (objLJJ6 == c1680520tpi) {
                objLJJ6 = new AwS569S0100000_25(abstractC1676270tirLIZ, 69);
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            Function0 function03 = (Function0) objLJJ6;
            c13zcLJIIJ.LJJJJL(false);
            C1693430uAX c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LJJII;
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJJIIJ3 = c13zcLJIIJ.LJJIIJ(c1693430uAX);
            Object objLJJ7 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ3 || objLJJ7 == c1680520tpi) {
                objLJJ7 = C1693430uAX.LIZ(3, 0, 16613373, 0L, C1682430tsn.LJ(9), 0L, C1682430tsn.LJ(12), null, c1693430uAX, null, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ7);
            }
            C1693430uAX c1693430uAX2 = (C1693430uAX) objLJJ7;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJJIIJ4 = c13zcLJIIJ.LJJIIJ(c1693430uAX2);
            Object objLJJ8 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ4 || objLJJ8 == c1680520tpi) {
                objLJJ8 = C1693430uAX.LIZ(0, 0, 16777211, 0L, 0L, 0L, 0L, null, c1693430uAX2, null, C1680190tpB.LLIZLLLIL);
                c13zcLJIIJ.LJJIJIIJI(objLJJ8);
            }
            C1693430uAX c1693430uAX3 = (C1693430uAX) objLJJ8;
            c13zcLJIIJ.LJJJJL(false);
            float f = 4;
            float fLIZ = C1666730tTT.LIZ(R.dimen.aou, c13zcLJIIJ) + f;
            float fLIZ2 = C1666730tTT.LIZ(R.dimen.apy, c13zcLJIIJ);
            float fLIZ3 = C1666730tTT.LIZ(R.dimen.apz, c13zcLJIIJ);
            long jH2 = C1670400tZO.LIZIZ(c13zcLJIIJ).H2();
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJIJ = c13zcLJIIJ.LJIJ(fLIZ2) | c13zcLJIIJ.LJIJ(fLIZ3) | c13zcLJIIJ.LJIJJ(jH2);
            Object objLJJ9 = c13zcLJIIJ.LJJ();
            if (zLJIJ || objLJJ9 == c1680520tpi) {
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                float f2 = 10;
                float f3 = 14;
                float f4 = 12;
                float f5 = 6;
                objLJJ9 = new C1684960tws(c.LJIILJJIL(c1685760tyA, fLIZ3, fLIZ2), C1675980tiO.LIZIZ(C1682520tsw.LJIIL(c.LIZJ, 0.0f, 16, 0.0f, 0.0f, 13), jH2, C1669050tXD.LIZIZ(f)), c.LJI(C1682520tsw.LJIIL(c1685760tyA, 0.0f, f2, 0.0f, 0.0f, 13), 13), c.LJIILIIL(c1685760tyA, 70), c.LJIILIIL(C1682520tsw.LJIIL(c1685760tyA, 0.0f, f3, 0.0f, 0.0f, 13), 56), c.LJI(c1685760tyA, f4), c.LJI(c1685760tyA, f4), c.LJIILIIL(c1685760tyA, f2), c.LJI(c.LJIJ(c1685760tyA, 0.0f, fLIZ3, 1), f3), C1682520tsw.LJIIIZ(C1675980tiO.LIZIZ(c1685760tyA, LIZ, C1669050tXD.LIZIZ(2)), f, 1), C1682520tsw.LJIIL(c1685760tyA, f5, 0.0f, 0.0f, 0.0f, 14), C1682520tsw.LJIIL(c1685760tyA, 3, 0.0f, 0.0f, 0.0f, 14), C1682520tsw.LJIIL(c1685760tyA, 0.0f, 0.0f, f5, 0.0f, 11), c1685760tyA, C1682520tsw.LJIIL(c.LJ(c1685760tyA, 1.0f), 0.0f, 0.0f, 0.0f, f, 7));
                c13zcLJIIJ.LJJIJIIJI(objLJJ9);
            }
            C1684960tws c1684960tws = (C1684960tws) objLJJ9;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ10 = c13zcLJIIJ.LJJ();
            if (objLJJ10 == c1680520tpi) {
                objLJJ10 = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ10);
            }
            C05P0 c05p02 = (C05P0) objLJJ10;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            Object objLJJ11 = c13zcLJIIJ.LJJ();
            if (objLJJ11 == c1680520tpi) {
                objLJJ11 = new AwS604S0100000_25(c05p02, (C05P0<Boolean>) 51);
                c13zcLJIIJ.LJJIJIIJI(objLJJ11);
            }
            c13zcLJIIJ.LJJJJL(false);
            int i10 = i2 & 14;
            int i11 = i2 & 112;
            int i12 = i2 & 896;
            LJI(c1146430fwH, function0, function1, c05p0, (Function1) objLJJ11, c13zcLJIIJ, i10 | 27648 | i11 | i12);
            LIZIZ(c1690050u55LIZ, c13zcLJIIJ, 0);
            int i13 = i2 >> 3;
            LJIIIIZZ(c1690050u55LIZ, interfaceC1665500tRU2, c1684970twt, c13zcLJIIJ, i13 & 896);
            LJFF(c1146430fwH, c1146350fw9LIZIZ, c1690050u55LIZ, function12, function02, c1684970twt, c13zcLJIIJ, (i13 & 57344) | (i13 & 7168) | i10 | ((i2 << 6) & 458752));
            C20087113if c20087113ifLIZLLL = C1673990tfB.LIZLLL(c13zcLJIIJ);
            C1670020tYm c1670020tYm = new C1670020tYm(4);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1686320tz4.LIZ(InterfaceC1685750ty9.LIZ, c20087113ifLIZLLL, null);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if (i10 == 4) {
                z = true;
            } else {
                z = false;
            }
            boolean zLJJIIJ5 = c13zcLJIIJ.LJJIIJ(c1690050u55LIZ) | z;
            if ((i2 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJII = zLJJIIJ5 | z2 | c13zcLJIIJ.LJII(interfaceC497601wk);
            Object objLJJ12 = c13zcLJIIJ.LJJ();
            if (!zLJII && objLJJ12 != c1680520tpi) {
                i3 = -1224400529;
            } else {
                i3 = -1224400529;
                objLJJ12 = new AwS58S0500000_25(c05p0, (C05P0<Boolean>) c1146430fwH, (C1146430fwH) c1690050u55LIZ, (C1690050u55) c1684970twt, (C1684970twt) interfaceC497601wk, (InterfaceC497601wk) 0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ12);
            }
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LIZJ = C1680910tqL.LIZJ(interfaceC1685750ty9LIZ, (Function1) objLJJ12);
            C1682530tsx c1682530tsxLIZJ = C1682520tsw.LIZJ(0.0f, 0.0f, 0.0f, fLIZ, 7);
            C1679970top c1679970top = C1679930tol.LJFF;
            c13zcLJIIJ.LJJIIJZLJL(i3);
            if (i10 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zLJJIIJ6 = c13zcLJIIJ.LJJIIJ(c1684960tws) | z3;
            if (i11 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean zLJII2 = zLJJIIJ6 | z4 | c13zcLJIIJ.LJII(c1677480tko);
            if (i12 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean zLJJIIJ7 = zLJII2 | z5 | c13zcLJIIJ.LJJIIJ(c1693430uAX2) | c13zcLJIIJ.LJJIIJ(c1693430uAX3);
            Object objLJJ13 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ7 || objLJJ13 == c1680520tpi) {
                objLJJ13 = new C1684940twq(c1146430fwH, c1684960tws, function0, c05p02, c1677480tko, function1, c1693430uAX2, c1693430uAX3, function03);
                c13zcLJIIJ.LJJIJIIJI(objLJJ13);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1670240tZ8.LIZ(c1670020tYm, interfaceC1685750ty9LIZJ, c1690050u55LIZ, c1682530tsxLIZJ, false, null, c1679970top, null, false, null, (Function1) objLJJ13, c13zcLJIIJ, 1572864, 0, 944);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0601000_25(c1146430fwH, (C1146430fwH) function0, (Function0<C1092560eXO>) function1, (Function1<? super AbstractC1146640fwc, Unit>) c1684970twt, (C1684970twt) function12, (Function1<? super C1146350fw9, Unit>) function02, (Function0<Unit>) i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(kotlin.jvm.functions.Function0<kotlin.Unit> r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17, kotlin.jvm.functions.Function0<? extends X.InterfaceC346201Wa<X.C262100zr>> r18, X.C1146430fwH r19, android.content.Context r20, kotlin.jvm.functions.Function1<? super X.AbstractC1146640fwc, kotlin.Unit> r21, X.InterfaceC1680500tpg r22, int r23) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684920two.LJ(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0fwH, android.content.Context, kotlin.jvm.functions.Function1, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(X.C1146430fwH r16, X.C1146350fw9 r17, X.C1690050u55 r18, kotlin.jvm.functions.Function1<? super X.C1146350fw9, kotlin.Unit> r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20, X.C1684970twt r21, X.InterfaceC1680500tpg r22, int r23) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684920two.LJFF(X.0fwH, X.0fw9, X.0u55, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, X.0twt, X.0tpg, int):void");
    }
}
