package X;

import Y.ACallableS415S0100000_8;
import Y.AObjectS203S0300000_8;
import Y.AObjectS284S0200000_8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.Intrinsics;
import l5a.a;

/* JADX INFO: renamed from: X.0MZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570560MZi {
    public static void LIZ(final AwemeDraft awemeDraft) {
        awemeDraft.LJ = null;
        awemeDraft.LJII = null;
        final boolean z = false;
        awemeDraft.LJIILJJIL = 0;
        awemeDraft.LJIIJ = 50;
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
        aVDraftExtras.isDraftMusicIllegal = true;
        awemeDraft.LIZJ = 2;
        CreativeFlowData creativeFlowData = aVDraftExtras.creativeFlowData;
        if (creativeFlowData != null && creativeFlowData.getEditorProModel() != null && awemeDraft.LJJJJIZL.creativeFlowData.getEditorProModel().isAdvancedEditDraft()) {
            z = true;
        }
        C391360FWc.LJ("DraftEditHelper.clearMusicAndRefreshDraft", new Function0() { // from class: X.0DyS
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AwemeDraft awemeDraft2 = awemeDraft;
                NLEEditor nLEEditorLJI = C570560MZi.LJI(awemeDraft2, Boolean.valueOf(z));
                if (nLEEditorLJI == null) {
                    return null;
                }
                Iterator<NLETrack> it2 = nLEEditorLJI.getModel().getTracks().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    NLETrack next = it2.next();
                    if (EnumC355960DxS.BGM.name().equals(next.getExtra("AudioTrackType"))) {
                        nLEEditorLJI.getModel().removeTrack(next);
                        break;
                    }
                }
                nLEEditorLJI.commit();
                nLEEditorLJI.done();
                awemeDraft2.LJIJJ(nLEEditorLJI.store());
                if (C350300DoK.LIZ()) {
                    awemeDraft2.LIZ.nleInfoModel.nleModel = nLEEditorLJI.getModel();
                    awemeDraft2.LIZ.nleInfoModel.nleDataChange = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clearMusic finally set nle data ");
                sbLIZ.append(awemeDraft2.LJIIJJI);
                C349910Dnh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        });
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.creativeModel.draftInfoModel.isDraft) {
            return false;
        }
        if (!C570690MZv.LIZJ.contains(Integer.valueOf(videoPublishEditModel.mDraftToEditFrom)) || C1428520nHG.LJJJLIIL(videoPublishEditModel) || videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate || videoPublishEditModel.getAILivePhotoModel().LJI()) {
            return false;
        }
        C548590LfN.LIZ.getClass();
        if (C548590LfN.LIZ().LIZLLL(videoPublishEditModel.creativeModel)) {
            return false;
        }
        if (LJIILL(videoPublishEditModel)) {
            videoPublishEditModel.setDirectToPublishByNewExp(true);
            return true;
        }
        if (!C570690MZv.LIZ(videoPublishEditModel)) {
            return false;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.pugcTemplateData.hasI2V || creativeModel.editorProAIGCInfoModel.taskInfoInCreativeModel.needBlockLeaveEditorPro || creativeModel.magicCombineEffectModel.taskInfoInCreativeModel.needBlockLeaveEditorPro) {
            return false;
        }
        videoPublishEditModel.setDirectToPublishByNewExp(true);
        if (videoPublishEditModel.getCreativeInfo() != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(new C2232408os(C741040T5a.LIZ)), null, null, new C535320Kz4(videoPublishEditModel.getCreativeInfo(), null), 3);
        }
        return true;
    }

    public static String LJII(AwemeDraft awemeDraft) {
        if (awemeDraft == null) {
            return "";
        }
        if (awemeDraft.LJJJJIZL.isPhotoMvMode) {
            return "slideshow";
        }
        if (awemeDraft.LJIIZILJ() || awemeDraft.LJJJJIZL.cutSameData != null) {
            return "mv";
        }
        if (awemeDraft.LJIIIIZZ()) {
            return "autocut";
        }
        return "video";
    }

    public static void LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        String creationId;
        String creationId2;
        a aVar = a.LIZIZ;
        if (videoPublishEditModel == null) {
            creationId = null;
        } else {
            creationId = videoPublishEditModel.getCreationId();
        }
        aVar.LIZ(creationId);
        if (videoPublishEditModel == null) {
            creationId2 = null;
        } else {
            creationId2 = videoPublishEditModel.getCreationId();
        }
        aVar.LIZIZ(creationId2, new C1429980nJc(EnumC1429920nJW.DRAFT_BACK, videoPublishEditModel, null), null);
    }

    public static boolean LJIILL(VideoPublishEditModel videoPublishEditModel) {
        if (C1428470nHB.LLIIIILZ(videoPublishEditModel)) {
            if (videoPublishEditModel.isFromCrash()) {
                return false;
            }
            if (videoPublishEditModel.mDraftToEditFrom == 3) {
                return true;
            }
            C0M2U.LIZ.getClass();
            return C0M2U.LIZLLL.contains(videoPublishEditModel.getCreativeModel().draftInfoModel.saveDraftScene);
        }
        if (!C571290Mat.LIZIZ(videoPublishEditModel) && !C571290Mat.LIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static NLEEditor LJI(AwemeDraft awemeDraft, Boolean bool) {
        String str;
        if (!TextUtils.isEmpty(awemeDraft.LIZ.nleInfoModel.nleDataPath)) {
            str = awemeDraft.LIZ.nleInfoModel.nleDataPath;
        } else {
            str = awemeDraft.LJJJJIZL.nleDataPath;
        }
        NLEInfoModel nLEInfoModel = awemeDraft.LIZ.nleInfoModel;
        nLEInfoModel.nleDataVersion = C349900Dng.LIZ(nLEInfoModel.nleDataVersion, str, bool.booleanValue()).getSecond().intValue();
        if (TextUtils.isEmpty(awemeDraft.LJIIJJI) && !TextUtils.isEmpty(str)) {
            awemeDraft.LJIJJ(C2354709Kn.LJIJ(str));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("generateNLEEditor read nle path ");
            sbLIZ.append(str);
            sbLIZ.append(" data ");
            sbLIZ.append(awemeDraft.LJIIJJI);
            C349910Dnh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (TextUtils.isEmpty(awemeDraft.LJIIJJI)) {
            return null;
        }
        C0CHQ.LIZ().LJJIZ();
        C0FGC.LIZ(2);
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("DraftEditHelper restore nle data: ");
        sbLIZ2.append(awemeDraft.LJIIJJI);
        C201955140j.LJIILJJIL(c0may, C2188811AlT.LIZIZ(sbLIZ2));
        nLEEditorLIZ.restore(awemeDraft.LJIIJJI);
        if (C350300DoK.LIZ()) {
            awemeDraft.LIZ.nleInfoModel.nleModel = nLEEditorLIZ.getModel();
            awemeDraft.LIZ.nleInfoModel.nleDataChange = false;
        }
        return nLEEditorLIZ;
    }

    public static String LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, AwemeDraft awemeDraft) {
        int i = awemeDraft.LJIJI;
        if (i == 2000) {
            return "click_profile_guide_widget";
        }
        int i2 = videoPublishEditModel.mDraftToEditFrom;
        if (i2 == 0) {
            return "personal_homepage";
        }
        if (i2 == 3000) {
            return "shoot_page_edit_tab";
        }
        if (i2 == 5) {
            return "notification_page";
        }
        if (i2 == 2) {
            return "click_continue_popup";
        }
        if (i == 0) {
            return "personal_homepage";
        }
        if (i == 3) {
            return "share_panel";
        }
        if (i == 4) {
            return "subonly_videolist";
        }
        if (i == 10) {
            return "music_detail_page";
        }
        if (i == 11) {
            return "music_detail_recall_page";
        }
        if (i == 12) {
            return "effect_detail_recall_page";
        }
        return "";
    }

    public static void LJIILJJIL(AwemeDraft awemeDraft, VideoPublishEditModel videoPublishEditModel) {
        String str;
        String str2;
        String str3;
        int i;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", awemeDraft.LIZ());
        c0lab.LJ("shoot_way", awemeDraft.LJJJJIZL.shootWay);
        c0lab.LIZ(awemeDraft.LJIIL + 1, "draft_list_order");
        c0lab.LIZLLL(Double.valueOf(C0MJM.LIZ(awemeDraft.saveTime)), "since_first_save_time");
        int i2 = awemeDraft.LJJJJIZL.draftId;
        if (i2 != 0) {
            c0lab.LIZ(i2, "draft_id");
        }
        c0lab.LJ("content_type", LJII(awemeDraft));
        if (!awemeDraft.LJIIZILJ() && (i = awemeDraft.LJJJJIZL.from) != 1 && i != 0) {
            str = "shoot";
        } else {
            str = "upload";
        }
        c0lab.LJ("content_source", str);
        AVMusic aVMusic = awemeDraft.LJ;
        if (aVMusic != null) {
            c0lab.LIZIZ(aVMusic.id, "music_id");
        }
        c0lab.LIZ(videoPublishEditModel.isDefaultProp ? 1 : 0, "is_default_prop");
        c0lab.LJ("prop_list", videoPublishEditModel.getStickers());
        c0lab.LJ("from_prop_id", videoPublishEditModel.fromPropId);
        int i3 = awemeDraft.LJIJI;
        if (i3 != 0) {
            if (i3 != 3) {
                str2 = "";
            } else {
                str2 = "delete_and_edit_draft";
            }
        } else {
            str2 = "general_draft_list";
        }
        c0lab.LJ("draft_way", str2);
        String str4 = "1";
        if (awemeDraft.LJJJI) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_posted_draft", str3);
        c0lab.LJ("enter_from", LJIIIIZZ(videoPublishEditModel, awemeDraft));
        if (!awemeDraft.LIZ.pugcTemplateData.isFromCreateTemplate) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_template_draft", str4);
        int i4 = 0;
        if (videoPublishEditModel.isPostDraftPrompt()) {
            i4 = 1;
        }
        c0lab.LIZLLL(i4, "is_post_draft_prompt");
        C570640MZq.LIZ(c0lab, videoPublishEditModel);
        C365970EWl.LIZ.getClass();
        c0lab.LJI(C365970EWl.LIZ(videoPublishEditModel));
        C562560M4o.LIZJ(c0lab, videoPublishEditModel.getAILivePhotoModel(), null);
        C548590LfN.LIZ.getClass();
        C548590LfN.LIZJ();
        C548590LfN.LIZJ().LIZ(awemeDraft.LIZ, c0lab);
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0lab.LIZIZ(C562270M3l.LIZJ(awemeDraft.saveTime, jCurrentTimeMillis), "draft_create_days");
        c0lab.LIZIZ(C562270M3l.LIZJ(awemeDraft.lastEditTime, jCurrentTimeMillis), "draft_last_edit_days");
        c0lab.LIZ(1, "is_available_sound");
        C20684815ws.LJIILLIIL("edit_draft", c0lab.LIZ);
    }

    public static Boolean LJIILLIIL(final AwemeDraft awemeDraft, List<C570670MZt> list) {
        final boolean z;
        String str;
        Boolean bool = Boolean.FALSE;
        int i = 1;
        final Long[] lArr = {0L};
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        List<SoundEffect> list2 = awemeDraft.LIZ.soundEffectInfoModel.soundEffectList;
        ArrayList arrayList3 = new ArrayList();
        ArrayList<C570670MZt> arrayList4 = (ArrayList) list;
        for (C570670MZt c570670MZt : arrayList4) {
            if (!c570670MZt.LIZIZ) {
                bool = Boolean.TRUE;
                arrayList.add(c570670MZt.LIZ);
                arrayList2.add(c570670MZt);
            } else if (!c570670MZt.LIZJ) {
                arrayList2.add(c570670MZt);
            } else {
                arrayList3.add(ListProtector.get(list2, arrayList4.indexOf(c570670MZt)));
            }
        }
        C0E6D c0e6d = C0E6D.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("newSoundEffectList:");
        sbLIZ.append(arrayList3);
        C356530DyN.LIZ(c0e6d, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("removedList:");
        sbLIZ2.append(arrayList2);
        C356530DyN.LIZ(c0e6d, C2188811AlT.LIZIZ(sbLIZ2));
        awemeDraft.LIZ.soundEffectInfoModel.soundEffectList = arrayList3;
        if (arrayList2.isEmpty()) {
            return Boolean.FALSE;
        }
        CreativeFlowData creativeFlowData = awemeDraft.LJJJJIZL.creativeFlowData;
        if (creativeFlowData != null && creativeFlowData.getEditorProModel() != null && awemeDraft.LJJJJIZL.creativeFlowData.getEditorProModel().isAdvancedEditDraft()) {
            z = true;
        } else {
            z = false;
        }
        C391360FWc.LJ("DraftEditHelper.removeSoundEffectIfNeeded", new Function0() { // from class: X.0DyT
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AwemeDraft awemeDraft2 = awemeDraft;
                boolean z2 = z;
                ArrayList<C570670MZt> arrayList5 = arrayList2;
                Long[] lArr2 = lArr;
                NLEEditor nLEEditorLJI = C570560MZi.LJI(awemeDraft2, Boolean.valueOf(z2));
                if (nLEEditorLJI == null) {
                    C356530DyN.LIZ(C0E6D.LIZIZ, "nleEditor is null");
                    return null;
                }
                for (C570670MZt c570670MZt2 : arrayList5) {
                    NLEModel model = nLEEditorLJI.getModel();
                    String str2 = c570670MZt2.LIZ;
                    VecNLETrackSPtr tracks = model.getTracks();
                    ArrayList<NLETrack> arrayList6 = new ArrayList();
                    for (NLETrack nLETrack : tracks) {
                        if (C351220Dpo.LLLILZLLLI(nLETrack)) {
                            arrayList6.add(nLETrack);
                        }
                    }
                    for (NLETrack nLETrack2 : arrayList6) {
                        for (NLETrackSlot nLETrackSlot : nLETrack2.getSortedSlots()) {
                            String extra = nLETrackSlot.getExtra("ep_audio_music_id");
                            if (extra != null && Intrinsics.LJFF(extra, str2)) {
                                nLETrack2.removeSlot(nLETrackSlot);
                            }
                        }
                    }
                }
                C348850Dlz.LJII(nLEEditorLJI.getModel());
                nLEEditorLJI.commit();
                nLEEditorLJI.done();
                awemeDraft2.LJIJJ(nLEEditorLJI.store());
                if (C350300DoK.LIZ()) {
                    awemeDraft2.LIZ.nleInfoModel.nleModel = nLEEditorLJI.getModel();
                    awemeDraft2.LIZ.nleInfoModel.nleDataChange = false;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("removeSoundEffectIfNeeded finally set nle data ");
                sbLIZ3.append(awemeDraft2.LJIIJJI);
                C349910Dnh.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                lArr2[0] = Long.valueOf(nLEEditorLJI.getModel().getDuration());
                return null;
            }
        });
        if (bool.booleanValue()) {
            long jLongValue = lArr[0].longValue();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("shoot_way", awemeDraft.LJJJJIZL.shootWay);
            c0lab.LJ("content_source", C0MZ9.LIZIZ(awemeDraft));
            c0lab.LJ("content_type", C0MZ9.LIZJ(awemeDraft));
            c0lab.LIZIZ(jLongValue, "creation_duration");
            c0lab.LJ("creation_id", awemeDraft.LIZ());
            if (awemeDraft.LIZ.reuseSoundAndEffectModel.isMusicFromDiscoveryPage()) {
                str = "prop_panel_discovery";
            } else {
                str = awemeDraft.LJJJJIZL.musicOrigin;
            }
            c0lab.LJ("music_selected_from", str);
            AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
            if (aVDraftExtras.videoCount + aVDraftExtras.photoCount <= 1) {
                i = 0;
            }
            c0lab.LIZ(i, "is_multi_content");
            c0lab.LIZ(awemeDraft.LJJJJIZL.videoCount, "video_cnt");
            c0lab.LIZ(awemeDraft.LJJJJIZL.photoCount, "pic_cnt");
            c0lab.LJ("draft_way", "general_draft_list");
            c0lab.LJ("sound_effect_list", arrayList.toString());
            c0lab.LJ("draft_id", awemeDraft.LJJJJIZL.newDraftId);
            C20684815ws.LJIILLIIL("draft_sound_effect_delete_toast", c0lab.LIZ);
        }
        return bool;
    }

    public static void LJIILIIL(AwemeDraft awemeDraft, VideoPublishEditModel videoPublishEditModel, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        int iNextInt = new SecureRandom().nextInt(Integer.MAX_VALUE);
        awemeDraft.LJJJJIZL.draftId = iNextInt;
        videoPublishEditModel.setDraftId(iNextInt);
        if (TextUtils.isEmpty(awemeDraft.LJJJJIZL.newDraftId)) {
            awemeDraft.LJJJJIZL.newDraftId = C09DJ.LIZ();
            C15O7.LIZJ(new ACallableS415S0100000_8(awemeDraft, 19));
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", awemeDraft.LIZ());
        c0lab.LJ("shoot_way", awemeDraft.LJJJJIZL.shootWay);
        c0lab.LIZ(awemeDraft.LJIIL + 1, "draft_list_order");
        c0lab.LIZLLL(Double.valueOf(C0MJM.LIZ(awemeDraft.saveTime)), "since_first_save_time");
        int i2 = awemeDraft.LJJJJIZL.draftId;
        if (i2 != 0) {
            c0lab.LIZ(i2, "draft_id");
        }
        if (!TextUtils.isEmpty(awemeDraft.LJJJJIZL.newDraftId)) {
            c0lab.LJ("new_draft_id", awemeDraft.LJJJJIZL.newDraftId);
        }
        C1404800mf0.LIZIZ(awemeDraft.LIZ());
        c0lab.LJ("content_type", LJII(awemeDraft));
        if (!awemeDraft.LJIIZILJ() && (i = awemeDraft.LJJJJIZL.from) != 1 && i != 0) {
            str2 = "shoot";
        } else {
            str2 = "upload";
        }
        c0lab.LJ("content_source", str2);
        AVMusic aVMusic = awemeDraft.LJ;
        if (aVMusic != null) {
            c0lab.LIZIZ(aVMusic.id, "music_id");
        }
        c0lab.LIZ(videoPublishEditModel.isDefaultProp ? 1 : 0, "is_default_prop");
        c0lab.LJ("prop_list", videoPublishEditModel.getStickers());
        c0lab.LJ("from_prop_id", videoPublishEditModel.fromPropId);
        int i3 = awemeDraft.LJIJI;
        if (i3 != 0) {
            if (i3 != 3) {
                str3 = "";
            } else {
                str3 = "delete_and_edit_draft";
            }
        } else {
            str3 = "general_draft_list";
        }
        c0lab.LJ("draft_way", str3);
        String str6 = "1";
        if (awemeDraft.LJJJI) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_posted_draft", str4);
        if (awemeDraft.LIZ.draftBoxModel.isPostInDraftBox) {
            c0lab.LJ("enter_from", "managedrafts");
        } else {
            c0lab.LJ("enter_from", LJIIIIZZ(videoPublishEditModel, awemeDraft));
        }
        if (!awemeDraft.LIZ.pugcTemplateData.isFromCreateTemplate) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_template_draft", str6);
        int i4 = 0;
        int i5 = 0;
        if (videoPublishEditModel.isPostDraftPrompt()) {
            i5 = 1;
        }
        if (awemeDraft.LJIJI == 3000) {
            i4 = 1;
        }
        boolean z = awemeDraft.LIZ.draftBoxModel.isPostInDraftBox;
        c0lab.LIZ(z ? 1 : 0, "is_multi_selection_mode");
        if (z) {
            str5 = "multi";
        } else {
            str5 = "single";
        }
        c0lab.LJ("selection_mode", str5);
        c0lab.LJ("draft_select_page_type", str);
        c0lab.LIZ(awemeDraft.LIZ.detailPageRecallDraftModel.isDetailPageRecallDraft, "is_detail_page_recall_draft");
        c0lab.LJ("sort_by", awemeDraft.LIZ.draftBoxModel.sortBy);
        if (C0MUK.LIZ(awemeDraft.LIZ) != null) {
            c0lab.LJ("ai_video_tool_name", C0MUK.LIZ(awemeDraft.LIZ));
        }
        c0lab.LJ("filter_by", awemeDraft.LIZ.draftBoxModel.filterBy);
        c0lab.LIZLLL(i5, "is_post_draft_prompt");
        C570640MZq.LIZ(c0lab, videoPublishEditModel);
        C365970EWl.LIZ.getClass();
        c0lab.LJI(C365970EWl.LIZ(videoPublishEditModel));
        C562560M4o.LIZJ(c0lab, videoPublishEditModel.getAILivePhotoModel(), null);
        C548590LfN.LIZ.getClass();
        C548590LfN.LIZJ();
        C548590LfN.LIZJ().LIZ(awemeDraft.LIZ, c0lab);
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0lab.LIZIZ(C562270M3l.LIZJ(awemeDraft.saveTime, jCurrentTimeMillis), "draft_create_days");
        c0lab.LIZIZ(C562270M3l.LIZJ(awemeDraft.lastEditTime, jCurrentTimeMillis), "draft_last_edit_days");
        c0lab.LIZ(1, "is_available_sound");
        c0lab.LIZ(i4, "is_from_edit_tab");
        C20684815ws.LJIILLIIL("edit_draft", c0lab.LIZ);
    }

    public static void LIZIZ(Context context, AwemeDraft awemeDraft, VideoPublishEditModel videoPublishEditModel, long j, Boolean bool) {
        LJIIIZ(videoPublishEditModel);
        Intent intent = new Intent();
        intent.putExtra("shoot_way", "restore_crash");
        intent.putExtra("translation_type", 3);
        C201955140j.LIZJ(C0MAY.LIZIZ, "GoPublishActivity from draft");
        intent.putExtra("fromDraft", 1);
        intent.putExtra("draft_to_edit_from", 2);
        intent.putExtra("edit_publish_session_end_together", true);
        intent.putExtra("draft_to_edit_start_time", j);
        intent.putExtra("draft_modify_time", awemeDraft.lastEditTime);
        videoPublishEditModel.setApplyVoiceToAllTextSwitch(awemeDraft.LJJJJIZL.applyVoiceToAllTextSwitch);
        C571770Mbf c571770Mbf = new C571770Mbf();
        c571770Mbf.LIZ = awemeDraft;
        intent.putExtra("draft_file_size", c571770Mbf.LIZIZ());
        videoPublishEditModel.creativeModel.restoreModel.isFromRestoreRecover = !bool.booleanValue();
        if (LJIILL(videoPublishEditModel)) {
            videoPublishEditModel.creativeModel.imagePublishModel.singlePhotoDirectPublish = true;
        }
        C2342609Fw.LIZ = new C2342509Fv("restore_crash", awemeDraft.LIZ());
        C1452640nuA.LJII(awemeDraft.LJ, false, videoPublishEditModel.creativeModel.musicBuzModel);
        if (C1428470nHB.LJJJLIIL(videoPublishEditModel)) {
            if (C1428470nHB.LJJZZIII(videoPublishEditModel)) {
                C1436990nUv.LJIIJJI(videoPublishEditModel);
            } else {
                C1436990nUv.LJIIIIZZ(videoPublishEditModel, false);
            }
        }
        C1202040hNy.LIZ.getClass();
        C1202040hNy.LIZ(videoPublishEditModel);
        C391370FWd.LIZ("", new AObjectS203S0300000_8(context, intent, videoPublishEditModel, 2));
        C391360FWc.LJ("restore_nle_data", new AObjectS203S0300000_8(context, intent, videoPublishEditModel, 3));
    }

    public static Intent LIZJ(VideoPublishEditModel videoPublishEditModel, int i, long j, AwemeDraft awemeDraft, boolean z) {
        C570750Ma1.LIZ.getClass();
        Intent intentLIZJ = C570750Ma1.LIZJ(i, videoPublishEditModel);
        intentLIZJ.putExtra("enter_edit_page_method", "click_draft");
        intentLIZJ.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        intentLIZJ.putExtra("translation_type", 3);
        C201955140j.LIZJ(C0MAY.LIZIZ, "GoPublishActivity from draft");
        intentLIZJ.putExtra("fromDraft", 1);
        intentLIZJ.putExtra("draft_to_edit_from", i);
        intentLIZJ.putExtra("edit_publish_session_end_together", true);
        intentLIZJ.putExtra("draft_to_edit_start_time", j);
        intentLIZJ.putExtra("draft_modify_time", awemeDraft.lastEditTime);
        C571770Mbf c571770Mbf = new C571770Mbf();
        c571770Mbf.LIZ = awemeDraft;
        intentLIZJ.putExtra("draft_file_size", c571770Mbf.LIZIZ());
        intentLIZJ.putExtra("open_platform_extra", videoPublishEditModel.getOpenPlatformExtra());
        intentLIZJ.putExtra("open_platform_client_key", videoPublishEditModel.getOpenPlatformClientKey());
        intentLIZJ.putExtra("from_prop_id", videoPublishEditModel.fromPropId);
        return intentLIZJ;
    }

    public static void LJFF(Activity activity, AwemeDraft awemeDraft, int i, long j, C0M0R c0m0r) {
        LJ(activity, awemeDraft, i, j, c0m0r, null, "page");
    }

    public static void LJIIJ(Context context, AwemeDraft awemeDraft, boolean z, VideoPublishEditModel videoPublishEditModel, long j) {
        Map<SingleImageData, Integer> needCompileImages;
        C0CHQ.LIZ().LJJIZ();
        videoPublishEditModel.mDraftToEditFrom = 2;
        videoPublishEditModel.setEnterFrom("draft_again");
        LJIIIZ(videoPublishEditModel);
        Intent intentLIZJ = LIZJ(videoPublishEditModel, 2, j, awemeDraft, false);
        C0MUK.LIZIZ(intentLIZJ).restoreModel.isFromRestoreRecover = !z;
        C570750Ma1 c570750Ma1 = C570750Ma1.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        AObjectS284S0200000_8 aObjectS284S0200000_8 = new AObjectS284S0200000_8(context, intentLIZJ, 4);
        c570750Ma1.getClass();
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (needCompileImages = imageAlbumData.getNeedCompileImages()) != null && (!needCompileImages.isEmpty())) {
            C570750Ma1.LIZIZ(c19egLIZIZ);
            ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData2 != null) {
                C574070MfN.LIZ(videoPublishEditModel.getCreativeInfo(), videoPublishEditModel.creativeModel, imageAlbumData2, needCompileImages, new AwS409S0200000_8(c19egLIZIZ, aObjectS284S0200000_8, 136));
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        aObjectS284S0200000_8.invoke();
    }

    public static void LJIIL(Activity activity, AwemeDraft awemeDraft, boolean z, VideoPublishEditModel videoPublishEditModel, int i, long j) {
        videoPublishEditModel.mDraftToEditFrom = i;
        videoPublishEditModel.setEnterFrom("draft_again");
        LJIIIZ(videoPublishEditModel);
        Intent intentLIZJ = LIZJ(videoPublishEditModel, i, j, awemeDraft, false);
        C0MUK.LIZIZ(intentLIZJ).restoreModel.isFromRestoreRecover = !z;
        if (C1428520nHG.LJJJJJ(videoPublishEditModel)) {
            intentLIZJ.putExtra("editor_pro_start_time", System.currentTimeMillis());
        }
        if (u4.LJLL(videoPublishEditModel) && C0L4C.LIZ()) {
            C1660680tJi.LIZ().LJIIZILJ(activity, intentLIZJ, false);
        } else {
            C1660680tJi.LIZ().LJIILIIL(activity, intentLIZJ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0171, code lost:
    
        if (X.C1428640nHS.LIZIZ() == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0MZh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(final android.app.Activity r11, final com.ss.android.ugc.aweme.draft.model.AwemeDraft r12, final int r13, final long r14, com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter r16, final com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener r17, final java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C570560MZi.LJ(android.app.Activity, com.ss.android.ugc.aweme.draft.model.AwemeDraft, int, long, com.ss.android.ugc.aweme.services.draft.DraftListenerAdapter, com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener, java.lang.String):void");
    }

    public static void LJIIJJI(Context context, AwemeDraft awemeDraft, boolean z, VideoPublishEditModel videoPublishEditModel, int i, long j, String str, boolean z2) {
        C0CHQ.LIZ().LJJIZ();
        videoPublishEditModel.mDraftToEditFrom = i;
        videoPublishEditModel.setEnterFrom("draft_again");
        LJIIIZ(videoPublishEditModel);
        Intent intentLIZJ = LIZJ(videoPublishEditModel, i, j, awemeDraft, false);
        if (z2) {
            C0MUK.LIZIZ(intentLIZJ).text2ImageModel.asyncEntrance = str;
        } else {
            C0MUK.LIZIZ(intentLIZJ).text2ImageModel.entrance = str;
        }
        C0MUK.LIZIZ(intentLIZJ).restoreModel.isFromRestoreRecover = !z;
        if (!videoPublishEditModel.creativeModel.text2ImageModel.imageTaskList.isEmpty()) {
            intentLIZJ.putExtra("direct_to_choose", true);
            C1660680tJi.LIZ().LJFF(context, intentLIZJ);
        } else {
            C1660680tJi.LIZ().LJIL(context, intentLIZJ);
        }
    }
}
