package X;

/* JADX INFO: renamed from: X.0W2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.api.StorageApiService", f = "StorageApi.kt", l = {60, 64, 65}, m = "getPagingResponse")
public final class C816900W2u extends AbstractC23140094w {
    public C816880W2s LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C816890W2t LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816900W2u(C816890W2t c816890W2t, InterfaceC1364105Vn<? super C816900W2u> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c816890W2t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageApiService@850a.getPagingResponse$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, 0, 0, this);
        C1C7U.LIZIZ("StorageApiService@850a.getPagingResponse$1");
        return objLIZIZ;
    }
}
