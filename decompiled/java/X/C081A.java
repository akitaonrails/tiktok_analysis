package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.081A, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081A {
    public static String LIZ(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to read system property ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C2207231Ba5.LIZ(6);
            return null;
        }
    }
}
