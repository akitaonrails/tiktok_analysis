package X;

/* JADX INFO: renamed from: X.0LRI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VTask", f = "GeneralI2VTask.kt", l = {421, 423}, m = "cancel")
public final class C0LRI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LRF LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LRI(C0LRF c0lrf, InterfaceC1364105Vn<? super C0LRI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lrf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VTask@5977.cancel$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLJJLI.LJIIJ(this);
        C1C7U.LIZIZ("GeneralI2VTask@5977.cancel$1");
        return objLJIIJ;
    }
}
