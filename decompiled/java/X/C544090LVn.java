package X;

/* JADX INFO: renamed from: X.0LVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.I2VServerTask", f = "I2VServerTask.kt", l = {52, 53, 56, 57, 58, 59}, m = "run")
public final class C544090LVn extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C544000LVe LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544090LVn(C544000LVe c544000LVe, InterfaceC1364105Vn<? super C544090LVn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c544000LVe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VServerTask@7088.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("I2VServerTask@7088.run$1");
        return objLJFF;
    }
}
