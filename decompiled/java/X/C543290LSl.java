package X;

/* JADX INFO: renamed from: X.0LSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.TransitionFrameTask", f = "TransitionFrameTask.kt", l = {55, 56, 63, 67, 68, 69, 70, 71}, m = "run")
public final class C543290LSl extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543200LSc LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543290LSl(C543200LSc c543200LSc, InterfaceC1364105Vn<? super C543290LSl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543200LSc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TransitionFrameTask@2e86.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("TransitionFrameTask@2e86.run$1");
        return objLJFF;
    }
}
