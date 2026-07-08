package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EMD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EMD {
    public static final C0EMD LIZ = new C0EMD();

    /* JADX WARN: Removed duplicated region for block: B:371:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0943  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x09a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedHashMap LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r22) {
        /*
            Method dump skipped, instruction units count: 2473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EMD.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.util.LinkedHashMap");
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublisherMobHelper: isHighQualityVideo -> enable_photo_to_1080p = ");
        sbLIZ.append(C573200Mdy.LIZ());
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (videoPublishEditModel.isPhotoMvMode() && C573200Mdy.LIZ()) {
            return true;
        }
        AbstractC1437870nWL abstractC1437870nWLLIZ = C1439360nYk.LIZ(videoPublishEditModel);
        if (Math.min(abstractC1437870nWLLIZ.LIZ(false), abstractC1437870nWLLIZ.LIZIZ(false)) < 1080) {
            return false;
        }
        return true;
    }

    public static final C0LAB LJFF(VideoPublishEditModel videoPublishEditModel) {
        String str;
        C0EMD c0emd = LIZ;
        C0LAB c0lab = new C0LAB();
        c0emd.getClass();
        LIZJ(c0lab, videoPublishEditModel);
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.getCreativeFlowData().getEditorProModel() != null) {
                String str2 = "1";
                if (videoPublishEditModel.getEditorProModel().isAdvancedEdit()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("is_use_editor_pro", str);
                if (!videoPublishEditModel.getEditorProModel().isPipUsed()) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("is_use_pip", str2);
                C0EMG.LIZ.getClass();
                c0lab.LJ("all_editor_pro_used_functions", C0EMG.LIZ(videoPublishEditModel));
            }
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LJ("scenes_tag", String.valueOf(C1428470nHB.LJIIJJI(videoPublishEditModel)));
            Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
            int iIntValue = pairLJIIJJI.getFirst().intValue();
            int iIntValue2 = pairLJIIJJI.getSecond().intValue();
            c0lab.LIZ(iIntValue2, "pic_cnt");
            c0lab.LJ("mix_type", C560460LyW.LIZ(iIntValue, iIntValue2));
        }
        return c0lab;
    }

    public static final void LIZIZ(C0LAB c0lab, VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        if ((videoPublishEditModel instanceof VideoPublishEditModel) && videoPublishEditModel != null) {
            c0lab.LJ("source_fps", String.valueOf(videoPublishEditModel.videoFpsFloat(false)));
            c0lab.LJ("source_resolution", videoPublishEditModel.getVideoResolution());
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (previewInfo != null && (videoList = previewInfo.getVideoList()) != null && (!videoList.isEmpty()) && (editVideoSegment = (EditVideoSegment) ListProtector.get(videoList, 0)) != null) {
                c0lab.LJ("source_file_bitrate", String.valueOf(editVideoSegment.getVideoFileInfo().getBitrate()));
                C0VSJ c0vsj = new C0VSJ(editVideoSegment.getVideoPath());
                if (c0vsj.isFile() && c0vsj.exists()) {
                    c0lab.LJ("source_file_size", C786410Ut5.k4(Locale.US, "%d", Arrays.copyOf(new Object[]{Long.valueOf(c0vsj.length() / ((long) 1024))}, 1)));
                }
            }
            LIZ.getClass();
            LIZJ(c0lab, videoPublishEditModel);
        }
    }

    public static void LIZJ(C0LAB c0lab, Object obj) {
        VideoPublishEditModelKt videoPublishEditModelKt;
        String str;
        int i;
        if ((obj instanceof VideoPublishEditModel) && (videoPublishEditModelKt = (VideoPublishEditModelKt) obj) != null) {
            if (videoPublishEditModelKt.isStoryEditMode()) {
                str = "story_shoot_page";
            } else {
                str = "video_shoot_page";
            }
            c0lab.LJ("shoot_page", str);
            if (videoPublishEditModelKt.getTtStoryUploadModel() != null) {
                i = 1;
            } else {
                i = 0;
            }
            c0lab.LIZ(i, "is_story");
            TTStoryUploadModel ttStoryUploadModel = videoPublishEditModelKt.getTtStoryUploadModel();
            if (ttStoryUploadModel != null) {
                c0lab.LIZ(ttStoryUploadModel.getIndex(), "clip_index");
                c0lab.LIZ(ttStoryUploadModel.getTotalCount(), "clips_cnt");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:238:0x0525  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(com.bytedance.ies.nle.editor_jni.NLEModel r42, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r43, java.util.LinkedHashMap r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 1740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EMD.LJ(com.bytedance.ies.nle.editor_jni.NLEModel, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.LinkedHashMap, boolean):void");
    }
}
