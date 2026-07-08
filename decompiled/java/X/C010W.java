package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.010W, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C010W {
    public static final String LIZ(String str, String str2, String str3) {
        boolean z;
        if (str == null) {
            return null;
        }
        if (a0.LJJJIL(str2)) {
            return str;
        }
        try {
            Uri uri = UriProtector.parse(str);
            String scheme = uri.getScheme();
            boolean z2 = false;
            if (scheme == null || a0.LJJJIL(scheme)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String host = uri.getHost();
                if (host == null || a0.LJJJIL(host)) {
                    z2 = true;
                }
                if (!z2) {
                    str = uri.buildUpon().appendQueryParameter(str2, str3).build().toString();
                    return str;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return str;
    }
}
