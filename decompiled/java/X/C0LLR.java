package X;

/* JADX INFO: renamed from: X.0LLR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.FaceDetectTask", f = "FaceDetectTask.kt", l = {183}, m = "ensureModelsAvailable")
public final class C0LLR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LLP LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LLR(C0LLP c0llp, InterfaceC1364105Vn<? super C0LLR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0llp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FaceDetectTask@fd4c.ensureModelsAvailable$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLJJLI.LJJJJLL(this);
        C1C7U.LIZIZ("FaceDetectTask@fd4c.ensureModelsAvailable$1");
        return objLJJJJLL;
    }
}
