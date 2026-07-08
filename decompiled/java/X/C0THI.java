package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0THI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0THI {
    public static final /* synthetic */ int LIZ = 0;

    public static DialogFragment LIZ(FragmentManager fragmentManager) {
        if (fragmentManager == null) {
            return null;
        }
        List<Fragment> listLJJLIIIJL = fragmentManager.LJJLIIIJL();
        int size = listLJJLIIIJL.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Fragment fragment = (Fragment) ListProtector.get(listLJJLIIIJL, size);
                if (fragment instanceof DialogFragment) {
                    DialogFragment dialogFragment = (DialogFragment) fragment;
                    if (dialogFragment.getDialog() != null && dialogFragment.isVisible()) {
                        return dialogFragment;
                    }
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return null;
    }
}
