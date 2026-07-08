package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;

/* JADX INFO: renamed from: X.0PVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646020PVo {
    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC665370Q7z LIZ(LifecycleOwner lifecycleOwner, EnumC646250PWl enumC646250PWl) {
        Fragment fragmentLIZIZ;
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        Fragment fragmentLIZ;
        Fragment fragment;
        if (lifecycleOwner instanceof C19EG) {
            InterfaceC214902198i interfaceC214902198iLIZIZ = C651580Ph6.LIZIZ((Activity) lifecycleOwner);
            if (interfaceC214902198iLIZIZ != 0) {
                fragment = (Fragment) interfaceC214902198iLIZIZ;
            } else {
                fragment = null;
            }
            C19EG c19eg = (C19EG) lifecycleOwner;
            SAFHelper.LIZ.getClass();
            SAFHelper.LJJJJZI(c19eg, interfaceC214902198iLIZIZ);
            if (C07H5.LIZIZ(fragment, c19eg)) {
                Fragment fragmentLIZIZ2 = SAFHelper.LIZIZ(c19eg);
                if (fragmentLIZIZ2 != null) {
                    C665240Q7m.LIZ(fragmentLIZIZ2);
                    return C1558360qeg.LJFF(fragmentLIZIZ2, null);
                }
                C665240Q7m.LIZ(lifecycleOwner);
                return C1558360qeg.LJI(c19eg, null);
            }
            C665240Q7m.LIZ(lifecycleOwner);
            return C1558360qeg.LJI(c19eg, null);
        }
        if (!(lifecycleOwner instanceof Fragment)) {
            return null;
        }
        Fragment parentFragment = (Fragment) lifecycleOwner;
        if (parentFragment.getContext() == null) {
            return null;
        }
        InterfaceC651320Pgg interfaceC651320PggLIZLLL = C0PHF.LIZLLL(parentFragment);
        if (interfaceC651320PggLIZLLL != null) {
            fragmentLIZIZ = C0PHF.LIZIZ(interfaceC651320PggLIZLLL);
        } else {
            fragmentLIZIZ = null;
        }
        if (fragmentLIZIZ != null) {
            if (C646030PVp.LIZ[enumC646250PWl.ordinal()] == 1) {
                C0PE2 c0pe2LJFF = C0PHF.LJFF(fragmentLIZIZ);
                if (c0pe2LJFF != null && (fragmentLIZ = C0PHF.LIZ(c0pe2LJFF)) != null) {
                    interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, null);
                }
            } else {
                interfaceC665370Q7zLJFF = C1558360qeg.LJFF(parentFragment, null);
            }
            if (interfaceC665370Q7zLJFF != null) {
                return interfaceC665370Q7zLJFF;
            }
        }
        if (C646030PVp.LIZ[enumC646250PWl.ordinal()] == 1) {
            if (C07H5.LIZIZ(parentFragment, parentFragment.getActivity())) {
                SAFHelper.LIZ.getClass();
                if (SAFHelper.LJIIJJI()) {
                    if (C1210904oV.LIZ()) {
                        Fragment fragmentLIZIZ3 = C0PHE.LIZIZ(parentFragment);
                        if (fragmentLIZIZ3 == null) {
                            return null;
                        }
                        return C1558360qeg.LJFF(fragmentLIZIZ3, null);
                    }
                    Context context = parentFragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (C294780Bgy.LIZ()) {
                        if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                            return null;
                        }
                    } else if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) {
                        return null;
                    }
                    while (!(parentFragment instanceof InterfaceC214902198i)) {
                        parentFragment = parentFragment.getParentFragment();
                        if (parentFragment == 0) {
                            return null;
                        }
                    }
                    Object obj = (InterfaceC214902198i) parentFragment;
                    if (obj == null) {
                        return null;
                    }
                    return C1558360qeg.LJFF((Fragment) obj, null);
                }
                Fragment fragmentLIZIZ4 = SAFHelper.LIZIZ(parentFragment.getActivity());
                if (fragmentLIZIZ4 != null) {
                    return C1558360qeg.LJFF(fragmentLIZIZ4, null);
                }
                C19EG activity = parentFragment.getActivity();
                if (activity == null) {
                    return null;
                }
                return C1558360qeg.LJI(activity, null);
            }
            C19EG activity2 = parentFragment.getActivity();
            if (activity2 == null) {
                return null;
            }
            return C1558360qeg.LJI(activity2, null);
        }
        return C1558360qeg.LJFF(parentFragment, null);
    }
}
