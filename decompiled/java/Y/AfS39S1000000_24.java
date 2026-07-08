package Y;

import X.AbstractC827810Wdf;
import X.C09JN;
import X.C1C7U;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;

/* JADX INFO: loaded from: classes25.dex */
public class AfS39S1000000_24 implements C09JN {
    public final int $t;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) throws Exception {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public AfS39S1000000_24(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final void accept$0(AfS39S1000000_24 afS39S1000000_24, Object obj) {
        C1C7U.LIZ("LiveCardUpdateManager@5748.unRead$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unRead: success  +");
        sbLIZ.append(afS39S1000000_24.s0);
        AbstractC827810Wdf.LIZ("LiveCardUpdateManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LiveCardUpdateManager@5748.unRead$1");
    }

    public static final void accept$1(AfS39S1000000_24 afS39S1000000_24, Object obj) {
        C1C7U.LIZ("LiveCardUpdateManager@5748.unRead$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unRead: fail ");
        sbLIZ.append(afS39S1000000_24.s0);
        AbstractC827810Wdf.LIZ("LiveCardUpdateManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LiveCardUpdateManager@5748.unRead$2");
    }

    public static final void accept$2(AfS39S1000000_24 afS39S1000000_24, Object obj) throws Exception {
        CollectionDetailModel collectionDetailModel;
        CollectionDetailModel collectionDetailModel2;
        C1C7U.LIZ("SeriesServiceImpl@1551.pollCollectionDetailAfterPurchase$1");
        PaidCollectionDetailResponse paidCollectionDetailResponse = (PaidCollectionDetailResponse) obj;
        if (afS39S1000000_24.s0 != null ? !((collectionDetailModel = paidCollectionDetailResponse.collectionDetail) == null || collectionDetailModel.hasConfirmedEpisodePurchase) : !((collectionDetailModel2 = paidCollectionDetailResponse.collectionDetail) == null || collectionDetailModel2.hasPurchasedCollection || collectionDetailModel2.hasUserPartialPurchased)) {
            throw new Exception();
        }
        C1C7U.LIZIZ("SeriesServiceImpl@1551.pollCollectionDetailAfterPurchase$1");
    }
}
