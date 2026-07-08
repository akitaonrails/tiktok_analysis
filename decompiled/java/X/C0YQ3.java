package X;

/* JADX INFO: renamed from: X.0YQ3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.bridge.init.B2CLandingPreSendInterceptor", f = "B2CLandingPreSendInterceptor.kt", l = {27}, m = "execute")
public final class C0YQ3 extends AbstractC23140094w {
    public C873720YPi LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0YQ2 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YQ3(C0YQ2 c0yq2, InterfaceC1364105Vn<? super C0YQ3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0yq2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("B2CLandingPreSendInterceptor@8810.execute$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = LIZ(null, this);
        C1C7U.LIZIZ("B2CLandingPreSendInterceptor@8810.execute$1");
        return objLIZ;
    }
}
