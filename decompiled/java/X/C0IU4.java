package X;

import android.os.Build;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0IU4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IU4 {
    public static final float LIZIZ(C19EG c19eg, WindowManager windowManager) {
        Object c098200Yq;
        Display displayLLILZIL;
        float fFloatValue;
        float[] supportedRefreshRates;
        Float fLJJJJJ;
        if (c19eg == null || windowManager == null) {
            return 0.0f;
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                displayLLILZIL = c19eg.getDisplay();
            } else {
                displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl/j5U8mU9xVe0IPh9T8AS0Cmw", null));
            }
            if (displayLLILZIL == null || (supportedRefreshRates = displayLLILZIL.getSupportedRefreshRates()) == null || (fLJJJJJ = C13LQ.LJJJJJ(supportedRefreshRates)) == null) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = fLJJJJJ.floatValue();
            }
            c098200Yq = Float.valueOf(fFloatValue);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Float fValueOf = Float.valueOf(0.0f);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = fValueOf;
        }
        return ((Number) c098200Yq).floatValue();
    }

    public static final void LIZ(C19EG c19eg, float f, boolean z) {
        WindowManager.LayoutParams attributes;
        if (c19eg != null) {
            try {
                Window window = c19eg.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    if (z) {
                        attributes.preferredRefreshRate = f;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("set dragging rate ");
                        sbLIZ.append(f);
                        C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        attributes.preferredRefreshRate = 0.0f;
                    }
                    Window window2 = c19eg.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(attributes);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
