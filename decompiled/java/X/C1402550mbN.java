package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1402550mbN {
    public static final C0LAB LIZ(long j, NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel) {
        String musicOriginWithCheck;
        String str;
        String recId;
        int i = 0;
        Pair<Integer, Integer> pairLJJII = u4.LJJII(nLEModel, false);
        int iIntValue = pairLJJII.getFirst().intValue();
        int iIntValue2 = pairLJJII.getSecond().intValue();
        if (C298260Bma.LIZ()) {
            musicOriginWithCheck = C1412490mrP.LIZIZ(videoPublishEditModel);
        } else {
            musicOriginWithCheck = videoPublishEditModel.getMusicOriginWithCheck();
        }
        C0LAB c0labLIZIZ = C1402900mbw.LIZIZ(videoPublishEditModel);
        c0labLIZIZ.LIZ(C577760MlK.LIZ(videoPublishEditModel), "beautify_used");
        c0labLIZIZ.LJ("effect_list", videoPublishEditModel.getEditEffectListStr());
        c0labLIZIZ.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0labLIZIZ.LJ("enter_method", "click");
        c0labLIZIZ.LJ("info_sticker_list", videoPublishEditModel.getInfoStickerList());
        c0labLIZIZ.LJ("infosticker_from", videoPublishEditModel.getInfoStickerFrom());
        c0labLIZIZ.LIZ(videoPublishEditModel.getDuetFromDuetButton(), "is_from_duet_button");
        c0labLIZIZ.LJ("mix_type", C1403470mcr.LJ(videoPublishEditModel));
        c0labLIZIZ.LJ("music_id", videoPublishEditModel.getMusicId());
        c0labLIZIZ.LJ("music_selected_from", musicOriginWithCheck);
        c0labLIZIZ.LIZ(videoPublishEditModel.getOriginalStickerCount(), "original_prop_count");
        c0labLIZIZ.LJ("original_resolution", C1428520nHG.LJJIJL(videoPublishEditModel));
        String designerIdList = videoPublishEditModel.getDesignerIdList();
        if (designerIdList == null) {
            designerIdList = "";
        }
        c0labLIZIZ.LJ("prop_author_id", designerIdList);
        c0labLIZIZ.LJ("prop_list", videoPublishEditModel.getStickerID());
        c0labLIZIZ.LIZ(C0CHQ.LIZ().getPublishService().LJJJJJL(), "publish_cnt");
        c0labLIZIZ.LJ("shoot_enter_method", videoPublishEditModel.getShootEnterMethod());
        c0labLIZIZ.LJ("shoot_entrance", C1403060mcC.LIZ(videoPublishEditModel, "shoot_entrance"));
        c0labLIZIZ.LJ("shoot_filter_id_list", videoPublishEditModel.getRecordFilterIds());
        if (AVSettingsWrapper.enableHardEncodeForRecord()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZIZ.LJ("is_hardcode", str);
        c0labLIZIZ.LIZ(iIntValue, "video_cnt");
        c0labLIZIZ.LIZ(iIntValue2, "pic_cnt");
        c0labLIZIZ.LIZIZ(j, "creation_duration");
        if (iIntValue + iIntValue2 > 1) {
            i = 1;
        }
        c0labLIZIZ.LIZ(i, "is_multi_content");
        if (Intrinsics.LJFF(videoPublishEditModel.getEnterFrom(), "super_entrance")) {
            c0labLIZIZ.LIZ(1, "is_special_icon");
        }
        StickerInfo stickerInfo = videoPublishEditModel.stickerInfo;
        String recId2 = null;
        if (stickerInfo != null && stickerInfo.hasImprPosition()) {
            c0labLIZIZ.LJ("prop_impr_position", stickerInfo.getImprPosition());
        }
        StickerInfo stickerInfo2 = videoPublishEditModel.stickerInfo;
        if (stickerInfo2 != null && stickerInfo2.hasTabOrder()) {
            c0labLIZIZ.LJ("prop_tab_order", stickerInfo2.getTabOrder());
        }
        StickerInfo stickerInfo3 = videoPublishEditModel.stickerInfo;
        if (stickerInfo3 != null) {
            recId = stickerInfo3.getRecId();
        } else {
            recId = null;
        }
        if (C123100dR.LIZ(recId)) {
            StickerInfo stickerInfo4 = videoPublishEditModel.stickerInfo;
            if (stickerInfo4 != null) {
                recId2 = stickerInfo4.getRecId();
            }
            c0labLIZIZ.LJ("prop_rec_id", recId2);
        }
        if (C123100dR.LIZ(videoPublishEditModel.getFromAlbumBottomBtn())) {
            c0labLIZIZ.LJ("from_album_bottom_button", videoPublishEditModel.getFromAlbumBottomBtn());
        }
        return c0labLIZIZ;
    }
}
