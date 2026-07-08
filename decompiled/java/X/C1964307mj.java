package X;

import android.os.SystemProperties;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1964307mj {
    public Object LIZ;

    public final Object LIZIZ() {
        if (this.LIZ == null) {
            synchronized (C2162408da.class) {
                try {
                    if (this.LIZ == null) {
                        try {
                            this.LIZ = Class.forName("android.os.SystemProperties").newInstance();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return this.LIZ;
    }

    public final String LIZ(String str) {
        try {
            return SystemProperties.get(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                Object objLIZIZ = LIZIZ();
                return (String) objLIZIZ.getClass().getMethod("get", String.class).invoke(objLIZIZ, str);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return "";
            }
        }
    }
}
