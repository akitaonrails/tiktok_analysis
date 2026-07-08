package X;

/* JADX INFO: renamed from: X.0fdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.base.RechargeTaskManager", f = "RechargeTaskManager.kt", l = {321, 325}, m = "preloadPackageList$liverevenue_impl_release")
public final class C1134890fdf extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1134860fdc LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134890fdf(C1134860fdc c1134860fdc, InterfaceC1364105Vn<? super C1134890fdf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1134860fdc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargeTaskManager@c4b3.preloadPackageList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLJJLI.LJIIJ(0, this);
        C1C7U.LIZIZ("RechargeTaskManager@c4b3.preloadPackageList$1");
        return objLJIIJ;
    }
}
