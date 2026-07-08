package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.NavHostFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825380xbM implements InterfaceC451590HnJ {
    @Override // X.InterfaceC451590HnJ
    public final C451600HnK LIZ(LifecycleOwner lifecycleOwner) {
        Fragment fragmentLJI;
        if (lifecycleOwner instanceof Fragment) {
            fragmentLJI = (Fragment) lifecycleOwner;
        } else if (lifecycleOwner instanceof AbstractC738140SxQ) {
            fragmentLJI = C724240Sb0.LJI(lifecycleOwner);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NavGraphVMScope requires Fragment or Assem, but got ");
            sbLIZ.append(C13LE.LIZ(lifecycleOwner.getClass()).LJI());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (fragmentLJI != null) {
            try {
                try {
                    NavBackStackEntry navBackStackEntryLJ = NavHostFragment.MR(fragmentLJI).LJ(R.id.f779pla);
                    return new C451600HnK(navBackStackEntryLJ, navBackStackEntryLJ.getViewModelStore(), null, null, null);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("NavGraphVMScope: NavGraph ID 0x");
                    sbLIZ2.append(Integer.toHexString(R.id.f779pla));
                    sbLIZ2.append(" is not on the back stack");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2), e);
                }
            } catch (IllegalStateException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("NavGraphVMScope: Fragment ");
                sbLIZ3.append(C13LE.LIZ(fragmentLJI.getClass()).LJI());
                sbLIZ3.append(" is not associated with a NavController");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3), e2);
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Failed to retrieve Fragment from ");
        sbLIZ4.append(C13LE.LIZ(lifecycleOwner.getClass()).LJI());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4));
    }
}
