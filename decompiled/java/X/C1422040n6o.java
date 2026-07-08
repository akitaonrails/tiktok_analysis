package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CutSameModel;
import com.ss.android.ugc.aweme.creative.model.TemplateComplexity;
import com.ss.android.ugc.aweme.creative.model.album.ImportModel;
import com.ss.android.ugc.aweme.creative.model.record.ShootLinkPerfMobModel;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.interfaces.ITemplateComplexityService;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.service.TemplateComplexityImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0n6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422040n6o {
    public static final C1422040n6o LIZ = new C1422040n6o();

    public static long LIZ(Bundle bundle) {
        if (bundle.getInt("fromDraft") == 1) {
            return bundle.getLong("draft_to_edit_start_time", 0L);
        }
        return bundle.getLong("extra_start_enter_edit_page", 0L);
    }

    public static void LIZIZ(Bundle bundle, VideoPublishEditModel videoPublishEditModel, long j, long j2, long j3, C1422050n6p c1422050n6p) {
        String str;
        int bitrate;
        String str2;
        String str3;
        int i;
        long j4;
        Map mapLIZIZ;
        AutoCutThemeData next;
        Object objValueOf;
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            str = "av_image_edit";
        } else if (C298330Bmh.LIZ()) {
            str = "av_video_editor_init";
        } else {
            str = "av_video_edit";
        }
        C524780Ki4.LIZ.end(str, "firstFrame", j3);
        long jLIZ = LIZ(bundle);
        long j5 = bundle.getLong("extra_import_compile_cost_time", 0L);
        long j6 = bundle.getLong("extra_import_total_video_duration", 0L);
        int i2 = bundle.getInt("is_from_social_creation_album_entrance", 0);
        long j7 = j3 - jLIZ;
        long j8 = j - jLIZ;
        if (jLIZ > 0) {
            C0LAB c0lab = new C0LAB();
            c0lab.LIZIZ(j7, "first_frame_duration");
            c0lab.LJFF("is_fast_import", C1428470nHB.LJJLIIIJ(videoPublishEditModel));
            c0lab.LJ("original_resolution", C1428520nHG.LJJIJL(videoPublishEditModel));
            c0lab.LIZ(C1428520nHG.LJJIJIL(videoPublishEditModel), "source_codec_type");
            VideoFileInfo videoFileInfoLJJIJLIJ = C1428520nHG.LJJIJLIJ(videoPublishEditModel);
            if (videoFileInfoLJJIJLIJ != null) {
                bitrate = videoFileInfoLJJIJLIJ.getBitrate();
            } else {
                bitrate = 0;
            }
            c0lab.LIZ(bitrate, "source_file_bitrate");
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LIZ(videoPublishEditModel.getVideoCount(), "video_cnt");
            c0lab.LIZ(C1428470nHB.LJJIL(videoPublishEditModel), "source_is_hdr");
            String str4 = "1";
            if (AVSettingsWrapper.enableHardEncodeForRecord()) {
                str2 = "1";
            } else {
                str2 = "1";
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_hardcode", str4);
            c0lab.LJ("resolution", videoPublishEditModel.getVideoResolution());
            c0lab.LIZIZ(j5, "compile_time");
            c0lab.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "source_duration");
            c0lab.LJ("bite_rate", String.valueOf(AVSettingsWrapper.getRecordBitrate(videoPublishEditModel)));
            c0lab.LIZ(AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality(), "video_quality");
            c0lab.LIZ(videoPublishEditModel.getRecordMode(), "record_mode");
            c0lab.LJFF("reshoot", videoPublishEditModel.isRetakeVideo());
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
            c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
            c0lab.LIZ(videoPublishEditModel.isCurrentAutoCutMode() ? 1 : 0, "is_autocut");
            CutSameModel cutSameModel = videoPublishEditModel.creativeModel.cutSameModel;
            String str5 = "";
            if (cutSameModel == null) {
                str3 = "";
            } else {
                str3 = "template_tab";
            }
            c0lab.LJ("template_scene", str3);
            c0lab.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
            if (i2 == 1) {
                c0lab.LIZ(1, "is_from_social_creation_album_entrance");
            }
            ImportModel importModel = videoPublishEditModel.creativeModel.importModel;
            String str6 = importModel.preTranscodeResolution;
            if (str6 != null && str6.length() != 0 && importModel.preTranscodeCodecType != null) {
                c0lab.LJ("pre_transcode_resolution", importModel.preTranscodeResolution);
                c0lab.LIZLLL(importModel.preTranscodeCodecType, "pre_transcode_codec_type");
            }
            if (j2 > 0) {
                c0lab.LIZIZ(j2 - jLIZ, "surface_first_draw_duration");
            }
            c0lab.LIZIZ(j8, "first_ui_frame_duration");
            c0lab.LIZ(videoPublishEditModel.isMusic(), "is_use_music");
            if (videoPublishEditModel.isCurrentAutoCutMode()) {
                Iterator<AutoCutThemeData> it2 = videoPublishEditModel.creativeModel.autoCutModel.templateList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        AutoCutThemeData autoCutThemeData = next;
                        if (autoCutThemeData.LIZIZ() == C1416110mxF.LJIIJJI(videoPublishEditModel.creativeModel.autoCutModel.curSource) && autoCutThemeData.indexFromSource == videoPublishEditModel.creativeModel.autoCutModel.curIndexFromSource) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AutoCutThemeData autoCutThemeData2 = next;
                if (autoCutThemeData2 != null) {
                    objValueOf = Integer.valueOf(autoCutThemeData2.templateType);
                } else {
                    objValueOf = null;
                }
                c0lab.LIZLLL(objValueOf, "autocut_template_type");
            }
            if (videoPublishEditModel.getTemplateComplexity() != null) {
                TemplateComplexity templateComplexity = videoPublishEditModel.getTemplateComplexity();
                ITemplateComplexityService iTemplateComplexityServiceLIZLLL = TemplateComplexityImpl.LIZLLL();
                if (iTemplateComplexityServiceLIZLLL != null) {
                    mapLIZIZ = iTemplateComplexityServiceLIZLLL.LIZIZ(templateComplexity);
                } else {
                    mapLIZIZ = null;
                }
                c0lab.LJI(mapLIZIZ);
            }
            if (videoPublishEditModel.isEnterFromDM()) {
                c0lab.LJ("enter_dm_way", videoPublishEditModel.creativeModel.initialModel.dmCameraModel.enterDMWay);
            }
            Integer numLJJIII = C1428520nHG.LJJIII(videoPublishEditModel);
            if (numLJJIII == null || numLJJIII.intValue() != 0) {
                c0lab.LIZLLL(C1428520nHG.LJJIII(videoPublishEditModel), "celebration_type");
            }
            Pair<Integer, Integer> pairLJJIIZ = C1416310mxZ.LJJIIZ(videoPublishEditModel);
            int iIntValue = pairLJJIIZ.getFirst().intValue();
            int iIntValue2 = pairLJJIIZ.getSecond().intValue();
            c0lab.LIZ(iIntValue, "video_cnt");
            c0lab.LIZ(iIntValue2, "photo_cnt");
            Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
            int iIntValue3 = pairLJIIJJI.getFirst().intValue();
            int iIntValue4 = pairLJIIJJI.getSecond().intValue();
            if (iIntValue3 + iIntValue4 > 1) {
                i = 1;
            } else {
                i = 0;
            }
            c0lab.LIZ(i, "is_multi_content");
            c0lab.LIZ(iIntValue4, "pic_cnt");
            Cut2EditTransferModel cut2EditTransferModel = videoPublishEditModel.getCut2EditTransferModel();
            if (cut2EditTransferModel != null) {
                c0lab.LIZ(cut2EditTransferModel.isVideoCompressed() ? 1 : 0, "cut_opt_video_compressed");
                c0lab.LIZIZ(cut2EditTransferModel.getDownloadResTime(), "cut_opt_res_download_time");
                c0lab.LIZIZ(cut2EditTransferModel.getResizeImageTime(), "cut_opt_img_resize_time");
                c0lab.LIZIZ(cut2EditTransferModel.getCompressVideoTime(), "cut_opt_video_compress_time");
                c0lab.LIZ(cut2EditTransferModel.getMusicSyncMode() ? 1 : 0, "cut_opt_use_sync_mode_default");
            }
            if (c1422050n6p != null) {
                c0lab.LIZIZ(c1422050n6p.LIZ, "root_scene_create_view_duration");
                c0lab.LIZIZ(c1422050n6p.LIZIZ, "register_components_duration");
                c0lab.LIZIZ(c1422050n6p.LIZJ, "init_editor_duration");
                c0lab.LIZIZ(c1422050n6p.LIZLLL, "prepare_editor_duration");
                c0lab.LIZIZ(c1422050n6p.LJ, "init_editor_end_to_onresume_duration");
            }
            c0lab.LIZ(videoPublishEditModel.creativeModel.editPageRestoreActivityModel.isActivityRestored ? 1 : 0, "is_edit_activity_restored");
            c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
            if (j6 > 0) {
                c0lab.LIZIZ(j6, "total_import_duration");
            }
            c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
            C0LDJ.LIZ.getClass();
            C0LDJ.LIZIZ(videoPublishEditModel, c0lab);
            if (C577580Ml2.LIZ.LIZIZ()) {
                ShootLinkPerfMobModel shootLinkPerfMobModel = videoPublishEditModel.creativeModel.shootLinkPerfMobModel;
                long jLIZ2 = LIZ(bundle);
                c0lab.LJ("shoot_perf_session_id", shootLinkPerfMobModel.shootPerfSessionId);
                if (jLIZ2 > 0) {
                    j4 = j - jLIZ2;
                } else {
                    j4 = -1;
                }
                c0lab.LIZIZ(j4, "e2e_open_time");
                long j9 = shootLinkPerfMobModel.albumFirstScreenTs;
                if (j9 > 0 && jLIZ2 > j9) {
                    c0lab.LIZIZ(jLIZ2 - j9, "album_select_cost");
                }
                c0lab.LJ("inspiration_enter_from", shootLinkPerfMobModel.inspirationEnterFrom);
                c0lab.LJ("inspiration_enter_method", shootLinkPerfMobModel.inspirationEnterMethod);
                c0lab.LJ("search_extra", shootLinkPerfMobModel.searchExtra);
            }
            C19576911iZ.LIZJ = videoPublishEditModel.getCreationId();
            C303380Buq.LIZ("tool_performance_edit_first_frame", c0lab.LIZ);
            C1457570o27 c1457570o27 = C1457570o27.LIZ;
            String creationId = videoPublishEditModel.getCreationId();
            String strLJI = C1403540mcy.LJI(videoPublishEditModel, null);
            String enterFrom = videoPublishEditModel.getEnterFrom();
            if (enterFrom != null) {
                str5 = enterFrom;
            }
            String strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
            String strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
            c1457570o27.getClass();
            C1457570o27.LIZIZ("tool_performance_enter_edit_page", creationId, strLJI, jLIZ, j7, j8, 0, "entry", str5, strLJIILL, strLJIILIIL, false, false, false);
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab2.LJ("filter_list", videoPublishEditModel.getCurFilterLabels());
            c0lab2.LJ("filter_id_list", videoPublishEditModel.getCurFilterIds());
            c0lab2.LJ("prop_list", videoPublishEditModel.getStickerID());
            if (!AVSettingsWrapper.enableHardEncodeForRecord()) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab2.LJ("is_hardcode", str2);
            c0lab2.LJ("bite_rate", String.valueOf(AVSettingsWrapper.getRecordBitrate(videoPublishEditModel)));
            c0lab2.LIZ(AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality(), "video_quality");
            c0lab2.LJ("resolution", videoPublishEditModel.getVideoResolution());
            c0lab2.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab2.LIZIZ(j7, "total_time");
            c0lab2.LIZIZ(j5, "compile_time");
            c0lab2.LJFF("is_fast_import", C1428470nHB.LJJLIIIJ(videoPublishEditModel));
            c0lab2.LIZ(videoPublishEditModel.segmentCounts(), "segment_count");
            C2341909Fp.LIZ("first_frame_display_on_edit_page", c0lab2.LIZ);
            if (TextUtils.equals(C1428470nHB.LJIILIIL(videoPublishEditModel), "upload")) {
                C543670LTx c543670LTx = new C543670LTx();
                c543670LTx.LIZ.put("totaltime", Long.valueOf(j7));
                c543670LTx.LIZ.put("process_time", Long.valueOf(j5));
                c543670LTx.LIZ.put("is_fast_import", Boolean.valueOf(C1428470nHB.LJJLIIIJ(videoPublishEditModel)));
                c543670LTx.LIZ.put("segment_count", Integer.valueOf(videoPublishEditModel.segmentCounts()));
                C1637890six.LIZIZ("aweme_publish_edit_page_render_time", c543670LTx.LJ());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("firstFrameRender in VEVideoPublishEditActivity,compile usage:");
            sbLIZ.append(j5);
            sbLIZ.append(",total usage:");
            sbLIZ.append(j7);
            sbLIZ.append(", lazyInit:");
            sbLIZ.append(true);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
