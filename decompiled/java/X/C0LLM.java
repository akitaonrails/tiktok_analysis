package X;

import com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput;

/* JADX INFO: renamed from: X.0LLM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.FaceDetectTask", f = "FaceDetectTask.kt", l = {115, 119, 121}, m = "run")
public final class C0LLM extends AbstractC23140094w {
    public FaceDetectTaskInput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LLP LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LLM(C0LLP c0llp, InterfaceC1364105Vn<? super C0LLM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0llp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FaceDetectTask@fd4c.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("FaceDetectTask@fd4c.run$1");
        return objLJFF;
    }
}
