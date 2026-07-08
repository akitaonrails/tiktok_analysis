package Y;

import X.C09JN;
import X.C0J4Y;
import X.C13LP;
import X.C1440005kM;
import X.C1C7U;
import X.C2188811AlT;
import X.C492230JSb;
import X.C766270U4b;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.LiveAwemeData;
import com.ss.android.ugc.aweme.feed.LiveAwemeList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostOffline;
import com.ss.android.ugc.aweme.subscription.pgc.data.model.PgcCheckSubOrderResultStruct;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class AfS9S2000000_7 implements C09JN {
    public final int $t;
    public String s0;
    public String s1;

    @Override // X.C09JN
    public final void accept(Object obj) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS9S2000000_7 afS9S2000000_7, Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("PGCSubscriptionRepositoryImpl@58c9.checkSubOrder$2");
        DataResponse dataResponse = (DataResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PGCSubscriptionRepositoryImpl.checkSubOrder response, endpoint=/tiktok/sub/contract/status/, toUid=");
        sbLIZ.append(afS9S2000000_7.s0);
        sbLIZ.append(", contractId=");
        sbLIZ.append(afS9S2000000_7.s1);
        sbLIZ.append(", orderId=");
        sbLIZ.append(afS9S2000000_7.s1);
        sbLIZ.append(", httpStatusCode=");
        sbLIZ.append(dataResponse.status_code);
        sbLIZ.append(", businessErrorCode=");
        sbLIZ.append(dataResponse.status_code);
        sbLIZ.append(", logId=");
        sbLIZ.append(dataResponse.getLogId());
        sbLIZ.append(", dataStatus=");
        PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct = (PgcCheckSubOrderResultStruct) dataResponse.data;
        String str = null;
        if (pgcCheckSubOrderResultStruct != null) {
            numValueOf = Integer.valueOf(pgcCheckSubOrderResultStruct.status);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", toast=");
        PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct2 = (PgcCheckSubOrderResultStruct) dataResponse.data;
        if (pgcCheckSubOrderResultStruct2 != null) {
            str = pgcCheckSubOrderResultStruct2.toast;
        }
        sbLIZ.append(str);
        sbLIZ.append(", fullResponse=");
        sbLIZ.append(dataResponse);
        C2188811AlT.LIZIZ(sbLIZ);
        C1C7U.LIZIZ("PGCSubscriptionRepositoryImpl@58c9.checkSubOrder$2");
    }

    public static final void accept$1(AfS9S2000000_7 afS9S2000000_7, Object obj) {
        LiveAwemeList liveAwemeList;
        List<Aweme> list;
        C1C7U.LIZ("LiveHostOffline@9958.handleSurveyPreview$subscribe$1");
        LiveAwemeData liveAwemeData = (LiveAwemeData) obj;
        if (liveAwemeData != null && (liveAwemeList = liveAwemeData.data) != null && (list = liveAwemeList.items) != null && (!list.isEmpty())) {
            String str = afS9S2000000_7.s0;
            String str2 = afS9S2000000_7.s1;
            C766270U4b.LJIIJJI("request success");
            LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI((Aweme) ListProtector.get(list, 0));
            if (liveRoomStructLJI != null) {
                liveRoomStructLJI.debugSurveyId = str;
                liveRoomStructLJI.debugSurveyLan = str2;
            }
            C1440005kM.LIZ(new C492230JSb((Aweme) C13LP.LJJJJZI(list)));
        } else {
            C766270U4b.LJIIJJI("data is null");
        }
        C1C7U.LIZIZ("LiveHostOffline@9958.handleSurveyPreview$subscribe$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS9S2000000_7 afS9S2000000_7, Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("QueryOrderRepo@a26c.operator$1$requestContractStatusApi$3");
        DataResponse dataResponse = (DataResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QueryOrderRepo.requestContractStatusApi rawResponse, secAnchorUid=");
        sbLIZ.append(afS9S2000000_7.s0);
        sbLIZ.append(", contractId=");
        sbLIZ.append(afS9S2000000_7.s1);
        sbLIZ.append(", orderId=");
        sbLIZ.append(afS9S2000000_7.s1);
        sbLIZ.append(", httpStatusCode=");
        sbLIZ.append(dataResponse.status_code);
        sbLIZ.append(", businessErrorCode=");
        sbLIZ.append(dataResponse.status_code);
        sbLIZ.append(", logId=");
        sbLIZ.append(dataResponse.getLogId());
        sbLIZ.append(", dataStatus=");
        PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct = (PgcCheckSubOrderResultStruct) dataResponse.data;
        String str = null;
        if (pgcCheckSubOrderResultStruct != null) {
            numValueOf = Integer.valueOf(pgcCheckSubOrderResultStruct.status);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", toast=");
        PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct2 = (PgcCheckSubOrderResultStruct) dataResponse.data;
        if (pgcCheckSubOrderResultStruct2 != null) {
            str = pgcCheckSubOrderResultStruct2.toast;
        }
        sbLIZ.append(str);
        sbLIZ.append(", response=");
        sbLIZ.append(dataResponse);
        C2188811AlT.LIZIZ(sbLIZ);
        C1C7U.LIZIZ("QueryOrderRepo@a26c.operator$1$requestContractStatusApi$3");
    }

    public AfS9S2000000_7(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }

    public AfS9S2000000_7(LiveHostOffline liveHostOffline, String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
