package X;

/* JADX INFO: renamed from: X.0VkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.persistence.database.AIGCWorkflowRepository", f = "AIGCWorkflowRepository.kt", l = {162}, m = "updateServerTaskId-0E7RQCE")
public final class C806450VkJ extends AbstractC23140094w {
    public C470601sO LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C806320Vk6 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C806450VkJ(C806320Vk6 c806320Vk6, InterfaceC1364105Vn<? super C806450VkJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c806320Vk6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIGCWorkflowRepository@7948.updateServerTaskId$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLL.LJIIJ(null, null, this);
        if (objLJIIJ == C099R.LJFF()) {
            C1C7U.LIZIZ("AIGCWorkflowRepository@7948.updateServerTaskId$1");
            return objLJIIJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIJ);
        C1C7U.LIZIZ("AIGCWorkflowRepository@7948.updateServerTaskId$1");
        return c189200o6M1boximpl;
    }
}
