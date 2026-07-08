package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05YV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
public final class C05YV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YW LLILLJJLI;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLL;
    public final /* synthetic */ C05YC<Object> LLILZ;
    public final /* synthetic */ Object LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05YV(C05YW c05yw, InterfaceC346201Wa<Object> interfaceC346201Wa, C05YC<Object> c05yc, Object obj, InterfaceC1364105Vn<? super C05YV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yw;
        this.LLILLL = interfaceC346201Wa;
        this.LLILZ = c05yc;
        this.LLILZIL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05YV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[RETURN] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r7 = 4
            r2 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1c
            if (r0 == r3) goto L84
            if (r0 == r4) goto L52
            if (r0 == r2) goto L84
            if (r0 == r7) goto L84
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.C155000ia.LIZIZ(r9)
            X.05YW r1 = r8.LLILLJJLI
            X.05Yd r0 = X.C05YW.LIZ
            r0.getClass()
            X.05YZ r0 = X.C1370905Yd.LIZIZ
            if (r1 != r0) goto L37
            X.01Wa<java.lang.Object> r1 = r8.LLILLL
            X.05YC<java.lang.Object> r0 = r8.LLILZ
            r8.LL = r3
            java.lang.Object r0 = r1.collect(r0, r8)
            if (r0 != r5) goto L87
            return r5
        L37:
            X.05YW r1 = r8.LLILLJJLI
            X.05Yh r0 = X.C1370905Yd.LIZJ
            r6 = 0
            if (r1 != r0) goto L62
            X.05YC<java.lang.Object> r0 = r8.LLILZ
            X.1DDv r1 = r0.LIZLLL()
            X.059d r0 = new X.059d
            r0.<init>(r6)
            r8.LL = r4
            java.lang.Object r0 = X.C09IC.LJIJ(r1, r8, r0)
            if (r0 != r5) goto L55
            return r5
        L52:
            X.C155000ia.LIZIZ(r9)
        L55:
            X.01Wa<java.lang.Object> r1 = r8.LLILLL
            X.05YC<java.lang.Object> r0 = r8.LLILZ
            r8.LL = r2
            java.lang.Object r0 = r1.collect(r0, r8)
            if (r0 != r5) goto L87
            return r5
        L62:
            X.05YC<java.lang.Object> r0 = r8.LLILZ
            X.1DDv r0 = r0.LIZLLL()
            X.01Wa r0 = r1.LIZ(r0)
            X.01Wa r4 = X.C09IC.LJIILL(r0)
            X.05YU r3 = new X.05YU
            X.01Wa<java.lang.Object> r2 = r8.LLILLL
            X.05YC<java.lang.Object> r1 = r8.LLILZ
            java.lang.Object r0 = r8.LLILZIL
            r3.<init>(r2, r1, r0, r6)
            r8.LL = r7
            java.lang.Object r0 = X.C09IC.LJII(r4, r8, r3)
            if (r0 != r5) goto L87
            return r5
        L84:
            X.C155000ia.LIZIZ(r9)
        L87:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05YV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
