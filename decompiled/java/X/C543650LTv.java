package X;

/* JADX INFO: renamed from: X.0LTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTask", f = "GeneralI2VPostProcessingTask.kt", l = {932, 938}, m = "logTaskFailure")
public final class C543650LTv extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543560LTm LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543650LTv(C543560LTm c543560LTm, InterfaceC1364105Vn<? super C543650LTv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543560LTm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VPostProcessingTask@681e.logTaskFailure$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJZ = this.LLILLJJLI.LJJJZ(0, null, this);
        C1C7U.LIZIZ("GeneralI2VPostProcessingTask@681e.logTaskFailure$1");
        return objLJJJZ;
    }
}
