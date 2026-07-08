package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0mdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403900mdY {
    public static final C1403900mdY LIZ = new C1403900mdY();

    public static void LIZIZ(CreativeModel creativeModel, C0LAB c0lab) {
        AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) C13LP.LJJJLL(creativeModel.stickerModel.addYoursStickerExtras);
        if (addYoursStickerExtras == null) {
            return;
        }
        LIZ(c0lab, "add_yours_from_group_content", addYoursStickerExtras.getAddYoursFromGroupContent());
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", "shoot");
    }

    public static void LJFF(CreativeModel creativeModel, C0LAB c0lab) {
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) C13LP.LJJJLL(creativeModel.stickerModel.addYoursStickerModels);
        String str = "";
        if (addYoursStickerModel == null) {
            c0lab.LJ("add_yours_enter_method", "");
            return;
        }
        String addYoursEnterMethod = addYoursStickerModel.getAddYoursEnterMethod();
        if (addYoursEnterMethod != null) {
            str = addYoursEnterMethod;
        }
        c0lab.LJ("add_yours_enter_method", str);
    }

    public static void LJI(CreativeModel creativeModel, C0LAB c0lab) {
        Long topicID;
        String str;
        String topicText;
        Long topicID2;
        AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) C13LP.LJJJLL(creativeModel.stickerModel.addYoursStickerExtras);
        if (addYoursStickerExtras == null) {
            return;
        }
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) C13LP.LJJJLL(creativeModel.stickerModel.addYoursStickerModels);
        LIZ(c0lab, "add_yours_enter_method", addYoursStickerExtras.getAddYoursEnterMethod());
        String str2 = CardStruct.IStatusCode.DEFAULT;
        c0lab.LJ("is_add_yours", CardStruct.IStatusCode.DEFAULT);
        Integer numIsOperationSet = null;
        if (addYoursStickerModel != null) {
            topicID = addYoursStickerModel.getTopicID();
        } else {
            topicID = null;
        }
        if (topicID == null) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_initiator", str);
        if (Intrinsics.LJFF(addYoursStickerExtras.getViewerInvited(), Boolean.TRUE)) {
            str2 = "1";
        }
        c0lab.LJ("is_invited", str2);
        if (addYoursStickerModel != null) {
            topicText = addYoursStickerModel.getTopicText();
        } else {
            topicText = null;
        }
        LIZ(c0lab, "add_yours_title", topicText);
        LIZ(c0lab, "from_group_id", addYoursStickerExtras.getFromItemId());
        if (addYoursStickerModel != null) {
            topicID2 = addYoursStickerModel.getTopicID();
        } else {
            topicID2 = null;
        }
        LIZ(c0lab, "add_yours_id", topicID2);
        LIZ(c0lab, "follow_status", addYoursStickerExtras.getFollowStatus());
        if (addYoursStickerModel != null) {
            numIsOperationSet = addYoursStickerModel.isOperationSet();
        }
        LIZ(c0lab, "is_operation_set", numIsOperationSet);
    }

    public static void LJII(CreativeModel creativeModel, C0LAB c0lab) {
        String str;
        String followTopicText;
        StickerNewEngineModel stickerNewEngineModel = creativeModel.stickerModel;
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) C13LP.LJJJLL(stickerNewEngineModel.addYoursStickerModels);
        if (addYoursStickerModel != null && stickerNewEngineModel.isFromFollowAddYours) {
            if (addYoursStickerModel.getFollowTopicId() == null || addYoursStickerModel.getFollowTopicText() == null) {
                addYoursStickerModel.setFollowTopicId(addYoursStickerModel.getTopicID());
                addYoursStickerModel.setFollowTopicText(addYoursStickerModel.getTopicText());
            }
            if (addYoursStickerModel.isEdited()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_add_yours_edit", str);
            Long followTopicId = null;
            if (addYoursStickerModel.isEdited()) {
                followTopicText = addYoursStickerModel.getFollowTopicText();
            } else {
                followTopicText = null;
            }
            c0lab.LJ("original_add_yours_title", followTopicText);
            if (addYoursStickerModel.isEdited()) {
                followTopicId = addYoursStickerModel.getFollowTopicId();
            }
            c0lab.LIZLLL(followTopicId, "original_add_yours_id");
        }
    }

    public static void LJIIIIZZ(AddYoursStickerModel addYoursStickerModel, C0LAB c0lab) {
        String str;
        String followTopicText;
        if (addYoursStickerModel.getFollowTopicText() != null) {
            if (addYoursStickerModel.isEdited()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_add_yours_edit", str);
            Long followTopicId = null;
            if (addYoursStickerModel.isEdited()) {
                followTopicText = addYoursStickerModel.getFollowTopicText();
            } else {
                followTopicText = null;
            }
            c0lab.LJ("original_add_yours_title", followTopicText);
            if (addYoursStickerModel.isEdited()) {
                followTopicId = addYoursStickerModel.getFollowTopicId();
            }
            c0lab.LIZLLL(followTopicId, "original_add_yours_id");
        }
    }

    public static void LJIIIZ(CreativeModel creativeModel, C0LAB c0lab) {
        String initialRecommendTopicByContent;
        String str;
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) C13LP.LJJJLL(creativeModel.stickerModel.addYoursStickerModels);
        if (addYoursStickerModel != null && (initialRecommendTopicByContent = addYoursStickerModel.getInitialRecommendTopicByContent()) != null) {
            if (Intrinsics.LJFF(initialRecommendTopicByContent, addYoursStickerModel.getTopicText())) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            c0lab.LJ("is_creation_add_yours_card_edit", str);
        }
    }

    public static C0LAB LIZ(C0LAB c0lab, String str, Object obj) {
        if (obj == null) {
            return c0lab;
        }
        if (obj instanceof String) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() != 0 && !a0.LJJJIL(charSequence)) {
                c0lab.LJ(str, (String) obj);
                return c0lab;
            }
            return c0lab;
        }
        if (obj instanceof Integer) {
            c0lab.LIZ(((Number) obj).intValue(), str);
            return c0lab;
        }
        if (obj instanceof Long) {
            c0lab.LIZIZ(((Number) obj).longValue(), str);
            return c0lab;
        }
        c0lab.LIZLLL(obj, str);
        return c0lab;
    }

    public static void LIZJ(CreativeModel creativeModel, AddYoursStickerModel addYoursStickerModel, C0LAB c0lab) {
        String str;
        String str2;
        Long fromItemId;
        AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) C13LP.LJJJLL(creativeModel.stickerModel.addYoursStickerExtras);
        AddYoursStickerModel addYoursStickerModel2 = (AddYoursStickerModel) C13LP.LJJJLL(creativeModel.stickerModel.addYoursStickerModels);
        if (addYoursStickerModel != null && addYoursStickerModel.getId() != 0) {
            addYoursStickerModel2 = addYoursStickerModel;
        }
        if (addYoursStickerModel2 != null && addYoursStickerModel != null) {
            LIZ(c0lab, "add_yours_enter_method", addYoursStickerModel2.getAddYoursEnterMethod());
            c0lab.LJ("is_add_yours", "1");
            if (addYoursStickerModel2.getTopicID() == null) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_initiator", str);
            boolean zIsEdited = false;
            if (addYoursStickerExtras != null && Intrinsics.LJFF(addYoursStickerExtras.getViewerInvited(), Boolean.TRUE)) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_invited", str2);
            LIZ(c0lab, "add_yours_title", addYoursStickerModel2.getTopicText());
            String followStatus = null;
            if (addYoursStickerExtras != null) {
                fromItemId = addYoursStickerExtras.getFromItemId();
            } else {
                fromItemId = null;
            }
            LIZ(c0lab, "from_group_id", fromItemId);
            LIZ(c0lab, "add_yours_id", addYoursStickerModel2.getTopicID());
            LIZ(c0lab, "trend_source", creativeModel.stickerModel.trendSource);
            if (addYoursStickerExtras != null) {
                followStatus = addYoursStickerExtras.getFollowStatus();
            }
            LIZ(c0lab, "follow_status", followStatus);
            LIZ(c0lab, "is_operation_set", addYoursStickerModel2.isOperationSet());
            if (creativeModel.stickerModel.isFromFollowAddYours) {
                zIsEdited = addYoursStickerModel2.isEdited();
            } else if (!C08A4.LIZ(addYoursStickerModel2.isOperationSet()) && !Intrinsics.LJFF(addYoursStickerModel2.getTopicTextFromRecommendTopicList(), addYoursStickerModel2.getTopicText())) {
                zIsEdited = true;
            }
            if (zIsEdited) {
                c0lab.LJ("is_first_author", "1");
                return;
            } else {
                c0lab.LJ("is_first_author", CardStruct.IStatusCode.DEFAULT);
                return;
            }
        }
        c0lab.LJ("is_add_yours", CardStruct.IStatusCode.DEFAULT);
        LIZ(c0lab, "trend_source", creativeModel.stickerModel.trendSource);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIJ(VideoPublishEditModel videoPublishEditModel, AddYoursStickerModel addYoursStickerModel, Function1 function1) {
        ShortVideoContext shortVideoContext;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if (videoPublishEditModel instanceof ShortVideoContext) {
            shortVideoContext = (ShortVideoContext) videoPublishEditModel;
        } else {
            shortVideoContext = null;
        }
        if (videoPublishEditModel instanceof VideoPublishEditModel) {
            videoPublishEditModel2 = videoPublishEditModel;
        }
        C0LAB c0lab = new C0LAB();
        if (shortVideoContext != null) {
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("shoot_way", shortVideoContext.shootWay);
            c0lab.LJ("creation_id", shortVideoContext.getCreationId());
            c0lab.LJ("content_type", "video");
            c0lab.LJ("content_source", "shoot");
            if (addYoursStickerModel != null) {
                c0lab.LJ("add_yours_enter_method", addYoursStickerModel.getAddYoursEnterMethod());
            }
            function1.invoke(c0lab);
        } else if (videoPublishEditModel2 != null) {
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
            c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            C1413430msv.LIZLLL(videoPublishEditModel, c0lab);
            C1413430msv.LIZIZ(videoPublishEditModel, c0lab);
            c0lab.LJ("edit_tab_entrance", videoPublishEditModel.getEditorProModel().getOpenEditToolType());
            c0lab.LJ("editorpro_click_from", videoPublishEditModel.getEditorProModel().getClickFrom());
            c0lab.LIZ(C573570MeZ.LIZJ(videoPublishEditModel2) ? 1 : 0, "is_pic_frame_single_pic_edit");
            if (C573570MeZ.LIZJ(videoPublishEditModel2)) {
                c0lab.LIZ(1, "pic_cnt");
                c0lab.LJ("content_type", "multi_photo");
            }
            function1.invoke(c0lab);
            if (addYoursStickerModel != null) {
                c0lab.LJ("add_yours_enter_method", addYoursStickerModel.getAddYoursEnterMethod());
            }
            c0lab.LIZ(videoPublishEditModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
            C1413430msv.LIZ(videoPublishEditModel, c0lab);
            C1413430msv.LJFF(videoPublishEditModel, c0lab);
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("click_add_yours_entrance", c0lab.LIZ);
    }
}
