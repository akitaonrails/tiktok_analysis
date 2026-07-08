package X;

/* JADX INFO: renamed from: X.0wcq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.UploadTokenAction", f = "UploadTokenAction.kt", l = {65, 80}, m = "perform")
public final class C1787860wcq extends AbstractC23140094w {
    public C1787830wcn LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1787850wcp LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787860wcq(C1787850wcp c1787850wcp, InterfaceC1364105Vn<? super C1787860wcq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1787850wcp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C1787950wcz {
        C1C7U.LIZ("UploadTokenAction@17c2.perform$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, this);
        C1C7U.LIZIZ("UploadTokenAction@17c2.perform$1");
        return objLIZ;
    }
}
