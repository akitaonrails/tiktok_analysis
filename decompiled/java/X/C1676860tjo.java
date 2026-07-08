package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS8S0501000_25;

/* JADX INFO: renamed from: X.0tjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676860tjo {
    public static final AFwS266S0000000_25 LIZ = AFwS266S0000000_25.get$arr$(420);
    public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS214S0000000_25.get$arr$(416));

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1676910tjt LIZLLL(X.AbstractC1676900tjs r8, java.lang.String r9, X.InterfaceC1680500tpg r10, int r11) {
        /*
            r0 = r11 & 14
            r6 = r0 ^ 6
            r7 = 1
            r1 = 4
            r3 = 0
            if (r6 <= r1) goto Lf
            boolean r0 = r10.LJJIIJ(r8)
            if (r0 != 0) goto La0
        Lf:
            r0 = r11 & 6
            if (r0 == r1) goto La0
            r0 = 0
        L14:
            java.lang.Object r2 = r10.LJJ()
            r5 = 0
            if (r0 != 0) goto L24
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L2c
        L24:
            X.0tjt r2 = new X.0tjt
            r2.<init>(r8, r5, r9)
            r10.LJJIJIIJI(r2)
        L2c:
            X.0tjt r2 = (X.C1676910tjt) r2
            boolean r0 = r8 instanceof X.C1676950tjx
            if (r0 == 0) goto L8f
            r0 = 1030829284(0x3d7134e4, float:0.05888833)
            r10.LJJIIJZLJL(r0)
            java.lang.Object r4 = r8.LIZ()
            java.lang.Object r3 = r8.LIZIZ()
            if (r6 <= r1) goto L48
            boolean r0 = r10.LJJIIJ(r8)
            if (r0 != 0) goto L4d
        L48:
            r0 = r11 & 6
            if (r0 == r1) goto L4d
            r7 = 0
        L4d:
            java.lang.Object r1 = r10.LJJ()
            if (r7 != 0) goto L5c
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L64
        L5c:
            X.0tjp r1 = new X.0tjp
            r1.<init>(r8, r5)
            r10.LJJIJIIJI(r1)
        L64:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            X.C1680540tpk.LJ(r4, r3, r1, r10)
            r10.LJ()
        L6c:
            boolean r0 = r10.LJJIIJ(r2)
            java.lang.Object r1 = r10.LJJ()
            if (r0 != 0) goto L7f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L89
        L7f:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 568(0x238, float:7.96E-43)
            r1.<init>(r2, r0)
            r10.LJJIJIIJI(r1)
        L89:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            X.C1680540tpk.LIZIZ(r2, r1, r10)
            return r2
        L8f:
            r0 = 1031290843(0x3d783fdb, float:0.060607772)
            r10.LJJIIJZLJL(r0)
            java.lang.Object r0 = r8.LIZIZ()
            r2.LIZ(r0, r10, r3)
            r10.LJ()
            goto L6c
        La0:
            r0 = 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676860tjo.LIZLLL(X.0tjs, java.lang.String, X.0tpg, int):X.0tjt");
    }

    public static final <T> C1676910tjt<T> LJ(T t, String str, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = new C1676910tjt(new C1676880tjq(t), null, str);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C1676910tjt<T> c1676910tjt = (C1676910tjt) objLJJ;
        c1676910tjt.LIZ(t, interfaceC1680500tpg, (i & 8) | 48 | (i & 14));
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (objLJJ2 == c1680520tpi) {
            objLJJ2 = new AwS604S0100000_25(c1676910tjt, 569);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        C1680540tpk.LIZIZ(c1676910tjt, (Function1) objLJJ2, interfaceC1680500tpg);
        return c1676910tjt;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1676910tjt.a LIZIZ(X.C1676910tjt r5, X.C1677610tl1 r6, java.lang.String r7, X.InterfaceC1680500tpg r8, int r9, int r10) {
        /*
            r0 = r10 & 2
            if (r0 == 0) goto L6
            java.lang.String r7 = "DeferredAnimation"
        L6:
            r0 = r9 & 14
            r3 = r0 ^ 6
            r2 = 1
            r1 = 4
            if (r3 <= r1) goto L14
            boolean r0 = r8.LJJIIJ(r5)
            if (r0 != 0) goto La4
        L14:
            r0 = r9 & 6
            if (r0 == r1) goto La4
            r0 = 0
        L19:
            java.lang.Object r4 = r8.LJJ()
            if (r0 != 0) goto L28
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L30
        L28:
            X.0tjt$a r4 = new X.0tjt$a
            r4.<init>(r6, r7)
            r8.LJJIJIIJI(r4)
        L30:
            X.0tjt$a r4 = (X.C1676910tjt.a) r4
            if (r3 <= r1) goto L3a
            boolean r0 = r8.LJJIIJ(r5)
            if (r0 != 0) goto L3f
        L3a:
            r0 = r9 & 6
            if (r0 == r1) goto L3f
            r2 = 0
        L3f:
            boolean r0 = r8.LJII(r4)
            r0 = r0 | r2
            java.lang.Object r1 = r8.LJJ()
            if (r0 != 0) goto L53
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L5d
        L53:
            kotlin.jvm.internal.AwS391S0200000_25 r1 = new kotlin.jvm.internal.AwS391S0200000_25
            r0 = 193(0xc1, float:2.7E-43)
            r1.<init>(r5, r4, r0)
            r8.LJJIJIIJI(r1)
        L5d:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            X.C1680540tpk.LIZIZ(r4, r1, r8)
            boolean r0 = r5.LJII()
            if (r0 == 0) goto La3
            X.05P0 r0 = r4.LIZIZ
            X.13FE r0 = (X.C13FE) r0
            java.lang.Object r7 = r0.getValue()
            X.0tjn r7 = (X.C1676850tjn) r7
            if (r7 == 0) goto La3
            X.0tjt<S> r6 = X.C1676910tjt.this
            X.0tjt<S>$d<T, V extends X.0tkS> r5 = r7.LL
            kotlin.jvm.functions.Function1<? super S, ? extends T> r1 = r7.LLILLL
            X.0tjQ r0 = r6.LJFF()
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Object r3 = r1.invoke(r0)
            kotlin.jvm.functions.Function1<? super S, ? extends T> r1 = r7.LLILLL
            X.0tjQ r0 = r6.LJFF()
            java.lang.Object r0 = r0.LIZJ()
            java.lang.Object r2 = r1.invoke(r0)
            kotlin.jvm.functions.Function1<? super X.0tjQ<S>, ? extends X.0thu<T>> r1 = r7.LLILLJJLI
            X.0tjQ r0 = r6.LJFF()
            java.lang.Object r0 = r1.invoke(r0)
            X.0thu r0 = (X.InterfaceC1675680thu) r0
            r5.LJIJ(r3, r2, r0)
        La3:
            return r4
        La4:
            r0 = 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676860tjo.LIZIZ(X.0tjt, X.0tl1, java.lang.String, X.0tpg, int, int):X.0tjt$a");
    }

    public static final <S, T, V extends AbstractC1677260tkS> void LIZ(C1676910tjt<S> c1676910tjt, C1676910tjt<S>.d<T, V> dVar, T t, T t2, InterfaceC1675680thu<T> interfaceC1675680thu, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        boolean zLJII;
        int i3;
        boolean zLJII2;
        int i4;
        boolean zLJII3;
        int i5;
        int i6;
        int i7;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(867041821);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1676910tjt)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(dVar)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                zLJII3 = c13zcLJIIJ.LJJIIJ(t);
            } else {
                zLJII3 = c13zcLJIIJ.LJII(t);
            }
            if (zLJII3) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
                zLJII2 = c13zcLJIIJ.LJJIIJ(t2);
            } else {
                zLJII2 = c13zcLJIIJ.LJII(t2);
            }
            if (zLJII2) {
                i4 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if ((32768 & i) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(interfaceC1675680thu);
            } else {
                zLJII = c13zcLJIIJ.LJII(interfaceC1675680thu);
            }
            if (zLJII) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i2 & 1, z)) {
            if (c1676910tjt.LJII()) {
                dVar.LJIJ(t, t2, interfaceC1675680thu);
            } else {
                dVar.LJIJI(t2, interfaceC1675680thu);
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS8S0501000_25(c1676910tjt, dVar, (C1676910tjt<S>.d<InterfaceC1675680thu<T>, V>) t, (InterfaceC1675680thu<T>) t2, interfaceC1675680thu, (InterfaceC1675680thu<InterfaceC1675680thu<T>>) i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1676910tjt.d LIZJ(X.C1676910tjt r13, java.lang.Object r14, java.lang.Object r15, X.InterfaceC1675680thu r16, X.InterfaceC1677290tkV r17, X.InterfaceC1680500tpg r18, int r19) {
        /*
            r12 = r19 & 14
            r4 = r12 ^ 6
            r5 = 1
            r2 = 4
            r11 = r18
            r6 = r13
            if (r4 <= r2) goto L11
            boolean r0 = r11.LJJIIJ(r6)
            if (r0 != 0) goto L8d
        L11:
            r0 = r19 & 6
            if (r0 == r2) goto L8d
            r0 = 0
        L16:
            java.lang.Object r7 = r11.LJJ()
            r9 = r15
            r8 = r14
            if (r0 != 0) goto L27
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r7 != r0) goto L3e
        L27:
            X.0tjt$d r7 = new X.0tjt$d
            r1 = r17
            kotlin.jvm.functions.Function1 r0 = r1.LIZ()
            java.lang.Object r0 = r0.invoke(r9)
            X.0tkS r0 = (X.AbstractC1677260tkS) r0
            r0.LIZLLL()
            r7.<init>(r8, r0, r1)
            r11.LJJIJIIJI(r7)
        L3e:
            X.0tjt$d r7 = (X.C1676910tjt.d) r7
            int r0 = r19 >> 3
            r3 = r0 & 8
            int r0 = r3 << 6
            r12 = r12 | r0
            int r1 = r19 << 3
            r0 = r1 & 896(0x380, float:1.256E-42)
            r12 = r12 | r0
            int r0 = r3 << 9
            r12 = r12 | r0
            r0 = r1 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r1
            r12 = r12 | r0
            r10 = r16
            LIZ(r6, r7, r8, r9, r10, r11, r12)
            if (r4 <= r2) goto L64
            boolean r0 = r11.LJJIIJ(r6)
            if (r0 != 0) goto L69
        L64:
            r0 = r19 & 6
            if (r0 == r2) goto L69
            r5 = 0
        L69:
            boolean r0 = r11.LJJIIJ(r7)
            r0 = r0 | r5
            java.lang.Object r1 = r11.LJJ()
            if (r0 != 0) goto L7d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L87
        L7d:
            kotlin.jvm.internal.AwS391S0200000_25 r1 = new kotlin.jvm.internal.AwS391S0200000_25
            r0 = 194(0xc2, float:2.72E-43)
            r1.<init>(r6, r7, r0)
            r11.LJJIJIIJI(r1)
        L87:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            X.C1680540tpk.LIZIZ(r7, r1, r11)
            return r7
        L8d:
            r0 = 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676860tjo.LIZJ(X.0tjt, java.lang.Object, java.lang.Object, X.0thu, X.0tkV, X.0tpg, int):X.0tjt$d");
    }
}
