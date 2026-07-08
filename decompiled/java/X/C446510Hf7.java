package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.compliance.privacy.phl.PhlApi;
import com.ss.android.ugc.aweme.compliance.privacy.phl.PhlVideosResponse;
import com.ss.android.ugc.tiktok.privacy.api.phl.model.PrivacyHighlightsForTeens;
import com.ss.android.ugc.tiktok.privacy.api.phl.vm.PhlViewModel;

/* JADX INFO: renamed from: X.0Hf7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446510Hf7 implements ViewModelProvider.Factory {
    public static final C446510Hf7 LIZ = new C446510Hf7();

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
        return new PhlViewModel(new InterfaceC438730HIh() { // from class: X.10iS
            @Override // X.InterfaceC438730HIh
            public final C11NZ<PrivacyHighlightsForTeens> LIZ() {
                PhlApi.LIZ.getClass();
                return PhlApi.LIZIZ.getPrivacyHighlightsVideos().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.10iR
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj) {
                        return ((PhlVideosResponse) obj).phlTeens;
                    }
                });
            }
        });
    }
}
