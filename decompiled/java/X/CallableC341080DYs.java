package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0DYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class CallableC341080DYs<V> implements Callable {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ long LLILLJJLI;

    public CallableC341080DYs(Aweme aweme, long j) {
        this.LL = aweme;
        this.LLILLJJLI = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        CardInsertInfo cardInsertInfo;
        C1C7U.LIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerFirstScreen$1");
        Aweme aweme = this.LL;
        int cardType = (aweme == null || (cardInsertInfo = aweme.getCardInsertInfo()) == null) ? 0 : cardInsertInfo.getCardType();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(cardType, "card_type");
        c2344009Gk.LIZLLL(this.LLILLJJLI, "total_duration");
        C20684815ws.LJIILLIIL("rd_feed_lynx_card_container_first_screen", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxInserCardMobUtils@b4b2.mobCardContainerFirstScreen$1");
        return unit;
    }
}
