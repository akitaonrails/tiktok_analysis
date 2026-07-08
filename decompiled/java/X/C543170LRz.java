package X;

/* JADX INFO: renamed from: X.0LRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AILiveI2VTask", f = "AILiveI2VTask.kt", l = {88, 89, 96, 97, 98, 99, 100, 101, 102}, m = "run")
public final class C543170LRz extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543160LRy LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543170LRz(C543160LRy c543160LRy, InterfaceC1364105Vn<? super C543170LRz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543160LRy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AILiveI2VTask@dffe.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("AILiveI2VTask@dffe.run$1");
        return objLJFF;
    }
}
