package X;

import com.ss.android.ugc.aweme.creative.model.CameraSlotModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.TemplateAnchorData;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.template.TemplateTabSearchModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402970mc3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(CreativeModel creativeModel, C0LAB c0lab) {
        TemplateTabSearchModel templateTabSearchModel = creativeModel.mvModel.templateTabSearchModel;
        if (templateTabSearchModel == null) {
            return;
        }
        c0lab.LJ("template_search_enter_from", templateTabSearchModel.templateSearchEnterFrom);
        c0lab.LJ("creator_search_info", templateTabSearchModel.creatorSearchInfo);
        c0lab.LJ("search_keyword", templateTabSearchModel.searchKeyword);
        c0lab.LJ("search_id", templateTabSearchModel.searchId);
        c0lab.LJ("search_type", templateTabSearchModel.searchType);
        c0lab.LJ("search_result_id", templateTabSearchModel.searchResultId);
        c0lab.LJ("search_universal_rank", templateTabSearchModel.searchUniversalRank);
        c0lab.LJ("create_tab_search_location", templateTabSearchModel.createTabSearchLocation);
        c0lab.LJ("tab_search_enter_method", templateTabSearchModel.tabSearchEnterMethod);
        c0lab.LIZ(templateTabSearchModel.isQuickSearch, "is_quick_search");
        c0lab.LIZLLL(templateTabSearchModel.wordsPosition, "words_position");
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        String str;
        TemplateData templateData;
        CameraSlotModel cameraSlotModel;
        if (!videoPublishEditModel.creativeModel.templateData.getCameraSlotModel().getTemplateSlots().isEmpty()) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel != null && (templateData = creativeModel.templateData) != null && (cameraSlotModel = templateData.getCameraSlotModel()) != null && cameraSlotModel.isFromShotClick()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_from_template_shoot", str);
        }
    }

    public static final C0LAB LIZIZ(C0LAB c0lab, UgcTemplateData ugcTemplateData, String str, ShortVideoContext shortVideoContext) {
        MDPRecommendTemplateInfo mDPRecommendTemplateInfo;
        EnumC1412640mre enumC1412640mre;
        CreativeModel creativeModel;
        TemplateConsumeData templateConsumeData;
        if (ugcTemplateData == null || (mDPRecommendTemplateInfo = ugcTemplateData.mdpRecommendTemplateInfo) == null) {
            return c0lab;
        }
        if (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (templateConsumeData = creativeModel.templateConsumeData) == null || !templateConsumeData.LIZ()) {
            if (ugcTemplateData.isPUgcTemplateFromAnchor) {
                enumC1412640mre = EnumC1412640mre.PUGC_TEMPLATE;
            } else {
                enumC1412640mre = EnumC1412640mre.UGC_TEMPLATE;
            }
            c0lab.LJ("tt_template_type", C1412630mrd.LIZLLL(enumC1412640mre));
            c0lab.LJ("tt_template_id", ugcTemplateData.ugcTemplateId);
        }
        c0lab.LJ("tt_template_group_id", mDPRecommendTemplateInfo.getTtTemplateGroupId());
        c0lab.LJ("template_rec_reason", mDPRecommendTemplateInfo.getTemplateRecommendReason());
        c0lab.LIZLLL(mDPRecommendTemplateInfo.getTtTemplatePinType(), "tt_template_pin_type");
        if (Intrinsics.LJFF(str, "mdp_square")) {
            c0lab.LJ("shoot_way", str);
        }
        return c0lab;
    }

    public static void LIZLLL(C0LAB c0lab, CreativeModel creativeModel, VideoPublishEditModel videoPublishEditModel, String str) {
        int iHashCode;
        if (creativeModel == null) {
            return;
        }
        String str2 = null;
        if (C298980Bnk.LIZ()) {
            TemplateAnchorData templateAnchorData = creativeModel.templateAnchorData;
            if (((Boolean) C0B7M.LIZ.getValue()).booleanValue() && videoPublishEditModel != null && ((iHashCode = str.hashCode()) == -471018013 ? str.equals("click_save_local_on_edit_page") : !(iHashCode == -235365105 ? !str.equals("publish") : !(iHashCode == 1398721631 && str.equals("save_draft"))))) {
                C1412390mrF c1412390mrFLIZ = C1412380mrE.LIZ(videoPublishEditModel);
                if (c1412390mrFLIZ != null) {
                    str2 = c1412390mrFLIZ.LIZ;
                }
                c0lab.LJ("template_dispatch_type", str2);
            }
            if (templateAnchorData.isFollowPublishFromAnchor) {
                if (!Intrinsics.LJFF(templateAnchorData.isEffectFromTemplateDispatchAnchor, Boolean.TRUE)) {
                    c0lab.LJ("shoot_way", "tt_template_anchor");
                }
                c0lab.LJ("tt_template_type", templateAnchorData.ttTemplateType);
                c0lab.LJ("followed_template_dispatch_type", templateAnchorData.followedTemplateDispatchType);
            }
        }
        TemplateConsumeData templateConsumeData = creativeModel.templateConsumeData;
        if (templateConsumeData != null && templateConsumeData.LIZ()) {
            String str3 = templateConsumeData.templateType;
            if (str3 != null && str3.length() > 0) {
                c0lab.LJ("tt_template_type", str3);
            }
            String str4 = templateConsumeData.templateId;
            if (str4 != null && str4.length() > 0) {
                c0lab.LJ("tt_template_id", str4);
            }
            String str5 = templateConsumeData.dispatchType;
            if (str5 != null && str5.length() > 0) {
                c0lab.LJ("template_dispatch_type", str5);
            }
        }
    }
}
