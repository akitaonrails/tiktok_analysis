package X;

/* JADX INFO: renamed from: X.0LrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowEventHub", f = "AIGCWorkflowEventHub.kt", l = {369, 371, 372}, m = "workerLoop")
public final class C556100LrU extends AbstractC23140094w {
    public InterfaceC824740WWy LL;
    public InterfaceC1902607cm LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C556080LrS LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556100LrU(C556080LrS c556080LrS, InterfaceC1364105Vn<? super C556100LrU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c556080LrS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowEventHub@14b7.workerLoop$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(this);
        C1C7U.LIZIZ("AIGCWorkflowEventHub@14b7.workerLoop$1");
        return objLJFF;
    }
}
