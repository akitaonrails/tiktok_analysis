package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.publish.TrackParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0mes, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404720mes extends AbstractC1446660nkW {
    public VideoPublishEditModel LJ;
    public C1405220mfg LJFF;
    public C1404570med LJI;
    public PublishModel LJII;
    public UploadAuthKeyConfig LJIIIIZZ;
    public C1404740meu LJIIIZ;
    public InterfaceC1434300nQa LJIIJ;
    public int LJIIJJI;
    public C138P LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public final C1404730met LJIILL;

    public C1404720mes() {
        super(EnumC1434770nRL.UPLOAD, (List<? extends Object>) Collections.singletonList(EnumC1434770nRL.COMPILE));
        this.LJIILIIL = -2;
        this.LJIILL = new C1404730met();
    }

    public final SynthetiseResult LJI() {
        Object obj = ((LinkedHashMap) this.LIZIZ).get(EnumC1434770nRL.COMPILE);
        if (obj instanceof SynthetiseResult) {
            return (SynthetiseResult) obj;
        }
        return null;
    }

    public final C0LAB LJIIIIZZ() {
        C1404570med c1404570med = this.LJI;
        if (c1404570med == null) {
            c1404570med = null;
        }
        C1420470n4H c1420470n4H = new C1420470n4H(c1404570med.LIZ);
        VideoPublishEditModel videoPublishEditModel = this.LJ;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel != null ? videoPublishEditModel : null;
        C0LAB c0labLJFF = C0EMD.LJFF(videoPublishEditModel2);
        c1420470n4H.LIZ(videoPublishEditModel2, c0labLJFF);
        return c0labLJFF;
    }

    @Override // X.AbstractC1446660nkW, X.InterfaceC1840230xzJ
    public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
        super.onEvent(abstractC556190Lrd);
    }

    @Override // X.AbstractC1446660nkW
    public final void LJ(Object obj, C1404610meh c1404610meh) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long speed;
        int bitrate;
        float speed2;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    this.LJ = ((C1434960nRe) next).LIZ;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C1434970nRf) {
                            if (next2 != null) {
                                this.LJII = ((C1434970nRf) next2).LIZ;
                                Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it4.next();
                                    if (next3 instanceof C1405220mfg) {
                                        if (next3 != null) {
                                            this.LJFF = (C1405220mfg) next3;
                                            Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it5.next();
                                                if (next4 instanceof C1404570med) {
                                                    if (next4 != null) {
                                                        this.LJI = (C1404570med) next4;
                                                        Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                        while (true) {
                                                            if (!it6.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it6.next();
                                                            if (next5 instanceof C1404770mex) {
                                                                if (next5 != null) {
                                                                    this.LJIIIIZZ = (UploadAuthKeyConfig) ((C1404770mex) next5).LIZ;
                                                                    Iterator<Object> it7 = c1404610meh.LIZ.iterator();
                                                                    while (true) {
                                                                        if (!it7.hasNext()) {
                                                                            break;
                                                                        }
                                                                        Object next6 = it7.next();
                                                                        if (next6 instanceof C1404740meu) {
                                                                            if (next6 != null) {
                                                                                this.LJIIIZ = (C1404740meu) next6;
                                                                                Iterator<Object> it8 = c1404610meh.LIZ.iterator();
                                                                                while (true) {
                                                                                    if (!it8.hasNext()) {
                                                                                        break;
                                                                                    }
                                                                                    Object next7 = it8.next();
                                                                                    if (next7 instanceof InterfaceC1434300nQa) {
                                                                                        if (next7 != null) {
                                                                                            this.LJIIJ = (InterfaceC1434300nQa) next7;
                                                                                            VideoPublishEditModel videoPublishEditModel = this.LJ;
                                                                                            if (videoPublishEditModel == null) {
                                                                                                videoPublishEditModel = null;
                                                                                            }
                                                                                            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                                                                                                this.LJIIJJI = 11;
                                                                                            }
                                                                                            VideoPublishEditModel videoPublishEditModel2 = this.LJ;
                                                                                            if (videoPublishEditModel2 == null) {
                                                                                                videoPublishEditModel2 = null;
                                                                                            }
                                                                                            TrackParams trackParams = videoPublishEditModel2.creativeModel.prePublishStatusModel.trackParams;
                                                                                            trackParams.uploadBeginScene = trackParams.currentScene;
                                                                                            trackParams.uploadBeginDuration = System.currentTimeMillis() - videoPublishEditModel2.creativeModel.prePublishStatusModel.trackParams.currentSceneStartTime;
                                                                                            C138P c138p = new C138P(C1411880mqQ.LIZIZ);
                                                                                            c138p.LIZLLL();
                                                                                            this.LJIIL = c138p;
                                                                                            C0LAB c0labLJIIIIZZ = LJIIIIZZ();
                                                                                            VideoPublishEditModel videoPublishEditModel3 = this.LJ;
                                                                                            if (videoPublishEditModel3 == null) {
                                                                                                videoPublishEditModel3 = null;
                                                                                            }
                                                                                            c0labLJIIIIZZ.LJ("resolution", videoPublishEditModel3.getVideoResolution());
                                                                                            String str7 = "1";
                                                                                            if (AVSettingsWrapper.enableHardEncodeForRecord()) {
                                                                                                str = "1";
                                                                                            } else {
                                                                                                str = CardStruct.IStatusCode.DEFAULT;
                                                                                            }
                                                                                            c0labLJIIIIZZ.LJ("is_hardcode", str);
                                                                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                                            VideoPublishEditModel videoPublishEditModel4 = this.LJ;
                                                                                            if (videoPublishEditModel4 == null) {
                                                                                                videoPublishEditModel4 = null;
                                                                                            }
                                                                                            sbLIZ.append(AVSettingsWrapper.getRecordBitrate(videoPublishEditModel4));
                                                                                            sbLIZ.append("");
                                                                                            c0labLJIIIIZZ.LJ("bite_rate", C2188811AlT.LIZIZ(sbLIZ));
                                                                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                                                            sbLIZ2.append(AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality());
                                                                                            sbLIZ2.append("");
                                                                                            c0labLJIIIIZZ.LJ("video_quality", C2188811AlT.LIZIZ(sbLIZ2));
                                                                                            c0labLJIIIIZZ.LJ("_perf_monitor", "1");
                                                                                            PublishModel publishModel = this.LJII;
                                                                                            if (publishModel == null) {
                                                                                                publishModel = null;
                                                                                            }
                                                                                            c0labLJIIIIZZ.LIZ(publishModel.publishType, "publish_type");
                                                                                            C1405220mfg c1405220mfg = this.LJFF;
                                                                                            if (c1405220mfg == null) {
                                                                                                c1405220mfg = null;
                                                                                            }
                                                                                            if (c1405220mfg.LIZIZ) {
                                                                                                str2 = "1";
                                                                                            } else {
                                                                                                str2 = CardStruct.IStatusCode.DEFAULT;
                                                                                            }
                                                                                            c0labLJIIIIZZ.LJ("is_click_publish", str2);
                                                                                            VideoPublishEditModel videoPublishEditModel5 = this.LJ;
                                                                                            if (videoPublishEditModel5 == null) {
                                                                                                videoPublishEditModel5 = null;
                                                                                            }
                                                                                            int i = 0;
                                                                                            c0labLJIIIIZZ.LIZ(videoPublishEditModel5.videoFps(false), "fps");
                                                                                            int i2 = this.LJIIJJI;
                                                                                            if (i2 == 0) {
                                                                                                VideoPublishEditModel videoPublishEditModel6 = this.LJ;
                                                                                                if (videoPublishEditModel6 == null) {
                                                                                                    videoPublishEditModel6 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LJ("creation_id", videoPublishEditModel6.getCreationId());
                                                                                                VideoPublishEditModel videoPublishEditModel7 = this.LJ;
                                                                                                if (videoPublishEditModel7 == null) {
                                                                                                    videoPublishEditModel7 = null;
                                                                                                }
                                                                                                UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel7.getUploadSpeedInfo();
                                                                                                if (uploadSpeedInfo != null) {
                                                                                                    speed = uploadSpeedInfo.getSpeed();
                                                                                                } else {
                                                                                                    speed = -6;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LIZIZ(speed, "upload_probe_speed");
                                                                                                VideoPublishEditModel videoPublishEditModel8 = this.LJ;
                                                                                                if (videoPublishEditModel8 == null) {
                                                                                                    videoPublishEditModel8 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LIZ(videoPublishEditModel8.getPreviewInfo().getPreviewVideoLength(), "source_duration");
                                                                                                VideoPublishEditModel videoPublishEditModel9 = this.LJ;
                                                                                                if (videoPublishEditModel9 == null) {
                                                                                                    videoPublishEditModel9 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LIZ(videoPublishEditModel9.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
                                                                                                VideoPublishEditModel videoPublishEditModel10 = this.LJ;
                                                                                                if (videoPublishEditModel10 == null) {
                                                                                                    videoPublishEditModel10 = null;
                                                                                                }
                                                                                                VideoFileInfo videoFileInfoLJJIJLIJ = C1428520nHG.LJJIJLIJ(videoPublishEditModel10);
                                                                                                if (videoFileInfoLJJIJLIJ != null) {
                                                                                                    bitrate = videoFileInfoLJJIJLIJ.getBitrate();
                                                                                                } else {
                                                                                                    bitrate = 0;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LIZ(bitrate, "source_file_bitrate");
                                                                                                VideoPublishEditModel videoPublishEditModel11 = this.LJ;
                                                                                                if (videoPublishEditModel11 == null) {
                                                                                                    videoPublishEditModel11 = null;
                                                                                                }
                                                                                                if (TextUtils.equals(C1428470nHB.LJIILIIL(videoPublishEditModel11), "upload")) {
                                                                                                    VideoPublishEditModel videoPublishEditModel12 = this.LJ;
                                                                                                    if (videoPublishEditModel12 == null) {
                                                                                                        videoPublishEditModel12 = null;
                                                                                                    }
                                                                                                    c0labLJIIIIZZ.LIZ(C1428470nHB.LJJLIIIJ(videoPublishEditModel12) ? 1 : 0, "is_fast_import");
                                                                                                }
                                                                                                VideoPublishEditModel videoPublishEditModel13 = this.LJ;
                                                                                                if (videoPublishEditModel13 == null) {
                                                                                                    videoPublishEditModel13 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LJ("creation_id", videoPublishEditModel13.getCreationId());
                                                                                                VideoPublishEditModel videoPublishEditModel14 = this.LJ;
                                                                                                if (videoPublishEditModel14 == null) {
                                                                                                    videoPublishEditModel14 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel14));
                                                                                                VideoPublishEditModel videoPublishEditModel15 = this.LJ;
                                                                                                if (videoPublishEditModel15 == null) {
                                                                                                    videoPublishEditModel15 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel15));
                                                                                                C1404570med c1404570med = this.LJI;
                                                                                                if (c1404570med == null) {
                                                                                                    c1404570med = null;
                                                                                                }
                                                                                                String str8 = c1404570med.LIZ;
                                                                                                VideoPublishEditModel videoPublishEditModel16 = this.LJ;
                                                                                                if (videoPublishEditModel16 == null) {
                                                                                                    videoPublishEditModel16 = null;
                                                                                                }
                                                                                                C1404740meu c1404740meu = this.LJIIIZ;
                                                                                                if (c1404740meu == null) {
                                                                                                    c1404740meu = null;
                                                                                                }
                                                                                                List<C1404760mew> list = c1404740meu.LIZ;
                                                                                                if (list != null) {
                                                                                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                                                                                    C01GW c01gw = C1404790mez.LIZ;
                                                                                                    long j = -1;
                                                                                                    long j2 = ((Keva) c01gw.getValue()).getLong("upload_finish_timestamp", -1L);
                                                                                                    if (j2 != -1) {
                                                                                                        j = (jCurrentTimeMillis - j2) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                                                                                                    }
                                                                                                    c0labLJIIIIZZ.LJ("publish_id", str8);
                                                                                                    UploadSpeedInfo uploadSpeedInfo2 = videoPublishEditModel16.getUploadSpeedInfo();
                                                                                                    if (uploadSpeedInfo2 != null) {
                                                                                                        speed2 = uploadSpeedInfo2.getSpeed();
                                                                                                    } else {
                                                                                                        speed2 = -1.0f;
                                                                                                    }
                                                                                                    c0labLJIIIIZZ.LIZJ(Float.valueOf(speed2), "upload_probe_speed");
                                                                                                    c0labLJIIIIZZ.LIZ(o.LJIILJJIL.LJIIIZ(), "internet_speed");
                                                                                                    c0labLJIIIIZZ.LIZIZ(((Keva) c01gw.getValue()).getLong("upload_speed", -1024L) / ((long) 1024), "last_upload_speed");
                                                                                                    c0labLJIIIIZZ.LIZIZ(j, "last_time_diff");
                                                                                                    C1404760mew c1404760mew = (C1404760mew) C13LP.LJJJLL(list);
                                                                                                    if (c1404760mew != null) {
                                                                                                        i = c1404760mew.LIZ * 1024;
                                                                                                    }
                                                                                                    c0labLJIIIIZZ.LIZ(i, "adapt_chunk_size");
                                                                                                }
                                                                                            } else if (i2 == 11) {
                                                                                                VideoPublishEditModel videoPublishEditModel17 = this.LJ;
                                                                                                if (videoPublishEditModel17 == null) {
                                                                                                    videoPublishEditModel17 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LJ("creation_id", videoPublishEditModel17.getCreationId());
                                                                                                VideoPublishEditModel videoPublishEditModel18 = this.LJ;
                                                                                                if (videoPublishEditModel18 == null) {
                                                                                                    videoPublishEditModel18 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel18));
                                                                                                VideoPublishEditModel videoPublishEditModel19 = this.LJ;
                                                                                                if (videoPublishEditModel19 == null) {
                                                                                                    videoPublishEditModel19 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel19));
                                                                                            }
                                                                                            int i3 = this.LJIILIIL;
                                                                                            if (i3 != 0) {
                                                                                                c0labLJIIIIZZ.LIZ(i3, "notRemuxErrorcode");
                                                                                            }
                                                                                            C1405220mfg c1405220mfg2 = this.LJFF;
                                                                                            if (c1405220mfg2 == null) {
                                                                                                c1405220mfg2 = null;
                                                                                            }
                                                                                            c0labLJIIIIZZ.LIZ(c1405220mfg2.LIZIZ ? 1 : 0, "is_click_publish");
                                                                                            if (!C0CHQ.LIZ().getAccountService().LIZ()) {
                                                                                                str3 = "1";
                                                                                            } else {
                                                                                                str3 = "2";
                                                                                            }
                                                                                            c0labLJIIIIZZ.LJ("is_child_mode", str3);
                                                                                            VideoPublishEditModel videoPublishEditModel20 = this.LJ;
                                                                                            if (videoPublishEditModel20 == null) {
                                                                                                videoPublishEditModel20 = null;
                                                                                            }
                                                                                            if (videoPublishEditModel20.getCreativeFlowData().getEditorProModel() != null) {
                                                                                                VideoPublishEditModel videoPublishEditModel21 = this.LJ;
                                                                                                if (videoPublishEditModel21 == null) {
                                                                                                    videoPublishEditModel21 = null;
                                                                                                }
                                                                                                if (videoPublishEditModel21.getEditorProModel().isAdvancedEdit()) {
                                                                                                    str6 = "1";
                                                                                                } else {
                                                                                                    str6 = CardStruct.IStatusCode.DEFAULT;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LJ("is_use_editor_pro", str6);
                                                                                                VideoPublishEditModel videoPublishEditModel22 = this.LJ;
                                                                                                if (videoPublishEditModel22 == null) {
                                                                                                    videoPublishEditModel22 = null;
                                                                                                }
                                                                                                if (!videoPublishEditModel22.getEditorProModel().isPipUsed()) {
                                                                                                    str7 = CardStruct.IStatusCode.DEFAULT;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LJ("is_use_pip", str7);
                                                                                                C0EMG c0emg = C0EMG.LIZ;
                                                                                                VideoPublishEditModel videoPublishEditModel23 = this.LJ;
                                                                                                if (videoPublishEditModel23 == null) {
                                                                                                    videoPublishEditModel23 = null;
                                                                                                }
                                                                                                c0emg.getClass();
                                                                                                c0labLJIIIIZZ.LJ("all_editor_pro_used_functions", C0EMG.LIZ(videoPublishEditModel23));
                                                                                            }
                                                                                            VideoPublishEditModel videoPublishEditModel24 = this.LJ;
                                                                                            if (videoPublishEditModel24 == null) {
                                                                                                videoPublishEditModel24 = null;
                                                                                            }
                                                                                            NowsShootModel nowsShootModel = videoPublishEditModel24.creativeModel.nowsShootModel;
                                                                                            if (nowsShootModel != null && (str5 = nowsShootModel.multiCameraMode) != null) {
                                                                                                c0labLJIIIIZZ.LJ("multi_camera_mode", str5);
                                                                                            }
                                                                                            VideoPublishEditModel videoPublishEditModel25 = this.LJ;
                                                                                            if (videoPublishEditModel25 == null) {
                                                                                                videoPublishEditModel25 = null;
                                                                                            }
                                                                                            if (!C1428470nHB.LJJZZI(videoPublishEditModel25)) {
                                                                                                str4 = "video_publish_start";
                                                                                            } else {
                                                                                                str4 = "photo_publish_start";
                                                                                            }
                                                                                            if (Intrinsics.LJFF(str4, "video_publish_start")) {
                                                                                                VideoPublishEditModel videoPublishEditModel26 = this.LJ;
                                                                                                if (videoPublishEditModel26 == null) {
                                                                                                    videoPublishEditModel26 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LIZ(C1428470nHB.LJJIL(videoPublishEditModel26), "source_is_hdr");
                                                                                                VideoPublishEditModel videoPublishEditModel27 = this.LJ;
                                                                                                if (videoPublishEditModel27 == null) {
                                                                                                    videoPublishEditModel27 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LIZ(videoPublishEditModel27.creativeModel.hdrModel.videoCodeType, "is_hdr");
                                                                                            }
                                                                                            VideoPublishEditModel videoPublishEditModel28 = this.LJ;
                                                                                            if (videoPublishEditModel28 == null) {
                                                                                                videoPublishEditModel28 = null;
                                                                                            }
                                                                                            if (C1428470nHB.LJJZZI(videoPublishEditModel28)) {
                                                                                                VideoPublishEditModel videoPublishEditModel29 = this.LJ;
                                                                                                if (videoPublishEditModel29 == null) {
                                                                                                    videoPublishEditModel29 = null;
                                                                                                }
                                                                                                c0labLJIIIIZZ.LIZ(C1428470nHB.LJJJJLL(videoPublishEditModel29) ? 1 : 0, "is_canvas_as_image");
                                                                                            }
                                                                                            Map<String, String> map = c0labLJIIIIZZ.LIZ;
                                                                                            InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIJ;
                                                                                            if (interfaceC1434300nQa == null) {
                                                                                                interfaceC1434300nQa = null;
                                                                                            }
                                                                                            interfaceC1434300nQa.LJ().getClass();
                                                                                            C20684815ws.LJIILLIIL(str4, map);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.SmartSliceConfig");
                                                                }
                                                            }
                                                        }
                                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
                                                    }
                                                }
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
        int i;
        if (obj2 instanceof C1404690mep) {
            this.LJIILIIL = ((C1404690mep) obj2).LIZ;
            return;
        }
        if (obj2 instanceof C1404700meq) {
            this.LJIILJJIL = ((C1404700meq) obj2).LIZIZ;
            return;
        }
        if (!(obj2 instanceof C1405130mfX)) {
            return;
        }
        C1405130mfX c1405130mfX = (C1405130mfX) obj2;
        if (c1405130mfX.LIZ == 1000) {
            C13DL.LJI(this.LJIILL.LIZ, 0L);
        }
        if (c1405130mfX.LIZ == 1003) {
            VideoPublishEditModel videoPublishEditModel = this.LJ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            TrackParams trackParams = videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams;
            trackParams.uploadEndScene = trackParams.currentScene;
            trackParams.uploadEndDuration = System.currentTimeMillis() - videoPublishEditModel.creativeModel.prePublishStatusModel.trackParams.currentSceneStartTime;
        }
        C1404730met c1404730met = this.LJIILL;
        int i2 = c1405130mfX.LIZ;
        c1404730met.getClass();
        switch (i2) {
            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                i = 0;
                break;
            case 1001:
                i = 1;
                break;
            case 1002:
                i = 2;
                break;
            case 1003:
                i = 3;
                break;
            case 1004:
                i = 4;
                break;
            case 1005:
                i = 5;
                break;
            default:
                C0CHQ.LIZ().getPublishService().LJIIL().LJJ(new AwS423S0200000_22(obj2, this, 74));
        }
        if (i < c1404730met.LIZ.length) {
            c1404730met.LIZ[i] = System.currentTimeMillis();
        }
        C0CHQ.LIZ().getPublishService().LJIIL().LJJ(new AwS423S0200000_22(obj2, this, 74));
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        C1435220nS4 c1435220nS4;
        Integer numValueOf;
        if (abstractC1404540mea instanceof C1404550meb) {
            c1435220nS4 = ((C1404550meb) abstractC1404540mea).LIZ;
        } else {
            c1435220nS4 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorCode:");
        if (c1435220nS4 != null) {
            numValueOf = Integer.valueOf(c1435220nS4.getCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1405220mfg c1405220mfg = this.LJFF;
        if (c1405220mfg == null) {
            c1405220mfg = null;
        }
        boolean z = c1405220mfg.LIZIZ;
        UploadAuthKeyConfig uploadAuthKeyConfig = this.LJIIIIZZ;
        if (uploadAuthKeyConfig == null) {
            uploadAuthKeyConfig = null;
        }
        LJII(false, strLIZIZ, "-39993", z, uploadAuthKeyConfig, i, null, null);
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        int iLJII = C1431420nLw.LJII(c1435220nS4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorCode:");
        sbLIZ.append(c1435220nS4.getCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strValueOf = String.valueOf(iLJII);
        C1405220mfg c1405220mfg = this.LJFF;
        if (c1405220mfg == null) {
            c1405220mfg = null;
        }
        boolean z = c1405220mfg.LIZIZ;
        UploadAuthKeyConfig uploadAuthKeyConfig = this.LJIIIIZZ;
        if (uploadAuthKeyConfig == null) {
            uploadAuthKeyConfig = null;
        }
        LJII(false, strLIZIZ, strValueOf, z, uploadAuthKeyConfig, i, null, LJI());
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        SynthetiseResult synthetiseResultLJI = LJI();
        C1405220mfg c1405220mfg = this.LJFF;
        UploadAuthKeyConfig uploadAuthKeyConfig = null;
        if (c1405220mfg == null) {
            c1405220mfg = null;
        }
        boolean z2 = c1405220mfg.LIZIZ;
        UploadAuthKeyConfig uploadAuthKeyConfig2 = this.LJIIIIZZ;
        if (uploadAuthKeyConfig2 != null) {
            uploadAuthKeyConfig = uploadAuthKeyConfig2;
        }
        LJII(true, "", "", z2, uploadAuthKeyConfig, i, ((C1404470meT) obj2).LIZIZ, synthetiseResultLJI);
    }

    public final void LJII(boolean z, String str, String str2, boolean z2, UploadAuthKeyConfig uploadAuthKeyConfig, int i, C1404850mf5 c1404850mf5, SynthetiseResult synthetiseResult) {
        String str3;
        String str4;
        String str5;
        long speed;
        long j;
        int i2;
        long length;
        String str6;
        String str7;
        String str8;
        int i3;
        C1404760mew c1404760mew;
        List<PublishImageModel> list;
        int i4;
        int codecType;
        int i5;
        int i6;
        String strK4;
        String str9;
        String str10;
        int bitrate;
        String str11;
        String str12;
        long speed2;
        int fps;
        int i7;
        long duration;
        long duration2;
        String resolution;
        C0LAB c0labLJIIIIZZ = LJIIIIZZ();
        String str13 = "1";
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJIIIIZZ.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        c0labLJIIIIZZ.LJ("fail_info", str);
        if (AVSettingsWrapper.enableHardEncodeForRecord()) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJIIIIZZ.LJ("record_code_type", str4);
        if (AVSettingsWrapper.enableHardEncodeForSynthetic()) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJIIIIZZ.LJ("compose_code_type", str5);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        VideoPublishEditModel videoPublishEditModel = this.LJ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        sbLIZ.append(AVSettingsWrapper.getRecordBitrate(videoPublishEditModel));
        String str14 = "";
        sbLIZ.append("");
        c0labLJIIIIZZ.LJ("bite_rate", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality());
        sbLIZ2.append("");
        c0labLJIIIIZZ.LJ("video_quality", C2188811AlT.LIZIZ(sbLIZ2));
        c0labLJIIIIZZ.LJ("_perf_monitor", "1");
        PublishModel publishModel = this.LJII;
        if (publishModel == null) {
            publishModel = null;
        }
        c0labLJIIIIZZ.LIZ(publishModel.publishType, "publish_type");
        VideoPublishEditModel videoPublishEditModel2 = this.LJ;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        c0labLJIIIIZZ.LIZ(videoPublishEditModel2.videoFps(false), "fps");
        VideoPublishEditModel videoPublishEditModel3 = this.LJ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel3.getUploadSpeedInfo();
        if (uploadSpeedInfo != null) {
            speed = uploadSpeedInfo.getSpeed();
        } else {
            speed = -6;
        }
        c0labLJIIIIZZ.LJ("is_hd_setting", C1441320nbu.LIZLLL(speed));
        VideoPublishEditModel videoPublishEditModel4 = this.LJ;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        c0labLJIIIIZZ.LJ("content_source", C1404510meX.LIZ(videoPublishEditModel4));
        VideoPublishEditModel videoPublishEditModel5 = this.LJ;
        if (videoPublishEditModel5 == null) {
            videoPublishEditModel5 = null;
        }
        c0labLJIIIIZZ.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel5));
        if (uploadAuthKeyConfig != null) {
            UploadVideoConfig uploadVideoConfig = uploadAuthKeyConfig.videoConfig;
            if (uploadVideoConfig != null) {
                c0labLJIIIIZZ.LIZ(uploadVideoConfig.enableHttps, "video_https_type");
            }
            UploadImageConfig uploadImageConfig = uploadAuthKeyConfig.imgConfig;
            if (uploadImageConfig != null) {
                c0labLJIIIIZZ.LIZ(uploadImageConfig.enableHttps, "image_https_type");
            }
            UploadImageConfig uploadImageConfig2 = uploadAuthKeyConfig.frameUploadConfig;
            if (uploadImageConfig2 != null) {
                c0labLJIIIIZZ.LIZ(uploadImageConfig2.enableHttps, "frame_https_type");
            }
        }
        C138P c138p = this.LJIIL;
        if (c138p.LIZIZ) {
            c138p.LJ();
        }
        c0labLJIIIIZZ.LIZ(i, "origin_upload_dur_ms");
        c0labLJIIIIZZ.LIZ(o.LJIILJJIL.LJIIIZ(), "download_internet_speed_kbps");
        if (synthetiseResult != null) {
            c0labLJIIIIZZ.LIZIZ(synthetiseResult.getSyntheticEndTime().LIZ - synthetiseResult.getSyntheticStartTime().LIZ, "synthetic_dur_ms");
        }
        if (c1404850mf5 != null) {
            j = c1404850mf5.LIZIZ;
        } else {
            j = -1;
        }
        c0labLJIIIIZZ.LIZIZ(j, "upload_wait_time_ms");
        if (c1404850mf5 != null) {
            i2 = (int) c1404850mf5.LIZ;
        } else {
            i2 = 0;
        }
        int i8 = i - i2;
        c0labLJIIIIZZ.LIZ(i8, "duration");
        if (i8 > 0) {
            VideoPublishEditModel videoPublishEditModel6 = this.LJ;
            if (videoPublishEditModel6 == null) {
                videoPublishEditModel6 = null;
            }
            length = (new C0VSJ(videoPublishEditModel6.getRealSynthesisFile()).length() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) i8);
        } else {
            length = 0;
        }
        Locale locale = Locale.US;
        c0labLJIIIIZZ.LJ("upload_speed", C786410Ut5.k4(locale, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(length / 1024.0f)}, 1)));
        if (!z) {
            c0labLJIIIIZZ.LJ("error_code", str2);
        }
        if (this.LJIIJJI == 0) {
            VideoPublishEditModel videoPublishEditModel7 = this.LJ;
            if (videoPublishEditModel7 == null) {
                videoPublishEditModel7 = null;
            }
            String outputFile = videoPublishEditModel7.getOutputFile();
            if (outputFile == null) {
                outputFile = "";
            }
            VideoFileInfo videoFileInfoLIZJ = C1404710mer.LIZJ(outputFile);
            if (videoFileInfoLIZJ != null) {
                codecType = videoFileInfoLIZJ.getCodecType();
            } else {
                codecType = -1;
            }
            VideoPublishEditModel videoPublishEditModel8 = this.LJ;
            if (videoPublishEditModel8 == null) {
                videoPublishEditModel8 = null;
            }
            int[] iArrLIZ = C1404660mem.LIZ(videoPublishEditModel8.getPreviewInfo());
            if (iArrLIZ != null) {
                i5 = iArrLIZ[8];
            } else {
                i5 = -1;
            }
            VideoPublishEditModel videoPublishEditModel9 = this.LJ;
            if (videoPublishEditModel9 == null) {
                videoPublishEditModel9 = null;
            }
            Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel9);
            int iIntValue = pairLJIIJJI.getFirst().intValue() + pairLJIIJJI.getSecond().intValue();
            if (iIntValue > 1) {
                i6 = 1;
            } else if (iIntValue == 1) {
                i6 = 0;
            } else {
                i6 = -1;
            }
            VideoPublishEditModel videoPublishEditModel10 = this.LJ;
            if (videoPublishEditModel10 == null) {
                videoPublishEditModel10 = null;
            }
            if (C2286708xd.LIZJ(videoPublishEditModel10.getRealSynthesisFile())) {
                Object[] objArr = new Object[1];
                VideoPublishEditModel videoPublishEditModel11 = this.LJ;
                if (videoPublishEditModel11 == null) {
                    videoPublishEditModel11 = null;
                }
                objArr[0] = Long.valueOf(C2471909mP.LJIIIZ(videoPublishEditModel11.getRealSynthesisFile()) / ((long) 1024));
                strK4 = C786410Ut5.k4(locale, "%d", Arrays.copyOf(objArr, 1));
            } else {
                VideoPublishEditModel videoPublishEditModel12 = this.LJ;
                if (videoPublishEditModel12 == null) {
                    videoPublishEditModel12 = null;
                }
                if (C2286708xd.LIZJ(videoPublishEditModel12.getOutputFile())) {
                    Object[] objArr2 = new Object[1];
                    VideoPublishEditModel videoPublishEditModel13 = this.LJ;
                    if (videoPublishEditModel13 == null) {
                        videoPublishEditModel13 = null;
                    }
                    objArr2[0] = Long.valueOf(C2471909mP.LJIIIZ(videoPublishEditModel13.getOutputFile()) / ((long) 1024));
                    strK4 = C786410Ut5.k4(locale, "%d", Arrays.copyOf(objArr2, 1));
                } else {
                    strK4 = null;
                }
            }
            VideoPublishEditModel videoPublishEditModel14 = this.LJ;
            if (videoPublishEditModel14 == null) {
                videoPublishEditModel14 = null;
            }
            if (!TextUtils.isEmpty(videoPublishEditModel14.mShootWay)) {
                VideoPublishEditModel videoPublishEditModel15 = this.LJ;
                if (videoPublishEditModel15 == null) {
                    videoPublishEditModel15 = null;
                }
                c0labLJIIIIZZ.LJ("shoot_way", videoPublishEditModel15.mShootWay);
            }
            VideoPublishEditModel videoPublishEditModel16 = this.LJ;
            if (videoPublishEditModel16 == null) {
                videoPublishEditModel16 = null;
            }
            if (!TextUtils.isEmpty(videoPublishEditModel16.getClientId())) {
                VideoPublishEditModel videoPublishEditModel17 = this.LJ;
                if (videoPublishEditModel17 == null) {
                    videoPublishEditModel17 = null;
                }
                c0labLJIIIIZZ.LJ("channel", videoPublishEditModel17.getClientId());
            }
            VideoPublishEditModel videoPublishEditModel18 = this.LJ;
            if (videoPublishEditModel18 == null) {
                videoPublishEditModel18 = null;
            }
            if (!TextUtils.isEmpty(videoPublishEditModel18.getShareId())) {
                VideoPublishEditModel videoPublishEditModel19 = this.LJ;
                if (videoPublishEditModel19 == null) {
                    videoPublishEditModel19 = null;
                }
                c0labLJIIIIZZ.LJ("open_platform_share_id", videoPublishEditModel19.getShareId());
            }
            VideoPublishEditModel videoPublishEditModel20 = this.LJ;
            if (videoPublishEditModel20 == null) {
                videoPublishEditModel20 = null;
            }
            c0labLJIIIIZZ.LJ("creation_id", videoPublishEditModel20.getCreationId());
            VideoPublishEditModel videoPublishEditModel21 = this.LJ;
            if (videoPublishEditModel21 == null) {
                videoPublishEditModel21 = null;
            }
            c0labLJIIIIZZ.LJ("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel21.getCurFilterIds()));
            VideoPublishEditModel videoPublishEditModel22 = this.LJ;
            if (videoPublishEditModel22 == null) {
                videoPublishEditModel22 = null;
            }
            c0labLJIIIIZZ.LJ("prop_list", videoPublishEditModel22.getStickerID());
            if (z2) {
                str9 = "1";
            } else {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJIIIIZZ.LJ("is_click_publish", str9);
            VideoPublishEditModel videoPublishEditModel23 = this.LJ;
            if (videoPublishEditModel23 == null) {
                videoPublishEditModel23 = null;
            }
            c0labLJIIIIZZ.LJ("effect_list", videoPublishEditModel23.getEditEffectListStr());
            VideoPublishEditModel videoPublishEditModel24 = this.LJ;
            if (videoPublishEditModel24 == null) {
                videoPublishEditModel24 = null;
            }
            c0labLJIIIIZZ.LJ("original_resolution", C1428520nHG.LJJIJL(videoPublishEditModel24));
            VideoPublishEditModel videoPublishEditModel25 = this.LJ;
            if (videoPublishEditModel25 == null) {
                videoPublishEditModel25 = null;
            }
            c0labLJIIIIZZ.LJ("info_sticker_list", videoPublishEditModel25.getInfoStickerList());
            VideoPublishEditModel videoPublishEditModel26 = this.LJ;
            if (videoPublishEditModel26 == null) {
                videoPublishEditModel26 = null;
            }
            if (videoPublishEditModel26.getSelectedId() != 0) {
                str10 = "1";
            } else {
                str10 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJIIIIZZ.LJ("video_edit_page_filter", str10);
            if (videoFileInfoLIZJ != null) {
                bitrate = videoFileInfoLIZJ.getBitrate();
            } else {
                bitrate = 0;
            }
            c0labLJIIIIZZ.LIZ(bitrate, "file_bitrate");
            VideoPublishEditModel videoPublishEditModel27 = this.LJ;
            if (videoPublishEditModel27 == null) {
                videoPublishEditModel27 = null;
            }
            if (videoPublishEditModel27.isSyntheticHardEncode()) {
                str11 = "hardcoding";
            } else {
                str11 = "softcoding";
            }
            c0labLJIIIIZZ.LJ("compose_coding", str11);
            VideoPublishEditModel videoPublishEditModel28 = this.LJ;
            if (videoPublishEditModel28 == null) {
                videoPublishEditModel28 = null;
            }
            if (C1439880nZa.LJIIIIZZ(videoPublishEditModel28)) {
                str12 = "1";
            } else {
                str12 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJIIIIZZ.LJ("is_reencode", str12);
            VideoPublishEditModel videoPublishEditModel29 = this.LJ;
            if (videoPublishEditModel29 == null) {
                videoPublishEditModel29 = null;
            }
            c0labLJIIIIZZ.LIZ(videoPublishEditModel29.isOpenForegroundPublish() ? 1 : 0, "is_open_foreground");
            VideoPublishEditModel videoPublishEditModel30 = this.LJ;
            if (videoPublishEditModel30 == null) {
                videoPublishEditModel30 = null;
            }
            c0labLJIIIIZZ.LIZ(videoPublishEditModel30.isBackgroundPublish() ? 1 : 0, "is_background_publish");
            c0labLJIIIIZZ.LJ("file_size", strK4);
            c0labLJIIIIZZ.LIZ(codecType, "codec_type");
            c0labLJIIIIZZ.LIZ(i5, "source_codec_type");
            c0labLJIIIIZZ.LIZ(i6, "is_multi_content");
            if (videoFileInfoLIZJ != null && (resolution = videoFileInfoLIZJ.getResolution()) != null) {
                str14 = resolution;
            }
            c0labLJIIIIZZ.LJ("resolution", str14);
            VideoPublishEditModel videoPublishEditModel31 = this.LJ;
            if (videoPublishEditModel31 == null) {
                videoPublishEditModel31 = null;
            }
            c0labLJIIIIZZ.LIZ(C577760MlK.LIZ(videoPublishEditModel31), "beautify_used");
            if (C294160Bfy.LIZ()) {
                c0labLJIIIIZZ.LJ("beautify_info", C1409940mnI.LIZ);
            }
            VideoPublishEditModel videoPublishEditModel32 = this.LJ;
            if (videoPublishEditModel32 == null) {
                videoPublishEditModel32 = null;
            }
            UploadSpeedInfo uploadSpeedInfo2 = videoPublishEditModel32.getUploadSpeedInfo();
            if (uploadSpeedInfo2 != null) {
                speed2 = uploadSpeedInfo2.getSpeed();
            } else {
                speed2 = -6;
            }
            c0labLJIIIIZZ.LIZIZ(speed2, "upload_probe_speed");
            if (videoFileInfoLIZJ != null) {
                fps = videoFileInfoLIZJ.getFps();
            } else {
                fps = 0;
            }
            c0labLJIIIIZZ.LIZ(fps, "file_fps");
            VideoPublishEditModel videoPublishEditModel33 = this.LJ;
            if (videoPublishEditModel33 == null) {
                videoPublishEditModel33 = null;
            }
            if (!videoPublishEditModel33.hasStickers() && videoPublishEditModel33.getTimeEffect() == null && !C0IKQ.LIZIZ(videoPublishEditModel33.getEffectList()) && videoPublishEditModel33.getSelectedId() == 0) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            c0labLJIIIIZZ.LIZ(i7, "is_filter");
            VideoPublishEditModel videoPublishEditModel34 = this.LJ;
            if (videoPublishEditModel34 == null) {
                videoPublishEditModel34 = null;
            }
            c0labLJIIIIZZ.LIZ(!C1428470nHB.LL(videoPublishEditModel34) ? 1 : 0, "is_multi_video");
            c0labLJIIIIZZ.LIZ(-1, "sw_conf_preset");
            VideoPublishEditModel videoPublishEditModel35 = this.LJ;
            if (videoPublishEditModel35 == null) {
                videoPublishEditModel35 = null;
            }
            c0labLJIIIIZZ.LIZ(C1437030nUz.LJ(videoPublishEditModel35) ? 1 : 0, "is_hd_video");
            c0labLJIIIIZZ.LIZ(-1, "sw_conf_crf");
            if (videoFileInfoLIZJ != null) {
                duration = videoFileInfoLIZJ.getDuration();
            } else {
                duration = -1;
            }
            c0labLJIIIIZZ.LIZIZ(duration, "source_duration");
            if (videoFileInfoLIZJ != null) {
                duration2 = videoFileInfoLIZJ.getDuration();
            } else {
                duration2 = -1;
            }
            c0labLJIIIIZZ.LIZIZ(duration2, "creation_duration");
            VideoPublishEditModel videoPublishEditModel36 = this.LJ;
            if (videoPublishEditModel36 == null) {
                videoPublishEditModel36 = null;
            }
            C1437030nUz.LIZIZ(videoPublishEditModel36, c0labLJIIIIZZ);
            VideoPublishEditModel videoPublishEditModel37 = this.LJ;
            if (videoPublishEditModel37 == null) {
                videoPublishEditModel37 = null;
            }
            C1437030nUz.LIZ(videoPublishEditModel37, c0labLJIIIIZZ);
            VideoPublishEditModel videoPublishEditModel38 = this.LJ;
            if (videoPublishEditModel38 == null) {
                videoPublishEditModel38 = null;
            }
            c0labLJIIIIZZ.LIZLLL(videoPublishEditModel38.getUploadSpeedSettingsIndex(), "select_gear_by_upload_speed");
            VideoPublishEditModel videoPublishEditModel39 = this.LJ;
            if (videoPublishEditModel39 == null) {
                videoPublishEditModel39 = null;
            }
            if (videoPublishEditModel39.getPreviewInfo() != null) {
                VideoPublishEditModel videoPublishEditModel40 = this.LJ;
                if (videoPublishEditModel40 == null) {
                    videoPublishEditModel40 = null;
                }
                if (!videoPublishEditModel40.getPreviewInfo().getVideoList().isEmpty()) {
                    VideoPublishEditModel videoPublishEditModel41 = this.LJ;
                    if (videoPublishEditModel41 == null) {
                        videoPublishEditModel41 = null;
                    }
                    EditVideoSegment editVideoSegment = (EditVideoSegment) ListProtector.get(videoPublishEditModel41.getPreviewInfo().getVideoList(), 0);
                    VideoFileInfo videoFileInfo = editVideoSegment.getVideoFileInfo();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(videoFileInfo.getWidth());
                    sbLIZ3.append('*');
                    sbLIZ3.append(videoFileInfo.getHeight());
                    c0labLJIIIIZZ.LJ("src_resolution", C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(videoFileInfo.getWidth());
                    sbLIZ4.append('*');
                    sbLIZ4.append(videoFileInfo.getHeight());
                    c0labLJIIIIZZ.LJ("pre_resolution", C2188811AlT.LIZIZ(sbLIZ4));
                    c0labLJIIIIZZ.LIZ(videoFileInfo.getFps(), "src_fps");
                    c0labLJIIIIZZ.LIZ(videoFileInfo.getFps(), "pre_fps");
                    c0labLJIIIIZZ.LIZ(videoFileInfo.getBitrate(), "src_bitrate");
                    VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                    if (videoCutInfo != null) {
                        c0labLJIIIIZZ.LIZIZ(videoCutInfo.getEnd() - videoCutInfo.getStart(), "src_duration");
                    } else {
                        c0labLJIIIIZZ.LIZIZ(videoFileInfo.getDuration(), "src_duration");
                    }
                }
            }
            VideoPublishEditModel videoPublishEditModel42 = this.LJ;
            if (videoPublishEditModel42 == null) {
                videoPublishEditModel42 = null;
            }
            if (TextUtils.equals(C1428470nHB.LJIILIIL(videoPublishEditModel42), "upload")) {
                VideoPublishEditModel videoPublishEditModel43 = this.LJ;
                if (videoPublishEditModel43 == null) {
                    videoPublishEditModel43 = null;
                }
                c0labLJIIIIZZ.LIZ(C1428470nHB.LJJLIIIJ(videoPublishEditModel43) ? 1 : 0, "is_fast_import");
            }
            VideoPublishEditModel videoPublishEditModel44 = this.LJ;
            if (videoPublishEditModel44 == null) {
                videoPublishEditModel44 = null;
            }
            c0labLJIIIIZZ.LJ("creation_id", videoPublishEditModel44.getCreationId());
        }
        if (synthetiseResult != null && (i4 = synthetiseResult.unableRemuxCode) != 0) {
            c0labLJIIIIZZ.LIZ(i4, "notRemuxErrorcode");
        } else {
            int i9 = this.LJIILIIL;
            if (i9 != 0) {
                c0labLJIIIIZZ.LIZ(i9, "notRemuxErrorcode");
            }
        }
        if (synthetiseResult != null) {
            c0labLJIIIIZZ.LIZ(synthetiseResult.synthetiseCPUEncode, "synthetise_cpu_encode");
        } else {
            c0labLJIIIIZZ.LIZ(this.LJIILJJIL, "synthetise_cpu_encode");
        }
        c0labLJIIIIZZ.LIZ(C0CHQ.LIZ().getPublishService().LJJJJJL(), "publish_cnt");
        VideoPublishEditModel videoPublishEditModel45 = this.LJ;
        if (videoPublishEditModel45 == null) {
            videoPublishEditModel45 = null;
        }
        SynthetiseResult synthetiseResultLJI = LJI();
        if (C1428470nHB.LJJZZI(videoPublishEditModel45) && synthetiseResultLJI != null && synthetiseResultLJI.imageSynthesisResult != null) {
            StrArray strArray = new StrArray();
            StrArray strArray2 = new StrArray();
            if (C1428470nHB.LJJZZI(videoPublishEditModel45)) {
                List<PublishImageModel> list2 = synthetiseResultLJI.imageSynthesisResult;
                list = list2;
                if (list2 == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                NowsShootModel nowsShootModel = videoPublishEditModel45.creativeModel.nowsShootModel;
                if (nowsShootModel != null) {
                    List listLJJJJLI = C13LP.LJJJJLI(C1697810uHb.LJIILJJIL(nowsShootModel.ltrCompileImage, nowsShootModel.rtlCompileImage));
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
                    Iterator it2 = ((ArrayList) listLJJJJLI).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new PublishImageModel((String) it2.next(), C1404780mey.LIZ, C1404780mey.LIZIZ, null, null, true));
                    }
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    String str15 = nowsShootModel.frontImagePath;
                    if (str15 != null) {
                        arrayList2.add(new PublishImageModel(str15, C1404780mey.LIZ(), C1404780mey.LIZLLL, null, null, true));
                    }
                    String str16 = nowsShootModel.backImagePath;
                    list = arrayList2;
                    if (str16 != null) {
                        arrayList2.add(new PublishImageModel(str16, C1404780mey.LIZ(), C1404780mey.LIZLLL, null, null, true));
                        list = arrayList2;
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            long j2 = 0;
            for (PublishImageModel publishImageModel : list) {
                long length2 = new C0VSJ(publishImageModel.path).length();
                strArray.add(String.valueOf(length2));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(publishImageModel.width);
                sbLIZ5.append('*');
                sbLIZ5.append(publishImageModel.height);
                strArray2.add(C2188811AlT.LIZIZ(sbLIZ5));
                j2 += length2;
            }
            c0labLJIIIIZZ.LIZ(list.size(), "image_count");
            c0labLJIIIIZZ.LIZIZ(j2, "total_size");
            c0labLJIIIIZZ.LJ("upload_type", "content");
            c0labLJIIIIZZ.LJ("image_size_arr", strArray.toString());
            c0labLJIIIIZZ.LJ("image_resolution_arr", strArray2.toString());
        }
        C1404740meu c1404740meu = this.LJIIIZ;
        if (c1404740meu != null) {
            List<C1404760mew> list3 = c1404740meu.LIZ;
            if (list3 != null && (c1404760mew = (C1404760mew) C13LP.LJJJLL(list3)) != null) {
                i3 = c1404760mew.LIZ * 1024;
            } else {
                i3 = 0;
            }
            c0labLJIIIIZZ.LIZ(i3, "adapt_chunk_size");
        }
        VideoPublishEditModel videoPublishEditModel46 = this.LJ;
        if (videoPublishEditModel46 == null) {
            videoPublishEditModel46 = null;
        }
        C0EMD.LIZIZ(c0labLJIIIIZZ, videoPublishEditModel46);
        VideoPublishEditModel videoPublishEditModel47 = this.LJ;
        if (videoPublishEditModel47 == null) {
            videoPublishEditModel47 = null;
        }
        ShareKitPanel shareKitPanel = videoPublishEditModel47.getCreativeFlowData().getShareKitPanel();
        if (shareKitPanel != null) {
            c0labLJIIIIZZ.LJ("effect_resource_id", shareKitPanel.getEffectResourceId());
            c0labLJIIIIZZ.LJ("channel", shareKitPanel.getClientKey());
            c0labLJIIIIZZ.LJ("share_panel_option", shareKitPanel.getSharePanelOption());
            c0labLJIIIIZZ.LIZLLL(shareKitPanel.getShareMediaType(), "share_media_type");
        }
        VideoPublishEditModel videoPublishEditModel48 = this.LJ;
        if (videoPublishEditModel48 == null) {
            videoPublishEditModel48 = null;
        }
        C1402840mbq c1402840mbqLIZLLL = C1B46.LIZLLL(videoPublishEditModel48);
        if (c1402840mbqLIZLLL != null) {
            c0labLJIIIIZZ.LJ("channel", c1402840mbqLIZLLL.mClientKey);
            c0labLJIIIIZZ.LJ("sdk_name", c1402840mbqLIZLLL.getSdkNameForServer());
            c0labLJIIIIZZ.LJ("sdk_version", c1402840mbqLIZLLL.mSdkVersion);
        }
        VideoPublishEditModel videoPublishEditModel49 = this.LJ;
        if (videoPublishEditModel49 == null) {
            videoPublishEditModel49 = null;
        }
        String str17 = videoPublishEditModel49.mShootWay;
        if (str17 != null) {
            c0labLJIIIIZZ.LJ("shoot_way", str17);
        }
        VideoPublishEditModel videoPublishEditModel50 = this.LJ;
        if (videoPublishEditModel50 == null) {
            videoPublishEditModel50 = null;
        }
        if (videoPublishEditModel50.getCreativeFlowData().getEditorProModel() != null) {
            VideoPublishEditModel videoPublishEditModel51 = this.LJ;
            if (videoPublishEditModel51 == null) {
                videoPublishEditModel51 = null;
            }
            if (videoPublishEditModel51.getEditorProModel().isAdvancedEdit()) {
                str8 = "1";
            } else {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJIIIIZZ.LJ("is_use_editor_pro", str8);
            VideoPublishEditModel videoPublishEditModel52 = this.LJ;
            if (videoPublishEditModel52 == null) {
                videoPublishEditModel52 = null;
            }
            if (!videoPublishEditModel52.getEditorProModel().isPipUsed()) {
                str13 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLJIIIIZZ.LJ("is_use_pip", str13);
            C0EMG c0emg = C0EMG.LIZ;
            VideoPublishEditModel videoPublishEditModel53 = this.LJ;
            if (videoPublishEditModel53 == null) {
                videoPublishEditModel53 = null;
            }
            c0emg.getClass();
            c0labLJIIIIZZ.LJ("all_editor_pro_used_functions", C0EMG.LIZ(videoPublishEditModel53));
        }
        VideoPublishEditModel videoPublishEditModel54 = this.LJ;
        if (videoPublishEditModel54 == null) {
            videoPublishEditModel54 = null;
        }
        NowsShootModel nowsShootModel2 = videoPublishEditModel54.creativeModel.nowsShootModel;
        if (nowsShootModel2 != null && (str7 = nowsShootModel2.multiCameraMode) != null) {
            c0labLJIIIIZZ.LJ("multi_camera_mode", str7);
        }
        VideoPublishEditModel videoPublishEditModel55 = this.LJ;
        if (videoPublishEditModel55 == null) {
            videoPublishEditModel55 = null;
        }
        c0labLJIIIIZZ.LJ("scenes_tag", String.valueOf(C1428470nHB.LJIIJJI(videoPublishEditModel55)));
        c0labLJIIIIZZ.LIZIZ(this.LJIILL.LIZ(1), "duration_1001");
        c0labLJIIIIZZ.LIZIZ(this.LJIILL.LIZ(3), "duration_1003");
        VideoPublishEditModel videoPublishEditModel56 = this.LJ;
        if (videoPublishEditModel56 == null) {
            videoPublishEditModel56 = null;
        }
        c0labLJIIIIZZ.LIZ(videoPublishEditModel56.creativeModel.commonMobModel.isReCreateAuthkey ? 1 : 0, "is_recreate");
        VideoPublishEditModel videoPublishEditModel57 = this.LJ;
        if (videoPublishEditModel57 == null) {
            videoPublishEditModel57 = null;
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel57)) {
            VideoPublishEditModel videoPublishEditModel58 = this.LJ;
            if (videoPublishEditModel58 == null) {
                videoPublishEditModel58 = null;
            }
            c0labLJIIIIZZ.LIZ(C1428470nHB.LJJJJLL(videoPublishEditModel58) ? 1 : 0, "is_canvas_as_image");
        }
        VideoPublishEditModel videoPublishEditModel59 = this.LJ;
        if (videoPublishEditModel59 == null) {
            videoPublishEditModel59 = null;
        }
        if (!C1428470nHB.LJJZZI(videoPublishEditModel59)) {
            str6 = "video_publish_end";
        } else {
            str6 = "photo_publish_end";
        }
        if (Intrinsics.LJFF(str6, "video_publish_end")) {
            VideoPublishEditModel videoPublishEditModel60 = this.LJ;
            if (videoPublishEditModel60 == null) {
                videoPublishEditModel60 = null;
            }
            c0labLJIIIIZZ.LIZ(C1428470nHB.LJJIL(videoPublishEditModel60), "source_is_hdr");
            VideoPublishEditModel videoPublishEditModel61 = this.LJ;
            if (videoPublishEditModel61 == null) {
                videoPublishEditModel61 = null;
            }
            c0labLJIIIIZZ.LIZ(videoPublishEditModel61.creativeModel.hdrModel.videoCodeType, "is_hdr");
            C0LDJ c0ldj = C0LDJ.LIZ;
            VideoPublishEditModel videoPublishEditModel62 = this.LJ;
            if (videoPublishEditModel62 == null) {
                videoPublishEditModel62 = null;
            }
            c0ldj.getClass();
            C0LDJ.LIZIZ(videoPublishEditModel62, c0labLJIIIIZZ);
        }
        Map<String, String> map = c0labLJIIIIZZ.LIZ;
        InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIJ;
        if (interfaceC1434300nQa == null) {
            interfaceC1434300nQa = null;
        }
        interfaceC1434300nQa.LJ().getClass();
        C20684815ws.LJIILLIIL(str6, map);
        VideoPublishEditModel videoPublishEditModel63 = this.LJ;
        if (videoPublishEditModel63 == null) {
            videoPublishEditModel63 = null;
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel63)) {
            C1444200ngY c1444200ngY = C1444200ngY.LIZ;
            VideoPublishEditModel videoPublishEditModel64 = this.LJ;
            if (videoPublishEditModel64 == null) {
                videoPublishEditModel64 = null;
            }
            c1444200ngY.getClass();
            C1444200ngY.LJ(videoPublishEditModel64);
        }
    }
}
