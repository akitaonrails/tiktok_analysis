package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: renamed from: X.0DDH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DDH {
    public static final ViewModelStoreOwner LIZ(Fragment fragment) {
        Fragment parentFragment = fragment.getParentFragment();
        while (true) {
            if (parentFragment == null) {
                break;
            }
            if (parentFragment.getParentFragment() != null) {
                parentFragment = parentFragment.getParentFragment();
            } else if (parentFragment != null) {
                return parentFragment;
            }
        }
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return null;
        }
        return activity;
    }
}
