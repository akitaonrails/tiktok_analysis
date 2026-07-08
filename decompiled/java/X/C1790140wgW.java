package X;

/* JADX INFO: renamed from: X.0wgW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.service.mp.IAPMoneyPlatformService", f = "IAPMoneyPlatformService.kt", l = {68}, m = "getNextAvailableSkus")
public final class C1790140wgW extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1790100wgS LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790140wgW(C1790100wgS c1790100wgS, InterfaceC1364105Vn<? super C1790140wgW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1790100wgS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C1786710waz, C1786700way {
        C1C7U.LIZ("IAPMoneyPlatformService@2086.getNextAvailableSkus$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, null, this);
        C1C7U.LIZIZ("IAPMoneyPlatformService@2086.getNextAvailableSkus$1");
        return objLIZLLL;
    }
}
