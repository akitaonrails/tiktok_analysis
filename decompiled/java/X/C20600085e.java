package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.085e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20600085e {
    public static String LIZ(Context context) {
        Context baseContext;
        if (context == null) {
            return "unknown";
        }
        int i = 0;
        Context context2 = context;
        while (i < 8 && context2 != null) {
            try {
                if (context2 instanceof Activity) {
                    return context2.getClass().getName();
                }
                if (!(context2 instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context2).getBaseContext()) == context2) {
                    break;
                }
                i++;
                context2 = baseContext;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return "unknown";
            }
        }
        return context.getClass().getName();
    }
}
