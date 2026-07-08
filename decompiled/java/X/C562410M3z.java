package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.Map;

/* JADX INFO: renamed from: X.0M3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562410M3z {
    public static final Long LIZ(InnerPushMessage innerPushMessage) {
        Map<String, Object> extrasMap;
        Object obj;
        Number number;
        if (innerPushMessage == null || (extrasMap = innerPushMessage.getExtrasMap()) == null || (obj = extrasMap.get("draft_saved_push_view_bind")) == null || !(obj instanceof Number) || (number = (Number) obj) == null) {
            return null;
        }
        return Long.valueOf(number.longValue());
    }
}
