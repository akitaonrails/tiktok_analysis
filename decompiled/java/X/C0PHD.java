package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0PHD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PHD {
    public static SearchCardContainerSharedVM LIZ(Fragment fragment, C0NMY c0nmy) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(fragment.hashCode());
        sbLIZ.append('-');
        sbLIZ.append(c0nmy.name());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, SearchCardContainerSharedVM> value = SearchCardContainerSharedVM.LLILZLL.getValue();
        SearchCardContainerSharedVM searchCardContainerSharedVM = value.get(strLIZIZ);
        if (searchCardContainerSharedVM == null) {
            SAFHelper.LIZ.getClass();
            searchCardContainerSharedVM = (SearchCardContainerSharedVM) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(SAFHelper.LJIJ(fragment), c0nmy.name(), SearchCardContainerSharedVM.class);
            searchCardContainerSharedVM.addCloseable(new AutoCloseable() { // from class: X.0PHC
                @Override // java.lang.AutoCloseable
                public final void close() {
                    SearchCardContainerSharedVM.LLILZLL.getValue().remove(strLIZIZ);
                }
            });
            SearchCardContainerSharedVM searchCardContainerSharedVMPutIfAbsent = value.putIfAbsent(strLIZIZ, searchCardContainerSharedVM);
            if (searchCardContainerSharedVMPutIfAbsent != null) {
                searchCardContainerSharedVM = searchCardContainerSharedVMPutIfAbsent;
            }
        }
        return searchCardContainerSharedVM;
    }

    public static SearchCardContainerSharedVM LIZIZ(LifecycleOwner lifecycleOwner, C0NMY c0nmy) {
        Fragment fragmentLIZIZ;
        C19EG c19eg = null;
        if (C07H6.LIZ()) {
            if (C1209904oL.LIZ() && (lifecycleOwner instanceof InterfaceC651320Pgg) && (fragmentLIZIZ = C0PHF.LIZIZ((InterfaceC651320Pgg) lifecycleOwner)) != null) {
                return LIZ(fragmentLIZIZ, c0nmy);
            }
            SAFHelper.LIZ.getClass();
            if (SAFHelper.LJIIJJI() && (lifecycleOwner instanceof SearchRootFragment)) {
                return LIZ((Fragment) lifecycleOwner, c0nmy);
            }
            if (lifecycleOwner instanceof C19EG) {
                c19eg = (C19EG) lifecycleOwner;
            }
            Fragment fragmentLJJJ = SAFHelper.LJJJ(c19eg);
            if (fragmentLJJJ != null) {
                return LIZ(fragmentLJJJ, c0nmy);
            }
        }
        SAFHelper.LIZ.getClass();
        Lifecycle lifecycleLJIJ = SAFHelper.LJIJ(lifecycleOwner);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(lifecycleLJIJ.hashCode());
        sbLIZ.append('-');
        sbLIZ.append(c0nmy.name());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, SearchCardContainerSharedVM> value = SearchCardContainerSharedVM.LLILZLL.getValue();
        SearchCardContainerSharedVM searchCardContainerSharedVM = value.get(strLIZIZ);
        if (searchCardContainerSharedVM == null) {
            searchCardContainerSharedVM = (SearchCardContainerSharedVM) new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(lifecycleLJIJ, c0nmy.name(), SearchCardContainerSharedVM.class);
            searchCardContainerSharedVM.addCloseable(new AutoCloseable() { // from class: X.0PHB
                @Override // java.lang.AutoCloseable
                public final void close() {
                    SearchCardContainerSharedVM.LLILZLL.getValue().remove(strLIZIZ);
                }
            });
            SearchCardContainerSharedVM searchCardContainerSharedVMPutIfAbsent = value.putIfAbsent(strLIZIZ, searchCardContainerSharedVM);
            if (searchCardContainerSharedVMPutIfAbsent != null) {
                searchCardContainerSharedVM = searchCardContainerSharedVMPutIfAbsent;
            }
        }
        return searchCardContainerSharedVM;
    }
}
