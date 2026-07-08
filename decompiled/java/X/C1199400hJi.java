package X;

import com.ss.android.ugc.aweme.poi.PoiClaimStatusEnum;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.UgcPoiTicketDetail;

/* JADX INFO: renamed from: X.0hJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199400hJi {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(UgcPoiTicketDetail ugcPoiTicketDetail) {
        if (ugcPoiTicketDetail != null) {
            Integer num = ugcPoiTicketDetail.resultStatus;
            int value = PoiClaimStatusEnum.REJECTED.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(PoiData poiData) {
        if (poiData != null) {
            Integer num = poiData.poiClaimStatus;
            int value = PoiClaimStatusEnum.UNDER_REVIEW.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(UgcPoiTicketDetail ugcPoiTicketDetail) {
        if (ugcPoiTicketDetail != null) {
            Integer num = ugcPoiTicketDetail.resultStatus;
            int value = PoiClaimStatusEnum.UNDER_REVIEW.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
            return false;
        }
        return false;
    }
}
