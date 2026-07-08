package X;

import com.ss.android.ugc.aweme.model.effect.FailedReviewPageInitData;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Ceb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C318790Ceb {
    public static final void LIZ(String str, String str2) {
        C201955140j.LIZLLL(C20012313Rx.LIZIZ, str, str2);
    }

    public static final void LIZIZ(FailedReviewPageInitData failedReviewPageInitData, String str) {
        String str2;
        if (failedReviewPageInitData == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("prop_id", failedReviewPageInitData.effectId);
        FailedReviewPageInitData.Content content = (FailedReviewPageInitData.Content) C13LP.LJJJLL(failedReviewPageInitData.contentList);
        if (content == null || (str2 = content.content) == null) {
            str2 = "";
        }
        linkedHashMap.put("failed_reason", str2);
        linkedHashMap.put("button_name", str);
        C1737910vKH.LIZ("click_prop_failed_review", linkedHashMap);
    }

    public static final void LIZJ(FailedReviewPageInitData failedReviewPageInitData, String str) {
        String str2;
        if (failedReviewPageInitData == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("prop_id", failedReviewPageInitData.effectId);
        FailedReviewPageInitData.Content content = (FailedReviewPageInitData.Content) C13LP.LJJJLL(failedReviewPageInitData.contentList);
        if (content == null || (str2 = content.content) == null) {
            str2 = "";
        }
        linkedHashMap.put("failed_reason", str2);
        linkedHashMap.put("button_name", str);
        C1737910vKH.LIZ("click_prop_failed_review_window", linkedHashMap);
    }
}
