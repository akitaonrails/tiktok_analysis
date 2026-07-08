package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Q5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08Q5 {
    public final SharedPreferences LIZ;

    public C08Q5(Context context) {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = C810670Vr7.LIZJ(context, 0, "monitor_downgrade");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
