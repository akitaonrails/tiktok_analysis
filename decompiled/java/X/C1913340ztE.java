package X;

import Y.ARunnableS101S0000000_28;
import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ztE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913340ztE {
    public static volatile DialogC1389620mGW LIZJ;
    public static WeakReference<Activity> LIZLLL;
    public static final C1913340ztE LIZ = new C1913340ztE();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final RunnableC1913330ztD LJ = RunnableC1913330ztD.LL;

    public static void LIZIZ() {
        LIZIZ.removeCallbacks(LJ);
        DialogC1389620mGW dialogC1389620mGW = LIZJ;
        LIZJ = null;
        LIZLLL = null;
        if (dialogC1389620mGW != null) {
            try {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZ() {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(LIZIZ, new ARunnableS101S0000000_28(0));
        } else {
            LIZ.getClass();
            LIZIZ();
        }
    }
}
