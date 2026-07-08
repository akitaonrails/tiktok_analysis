package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;

/* JADX INFO: renamed from: X.0jOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279440jOo {
    public static final String LIZ(String str) {
        try {
            C1276320jJm c1276320jJmTtUrlDispatch = TTNetInit.ttUrlDispatch(str);
            if (TextUtils.isEmpty(c1276320jJmTtUrlDispatch.LIZIZ)) {
                return null;
            }
            return c1276320jJmTtUrlDispatch.LIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
