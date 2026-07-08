package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.apm.core.ActivityLifeObserver;

/* JADX INFO: renamed from: X.0VXC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VXC {
    public static float LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;
    public static int LJ;
    public static int LJFF;

    static {
        Context context = C792400V6o.LIZ;
        ActivityLifeObserver.getInstance().register(new InterfaceC792700V7s() { // from class: X.0VXD
            @Override // X.InterfaceC792700V7s
            public final void LJ() {
            }

            @Override // X.InterfaceC792700V7s
            public final void LJII(Activity activity) {
            }

            @Override // X.InterfaceC792700V7s
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC792700V7s
            public final void LJIIJ(Activity activity) {
            }

            @Override // X.InterfaceC792700V7s
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // X.InterfaceC792700V7s
            public final void onActivityStarted(Activity activity) {
            }

            @Override // X.InterfaceC792700V7s
            public final void LIZLLL(Activity activity) {
                boolean z;
                float refreshRate = C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGMWAYMKm6D", null)).getRefreshRate();
                C0VXC.LJ = C0VXC.LIZ(refreshRate);
                if (C792400V6o.LJIJ) {
                    int iLIZ = C0VXC.LIZ(refreshRate);
                    C0VXC.LIZIZ = iLIZ;
                    if (iLIZ == C0VXC.LIZJ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C0VXC.LIZLLL = z;
                    C0VXC.LIZ = 1000.0f / iLIZ;
                }
            }
        });
        float f = 0.0f;
        if (!C792400V6o.LJIJ || context == null) {
            LIZJ = 60;
            LIZIZ = 60;
            LIZLLL = true;
            LIZ = 1000.0f / 60;
            LJFF = 60;
            LJ = 60;
            if (context != null) {
                Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGMWAYMKm6D", null));
                LJ = LIZ(displayLLILZIL.getRefreshRate());
                for (Display.Mode mode : displayLLILZIL.getSupportedModes()) {
                    float refreshRate = mode.getRefreshRate();
                    if (refreshRate > f) {
                        f = refreshRate;
                    }
                }
                LJFF = LIZ(f);
                return;
            }
            return;
        }
        Display displayLLILZIL2 = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGMWAYMKm6D", null));
        float refreshRate2 = displayLLILZIL2.getRefreshRate();
        for (Display.Mode mode2 : displayLLILZIL2.getSupportedModes()) {
            float refreshRate3 = mode2.getRefreshRate();
            if (refreshRate3 > f) {
                f = refreshRate3;
            }
        }
        int iLIZ = LIZ(refreshRate2);
        LIZIZ = iLIZ;
        LJ = iLIZ;
        int iLIZ2 = LIZ(f);
        LIZJ = iLIZ2;
        int i = LIZIZ;
        LIZLLL = i == iLIZ2;
        LIZ = 1000.0f / i;
    }

    public static int LIZ(float f) {
        if (Math.abs(f - 60.0f) < 5.1f) {
            return 60;
        }
        if (Math.abs(f - 90.0f) < 5.1f) {
            return 90;
        }
        if (Math.abs(f - 120.0f) < 5.1f) {
            return 120;
        }
        return (int) f;
    }
}
