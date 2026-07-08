package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QVQ {
    public static final FragmentManager LIZ(Fragment fragment) {
        Object c098200Yq;
        try {
            c098200Yq = fragment.getChildFragmentManager();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (FragmentManager) c098200Yq;
    }
}
