package X;

/* JADX INFO: renamed from: X.1DpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.PersistenceWorkflowCenter", f = "PersistenceWorkflowCenter.kt", l = {41}, m = "serializeWorkflow")
public final class C2267671DpN extends AbstractC23140094w {
    public C335901Sb LL;
    public Object LLILLJJLI;
    public C013C LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C2267651DpL LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2267671DpN(C2267651DpL c2267651DpL, InterfaceC1364105Vn<? super C2267671DpN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c2267651DpL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PersistenceWorkflowCenter@73ad.serializeWorkflow$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILZLL.LJIIL(null, null, this);
        C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.serializeWorkflow$1");
        return objLJIIL;
    }
}
