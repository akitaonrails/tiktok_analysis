package X;

/* JADX INFO: renamed from: X.0YQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.bridge.init.FetchVideoLinkInterceptor", f = "FetchVideoLinkInterceptor.kt", l = {22}, m = "execute")
public final class C0YQ8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YQ7 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YQ8(C0YQ7 c0yq7, InterfaceC1364105Vn<? super C0YQ8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0yq7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FetchVideoLinkInterceptor@10e4.execute$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = LIZ(null, this);
        C1C7U.LIZIZ("FetchVideoLinkInterceptor@10e4.execute$1");
        return objLIZ;
    }
}
