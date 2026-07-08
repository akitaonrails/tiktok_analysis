package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;

/* JADX INFO: renamed from: X.0QBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666210QBf {
    public static HomePageDataViewModel LIZ(Fragment fragment, C19EG c19eg) throws Throwable {
        ComponentCallbacks2 componentCallbacks2LJFF;
        SAFHelper.LIZ.getClass();
        Fragment fragmentLJJIJ = SAFHelper.LJJIJ(fragment, c19eg);
        if (C07H6.LIZ() && fragmentLJJIJ != null && SAFHelper.LJJJJL(c19eg, fragmentLJJIJ)) {
            if (fragmentLJJIJ.getActivity() == null) {
                return new HomePageDataViewModel();
            }
            return (HomePageDataViewModel) ViewModelProviders.of(fragmentLJJIJ, new C0R4C(2)).get(HomePageDataViewModel.class);
        }
        InterfaceC214902198i interfaceC214902198i = null;
        if (fragment != null) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                while (true) {
                    if (fragment instanceof InterfaceC214902198i) {
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        break;
                    }
                    fragment = fragment.getParentFragment();
                    if (fragment == null) {
                        break;
                    }
                }
            }
        }
        SAFHelper.LJJJJZI(c19eg, interfaceC214902198i);
        return (HomePageDataViewModel) ViewModelProviders.of(c19eg, new C0R4C(3)).get(HomePageDataViewModel.class);
    }
}
