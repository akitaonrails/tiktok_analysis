package X;

/* JADX INFO: renamed from: X.0LT2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.TransitionFrameTask", f = "TransitionFrameTask.kt", l = {139, 141}, m = "beginTask")
public final class C0LT2 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543200LSc LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LT2(C543200LSc c543200LSc, InterfaceC1364105Vn<? super C0LT2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543200LSc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TransitionFrameTask@2e86.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(this);
        C1C7U.LIZIZ("TransitionFrameTask@2e86.beginTask$1");
        return objLJJJJJL;
    }
}
