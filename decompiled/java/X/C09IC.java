package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.ChannelAsFlow;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.09IC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09IC {
    public static final AnonymousClass0950 LIZ(C05YC c05yc) {
        return new AnonymousClass0950(c05yc, null);
    }

    public static final AnonymousClass0951 LIZIZ(InterfaceC332260D0u interfaceC332260D0u) {
        return new AnonymousClass0951(interfaceC332260D0u, null);
    }

    public static final b LJ(Function2 function2) {
        return new b(function2, C23271099x.INSTANCE, -2, EnumC2252401DDy.SUSPEND);
    }

    public static final <T> InterfaceC346201Wa<T> LJIIJJI(InterfaceC346201Wa<? extends T> interfaceC346201Wa) {
        return LIZLLL(interfaceC346201Wa, -1, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC346201Wa LJIIL(C095E c095e) {
        return new ChannelAsFlow(c095e, true, null, 0, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2.LLILLL == r3) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> X.InterfaceC346201Wa<T> LJIILL(X.InterfaceC346201Wa<? extends T> r4) {
        /*
            boolean r0 = r4 instanceof X.C05YD
            if (r0 != 0) goto L17
            kotlin.jvm.internal.AFwS286S0000000_3 r3 = X.C09IO.LIZIZ
            boolean r0 = r4 instanceof X.C09ID
            if (r0 == 0) goto L18
            r2 = r4
            X.09ID r2 = (X.C09ID) r2
            kotlin.jvm.functions.Function1<T, java.lang.Object> r1 = r2.LLILLJJLI
            kotlin.jvm.internal.AFwS231S0000000_3 r0 = X.C09IO.LIZ
            if (r1 != r0) goto L18
            kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r0 = r2.LLILLL
            if (r0 != r3) goto L18
        L17:
            return r4
        L18:
            X.09ID r0 = new X.09ID
            r0.<init>(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09IC.LJIILL(X.01Wa):X.01Wa");
    }

    public static final C23127094j LJJIFFI(Iterable iterable) {
        int i = C09IP.LIZ;
        return new C23127094j(iterable, C23271099x.INSTANCE, -2, EnumC2252401DDy.SUSPEND);
    }

    public static final C23127094j LJJII(InterfaceC346201Wa... interfaceC346201WaArr) {
        int i = C09IP.LIZ;
        return LJJIFFI(C13LQ.LJIIJ(interfaceC346201WaArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC346201Wa LJJIIJ(C095E c095e) {
        return new ChannelAsFlow(c095e, false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0);
    }

    public static final Object LJI(InterfaceC346201Wa<?> interfaceC346201Wa, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objCollect = interfaceC346201Wa.collect(C23131094n.LL, interfaceC1364105Vn);
        if (objCollect != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objCollect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC346201Wa<T> LJIILIIL(InterfaceC346201Wa<? extends T> interfaceC346201Wa, long j) {
        if (j >= 0) {
            if (j != 0) {
                return new C23036090w(new AnonymousClass0949(null, new C1124404aY(j), interfaceC346201Wa));
            }
            return interfaceC346201Wa;
        }
        "Debounce timeout should not be negative".toString();
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final InterfaceC346201Wa LJIILJJIL(Function2 function2, InterfaceC346201Wa interfaceC346201Wa) {
        C19719512Dh.LJ(2, function2);
        if (interfaceC346201Wa instanceof C09ID) {
            C09ID c09id = (C09ID) interfaceC346201Wa;
            if (c09id.LLILLJJLI == C09IO.LIZ && c09id.LLILLL == function2) {
                return interfaceC346201Wa;
            }
        }
        return new C09ID(interfaceC346201Wa, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LJIIZILJ(X.InterfaceC346201Wa<? extends T> r7, X.InterfaceC1364105Vn<? super T> r8) {
        /*
            boolean r0 = r8 instanceof X.C09IH
            if (r0 == 0) goto L24
            r6 = r8
            X.09IH r6 = (X.C09IH) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2e
            Y.AgS284S0100000_3 r2 = r6.LLILLJJLI
            X.00zU r3 = r6.LL
            goto L2a
        L24:
            X.09IH r6 = new X.09IH
            r6.<init>(r8)
            goto L12
        L2a:
            X.C155000ia.LIZIZ(r5)     // Catch: X.C094L -> L58
            goto L5e
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r5)
            X.00zU r3 = new X.00zU
            r3.<init>()
            X.09AU r0 = X.C09AV.LIZ
            r3.element = r0
            Y.AgS284S0100000_3 r2 = new Y.AgS284S0100000_3
            r0 = 28
            r2.<init>(r3, r0)
            r6.LL = r3     // Catch: X.C094L -> L56
            r6.LLILLJJLI = r2     // Catch: X.C094L -> L56
            r6.LLILZ = r1     // Catch: X.C094L -> L56
            java.lang.Object r0 = r7.collect(r2, r6)     // Catch: X.C094L -> L56
            if (r0 != r4) goto L5e
            return r4
        L56:
            r1 = move-exception
            goto L59
        L58:
            r1 = move-exception
        L59:
            X.01Wf<?> r0 = r1.owner
            if (r0 == r2) goto L5e
            throw r1
        L5e:
            T r4 = r3.element
            X.09AU r0 = X.C09AV.LIZ
            if (r4 != r0) goto L6c
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Expected at least one element"
            r1.<init>(r0)
            throw r1
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09IC.LJIIZILJ(X.01Wa, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LJIJI(X.InterfaceC346201Wa<? extends T> r7, X.InterfaceC1364105Vn<? super T> r8) {
        /*
            boolean r0 = r8 instanceof X.C09IG
            if (r0 == 0) goto L24
            r6 = r8
            X.09IG r6 = (X.C09IG) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2e
            Y.AgS284S0100000_3 r2 = r6.LLILLJJLI
            X.00zU r3 = r6.LL
            goto L2a
        L24:
            X.09IG r6 = new X.09IG
            r6.<init>(r8)
            goto L12
        L2a:
            X.C155000ia.LIZIZ(r5)     // Catch: X.C094L -> L54
            goto L5a
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r5)
            X.00zU r3 = new X.00zU
            r3.<init>()
            Y.AgS284S0100000_3 r2 = new Y.AgS284S0100000_3
            r0 = 22
            r2.<init>(r3, r0)
            r6.LL = r3     // Catch: X.C094L -> L52
            r6.LLILLJJLI = r2     // Catch: X.C094L -> L52
            r6.LLILZ = r1     // Catch: X.C094L -> L52
            java.lang.Object r0 = r7.collect(r2, r6)     // Catch: X.C094L -> L52
            if (r0 != r4) goto L5a
            return r4
        L52:
            r1 = move-exception
            goto L55
        L54:
            r1 = move-exception
        L55:
            X.01Wf<?> r0 = r1.owner
            if (r0 == r2) goto L5a
            throw r1
        L5a:
            T r4 = r3.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09IC.LJIJI(X.01Wa, X.05Vn):java.lang.Object");
    }

    public static final C2501209r8 LJIJJLI(Function2 function2, InterfaceC346201Wa interfaceC346201Wa) {
        int i = C09IP.LIZ;
        return new C2501209r8(new C2501109r7(function2, interfaceC346201Wa, 2), 2);
    }

    public static final InterfaceC346201Wa LJIL(InterfaceC346201Wa interfaceC346201Wa, AbstractC2252651DEx abstractC2252651DEx) {
        if (abstractC2252651DEx.get(C09AE.LJJLJ) == null) {
            if (Intrinsics.LJFF(abstractC2252651DEx, C23271099x.INSTANCE)) {
                return interfaceC346201Wa;
            }
            if (interfaceC346201Wa instanceof InterfaceC23142094y) {
                return C23143094z.LIZ((InterfaceC23142094y) interfaceC346201Wa, abstractC2252651DEx, 0, null, 6);
            }
            return new C23125094h(interfaceC346201Wa, abstractC2252651DEx, 0, null, 12);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Flow context cannot contain job in it. Had ");
        sbLIZ.append(abstractC2252651DEx);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJJ(X.C2501109r7 r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C09IJ
            if (r0 == 0) goto L41
            r5 = r7
            X.09IJ r5 = (X.C09IJ) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 != r3) goto L47
            X.00zU r2 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            T r4 = r2.element
            return r4
        L27:
            X.C155000ia.LIZIZ(r1)
            X.00zU r2 = new X.00zU
            r2.<init>()
            X.01zs r1 = new X.01zs
            r0 = 15
            r1.<init>(r2, r0)
            r5.LL = r2
            r5.LLILLL = r3
            java.lang.Object r0 = r6.collect(r1, r5)
            if (r0 != r4) goto L24
            return r4
        L41:
            X.09IJ r5 = new X.09IJ
            r5.<init>(r7)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09IC.LJJ(X.09r7, X.05Vn):java.lang.Object");
    }

    public static final AnonymousClass0956 LJJI(InterfaceC497601wk interfaceC497601wk, InterfaceC346201Wa interfaceC346201Wa) {
        return C23250099c.LIZLLL(interfaceC497601wk, null, null, new C330801Qc(interfaceC346201Wa, null), 3);
    }

    public static final AnonymousClass0954 LJJIII(InterfaceC497601wk interfaceC497601wk, InterfaceC346201Wa interfaceC346201Wa) {
        AbstractC23133094p c23125094h;
        if (!(interfaceC346201Wa instanceof AbstractC23133094p) || (c23125094h = (AbstractC23133094p) interfaceC346201Wa) == null) {
            c23125094h = new C23125094h(interfaceC346201Wa, null, 0, null, 14);
        }
        return c23125094h.produceImpl(interfaceC497601wk);
    }

    public static final C23036090w LJJIIZ(InterfaceC346201Wa interfaceC346201Wa, long j) {
        if (j > 0) {
            return new C23036090w(new AnonymousClass0948(interfaceC346201Wa, j, null));
        }
        "Sample period should be positive".toString();
        throw new IllegalArgumentException("Sample period should be positive");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LJJIJ(X.InterfaceC346201Wa<? extends T> r6, X.InterfaceC1364105Vn<? super T> r7) {
        /*
            boolean r0 = r7 instanceof X.C09IK
            if (r0 == 0) goto L50
            r5 = r7
            X.09IK r5 = (X.C09IK) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L57
            X.00zU r2 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            T r4 = r2.element
            X.09AU r0 = X.C09AV.LIZ
            if (r4 != r0) goto L56
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Flow is empty"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.00zU r2 = new X.00zU
            r2.<init>()
            X.09AU r0 = X.C09AV.LIZ
            r2.element = r0
            Y.AgS284S0100000_3 r1 = new Y.AgS284S0100000_3
            r0 = 23
            r1.<init>(r2, r0)
            r5.LL = r2
            r5.LLILLL = r3
            java.lang.Object r0 = r6.collect(r1, r5)
            if (r0 != r4) goto L24
            return r4
        L50:
            X.09IK r5 = new X.09IK
            r5.<init>(r7)
            goto L12
        L56:
            return r4
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09IC.LJJIJ(X.01Wa, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LJJIJIIJI(X.InterfaceC346201Wa<? extends T> r7, X.InterfaceC1364105Vn<? super T> r8) {
        /*
            boolean r0 = r8 instanceof X.C09II
            if (r0 == 0) goto L24
            r6 = r8
            X.09II r6 = (X.C09II) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L36
            if (r0 != r4) goto L2e
            Y.AgS284S0100000_3 r2 = r6.LLILLJJLI
            X.00zU r3 = r6.LL
            goto L2a
        L24:
            X.09II r6 = new X.09II
            r6.<init>(r8)
            goto L12
        L2a:
            X.C155000ia.LIZIZ(r5)     // Catch: X.C094L -> L58
            goto L5e
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r5)
            X.00zU r3 = new X.00zU
            r3.<init>()
            X.09AU r0 = X.C09AV.LIZ
            r3.element = r0
            Y.AgS284S0100000_3 r2 = new Y.AgS284S0100000_3
            r0 = 24
            r2.<init>(r3, r0)
            r6.LL = r3     // Catch: X.C094L -> L56
            r6.LLILLJJLI = r2     // Catch: X.C094L -> L56
            r6.LLILZ = r4     // Catch: X.C094L -> L56
            java.lang.Object r0 = r7.collect(r2, r6)     // Catch: X.C094L -> L56
            if (r0 != r1) goto L5e
            return r1
        L56:
            r1 = move-exception
            goto L59
        L58:
            r1 = move-exception
        L59:
            X.01Wf<?> r0 = r1.owner
            if (r0 == r2) goto L5e
            throw r1
        L5e:
            T r1 = r3.element
            X.09AU r0 = X.C09AV.LIZ
            if (r1 != r0) goto L65
            r1 = 0
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09IC.LJJIJIIJI(X.01Wa, X.05Vn):java.lang.Object");
    }

    public static final C20099713kh LJJIJL(InterfaceC346201Wa interfaceC346201Wa, int i) {
        if (i > 0) {
            return new C20099713kh(interfaceC346201Wa, i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Requested element count ");
        sbLIZ.append(i);
        sbLIZ.append(" should be positive");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static Object LJJIL(InterfaceC346201Wa interfaceC346201Wa, InterfaceC1364105Vn interfaceC1364105Vn) {
        return LJJIJLIJ(interfaceC346201Wa, new ArrayList(), interfaceC1364105Vn);
    }

    public static final C23123094f LJJIZ(InterfaceC346201Wa interfaceC346201Wa, InterfaceC1631620sYq interfaceC1631620sYq) {
        int i = C09IP.LIZ;
        return new C23123094f(interfaceC1631620sYq, interfaceC346201Wa, C23271099x.INSTANCE, -2, EnumC2252401DDy.SUSPEND);
    }

    public static final <T> InterfaceC346201Wa<T> LIZJ(InterfaceC346201Wa<? extends T> interfaceC346201Wa, int i, EnumC2252401DDy enumC2252401DDy) {
        int i2 = i;
        EnumC2252401DDy enumC2252401DDy2 = enumC2252401DDy;
        if (i2 < 0 && i2 != -2) {
            if (i2 == -1) {
                if (enumC2252401DDy2 == EnumC2252401DDy.SUSPEND) {
                    enumC2252401DDy2 = EnumC2252401DDy.DROP_OLDEST;
                    i2 = 0;
                } else {
                    "CONFLATED capacity cannot be used with non-default onBufferOverflow".toString();
                    throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ");
                sbLIZ.append(i2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
        }
        if (interfaceC346201Wa instanceof InterfaceC23142094y) {
            return C23143094z.LIZ((InterfaceC23142094y) interfaceC346201Wa, null, i2, enumC2252401DDy2, 1);
        }
        return new C23125094h(interfaceC346201Wa, null, i2, enumC2252401DDy2, 2);
    }

    public static /* synthetic */ InterfaceC346201Wa LIZLLL(InterfaceC346201Wa interfaceC346201Wa, int i, int i2) {
        EnumC2252401DDy enumC2252401DDy;
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            enumC2252401DDy = EnumC2252401DDy.SUSPEND;
        } else {
            enumC2252401DDy = null;
        }
        return LIZJ(interfaceC346201Wa, i, enumC2252401DDy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJFF(X.InterfaceC1364105Vn r7, X.InterfaceC346201Wa r8, X.InterfaceC346701Wf r9) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof X.C09IL
            if (r0 == 0) goto L22
            r6 = r7
            X.09IL r6 = (X.C09IL) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 1
            if (r0 == 0) goto L34
            if (r0 != r5) goto L2c
            X.00zU r2 = r6.LL
            goto L28
        L22:
            X.09IL r6 = new X.09IL
            r6.<init>(r7)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4f
            goto L95
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r1)
            X.00zU r2 = new X.00zU
            r2.<init>()
            Y.AgS194S0200000_3 r1 = new Y.AgS194S0200000_3     // Catch: java.lang.Throwable -> L4d
            r0 = 4
            r1.<init>(r9, r2, r0)     // Catch: java.lang.Throwable -> L4d
            r6.LL = r2     // Catch: java.lang.Throwable -> L4d
            r6.LLILLL = r5     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r8.collect(r1, r6)     // Catch: java.lang.Throwable -> L4d
            if (r0 != r4) goto L95
            return r4
        L4d:
            r4 = move-exception
            goto L50
        L4f:
            r4 = move-exception
        L50:
            T r3 = r2.element
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2 = 0
            if (r3 == 0) goto L8f
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r4)
            if (r0 == 0) goto L8f
            r0 = 1
        L5e:
            if (r0 != 0) goto L97
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            X.08zJ r0 = X.C09AE.LJJLJ
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r0)
            X.09AE r1 = (X.C09AE) r1
            if (r1 == 0) goto L81
            boolean r0 = r1.isCancelled()
            if (r0 == 0) goto L81
            java.util.concurrent.CancellationException r0 = r1.LJJJLL()
            if (r0 == 0) goto L8d
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L8d
        L80:
            r2 = r5
        L81:
            if (r2 != 0) goto L97
            if (r3 == 0) goto L96
            boolean r0 = r4 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L91
            X.C13SZ.LIZ(r3, r4)
            throw r3
        L8d:
            r5 = 0
            goto L80
        L8f:
            r0 = 0
            goto L5e
        L91:
            X.C13SZ.LIZ(r4, r3)
            throw r4
        L95:
            r4 = 0
        L96:
            return r4
        L97:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09IC.LJFF(X.05Vn, X.01Wa, X.01Wf):java.lang.Object");
    }

    public static final Object LJII(InterfaceC346201Wa interfaceC346201Wa, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        int i = C09IP.LIZ;
        Object objLJI = LJI(LIZLLL(LJJIZ(interfaceC346201Wa, new C322701Mz(function2, null)), 0, 2), interfaceC1364105Vn);
        if (objLJI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJI;
    }

    public static final Object LJIILLIIL(InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC346201Wa interfaceC346201Wa, InterfaceC346701Wf interfaceC346701Wf) throws Throwable {
        if (!(interfaceC346701Wf instanceof C095C)) {
            Object objCollect = interfaceC346201Wa.collect(interfaceC346701Wf, interfaceC1364105Vn);
            if (objCollect != C099R.LJFF()) {
                return Unit.LIZ;
            }
            return objCollect;
        }
        throw ((C095C) interfaceC346701Wf).LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.09AU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIJ(X.InterfaceC346201Wa r7, X.InterfaceC1364105Vn r8, kotlin.jvm.functions.Function2 r9) {
        /*
            boolean r0 = r8 instanceof X.C09IE
            if (r0 == 0) goto L26
            r6 = r8
            X.09IE r6 = (X.C09IE) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r5 = r6.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 != r1) goto L30
            Y.AgS194S0200000_3 r2 = r6.LLILLL
            X.00zU r3 = r6.LLILLJJLI
            kotlin.jvm.functions.Function2 r9 = r6.LL
            goto L2c
        L26:
            X.09IE r6 = new X.09IE
            r6.<init>(r8)
            goto L12
        L2c:
            X.C155000ia.LIZIZ(r5)     // Catch: X.C094L -> L5b
            goto L61
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r5)
            X.00zU r3 = new X.00zU
            r3.<init>()
            X.09AU r0 = X.C09AV.LIZ
            r3.element = r0
            Y.AgS194S0200000_3 r2 = new Y.AgS194S0200000_3
            r0 = 7
            r2.<init>(r9, r3, r0)
            r6.LL = r9     // Catch: X.C094L -> L59
            r6.LLILLJJLI = r3     // Catch: X.C094L -> L59
            r6.LLILLL = r2     // Catch: X.C094L -> L59
            r6.LLILZIL = r1     // Catch: X.C094L -> L59
            java.lang.Object r0 = r7.collect(r2, r6)     // Catch: X.C094L -> L59
            if (r0 != r4) goto L61
            return r4
        L59:
            r1 = move-exception
            goto L5c
        L5b:
            r1 = move-exception
        L5c:
            X.01Wf<?> r0 = r1.owner
            if (r0 == r2) goto L61
            throw r1
        L61:
            T r4 = r3.element
            X.09AU r0 = X.C09AV.LIZ
            if (r4 != r0) goto L7b
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected at least one element matching the predicate "
            r1.<init>(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09IC.LJIJ(X.01Wa, X.05Vn, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIJJ(X.InterfaceC346201Wa r7, X.InterfaceC1364105Vn r8, kotlin.jvm.functions.Function2 r9) {
        /*
            boolean r0 = r8 instanceof X.C09IF
            if (r0 == 0) goto L24
            r6 = r8
            X.09IF r6 = (X.C09IF) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2e
            Y.AgS194S0200000_3 r2 = r6.LLILLJJLI
            X.00zU r3 = r6.LL
            goto L2a
        L24:
            X.09IF r6 = new X.09IF
            r6.<init>(r8)
            goto L12
        L2a:
            X.C155000ia.LIZIZ(r5)     // Catch: X.C094L -> L53
            goto L59
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r5)
            X.00zU r3 = new X.00zU
            r3.<init>()
            Y.AgS194S0200000_3 r2 = new Y.AgS194S0200000_3
            r0 = 3
            r2.<init>(r9, r3, r0)
            r6.LL = r3     // Catch: X.C094L -> L51
            r6.LLILLJJLI = r2     // Catch: X.C094L -> L51
            r6.LLILZ = r1     // Catch: X.C094L -> L51
            java.lang.Object r0 = r7.collect(r2, r6)     // Catch: X.C094L -> L51
            if (r0 != r4) goto L59
            return r4
        L51:
            r1 = move-exception
            goto L54
        L53:
            r1 = move-exception
        L54:
            X.01Wf<?> r0 = r1.owner
            if (r0 == r2) goto L59
            throw r1
        L59:
            T r4 = r3.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09IC.LJIJJ(X.01Wa, X.05Vn, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    public static final C2501109r7 LJJIIJZLJL(C095D c095d, long j, Function2 function2) {
        if (j > 0) {
            return new C2501109r7(new C321301Ml(j, function2, null), c095d, 1);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected positive amount of retries, but had ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final AnonymousClass0950 LJJIIZI(InterfaceC346201Wa interfaceC346201Wa, C054G c054g, C1370805Yc c1370805Yc) {
        C095I c095iLIZ = C095H.LIZ(interfaceC346201Wa);
        C2252331DDr c2252331DDrLIZ = C09IR.LIZ(1, c095iLIZ.LIZIZ, c095iLIZ.LIZJ);
        return new AnonymousClass0950(c2252331DDrLIZ, C095H.LIZIZ(c054g, c095iLIZ.LIZLLL, c095iLIZ.LIZ, c2252331DDrLIZ, c1370805Yc, C09IR.LIZ));
    }

    public static final <T> Object LJJIJIIJIL(InterfaceC346201Wa<? extends T> interfaceC346201Wa, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C05YD<? extends T>> interfaceC1364105Vn) {
        C095I c095iLIZ = C095H.LIZ(interfaceC346201Wa);
        C099F c099fLIZIZ = C090F.LIZIZ();
        C23250099c.LIZLLL(interfaceC497601wk, c095iLIZ.LIZLLL, null, new C05W7(c095iLIZ.LIZ, c099fLIZIZ, null), 2);
        return c099fLIZIZ.LJLIIIL(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object LJJIJLIJ(X.InterfaceC346201Wa<? extends T> r5, C r6, X.InterfaceC1364105Vn<? super C> r7) {
        /*
            boolean r0 = r7 instanceof X.C09IM
            if (r0 == 0) goto L3a
            r4 = r7
            X.09IM r4 = (X.C09IM) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L40
            java.lang.Object r6 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            return r6
        L25:
            X.C155000ia.LIZIZ(r1)
            Y.AgS283S0100000_2 r1 = new Y.AgS283S0100000_2
            r0 = 77
            r1.<init>(r6, r0)
            r4.LL = r6
            r4.LLILLL = r2
            java.lang.Object r0 = r5.collect(r1, r4)
            if (r0 != r3) goto L24
            return r3
        L3a:
            X.09IM r4 = new X.09IM
            r4.<init>(r7)
            goto L12
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09IC.LJJIJLIJ(X.01Wa, java.util.Collection, X.05Vn):java.lang.Object");
    }

    public static final C515901zh LJIIIIZZ(InterfaceC346201Wa interfaceC346201Wa, InterfaceC346201Wa interfaceC346201Wa2, InterfaceC346201Wa interfaceC346201Wa3, InterfaceC1631630sYr interfaceC1631630sYr) {
        return new C515901zh(interfaceC1631630sYr, new InterfaceC346201Wa[]{interfaceC346201Wa, interfaceC346201Wa2, interfaceC346201Wa3}, 1);
    }

    public static final C095D LJIIJ(C2252321DDq c2252321DDq, InterfaceC346201Wa interfaceC346201Wa, InterfaceC346201Wa interfaceC346201Wa2, InterfaceC1685420txc interfaceC1685420txc) {
        return new C095D(new C414401jK(new InterfaceC346201Wa[]{c2252321DDq, interfaceC346201Wa, interfaceC346201Wa2}, null, interfaceC1685420txc));
    }

    public static final AnonymousClass0951 LJJIJIL(InterfaceC346201Wa interfaceC346201Wa, InterfaceC497601wk interfaceC497601wk, C05YW c05yw, Object obj) {
        C095I c095iLIZ = C095H.LIZ(interfaceC346201Wa);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(obj);
        return new AnonymousClass0951(c2252321DDqLIZ, C095H.LIZIZ(interfaceC497601wk, c095iLIZ.LIZLLL, c095iLIZ.LIZ, c2252321DDqLIZ, c05yw, obj));
    }

    public static final C515901zh LJIIIZ(C01S9 c01s9, InterfaceC346201Wa interfaceC346201Wa, C01S9 c01s92, InterfaceC346201Wa interfaceC346201Wa2, InterfaceC1685420txc interfaceC1685420txc) {
        return new C515901zh(interfaceC1685420txc, new InterfaceC346201Wa[]{c01s9, interfaceC346201Wa, c01s92, interfaceC346201Wa2}, 2);
    }
}
