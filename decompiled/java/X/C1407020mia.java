package X;

import Y.AObserverS225S0100000_22;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import ayh.i5;
import com.bytedance.ies.nle.editor_jni.INLEListenerCommon;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEMediaUtil;
import com.bytedance.ies.nle.editor_jni.NLEMediaVideoInfo;
import com.bytedance.ies.nle.editor_jni.NLEMediaVideoInfoListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.utils.oh;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407020mia {
    public final C0E48 LIZ;
    public final C19A3 LIZIZ;
    public VideoPublishEditModel LIZJ;
    public C1DRG LIZLLL;
    public final MutableLiveData<C1403050mcB> LJ;
    public final C372940Ejk LJFF;
    public final C1407160mio LJI;
    public final C01GW LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;

    public final void LIZ() {
        InterfaceC359950E9h interfaceC359950E9h;
        LiveData<Boolean> liveDataQO0;
        C1DRG c1drg = this.LIZLLL;
        if (c1drg == null || (interfaceC359950E9h = (InterfaceC359950E9h) c1drg.LJIIL(null, InterfaceC359950E9h.class)) == null || (liveDataQO0 = interfaceC359950E9h.QO0()) == null) {
            return;
        }
        if (Intrinsics.LJFF(liveDataQO0.getValue(), Boolean.TRUE)) {
            LIZIZ();
        } else if (liveDataQO0 != null) {
            liveDataQO0.observe(this.LIZIZ, new AObserverS225S0100000_22(this, 156));
        }
    }

    public final void LIZIZ() {
        INLEMediaSession iNLEMediaSessionF1;
        INLEPlayer playerApi;
        C0E48 c0e48 = this.LIZ;
        if (c0e48 != null) {
            c0e48.fj(this.LJI);
            if (!c0e48.Ls() || (iNLEMediaSessionF1 = c0e48.f1()) == null || (playerApi = iNLEMediaSessionF1.getPlayerApi()) == null) {
                return;
            }
            playerApi.addOnInfoListener(this.LJFF, true);
        }
    }

    public final void LJI() {
        INLEMediaSession iNLEMediaSessionF1;
        INLEPlayer playerApi;
        C0E48 c0e48 = this.LIZ;
        if (c0e48 != null) {
            c0e48.Ej(this.LJI);
            if ((!c0e48.Ls() && this.LJIIIZ) || (iNLEMediaSessionF1 = c0e48.f1()) == null || (playerApi = iNLEMediaSessionF1.getPlayerApi()) == null) {
                return;
            }
            playerApi.removeOnInfoListener(this.LJFF);
        }
    }

    public final void LJII() {
        InterfaceC372810EjX config;
        InterfaceC372810EjX config2;
        if (C0A1M.LIZ()) {
            C0E48 c0e48 = this.LIZ;
            int pageMode = (c0e48 == null || (config2 = c0e48.getConfig()) == null) ? -1 : config2.getPageMode();
            if (pageMode != 104 && pageMode >= 0) {
                this.LJIIIIZZ = pageMode;
            }
            C0E48 c0e482 = this.LIZ;
            if (c0e482 == null || (config = c0e482.getConfig()) == null) {
                return;
            }
            config.setPageMode(104);
        }
    }

    public final void LJIIIIZZ() {
        LJII();
        if (C306610C0d.LIZ()) {
            oh.LIZJ("tool_editor_pro_scene", i5.LIZIZ(), -1L, null, null);
        }
        LIZ();
    }

    public static long LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        List<EditVideoSegment> videoList2;
        long end;
        long start;
        long duration = 0;
        if (videoPublishEditModel.isFastImport()) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (previewInfo != null && (videoList2 = previewInfo.getVideoList()) != null) {
                long jMax = 0;
                for (EditVideoSegment editVideoSegment : videoList2) {
                    VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                    if (videoCutInfo != null) {
                        end = videoCutInfo.getEnd();
                    } else {
                        end = 0;
                    }
                    VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                    if (videoCutInfo2 != null) {
                        start = videoCutInfo2.getStart();
                    } else {
                        start = 0;
                    }
                    jMax += Math.max(0L, end - start);
                }
                return jMax;
            }
        } else {
            EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
            if (previewInfo2 != null && (videoList = previewInfo2.getVideoList()) != null) {
                Iterator<EditVideoSegment> it2 = videoList.iterator();
                while (it2.hasNext()) {
                    duration += it2.next().getVideoFileInfo().getDuration();
                }
            }
        }
        return duration;
    }

    public final void LJ(VideoPublishEditModel videoPublishEditModel) {
        float playFps;
        String str;
        Object objValueOf;
        int i;
        Object objValueOf2;
        int i2;
        int i3;
        int i4;
        int i5;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaRuntime mediaRuntimeApi;
        C1403050mcB value = this.LJ.getValue();
        final C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(videoPublishEditModel);
        c0labLJIILIIL.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJIILIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        C0E48 c0e48 = this.LIZ;
        if (c0e48 != null && c0e48.Ls() && (iNLEMediaSessionF1 = c0e48.f1()) != null && (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) != null) {
            playFps = mediaRuntimeApi.getPlayFps();
        } else {
            playFps = 0.0f;
        }
        c0labLJIILIIL.LIZJ(Float.valueOf(playFps), "play_fps");
        c0labLJIILIIL.LJ("next_action", "go_edit");
        c0labLJIILIIL.LIZ(C577760MlK.LIZ(videoPublishEditModel), "beautify_used");
        c0labLJIILIIL.LIZ(1, "is_composer");
        if (C294160Bfy.LIZ()) {
            c0labLJIILIIL.LJ("beautify_info", C1409940mnI.LJ(C1409940mnI.LIZIZ));
        }
        c0labLJIILIIL.LJ("duration", String.valueOf(LIZLLL(videoPublishEditModel)));
        c0labLJIILIIL.LJ("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel.getCurFilterIds()));
        if (AVSettingsWrapper.enableHardEncodeForRecord()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJIILIIL.LJ("is_hardcode", str);
        c0labLJIILIIL.LIZ(AVSettingsWrapper.com_ss_android_ugc_aweme_property_AVSettingsWrapper_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getRecordQuality(), "video_quality");
        c0labLJIILIIL.LIZJ(Float.valueOf(AVSettingsWrapper.getRecordBitrate(videoPublishEditModel)), "bitrate");
        c0labLJIILIIL.LJ("resolution", videoPublishEditModel.getVideoResolution());
        c0labLJIILIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJIILIIL.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJIILIIL.LJ("prop_list", videoPublishEditModel.getStickerID());
        c0labLJIILIIL.LJ("prop_selected_from", videoPublishEditModel.getPropSource());
        c0labLJIILIIL.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "source_duration");
        int i6 = -1;
        if (value != null) {
            objValueOf = Float.valueOf(value.LIZ);
        } else {
            objValueOf = -1;
        }
        c0labLJIILIIL.LIZLLL(objValueOf, "preview_fps");
        if (value != null) {
            i = value.LIZIZ;
        } else {
            i = -1;
        }
        c0labLJIILIIL.LIZ(i, "preview_lag_count");
        if (value != null) {
            objValueOf2 = Float.valueOf(value.LIZLLL);
        } else {
            objValueOf2 = -1;
        }
        c0labLJIILIIL.LIZLLL(objValueOf2, "preview_lag_total_duration");
        if (value != null) {
            i6 = value.LIZJ;
        }
        c0labLJIILIIL.LIZ(i6, "preview_serious_lag_count");
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int i7 = 0;
        if (pairLJIIJJI.getFirst().intValue() + pairLJIIJJI.getSecond().intValue() > 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0labLJIILIIL.LIZ(i2, "is_multi_content");
        C0E48 c0e482 = this.LIZ;
        if (c0e482 != null) {
            c0labLJIILIIL.LJI(C350140Do4.LIZ(c0e482.getPlayer().qq(), C350870DpF.LJI(c0e482)));
        }
        this.LJ.postValue(new C1403050mcB(0));
        if (((Boolean) C266980AdE.LIZ.getValue()).booleanValue()) {
            NLEMediaUtil.getMediaVideoInfoAsync(videoPublishEditModel.videoPath(), new NLEMediaVideoInfoListener() { // from class: X.0mib
                @Override // com.bytedance.ies.nle.editor_jni.NLEMediaVideoInfoListener
                public final void onFail(int i8) {
                }

                @Override // com.bytedance.ies.nle.editor_jni.NLEMediaVideoInfoListener
                public final void onDone(NLEMediaVideoInfo nLEMediaVideoInfo) {
                    if (nLEMediaVideoInfo != null) {
                        C1407020mia c1407020mia = this.LIZ;
                        C0LAB c0lab = c0labLJIILIIL;
                        int fps = (int) nLEMediaVideoInfo.getFps();
                        int bitrate = (int) nLEMediaVideoInfo.getBitrate();
                        int width = (int) nLEMediaVideoInfo.getWidth();
                        int height = (int) nLEMediaVideoInfo.getHeight();
                        c1407020mia.getClass();
                        C1407020mia.LIZJ(c0lab, fps, bitrate, width, height);
                    }
                }
            });
            return;
        }
        int[] iArrLIZIZ = C1404710mer.LIZIZ(videoPublishEditModel.videoPath());
        if (iArrLIZIZ != null) {
            i3 = iArrLIZIZ[7];
            i4 = iArrLIZIZ[6];
            i5 = iArrLIZIZ[0];
            i7 = iArrLIZIZ[1];
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        LIZJ(c0labLJIILIIL, i3, i4, i5, i7);
    }

    public final void LJFF(VideoPublishEditModel videoPublishEditModel) {
        float playFps;
        Object objValueOf;
        int i;
        Object objValueOf2;
        int i2;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaRuntime mediaRuntimeApi;
        C1403050mcB value = this.LJ.getValue();
        String creationId = videoPublishEditModel.getCreationId();
        String str = videoPublishEditModel.mShootWay;
        C0E48 c0e48 = this.LIZ;
        if (c0e48 != null && c0e48.Ls() && (iNLEMediaSessionF1 = c0e48.f1()) != null && (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) != null) {
            playFps = mediaRuntimeApi.getPlayFps();
        } else {
            playFps = 0.0f;
        }
        int iLIZ = C577760MlK.LIZ(videoPublishEditModel);
        String strValueOf = String.valueOf(LIZLLL(videoPublishEditModel));
        String videoResolution = videoPublishEditModel.getVideoResolution();
        String strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        String strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
        String stickerID = videoPublishEditModel.getStickerID();
        String propSource = videoPublishEditModel.getPropSource();
        int previewVideoLength = videoPublishEditModel.getPreviewInfo().getPreviewVideoLength();
        if (value != null) {
            objValueOf = Float.valueOf(value.LIZ);
            i = value.LIZIZ;
            objValueOf2 = Float.valueOf(value.LIZLLL);
            i2 = value.LIZJ;
        } else {
            objValueOf = -1;
            i = -1;
            objValueOf2 = -1;
            i2 = -1;
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue() + pairLJIIJJI.getSecond().intValue();
        int i3 = 1;
        if (iIntValue <= 1) {
            i3 = 0;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1407010miZ(videoPublishEditModel, this, creationId, str, playFps, iLIZ, strValueOf, videoResolution, strLJIILL, strLJIILIIL, stickerID, propSource, previewVideoLength, objValueOf, i, objValueOf2, i2, i3, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Ejk] */
    public C1407020mia(C0E48 c0e48, C372480Ej0 c372480Ej0) {
        this.LIZ = c0e48;
        this.LIZIZ = c372480Ej0;
        MutableLiveData<C1403050mcB> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.postValue(new C1403050mcB(0));
        this.LJ = mutableLiveData;
        this.LJFF = new INLEListenerCommon() { // from class: X.0Ejk
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
            public final void onCallback(int i, int i2, float f, String str) {
                C0E55 player;
                float f2 = f;
                if (i == 4122) {
                    C1407020mia c1407020mia = this.LIZ;
                    C1403050mcB value = c1407020mia.LJ.getValue();
                    if (value != null) {
                        float f3 = value.LIZ;
                        if (f3 >= 0.0f) {
                            f2 = (f3 + f2) / 2;
                        }
                        c1407020mia.LJ.postValue(C1403050mcB.LIZ(value, f2, 0, 0, 0.0f, 14));
                        return;
                    }
                    return;
                }
                C1403050mcB c1403050mcBLIZ = null;
                if (i == 4162) {
                    MutableLiveData<C1403050mcB> mutableLiveData2 = this.LIZ.LJ;
                    C1403050mcB value2 = mutableLiveData2.getValue();
                    if (value2 != null) {
                        c1403050mcBLIZ = C1403050mcB.LIZ(value2, 0.0f, 0, 0, f2, 7);
                    }
                    mutableLiveData2.postValue(c1403050mcBLIZ);
                    return;
                }
                if (i == 4163) {
                    int i3 = (int) f2;
                    MutableLiveData<C1403050mcB> mutableLiveData3 = this.LIZ.LJ;
                    C1403050mcB value3 = mutableLiveData3.getValue();
                    if (value3 != null) {
                        c1403050mcBLIZ = C1403050mcB.LIZ(value3, 0.0f, i3, 0, 0.0f, 13);
                    }
                    mutableLiveData3.postValue(c1403050mcBLIZ);
                    return;
                }
                if (i == 4164) {
                    int i4 = (int) f2;
                    MutableLiveData<C1403050mcB> mutableLiveData4 = this.LIZ.LJ;
                    C1403050mcB value4 = mutableLiveData4.getValue();
                    if (value4 != null) {
                        c1403050mcBLIZ = C1403050mcB.LIZ(value4, 0.0f, 0, i4, 0.0f, 11);
                    }
                    mutableLiveData4.postValue(c1403050mcBLIZ);
                    return;
                }
                if (i != 4428) {
                    return;
                }
                C1407020mia c1407020mia2 = this.LIZ;
                c1407020mia2.getClass();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    C0LAB c0lab = new C0LAB();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        c0lab.LIZLLL(jSONObject.get(next), next);
                    }
                    VideoPublishEditModel videoPublishEditModel = c1407020mia2.LIZJ;
                    if (videoPublishEditModel != null) {
                        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
                        c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
                        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
                        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
                        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
                        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
                        C0E48 c0e482 = c1407020mia2.LIZ;
                        if (c0e482 != null && (player = c0e482.getPlayer()) != null) {
                            c0lab.LIZIZ(player.qq(), "creation_duration");
                        }
                    }
                    List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                    C2341909Fp.LIZ("tool_performance_edit_pro_preview", c0lab.LIZ);
                    C354270Duj.LIZJ(0L, new AwS406S0200000_5(c1407020mia2, c0lab, 114));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
        this.LJI = new C1407160mio(new AwS566S0100000_22(this, 857));
        this.LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1138));
        this.LJIIIIZZ = -1;
        this.LJIIIZ = true;
    }

    public static void LIZJ(C0LAB c0lab, int i, int i2, int i3, int i4) {
        c0lab.LIZ(i, "file_fps");
        c0lab.LIZ(i2, "file_bitrate");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i3);
        sbLIZ.append('*');
        sbLIZ.append(i4);
        c0lab.LJ("original_resolution", C2188811AlT.LIZIZ(sbLIZ));
        C303380Buq.LIZ("tool_performance_edit_preview_pro", c0lab.LIZ);
    }
}
