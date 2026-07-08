package X;

import Y.AgS301S0100000_20;

/* JADX INFO: renamed from: X.0k72, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.service.StarShipInitService$registerInitListener$job$1$invokeSuspend$$inlined$filter$1$2", f = "StarShipInitService.kt", l = {223}, m = "emit")
public final class C1306860k72 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS301S0100000_20 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306860k72(AgS301S0100000_20 agS301S0100000_20, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS301S0100000_20;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StarShipInitService@2e29.registerInitListener$job$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("StarShipInitService@2e29.registerInitListener$job$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
