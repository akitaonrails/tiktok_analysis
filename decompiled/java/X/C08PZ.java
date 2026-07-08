package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08PZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PZ {
    public static boolean LIZ(Intent intent, String str) {
        Bundle extras = null;
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extras == null) {
            return false;
        }
        try {
            Object obj = extras.get(str);
            if (obj != null) {
                if (obj instanceof String) {
                    try {
                        return Boolean.parseBoolean((String) obj);
                    } catch (NumberFormatException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return false;
                    }
                }
                try {
                    return ((Boolean) obj).booleanValue();
                } catch (ClassCastException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return false;
                }
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        } catch (OutOfMemoryError e5) {
            TryCatchGuardChecker.doCheck(e5);
            return false;
        }
        return false;
    }
}
