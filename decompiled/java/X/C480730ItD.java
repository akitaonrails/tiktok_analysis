package X;

import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: X.0ItD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480730ItD {
    public static long LIZ = -1;

    public static float LIZ() {
        Display displayLLILZIL;
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(C01AB.LIZ(), "window");
        return (windowManager == null || (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYC5p/6CJWmmfCDPBWD7f6pgs=", null))) == null) ? 60 : displayLLILZIL.getRefreshRate();
    }
}
