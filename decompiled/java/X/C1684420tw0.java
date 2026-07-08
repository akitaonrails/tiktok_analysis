package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS180S0101000_20;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684420tw0 {
    public static final C1695950uEb LJIIL(Rect rect) {
        C1695950uEb c1695950uEbLIZ = C1695940uEa.LIZ();
        c1695950uEbLIZ.LIZJ(rect.left, rect.top);
        c1695950uEbLIZ.LJIIL(rect.right, rect.top);
        c1695950uEbLIZ.LJIIL(rect.right, rect.bottom);
        c1695950uEbLIZ.LJIIL(rect.left, rect.bottom);
        c1695950uEbLIZ.close();
        return c1695950uEbLIZ;
    }

    public static final String LJIILIIL(float f) {
        return C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }

    public static final Integer LJIILL(EnumC1684470tw5 enumC1684470tw5) {
        switch (C1684460tw4.LIZ[enumC1684470tw5.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
                return null;
            case 4:
                return 2131825883;
            case 5:
                return 2131825880;
            default:
                throw new C1954807lC();
        }
    }

    public static final C1692220u8a LJIIJJI(InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        interfaceC1680500tpg.LJJIIJZLJL(1528336778);
        C1692230u8b c1692230u8b = new C1692230u8b();
        long j = C1670400tZO.LJ(interfaceC1680500tpg).LIZ.LIZ.LIZIZ;
        AbstractC1696400uFK abstractC1696400uFK = C1670400tZO.LJ(interfaceC1680500tpg).LIZ.LIZ.LJFF;
        int iLJIIJJI = c1692230u8b.LJIIJJI(new C1693450uAZ(C1670400tZO.LIZIZ(interfaceC1680500tpg).M3(), j, C1670400tZO.LJ(interfaceC1680500tpg).LIZ.LIZ.LIZJ, null, null, abstractC1696400uFK, null, 0L, null, null, null, 0L, null, null, 65496));
        try {
            c1692230u8b.LIZJ(str);
            c1692230u8b.LJII(iLJIIJJI);
            C1692220u8a c1692220u8aLJIIL = c1692230u8b.LJIIL();
            interfaceC1680500tpg.LJ();
            return c1692220u8aLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1692230u8b.LJII(iLJIIJJI);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer LJIILJJIL(X.EnumC1684470tw5 r6, X.C1684430tw1 r7) {
        /*
            X.0tw5 r0 = X.EnumC1684470tw5.FRONT
            java.util.List r0 = java.util.Collections.singletonList(r0)
            boolean r0 = r0.contains(r6)
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L7e
            int r1 = r7.LIZJ
            r0 = 2131825847(0x7f1114b7, float:1.9284562E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L22
            if (r1 <= r2) goto L25
            r0 = 2131825848(0x7f1114b8, float:1.9284564E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L22:
            if (r4 == 0) goto L7e
            return r4
        L25:
            X.0tw2 r3 = r7.LJIIIZ
            r1 = -1
            if (r3 == 0) goto L72
            int r0 = r3.LIZLLL
            if (r0 != r1) goto L36
            r0 = 2131825845(0x7f1114b5, float:1.9284558E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L22
        L36:
            int r0 = r3.LIZLLL
            if (r0 != r2) goto L42
            r0 = 2131825844(0x7f1114b4, float:1.9284556E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L22
        L42:
            int r0 = r3.LJFF
            if (r0 == r2) goto L22
            int r0 = r3.LJFF
            if (r0 == r1) goto L22
            int r0 = r3.LJ
            if (r0 == r2) goto L22
            int r0 = r3.LJ
            if (r0 == r1) goto L22
            int r0 = r3.LIZIZ
            if (r0 == r2) goto L6a
            int r0 = r3.LIZIZ
            if (r0 == r1) goto L6a
            int r0 = r3.LIZJ
            if (r0 == r2) goto L6a
            int r0 = r3.LIZJ
            if (r0 == r1) goto L6a
            int r0 = r3.LIZ
            if (r0 == r2) goto L6a
            int r0 = r3.LIZ
            if (r0 != r1) goto L72
        L6a:
            r0 = 2131825843(0x7f1114b3, float:1.9284554E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L22
        L72:
            boolean r0 = r7.LJII
            if (r0 != 0) goto L7e
            r0 = 2131825857(0x7f1114c1, float:1.9284582E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            goto L22
        L7e:
            int[] r1 = X.C1684460tw4.LIZ
            int r0 = r6.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L9b
            r0 = 2
            if (r1 == r0) goto La4
            r0 = 3
            if (r1 == r0) goto La4
            r0 = 4
            if (r1 == r0) goto L9c
            r0 = 5
            if (r1 != r0) goto L9b
            r0 = 2131825881(0x7f1114d9, float:1.928463E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L9b:
            return r5
        L9c:
            r0 = 2131825884(0x7f1114dc, float:1.9284637E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        La4:
            r0 = 2131825882(0x7f1114da, float:1.9284633E38)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684420tw0.LJIILJJIL(X.0tw5, X.0tw1):java.lang.Integer");
    }

    public static final Pair<String, String> LJIILLIIL(String str, String str2) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{str2}, 0, 6);
        return new Pair<>(C13LP.LJJJLL(listLJJLIIIJILLIZJL), C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C1684430tw1 r24, X.InterfaceC1680500tpg r25, int r26) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684420tw0.LIZ(X.0tw1, X.0tpg, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(kotlin.jvm.functions.Function0<kotlin.Unit> r16, X.InterfaceC1680500tpg r17, int r18) {
        /*
            r0 = -100067879(0xfffffffffa0915d9, float:-1.7794695E35)
            r1 = r17
            X.13ZC r15 = r1.LJIIJ(r0)
            r3 = r18
            r0 = r3 & 6
            r1 = 4
            r5 = 2
            r4 = r16
            if (r0 != 0) goto La5
            boolean r0 = r15.LJII(r4)
            if (r0 == 0) goto La2
            r2 = 4
        L1a:
            r2 = r2 | r3
        L1b:
            r0 = r2 & 3
            if (r0 != r5) goto L37
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L37
            r15.LIZJ()
        L28:
            X.13Ys r2 = r15.LJJJJZI()
            if (r2 == 0) goto L36
            kotlin.jvm.internal.AwS180S0101000_20 r1 = new kotlin.jvm.internal.AwS180S0101000_20
            r0 = 1
            r1.<init>(r3, r4, r0)
            r2.LIZLLL = r1
        L36:
            return
        L37:
            r0 = -1675948372(0xffffffff9c1b0eac, float:-5.130416E-22)
            r15.LJJIIJZLJL(r0)
            boolean r0 = X.C1601690rmZ.LIZJ()
            if (r0 == 0) goto L9f
            boolean r0 = X.C289580BWq.LIZ()
            if (r0 == 0) goto L9f
            r0 = 2131824445(0x7f110f3d, float:1.9281718E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r15)
        L50:
            r6 = 0
            r15.LJJJJL(r6)
            X.0tWw r7 = X.C1669660tYC.Z
            r0 = 28
            float r12 = (float) r0
            X.1ETK r0 = X.C1670400tZO.LIZIZ(r15)
            long r10 = r0.LJJJJLI()
            X.0tyA r5 = X.InterfaceC1685750ty9.LIZ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r2 & 14
            if (r0 != r1) goto L9d
            r0 = 1
        L6e:
            java.lang.Object r2 = r15.LJJ()
            if (r0 != 0) goto L7d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L87
        L7d:
            kotlin.jvm.internal.AwS564S0100000_20 r2 = new kotlin.jvm.internal.AwS564S0100000_20
            r0 = 12
            r2.<init>(r4, r0)
            r15.LJJIJIIJI(r2)
        L87:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r15.LJJJJL(r6)
            r1 = 7
            r0 = 0
            X.0ty9 r9 = X.C634380OuS.LIZJ(r5, r6, r0, r2, r1)
            r14 = 0
            r16 = 221184(0x36000, float:3.09945E-40)
            r17 = 64
            r13 = r12
            X.C1668930tX1.LIZIZ(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
            goto L28
        L9d:
            r0 = 0
            goto L6e
        L9f:
            java.lang.String r8 = "X button for quitting page"
            goto L50
        La2:
            r2 = 2
            goto L1a
        La5:
            r2 = r3
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684420tw0.LJFF(kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public static final void LJII(EnumC1684470tw5 enumC1684470tw5, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1322997506);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC1684470tw5.ordinal())) {
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
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(InterfaceC1685750ty9.LIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = AFwS266S0000000_25.get$arr$(31);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Function1 function1 = (Function1) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            if ((i2 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS604S0100000_25(enumC1684470tw5, 34);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20084413iE.LIZ(54, 0, c13zcLJIIJ, interfaceC1685750ty9LIZLLL, function1, (Function1) objLJJ2);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(enumC1684470tw5, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(kotlin.jvm.functions.Function0<kotlin.Unit> r15, X.InterfaceC1680500tpg r16, int r17) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684420tw0.LJIIIIZZ(kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public static final void LJIIJ(Integer num, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String strLIZIZ;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1423548151);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(num)) {
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
            c13zcLJIIJ.LJJIIJZLJL(839880927);
            Pair<String, String> pairLJIILLIIL = LJIILLIIL(C0MBB.LIZIZ(2131825841, c13zcLJIIJ), " ");
            String first = pairLJIILLIIL.getFirst();
            String second = pairLJIILLIIL.getSecond();
            C1680190tpB c1680190tpB = C1670400tZO.LJ(c13zcLJIIJ).LIZ.LIZ.LIZJ;
            long j = C1670400tZO.LJ(c13zcLJIIJ).LIZ.LIZ.LIZIZ;
            long j2 = ((C1685910tyP) ((C13FE) C1670400tZO.LIZIZ(c13zcLJIIJ).q4).getValue()).LIZ;
            C1692230u8b c1692230u8b = new C1692230u8b();
            int iLJIIJJI = c1692230u8b.LJIIJJI(new C1693450uAZ(j2, j, c1680190tpB, new C1693240uAE(1), null, null, null, 0L, null, null, null, 0L, null, null, 65520));
            try {
                c1692230u8b.LIZJ(first);
                c1692230u8b.LJII(iLJIIJJI);
                Pair pair = new Pair(c1692230u8b.LJIIL(), LJIIJJI(c13zcLJIIJ, second));
                c13zcLJIIJ.LJJJJL(false);
                C1692220u8a c1692220u8a = (C1692220u8a) pair.getFirst();
                C1692220u8a c1692220u8a2 = (C1692220u8a) pair.getSecond();
                c13zcLJIIJ.LJJIIJZLJL(2064800035);
                if (num == null) {
                    strLIZIZ = null;
                } else {
                    strLIZIZ = C0MBB.LIZIZ(num.intValue(), c13zcLJIIJ);
                }
                c13zcLJIIJ.LJJJJL(false);
                if (strLIZIZ != null) {
                    c13zcLJIIJ.LJJIIJZLJL(-1963746655);
                    Pair<String, String> pairLJIILLIIL2 = LJIILLIIL(strLIZIZ, "%s");
                    Pair pair2 = new Pair(LJIIJJI(c13zcLJIIJ, pairLJIILLIIL2.getFirst()), LJIIJJI(c13zcLJIIJ, pairLJIILLIIL2.getSecond()));
                    c13zcLJIIJ.LJJJJL(false);
                    C1692220u8a c1692220u8a3 = (C1692220u8a) pair2.getFirst();
                    C1692220u8a c1692220u8a4 = (C1692220u8a) pair2.getSecond();
                    C1692230u8b c1692230u8b2 = new C1692230u8b();
                    c1692230u8b2.LJ(c1692220u8a3);
                    c1692230u8b2.LJ(c1692220u8a);
                    c1692230u8b2.LIZLLL("  ");
                    c1692230u8b2.LJ(c1692220u8a2);
                    c1692230u8b2.LJ(c1692220u8a4);
                    float f = 32;
                    C1685190txF.LIZIZ(c1692230u8b2.LJIIL(), C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, f, 40, f, 0.0f, 8), 0L, null, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2012);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1692230u8b.LJII(iLJIIJJI);
                throw th;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS180S0101000_20(num, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(X.C1684510tw9 r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11, X.InterfaceC1680500tpg r12, int r13) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684420tw0.LJ(X.0tw9, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public static final void LJI(String str, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        long jLJJJJLI;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-846066403);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            float f = 32;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(InterfaceC1685750ty9.LIZ, f, 40, f, 0.0f, 8);
            C1693430uAX c1693430uAX = C1670400tZO.LJ(c13zcLJIIJ).LIZ;
            if (z) {
                c13zcLJIIJ.LJJIIJZLJL(1999255049);
                jLJJJJLI = C1670400tZO.LIZIZ(c13zcLJIIJ).U3();
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(1999320397);
                jLJJJJLI = C1670400tZO.LIZIZ(c13zcLJIIJ).LJJJJLI();
                c13zcLJIIJ.LJJJJL(false);
            }
            C1685190txF.LIZ(str, interfaceC1685750ty9LJIIL, jLJJJJLI, c1693430uAX, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, (i2 & 14) | 48, 0, 2000);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1303480k1a(str, z, i);
        }
    }

    public static final void LJIIIZ(int i, InterfaceC1680500tpg interfaceC1680500tpg, InterfaceC1685750ty9 interfaceC1685750ty9, String str) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1662276597);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            if (bitmapDecodeFile != null) {
                C1668230tVt.LIZIZ(new C1696790uFx(bitmapDecodeFile), "", interfaceC1685750ty9, null, null, 0.0f, c13zcLJIIJ, ((i2 << 6) & 896) | 48, 248);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C1303490k1b(i, interfaceC1685750ty9, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.InterfaceC1685750ty9 r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, X.InterfaceC1680500tpg r29, int r30) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684420tw0.LIZLLL(X.0ty9, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public static final void LIZIZ(C1684430tw1 c1684430tw1, C1684510tw9 c1684510tw9, Function0<Unit> function0, Function0<Unit> function02, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String strLIZIZ;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(539237599);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c1684430tw1)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1684510tw9)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i3 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Integer numLJIILJJIL = LJIILJJIL(c1684510tw9.LIZ, c1684430tw1);
            c13zcLJIIJ.LJJIIJZLJL(-1483699771);
            String strLIZIZ2 = "";
            if (numLJIILJJIL == null) {
                strLIZIZ = "";
            } else {
                strLIZIZ = C0MBB.LIZIZ(numLJIILJJIL.intValue(), c13zcLJIIJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            Integer numLJIILL = LJIILL(c1684510tw9.LIZ);
            c13zcLJIIJ.LJJIIJZLJL(-1483693941);
            if (numLJIILL != null) {
                strLIZIZ2 = C0MBB.LIZIZ(numLJIILL.intValue(), c13zcLJIIJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(EnumC1002550cCD.DONE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            if (c1684510tw9.LIZ == EnumC1684470tw5.DONE) {
                z = true;
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJIIZILJ = c13zcLJIIJ.LJIIZILJ(z);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJIIZILJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C1303460k1Y(z, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(boolValueOf, (Function2) objLJJ2, c13zcLJIIJ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = c.LIZLLL(c1685760tyA);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
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
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3);
                C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILIIL, c13zcLJIIJ, 0);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI);
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
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJIJI2 = c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3);
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(C1668040tVa.LJFF, false);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL4 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI2);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL4, aFwS311S0000000_254);
                        if (c1684510tw9.LIZ == EnumC1684470tw5.TAP_TO_START) {
                            c13zcLJIIJ.LJJIIJZLJL(1487385605);
                            LJIIJ(numLJIILJJIL, c13zcLJIIJ, 0);
                            c13zcLJIIJ.LJJJJL(false);
                        } else {
                            c13zcLJIIJ.LJJIIJZLJL(1487482449);
                            LJI(strLIZIZ, z, c13zcLJIIJ, 0);
                            c13zcLJIIJ.LJJJJL(false);
                        }
                        c13zcLJIIJ.LJJJJL(true);
                        float f = 32;
                        C1685190txF.LIZ(strLIZIZ2, c.LJ(C1682520tsw.LJIIL(c1685760tyA, f, 12, f, 0.0f, 8), 1.0f), C1670400tZO.LIZIZ(c13zcLJIIJ).M3(), C1670400tZO.LJ(c13zcLJIIJ).LJJIIJ, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 48, 0, 2000);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJIIJZLJL(-797694192);
                        if (c05p0.getValue() == EnumC1002550cCD.DONE_WITH_BUTTONS) {
                            int i7 = i2 >> 3;
                            LIZLLL(C1682520tsw.LJIIJ(c.LJ(c1672220tcK.LIZIZ(c1685760tyA, C1668040tVa.LJIIIIZZ), 1.0f), 16, 0.0f, 2), function0, function02, c13zcLJIIJ, (i7 & 896) | (i7 & 112));
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJJJL(true);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
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
            c20030013YsLJJJJZI.LIZLLL = new C1303500k1c(c1684430tw1, c1684510tw9, function0, function02, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(X.C1684430tw1 r30, X.C1684510tw9 r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, kotlin.jvm.functions.Function1<? super X.InterfaceC1692950u9l, kotlin.Unit> r37, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r38, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r39, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r40, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r41, X.InterfaceC1680500tpg r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1684420tw0.LIZJ(X.0tw1, X.0tw9, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, X.0tpg, int, int):void");
    }
}
