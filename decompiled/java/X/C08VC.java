package X;

import android.os.StatFs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08VC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08VC {
    public static long LIZ(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97RCju5PUjCoUY24IAm6eVlTzjCSV5n8POuABuEzjLWFLg2kL1/acJhDCQw=", null)) * C2204961BRm.LLFF(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyLcpvO97RCju5PUjCoUY24IAm6eVlTzjCSV5n8POuABuEzjLWFLg2kL1/acJhDCQw=", null));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }
}
