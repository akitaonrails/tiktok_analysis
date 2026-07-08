package X;

import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResultForServer;

/* JADX INFO: renamed from: X.0o4A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458840o4A {
    public static final C1458840o4A LIZ = new C1458840o4A();
    public static VoiceDetectionParam LIZIZ;
    public static VoiceDetectionResult LIZJ;
    public static boolean LIZLLL;
    public static IVoiceDetectorConfig LJ;

    public static void LIZ(VoiceDetectionResultForServer voiceDetectionResultForServer) {
        VoiceDetectionResult voiceDetectionResult;
        VoiceDetectionParam voiceDetectionParam = LIZIZ;
        if (voiceDetectionParam == null || (voiceDetectionResult = LIZJ) == null || !LIZLLL) {
            return;
        }
        IVoiceDetectorConfig iVoiceDetectorConfig = LJ;
        if (iVoiceDetectorConfig instanceof AbstractC1458830o49) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportData resultForServer:");
            sbLIZ.append(voiceDetectionResultForServer);
            C201955140j.LJIILIIL("aed check by server", C2188811AlT.LIZIZ(sbLIZ));
            if (voiceDetectionResult.isCache() == 1 && ((Boolean) C265270AaT.LIZ.getValue()).booleanValue()) {
                LIZIZ = null;
                LIZJ = null;
                LIZLLL = false;
                LJ = null;
                C201955140j.LJIILIIL("aed check by server", "reportData hit cache");
                return;
            }
            ((AbstractC1458830o49) iVoiceDetectorConfig).LJI(voiceDetectionParam, voiceDetectionResult, voiceDetectionResultForServer);
            LIZIZ = null;
            LIZJ = null;
            LIZLLL = false;
            LJ = null;
        }
    }
}
