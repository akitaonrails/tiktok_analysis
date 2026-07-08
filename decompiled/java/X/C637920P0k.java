package X;

import android.os.Build;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0P0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637920P0k {
    public static final void LIZ(View view, Runnable runnable) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                HandlerHook.viewPost(view, runnable);
            } else {
                C2487409ou.LIZJ(runnable);
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            HandlerHook.viewPost(view, runnable);
        }
    }
}
