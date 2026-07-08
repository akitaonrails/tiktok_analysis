package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.07mE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1961207mE {
    public static boolean LIZ(String str) {
        boolean z = false;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty("sMiuiThemeEnabled")) {
            try {
                Field declaredField = Class.forName(str).getDeclaredField("sMiuiThemeEnabled");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    declaredField.setBoolean(null, false);
                    z = true;
                    return true;
                }
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return z;
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return z;
            } catch (NoSuchFieldException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        return z;
    }
}
