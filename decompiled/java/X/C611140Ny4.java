package X;

/* JADX INFO: renamed from: X.0Ny4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.SkylightLiveStoreServiceImpl", f = "SkylightLiveStoreServiceImpl.kt", l = {139}, m = "batchRead")
public final class C611140Ny4 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C611110Ny1 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611140Ny4(C611110Ny1 c611110Ny1, InterfaceC1364105Vn<? super C611140Ny4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c611110Ny1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightLiveStoreServiceImpl@14e4.batchRead$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("SkylightLiveStoreServiceImpl@14e4.batchRead$1");
        return objLIZ;
    }
}
