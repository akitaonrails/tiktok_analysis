package X;

/* JADX INFO: renamed from: X.0Zm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.strategy.StrategyPlatformManager", f = "StrategyPlatformManager.kt", l = {399}, m = "getCommonConfigAsync")
public final class C909500Zm8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C909400Zly LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909500Zm8(C909400Zly c909400Zly, InterfaceC1364105Vn<? super C909500Zm8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c909400Zly;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StrategyPlatformManager@54c7.getCommonConfigAsync$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, null, false, this);
        C1C7U.LIZIZ("StrategyPlatformManager@54c7.getCommonConfigAsync$1");
        return objLIZJ;
    }
}
