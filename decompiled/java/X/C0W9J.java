package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0W9J, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9J {
    public static final String LIZ(Context context, String str) {
        try {
            if (C0W9H.LIZLLL == null) {
                synchronized (C0W9H.class) {
                    try {
                        if (C0W9H.LIZLLL == null) {
                            C0W9H.LIZLLL = new C0W9H(context);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            C0W9H c0w9h = C0W9H.LIZLLL;
            if (c0w9h != null) {
                return c0w9h.LIZ(str);
            }
            return null;
        } catch (Exception th) {
            return null;
        }
    }
}
