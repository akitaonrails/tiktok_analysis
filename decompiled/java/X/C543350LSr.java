package X;

/* JADX INFO: renamed from: X.0LSr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.I2VTask", f = "I2VTask.kt", l = {349, 350}, m = "cancel")
public final class C543350LSr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C543210LSd LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543350LSr(C543210LSd c543210LSd, InterfaceC1364105Vn<? super C543350LSr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c543210LSd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VTask@a318.cancel$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLJJLI.LJIIJ(this);
        C1C7U.LIZIZ("I2VTask@a318.cancel$1");
        return objLJIIJ;
    }
}
