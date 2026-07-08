package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0PwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661050PwN {
    public static final String LIZ(Aweme aweme) {
        HashMap<String, String> searchExtraParams;
        if (aweme != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme)) != null) {
            return searchExtraParams.get("token_type");
        }
        return null;
    }
}
