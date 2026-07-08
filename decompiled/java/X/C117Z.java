package X;

import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagData;
import com.ss.android.ugc.aweme.challenge.recommend.model.RecommendHashTagResponse;
import com.ss.android.ugc.aweme.shortvideo.AVRecommendHashTagData;
import com.ss.android.ugc.aweme.shortvideo.AVRecommendHashTagResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.117Z, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C117Z implements InterfaceC19882712qn<RecommendHashTagData, AVRecommendHashTagData> {
    public static AVRecommendHashTagResponse LIZ(RecommendHashTagResponse recommendHashTagResponse) {
        if (recommendHashTagResponse == null) {
            return null;
        }
        AVRecommendHashTagResponse aVRecommendHashTagResponse = new AVRecommendHashTagResponse();
        aVRecommendHashTagResponse.fillHistoryEnd = recommendHashTagResponse.fillHistoryEnd;
        aVRecommendHashTagResponse.needHistory = recommendHashTagResponse.needHistory;
        aVRecommendHashTagResponse.showPrivacyCount = recommendHashTagResponse.showPrivacyCount;
        aVRecommendHashTagResponse.needPrivacyHistory = recommendHashTagResponse.needPrivacyHistory;
        List arrayList = recommendHashTagResponse.data;
        if (arrayList == null) {
            arrayList = new ArrayList(0);
        }
        aVRecommendHashTagResponse.data = C19881612qc.LIZ(C19881612qc.LIZLLL(arrayList, new C117Z()));
        return aVRecommendHashTagResponse;
    }

    @Override // X.InterfaceC19882712qn
    public final AVRecommendHashTagData apply(RecommendHashTagData recommendHashTagData) {
        RecommendHashTagData recommendHashTagData2 = recommendHashTagData;
        AVRecommendHashTagData aVRecommendHashTagData = new AVRecommendHashTagData();
        aVRecommendHashTagData.mark = recommendHashTagData2.mark;
        aVRecommendHashTagData.pos = recommendHashTagData2.pos;
        new C194505117v();
        aVRecommendHashTagData.challenge = C194505117v.LIZ(recommendHashTagData2.challenge);
        aVRecommendHashTagData.LIZ = recommendHashTagData2.adData;
        return aVRecommendHashTagData;
    }
}
