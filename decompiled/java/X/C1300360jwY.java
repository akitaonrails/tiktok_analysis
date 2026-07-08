package X;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0jwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300360jwY {
    public static Context LIZIZ;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static Activity LJIIIZ;
    public static final C1300360jwY LIZ = new C1300360jwY();
    public static final String LIZJ = "com.ss.android.ugc.aweme.live.LivePlayActivity";
    public static final String LIZLLL = "com.ss.android.ugc.aweme.live.LivePlayRootFragment";
    public static int LJ = Integer.MIN_VALUE;
    public static int LJFF = Integer.MAX_VALUE;
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(372));
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(374));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(373));
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(96));
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(95));

    public static void LIZIZ(Activity activity) {
        WindowManager.LayoutParams attributes;
        Object objH2;
        float f;
        if (activity != null) {
            try {
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    Context context = LIZIZ;
                    if (context != null) {
                        objH2 = C786410Ut5.H2(context, "window");
                    } else {
                        objH2 = null;
                    }
                    Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) objH2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl+y92D02EruZYmZejyLSBgD1n101EzaMw+PyjeE+w7byWfG4dfu0=", null));
                    if (displayLLILZIL == null) {
                        return;
                    }
                    float[] supportedRefreshRates = displayLLILZIL.getSupportedRefreshRates();
                    if (supportedRefreshRates != null && supportedRefreshRates.length > 1) {
                        Arrays.sort(supportedRefreshRates);
                    }
                    int length = supportedRefreshRates.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            f = supportedRefreshRates[i];
                            double d = f;
                            if (30.0d <= d && d <= 60.0d) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            f = 60.0f;
                            break;
                        }
                    }
                    attributes.preferredRefreshRate = f;
                    Window window2 = activity.getWindow();
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

    public final synchronized void LIZ(Activity activity) {
        Object c098200Yq;
        WindowManager.LayoutParams attributes;
        try {
            if (activity == null) {
                return;
            }
            try {
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    attributes.preferredRefreshRate = 0.0f;
                    Window window2 = activity.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(attributes);
                    }
                    c098200Yq = Integer.valueOf(Log.d("RefreshFrequencyTutor", "restore to default"));
                    C189200o6.m2constructorimpl(c098200Yq);
                } else {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public final synchronized void LIZJ(Activity activity) {
        try {
            if (LIZIZ != null && activity != null) {
                LIZIZ(activity);
            }
        } finally {
        }
    }
}
