package X;

import androidx.compose.ui.platform.AndroidComposeView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.07mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1964007mg {
    public static final boolean LIZ() {
        Boolean bool;
        boolean zBooleanValue = false;
        try {
            if (AndroidComposeView.LLLLLZ == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                AndroidComposeView.LLLLLZ = cls;
                AndroidComposeView.LLLLLZIL = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = AndroidComposeView.LLLLLZIL;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            if ((objInvoke instanceof Boolean) && (bool = (Boolean) objInvoke) != null) {
                zBooleanValue = bool.booleanValue();
                return zBooleanValue;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return zBooleanValue;
    }
}
