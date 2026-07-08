package X;

import com.ss.android.ugc.aweme.feed.ab.FeedLynxCardFallbackExperiment;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Sor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732830Sor extends C09AY implements Function1<C711340RvI, Boolean> {
    public C732830Sor() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        Integer numValueOf;
        C711340RvI c711340RvI2 = c711340RvI;
        FeedLynxCardFallbackExperiment feedLynxCardFallbackExperiment = FeedLynxCardFallbackExperiment.LIZ;
        CardInsertInfo cardInsertInfo = c711340RvI2.LIZ.getCardInsertInfo();
        if (cardInsertInfo != null) {
            numValueOf = Integer.valueOf(cardInsertInfo.getCardType());
        } else {
            numValueOf = null;
        }
        feedLynxCardFallbackExperiment.getClass();
        boolean zLIZ = FeedLynxCardFallbackExperiment.LIZ(numValueOf);
        CardInsertInfo cardInsertInfo2 = c711340RvI2.LIZ.getCardInsertInfo();
        boolean z = true;
        if (cardInsertInfo2 == null || cardInsertInfo2.getCardImplType() != 2 || c711340RvI2.LIZ.getAwemeType() != 105 || zLIZ) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
