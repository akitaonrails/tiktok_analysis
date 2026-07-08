package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1374405Zm {
    public static final C05V7 LIZ = new C05V7(null);

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[LOOP:0: B:12:0x002d->B:13:0x002f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C05ZT r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1374905Zr
            if (r0 == 0) goto L61
            r6 = r9
            X.05Zr r6 = (X.C1374905Zr) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r7 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L51
            if (r0 != r4) goto L6a
            X.05ZT r8 = r6.LL
            X.C155000ia.LIZIZ(r7)
        L24:
            X.13fT r7 = (X.C20067313fT) r7
            java.util.List<X.13fO> r3 = r7.LIZ
            int r2 = r3.size()
            r1 = 0
        L2d:
            if (r1 >= r2) goto L3b
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            X.13fO r0 = (X.C20066813fO) r0
            r0.LIZ()
            int r1 = r1 + 1
            goto L2d
        L3b:
            java.util.List<X.13fO> r3 = r7.LIZ
            int r2 = r3.size()
            r1 = 0
        L42:
            if (r1 >= r2) goto L67
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            X.13fO r0 = (X.C20066813fO) r0
            boolean r0 = r0.LIZLLL
            if (r0 != 0) goto L54
            int r1 = r1 + 1
            goto L42
        L51:
            X.C155000ia.LIZIZ(r7)
        L54:
            r6.LL = r8
            r6.LLILLL = r4
            X.13fE r0 = X.EnumC20065813fE.Main
            java.lang.Object r7 = r8.LJJIJIL(r0, r6)
            if (r7 != r5) goto L24
            return r5
        L61:
            X.05Zr r6 = new X.05Zr
            r6.<init>(r9)
            goto L12
        L67:
            kotlin.Unit r5 = kotlin.Unit.LIZ
            return r5
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1374405Zm.LIZ(X.05ZT, X.05Vn):java.lang.Object");
    }

    public static AnonymousClass0956 LJI(InterfaceC497601wk interfaceC497601wk, C09AE c09ae, Function2 function2) {
        return C23250099c.LIZLLL(interfaceC497601wk, null, C099V.UNDISPATCHED, new C323801Nk(c09ae, function2, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.05aB] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJII(X.C05ZT r8, X.EnumC20065813fE r9, X.InterfaceC1364105Vn<? super X.AbstractC1376805aA> r10) {
        /*
            boolean r0 = r10 instanceof X.C1374705Zp
            if (r0 == 0) goto L22
            r7 = r10
            X.05Zp r7 = (X.C1374705Zp) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L34
            if (r0 != r5) goto L2c
            X.00zU r4 = r7.LL
            goto L28
        L22:
            X.05Zp r7 = new X.05Zp
            r7.<init>(r10)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C1516370pYx -> L5c
            goto L59
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r1)
            X.00zU r4 = new X.00zU
            r4.<init>()
            X.05aB r0 = X.C1376905aB.LIZ
            r4.element = r0
            X.05Zl r0 = r8.getViewConfiguration()     // Catch: X.C1516370pYx -> L5c
            long r2 = r0.LJII()     // Catch: X.C1516370pYx -> L5c
            X.05ZU r1 = new X.05ZU     // Catch: X.C1516370pYx -> L5c
            r0 = 0
            r1.<init>(r9, r4, r0)     // Catch: X.C1516370pYx -> L5c
            r7.LL = r4     // Catch: X.C1516370pYx -> L5c
            r7.LLILLL = r5     // Catch: X.C1516370pYx -> L5c
            java.lang.Object r0 = r8.LJJJJIZL(r2, r1, r7)     // Catch: X.C1516370pYx -> L5c
            if (r0 != r6) goto L59
            return r6
        L59:
            T r0 = r4.element
            return r0
        L5c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.05aC r0 = X.C1377005aC.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1374405Zm.LJII(X.05ZT, X.13fE, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ab -> B:12:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIIIIZZ(X.C05ZT r14, X.EnumC20065813fE r15, X.InterfaceC1364105Vn<? super X.C20066813fO> r16) {
        /*
            r3 = r16
            boolean r0 = r3 instanceof X.C1374805Zq
            if (r0 == 0) goto Lae
            r10 = r3
            X.05Zq r10 = (X.C1374805Zq) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r10.LLILZ = r2
        L14:
            java.lang.Object r4 = r10.LLILLL
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r8 = 0
            r13 = 0
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L48
            if (r0 == r6) goto L58
            if (r0 != r7) goto Lb5
            X.13fE r15 = r10.LLILLJJLI
            X.05ZT r14 = r10.LL
            X.C155000ia.LIZIZ(r4)
        L2d:
            X.13fT r4 = (X.C20067313fT) r4
            java.util.List<X.13fO> r3 = r4.LIZ
            int r2 = r3.size()
            r1 = 0
        L36:
            if (r1 >= r2) goto L4b
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            X.13fO r0 = (X.C20066813fO) r0
            boolean r0 = r0.LIZIZ()
            if (r0 == 0) goto L45
            return r13
        L45:
            int r1 = r1 + 1
            goto L36
        L48:
            X.C155000ia.LIZIZ(r4)
        L4b:
            r10.LL = r14
            r10.LLILLJJLI = r15
            r10.LLILZ = r6
            java.lang.Object r4 = r14.LJJIJIL(r15, r10)
            if (r4 != r9) goto L5f
            return r9
        L58:
            X.13fE r15 = r10.LLILLJJLI
            X.05ZT r14 = r10.LL
            X.C155000ia.LIZIZ(r4)
        L5f:
            X.13fT r4 = (X.C20067313fT) r4
            java.util.List<X.13fO> r3 = r4.LIZ
            int r2 = r3.size()
            r1 = 0
        L68:
            if (r1 >= r2) goto Lbe
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            X.13fO r0 = (X.C20066813fO) r0
            boolean r0 = X.C05ZS.LIZIZ(r0)
            if (r0 != 0) goto L9c
            java.util.List<X.13fO> r11 = r4.LIZ
            int r5 = r11.size()
            r4 = 0
        L7d:
            if (r4 >= r5) goto L9f
            java.lang.Object r12 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r11, r4)
            X.13fO r12 = (X.C20066813fO) r12
            boolean r0 = r12.LIZIZ()
            if (r0 != 0) goto Lbd
            long r2 = r14.LIZ()
            long r0 = r14.LJJLL()
            boolean r0 = X.C05ZS.LIZLLL(r12, r2, r0)
            if (r0 != 0) goto Lbd
            int r4 = r4 + 1
            goto L7d
        L9c:
            int r1 = r1 + 1
            goto L68
        L9f:
            X.13fE r0 = X.EnumC20065813fE.Final
            r10.LL = r14
            r10.LLILLJJLI = r15
            r10.LLILZ = r7
            java.lang.Object r4 = r14.LJJIJIL(r0, r10)
            if (r4 != r9) goto L2d
            return r9
        Lae:
            X.05Zq r10 = new X.05Zq
            r10.<init>(r3)
            goto L14
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lbd:
            return r13
        Lbe:
            java.util.List<X.13fO> r0 = r4.LIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1374405Zm.LJIIIIZZ(X.05ZT, X.13fE, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0063 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(X.C05ZT r10, boolean r11, X.EnumC20065813fE r12, X.InterfaceC1364105Vn<? super X.C20066813fO> r13) {
        /*
            boolean r0 = r13 instanceof X.C1374605Zo
            if (r0 == 0) goto L66
            r8 = r13
            X.05Zo r8 = (X.C1374605Zo) r8
            int r2 = r8.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r8.LLILZIL = r2
        L12:
            java.lang.Object r9 = r8.LLILZ
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZIL
            r6 = 1
            if (r0 == 0) goto L4d
            if (r0 != r6) goto L73
            boolean r11 = r8.LLILLL
            X.13fE r12 = r8.LLILLJJLI
            X.05ZT r10 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L28:
            X.13fT r9 = (X.C20067313fT) r9
            java.util.List<X.13fO> r5 = r9.LIZ
            int r4 = r5.size()
            r3 = 0
            r2 = 0
        L32:
            if (r2 >= r4) goto L6c
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r2)
            X.13fO r1 = (X.C20066813fO) r1
            if (r11 == 0) goto L51
            boolean r0 = r1.LIZIZ()
            if (r0 != 0) goto L57
            boolean r0 = r1.LJII
            if (r0 != 0) goto L57
            boolean r0 = r1.LIZLLL
            if (r0 == 0) goto L57
        L4a:
            int r2 = r2 + 1
            goto L32
        L4d:
            X.C155000ia.LIZIZ(r9)
            goto L57
        L51:
            boolean r0 = X.C05ZS.LIZ(r1)
            if (r0 != 0) goto L4a
        L57:
            r8.LL = r10
            r8.LLILLJJLI = r12
            r8.LLILLL = r11
            r8.LLILZIL = r6
            java.lang.Object r9 = r10.LJJIJIL(r12, r8)
            if (r9 != r7) goto L28
            return r7
        L66:
            X.05Zo r8 = new X.05Zo
            r8.<init>(r13)
            goto L12
        L6c:
            java.util.List<X.13fO> r0 = r9.LIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            return r0
        L73:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1374405Zm.LIZIZ(X.05ZT, boolean, X.13fE, X.05Vn):java.lang.Object");
    }

    public static final Object LIZLLL(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1631620sYq<? super InterfaceC595070NVp, ? super C1378605aS, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, Function1<? super C1378605aS, Unit> function1, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJ = C2296808zG.LJ(new C1375005Zs(interfaceC1369205Xm, interfaceC1631620sYq, function1, new C1697530uH9(interfaceC1369205Xm), null), interfaceC1364105Vn);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    public static final Object LJ(InterfaceC1369205Xm interfaceC1369205Xm, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1, Function1 function12, Function1 function13, InterfaceC1631620sYq interfaceC1631620sYq) {
        Object objLJ = C2296808zG.LJ(new C1374505Zn(interfaceC1369205Xm, null, function12, function1, function13, interfaceC1631620sYq), interfaceC1364105Vn);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }
}
