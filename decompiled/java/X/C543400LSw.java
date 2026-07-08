package X;

/* JADX INFO: renamed from: X.0LSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.TransitionFrameTask", f = "TransitionFrameTask.kt", l = {324, 244}, m = "finishTask")
public final class C543400LSw extends AbstractC23140094w {
    public InterfaceC383701eN LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543200LSc LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543400LSw(C543200LSc c543200LSc, InterfaceC1364105Vn<? super C543400LSw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543200LSc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TransitionFrameTask@2e86.finishTask$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLL.LJJJJLL(this);
        C1C7U.LIZIZ("TransitionFrameTask@2e86.finishTask$1");
        return objLJJJJLL;
    }
}
