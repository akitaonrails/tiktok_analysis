package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0qtI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.SeaEcLiveFeedCard", f = "SeaEcLiveFeedCard.kt", l = {687}, m = "getFeedProduct")
public final class C1567420qtI extends AbstractC23140094w {
    public LiveRoomStruct LL;
    public C118300cf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C212203182n LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567420qtI(C212203182n c212203182n, InterfaceC1364105Vn<? super C1567420qtI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c212203182n;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("SeaEcLiveFeedCard@bf0f.getFeedProduct$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILZ.LJIILIIL(null, null, false, null, this);
        C1C7U.LIZIZ("SeaEcLiveFeedCard@bf0f.getFeedProduct$1");
        return objLJIILIIL;
    }
}
