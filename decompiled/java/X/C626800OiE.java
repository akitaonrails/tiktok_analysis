package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.panel.TopicReviewPanel;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626800OiE {
    public static void LIZ(C626800OiE c626800OiE, FragmentManager fragmentManager, Integer num, TopicReview topicReview, boolean z, AwS553S0100000_9 awS553S0100000_9, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            topicReview = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            awS553S0100000_9 = null;
        }
        c626800OiE.getClass();
        if (topicReview != null && !Intrinsics.LJFF(topicReview.user.getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            return;
        }
        TopicReviewPanel topicReviewPanel = new TopicReviewPanel();
        Bundle bundle = new Bundle();
        bundle.putBoolean("auto_focus", z);
        if (num != null) {
            bundle.putInt("initial_rating", num.intValue());
        }
        if (topicReview != null) {
            C786410Ut5.LJJIZ(bundle, "initial_review", topicReview);
        }
        topicReviewPanel.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(344));
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJLL = true;
        c1390920mIc.LJI(16);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJI = topicReviewPanel;
        tuxSheet2.LL = new C0P4O(topicReviewPanel, 1);
        tuxSheet2.LLILLJJLI = new C0P4S(awS553S0100000_9, 6);
        C1391850mK7.LIZIZ(tuxSheet2, "bookanchordetail_book_review_score_input_nscreen");
        tuxSheet2.show(fragmentManager, "TopicReviewPanel");
    }
}
