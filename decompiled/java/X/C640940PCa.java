package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.performance.ScopePerformanceVM;

/* JADX INFO: renamed from: X.0PCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640940PCa {
    public static ScopePerformanceVM LIZ(Fragment fragment) {
        if (fragment != null && fragment.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED && !fragment.isDetached()) {
            try {
                return (ScopePerformanceVM) new ViewModelProvider(fragment).get(ScopePerformanceVM.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
