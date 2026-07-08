package X;

import com.ss.android.ugc.aweme.aigc.aicreation.models.ImagePreprocessTaskOutput;

/* JADX INFO: renamed from: X.0LS0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AILiveI2VTask", f = "AILiveI2VTask.kt", l = {272, 286, 302, 305, 308}, m = "stepImageUpload")
public final class C0LS0 extends AbstractC23140094w {
    public Object LL;
    public ImagePreprocessTaskOutput LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543160LRy LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LS0(C543160LRy c543160LRy, InterfaceC1364105Vn<? super C0LS0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543160LRy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILiveI2VTask@dffe.stepImageUpload$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJLL = this.LLILZ.LJJJLL(null, null, this);
        C1C7U.LIZIZ("AILiveI2VTask@dffe.stepImageUpload$1");
        return objLJJJLL;
    }
}
