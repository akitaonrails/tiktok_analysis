package X;

/* JADX INFO: renamed from: X.044x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.PdpRefreshRepository", f = "PdpRefreshRepository.kt", l = {140, 165}, m = "realRefreshPdpInfo")
public final class C10401044x extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C10398044u LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10401044x(C10398044u c10398044u, InterfaceC1364105Vn<? super C10401044x> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c10398044u;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpRefreshRepository@da9a.realRefreshPdpInfo$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, null, null, this);
        C1C7U.LIZIZ("PdpRefreshRepository@da9a.realRefreshPdpInfo$1");
        return objLIZ;
    }
}
