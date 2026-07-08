package X;

import Y.ARunnableS104S0100000_4;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: renamed from: X.0DFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336020DFg {
    public final Function1<C0DF6, Unit> LIZ;
    public final HashMap<String, DialogC1389620mGW> LIZIZ = new HashMap<>();

    public C336020DFg(AFwS232S0000000_4 aFwS232S0000000_4) {
        this.LIZ = aFwS232S0000000_4;
    }

    public final void LIZ(C0DF6 c0df6) {
        C19EG activity;
        DialogC1389620mGW dialogC1389620mGW;
        Fragment fragment;
        InterfaceC1034470d1h interfaceC1034470d1h = c0df6.LJI;
        if (interfaceC1034470d1h != null && (fragment = interfaceC1034470d1h.getFragment()) != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        String str = c0df6.LIZIZ;
        synchronized (this.LIZIZ) {
            try {
                dialogC1389620mGW = this.LIZIZ.get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (dialogC1389620mGW == null || activity == null) {
            return;
        }
        activity.runOnUiThread(new ARunnableS104S0100000_4(dialogC1389620mGW, 96));
    }
}
