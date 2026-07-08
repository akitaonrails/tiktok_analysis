package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEAlgorithmController;
import com.bytedance.ies.nle.editor_jni.NLEBrushRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEEffectRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEExporterController;
import com.bytedance.ies.nle.editor_jni.NLEFilterRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEMediaSettingsController;
import com.bytedance.ies.nle.editor_jni.NLEMetricsRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEStickerController;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0oCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464240oCs {
    public NLEMediaSession LIZ;
    public NLEModel LIZJ;
    public final Object LIZIZ = new Object();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final C01GW LJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 910));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS566S0100000_22(this, 912));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 907));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 908));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 904));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 905));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 913));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 906));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 909));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 911));

    public final void LIZ() {
        NLEMediaConfig mediaConfig;
        NLEMediaSession nLEMediaSession = this.LIZ;
        if (nLEMediaSession == null || (mediaConfig = nLEMediaSession.getMediaConfig()) == null || !mediaConfig.getLockSetDataSourceAndDestroy()) {
            LIZJ();
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                LIZJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final NLEPlayer LIZIZ() {
        if (this.LIZ == null || this.LIZLLL.get()) {
            return null;
        }
        return (NLEPlayer) this.LJFF.getValue();
    }

    public final void LIZJ() {
        NLEMediaSession nLEMediaSession;
        NLEMetricsRuntimeController metricsApi;
        NLELoggerListener logger = NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: destroy native media session");
        }
        this.LIZLLL.set(true);
        NLEMediaRuntimeController nLEMediaRuntimeController = (NLEMediaRuntimeController) this.LJ.getValue();
        if (nLEMediaRuntimeController != null) {
            nLEMediaRuntimeController.delete();
        }
        NLEPlayer nLEPlayer = (NLEPlayer) this.LJFF.getValue();
        if (nLEPlayer != null) {
            nLEPlayer.delete();
        }
        NLEExporterController nLEExporterController = (NLEExporterController) this.LJI.getValue();
        if (nLEExporterController != null) {
            nLEExporterController.delete();
        }
        NLEFilterRuntimeController nLEFilterRuntimeController = (NLEFilterRuntimeController) this.LJII.getValue();
        if (nLEFilterRuntimeController != null) {
            nLEFilterRuntimeController.delete();
        }
        NLEAlgorithmController nLEAlgorithmController = (NLEAlgorithmController) this.LJIIIIZZ.getValue();
        if (nLEAlgorithmController != null) {
            nLEAlgorithmController.delete();
        }
        NLEBrushRuntimeController nLEBrushRuntimeController = (NLEBrushRuntimeController) this.LJIIIZ.getValue();
        if (nLEBrushRuntimeController != null) {
            nLEBrushRuntimeController.delete();
        }
        NLEStickerController nLEStickerController = (NLEStickerController) this.LJIIJ.getValue();
        if (nLEStickerController != null) {
            nLEStickerController.delete();
        }
        NLEEffectRuntimeController nLEEffectRuntimeController = (NLEEffectRuntimeController) this.LJIIJJI.getValue();
        if (nLEEffectRuntimeController != null) {
            nLEEffectRuntimeController.delete();
        }
        if (this.LIZ != null && !this.LIZLLL.get() && (nLEMediaSession = this.LIZ) != null && (metricsApi = nLEMediaSession.getMetricsApi()) != null) {
            metricsApi.delete();
        }
        NLEMediaSettingsController nLEMediaSettingsController = (NLEMediaSettingsController) this.LJIILIIL.getValue();
        if (nLEMediaSettingsController != null) {
            nLEMediaSettingsController.delete();
        }
        NLEMediaSession nLEMediaSession2 = this.LIZ;
        if (nLEMediaSession2 != null) {
            nLEMediaSession2.delete();
        }
        this.LIZ = null;
    }

    public C1464240oCs(NLEMediaSession nLEMediaSession) {
        this.LIZ = nLEMediaSession;
    }
}
