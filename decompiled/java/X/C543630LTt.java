package X;

/* JADX INFO: renamed from: X.0LTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTask", f = "GeneralI2VPostProcessingTask.kt", l = {946}, m = "getFailureOutput")
public final class C543630LTt extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543560LTm LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543630LTt(C543560LTm c543560LTm, InterfaceC1364105Vn<? super C543630LTt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543560LTm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VPostProcessingTask@681e.getFailureOutput$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILZ.LJJJLIIL(0, null, this);
        C1C7U.LIZIZ("GeneralI2VPostProcessingTask@681e.getFailureOutput$1");
        return objLJJJLIIL;
    }
}
