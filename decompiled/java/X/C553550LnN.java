package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LnN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.generate.component.AIPortraitWorkflowComponent$observeArtifact$1", f = "AIPortraitWorkflowComponent.kt", l = {126, 128}, m = "invokeSuspend")
public final class C553550LnN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C553520LnK LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553550LnN(C553520LnK c553520LnK, String str, InterfaceC1364105Vn<? super C553550LnN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c553520LnK;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553550LnN(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "AIPortraitWorkflowComponent@1410.observeArtifact$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L1c
            if (r0 == r3) goto L37
            if (r0 != r5) goto L5a
            X.C155000ia.LIZIZ(r9)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r9)
            X.0LnK r0 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r2 = r0.X1()
            if (r2 == 0) goto L16
            java.lang.String r1 = r8.LLILLL
            X.0Llu r0 = X.C552640Llu.INSTANCE
            r8.LL = r3
            X.01Wa r9 = r2.LJI(r1, r0)
            if (r9 != r6) goto L3a
            X.C1C7U.LIZIZ(r7)
            return r6
        L37:
            X.C155000ia.LIZIZ(r9)
        L3a:
            X.01Wa r9 = (X.InterfaceC346201Wa) r9
            if (r9 == 0) goto L16
            X.01Wa r4 = X.C09IC.LJIILL(r9)
            if (r4 == 0) goto L16
            Y.AgS100S1100000_8 r3 = new Y.AgS100S1100000_8
            java.lang.String r2 = r8.LLILLL
            X.0LnK r1 = r8.LLILLJJLI
            r0 = 0
            r3.<init>(r1, r2, r0)
            r8.LL = r5
            java.lang.Object r0 = r4.collect(r3, r8)
            if (r0 != r6) goto L16
            X.C1C7U.LIZIZ(r7)
            return r6
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C553550LnN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
