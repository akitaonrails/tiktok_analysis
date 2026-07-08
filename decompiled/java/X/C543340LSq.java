package X;

/* JADX INFO: renamed from: X.0LSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.TransitionFrameTask", f = "TransitionFrameTask.kt", l = {265}, m = "stop")
public final class C543340LSq extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543200LSc LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543340LSq(C543200LSc c543200LSc, InterfaceC1364105Vn<? super C543340LSq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543200LSc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TransitionFrameTask@2e86.stop$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("TransitionFrameTask@2e86.stop$1");
        return objLIZIZ;
    }
}
