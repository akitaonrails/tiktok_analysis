package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.018i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2846018i {
    public static String LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            str = UriProtector.parse(str).buildUpon().clearQuery().toString();
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }
}
