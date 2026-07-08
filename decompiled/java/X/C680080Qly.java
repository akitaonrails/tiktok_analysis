package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680080Qly {
    public static HomePageDataViewModel LIZ(Fragment fragment) {
        return (HomePageDataViewModel) ViewModelProviders.of(fragment, new C0R4C(1)).get(HomePageDataViewModel.class);
    }

    public static HomePageDataViewModel LIZIZ(C19EG c19eg) {
        Fragment fragment;
        if (((Boolean) C0B54.LIZ.getValue()).booleanValue()) {
            Object objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg);
            if (objLJIILLIIL instanceof Fragment) {
                Object objLIZJ = C487580JAe.LIZJ((Fragment) objLJIILLIIL);
                String name = null;
                if (objLIZJ instanceof Fragment) {
                    fragment = (Fragment) objLIZJ;
                    if (fragment != null) {
                        name = fragment.getClass().getName();
                    }
                } else {
                    fragment = null;
                }
                if (Intrinsics.LJFF(name, "com.ss.android.ugc.aweme.detail.ui.saf.WithoutShellDetailSafRootFragment")) {
                    return (HomePageDataViewModel) ViewModelProviders.of(fragment, new ViewModelProvider.Factory() { // from class: X.0Qlx
                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                            return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                        }

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                            return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                        }

                        @Override // androidx.lifecycle.ViewModelProvider.Factory
                        public final <T extends ViewModel> T create(Class<T> cls) {
                            return new HomePageDataViewModel();
                        }
                    }).get(HomePageDataViewModel.class);
                }
            }
        }
        return (HomePageDataViewModel) ViewModelProviders.of(c19eg, new C0R4C(0)).get(HomePageDataViewModel.class);
    }
}
