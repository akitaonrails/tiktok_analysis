package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590720rUs extends C09AY implements Function0<MainPageDataViewModel> {
    public final /* synthetic */ MainPageBusinessAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1590720rUs(MainPageBusinessAssem mainPageBusinessAssem) {
        super(0);
        this.LL = mainPageBusinessAssem;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final MainPageDataViewModel invoke() {
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if (fragmentLJI == null) {
            return null;
        }
        return ViewModelProviders.of(fragmentLJI, new ViewModelProvider.Factory() { // from class: X.0rUt
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
                return new MainPageDataViewModel();
            }
        }).get(MainPageDataViewModel.class);
    }
}
