package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0CGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310970CGx {
    public static C847490XMl LIZ(Context context) {
        if (C847490XMl.LIZJ == null) {
            synchronized (C847490XMl.class) {
                try {
                    if (C847490XMl.LIZJ == null) {
                        C847490XMl.LIZJ = new C847490XMl(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C847490XMl.LIZJ;
    }
}
