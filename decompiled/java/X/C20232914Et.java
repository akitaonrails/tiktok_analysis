package X;

import com.ss.android.ugc.aweme.tako.TakoServiceImpl;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS263S0000000_23;

/* JADX INFO: renamed from: X.14Et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20232914Et {
    public final synchronized void LIZJ() {
        if (TakoServiceImpl.LJIILIIL) {
            return;
        }
        LJII();
        LJI();
        LJFF();
        C844470XAv.LIZ.getClass();
        if (C2162308dZ.LJI(C844470XAv.LIZ())) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1615306Ud(null), 2);
        }
        AFwS263S0000000_23 aFwS263S0000000_23 = AFwS263S0000000_23.get$arr$(44);
        if (!C14FH.LIZ) {
            aFwS263S0000000_23.invoke(C1503760pEc.LIZ);
            C14FH.LIZ = true;
        }
        TakoServiceImpl.LJIILIIL = true;
    }

    public static void LIZIZ() {
        if (TakoServiceImpl.LJIILL) {
            return;
        }
        C844470XAv.LIZ.getClass();
        if (C2162308dZ.LJI(C844470XAv.LIZ())) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1615306Ud(null), 2);
        }
        LJII();
        LJI();
        LJFF();
        TakoServiceImpl.LJIILL = true;
    }

    public static void LJFF() {
        if (TakoServiceImpl.LJIIJ) {
            return;
        }
        C1503830pEj c1503830pEj = C1503830pEj.LIZ;
        c1503830pEj.getClass();
        boolean z = C1503830pEj.LIZIZ;
        c1503830pEj.getClass();
        C1503830pEj.LIZ("stage_init", null, true, z);
        if (C07G3.LIZ() != 2) {
            C01GW c01gw = C1503800pEg.LIZ;
            C1503800pEg.LJFF = (List) C1503740pEa.LIZ.getValue();
            boolean z2 = C1503830pEj.LIZIZ;
            c1503830pEj.getClass();
            C1503830pEj.LIZ("stage_create_api", null, true, z2);
        }
        TakoServiceImpl.LJIIJ = true;
    }

    public static void LJI() {
        if (TakoServiceImpl.LJIIIZ) {
            return;
        }
        C1503830pEj c1503830pEj = C1503830pEj.LIZ;
        c1503830pEj.getClass();
        boolean z = C1503830pEj.LIZIZ;
        c1503830pEj.getClass();
        C1503830pEj.LIZ("stage_init", null, true, z);
        if (C07G3.LIZ() != 2) {
            C01GW c01gw = C1503800pEg.LIZ;
            C1503800pEg.LJ = (TakoApi) C0O58.LIZIZ.getValue();
            boolean z2 = C1503830pEj.LIZIZ;
            c1503830pEj.getClass();
            C1503830pEj.LIZ("stage_create_api", null, true, z2);
        }
        TakoServiceImpl.LJIIIZ = true;
    }

    public static void LJII() {
        if (TakoServiceImpl.LJIILJJIL) {
            return;
        }
        C1503830pEj c1503830pEj = C1503830pEj.LIZ;
        c1503830pEj.getClass();
        boolean z = C1503830pEj.LIZIZ;
        c1503830pEj.getClass();
        C1503830pEj.LIZ("stage_init", null, false, z);
        if (C07G3.LIZ() != 2) {
            C01GW c01gw = C1503800pEg.LIZ;
            C1503800pEg.LIZLLL = (TakoApi) C0O58.LIZ.getValue();
            boolean z2 = C1503830pEj.LIZIZ;
            c1503830pEj.getClass();
            C1503830pEj.LIZ("stage_create_api", null, false, z2);
        }
        TakoServiceImpl.LJIILJJIL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r33) {
        /*
            r32 = this;
            r4 = r33
            boolean r0 = r4 instanceof X.C14F1
            if (r0 == 0) goto L7f
            r0 = r4
            X.14F1 r0 = (X.C14F1) r0
            int r3 = r0.LLILLL
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L7f
            int r3 = r3 - r2
            r0.LLILLL = r3
        L14:
            java.lang.Object r3 = r0.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r2 = r0.LLILLL
            r13 = 1
            if (r2 == 0) goto L27
            if (r2 != r13) goto L87
            X.C155000ia.LIZIZ(r3)
        L24:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L27:
            X.C155000ia.LIZIZ(r3)
            X.0yag r3 = X.C1863400yag.LIZ
            X.0XAv r2 = X.C844470XAv.LIZ
            r2.getClass()
            android.content.Context r4 = X.C844470XAv.LIZ()
            r2 = 42
            kotlin.jvm.internal.AFwS208S0000000_20 r5 = kotlin.jvm.internal.AFwS208S0000000_20.get$arr$(r2)
            r6 = 0
            r11 = 1
            r24 = 1
            r14 = 0
            r2 = 124(0x7c, float:1.74E-43)
            kotlin.jvm.internal.AFwS274S0000000_30 r20 = kotlin.jvm.internal.AFwS274S0000000_30.get$arr$(r2)
            r23 = 326908(0x4fcfc, float:4.58096E-40)
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r6
            r19 = r6
            r21 = r13
            r22 = r6
            X.0yae r22 = X.C1863400yag.LIZIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r26 = 8
            r2 = 125(0x7d, float:1.75E-43)
            kotlin.jvm.internal.AFwS274S0000000_30 r27 = kotlin.jvm.internal.AFwS274S0000000_30.get$arr$(r2)
            r31 = 201(0xc9, float:2.82E-43)
            r0.getClass()
            r0.LLILLL = r13
            r23 = r14
            r25 = r14
            r28 = r14
            r29 = r6
            r30 = r0
            java.lang.Object r0 = X.C1863380yae.LJIJJ(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            if (r0 != r1) goto L24
            return r1
        L7f:
            X.14F1 r0 = new X.14F1
            r1 = r32
            r0.<init>(r1, r4)
            goto L14
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20232914Et.LIZ(X.05Vn):java.lang.Object");
    }

    public final Object LJ(EnumC19389610tS enumC19389610tS, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C14FL.LIZ();
        if (C14FR.LIZ.LJIIIIZZ()) {
            Object objLIZLLL = LIZLLL(1L, 1, enumC19389610tS, z, interfaceC1364105Vn);
            if (objLIZLLL == C099R.LJFF()) {
                return objLIZLLL;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(long r33, int r35, X.EnumC19389610tS r36, boolean r37, X.InterfaceC1364105Vn<? super kotlin.Unit> r38) {
        /*
            r32 = this;
            r4 = r38
            boolean r0 = r4 instanceof X.C14F0
            if (r0 == 0) goto Lb1
            r3 = r4
            X.14F0 r3 = (X.C14F0) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb1
            int r2 = r2 - r1
            r3.LLILLL = r2
        L14:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto Lba
            X.C155000ia.LIZIZ(r4)
        L24:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L27:
            X.C155000ia.LIZIZ(r4)
            X.0CoI r0 = X.C324800CoI.LIZ
            r0.getClass()
            boolean r0 = X.C324800CoI.LIZ()
            if (r0 == 0) goto Laf
            X.01GW r0 = X.C1819607As.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r5 = r36
            if (r4 == r1) goto Laa
            r0 = 2
            if (r4 != r0) goto Laf
            X.10tS r0 = X.EnumC19389610tS.FEED_ICON
            if (r5 == r0) goto L50
            X.10tS r0 = X.EnumC19389610tS.LAZY_INIT_TASK
            if (r5 != r0) goto Laf
        L50:
            r4 = 1
        L51:
            X.0yag r5 = X.C1863400yag.LIZ
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r6 = X.C844470XAv.LIZ()
            r0 = 43
            kotlin.jvm.internal.AFwS208S0000000_20 r7 = kotlin.jvm.internal.AFwS208S0000000_20.get$arr$(r0)
            r8 = 0
            r16 = 0
            r0 = 126(0x7e, float:1.77E-43)
            kotlin.jvm.internal.AFwS274S0000000_30 r22 = kotlin.jvm.internal.AFwS274S0000000_30.get$arr$(r0)
            r26 = 1
            r25 = 326908(0x4fcfc, float:4.58096E-40)
            r15 = r35
            r13 = r33
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r17 = r16
            r18 = r16
            r19 = r16
            r20 = r8
            r21 = r8
            r23 = r1
            r24 = r8
            X.0yae r22 = X.C1863400yag.LIZIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r23 = r4 ^ 1
            r0 = 127(0x7f, float:1.78E-43)
            kotlin.jvm.internal.AFwS274S0000000_30 r27 = kotlin.jvm.internal.AFwS274S0000000_30.get$arr$(r0)
            r31 = 201(0xc9, float:2.82E-43)
            r3.getClass()
            r3.LLILLL = r1
            r24 = r37
            r25 = r16
            r28 = r16
            r29 = r8
            r30 = r3
            java.lang.Object r0 = X.C1863380yae.LJIJJ(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            if (r0 != r2) goto L24
            return r2
        Laa:
            X.10tS r0 = X.EnumC19389610tS.FEED_ICON
            if (r5 != r0) goto Laf
            goto L50
        Laf:
            r4 = 0
            goto L51
        Lb1:
            X.14F0 r3 = new X.14F0
            r0 = r32
            r3.<init>(r0, r4)
            goto L14
        Lba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20232914Et.LIZLLL(long, int, X.10tS, boolean, X.05Vn):java.lang.Object");
    }
}
