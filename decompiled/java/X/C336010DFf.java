package X;

import Y.ARunnableS102S0100000_2;
import Y.ARunnableS10S1100000_4;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: renamed from: X.0DFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336010DFf {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final HashMap<String, Runnable> LIZIZ = new HashMap<>();
    public static final C336020DFg LIZJ = new C336020DFg(AFwS232S0000000_4.get$arr$(210));

    public static void LIZ(String str) {
        HashMap<String, Runnable> map = LIZIZ;
        synchronized (map) {
            try {
                Runnable runnableRemove = map.remove(str);
                if (runnableRemove != null) {
                    LIZ.removeCallbacks(runnableRemove);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(C0DF6 c0df6) {
        C19EG activity;
        DialogC1389620mGW dialogC1389620mGWRemove;
        Fragment fragment;
        C336040DFi c336040DFi = C336040DFi.LIZ;
        if (!c336040DFi.LIZIZ(c0df6.LIZIZ)) {
            return;
        }
        LIZ(c0df6.LIZIZ);
        c336040DFi.LIZ(c0df6.LIZIZ);
        C336020DFg c336020DFg = LIZJ;
        c336020DFg.getClass();
        InterfaceC1034470d1h interfaceC1034470d1h = c0df6.LJI;
        if (interfaceC1034470d1h != null && (fragment = interfaceC1034470d1h.getFragment()) != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        String str = c0df6.LIZIZ;
        synchronized (c336020DFg.LIZIZ) {
            try {
                dialogC1389620mGWRemove = c336020DFg.LIZIZ.remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (dialogC1389620mGWRemove != null && activity != null) {
            activity.runOnUiThread(new ARunnableS102S0100000_2(dialogC1389620mGWRemove, 68));
        }
    }

    public static void LIZJ(C0DF6 c0df6) {
        String str = c0df6.LIZIZ;
        ARunnableS10S1100000_4 aRunnableS10S1100000_4 = new ARunnableS10S1100000_4(c0df6, str, 6);
        HashMap<String, Runnable> map = LIZIZ;
        synchronized (map) {
            try {
                Runnable runnableRemove = map.remove(str);
                if (runnableRemove != null) {
                    LIZ.removeCallbacks(runnableRemove);
                }
                map.put(str, aRunnableS10S1100000_4);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C786410Ut5.LJLIIL(10000L, LIZ, aRunnableS10S1100000_4);
    }
}
