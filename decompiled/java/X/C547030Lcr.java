package X;

/* JADX INFO: renamed from: X.0Lcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.workflowmanager.lifecycle.resourcemanager.GlobalAsyncTaskHandlerWrapperHandle", f = "GlobalAsyncTaskHandlerWrapperHandle.kt", l = {22, 26}, m = "acquire")
public final class C547030Lcr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C547020Lcq LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C547030Lcr(C547020Lcq c547020Lcq, InterfaceC1364105Vn<? super C547030Lcr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c547020Lcq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GlobalAsyncTaskHandlerWrapperHandle@aac5.acquire$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("GlobalAsyncTaskHandlerWrapperHandle@aac5.acquire$1");
        return objLIZ;
    }
}
