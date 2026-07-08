package X;

import android.content.Context;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0O8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614430O8b {
    public static volatile Pair<String, Boolean> LIZ;

    public static Pair<String, Boolean> LIZ(Context context) {
        if (LIZ == null) {
            synchronized (C614430O8b.class) {
                try {
                    if (LIZ == null) {
                        LIZ = C818670W9p.LIZ(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
