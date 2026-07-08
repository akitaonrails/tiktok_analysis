package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.monitor.ComponentTraceVM;

/* JADX INFO: renamed from: X.0PC4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PC4 {
    public static ComponentTraceVM LIZ(Fragment fragment) {
        if (fragment != null && fragment.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED && !fragment.isDetached()) {
            try {
                return (ComponentTraceVM) new ViewModelProvider(fragment).get(ComponentTraceVM.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
