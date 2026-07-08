package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0PJG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PJG {
    public static final double LIZ(Aweme aweme) {
        HashMap<String, String> searchExtraParams;
        String str;
        Double dLJII;
        if (aweme != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme)) != null && (str = searchExtraParams.get("engine_sort_score")) != null && (dLJII = C2327809Ae.LJII(str)) != null) {
            return dLJII.doubleValue();
        }
        return 0.0d;
    }
}
