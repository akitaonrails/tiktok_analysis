package X;

import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigc;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403470mcr {
    public static Long LIZ;

    public static final String LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return "photo_mode";
        }
        return "video";
    }

    public static final List<AlbumAigc> LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        List<AlbumAigc> albumAigc;
        List<AlbumAigc> albumAigc2;
        List<SingleImageData> imageList;
        List<AlbumAigc> albumAigc3;
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.creativeModel.imageAlbumModel;
            if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                AIGCInfo aigcInfo = it2.next().getAigcInfo();
                if (aigcInfo != null && (albumAigc3 = aigcInfo.getAlbumAigc()) != null) {
                    arrayList.add(albumAigc3);
                }
            }
            return C15438062q.LJIJJLI(arrayList);
        }
        if (videoPublishEditModel.creativeModel.albumModel.importInfoList != null && (!r0.isEmpty())) {
            ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
            if (importInfoList == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<ImportVideoInfo> it3 = importInfoList.iterator();
            while (it3.hasNext()) {
                AIGCInfo aigcInfo2 = it3.next().getAigcInfo();
                if (aigcInfo2 != null && (albumAigc2 = aigcInfo2.getAlbumAigc()) != null) {
                    arrayList2.add(albumAigc2);
                }
            }
            return C15438062q.LJIJJLI(arrayList2);
        }
        MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData2 == null || (multiEditVideoRecordData = multiEditVideoRecordData2.curMultiEditVideoRecordData) == null || (list = multiEditVideoRecordData.segmentDataList) == null) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<MultiEditVideoSegmentRecordData> it4 = list.iterator();
        while (it4.hasNext()) {
            AIGCInfo aIGCInfo = it4.next().aigcInfo;
            if (aIGCInfo != null && (albumAigc = aIGCInfo.getAlbumAigc()) != null) {
                arrayList3.add(albumAigc);
            }
        }
        return C15438062q.LJIJJLI(arrayList3);
    }

    public static final String LJ(VideoPublishEditModel videoPublishEditModel) {
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        return C560460LyW.LIZ(pairLJIIJJI.getFirst().intValue(), pairLJIIJJI.getSecond().intValue());
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel) {
        String str;
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        if (videoPublishEditModel.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            str = "promote";
        } else {
            str = "video_edit_page";
        }
        c0labLJIILIIL.LJ("enter_from", str);
        c0labLJIILIIL.LJI(new C15M8().LJFF("is_promote_pa"));
        c0labLJIILIIL.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
        if (videoPublishEditModel.getDraftId() != 0) {
            c0labLJIILIIL.LIZ(videoPublishEditModel.getDraftId(), "draft_id");
        }
        String newDraftId = videoPublishEditModel.getNewDraftId();
        if (newDraftId != null && newDraftId.length() != 0) {
            c0labLJIILIIL.LJ("new_draft_id", videoPublishEditModel.getNewDraftId());
        }
        C20684815ws.LJIILLIIL("change_music", c0labLJIILIIL.LIZ);
    }

    public static final C0LAB LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        String str;
        if (C298260Bma.LIZ()) {
            c0lab.LJ("music_selected_from", C1412490mrP.LIZIZ(videoPublishEditModel));
            return c0lab;
        }
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "on_this_day") && (str = videoPublishEditModel.creativeModel.musicBuzModel.musicSelectedFrom) != null && str.length() != 0) {
            c0lab.LJ("music_selected_from", videoPublishEditModel.creativeModel.musicBuzModel.musicSelectedFrom);
        } else if (C123100dR.LIZ(videoPublishEditModel.getMusicOriginWithCheck())) {
            c0lab.LJ("music_selected_from", videoPublishEditModel.getMusicOriginWithCheck());
            return c0lab;
        }
        return c0lab;
    }

    public static /* synthetic */ void LJII(VideoPublishEditModel videoPublishEditModel, String str, int i) {
        if ((i & 4) != 0) {
            str = "other";
        }
        LJI(videoPublishEditModel, false, str, null, null);
    }

    public static final void LJIIIZ(float f, VideoPublishEditModel videoPublishEditModel, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LIZJ(Float.valueOf(f), "volume_cnt");
        c0lab.LJ("volume_track", str);
        C20684815ws.LJIILLIIL("music_volume_control", c0lab.LIZ);
    }

    public static final void LIZ(int i, String str, String str2, C0LAB c0lab) {
        if (i == 1) {
            c0lab.LJ("enter_method", str);
            c0lab.LJ("item_id", str2);
        }
        c0lab.LIZ(i, "is_l8_import");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r13, boolean r14, java.lang.String r15, X.C0EC6 r16, java.lang.Boolean r17) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1403470mcr.LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, java.lang.String, X.0EC6, java.lang.Boolean):void");
    }

    public static final void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, long j, int i, Integer num, Long l) {
        String first;
        long jLongValue;
        int i2;
        String musicId;
        Pair<String, Long> pair;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_add_panel_first_open_recommend_report", true, true)) {
            return;
        }
        String creationId = videoPublishEditModel.getCreationId();
        C1458370o3P.LIZ.getClass();
        Pair<String, Long> pair2 = C1458370o3P.LJIILJJIL;
        if (pair2 != null) {
            first = pair2.getFirst();
        } else {
            first = null;
        }
        boolean zLJFF = Intrinsics.LJFF(first, creationId);
        long j2 = 0;
        if (zLJFF && (pair = C1458370o3P.LJIILJJIL) != null) {
            jLongValue = pair.getSecond().longValue();
        } else {
            jLongValue = 0;
        }
        if (i != 1) {
            j2 = jLongValue;
        }
        C0LAB c0lab = new C0LAB();
        String musicId2 = videoPublishEditModel.getMusicId();
        int i3 = 0;
        if (musicId2 != null && musicId2.length() != 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c0lab.LIZ(i2 ^ 1, "has_current_music");
        if (C123100dR.LIZ(videoPublishEditModel.getMusicId())) {
            musicId = videoPublishEditModel.getMusicId();
        } else {
            musicId = "";
        }
        c0lab.LJ("current_music_id", musicId);
        c0lab.LJ("zipuri_type", C1458370o3P.LJIIZILJ(creationId, true));
        if (C1458370o3P.LJIIJ(creationId) != null) {
            i3 = 1;
        }
        c0lab.LIZ(i3, "has_cache_uri");
        c0lab.LJ("zip_uri", C1458370o3P.LJIIJ(creationId));
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(j, "total_duration");
        c0lab.LIZIZ(j2, "request_music_duration");
        c0lab.LIZ(1, "is_first_time");
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("music_selected_from", C1412490mrP.LIZIZ(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", creationId);
        c0lab.LIZIZ(j, "total_duration");
        if (l != null) {
            c0lab.LIZIZ(l.longValue(), "first_screen_music_show_duration");
        }
        if (num != null) {
            c0lab.LIZ(num.intValue(), "real_capsule_music_show_in_panel_count");
        }
        C20684815ws.LJIILLIIL("panel_first_open_recommend_tab_time_cost", c0lab.LIZ);
    }
}
