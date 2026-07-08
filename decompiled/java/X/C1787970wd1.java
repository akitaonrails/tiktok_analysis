package X;

/* JADX INFO: renamed from: X.0wd1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.VerifyOrderAction", f = "VerifyOrderAction.kt", l = {49}, m = "perform")
public final class C1787970wd1 extends AbstractC23140094w {
    public C1787830wcn LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1787960wd0 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787970wd1(C1787960wd0 c1787960wd0, InterfaceC1364105Vn<? super C1787970wd1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1787960wd0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C1787950wcz {
        C1C7U.LIZ("VerifyOrderAction@dff2.perform$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("VerifyOrderAction@dff2.perform$1");
        return objLIZ;
    }
}
