package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;

/* JADX INFO: renamed from: X.0r15, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572250r15 {
    public static InboxFollowGuideViewModel LIZ(C19EG c19eg) {
        return (InboxFollowGuideViewModel) ViewModelProviders.of(c19eg, new ViewModelProvider.Factory() { // from class: X.0r16
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
                return new InboxFollowGuideViewModel();
            }
        }).get(InboxFollowGuideViewModel.class);
    }
}
