package X;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.ies.nle.editor_jni.INLEBrushRuntime;
import com.bytedance.ies.nle.editor_jni.INLEEffectRuntime;
import com.bytedance.ies.nle.editor_jni.INLEExporter;
import com.bytedance.ies.nle.editor_jni.INLEFilterRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMattingRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.INLEMetricsRuntime;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0oCG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463860oCG implements INLEMediaSession {
    public static final /* synthetic */ int LJI = 0;
    public final NLEMediaConfig LIZ;
    public SurfaceView LIZIZ;
    public final NLEEditor LIZJ;
    public final TextureView LIZLLL;
    public final C01GW LJ;
    public NLEModel LJFF;

    static {
        new C0F9X();
    }

    public final C1463940oCO LIZ() {
        return (C1463940oCO) this.LJ.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final INLERhythmPointRuntime getAlgorithmApi() {
        return (C1463850oCF) LIZ().LJII.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final INLEBrushRuntime getBrushApi() {
        return (C1EQD) LIZ().LJIIIZ.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final INLEEffectRuntime getEffectApi() {
        return (C1464250oCt) LIZ().LJIIJ.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final INLEExporter getExporterApi() {
        return (C1463840oCE) LIZ().LJI.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final INLEFilterRuntime getFilterApi() {
        return (C1463960oCQ) LIZ().LJFF.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final INLEMattingRuntime getMattingApi() {
        return (C1784310wX7) LIZ().LJIIL.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final NLEMediaConfig getMediaConfig() {
        return LIZ().LIZ;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final INLEMediaRuntime getMediaRuntimeApi() {
        return (C1463950oCP) LIZ().LIZLLL.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final INLEMediaSettings getMediaSettingApi() {
        return (C1463880oCI) LIZ().LJ.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final INLEMetricsRuntime getMetricsApi() {
        return (C1463970oCR) LIZ().LJIIJJI.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final INLEPlayer getPlayerApi() {
        return LIZ().LIZ();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final INLEStickerRuntime getStickerApi() {
        return (C1EQC) LIZ().LJIIIIZZ.getValue();
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final NLEModel getDataSource() {
        return this.LJFF;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final void setDataSource(NLEModel nLEModel) {
        NLEMediaConfig mediaConfig;
        this.LJFF = nLEModel;
        C1464240oCs c1464240oCsLIZIZ = LIZ().LIZIZ();
        NLEMediaSession nLEMediaSession = c1464240oCsLIZIZ.LIZ;
        if (nLEMediaSession != null && (mediaConfig = nLEMediaSession.getMediaConfig()) != null && mediaConfig.getLockSetDataSourceAndDestroy()) {
            synchronized (c1464240oCsLIZIZ.LIZIZ) {
                try {
                    c1464240oCsLIZIZ.LIZJ = nLEModel;
                    NLEMediaSession nLEMediaSession2 = c1464240oCsLIZIZ.LIZ;
                    if (nLEMediaSession2 != null) {
                        nLEMediaSession2.setDataSource(nLEModel);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        c1464240oCsLIZIZ.LIZJ = nLEModel;
        NLEMediaSession nLEMediaSession3 = c1464240oCsLIZIZ.LIZ;
        if (nLEMediaSession3 != null) {
            nLEMediaSession3.setDataSource(nLEModel);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final void setReuseFirstAVFileInfo(boolean z) {
        this.LIZ.setReUseFirstAVInfo(z);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final void updateMediaConfig(NLEMediaConfig nLEMediaConfig) {
        NLEMediaSession nLEMediaSession;
        C1464240oCs c1464240oCsLIZIZ = LIZ().LIZIZ();
        if (!c1464240oCsLIZIZ.LIZLLL.get() && (nLEMediaSession = c1464240oCsLIZIZ.LIZ) != null) {
            nLEMediaSession.updateMediaConfig(nLEMediaConfig);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final void updateNLEEditor(NLEEditor nLEEditor) {
        C1463940oCO c1463940oCOLIZ = LIZ();
        c1463940oCOLIZ.LIZ().LJFF = nLEEditor;
        ((C1463850oCF) c1463940oCOLIZ.LJII.getValue()).LJ = nLEEditor;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEMediaSession
    public final void updateSurfaceView(SurfaceView surfaceView) {
        this.LIZIZ = surfaceView;
        LIZ().LIZ().unbindSurfaceView();
        INLEPurePlayer.DefaultImpls.bindSurfaceView$default(LIZ().LIZ(), surfaceView, false, 2, null);
    }

    public C1463860oCG(NLEMediaConfig nLEMediaConfig, SurfaceView surfaceView, NLEEditor nLEEditor, boolean z) {
        Surface surface;
        NLEPlayer nLEPlayerLIZIZ;
        this.LIZ = nLEMediaConfig;
        this.LIZIZ = surfaceView;
        this.LIZJ = nLEEditor;
        this.LJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 893));
        SurfaceView surfaceView2 = this.LIZIZ;
        if (surfaceView2 != null) {
            SurfaceHolder holder = surfaceView2.getHolder();
            if (holder != null && (surface = holder.getSurface()) != null && (nLEPlayerLIZIZ = LIZ().LIZIZ().LIZIZ()) != null) {
                nLEPlayerLIZIZ.setAndroidSurface(surface, z);
            }
            LIZ().LIZ().bindSurfaceView(surfaceView2, z);
        }
    }

    public C1463860oCG(NLEMediaConfig nLEMediaConfig, TextureView textureView, NLEEditor nLEEditor, boolean z) {
        this(nLEMediaConfig, (SurfaceView) null, nLEEditor, z);
        this.LIZLLL = textureView;
        LIZ().LIZ().bindTextureView(textureView, z);
    }
}
