package X;

/* JADX INFO: renamed from: X.0gcx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.osp.PoiOrderStatusPollingManager", f = "PoiOrderStatusPollingManager.kt", l = {28, 46}, m = "queryOrderStatus")
public final class C1172890gcx extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1172880gcw LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172890gcx(C1172880gcw c1172880gcw, InterfaceC1364105Vn<? super C1172890gcx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1172880gcw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiOrderStatusPollingManager@807e.queryOrderStatus$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(this);
        C1C7U.LIZIZ("PoiOrderStatusPollingManager@807e.queryOrderStatus$1");
        return objLIZ;
    }
}
