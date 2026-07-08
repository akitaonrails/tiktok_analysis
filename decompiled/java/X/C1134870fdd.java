package X;

/* JADX INFO: renamed from: X.0fdd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.base.RechargeTaskManager", f = "RechargeTaskManager.kt", l = {267}, m = "getClosestRechargePackage")
public final class C1134870fdd extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1134860fdc LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134870fdd(C1134860fdc c1134860fdc, InterfaceC1364105Vn<? super C1134870fdd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1134860fdc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargeTaskManager@c4b3.getClosestRechargePackage$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(0, this);
        C1C7U.LIZIZ("RechargeTaskManager@c4b3.getClosestRechargePackage$1");
        return objLIZLLL;
    }
}
