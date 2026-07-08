package X;

/* JADX INFO: renamed from: X.0LSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.TransitionFrameTask", f = "TransitionFrameTask.kt", l = {200, 210, 224, 227, 230, 231}, m = "stepDownload")
public final class C543410LSx extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543200LSc LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543410LSx(C543200LSc c543200LSc, InterfaceC1364105Vn<? super C543410LSx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543200LSc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TransitionFrameTask@2e86.stepDownload$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJZ = this.LLILLL.LJJJJZ(null, this);
        C1C7U.LIZIZ("TransitionFrameTask@2e86.stepDownload$1");
        return objLJJJJZ;
    }
}
