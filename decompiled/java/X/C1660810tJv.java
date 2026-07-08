package X;

import com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.algorithm.VEAudioAlgorithmParam;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0tJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660810tJv {
    public static final C1660810tJv LIZ = new C1660810tJv();

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0nW5] */
    public static final C1437710nW5 LIZ(VERecorder vERecorder, final ShortVideoContext shortVideoContext) {
        final ArrayList arrayList = new ArrayList();
        vERecorder.LIZIZ.LJJIZ.addTrackAlgorithm(1, 0, new VEAudioAlgorithmParam("audio mic loudness detect", null), 0, Integer.MAX_VALUE);
        shortVideoContext.creativeModel.audioAlgorithmModel.isLoudnessCheckOn = true;
        return new InterfaceC1437720nW6() { // from class: X.0nW5
            public File LL;

            @Override // X.InterfaceC1464200oCo
            public final void onCallback(int i, int i2, float f, String str) {
                if (i == VEInfo.TE_RECORD_INFO_MIC_AUDIO_LOUDNESS) {
                    Workspace workspace = shortVideoContext.cameraComponentModel.mWorkspace;
                    if (workspace == null) {
                        return;
                    }
                    File[] fileArrU4 = workspace.LL.U4();
                    List<String> list = arrayList;
                    for (File file : fileArrU4) {
                        if (!list.contains(file.getAbsolutePath())) {
                            this.LL = file;
                            list.add(file.getAbsolutePath());
                        }
                    }
                    File file2 = this.LL;
                    if (file2 != null) {
                        ShortVideoContext shortVideoContext2 = shortVideoContext;
                        if (shortVideoContext2.creativeModel.loudnessBalanceModel.loudnessMap.get(file2.getAbsolutePath()) == null) {
                            Map<String, LoudnessDetectResult> map = shortVideoContext2.creativeModel.loudnessBalanceModel.loudnessMap;
                            String absolutePath = file2.getAbsolutePath();
                            LoudnessDetectResult loudnessDetectResult = new LoudnessDetectResult(-1, 0.0d, 0.0d, "");
                            loudnessDetectResult.result = 0;
                            loudnessDetectResult.avgLoudness = f;
                            loudnessDetectResult.audioPath = file2.getAbsolutePath();
                            map.put(absolutePath, loudnessDetectResult);
                        } else {
                            LoudnessDetectResult loudnessDetectResult2 = shortVideoContext2.creativeModel.loudnessBalanceModel.loudnessMap.get(file2.getAbsolutePath());
                            if (loudnessDetectResult2 != null) {
                                loudnessDetectResult2.avgLoudness = f;
                            }
                        }
                    }
                    C201955140j.LIZIZ("LoudnessNormalization", "VECommonCallback AUDIO_LOUDNESS type:" + i + " ext:" + i2 + " f:" + f + " msg:" + str);
                    return;
                }
                if (i == VEInfo.TE_RECORD_INFO_MIC_AUDIO_LOUDNESS_PEAK) {
                    Workspace workspace2 = shortVideoContext.cameraComponentModel.mWorkspace;
                    if (workspace2 == null) {
                        return;
                    }
                    File[] fileArrU42 = workspace2.LL.U4();
                    List<String> list2 = arrayList;
                    for (File file3 : fileArrU42) {
                        if (!list2.contains(file3.getAbsolutePath())) {
                            this.LL = file3;
                            list2.add(file3.getAbsolutePath());
                        }
                    }
                    File file4 = this.LL;
                    if (file4 != null) {
                        ShortVideoContext shortVideoContext3 = shortVideoContext;
                        if (shortVideoContext3.creativeModel.loudnessBalanceModel.loudnessMap.get(file4.getAbsolutePath()) == null) {
                            Map<String, LoudnessDetectResult> map2 = shortVideoContext3.creativeModel.loudnessBalanceModel.loudnessMap;
                            String absolutePath2 = file4.getAbsolutePath();
                            LoudnessDetectResult loudnessDetectResult3 = new LoudnessDetectResult(-1, 0.0d, 0.0d, "");
                            loudnessDetectResult3.result = 0;
                            loudnessDetectResult3.peakLoudness = f;
                            loudnessDetectResult3.audioPath = file4.getAbsolutePath();
                            map2.put(absolutePath2, loudnessDetectResult3);
                        } else {
                            LoudnessDetectResult loudnessDetectResult4 = shortVideoContext3.creativeModel.loudnessBalanceModel.loudnessMap.get(file4.getAbsolutePath());
                            if (loudnessDetectResult4 != null) {
                                loudnessDetectResult4.peakLoudness = f;
                            }
                        }
                    }
                    C201955140j.LIZIZ("LoudnessNormalization", "VECommonCallback AUDIO_LOUDNESS_PEAK type:" + i + " ext:" + i2 + " f:" + f + " msg:" + str);
                    return;
                }
                if (i == VEInfo.TE_RECORD_INFO_RECORD_STOPPED) {
                    this.LL = null;
                    return;
                }
                if (i == VEInfo.TE_INFO_DELETE_LAST_FRAG_DONE_NOTIFY) {
                    arrayList.clear();
                    File[] fileArrU43 = shortVideoContext.cameraComponentModel.mWorkspace.LL.U4();
                    List<String> list3 = arrayList;
                    for (File file5 : fileArrU43) {
                        list3.add(file5.getAbsolutePath());
                    }
                }
            }
        };
    }
}
