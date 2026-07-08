package X;

/* JADX INFO: renamed from: X.0LS5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AILiveI2VTask", f = "AILiveI2VTask.kt", l = {589, 455, 456}, m = "finishTask")
public final class C0LS5 extends AbstractC23140094w {
    public InterfaceC383701eN LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543160LRy LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LS5(C543160LRy c543160LRy, InterfaceC1364105Vn<? super C0LS5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543160LRy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILiveI2VTask@dffe.finishTask$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLI = this.LLILLL.LJJJJLI(this);
        C1C7U.LIZIZ("AILiveI2VTask@dffe.finishTask$1");
        return objLJJJJLI;
    }
}
