package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0npS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449720npS {
    public static final C1449720npS LIZ = new C1449720npS();

    static {
        C0FGC.LIZ(2);
    }

    public static final void LIZIZ(C1463670oBx c1463670oBx, VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        VEAudioSamiFilterParam vEAudioSamiFilterParam = new VEAudioSamiFilterParam();
        vEAudioSamiFilterParam.samiType = 2;
        C1449830npd.LIZ.getClass();
        vEAudioSamiFilterParam.samiModelPath = C1449830npd.LIZIZ;
        vEAudioSamiFilterParam.samiParam = "            {\n                \"name\":\"denoise_v2\",\n                \"version\":\"1.0\",\n                \"config\":{\n                    \"denoisemode\":1,\n                    \"denoiserate\":1.0\n                }\n            }";
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(c1463670oBx);
        if (c348100DkmLIZIZ != null) {
            AudioEnhanceParam audioEnhanceParam = videoPublishEditModel.getAudioEnhanceParam();
            if (audioEnhanceParam != null && audioEnhanceParam.getEnableOriginEnhance()) {
                z = true;
            } else {
                z = false;
            }
            String uuid = "";
            if (z) {
                if (videoPublishEditModel.isFastImport()) {
                    String uuid2 = c348100DkmLIZIZ.LIZ.getModel().getMainTrack().getUUID();
                    LIZ.getClass();
                    LIZ(uuid2, c348100DkmLIZIZ, vEAudioSamiFilterParam);
                } else {
                    String uuid3 = "";
                    for (NLETrack nLETrack : c348100DkmLIZIZ.LIZ.getModel().getTracks()) {
                        if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "ORIGIN")) {
                            uuid3 = nLETrack.getUUID();
                        }
                    }
                    if (uuid3.length() > 0) {
                        LIZ.getClass();
                        LIZ(uuid3, c348100DkmLIZIZ, vEAudioSamiFilterParam);
                    }
                }
            }
            AudioEnhanceParam audioEnhanceParam2 = videoPublishEditModel.getAudioEnhanceParam();
            if (audioEnhanceParam2 != null && audioEnhanceParam2.getEnableMusicEnhance()) {
                for (NLETrack nLETrack2 : c348100DkmLIZIZ.LIZ.getModel().getTracks()) {
                    if (Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "BGM")) {
                        uuid = nLETrack2.getUUID();
                    }
                }
                if (uuid.length() > 0) {
                    LIZ.getClass();
                    LIZ(uuid, c348100DkmLIZIZ, vEAudioSamiFilterParam);
                    return;
                }
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static void LIZJ(NLEModel nLEModel, List list) {
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(true);
        long j = 0;
        for (Pair pair : (ArrayList) list) {
            String str = (String) pair.getFirst();
            long jLongValue = ((Number) pair.getSecond()).longValue();
            NLETrackSlot nLETrackSlot = new NLETrackSlot();
            nLETrackSlot.setStartTime(j);
            NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
            NLEResourceAV nLEResourceAV = new NLEResourceAV();
            nLEResourceAV.setResourceFile(str);
            C533730KwV.LIZ.getClass();
            nLEResourceAV.setResourceType(C533730KwV.LJ(str));
            nLEResourceAV.setDuration(jLongValue);
            nLESegmentVideo.setTimeClipStart(0L);
            nLESegmentVideo.setTimeClipEnd(jLongValue);
            nLESegmentVideo.setAVFile(nLEResourceAV);
            nLETrackSlot.setMainSegment(nLESegmentVideo);
            j += jLongValue;
            nLETrack.addSlot(nLETrackSlot);
        }
        nLEModel.addTrack(nLETrack);
    }

    public static void LIZ(String str, C348100Dkm c348100Dkm, VEAudioSamiFilterParam vEAudioSamiFilterParam) {
        C347470Djl c347470Djl = new C347470Djl(NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER());
        c347470Djl.LIZIZ = str;
        c347470Djl.LJIILJJIL = vEAudioSamiFilterParam.samiModelPath;
        c347470Djl.LJIILL = vEAudioSamiFilterParam.samiParam;
        c347470Djl.LJIILIIL = Integer.valueOf(vEAudioSamiFilterParam.samiType);
        c348100Dkm.LJFF().LJIILL(str, c347470Djl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:337:0x08c7 A[PHI: r8
      0x08c7: PHI (r8v7 com.ss.android.ugc.aweme.filter.FilterBean) = (r8v6 com.ss.android.ugc.aweme.filter.FilterBean), (r8v8 com.ss.android.ugc.aweme.filter.FilterBean) binds: [B:336:0x08c5, B:334:0x08b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1463670oBx LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r37, X.C1441900ncq r38, int r39) {
        /*
            Method dump skipped, instruction units count: 2309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1449720npS.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0ncq, int):X.0oBx");
    }
}
