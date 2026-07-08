package X;

import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0P9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640290P9n {
    public static final Integer LIZ(String str) {
        boolean z;
        Integer numValueOf = null;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = null;
            }
            if (str != null) {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(str));
                    return numValueOf;
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return numValueOf;
    }
}
