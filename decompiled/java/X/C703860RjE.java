package X;

import com.ss.android.ugc.aweme.feed.ab.FeedEcCardTrackServerConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703860RjE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FeedItemList LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C703860RjE(FeedItemList feedItemList) {
        super(0);
        this.LL = feedItemList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Aweme> awemeList;
        if (Intrinsics.LJFF(((FeedEcCardTrackServerConfig.TrackModel) FeedEcCardTrackServerConfig.LIZIZ.getValue()).enable, Boolean.TRUE)) {
            final ArrayList arrayList = new ArrayList();
            FeedItemList feedItemList = this.LL;
            if (feedItemList != null && (awemeList = feedItemList.getAwemeList()) != null) {
                arrayList.addAll(awemeList);
            }
            C0T5M c0t5m = C0T5M.LIZ;
            Callable callable = new Callable() { // from class: X.0RRY
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("FeedLynxInserCardMobUtils@b4b2.mobEcCardInfoFromServerRefactor$1$1");
                    for (Aweme aweme : arrayList) {
                        FeedEcCardTrackServerConfig.TrackModel trackModel = (FeedEcCardTrackServerConfig.TrackModel) FeedEcCardTrackServerConfig.LIZIZ.getValue();
                        CardInsertInfo cardInsertInfo = aweme.getCardInsertInfo();
                        if (cardInsertInfo != null) {
                            int cardType = cardInsertInfo.getCardType();
                            Map<String, String> map = trackModel.cardTypeList;
                            if (map != null && map.containsKey(String.valueOf(cardType))) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LIZJ(cardType, "card_type");
                                C20684815ws.LJIILLIIL("rd_tiktokec_feed_ec_card_info_from_server_refactor", c2344009Gk.LIZ);
                            }
                        }
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FeedLynxInserCardMobUtils@b4b2.mobEcCardInfoFromServerRefactor$1$1");
                    return unit;
                }
            };
            c0t5m.getClass();
            C0T5M.LIZIZ(callable);
        }
        return Unit.LIZ;
    }
}
