package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0HHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438600HHu {
    public static void LIZ(Fragment fragment) {
        DialogFragment dialogFragment = (DialogFragment) fragment.getParentFragment();
        if (dialogFragment != null && dialogFragment.isAdded()) {
            dialogFragment.dismissAllowingStateLoss();
        }
    }
}
