package X;

import Y.AfS0S0200133_22;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult;
import com.ss.android.ugc.aweme.creative.model.music.AudioRatioInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorService;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResultForServer;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.AutoApplyMusicResponse;
import com.ss.android.ugc.aweme.tools.music.utils.IEditMusicServiceApi;
import com.ss.android.ugc.gamora.editor.music.experiment.AutoMusicRecommendConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0o1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456980o1A {
    public static IEditMusicServiceApi LIZIZ() {
        return C1458080o2w.LJIJI.getValue();
    }

    public static void LIZ(C0F3X c0f3x) {
        List<Function1<C0F3X, Unit>> list = C1458080o2w.LJIILL;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        List listLLIIII = C13LP.LLIIII(list);
        arrayList.clear();
        String str = C1458080o2w.LJIIZILJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("drainPendingAedCallbacks size:");
        sbLIZ.append(listLLIIII.size());
        sbLIZ.append(", result:");
        sbLIZ.append(c0f3x);
        C201955140j.LJIILIIL(str, C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(c0f3x);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x022f, code lost:
    
        X.C201955140j.LJIILIIL(X.C1458080o2w.LJIIZILJ, "return AUTO_LOAD_REJECT, hasEffectWithNotRecommendMusic");
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0236, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x022f A[EDGE_INSN: B:388:0x022f->B:170:0x022f BREAK  A[LOOP:0: B:124:0x0184->B:389:0x0184], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x01dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8) {
        /*
            Method dump skipped, instruction units count: 1325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1456980o1A.LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):int");
    }

    public static void LIZJ(final VideoPublishEditModel videoPublishEditModel, final Function1 function1) {
        ((IVoiceDetectorService) ServiceManager.get().getService(IVoiceDetectorService.class)).setVoiceDetectionTaskListener(1, new VoiceDetectionListener() { // from class: X.0o1E
            @Override // com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener
            public final void onUpdateResult(VoiceDetectionResult voiceDetectionResult) {
                VoiceDetectionListener.DefaultImpls.onUpdateResult(this, voiceDetectionResult);
            }

            @Override // com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener
            public final void onVoiceActivityDetected(VoiceDetectionResult voiceDetectionResult) throws JSONException {
                long duration;
                boolean z;
                Pair pair;
                boolean z2;
                EditPreviewInfo previewInfo;
                List<EditVideoSegment> videoList;
                String str;
                C1429890nJT mainBusinessContext;
                C1402840mbq shareContext;
                if (((Boolean) C0BNB.LIZ.getValue()).booleanValue()) {
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    if (videoPublishEditModel2 != null && (mainBusinessContext = videoPublishEditModel2.getMainBusinessContext()) != null && (shareContext = mainBusinessContext.getShareContext()) != null) {
                        str = shareContext.mAppName;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "CapCut")) {
                        return;
                    }
                }
                VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel;
                if (videoPublishEditModel3 != null && (previewInfo = videoPublishEditModel3.getPreviewInfo()) != null && (videoList = previewInfo.getVideoList()) != null) {
                    Iterator<EditVideoSegment> it2 = videoList.iterator();
                    duration = 0;
                    while (it2.hasNext()) {
                        duration += it2.next().getVideoFileInfo().getDuration();
                    }
                } else {
                    duration = 0;
                }
                if (!C1456990o1B.LIZ() || (((Number) C0BW3.LIZ.getValue()).intValue() >= 2 && duration > 180000)) {
                    Function1<C0F3X, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(C0F3X.SUCCESS);
                        return;
                    }
                    return;
                }
                double d = ((AutoMusicRecommendConfig) C1456990o1B.LIZIZ.getValue()).aedCheckThresh;
                int i = voiceDetectionResult.errorCode;
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "aed_silence_video_check_opt", true, false) && i == 60000) {
                    Function1<C0F3X, Unit> function13 = function1;
                    if (function13 != null) {
                        function13.invoke(C0F3X.SUCCESS);
                        return;
                    }
                    return;
                }
                if (Intrinsics.LJFF(C1458080o2w.LJIIJ, voiceDetectionResult.audioRatioInfo) && C1458080o2w.LJIIJJI == duration) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = C1458080o2w.LJIIZILJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isSameResult:");
                sbLIZ.append(z);
                sbLIZ.append(", duration:");
                sbLIZ.append(duration);
                sbLIZ.append(", lastExtractDuration:");
                sbLIZ.append(C1458080o2w.LJIIJJI);
                sbLIZ.append("，lastTimeout:");
                sbLIZ.append(C1458080o2w.LJIILJJIL);
                sbLIZ.append(", result:");
                sbLIZ.append(voiceDetectionResult);
                C201955140j.LJIILIIL(str2, C2188811AlT.LIZIZ(sbLIZ));
                AudioRatioInfo audioRatioInfo = voiceDetectionResult.audioRatioInfo;
                C1458080o2w.LJIIJ = audioRatioInfo;
                if (duration != 0) {
                    C1458080o2w.LJIIJJI = duration;
                }
                if (audioRatioInfo != null) {
                    VideoPublishEditModel videoPublishEditModel4 = videoPublishEditModel;
                    Function1<C0F3X, Unit> function14 = function1;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("singRatio:");
                    sbLIZ2.append(audioRatioInfo.singRatio);
                    sbLIZ2.append(",speechRatio:");
                    sbLIZ2.append(audioRatioInfo.speechRatio);
                    sbLIZ2.append(", musicRatio:");
                    sbLIZ2.append(audioRatioInfo.musicRatio);
                    sbLIZ2.append(", threshold:");
                    sbLIZ2.append(d);
                    sbLIZ2.append(", id:");
                    sbLIZ2.append(C786410Ut5.u3().getId());
                    C201955140j.LJIILIIL(str2, C2188811AlT.LIZIZ(sbLIZ2));
                    if (C299120Bny.LIZ()) {
                        if (videoPublishEditModel4 != null && u4.LJLL(videoPublishEditModel4) && !C2262681DhK.LIZ()) {
                            videoPublishEditModel4 = videoPublishEditModel4;
                            C1456980o1A.LIZLLL(videoPublishEditModel4, audioRatioInfo.speechRatio, audioRatioInfo.singRatio, audioRatioInfo.musicRatio, d, function14);
                        }
                        List<LoudnessDetectResult> list = voiceDetectionResult.loudnessList;
                        ArrayList<LoudnessDetectResult> arrayList = new ArrayList();
                        for (LoudnessDetectResult loudnessDetectResult : list) {
                            if (loudnessDetectResult.result == 0) {
                                arrayList.add(loudnessDetectResult);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (LoudnessDetectResult loudnessDetectResult2 : arrayList) {
                            C19719612Di.LJJI(Collections.singletonList(new Pair(Double.valueOf(loudnessDetectResult2.peakLoudness), Double.valueOf(loudnessDetectResult2.avgLoudness))), arrayList2);
                        }
                        if (arrayList2.isEmpty()) {
                            pair = new Pair(Double.valueOf(0.0d), Double.valueOf(0.0d));
                        } else {
                            pair = new Pair(((Pair) ListProtector.get(arrayList2, 0)).getFirst(), ((Pair) ListProtector.get(arrayList2, 0)).getSecond());
                        }
                        if (z) {
                            if (!C1458080o2w.LJIILJJIL) {
                                AutoApplyMusicResponse autoApplyMusicResponse = C1458080o2w.LJIILIIL;
                                if (autoApplyMusicResponse != null) {
                                    long j = C1458080o2w.LJIJ;
                                    double dDoubleValue = ((Number) pair.getFirst()).doubleValue();
                                    double dDoubleValue2 = ((Number) pair.getSecond()).doubleValue();
                                    if (voiceDetectionResult.isCache() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    C1456980o1A.LJ(j, dDoubleValue, dDoubleValue2, autoApplyMusicResponse, z2);
                                }
                            } else {
                                VoiceDetectionResultForServer voiceDetectionResultForServer = new VoiceDetectionResultForServer(1, 1, 0, System.currentTimeMillis() - C1458080o2w.LJIJ, null, null, null, null);
                                C1458840o4A.LIZ.getClass();
                                C1458840o4A.LIZ(voiceDetectionResultForServer);
                            }
                            String str3 = C1458080o2w.LJIIZILJ;
                            C201955140j.LJIILIIL(str3, "before lastAed?.let, lastAed:" + C1458080o2w.LJIIL + ", callbackHash:" + System.identityHashCode(function14) + ", listenerHash:" + System.identityHashCode(audioRatioInfo));
                            if (((Boolean) C284550BDh.LIZ.getValue()).booleanValue()) {
                                C0F3X c0f3x = C1458080o2w.LJIIL;
                                if (c0f3x != null) {
                                    if (function14 != null) {
                                        function14.invoke(c0f3x);
                                    }
                                } else if (function14 != null) {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("lastAed is null, defer callback to pending, callbackHash:");
                                    sbLIZ3.append(System.identityHashCode(function14));
                                    C201955140j.LJIILIIL(str3, C2188811AlT.LIZIZ(sbLIZ3));
                                    ((ArrayList) C1458080o2w.LJIILL).add(function14);
                                }
                            } else {
                                C0F3X c0f3x2 = C1458080o2w.LJIIL;
                                if (c0f3x2 != null && function14 != null) {
                                    function14.invoke(c0f3x2);
                                }
                            }
                            C201955140j.LJIILIIL(str3, "after lastAed?.let, lastAed:" + C1458080o2w.LJIIL + ", listenerHash:" + System.identityHashCode(audioRatioInfo));
                            return;
                        }
                        float f = audioRatioInfo.speechRatio;
                        float f2 = audioRatioInfo.singRatio;
                        float f3 = audioRatioInfo.musicRatio;
                        double dDoubleValue3 = ((Number) pair.getFirst()).doubleValue();
                        double dDoubleValue4 = ((Number) pair.getSecond()).doubleValue();
                        VideoPublishEditModel videoPublishEditModel5 = videoPublishEditModel4;
                        C1446210njn c1446210njnLJ = C1442040nd4.LJ(videoPublishEditModel5, duration, false, null, null, false, 0L, false, null, null, false, 1022);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C1458080o2w.LJIJ = jCurrentTimeMillis;
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("peak_loudness", dDoubleValue3);
                        jSONObject.put("avg_loudness", dDoubleValue4);
                        jSONArray.put(jSONObject);
                        String string = jSONArray.toString();
                        IEditMusicServiceApi iEditMusicServiceApiLIZIZ = C1456980o1A.LIZIZ();
                        if (iEditMusicServiceApiLIZIZ != null) {
                            iEditMusicServiceApiLIZIZ.LIZLLL(f, f2, f3, string, c1446210njnLJ).LJLIIL(1L).LJLJJI(((Number) C265300AaW.LIZ.getValue()).longValue(), TimeUnit.MILLISECONDS, C11NZ.LJJIJLIJ(new RuntimeException(C1458080o2w.LJIILLIIL))).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS0S0200133_22(videoPublishEditModel5, jCurrentTimeMillis, dDoubleValue3, dDoubleValue4, f, f2, f3, d, function14, 0), new AfS0S0200133_22(videoPublishEditModel5, jCurrentTimeMillis, dDoubleValue3, dDoubleValue4, f, f2, f3, d, function14, 1), new InterfaceC781210Ukh() { // from class: X.0o1G
                                @Override // X.InterfaceC781210Ukh
                                public final void run() {
                                    C201955140j.LJIILIIL(C1458080o2w.LJIIZILJ, "finish");
                                }
                            });
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        C1456980o1A.LIZLLL(videoPublishEditModel4, audioRatioInfo.speechRatio, audioRatioInfo.singRatio, audioRatioInfo.musicRatio, d, function14);
                    }
                }
                if (voiceDetectionResult.errorCode != 0) {
                    Function1<C0F3X, Unit> function15 = function1;
                    if (function15 != null) {
                        function15.invoke(C0F3X.FAIL);
                    }
                    C201962140q c201962140q = C201962140q.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("AUTO MUSIC: musicActivityDetected failed. msg: ");
                    sbLIZ4.append(voiceDetectionResult.errorMsg);
                    C201955140j.LJIILJJIL(c201962140q, C2188811AlT.LIZIZ(sbLIZ4));
                }
            }

            @Override // com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener
            public final void onExtractAudioPath(String str, int i, int i2) {
                VoiceDetectionListener.DefaultImpls.onExtractAudioPath(this, str, i, i2);
            }
        });
    }

    public static void LJ(long j, double d, double d2, AutoApplyMusicResponse autoApplyMusicResponse, boolean z) {
        int i;
        Pair pair;
        long jLongValue;
        long jLongValue2;
        if (autoApplyMusicResponse.status_code != 0) {
            i = -1;
        } else if (Intrinsics.LJFF(autoApplyMusicResponse.needAutoApplyMusic, Boolean.TRUE)) {
            i = 0;
        } else {
            i = 1;
        }
        int i2 = autoApplyMusicResponse.status_code;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        double d3 = 0.0d;
        if (z) {
            d2 = 0.0d;
        } else {
            d3 = d;
        }
        if (z) {
            pair = new Pair(0L, 0L);
        } else {
            String str = autoApplyMusicResponse.extraParams;
            try {
                if (str == null) {
                    pair = new Pair(0L, 0L);
                } else {
                    JSONObject jSONObject = new JSONObject(str);
                    Long lLJIILIIL = C2095008Iq.LJIILIIL(jSONObject.optString("music_server_cost", CardStruct.IStatusCode.DEFAULT));
                    if (lLJIILIIL != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    Long lLJIILIIL2 = C2095008Iq.LJIILIIL(jSONObject.optString("recommend_cost", CardStruct.IStatusCode.DEFAULT));
                    if (lLJIILIIL2 != null) {
                        jLongValue2 = lLJIILIIL2.longValue();
                    } else {
                        jLongValue2 = 0;
                    }
                    pair = new Pair(Long.valueOf(jLongValue), Long.valueOf(jLongValue2));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                pair = new Pair(0L, 0L);
            }
        }
        VoiceDetectionResultForServer voiceDetectionResultForServer = new VoiceDetectionResultForServer(0, i, i2, jCurrentTimeMillis, Double.valueOf(d3), Double.valueOf(d2), (Long) pair.getFirst(), (Long) pair.getSecond());
        C1458840o4A.LIZ.getClass();
        C1458840o4A.LIZ(voiceDetectionResultForServer);
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, float f, float f2, float f3, double d, Function1 function1) {
        if (f2 < d && f < d && f3 < d) {
            C201955140j.LJIILIIL(C1458080o2w.LJIIZILJ, "suc not by server , local");
            if (function1 != null) {
                function1.invoke(C0F3X.SUCCESS);
                return;
            }
            return;
        }
        C201955140j.LJIILIIL(C1458080o2w.LJIIZILJ, "processAedFail");
        if (function1 != null) {
            function1.invoke(C0F3X.TAKING);
        }
        if (videoPublishEditModel == null) {
            return;
        }
        C1458390o3R.LIZ.getClass();
        C1458390o3R.LJIJJ(C1458390o3R.LJIIJ, videoPublishEditModel, false);
    }
}
