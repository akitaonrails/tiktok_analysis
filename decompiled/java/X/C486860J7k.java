package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* JADX INFO: renamed from: X.0J7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486860J7k {
    public static ScrollSwitchStateManager LIZ(Fragment fragment) {
        return (ScrollSwitchStateManager) ViewModelProviders.of(fragment, new C521790KdF(1)).get(ScrollSwitchStateManager.class);
    }

    public static ScrollSwitchStateManager LIZIZ(C19EG c19eg) {
        return (ScrollSwitchStateManager) ViewModelProviders.of(c19eg, new ViewModelProvider.Factory() { // from class: X.0J7j
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
                return new ScrollSwitchStateManager();
            }
        }).get(ScrollSwitchStateManager.class);
    }
}
