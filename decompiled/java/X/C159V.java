package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;

/* JADX INFO: renamed from: X.159V, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.EcLiveProductCard", f = "EcLiveProductCard.kt", l = {665}, m = "getFeedProduct")
public final class C159V extends AbstractC23140094w {
    public LiveRoomStruct LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C212206182q LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159V(C212206182q c212206182q, InterfaceC1364105Vn<? super C159V> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c212206182q;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcLiveProductCard@521a.getFeedProduct$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILLL.LJIILIIL(null, null, false, null, this);
        C1C7U.LIZIZ("EcLiveProductCard@521a.getFeedProduct$1");
        return objLJIILIIL;
    }
}
