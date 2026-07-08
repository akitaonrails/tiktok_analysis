package X;

/* JADX INFO: renamed from: X.1DpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.PersistenceWorkflowCenter", f = "PersistenceWorkflowCenter.kt", l = {156}, m = "getServerTaskId")
public final class C2267721DpS extends AbstractC23140094w {
    public C335901Sb LL;
    public Object LLILLJJLI;
    public C013C LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C2267651DpL LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2267721DpS(C2267651DpL c2267651DpL, InterfaceC1364105Vn<? super C2267721DpS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c2267651DpL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PersistenceWorkflowCenter@73ad.getServerTaskId$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZLL.LJFF(null, this);
        C1C7U.LIZIZ("PersistenceWorkflowCenter@73ad.getServerTaskId$1");
        return objLJFF;
    }
}
