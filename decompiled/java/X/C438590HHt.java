package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.intro.TuxPanel;

/* JADX INFO: renamed from: X.0HHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438590HHt {
    public static void LIZ(Fragment fragment) {
        DialogFragment dialogFragment;
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null && parentFragment.isAdded() && (parentFragment instanceof TuxPanel) && (dialogFragment = (DialogFragment) parentFragment) != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
    }
}
