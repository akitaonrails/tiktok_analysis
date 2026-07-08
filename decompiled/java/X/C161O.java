package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.translation.model.AutoDubbingStatusResponse;
import com.ss.android.ugc.aweme.translation.model.DescriptionTranslationResult;
import com.ss.android.ugc.aweme.translation.model.FeedbackReportInfoResponse;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResultDM;
import com.ss.android.ugc.aweme.translation.model.PhotoImageTranslationResult;
import com.ss.android.ugc.aweme.translation.model.PhotoTitleTranslationResult;
import com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult;
import com.ss.android.ugc.aweme.translation.model.StickerTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;

/* JADX INFO: renamed from: X.161O, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public interface C161O {
    @InterfaceC1501240pAY("/tiktok/cla/translation_feedback/v1/")
    @InterfaceC1485505rh
    C11NZ<FeedbackReportInfoResponse> LIZ(@InterfaceC1501100pAK("info") String str, @InterfaceC1501100pAK("hash") String str2);

    @InterfaceC1501200pAU("/aweme/v1/dubbing_status/")
    C11NZ<AutoDubbingStatusResponse> LIZIZ(@InterfaceC1501120pAM("item_id") String str);

    @InterfaceC1501240pAY("/aweme/v1/contents/translation/")
    @InterfaceC1485505rh
    C11NZ<MultiTranslationResult> LIZJ(@InterfaceC1501100pAK("trg_lang") String str, @InterfaceC1501100pAK("translation_info") String str2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501240pAY("/tiktok/cla/image_translation/v1/")
    @InterfaceC1485505rh
    C11NZ<PhotoImageTranslationResult> LIZLLL(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("enter_from") String str2, @InterfaceC1501100pAK("target_lang") String str3);

    @InterfaceC1501240pAY("/aweme/v1/translation/dm/")
    @InterfaceC1485505rh
    C11NZ<MultiTranslationResultDM> LJ(@InterfaceC1501100pAK("original_list") String str, @InterfaceC1501100pAK("target_lang") String str2, @InterfaceC1501100pAK("dnt_lang_list") String str3);

    @InterfaceC1501240pAY("/aweme/v1/contents/translation/")
    @InterfaceC1485505rh
    C11NZ<MultiTranslationResult> LJFF(@InterfaceC1501100pAK("trg_lang") String str, @InterfaceC1501100pAK("translation_info") String str2, @InterfaceC1501100pAK("group_id") String str3, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501200pAU("/tiktok/cla/subtitle_translation/get/v1/")
    C11NZ<RealtimeCaptionsTranslationResult> LJI(@InterfaceC1501120pAM("subtitle_id") long j, @InterfaceC1501120pAM("target_language") String str, @InterfaceC1501120pAM("item_id") String str2, @InterfaceC1501120pAM("enter_from") String str3);

    @InterfaceC1501240pAY("/aweme/v1/translation/sticker/")
    @InterfaceC1485505rh
    C11NZ<StickerTranslationResult> LJII(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("target_lang") String str2);

    @InterfaceC1501240pAY("/aweme/v1/content/translation/")
    @InterfaceC1485505rh
    C11NZ<TranslationResult> LJIIIIZZ(@InterfaceC1501100pAK("content") String str, @InterfaceC1501100pAK("src_lang") String str2, @InterfaceC1501100pAK("trg_lang") String str3, @InterfaceC1501100pAK("group_id") String str4, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501240pAY("/aweme/v1/translation/title/")
    @InterfaceC1485505rh
    C11NZ<PhotoTitleTranslationResult> LJIIIZ(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("target_lang") String str2);

    @InterfaceC1501240pAY("/aweme/v1/translation/description/")
    @InterfaceC1485505rh
    C11NZ<DescriptionTranslationResult> LJIIJ(@InterfaceC1501100pAK("item_id") String str, @InterfaceC1501100pAK("target_lang") String str2, @InterfaceC1501100pAK("translation_protocol") int i);
}
