package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.06Ut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1616906Ut {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, Fragment fragment, C19EG c19eg) {
        DialogFragment dialogFragment;
        if (z) {
            if (c19eg != null) {
                c19eg.finish();
            }
        } else {
            if (fragment == null || (dialogFragment = (DialogFragment) fragment.getParentFragment()) == null || !dialogFragment.isAdded()) {
                return;
            }
            dialogFragment.dismissAllowingStateLoss();
        }
    }
}
