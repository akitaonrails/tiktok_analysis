package X;

/* JADX INFO: renamed from: X.0LWC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.I2VServerTask", f = "I2VServerTask.kt", l = {95, 104}, m = "beginTask")
public final class C0LWC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C544000LVe LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LWC(C544000LVe c544000LVe, InterfaceC1364105Vn<? super C0LWC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c544000LVe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VServerTask@7088.beginTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLJJLI.LJJJJJL(null, this);
        C1C7U.LIZIZ("I2VServerTask@7088.beginTask$1");
        return objLJJJJJL;
    }
}
