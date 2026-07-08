package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0R6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690560R6w {
    public static C0R70 LIZLLL;
    public static final C690560R6w LIZ = new C690560R6w();
    public static final Map<Integer, C0R70> LIZIZ = new LinkedHashMap();
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(465));
    public static boolean LJFF = true;
    public static final C01GW LJI = C452501pT.LIZIZ(new C690570R6x());

    public static void LIZIZ() {
        WindowOnFrameMetricsAvailableListenerC690580R6y windowOnFrameMetricsAvailableListenerC690580R6y;
        WeakReference<View> weakReference;
        View view;
        Context context;
        Activity activityLIZ;
        Window window;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Object value = LJI.getValue();
                if (!(value instanceof WindowOnFrameMetricsAvailableListenerC690580R6y) || (windowOnFrameMetricsAvailableListenerC690580R6y = (WindowOnFrameMetricsAvailableListenerC690580R6y) value) == null) {
                    return;
                }
                boolean z = LJFF;
                windowOnFrameMetricsAvailableListenerC690580R6y.LIZJ = true;
                windowOnFrameMetricsAvailableListenerC690580R6y.LJFF = z;
                System.currentTimeMillis();
                LJFF = false;
                C0R70 c0r70 = LIZLLL;
                if (c0r70 == null || (weakReference = c0r70.LIZIZ) == null || (view = weakReference.get()) == null || (context = view.getContext()) == null || (activityLIZ = C085T.LIZ(context)) == null || (window = activityLIZ.getWindow()) == null) {
                    return;
                }
                try {
                    window.removeOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC690580R6y);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LIZJ("UIDetectShareError: removeAvailableListener crash");
                }
                window.addOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC690580R6y, LIZJ);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UIDetectManager triggerDetect error: crash ");
                sbLIZ.append(e2.getMessage());
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LIZ(C0R70 c0r70, View view, View view2) {
        C0R70 c0r702;
        View view3;
        Object parent = view.getParent();
        if ((parent instanceof View) && (view3 = (View) parent) != null) {
            view2 = view3;
        } else if (view2 == null) {
            return;
        }
        Object tag = view2.getTag(R.id.emi);
        if ((tag instanceof C0R70) && (c0r702 = (C0R70) tag) != null) {
            ((ArrayList) c0r702.LIZJ).add(c0r70);
        } else {
            LIZ(c0r70, view2, null);
        }
    }
}
