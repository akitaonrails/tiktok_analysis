package X;

/* JADX INFO: renamed from: X.0LSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.I2VTask", f = "I2VTask.kt", l = {403, 323}, m = "finishTask")
public final class C543430LSz extends AbstractC23140094w {
    public InterfaceC383701eN LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C543210LSd LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543430LSz(C543210LSd c543210LSd, InterfaceC1364105Vn<? super C543430LSz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c543210LSd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("I2VTask@a318.finishTask$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJLL = this.LLILLL.LJJJJLL(this);
        C1C7U.LIZIZ("I2VTask@a318.finishTask$1");
        return objLJJJJLL;
    }
}
