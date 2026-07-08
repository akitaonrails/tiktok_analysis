package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CameraSlotModel;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModeAfterCreationFeedbackMobParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Knb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528210Knb {
    public static final /* synthetic */ int LIZJ = 0;
    public final ShortVideoContext LIZ;
    public final C0LAB LIZIZ;

    public final void LIZ() {
        CreativeModel creativeModel;
        TemplateData templateData;
        CameraSlotModel cameraSlotModel;
        CreativeFlowData creativeFlowData;
        EditorProModel editorProModel;
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            return;
        }
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext == null || (creativeFlowData = shortVideoContext.creativeFlowData) == null || (editorProModel = creativeFlowData.getEditorProModel()) == null || !editorProModel.getFromEditorProEntranceInAlbum()) {
            C531700KtE.LIZ(this.LIZIZ, this.LIZ);
            C0LAB c0lab = this.LIZIZ;
            ShortVideoContext shortVideoContext2 = this.LIZ;
            c0lab.LJ("is_from_template_shoot", (shortVideoContext2 == null || (creativeModel = shortVideoContext2.creativeModel) == null || (templateData = creativeModel.templateData) == null || (cameraSlotModel = templateData.getCameraSlotModel()) == null || !cameraSlotModel.isFromShotClick()) ? false : true ? "1" : CardStruct.IStatusCode.DEFAULT);
            ShortVideoContext shortVideoContext3 = this.LIZ;
            if (shortVideoContext3 != null) {
                C0MJO.LIZIZ(shortVideoContext3.creativeModel, this.LIZIZ);
            }
            C0L5G c0l5g = C0L5G.LIZ;
            C0LAB c0lab2 = this.LIZIZ;
            ShortVideoContext shortVideoContext4 = this.LIZ;
            c0l5g.getClass();
            C0L5G.LIZJ(c0lab2, shortVideoContext4);
            C0LAB c0lab3 = this.LIZIZ;
            ShortVideoContext shortVideoContext5 = this.LIZ;
            c0lab3.LJ("is_aigc_prop_selected", (shortVideoContext5 == null || !shortVideoContext5.creativeModel.recordEffectModel.isAigcPropSelected) ? CardStruct.IStatusCode.DEFAULT : "1");
            C20684815ws.LJIILLIIL("upload_content_next", this.LIZIZ.LIZ);
        }
    }

    public final void LIZIZ(int i) {
        this.LIZIZ.LIZ(i, "duration_ms");
        this.LIZIZ.LIZ(i, "creation_duration");
    }

    public final void LIZJ(String str) {
        if (str != null) {
            this.LIZIZ.LJ("tt_template_id", str);
        }
        C0LAB c0lab = this.LIZIZ;
        if (str == null) {
            str = "";
        }
        c0lab.LJ("mv_id", str);
    }

    public final void LIZLLL(ShortVideoContext shortVideoContext) {
        String commentId;
        String enterMethod;
        if (shortVideoContext != null) {
            CommentVideoModel commentVideoModelLJFF = shortVideoContext.LJFF();
            C0LAB c0lab = this.LIZIZ;
            String userId = null;
            String str = "";
            if (!CommentUtils.needMob(shortVideoContext)) {
                commentId = "";
            } else if (commentVideoModelLJFF != null) {
                commentId = commentVideoModelLJFF.getCommentId();
            } else {
                commentId = null;
            }
            c0lab.LJ("reply_comment_id", commentId);
            if (!CommentUtils.needMob(shortVideoContext)) {
                userId = "";
            } else if (commentVideoModelLJFF != null) {
                userId = commentVideoModelLJFF.getUserId();
            }
            c0lab.LJ("reply_user_id", userId);
            if (commentVideoModelLJFF != null && (enterMethod = commentVideoModelLJFF.getEnterMethod()) != null) {
                str = enterMethod;
            }
            c0lab.LJ("enter_method", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0LAB] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C528210Knb(ShortVideoContext shortVideoContext, String str, String str2, int i, int i2, String str3, boolean z, String str4, boolean z2, boolean z3, boolean z4, int i3, List<? extends MediaModel> list, C528230Knd c528230Knd) {
        ?? LJJJJLI;
        int i4;
        String strLJJLIIIJ;
        int i5;
        String strLJIJJLI;
        Object objValueOf;
        int i6;
        String str5;
        String str6;
        String str7;
        int size;
        AILivePhotoModel aILivePhotoModel;
        PromptPageMobParam promptPageMobParam;
        CreativeModel creativeModel;
        String str8;
        CreativeModel creativeModel2;
        CelebrationData celebrationData;
        Integer celebrationType;
        String entranceType;
        CreativeModel creativeModel3;
        LivePhotoModel livePhotoModel;
        List<? extends MediaModel> list2;
        String str9;
        String str10;
        String boostedH5EnterPosition;
        String boostedH5EnterMethod;
        CreativeModel creativeModel4;
        CommonMobParamModel commonMobParamModel;
        CreativeModel creativeModel5;
        CelebrationData celebrationData2;
        Integer celebrationType2;
        String str11;
        List<String> list3;
        String str12;
        CreativeModel creativeModel6;
        LivePhotoModel livePhotoModel2;
        String str13 = str;
        this.LIZ = shortVideoContext;
        this.LIZIZ = new C0LAB();
        int i7 = 0;
        if (shortVideoContext != null) {
            LJJJJLI = shortVideoContext.LJJJJLI();
        } else {
            LJJJJLI = 0;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            i4 = 0;
        } else {
            Iterator<? extends MediaModel> it2 = list.iterator();
            i4 = 0;
            while (it2.hasNext()) {
                if (it2.next().LJIIL() && (i4 = i4 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        ?? r6 = this.LIZIZ;
        r6.LIZ(LJJJJLI, "is_use_sound_sync");
        ShortVideoContext shortVideoContext2 = this.LIZ;
        if (shortVideoContext2 != null && (creativeModel6 = shortVideoContext2.creativeModel) != null && (livePhotoModel2 = creativeModel6.livePhotoModel) != null && livePhotoModel2.enableLiveMode) {
            str13 = "live";
        }
        r6.LJ("content_type", str13);
        ShortVideoContext shortVideoContext3 = this.LIZ;
        r6.LJ("upload_method", (shortVideoContext3 == null || (str12 = shortVideoContext3.uploadMethod) == null) ? "" : str12);
        ShortVideoContext shortVideoContext4 = this.LIZ;
        if (shortVideoContext4 != null && (list3 = shortVideoContext4.uploadTabNameList) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list3, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        r6.LJ("upload_tab_name", strLJJLIIIJ);
        ShortVideoContext shortVideoContext5 = this.LIZ;
        r6.LJ("upload_next_method", (shortVideoContext5 == null || (str11 = shortVideoContext5.albumPreviewNextMethod) == null) ? "" : str11);
        r6.LJ("content_source", "upload");
        r6.LJ("upload_type", str2);
        r6.LJ("mix_type", str3);
        r6.LIZ(z ? 1 : 0, "is_multi_content");
        r6.LIZ(i2, "pic_cnt");
        r6.LIZ(i4, "highlights_cnt");
        r6.LIZ(i2, "current_content_nums");
        r6.LIZ(i, "video_cnt");
        r6.LIZ(z2 ? 1 : 0, "is_editor_pro");
        r6.LIZ(z3 ? 1 : 0, "is_pip");
        ShortVideoContext shortVideoContext6 = this.LIZ;
        if (shortVideoContext6 != null && (creativeModel5 = shortVideoContext6.creativeModel) != null && (celebrationData2 = creativeModel5.celebrationData) != null && (celebrationType2 = celebrationData2.getCelebrationType()) != null && celebrationType2.intValue() == 2) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        r6.LIZ(i5, "is_eoy");
        r6.LIZ(z4 ? 1 : 0, "is_replace");
        r6.LIZ(i3, "source_is_hdr");
        ShortVideoContext shortVideoContext7 = this.LIZ;
        if (shortVideoContext7 == null) {
            strLJIJJLI = "";
        } else {
            strLJIJJLI = shortVideoContext7.LJIJJLI();
        }
        r6.LJ("shoot_tab_name", strLJIJJLI);
        ShortVideoContext shortVideoContext8 = this.LIZ;
        String str14 = CardStruct.IStatusCode.DEFAULT;
        if (shortVideoContext8 != null) {
            objValueOf = Integer.valueOf(shortVideoContext8.LJJIJIIJIL() ? 1 : 0);
        } else {
            objValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        r6.LIZLLL(objValueOf, "if_photo_prop");
        ShortVideoContext shortVideoContext9 = this.LIZ;
        if (shortVideoContext9 != null && (creativeModel4 = shortVideoContext9.creativeModel) != null && (commonMobParamModel = creativeModel4.commonMobModel) != null && commonMobParamModel.isUploadDirectEnter) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        r6.LIZ(i6, "is_upload_direct_enter");
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        r6.LJ("is_login", str5);
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        r6.LJ("has_camera_permission", str6);
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        r6.LJ("has_microphone_permission", str7);
        r6.LJ("has_upload_permission", C522250Kdz.LIZ());
        C523280Kfe.LIZ.getClass();
        r6.LJ("is_private_access", C523280Kfe.LIZJ(true) ? "1" : str14);
        r6.LJ("content_size", str4);
        ShortVideoContext shortVideoContext10 = this.LIZ;
        if (shortVideoContext10 != null) {
            r6.LJ("shoot_way", shortVideoContext10.shootWay);
            r6.LJ("creation_id", this.LIZ.getCreationId());
            r6.LJ("creation_id", this.LIZ.getCreationId());
            if (this.LIZ.isClickFromAlbumPreview) {
                str9 = "album_content_detail";
            } else {
                str9 = "album_panel";
            }
            r6.LJ("enter_from", str9);
            if (d4.LJIILJJIL(this.LIZ)) {
                r6.LJ("upload_tab_position", "now");
            }
            PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams = this.LIZ.creativeModel.initialModel.photoModeAfterFeedbackMobParams;
            if (photoModeAfterCreationFeedbackMobParams != null && (boostedH5EnterMethod = photoModeAfterCreationFeedbackMobParams.getBoostedH5EnterMethod()) != null) {
                r6.LJ("info_photo_boosted_feedback_h5_enter_method", boostedH5EnterMethod);
            }
            PhotoModeAfterCreationFeedbackMobParams photoModeAfterCreationFeedbackMobParams2 = this.LIZ.creativeModel.initialModel.photoModeAfterFeedbackMobParams;
            if (photoModeAfterCreationFeedbackMobParams2 != null && (boostedH5EnterPosition = photoModeAfterCreationFeedbackMobParams2.getBoostedH5EnterPosition()) != null) {
                r6.LJ("info_photo_boosted_feedback_h5_shoot_position", boostedH5EnterPosition);
            }
            r6.LJ("shoot_enter_method", this.LIZ.enterMethod);
            if (c528230Knd == null || (str10 = c528230Knd.LIZJ) == null) {
                String str15 = this.LIZ.creativeModel.commonMobModel.shootEnterFrom;
                str10 = str15 != null ? str15 : "";
            }
            r6.LJ("shoot_enter_from", str10);
        } else if (c528230Knd != null) {
            r6.LJ("shoot_way", c528230Knd.LIZ);
            r6.LJ("shoot_enter_method", c528230Knd.LIZLLL);
            r6.LJ("shoot_enter_from", c528230Knd.LIZJ);
        }
        if (c528230Knd != null) {
            r6.LIZ(c528230Knd.LJ ? 1 : 0, "is_draft");
            r6.LJ("album_from_page", c528230Knd.LJI);
            r6.LJ("album_from_scene", c528230Knd.LJII);
        }
        ShortVideoContext shortVideoContext11 = this.LIZ;
        if (shortVideoContext11 != null && (creativeModel3 = shortVideoContext11.creativeModel) != null && (livePhotoModel = creativeModel3.livePhotoModel) != null && (list2 = livePhotoModel.importedLivePhotoList) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        r6.LIZ(size, "live_photo_cnt");
        ShortVideoContext shortVideoContext12 = this.LIZ;
        if (shortVideoContext12 != null && (creativeModel2 = shortVideoContext12.creativeModel) != null && (celebrationData = creativeModel2.celebrationData) != null && (celebrationType = celebrationData.getCelebrationType()) != null && celebrationType.intValue() == 2) {
            C0LAB c0lab = this.LIZIZ;
            c0lab.LJ("album_from_scene", "end_of_year_page");
            c0lab.LJ("album_from_page", "end_of_year_page");
            CelebrationData celebrationData3 = this.LIZ.creativeModel.celebrationData;
            if (celebrationData3 != null) {
                entranceType = celebrationData3.getEntranceType();
            } else {
                entranceType = null;
            }
            c0lab.LJ("eoy_entrance_type", entranceType);
        }
        ShortVideoContext shortVideoContext13 = this.LIZ;
        if (shortVideoContext13 != null && (creativeModel = shortVideoContext13.creativeModel) != null) {
            aILivePhotoModel = creativeModel.aiLivePhotoModel;
            if (aILivePhotoModel != null && aILivePhotoModel.aiLiveSwitchStyle != null) {
                this.LIZIZ.LJ("ai_livephoto_switch_type", aILivePhotoModel.aiLiveSwitchStyle);
                C0LAB c0lab2 = this.LIZIZ;
                if (aILivePhotoModel.aiLiveSwitch) {
                    str8 = "on";
                } else {
                    str8 = "off";
                }
                c0lab2.LJ("ai_livephoto_switch_status", str8);
            }
        } else {
            aILivePhotoModel = null;
        }
        ShortVideoContext shortVideoContext14 = this.LIZ;
        if (shortVideoContext14 != null && C577420Mkm.LIZ(true, shortVideoContext14)) {
            C0LAB c0lab3 = this.LIZIZ;
            if (aILivePhotoModel != null && (promptPageMobParam = aILivePhotoModel.mobParam) != null && promptPageMobParam.generateSidebarType == 2) {
                i7 = 1;
            }
            c0lab3.LIZ(i7, "is_alive_shoot_page_side_bar");
        }
        C528200Kna c528200Kna = new C528200Kna();
        for (MediaModel mediaModel : list) {
            if (mediaModel.LJIILJJIL()) {
                c528200Kna.LJ++;
            } else {
                c528200Kna.LIZLLL++;
            }
            if (mediaModel.LJIIIZ()) {
                c528200Kna.LIZIZ++;
            }
            if (mediaModel.LJI()) {
                c528200Kna.LIZ++;
            }
            if (mediaModel.LJII()) {
                c528200Kna.LIZJ++;
            }
        }
        C1402610mbT.LIZJ(this.LIZIZ, c528200Kna.LIZ, c528200Kna.LIZIZ, c528200Kna.LIZJ);
        C523270Kfd.LIZ(this.LIZIZ, this.LIZ, list, null);
        C527570KmZ c527570KmZ = C527570KmZ.LIZ;
        C0LAB c0lab4 = this.LIZIZ;
        ShortVideoContext shortVideoContext15 = this.LIZ;
        c527570KmZ.getClass();
        C527570KmZ.LIZ(c0lab4, shortVideoContext15, list);
    }

    public /* synthetic */ C528210Knb(ShortVideoContext shortVideoContext, String str, String str2, int i, int i2, String str3, boolean z, String str4, boolean z2, boolean z3, boolean z4, int i3, List list, C528230Knd c528230Knd, int i4) {
        this(shortVideoContext, str, str2, i, i2, str3, z, str4, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? false : z3, (i4 & 1024) != 0 ? false : z4, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1 : i3, list, (i4 & 8192) != 0 ? null : c528230Knd);
    }
}
