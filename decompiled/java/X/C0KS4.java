package X;

/* JADX INFO: renamed from: X.0KS4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.impl.resusbcribe.FansResubscribeStrategy", f = "FansResubscribeStrategy.kt", l = {90}, m = "tryRecoverContract")
public final class C0KS4 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0KS3 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KS4(C0KS3 c0ks3, InterfaceC1364105Vn<? super C0KS4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0ks3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FansResubscribeStrategy@14ed.tryRecoverContract$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("FansResubscribeStrategy@14ed.tryRecoverContract$1");
        return objLIZIZ;
    }
}
