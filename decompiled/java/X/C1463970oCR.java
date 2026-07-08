package X;

import com.bytedance.ies.nle.editor_jni.INLEMetricsRuntime;
import com.bytedance.ies.nle.editor_jni.NLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEMetricsRuntimeController;

/* JADX INFO: renamed from: X.0oCR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463970oCR extends C0FRA implements INLEMetricsRuntime {
    @Override // com.bytedance.ies.nle.editor_jni.INLEMetricsRuntime
    public final String getAudioGlitchCount() {
        NLEMediaSession nLEMediaSession;
        NLEMetricsRuntimeController metricsApi;
        String audioGlitchCount;
        C1464240oCs c1464240oCs = this.LIZ;
        return (c1464240oCs.LIZ == null || c1464240oCs.LIZLLL.get() || (nLEMediaSession = c1464240oCs.LIZ) == null || (metricsApi = nLEMediaSession.getMetricsApi()) == null || (audioGlitchCount = metricsApi.getAudioGlitchCount()) == null) ? "" : audioGlitchCount;
    }

    public C1463970oCR(C1464240oCs c1464240oCs) {
        super(c1464240oCs);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMetricsRuntime
    public final int enableAudioGlitchMetrics(boolean z) {
        NLEMediaSession nLEMediaSession;
        NLEMetricsRuntimeController metricsApi;
        C1464240oCs c1464240oCs = this.LIZ;
        if (c1464240oCs.LIZ != null && !c1464240oCs.LIZLLL.get() && (nLEMediaSession = c1464240oCs.LIZ) != null && (metricsApi = nLEMediaSession.getMetricsApi()) != null) {
            return metricsApi.enableAudioGlitchMetrics(z);
        }
        return -1;
    }
}
