package X;

import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;

/* JADX INFO: renamed from: X.0XLJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLJ {
    public static boolean LIZ(Request request) {
        if (request == null) {
            return false;
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        if (!path.contains("/aweme/v1/feed/") && !path.contains("/aweme/v2/feed/")) {
            return false;
        }
        return true;
    }
}
