package X;

import com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput;

/* JADX INFO: renamed from: X.0LLO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.FaceDetectTask", f = "FaceDetectTask.kt", l = {402}, m = "handleGenericError")
public final class C0LLO extends AbstractC23140094w {
    public FaceDetectTaskInput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LLP LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LLO(C0LLP c0llp, InterfaceC1364105Vn<? super C0LLO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0llp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FaceDetectTask@fd4c.handleGenericError$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILLL.LJJJLIIL(null, null, this);
        C1C7U.LIZIZ("FaceDetectTask@fd4c.handleGenericError$1");
        return objLJJJLIIL;
    }
}
