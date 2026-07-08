package X;

import Y.AgS283S0100000_2;

/* JADX INFO: renamed from: X.05kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel$onPrepared$1$invokeSuspend$$inlined$filter$1$2", f = "SellerMessageListViewModel.kt", l = {223}, m = "emit")
public final class C1441705kd extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS283S0100000_2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1441705kd(AgS283S0100000_2 agS283S0100000_2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS283S0100000_2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SellerMessageListViewModel@16a7.onPrepared$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("SellerMessageListViewModel@16a7.onPrepared$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
