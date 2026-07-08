package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;

/* JADX INFO: renamed from: X.0qxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569900qxI {
    public final synchronized HomeTabViewModel LIZ(final C19EG c19eg) {
        ViewModel viewModel;
        viewModel = ViewModelProviders.of(c19eg, new ViewModelProvider.Factory() { // from class: X.0qxH
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
                return new HomeTabViewModel(c19eg);
            }
        }).get((Class<ViewModel>) HomeTabViewModel.class);
        HomeTabViewModel homeTabViewModel = (HomeTabViewModel) viewModel;
        if (homeTabViewModel.LL != c19eg) {
            homeTabViewModel.LL = c19eg;
        }
        return (HomeTabViewModel) viewModel;
    }
}
