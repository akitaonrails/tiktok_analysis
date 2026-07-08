package X;

import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VXE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VXE {
    public static final C0VXE LIZ = new C0VXE();
    public static volatile Float LIZIZ;

    public final float LIZ(Context context) {
        Object objH2;
        WindowManager windowManager;
        Display displayLLILZIL;
        float refreshRate;
        Display.Mode mode;
        Float f = LIZIZ;
        if (f != null) {
            return f.floatValue();
        }
        synchronized (this) {
            try {
                Float f2 = LIZIZ;
                if (f2 != null) {
                    return f2.floatValue();
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    if (context != null) {
                        displayLLILZIL = context.getDisplay();
                        if (displayLLILZIL == null && (mode = displayLLILZIL.getMode()) != null) {
                            refreshRate = mode.getRefreshRate();
                        }
                    }
                    refreshRate = 60.0f;
                } else {
                    if (context == null) {
                        objH2 = null;
                    } else {
                        objH2 = C786410Ut5.H2(context, "window");
                    }
                    if ((objH2 instanceof WindowManager) && (windowManager = (WindowManager) objH2) != null) {
                        displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOTrgB6IgwXZfTPhC+9nndbCyrUyDqlgg/lmUB/abuWw8i2uiY8XMFRApx8DRnMw==", null));
                        if (displayLLILZIL == null) {
                        }
                    }
                    refreshRate = 60.0f;
                }
                LIZIZ = Float.valueOf(refreshRate);
                return refreshRate;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
