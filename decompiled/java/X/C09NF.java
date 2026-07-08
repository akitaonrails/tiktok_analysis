package X;

import android.content.SharedPreferences;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09NF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09NF {
    public static final SharedPreferences LIZ;

    static {
        C09NE c09ne = new C09NE(StrictMode.allowThreadDiskWrites(), null);
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C787230UuP.LIZ);
            c09ne.close();
            LIZ = defaultSharedPreferences;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                c09ne.close();
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
