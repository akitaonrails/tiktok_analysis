package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.translation.viewmodel.DowngradeIBizCompTranslationViewModel;
import com.ss.android.ugc.aweme.translation.viewmodel.IBizCompTranslationViewModel;
import com.ss.android.ugc.aweme.translation.viewmodel.IBizCompTranslationViewModelProvider;

/* JADX INFO: renamed from: X.0Zbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903100Zbo implements IBizCompTranslationViewModelProvider {
    public static final C903100Zbo LIZIZ = new C903100Zbo();
    public final /* synthetic */ IBizCompTranslationViewModelProvider LIZ;

    @Override // com.ss.android.ugc.aweme.translation.viewmodel.IBizCompTranslationViewModelProvider
    public final IBizCompTranslationViewModel LIZ(EnumC207101162h enumC207101162h) {
        return this.LIZ.LIZ(enumC207101162h);
    }

    public C903100Zbo() {
        IBizCompTranslationViewModelProvider iBizCompTranslationViewModelProvider = (IBizCompTranslationViewModelProvider) PluggableExtentionKt.pluggableSpiForReal(IBizCompTranslationViewModelProvider.class);
        this.LIZ = iBizCompTranslationViewModelProvider == null ? new IBizCompTranslationViewModelProvider() { // from class: X.0Zbp
            @Override // com.ss.android.ugc.aweme.translation.viewmodel.IBizCompTranslationViewModelProvider
            public final IBizCompTranslationViewModel LIZ(EnumC207101162h enumC207101162h) {
                return new DowngradeIBizCompTranslationViewModel();
            }
        } : iBizCompTranslationViewModelProvider;
    }
}
