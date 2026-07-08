package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FeedMultiTabOrderSettings;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;

/* JADX INFO: renamed from: X.0qxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569860qxE {
    public static boolean LIZIZ() {
        Keva.getRepo("slide_mask_guide_repo");
        return C1593730rZj.LIZIZ.LJIIIIZZ() && FeedMultiTabOrderSettings.LIZ().contains("homepage_stem");
    }

    public static SlideGuideViewModel LIZ(final C19EG c19eg) {
        return (SlideGuideViewModel) new ViewModelProvider(c19eg, new ViewModelProvider.Factory(c19eg) { // from class: X.0qxF
            public final C19EG LIZ;

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            {
                this.LIZ = c19eg;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                return new SlideGuideViewModel(Hox.LLJILJIL.LIZ(this.LIZ), HomeTabViewModel.LLILZIL.LIZ(this.LIZ), C1595060rbs.LIZIZ.LJFF(this.LIZ), C680080Qly.LIZIZ(this.LIZ));
            }
        }).get(SlideGuideViewModel.class);
    }
}
