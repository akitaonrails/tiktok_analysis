package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.05QJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05QJ {
    public static final long LIZ;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            id = -1;
        }
        LIZ = id;
    }
}
