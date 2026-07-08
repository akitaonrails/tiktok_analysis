package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.components.data.PrivacyUserSettingDataViewModel;

/* JADX INFO: renamed from: X.1093, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1093 {
    public static PrivacyUserSettingDataViewModel LIZ(ViewModelStoreOwner viewModelStoreOwner, final String str) {
        return (PrivacyUserSettingDataViewModel) new ViewModelProvider(viewModelStoreOwner, new ViewModelProvider.Factory() { // from class: X.1092
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
                return new PrivacyUserSettingDataViewModel(str);
            }
        }).get(str, PrivacyUserSettingDataViewModel.class);
    }
}
