package X;

/* JADX INFO: renamed from: X.0LTL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.RefreshFrameTask", f = "RefreshFrameTask.kt", l = {141, 150}, m = "beginTask")
public final class C0LTL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LTJ LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LTL(C0LTJ c0ltj, InterfaceC1364105Vn<? super C0LTL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0ltj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RefreshFrameTask@9a30.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("RefreshFrameTask@9a30.beginTask$1");
        return objLJJJJJL;
    }
}
