package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import java.util.List;

/* JADX INFO: renamed from: X.0sAM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616440sAM {
    public static final /* synthetic */ int LIZ = 0;

    public static C20550215bA LIZ(int i) {
        if (i <= 0) {
            return null;
        }
        C1616470sAP.LIZ.getClass();
        FeedCardInsertData feedCardInsertDataLJFF = C1616470sAP.LIZIZ.LJFF();
        List<CardShowInfo> list = feedCardInsertDataLJFF.showInfoList;
        if (list == null) {
            return null;
        }
        for (CardShowInfo cardShowInfo : list) {
            if (i == cardShowInfo.cardType) {
                return new C20550215bA(i, feedCardInsertDataLJFF.LIZ, cardShowInfo, new CardInsertResultInfo(i, 0L, 20000));
            }
        }
        return null;
    }

    public static C20550215bA LIZIZ(int i, Integer num) {
        int iIntValue;
        if (i <= 0) {
            return null;
        }
        C1616470sAP.LIZ.getClass();
        FeedCardInsertData feedCardInsertDataLJFF = C1616470sAP.LIZIZ.LJFF();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = feedCardInsertDataLJFF.LIZ;
        }
        List<CardShowInfo> list = feedCardInsertDataLJFF.showInfoList;
        if (list == null) {
            return null;
        }
        for (CardShowInfo cardShowInfo : list) {
            if (i == cardShowInfo.cardType) {
                return new C20550215bA(i, iIntValue, cardShowInfo, new CardInsertResultInfo(i, 0L, 20000));
            }
        }
        return null;
    }
}
