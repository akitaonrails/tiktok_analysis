package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.generate.component.AIPortraitWorkflowComponent$submitWorkflow$1", f = "AIPortraitWorkflowComponent.kt", l = {107}, m = "invokeSuspend")
public final class C553540LnM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C553520LnK LL;
    public int LLILLJJLI;
    public final /* synthetic */ C553520LnK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553540LnM(C553520LnK c553520LnK, InterfaceC1364105Vn<? super C553540LnM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c553520LnK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C553540LnM(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "AIPortraitWorkflowComponent@1410.submitWorkflow$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L67
            X.0LnK r3 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L15:
            java.lang.String r8 = (java.lang.String) r8
        L17:
            r3.LLIZ = r8
            X.0LnK r0 = r7.LLILLL
            X.0LnR r1 = r0.LLILZLL
            if (r1 == 0) goto L24
            java.lang.String r0 = r0.LLIZ
            r1.LJIIJ(r0)
        L24:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r8)
            X.0LnK r0 = r7.LLILLL
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r2 = r0.o2()
            r8 = 0
            if (r2 != 0) goto L45
            X.0LnK r0 = r7.LLILLL
            X.0LnR r0 = r0.LLILZLL
            if (r0 == 0) goto L3f
            r0.LJIIJ(r8)
        L3f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L45:
            X.0LnK r3 = r7.LLILLL
            com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService r1 = r3.G2()
            if (r1 == 0) goto L17
            X.0LnK r0 = r7.LLILLL
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.w2()
            if (r0 == 0) goto L59
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet r0 = r0.aigcBusinessModel
            com.ss.android.ugc.aweme.portrait.model.AIPortraitModel r8 = r0.aiPortraitModel
        L59:
            r7.LL = r3
            r7.LLILLJJLI = r4
            java.lang.Object r8 = r1.LJ(r8, r2, r7)
            if (r8 != r5) goto L15
            X.C1C7U.LIZIZ(r6)
            return r5
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C553540LnM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
