package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;

/* JADX INFO: renamed from: X.09Zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2394009Zq {
    public static final Fragment LIZ(FragmentManager fragmentManager) {
        if (fragmentManager == null || "comment_long_press_panel".length() == 0) {
            return null;
        }
        Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI("comment_long_press_panel");
        if (fragmentLJJJJZI != null) {
            return fragmentLJJJJZI;
        }
        Iterator<Fragment> it2 = fragmentManager.LJJLIIIJL().iterator();
        while (it2.hasNext()) {
            Fragment fragmentLIZ = LIZ(it2.next().getChildFragmentManager());
            if (fragmentLIZ != null) {
                return fragmentLIZ;
            }
        }
        return null;
    }
}
