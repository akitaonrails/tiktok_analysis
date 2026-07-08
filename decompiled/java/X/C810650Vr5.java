package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810650Vr5 {
    public static void LIZ(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && context != null) {
            AppLog.onEvent(context, str, str2);
        }
    }

    public static void LIZIZ(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "event_v1";
        }
        if (context != null) {
            AppLog.onEvent(context, str, str2, str3, j, j2, jSONObject);
            "event_v1".equals(str);
        }
    }
}
