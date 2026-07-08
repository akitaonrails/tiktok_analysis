package X;

import h0.n2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ths, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675660ths {
    public static final C1676890tjr<Float> LIZ = C1671550tbF.LIZJ(0.0f, 0.0f, null, 7);
    public static final C1676890tjr<C1668650tWZ> LIZIZ;

    static {
        C1683130ttv c1683130ttv = C1675670tht.LIZ;
        LIZIZ = C1671550tbF.LIZJ(0.0f, 0.0f, new C1668650tWZ(0.1f), 3);
        C1671550tbF.LIZJ(0.0f, 0.0f, new C1680770tq7((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)), 3);
        C1671550tbF.LIZJ(0.0f, 0.0f, new C1378605aS((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)), 3);
        C1671550tbF.LIZJ(0.0f, 0.0f, C1675670tht.LIZ, 3);
        C1671550tbF.LIZJ(0.0f, 0.0f, 1, 3);
        C1671550tbF.LIZJ(0.0f, 0.0f, new C1676820tjk(C1675670tht.LIZ()), 3);
        C1671550tbF.LIZJ(0.0f, 0.0f, new C1682900ttY(C1675670tht.LIZIZ()), 3);
    }

    public static final C05P1 LIZJ(int i, C1677050tk7 c1677050tk7, String str, InterfaceC1680500tpg interfaceC1680500tpg) {
        return LIZLLL(Integer.valueOf(i), n2.LIZIZ, c1677050tk7, null, str, null, interfaceC1680500tpg, 24960, 8);
    }

    public static final C05P1 LIZ(float f, C1677050tk7 c1677050tk7, String str, Function1 function1, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        Function1 function12 = function1;
        String str2 = str;
        InterfaceC1677030tk5 interfaceC1677030tk5 = c1677050tk7;
        if ((i2 & 2) != 0) {
            interfaceC1677030tk5 = LIZIZ;
        }
        if ((i2 & 4) != 0) {
            str2 = "DpAnimation";
        }
        if ((i2 & 8) != 0) {
            function12 = null;
        }
        int i3 = i << 6;
        return LIZLLL(new C1668650tWZ(f), n2.LIZJ, interfaceC1677030tk5, null, str2, function12, interfaceC1680500tpg, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C05P1 LIZIZ(float r5, X.InterfaceC1675680thu r6, float r7, java.lang.String r8, kotlin.jvm.functions.Function1 r9, X.InterfaceC1680500tpg r10, int r11, int r12) {
        /*
            r1 = r11
            r9 = r9
            r8 = r8
            r6 = r6
            r0 = r12 & 2
            if (r0 == 0) goto La
            X.0tjr<java.lang.Float> r6 = X.C1675660ths.LIZ
        La:
            r0 = r12 & 4
            if (r0 == 0) goto L11
            r7 = 1008981770(0x3c23d70a, float:0.01)
        L11:
            r0 = r12 & 8
            if (r0 == 0) goto L17
            java.lang.String r8 = "FloatAnimation"
        L17:
            r0 = r12 & 16
            if (r0 == 0) goto L1c
            r9 = 0
        L1c:
            X.0tjr<java.lang.Float> r0 = X.C1675660ths.LIZ
            r3 = 3
            r10 = r10
            if (r6 != r0) goto L7c
            r0 = 1125558999(0x4316aad7, float:150.66734)
            r10.LJJIIJZLJL(r0)
            r0 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L36
            boolean r0 = r10.LJIJ(r7)
            if (r0 != 0) goto L7a
        L36:
            r0 = r1 & 384(0x180, float:5.38E-43)
            if (r0 == r2) goto L7a
            r0 = 0
        L3b:
            java.lang.Object r6 = r10.LJJ()
            if (r0 != 0) goto L4a
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L56
        L4a:
            java.lang.Float r2 = java.lang.Float.valueOf(r7)
            r0 = 0
            X.0tjr r6 = X.C1671550tbF.LIZJ(r0, r0, r2, r3)
            r10.LJJIJIIJI(r6)
        L56:
            X.0tjr r6 = (X.C1676890tjr) r6
            r10.LJ()
        L5b:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            X.0tl1 r5 = h0.n2.LIZ
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r11 = r1 & 14
            int r1 = r1 << r3
            r0 = r1 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r1
            r11 = r11 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r0
            r11 = r11 | r1
            r12 = 0
            X.05P1 r0 = LIZLLL(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L7a:
            r0 = 1
            goto L3b
        L7c:
            r0 = 1125668925(0x4318583d, float:152.34468)
            r10.LJJIIJZLJL(r0)
            r10.LJ()
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1675660ths.LIZIZ(float, X.0thu, float, java.lang.String, kotlin.jvm.functions.Function1, X.0tpg, int, int):X.05P1");
    }

    public static final <T, V extends AbstractC1677260tkS> C05P1<T> LIZLLL(T t, InterfaceC1677290tkV<T, V> interfaceC1677290tkV, InterfaceC1677030tk5<T> interfaceC1677030tk5, T t2, String str, Function1<? super T, Unit> function1, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        boolean z;
        if ((i2 & 4) != 0) {
            Object objLJJ = interfaceC1680500tpg.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            if (objLJJ == C1680510tph.LIZIZ) {
                objLJJ = C1671550tbF.LIZJ(0.0f, 0.0f, null, 7);
                interfaceC1680500tpg.LJJIJIIJI(objLJJ);
            }
            interfaceC1677030tk5 = (C1676890tjr) objLJJ;
        }
        if ((i2 & 8) != 0) {
            t2 = null;
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        Object obj = C1680510tph.LIZIZ;
        if (objLJJ2 == obj) {
            objLJJ2 = C20028913Yh.LJI(null);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        C05P0 c05p0 = (C05P0) objLJJ2;
        Object objLJJ3 = interfaceC1680500tpg.LJJ();
        if (objLJJ3 == obj) {
            objLJJ3 = new C1677480tko(t, interfaceC1677290tkV, t2);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
        }
        C1677480tko c1677480tko = (C1677480tko) objLJJ3;
        C05P0 c05p0LJIIIIZZ = C20028913Yh.LJIIIIZZ(function1, interfaceC1680500tpg);
        if (t2 != null && (interfaceC1677030tk5 instanceof C1676890tjr)) {
            C1676890tjr c1676890tjr = (C1676890tjr) interfaceC1677030tk5;
            if (!Intrinsics.LJFF(c1676890tjr.LIZJ, t2)) {
                interfaceC1677030tk5 = new C1676890tjr<>(c1676890tjr.LIZ, c1676890tjr.LIZIZ, t2);
            }
        }
        C05P0 c05p0LJIIIIZZ2 = C20028913Yh.LJIIIIZZ(interfaceC1677030tk5, interfaceC1680500tpg);
        Object objLJJ4 = interfaceC1680500tpg.LJJ();
        if (objLJJ4 == obj) {
            objLJJ4 = C095G.LIZ(-1, null, 6);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ4);
        }
        C095E c095e = (C095E) objLJJ4;
        boolean zLJII = interfaceC1680500tpg.LJII(c095e);
        if ((((i & 14) ^ 6) <= 4 || !interfaceC1680500tpg.LJII(t)) && (i & 6) != 4) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = zLJII | z;
        Object objLJJ5 = interfaceC1680500tpg.LJJ();
        if (z2 || objLJJ5 == obj) {
            objLJJ5 = new AwS403S0200000_2(c095e, (C095E<int>) t, 55);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ5);
        }
        C1680540tpk.LJII((Function0) objLJJ5, interfaceC1680500tpg);
        boolean zLJII2 = interfaceC1680500tpg.LJII(c095e) | interfaceC1680500tpg.LJII(c1677480tko) | interfaceC1680500tpg.LJJIIJ(c05p0LJIIIIZZ2) | interfaceC1680500tpg.LJJIIJ(c05p0LJIIIIZZ);
        Object objLJJ6 = interfaceC1680500tpg.LJJ();
        if (zLJII2 || objLJJ6 == obj) {
            objLJJ6 = new C1393305cp(c095e, c1677480tko, c05p0LJIIIIZZ2, c05p0LJIIIIZZ, null);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ6);
        }
        C1680540tpk.LJFF(c095e, (Function2) objLJJ6, interfaceC1680500tpg);
        C05P1<T> c05p1 = (C05P1) c05p0.getValue();
        if (c05p1 == null) {
            return c1677480tko.LIZJ;
        }
        return c05p1;
    }
}
