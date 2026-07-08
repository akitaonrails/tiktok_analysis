package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Zrf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912930Zrf {
    public static boolean LIZ(FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            List<Fragment> listLJJLIIIJL = fragmentManager.LJJLIIIJL();
            if ((listLJJLIIIJL instanceof Collection) && listLJJLIIIJL.isEmpty()) {
                return true;
            }
            Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof DialogFragment) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
