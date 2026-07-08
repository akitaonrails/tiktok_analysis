package X;

import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0STa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721800STa {
    public static final String LIZ(C2189821An6 c2189821An6) {
        Serializable followRecommendNavExtra;
        C07WV c07wv;
        DetailNavArgModel navArgModel = c2189821An6.getNavArgModel();
        if (navArgModel != null) {
            followRecommendNavExtra = navArgModel.getFollowRecommendNavExtra();
        } else {
            followRecommendNavExtra = null;
        }
        if (!(followRecommendNavExtra instanceof C07WV) || (c07wv = (C07WV) followRecommendNavExtra) == null) {
            return null;
        }
        return c07wv.reqId;
    }
}
