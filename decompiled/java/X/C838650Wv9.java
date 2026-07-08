package X;

import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Wv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838650Wv9 {
    public static final Method LIZ;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                LIZ = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalStateException(e);
            }
        }
    }

    public static String LIZ(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C838660WvA.LIZJ(C838660WvA.LIZ(C838660WvA.LIZIZ(locale)));
        }
        try {
            return C838670WvB.LIZ((Locale) LIZ.invoke(null, locale));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return C838670WvB.LIZ(locale);
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return C838670WvB.LIZ(locale);
        }
    }
}
