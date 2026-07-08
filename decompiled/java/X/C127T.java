package X;

import com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.GetProductTranslationAbilityResponse;
import com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.SetTranslationAgreementRequest;
import com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.SetTranslationAgreementResponse;

/* JADX INFO: renamed from: X.127T, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface C127T {
    public static final C127U LIZ = C127U.LIZ;

    @InterfaceC1501240pAY("/aweme/v1/oec/content/translation/set_translation_agreement")
    AbstractC19484711Kz<SetTranslationAgreementResponse> LIZ(@C040I SetTranslationAgreementRequest setTranslationAgreementRequest);

    @InterfaceC1501200pAU("/aweme/v1/oec/content/anchors/get_product_translation_ability")
    AbstractC19484711Kz<GetProductTranslationAbilityResponse> LIZIZ(@InterfaceC1501120pAM("product_id") String str, @InterfaceC1501120pAM("version") int i);
}
