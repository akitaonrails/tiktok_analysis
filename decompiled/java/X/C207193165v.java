package X;

import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;

/* JADX INFO: renamed from: X.165v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207193165v {
    public static final /* synthetic */ int LIZ = 0;

    public static FeedEcCardData LIZ(Aweme aweme) {
        String cardInsertStatus;
        CardInsertInfo cardInsertInfo;
        if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null) {
            cardInsertStatus = cardInsertInfo.getCardInsertStatus();
        } else {
            cardInsertStatus = null;
        }
        FeedEcCardData feedEcCardData = (FeedEcCardData) C314470CUj.LIZIZ(FeedEcCardData.class, cardInsertStatus);
        if (feedEcCardData != null) {
            feedEcCardData.LIZ = (FeedEcCardConfig) C314470CUj.LIZIZ(FeedEcCardConfig.class, feedEcCardData.cardConfigJson);
            feedEcCardData.LIZIZ = (FeedEcCardStyle) C314470CUj.LIZIZ(FeedEcCardStyle.class, feedEcCardData.cardStyleJson);
        }
        return feedEcCardData;
    }
}
