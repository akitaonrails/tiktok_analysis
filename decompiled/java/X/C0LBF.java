package X;

/* JADX INFO: renamed from: X.0LBF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.Test", f = "Test.kt", l = {28}, m = "getDraftString")
public final class C0LBF extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0LBE LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LBF(C0LBE c0lbe, InterfaceC1364105Vn<? super C0LBF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0lbe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Test@233b.getDraftString$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("Test@233b.getDraftString$1");
        return objLIZ;
    }
}
