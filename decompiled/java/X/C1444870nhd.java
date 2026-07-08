package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.MBeautyStateInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS287S0000000_4;
import kotlin.jvm.internal.AwS0S1700000_22;
import kotlin.jvm.internal.AwS37S0600000_22;
import kotlin.jvm.internal.Intrinsics;
import ln3.a;
import lnn.q;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nhd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444870nhd {
    public static final C1444870nhd LIZ = new C1444870nhd();

    public static void LIZIZ(Activity activity, ShortVideoContext shortVideoContext, C1DRG c1drg, EditEffectAnchorManager editEffectAnchorManager, Boolean bool) {
        String strS80;
        String id;
        Integer numValueOf;
        ComposerBeautyBuriedInfo composerBeautyBuriedInfo;
        MBeautyStateInfo mBeautyStateInfo;
        C12I9 c12i9Je;
        C12I9 c12i9Je2;
        C385670FAf<FilterBean> c385670FAfI70;
        FilterBean filterBeanLIZJ;
        if (C343070Dcf.LIZ() && c1drg.LIZJ(InterfaceC1650930t3z.class)) {
            ((C0ETY) c1drg.LJII(C0ETY.class, null)).Sd(InterfaceC1650930t3z.class, new AwS37S0600000_22(c1drg, shortVideoContext, activity, editEffectAnchorManager, c1drg, bool, 1));
            return;
        }
        InterfaceC1650930t3z interfaceC1650930t3z = (InterfaceC1650930t3z) c1drg.LJIIL(null, InterfaceC1650930t3z.class);
        if (interfaceC1650930t3z == null || (strS80 = interfaceC1650930t3z.S80()) == null) {
            strS80 = "";
        }
        InterfaceC1644770su3 interfaceC1644770su3 = (InterfaceC1644770su3) c1drg.LJIIL(null, InterfaceC1644770su3.class);
        if (interfaceC1644770su3 != null && (c385670FAfI70 = interfaceC1644770su3.i70()) != null && (filterBeanLIZJ = c385670FAfI70.LIZJ()) != null) {
            id = filterBeanLIZJ.getId();
        } else {
            id = null;
        }
        a aVar = (a) c1drg.LJIIL(null, a.class);
        if (aVar != null) {
            numValueOf = Integer.valueOf(aVar.Ty0());
        } else {
            numValueOf = null;
        }
        LIZ.getClass();
        if (aVar == null || (c12i9Je2 = aVar.je()) == null || (composerBeautyBuriedInfo = c12i9Je2.Ne()) == null) {
            composerBeautyBuriedInfo = new ComposerBeautyBuriedInfo(0, 0, 0, null, 15, null);
        }
        if (aVar == null || (c12i9Je = aVar.je()) == null || (mBeautyStateInfo = c12i9Je.Ke()) == null) {
            mBeautyStateInfo = new MBeautyStateInfo(0, 0);
        }
        C0CNO.LIZ(C15O7.LJI, new AwS0S1700000_22(activity, c1drg, composerBeautyBuriedInfo, mBeautyStateInfo, editEffectAnchorManager, shortVideoContext, bool, numValueOf, strS80, id, 1));
    }

    public static final void LIZ(ShortVideoContext shortVideoContext, EditEffectAnchorManager editEffectAnchorManager, InterfaceC1647520syU interfaceC1647520syU, String str, Boolean bool, Effect effect) {
        String enterMethod;
        String commentId;
        String userId;
        String uid;
        String str2;
        C0FTJ c0ftj;
        StickerModel stickerModelLJLI;
        AddYoursStickerModel addYoursStickerModel;
        String str3;
        String followupSquareActionPosition;
        String strIsFromFollowupSquareOriginalVideo;
        String followupSquareRecommendType;
        String followupSquareRecommendReason;
        EnumC538190L8v enumC538190L8v;
        String str4;
        String str5;
        String str6;
        String str7;
        List<C0FTJ<StickerModel>> listLLLLLZ;
        String str8;
        String str9;
        String effectId;
        CommentVideoModel commentVideoModelLJFF = shortVideoContext.LJFF();
        String str10 = "";
        if ((commentVideoModelLJFF == null || (enterMethod = commentVideoModelLJFF.getEnterMethod()) == null) && (enterMethod = shortVideoContext.enterAlbumMethod) == null) {
            enterMethod = "";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("content_source", shortVideoContext.LJ().getContentSource());
        c0lab.LJ("content_type", shortVideoContext.LJ().getContentType());
        Object followupSquareVideoRank = null;
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
        } else {
            userId = null;
        }
        c0lab.LJ("reply_user_id", userId);
        c0lab.LJ("enter_from", str);
        c0lab.LJ("group_id", C1443560nfW.LJIIIIZZ());
        User user = shortVideoContext.duetFromUser;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c0lab.LJ("author_id", uid);
        c0lab.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
        c0lab.LJ("enter_method", enterMethod);
        String str11 = shortVideoContext.creativeModel.commonMobModel.shootEnterFrom;
        if (str11 != null) {
            str10 = str11;
        }
        c0lab.LJ("shoot_enter_from", str10);
        c0lab.LJ("shoot_enter_method", shortVideoContext.enterMethod);
        int i = shortVideoContext.draftId;
        if (i != 0) {
            c0lab.LIZ(i, "draft_id");
        }
        if (shortVideoContext.newDraftId.length() > 0) {
            c0lab.LJ("new_draft_id", shortVideoContext.newDraftId);
        }
        if (Intrinsics.LJFF("anchor_combine_tts", shortVideoContext.shootWay)) {
            TTSVoiceModel tTSVoiceModel = shortVideoContext.ttsVoiceModel;
            if (tTSVoiceModel != null) {
                effectId = tTSVoiceModel.getEffectId();
            } else {
                effectId = null;
            }
            c0lab.LJ("tone_list", effectId);
        }
        c0lab.LJ("shoot_page", "video_shoot_page");
        c0lab.LJ("shoot_tab_name", shortVideoContext.LJIJJLI());
        C533810Kwd.LIZ(c0lab);
        String str12 = shortVideoContext.creativeModel.initialModel.profileParametersModel.guideWording;
        if (!TextUtils.isEmpty(str12)) {
            c0lab.LJ("wording", str12);
        }
        if (editEffectAnchorManager != null) {
            List<EditEffectAnchorInfo> data = editEffectAnchorManager.getData();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(data, 10));
            Iterator<EditEffectAnchorInfo> it2 = data.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().effectId);
            }
            if (editEffectAnchorManager.isTemplate()) {
                str9 = "effect_template_list";
            } else {
                str9 = "effect_id";
            }
            c0lab.LJ(str9, C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        }
        StreamVoiceConversionModel streamVoiceConversionModel = shortVideoContext.creativeModel.streamVoiceConversionModel;
        if (streamVoiceConversionModel.vcShootingEffectId.length() > 0 && Intrinsics.LJFF(streamVoiceConversionModel.vcShootingEffectId, streamVoiceConversionModel.vcVoiceId)) {
            str2 = "vc_page";
        } else if (streamVoiceConversionModel.vcShootingEffectId.length() > 0) {
            str2 = streamVoiceConversionModel.vcShootingEffectIdFrom;
        } else {
            str2 = null;
        }
        if (C123100dR.LIZ(str2)) {
            c0lab.LIZ(1, "is_voice_effect");
            c0lab.LJ("voice_modify_id", shortVideoContext.creativeModel.streamVoiceConversionModel.vcShootingEffectId);
            c0lab.LJ("voice_effect_selected_from", str2);
        }
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "ec_write_review")) {
            RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
            if (recordPageOptionalConfig != null) {
                str8 = recordPageOptionalConfig.previousPage;
            } else {
                str8 = null;
            }
            c0lab.LJ("previous_page", str8);
        }
        if (interfaceC1647520syU != null && (listLLLLLZ = interfaceC1647520syU.LLLLLZ(EnumC1466150oFx.ADD_YOURS)) != null) {
            c0ftj = (C0FTJ) C13LP.LJJJLL(listLLLLLZ);
        } else {
            c0ftj = null;
        }
        C1403900mdY c1403900mdY = C1403900mdY.LIZ;
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        if (c0ftj != null) {
            stickerModelLJLI = c0ftj.LJLI();
        } else {
            stickerModelLJLI = null;
        }
        if (stickerModelLJLI instanceof AddYoursStickerModel) {
            addYoursStickerModel = (AddYoursStickerModel) stickerModelLJLI;
        } else {
            addYoursStickerModel = null;
        }
        c1403900mdY.getClass();
        C1403900mdY.LIZJ(creativeModel, addYoursStickerModel, c0lab);
        C1403900mdY.LIZIZ(shortVideoContext.creativeModel, c0lab);
        C1403900mdY.LJII(shortVideoContext.creativeModel, c0lab);
        if (C0CHQ.LIZ().LJJIIZI().LJJJLIIL(false)) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        c0lab.LJ("auto_meme_mode", str3);
        c0lab.LJ("enter_dm", shortVideoContext.creativeModel.initialModel.dmCameraModel.enterDM);
        c0lab.LIZ(shortVideoContext.LJJJI() ? 1 : 0, "is_delete_to_edit");
        c0lab.LIZ(shortVideoContext.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        if (C123100dR.LIZ(shortVideoContext.creativeModel.draftInfoModel.draftLandPage)) {
            c0lab.LJ("draft_land_page", shortVideoContext.creativeModel.draftInfoModel.draftLandPage);
        }
        c0lab.LIZ(shortVideoContext.LJJJJI() ? 1 : 0, "is_restore_crash");
        c0lab.LIZ(shortVideoContext.creativeModel.draftInfoModel.isPostDraftPrompt ? 1 : 0, "is_post_draft_prompt");
        ShootExtraData shootExtraData = shortVideoContext.creativeFlowData.getShootExtraData();
        if (shootExtraData != null) {
            followupSquareActionPosition = shootExtraData.getFollowupSquareActionPosition();
        } else {
            followupSquareActionPosition = null;
        }
        c0lab.LJ("followup_square_action_position", followupSquareActionPosition);
        ShootExtraData shootExtraData2 = shortVideoContext.creativeFlowData.getShootExtraData();
        if (shootExtraData2 != null) {
            strIsFromFollowupSquareOriginalVideo = shootExtraData2.isFromFollowupSquareOriginalVideo();
        } else {
            strIsFromFollowupSquareOriginalVideo = null;
        }
        c0lab.LJ("is_from_followup_square_original_video", strIsFromFollowupSquareOriginalVideo);
        ShootExtraData shootExtraData3 = shortVideoContext.creativeFlowData.getShootExtraData();
        if (shootExtraData3 != null) {
            followupSquareRecommendType = shootExtraData3.getFollowupSquareRecommendType();
        } else {
            followupSquareRecommendType = null;
        }
        c0lab.LJ("followup_square_recommend_type", followupSquareRecommendType);
        ShootExtraData shootExtraData4 = shortVideoContext.creativeFlowData.getShootExtraData();
        if (shootExtraData4 != null) {
            followupSquareRecommendReason = shootExtraData4.getFollowupSquareRecommendReason();
        } else {
            followupSquareRecommendReason = null;
        }
        c0lab.LJ("followup_square_recommend_reason", followupSquareRecommendReason);
        ShootExtraData shootExtraData5 = shortVideoContext.creativeFlowData.getShootExtraData();
        if (shootExtraData5 != null) {
            followupSquareVideoRank = shootExtraData5.getFollowupSquareVideoRank();
        }
        c0lab.LIZLLL(followupSquareVideoRank, "followup_square_video_rank");
        c0lab.LJ("music_id", shortVideoContext.getMusicId());
        if (C298260Bma.LIZ()) {
            c0lab.LJ("music_selected_from", C1444890nhf.LIZ(shortVideoContext));
        } else if (shortVideoContext.getMusicId() != null && C123100dR.LIZ(shortVideoContext.LJIIJJI())) {
            c0lab.LJ("music_selected_from", shortVideoContext.LJIIJJI());
        }
        c0lab.LJ("album_from_page", C0L9O.VIDEO_SHOOT_PAGE.getValue());
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            enumC538190L8v = EnumC538190L8v.LAYOUT_CELL;
        } else {
            enumC538190L8v = EnumC538190L8v.SHOOT_PAGE;
        }
        c0lab.LJ("album_from_scene", enumC538190L8v.getValue());
        C0L5G.LIZ.getClass();
        C0L5G.LIZIZ(c0lab, shortVideoContext, bool);
        MusicObject musicObject = shortVideoContext.creativeModel.musicBuzModel.music;
        if (musicObject != null && (str7 = musicObject.promoId) != null) {
            c0lab.LJ("promo_id", str7);
        }
        int i2 = shortVideoContext.creativeModel.musicBuzModel.musicShowRank;
        if (i2 > 0) {
            c0lab.LIZ(i2, "music_show_rank");
        }
        if (C123100dR.LIZ(shortVideoContext.creativeModel.musicBuzModel.hotTabChartRegion)) {
            c0lab.LJ("chart_region", shortVideoContext.creativeModel.musicBuzModel.hotTabChartRegion);
        }
        C523280Kfe.LIZ.getClass();
        C523280Kfe.LIZ(c0lab);
        String str13 = "1";
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_login", str4);
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_camera_permission", str5);
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_microphone_permission", str6);
        if (!shortVideoContext.creativeModel.recordEffectModel.isAigcPropSelected) {
            str13 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_aigc_prop_selected", str13);
        if (effect != null) {
            C0LXN.LIZ.getClass();
            C0LXN.LIZIZ(c0lab, effect);
            c0lab.LJ("prop_id", effect.getEffectId());
            c0lab.LJ("prop_resource_id", effect.getResourceId());
            c0lab.LJ("effect_source", String.valueOf(effect.getSource()));
        }
        String selectedMusicFavoriteTabName = shortVideoContext.creativeModel.initialModel.collectMusicModel.getSelectedMusicFavoriteTabName();
        if (selectedMusicFavoriteTabName != null) {
            c0lab.LJ("panel_favorite_music_selected_from", selectedMusicFavoriteTabName);
        }
        C20684815ws.LJIILLIIL("click_upload_entrance", c0lab.LIZ);
    }

    public static final void LIZLLL(C1DRG c1drg, ComposerBeautyBuriedInfo composerBeautyBuriedInfo, MBeautyStateInfo mBeautyStateInfo, EditEffectAnchorManager editEffectAnchorManager, ShortVideoContext shortVideoContext, Boolean bool, Integer num, String str) {
        Effect effectLLILIL;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        FaceStickerBean faceStickerBeanJr;
        String musicId;
        MusicObject musicObject;
        C1444880nhe c1444880nhe = new C1444880nhe();
        ShortVideoContext shortVideoContext2 = shortVideoContext;
        c1444880nhe.LIZ("enter_from", shortVideoContext2.shootWay);
        C20684815ws.LJIIJ(0L, "upload_click", "shoot_page", CardStruct.IStatusCode.DEFAULT, new JSONObject(c1444880nhe.LIZ));
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            LIZ.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("content_type", "video/photo");
            C2341909Fp.LIZ("click_upload_entrance", c0lab.LIZ);
        } else {
            InterfaceC1647520syU interfaceC1647520syU = (InterfaceC1647520syU) ((C0ETY) c1drg.LJII(C0ETY.class, null)).MY1(InterfaceC1647520syU.class);
            q qVar = (q) c1drg.LJIIL(null, q.class);
            if (qVar != null && (interfaceC1624480sNKC0 = qVar.C0()) != null) {
                effectLLILIL = interfaceC1624480sNKC0.LLILIL();
            } else {
                effectLLILIL = null;
            }
            shortVideoContext2 = shortVideoContext2;
            LIZ(shortVideoContext2, editEffectAnchorManager, interfaceC1647520syU, "video_shoot_page", bool, effectLLILIL);
        }
        InterfaceC2254081DKk interfaceC2254081DKkSt2 = ((InterfaceC1650190t2n) c1drg.LJII(InterfaceC1650230t2r.class, null)).St2();
        long jMX = ((InterfaceC579060MnQ) c1drg.LJII(InterfaceC579060MnQ.class, null)).MX();
        InterfaceC2254001DKc mediaController = interfaceC2254081DKkSt2.getMediaController();
        InterfaceC1645720sva effectController = interfaceC2254081DKkSt2.getEffectController();
        InterfaceC1625000sOA interfaceC1625000sOA = (InterfaceC1625000sOA) c1drg.LJIIL(null, q.class);
        if (interfaceC1625000sOA != null) {
            faceStickerBeanJr = interfaceC1625000sOA.jr();
        } else {
            faceStickerBeanJr = null;
        }
        int iLJLJJLL = ((InterfaceC1650190t2n) c1drg.LJII(InterfaceC1650230t2r.class, null)).LJLJJLL();
        MusicBuzModel musicBuzModel = shortVideoContext2.creativeModel.musicBuzModel;
        if (musicBuzModel == null || (musicObject = musicBuzModel.music) == null || (musicId = MusicBeanUtilKt.getMusicId(musicObject)) == null) {
            musicId = "";
        }
        C1444910nhh.LIZ(shortVideoContext2, mediaController, effectController, faceStickerBeanJr, str, num, composerBeautyBuriedInfo, mBeautyStateInfo, iLJLJJLL, "click_upload", musicId, jMX, null, AFwS287S0000000_4.get$arr$(19));
    }
}
