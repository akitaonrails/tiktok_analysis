package X;

import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS0S1313000_25;
import kotlin.jvm.internal.AwS0S1512000_8;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS165S1200000_25;
import kotlin.jvm.internal.AwS2S0104000_25;
import kotlin.jvm.internal.AwS3S1202000_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0taU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671080taU {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0035 -> B:19:0x003d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIIJJI(X.AbstractC1690640u62 r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof X.C1362505Ux
            if (r0 == 0) goto L58
            r5 = r7
            X.05Ux r5 = (X.C1362505Ux) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L28
            if (r0 == r2) goto L38
            if (r0 != r3) goto L5e
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
        L2b:
            r5.LL = r6
            r5.LLILLL = r2
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r4) goto L3d
            return r4
        L38:
            X.0u62 r6 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L3d:
            boolean r0 = r6.LIZIZ()
            if (r0 != 0) goto L2b
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.05Ur r1 = new X.05Ur
            r0 = 0
            r1.<init>(r6, r0)
            r5.LL = r0
            r5.LLILLL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r5, r2, r1)
            if (r0 != r4) goto L25
            return r4
        L58:
            X.05Ux r5 = new X.05Ux
            r5.<init>(r7)
            goto L12
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671080taU.LJIIJJI(X.0u62, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.AbstractC1690640u62 r6, X.InterfaceC1680500tpg r7, int r8) {
        /*
            r0 = -906546633(0xffffffffc9f73237, float:-2025030.9)
            X.13ZC r4 = r7.LJIIJ(r0)
            r0 = r8 & 6
            r5 = 4
            r2 = 2
            if (r0 != 0) goto L6b
            boolean r0 = r4.LJJIIJ(r6)
            if (r0 == 0) goto L69
            r1 = 4
        L14:
            r1 = r1 | r8
        L15:
            r0 = r1 & 3
            if (r0 != r2) goto L32
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L32
            r4.LIZJ()
        L22:
            X.13Ys r2 = r4.LJJJJZI()
            if (r2 == 0) goto L31
            kotlin.jvm.internal.AwS181S0101000_25 r1 = new kotlin.jvm.internal.AwS181S0101000_25
            r0 = 89
            r1.<init>(r6, r8, r0)
            r2.LIZLLL = r1
        L31:
            return
        L32:
            int r0 = r6.LJIILLIIL()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            r0 = r1 & 14
            r2 = 0
            if (r0 != r5) goto L67
            r0 = 1
        L46:
            java.lang.Object r1 = r4.LJJ()
            if (r0 != 0) goto L55
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L5e
        L55:
            X.05Us r1 = new X.05Us
            r0 = 0
            r1.<init>(r6, r0)
            r4.LJJIJIIJI(r1)
        L5e:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r4.LJJJJL(r2)
            X.C1680540tpk.LJFF(r3, r1, r4)
            goto L22
        L67:
            r0 = 0
            goto L46
        L69:
            r1 = 2
            goto L14
        L6b:
            r1 = r8
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1671080taU.LIZ(X.0u62, X.0tpg, int):void");
    }

    public static final void LJ(Pair<Float, C1685910tyP>[] pairArr, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(779991947);
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        c13zcLJIIJ.LJIIL(-2047014416, Integer.valueOf(pairArr.length));
        if (c13zcLJIIJ.LJIJI(pairArr.length)) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        int i6 = i2 | i3;
        for (Pair<Float, C1685910tyP> pair : pairArr) {
            if (c13zcLJIIJ.LJJIIJ(pair)) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            i6 |= i4;
        }
        c13zcLJIIJ.LJJJJL(false);
        if ((i6 & 14) == 0) {
            i6 |= 2;
        }
        if ((i6 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            k.LIZ(C1675980tiO.LIZ(interfaceC1685750ty9, C1668200tVq.LJIIIIZZ((Pair[]) Arrays.copyOf(pairArr, pairArr.length)), null, 6), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25((Pair[]) pairArr, (Pair<Float, C1685910tyP>[]) interfaceC1685750ty9, (InterfaceC1685750ty9) i, 97);
        }
    }

    public static final void LJIIJ(int i, int i2, int i3, InterfaceC1680500tpg interfaceC1680500tpg) {
        int i4;
        long jS2;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1873596665);
        if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i6 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i4 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            for (int i7 = 0; i7 < i2; i7++) {
                if (i == i7) {
                    c13zcLJIIJ.LJJIIJZLJL(1726779038);
                    jS2 = C1670400tZO.LIZIZ(c13zcLJIIJ).M3();
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(1726779974);
                    jS2 = C1670400tZO.LIZIZ(c13zcLJIIJ).S2();
                }
                c13zcLJIIJ.LJJJJL(false);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIILIIL = c.LJIILIIL(c1685760tyA, 12);
                InterfaceC1668050tVb.LIZ.getClass();
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
                int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIILIIL);
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
                    LJII(jS2, 6, C1672220tcK.LIZ.LIZIZ(c1685760tyA, C1668040tVa.LJFF), c13zcLJIIJ, 48);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1671110taX(i, i2, i3);
        }
    }

    public static final void LJII(long j, float f, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-234270064);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJJ(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIJ(f)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            k.LIZ(c.LJIILIIL(C1675980tiO.LIZIZ(C1667200tUE.LIZ(C1682520tsw.LJIIIIZZ(interfaceC1685750ty9, (float) 0.5d), C1669050tXD.LIZ), j, C1669430tXp.LIZ), f), c13zcLJIIJ, 0);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1671090taV(j, f, interfaceC1685750ty9, i);
        }
    }

    public static final void LIZLLL(String str, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1665500tRU<C1685910tyP> interfaceC1665500tRU, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1665500tRU<C1685910tyP> interfaceC1665500tRULIZ = interfaceC1665500tRU;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-8963770);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0 && c13zcLJIIJ.LJJIIJ(interfaceC1665500tRULIZ)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJLI();
            if ((i & 1) != 0 && !c13zcLJIIJ.LJJLIIIIJ()) {
                c13zcLJIIJ.LIZJ();
            } else if ((i2 & 4) != 0) {
                interfaceC1665500tRULIZ = C1687430u0r.LIZ(C1697810uHb.LJIIJJI(new C1685910tyP(C1670400tZO.LIZIZ(c13zcLJIIJ).C2()), new C1685910tyP(C1685910tyP.LIZIZ)));
            }
            c13zcLJIIJ.LJJJJLI();
            C1668160tVm.LIZ(c.LIZLLL(InterfaceC1685750ty9.LIZ), null, false, C13Z4.LIZJ(574682416, new AwS165S1200000_25((InterfaceC1665500tRU) interfaceC1665500tRULIZ, (InterfaceC1665500tRU<C1685910tyP>) interfaceC1685750ty9, (InterfaceC1685750ty9) str, (String) 1), c13zcLJIIJ), c13zcLJIIJ, 3078, 6);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS3S1202000_25(str, (String) interfaceC1685750ty9, (InterfaceC1685750ty9) interfaceC1665500tRULIZ, (InterfaceC1665500tRU<C1685910tyP>) i, i2, 7);
        }
    }

    public static final void LJI(int i, int i2, int i3, int i4, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9) {
        int i5;
        int i6;
        int i7;
        int i8;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(138486692);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i6 | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i2)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i5 |= i7;
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i5 |= i8;
        }
        if ((i5 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(interfaceC1685750ty92, null, 3);
            C1679920tok c1679920tok = C1679930tol.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            C1688120u1y c1688120u1yLIZ = C1665750tRt.LIZ(c1679920tok, C1668040tVa.LJIIJ, c13zcLJIIJ, 6);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI);
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
                LJIIJ(i, i2, (i5 & 112) | (i5 & 14), c13zcLJIIJ);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS2S0104000_25(i, i2, i3, i4, interfaceC1685750ty92, 0);
        }
    }

    public static final void LIZJ(int i, int i2, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str, Function0 function0, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(332011741);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                z2 = true;
            }
            int i9 = i3 << 3;
            C1673400teE.LIZJ(function0, str, interfaceC1685750ty9, z2, 0L, false, null, C1669660tYC.LLL, null, C1666920tTm.LIZ(0.0f, null, C1671140taa.LIZ, c13zcLJIIJ, 3072, 7), C1666340tSq.LIZ(C1670400tZO.LIZIZ(c13zcLJIIJ).v2(), C1670400tZO.LIZIZ(c13zcLJIIJ).B2(), 0.0f, C1670400tZO.LIZIZ(c13zcLJIIJ).v2(), c13zcLJIIJ, 0, 12), null, false, c13zcLJIIJ, ((i3 >> 6) & 14) | (i9 & 112) | (i9 & 896) | (i3 & 7168), 0, 6512);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1671100taW(i, i2, interfaceC1685750ty9, str, function0, z2);
        }
    }

    public static final void LJIIIIZZ(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, C1692220u8a c1692220u8a, String str, Function0<Unit> function0, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1420202477);
        if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i4 = i11 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJIJI(i2)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i4 |= i10;
        }
        if ((i3 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i4 |= i9;
        }
        if ((i3 & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1692220u8a)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        String str2 = str;
        if ((i3 & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i4 |= i7;
        }
        if ((196608 & i3) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i4 |= i6;
        }
        if ((1572864 & i3) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i4 |= i5;
        }
        if ((599187 & i4) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
                C1666950tTp c1666950tTpLJI = C1679930tol.LJI(16);
                C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ = c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJIIIIZZ);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(c1666950tTpLJI, c1296860jqu, c13zcLJIIJ, 54);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZIZ);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    LJI(i, i2, (i4 & 14) | (i4 & 112), 0, c13zcLJIIJ, C1687990u1l.LIZIZ(c1685760tyA, C1668040tVa.LJIILIIL));
                    int i12 = i4 >> 9;
                    C1685190txF.LIZIZ(c1692220u8a, C1672150tcD.LIZ(c.LJ(c1685760tyA, 1.0f)), C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIJ, 0L, 5, 2, false, 2, null, null, c13zcLJIIJ, (i12 & 14) | 102236160, 0, 1680);
                    str2 = str2;
                    LIZJ(((i4 >> 12) & 14) | 48 | (i12 & 896) | (i12 & 7168), 0, c13zcLJIIJ, c.LJI(c.LJ(c1685760tyA, 1.0f), 48), str2, function0, z);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1313000_25(i, i2, i3, interfaceC1685750ty9, c1692220u8a, str2, function0, z, 1);
        }
    }

    public static final void LJIIIZ(int i, C1692220u8a c1692220u8a, String str, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1112427309);
        if ((i3 & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(i)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i4 = i11 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1692220u8a)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i4 |= i10;
        }
        if ((i3 & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i4 |= i9;
        }
        if ((i3 & 3072) == 0) {
            if (c13zcLJIIJ.LJIJI(i2)) {
                i8 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i3 & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i4 |= i7;
        }
        if ((196608 & i3) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i4 |= i6;
        }
        if ((1572864 & i3) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i4 |= i5;
        }
        if ((599187 & i4) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            int i12 = i4 >> 6;
            int i13 = (i4 & 14) | (i12 & 112) | (i12 & 896);
            int i14 = i4 << 6;
            LJIIIIZZ(i, i2, interfaceC1685750ty9, c1692220u8a, str, C0MXD.LIZ((i4 >> 15) & 14, c13zcLJIIJ, function0), z, c13zcLJIIJ, (i4 & 3670016) | i13 | (i14 & 7168) | (i14 & 57344));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1313000_25(i, i2, i3, interfaceC1685750ty9, c1692220u8a, str, function0, z, 0);
        }
    }

    public static final void LJFF(InterfaceC1665500tRU<C569940MWy> interfaceC1665500tRU, Function1<? super Integer, Unit> function1, String str, Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, Function1<? super Integer, Unit> function12, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2 = z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1001665209);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1665500tRU)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i12 = i2 & 32;
        if (i12 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((599187 & i3) == 599186 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i11 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            if (i12 != 0) {
                z2 = true;
            }
            InterfaceC1668050tVb.LIZ.getClass();
            C1296860jqu c1296860jqu = C1668040tVa.LJIILJJIL;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, c1296860jqu, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
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
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
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
                    int size = 1073741823 - (1073741823 % interfaceC1665500tRU.size());
                    c13zcLJIIJ.LJJIIJZLJL(1849434622);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    if (objLJJ == C1680510tph.LIZIZ) {
                        objLJJ = AFwS194S0000000_8.get$arr$(539);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    C1386605bk c1386605bkLIZIZ = C1690670u65.LIZIZ(size, (Function0) objLJJ, c13zcLJIIJ, 384);
                    LIZ(c1386605bkLIZIZ, c13zcLJIIJ, 0);
                    int i13 = i3 << 3;
                    LIZIZ(interfaceC1665500tRU, c1386605bkLIZIZ, function1, str, function0, z2, interfaceC1685750ty92, function12, c13zcLJIIJ, (i3 & 14) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i3) | ((i3 << 6) & 3670016) | (29360128 & i13), 0);
                    c13zcLJIIJ.LJJJJL(true);
                    c13zcLJIIJ.LJJJJL(true);
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS0S1512000_8((InterfaceC1665500tRU) interfaceC1665500tRU, (InterfaceC1665500tRU<C569940MWy>) function1, (Function1<? super Integer, Unit>) str, (String) function0, (Function0<Unit>) interfaceC1685750ty92, (InterfaceC1685750ty9) z2, (boolean) function12, (Function1<? super Integer, Unit>) i, i2, 1);
        }
    }

    public static final void LIZIZ(InterfaceC1665500tRU<C569940MWy> interfaceC1665500tRU, AbstractC1690640u62 abstractC1690640u62, Function1<? super Integer, Unit> function1, String str, Function0<Unit> function0, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super Integer, Unit> function12, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1496076393);
        InterfaceC1665500tRU<C569940MWy> interfaceC1665500tRU2 = interfaceC1665500tRU;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1665500tRU2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(abstractC1690640u62)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function1)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i12 = i2 & 64;
        if (i12 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            if (c13zcLJIIJ.LJII(function12)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        if ((4793491 & i3) == 4793490 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i12 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z2 | z3;
            if ((i3 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z7 || objLJJ2 == c1680520tpi) {
                interfaceC1665500tRU2 = interfaceC1665500tRU2;
                objLJJ2 = new C1362405Uw(abstractC1690640u62, interfaceC1665500tRU2, function1, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            int i13 = i3 >> 3;
            int i14 = i13 & 14;
            C1680540tpk.LJFF(abstractC1690640u62, (Function2) objLJJ2, c13zcLJIIJ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, c1685760tyA);
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
                c13zcLJIIJ.LJJIIJZLJL(-263270560);
                C1675550thh.LIZ(abstractC1690640u62, interfaceC1685750ty92, null, null, 2, 0.0f, null, null, z, false, null, null, null, null, C13Z4.LIZJ(1653664734, new C0MXC(interfaceC1665500tRU2, function12, z), c13zcLJIIJ), c13zcLJIIJ, i14 | 24576 | ((i3 >> 15) & 112) | ((i3 << 9) & 234881024), 24576, 16108);
                LJ(new Pair[]{new Pair(Float.valueOf(0.0f), new C1685910tyP(C1685850tyJ.LIZJ(0, 0, 0, 0))), new Pair(Float.valueOf(0.5f), new C1685910tyP(C1685850tyJ.LJ(0.0f, 0.0f, 0.0f, 0.61f))), new Pair(Float.valueOf(1.0f), new C1685910tyP(C1685850tyJ.LIZJ(0, 0, 0, 255)))}, c.LJI(c.LJ(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJIIIIZZ), 1.0f), 191), c13zcLJIIJ, 0);
                C569940MWy c569940MWy = (C569940MWy) C13LP.LJJJLZIJ(((Number) c05p0.getValue()).intValue(), interfaceC1665500tRU2);
                if (c569940MWy == null) {
                    c13zcLJIIJ.LJJJJL(false);
                    z5 = true;
                } else {
                    int iIntValue = ((Number) c05p0.getValue()).intValue();
                    C1692220u8a c1692220u8a = c569940MWy.LIZIZ;
                    int size = interfaceC1665500tRU2.size();
                    float f = 16;
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LIZJ, f, 0.0f, f, 12, 2);
                    int i15 = i3 << 3;
                    int i16 = (i13 & 896) | 24576 | (458752 & i15) | (i15 & 3670016);
                    z5 = true;
                    LJIIIZ(iIntValue, c1692220u8a, str, size, interfaceC1685750ty9LJIIL, function0, z, c13zcLJIIJ, i16);
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJJJL(z5);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C0MXB(interfaceC1665500tRU2, abstractC1690640u62, function1, str, function0, z, interfaceC1685750ty92, function12, i, i2);
        }
    }
}
