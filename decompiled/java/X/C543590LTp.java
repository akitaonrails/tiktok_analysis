package X;

/* JADX INFO: renamed from: X.0LTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTask", f = "GeneralI2VPostProcessingTask.kt", l = {152, 155, 157}, m = "run")
public final class C543590LTp extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543560LTm LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543590LTp(C543560LTm c543560LTm, InterfaceC1364105Vn<? super C543590LTp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543560LTm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VPostProcessingTask@681e.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("GeneralI2VPostProcessingTask@681e.run$1");
        return objLJFF;
    }
}
