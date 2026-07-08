package X;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0l8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346460l8u {
    public static final DialogFragment LIZ(View view) {
        Object c098200Yq;
        DialogFragment dialogFragment;
        try {
            c098200Yq = FragmentManager.LJJJJLL(view);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Fragment fragment = (Fragment) c098200Yq;
        if (fragment == null) {
            return null;
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment instanceof DialogFragment) {
            dialogFragment = (DialogFragment) parentFragment;
        } else {
            dialogFragment = null;
        }
        if (dialogFragment == null) {
            if (!(fragment instanceof DialogFragment)) {
                return null;
            }
            return (DialogFragment) fragment;
        }
        return dialogFragment;
    }
}
