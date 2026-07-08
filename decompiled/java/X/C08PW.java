package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08PW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PW {
    public static int LIZ(Context context, String str) {
        if (context != null) {
            try {
                try {
                    try {
                        Object obj = C786410Ut5.V3(context.getPackageManager(), context.getPackageName(), 128).metaData.get(str);
                        if (obj != null) {
                            return ((Integer) obj).intValue();
                        }
                    } catch (OutOfMemoryError e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                return -1;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                return -1;
            }
        }
        return -1;
    }
}
