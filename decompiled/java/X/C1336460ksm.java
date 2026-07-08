package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0ksm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336460ksm extends View {
    public static volatile Field LL;

    public static void LIZJ(Context context, View view) {
        view.mContext = context;
    }

    public static Field getViewContextField() {
        Field declaredField;
        Field field = LL;
        if (field != null) {
            return field;
        }
        synchronized (C1336460ksm.class) {
            try {
                declaredField = LL;
                if (declaredField == null) {
                    declaredField = View.class.getDeclaredField("mContext");
                    LL = declaredField;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return declaredField;
    }

    public static void LIZ(View view) {
        if (view != null) {
            view.onFinishInflate();
        }
    }

    public static boolean LIZIZ(Context context, View view) {
        if (context != null) {
            try {
                LIZJ(context, view);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    Field viewContextField = getViewContextField();
                    viewContextField.setAccessible(true);
                    viewContextField.set(view, context);
                    return true;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return false;
                }
            }
        }
        return false;
    }
}
