package X;

import Y.AgS212S0200000_30;

/* JADX INFO: renamed from: X.13lX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.serviceimp.PNSProtectionDataLayerQueryServiceImpl$queryDataFlow$$inlined$map$2$2", f = "PNSProtectionDataLayerQueryServiceImpl.kt", l = {223}, m = "emit")
public final class C20104913lX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS212S0200000_30 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20104913lX(AgS212S0200000_30 agS212S0200000_30, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS212S0200000_30;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSProtectionDataLayerQueryServiceImpl@4170.queryDataFlow$$inlined$map$2$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("PNSProtectionDataLayerQueryServiceImpl@4170.queryDataFlow$$inlined$map$2$2$1");
        return objEmit;
    }
}
