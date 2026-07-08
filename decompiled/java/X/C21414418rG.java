package X;

import android.os.Build;
import android.widget.AutoCompleteTextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.18rG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21414418rG {
    public final Method LIZ;

    public static void LIZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public C21414418rG() {
        LIZ();
        try {
            AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]).setAccessible(true);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]).setAccessible(true);
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.LIZ = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
