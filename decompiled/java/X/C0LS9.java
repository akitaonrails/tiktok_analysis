package X;

/* JADX INFO: renamed from: X.0LS9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AILiveI2VTask", f = "AILiveI2VTask.kt", l = {496, 507}, m = "refreshProgress")
public final class C0LS9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543160LRy LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LS9(C543160LRy c543160LRy, InterfaceC1364105Vn<? super C0LS9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543160LRy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILiveI2VTask@dffe.refreshProgress$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJZ = this.LLILLJJLI.LJJJJZ(this);
        C1C7U.LIZIZ("AILiveI2VTask@dffe.refreshProgress$1");
        return objLJJJJZ;
    }
}
