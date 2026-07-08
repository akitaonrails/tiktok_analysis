package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Q4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08Q4 {
    public final SharedPreferences LIZ;

    public C08Q4(Context context) {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        String strLIZ = C08MW.LIZ(context);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("monitor_downgrade");
                        sbLIZ.append(strLIZ);
                        this.LIZ = C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
