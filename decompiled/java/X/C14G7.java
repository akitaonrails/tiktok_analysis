package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.14G7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14G7 {
    public static InterfaceC665370Q7z LIZ(LifecycleOwner lifecycleOwner, C14G9 c14g9) {
        if (lifecycleOwner instanceof C19EG) {
            C19EG c19eg = (C19EG) lifecycleOwner;
            Object objLIZLLL = C20230914Dz.LIZLLL(c19eg);
            if (objLIZLLL != null) {
                Fragment fragment = (Fragment) objLIZLLL;
                C665240Q7m.LIZ(fragment);
                return C1558360qeg.LJFF(fragment, null);
            }
            C665240Q7m.LIZ(lifecycleOwner);
            return C1558360qeg.LJI(c19eg, null);
        }
        if (!(lifecycleOwner instanceof Fragment)) {
            return null;
        }
        Fragment fragment2 = (Fragment) lifecycleOwner;
        if (fragment2.getContext() == null) {
            return null;
        }
        if (C14GA.LIZ[c14g9.ordinal()] == 1) {
            C19EG activity = fragment2.getActivity();
            if (activity == null) {
                return null;
            }
            return C1558360qeg.LJI(activity, null);
        }
        return C1558360qeg.LJFF(fragment2, null);
    }
}
