package X;

import com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput;

/* JADX INFO: renamed from: X.0LLQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.FaceDetectTask", f = "FaceDetectTask.kt", l = {127, 128, 134, 143, 144}, m = "executeFaceDetection")
public final class C0LLQ extends AbstractC23140094w {
    public FaceDetectTaskInput LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0LLP LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LLQ(C0LLP c0llp, InterfaceC1364105Vn<? super C0LLQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0llp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FaceDetectTask@fd4c.executeFaceDetection$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJJJZ = this.LLILZLL.LJJJJZ(null, 0L, this);
        C1C7U.LIZIZ("FaceDetectTask@fd4c.executeFaceDetection$1");
        return objLJJJJZ;
    }
}
