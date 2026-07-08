package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07xG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2029607xG {
    public static String LIZ(String str) {
        String str2;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str2 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("key is:");
                sbLIZ.append(str);
                sbLIZ.append(" prop is: ");
                sbLIZ.append(str2);
                C20441214yg.LIZIZ("SystemPropertiesUtil", C2188811AlT.LIZIZ(sbLIZ));
                return str2;
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("SystemPropertiesUtil", "read the content of build.prop exception.", e);
                return str2;
            }
        } catch (Exception e2) {
            e = e2;
            str2 = "";
        }
    }
}
