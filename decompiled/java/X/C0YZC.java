package X;

/* JADX INFO: renamed from: X.0YZC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.pigeon.PigeonPaasBridge", f = "PigeonPaasBridge.kt", l = {38}, m = "requestPigeonAuthInfo")
public final class C0YZC extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0YZD LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YZC(C0YZD c0yzd, InterfaceC1364105Vn<? super C0YZC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0yzd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonPaasBridge@84dd.requestPigeonAuthInfo$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(false, this);
        C1C7U.LIZIZ("PigeonPaasBridge@84dd.requestPigeonAuthInfo$1");
        return objLIZIZ;
    }
}
