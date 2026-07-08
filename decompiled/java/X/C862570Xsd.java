package X;

/* JADX INFO: renamed from: X.0Xsd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.message.media.usecase.GetMediaStatusUseCase", f = "GetMediaStatusUseCase.kt", l = {39}, m = "fetchFromRemote-gIAlu-s")
public final class C862570Xsd extends AbstractC23140094w {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C0YH8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862570Xsd(C0YH8 c0yh8, InterfaceC1364105Vn<? super C862570Xsd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.this$0 = c0yh8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetMediaStatusUseCase@7e2c.fetchFromRemote$1");
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objLIZ = this.this$0.LIZ(null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("GetMediaStatusUseCase@7e2c.fetchFromRemote$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("GetMediaStatusUseCase@7e2c.fetchFromRemote$1");
        return c189200o6M1boximpl;
    }
}
