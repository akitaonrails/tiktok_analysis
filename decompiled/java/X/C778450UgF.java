package X;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778450UgF {
    public static final int LIZ(Context context) {
        ContentResolver contentResolver;
        if (context == null) {
            contentResolver = null;
        } else {
            try {
                contentResolver = context.getContentResolver();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return -1;
            }
        }
        return Settings.System.getInt(contentResolver, "screen_brightness");
    }
}
