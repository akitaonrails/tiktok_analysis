package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;

/* JADX INFO: renamed from: X.0l0N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341170l0N {
    public static final C1341170l0N LIZ = new C1341170l0N();
    public static final C2344009Gk LIZIZ;

    static {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "comment");
        LIZIZ = c2344009Gk;
    }

    public static boolean LIZ(Aweme aweme) {
        AwemeStatistics statistics;
        if (aweme == null) {
            return false;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(AwemeExtKt.getAuthorUid(aweme)) || (statistics = aweme.getStatistics()) == null || statistics.getCommentCount() == 0 || !C1348690lCV.LIZIZ(aweme)) {
            return false;
        }
        return !ComplianceServiceProvider.LJIIJJI().showEngagementCount();
    }
}
