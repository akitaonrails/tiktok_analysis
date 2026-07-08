package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0ROI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0ROI {
    public static boolean LIZ(Aweme aweme, C2189821An6 c2189821An6) {
        boolean z;
        if (!TextUtils.equals("from_profile_self", c2189821An6.getFrom()) && !c2189821An6.isMyProfile()) {
            z = false;
        } else {
            z = true;
        }
        CommentService commentService = (CommentService) ServiceManager.get().getService(CommentService.class);
        Boolean boolValueOf = Boolean.valueOf(z);
        c2189821An6.getPageType();
        return commentService.LJLLILLLL(c2189821An6, aweme, boolValueOf, c2189821An6.getEventType());
    }

    public static boolean LIZIZ(BaseFeedPageParams baseFeedPageParams, Aweme aweme, Fragment fragment) {
        return ((CommentService) ServiceManager.get().getService(CommentService.class)).LJLLILLLL(baseFeedPageParams.param, aweme, Boolean.valueOf(baseFeedPageParams.isMyProfile), baseFeedPageParams.eventType);
    }

    public static boolean LIZJ(C2189821An6 c2189821An6, Aweme aweme, boolean z, int i, String str) {
        return ((CommentService) ServiceManager.get().getService(CommentService.class)).LJLLILLLL(c2189821An6, aweme, Boolean.valueOf(z), str);
    }
}
