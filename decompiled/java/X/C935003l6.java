package X;

/* JADX INFO: renamed from: X.03l6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.FlowTypeRepository", f = "FlowTypeRepository.kt", l = {92}, m = "fetchFlowType")
public final class C935003l6 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C934703l3 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C935003l6(C934703l3 c934703l3, InterfaceC1364105Vn<? super C935003l6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c934703l3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowTypeRepository@cc0d.fetchFlowType$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("FlowTypeRepository@cc0d.fetchFlowType$1");
        return objLIZIZ;
    }
}
