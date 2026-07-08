package X;

/* JADX INFO: renamed from: X.0W32, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.spi.OpenServiceImpl", f = "OpenServiceImpl.kt", l = {22, 22}, m = "getUserList")
public final class C0W32 extends AbstractC23140094w {
    public EnumC816850W2p LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C816950W2z LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W32(C816950W2z c816950W2z, InterfaceC1364105Vn<? super C0W32> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c816950W2z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenServiceImpl@fc5a.getUserList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("OpenServiceImpl@fc5a.getUserList$1");
        return objLIZIZ;
    }
}
