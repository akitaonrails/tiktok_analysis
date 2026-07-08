package X;

import Y.ARunnableS119S0100000_19;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEAudioTrackIndex;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.asve.editor.NLECommitStatisticsConfig;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import com.ss.android.vesdk.runtime.VEPublishSettingManager;
import com.ss.android.vesdk.runtime.VERuntime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS579S0100000_35;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: renamed from: X.1DOT, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DOT implements InterfaceC1452170ntP {
    public boolean LIZLLL;
    public boolean LJIIL;
    public final C2255061DOe LJIILIIL;
    public final VEEditor LJIILJJIL;
    public final C2255191DOr LIZ = new InterfaceC349860Dnc() { // from class: X.1DOr
    };
    public final Rect LIZIZ = new Rect();
    public final Pair<Integer, Integer> LIZJ = new Pair<>(0, 0);
    public final List<InterfaceC1464120oCg> LJ = new ArrayList();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS578S0100000_34(this, 4));
    public final CopyOnWriteArrayList<InterfaceC1464190oCn> LJI = new CopyOnWriteArrayList<>();
    public final C2255071DOf LJII = new InterfaceC1464190oCn() { // from class: X.1DOf
        @Override // X.InterfaceC1464190oCn
        public final void onRendered() {
            Iterator<InterfaceC1464190oCn> it2 = this.LIZ.LJI.iterator();
            while (it2.hasNext()) {
                it2.next().onRendered();
            }
        }
    };
    public final CopyOnWriteArrayList<InterfaceC1464200oCo> LJIIIIZZ = new CopyOnWriteArrayList<>();
    public final C2255031DOb LJIIIZ = new InterfaceC1464200oCo() { // from class: X.1DOb
        @Override // X.InterfaceC1464200oCo
        public final void onCallback(int i, int i2, float f, String str) {
            Iterator<InterfaceC1464200oCo> it2 = this.LL.LJIIIIZZ.iterator();
            while (it2.hasNext()) {
                it2.next().onCallback(i, i2, f, str);
            }
        }
    };
    public final CopyOnWriteArrayList<InterfaceC1464200oCo> LJIIJ = new CopyOnWriteArrayList<>();
    public final C2255041DOc LJIIJJI = new InterfaceC1464200oCo() { // from class: X.1DOc
        @Override // X.InterfaceC1464200oCo
        public final void onCallback(int i, int i2, float f, String str) {
            Iterator<InterfaceC1464200oCo> it2 = this.LL.LJIIJ.iterator();
            while (it2.hasNext()) {
                it2.next().onCallback(i, i2, f, str);
            }
        }
    };
    public final C01GW LJIILL = C452501pT.LIZIZ(new AwS579S0100000_35(this, 24));

    @Override // X.InterfaceC1452170ntP
    public final int Bf(VEVideoEncodeSettings vEVideoEncodeSettings) {
        return -1;
    }

    @Override // X.InterfaceC1452170ntP
    public final void Ff(boolean z) {
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean Hf() {
        return false;
    }

    @Override // X.InterfaceC1452170ntP
    public final void Jf(C1435820nT2 c1435820nT2) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void Kf(NLECommitStatisticsConfig nLECommitStatisticsConfig) {
    }

    @Override // X.InterfaceC1452170ntP
    public final SurfaceView LJIJJLI() {
        return null;
    }

    @Override // X.InterfaceC1452170ntP
    public final void Pe(Boolean bool) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void Pf(int i, int i2) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void Se() {
    }

    @Override // X.InterfaceC1452170ntP
    public final void Ve(NLEModel nLEModel) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void Ze(ARunnableS119S0100000_19 aRunnableS119S0100000_19) {
    }

    @Override // X.InterfaceC1452170ntP
    public final String Zf() {
        return null;
    }

    @Override // X.InterfaceC1452170ntP
    public final NLEModel bf(boolean z) {
        return null;
    }

    @Override // X.InterfaceC1452170ntP
    public final int cancelGetVideoFrames() {
        int iCancelGetImages;
        this.LIZLLL = false;
        VEEditor vEEditorLIZIZ = LIZIZ();
        synchronized (vEEditorLIZIZ) {
            try {
                C2484209oO.LJIIIIZZ("VEEditor", "cancelGetVideoFrames...");
                iCancelGetImages = vEEditorLIZIZ.LLJLLIL.cancelGetImages();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iCancelGetImages;
    }

    @Override // X.InterfaceC1452170ntP
    public final String getCompileStuckResult() {
        return "";
    }

    @Override // X.InterfaceC1452170ntP
    public final int getVEColorSpace() {
        return -1;
    }

    @Override // X.InterfaceC1452170ntP
    public final void gf(Function0 function0, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void jf() {
    }

    @Override // X.InterfaceC1452170ntP
    public final void jg() {
    }

    @Override // X.InterfaceC1452170ntP
    public final void of() {
    }

    @Override // X.InterfaceC1452170ntP
    public final void pauseCompile() {
    }

    @Override // X.InterfaceC1452170ntP
    public final void pf(String str) {
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean qf(NLEModel nLEModel) {
        return true;
    }

    @Override // X.InterfaceC1452170ntP
    public final void resumeCompile() {
    }

    @Override // X.InterfaceC1452170ntP
    public final int setPreviewMaxFps(int i) {
        return 0;
    }

    @Override // X.InterfaceC1452170ntP
    public final void setPreviewSurfaceTexDesc(String str) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void setReuseFirstAVFileInfo(boolean z) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void setSmartRecodeParam(boolean z, int i) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void updateSurfaceView(SurfaceView surfaceView) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void yc(NLEModel nLEModel) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void zf(boolean z) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void If() {
        ((ArrayList) this.LJ).clear();
        LIZJ().removeMessages(100);
    }

    public final VEEditor LIZIZ() {
        VEEditor vEEditor;
        C2255061DOe c2255061DOe = this.LJIILIIL;
        return (c2255061DOe == null || (vEEditor = c2255061DOe.LIZ) == null) ? this.LJIILJJIL : vEEditor;
    }

    public final Handler LIZJ() {
        return (Handler) this.LJFF.getValue();
    }

    @Override // X.InterfaceC1452170ntP
    public final void destroy() {
        if (this.LIZLLL) {
            cancelGetVideoFrames();
        }
        LIZJ().removeMessages(100);
        LIZIZ().LJIILIIL();
    }

    @Override // X.InterfaceC1452170ntP
    public final void eg() {
        this.LJIIJ.clear();
    }

    @Override // X.InterfaceC1452170ntP
    public final int LLL() {
        return LIZIZ().LLJLLIL.getCurPosition();
    }

    @Override // X.InterfaceC1452170ntP
    public final int Qf() {
        return LIZIZ().LLILZLL.mOriginalSoundTrackIndex;
    }

    @Override // X.InterfaceC1452170ntP
    public final void Xe() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.LLJJJJJIL.set(true);
        C2484209oO.LJIIIIZZ("VEEditor", "releaseEngine... set destroying true");
        synchronized (vEEditorLIZIZ) {
            try {
                if (vEEditorLIZIZ.LLJLLIL != null) {
                    C2484209oO.LJIIIIZZ("VEEditor", "releaseEngine... ");
                    vEEditorLIZIZ.LLJLLIL.stop();
                    vEEditorLIZIZ.LLJLLIL.releaseEngine();
                }
                vEEditorLIZIZ.LLJJJJJIL.set(false);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void Xf() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        C2484209oO.LJI("VEEditor", "setSurfaceReDraw...");
        vEEditorLIZIZ.LLLLIILL = true;
    }

    @Override // X.InterfaceC1452170ntP
    public final List<VEAudioTrackIndex> Ye() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        C2484209oO.LJIIIIZZ("VEEditor", "getAllAudioTracks...");
        return (ArrayList) vEEditorLIZIZ.LLJLLIL.getAllAudioTracks();
    }

    @Override // X.InterfaceC1452170ntP
    public final String[] af() {
        VEEditorResManager vEEditorResManager = LIZIZ().LLILZLL;
        if (vEEditorResManager.mReverseDone) {
            return vEEditorResManager.mReverseVideoPath;
        }
        return null;
    }

    @Override // X.InterfaceC1452170ntP
    public final void ag() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableWatermarkMetadata:");
        sbLIZ.append(true);
        C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        vEEditorLIZIZ.LLJLLIL.enableWatermarkMetadata(true);
    }

    @Override // X.InterfaceC1452170ntP
    public final VEEditorModel ff() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        C2484209oO.LJI("VEEditor", "saveModel...");
        if (!vEEditorLIZIZ.LLLILZJ) {
            C2484209oO.LIZJ("VEEditor", "saveModel error, editor is not init...");
            return null;
        }
        VEEditorModel vEEditorModel = new VEEditorModel();
        vEEditorModel.reverseDone = vEEditorLIZIZ.LLILZLL.mReverseDone;
        vEEditorModel.videoOutRes = vEEditorLIZIZ.LLLIILIL;
        vEEditorModel.videoGravity = vEEditorLIZIZ.LLLIL;
        vEEditorModel.videoScaleType = vEEditorLIZIZ.LLLILZ;
        vEEditorModel.separateAV = vEEditorLIZIZ.LLJLILLLLZIIL.booleanValue();
        vEEditorModel.masterTrackIndex = vEEditorLIZIZ.LLJLL;
        vEEditorModel.hostTrackIndex = vEEditorLIZIZ.LLJLLIL.getHostTrackIndex();
        C1DOV c1dov = vEEditorLIZIZ.LLILZ;
        vEEditorModel.audioEffectFilterIndex = c1dov.LJI;
        vEEditorModel.colorFilterIndex = c1dov.LIZLLL;
        vEEditorModel.effectHDRFilterIndex = c1dov.LJ;
        vEEditorModel.mLensHDRFilterIndex = c1dov.LJFF;
        VEEditorResManager vEEditorResManager = vEEditorLIZIZ.LLILZLL;
        vEEditorModel.videoPaths = vEEditorResManager.mVideoPaths;
        vEEditorModel.audioPaths = vEEditorResManager.mAudioPaths;
        vEEditorModel.transitions = vEEditorResManager.mTransitions;
        vEEditorModel.backgroundColor = vEEditorLIZIZ.LLLLL;
        vEEditorModel.videoBackgroundColor = vEEditorLIZIZ.LLLLLIL;
        return vEEditorModel;
    }

    @Override // X.InterfaceC1452170ntP
    public final int genRandomSolve() {
        return LIZIZ().LLILLL.genRandomSolve();
    }

    @Override // X.InterfaceC1452170ntP
    public final int genSmartCutting() {
        return LIZIZ().LLILLL.genSmartCutting();
    }

    @Override // X.InterfaceC1452170ntP
    public final List<VEClipAlgorithmParam> getAllVideoRangeData() {
        return LIZIZ().LLILLL.getAllVideoRangeData();
    }

    @Override // X.InterfaceC1452170ntP
    public final Bitmap getCurrDisplayImage() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        C2484209oO.LJI("VEEditor", "getCurrDisplayImage...");
        return vEEditorLIZIZ.LJIJJ(-1);
    }

    @Override // X.InterfaceC1452170ntP
    public final int getDuration() {
        return LIZIZ().LJIJJLI();
    }

    @Override // X.InterfaceC1452170ntP
    public final long getHandler() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getHandler... ");
        sbLIZ.append(vEEditorLIZIZ.LLJLLIL.getNativeHandler());
        C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        return vEEditorLIZIZ.LLJLLIL.getNativeHandler();
    }

    @Override // X.InterfaceC1452170ntP
    public final VESize getInitSize() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        VESize vESize = new VESize(vEEditorLIZIZ.LLJL, vEEditorLIZIZ.LLJLIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getInitSize... initWidth:");
        sbLIZ.append(vESize.width);
        sbLIZ.append(", initHeight:");
        sbLIZ.append(vESize.height);
        C2484209oO.LIZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        return vESize;
    }

    @Override // X.InterfaceC1452170ntP
    public final float getPlayFps() {
        return LIZIZ().LLLLLJLJLL;
    }

    @Override // X.InterfaceC1452170ntP
    public final VEEditor.VEState getState() {
        return LIZIZ().LJIL();
    }

    @Override // X.InterfaceC1452170ntP
    public final String getWorkspace() {
        return LIZIZ().LLILZLL.getWorkspace();
    }

    @Override // X.InterfaceC1452170ntP
    /* JADX INFO: renamed from: if */
    public final int mo51if() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        int iLJIJJLI = LIZIZ().LJIJJLI();
        C1DOV c1dov = vEEditorLIZIZ.LLILZ;
        synchronized (c1dov.LIZ) {
            try {
                c1dov.LJIIIIZZ.LIZ.getClass();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJIJJLI;
    }

    @Override // X.InterfaceC1452170ntP
    public final int initBingoAlgorithm() {
        return LIZIZ().LLILLL.initBingoAlgorithm();
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean isUseFilterProcess() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        synchronized (vEEditorLIZIZ) {
            try {
                if (!vEEditorLIZIZ.LLLILZJ) {
                    throw new VEException(-105, "Make sure the initialization is successful before calling!!!");
                }
                if (vEEditorLIZIZ.LLJLLIL.getNativeHandler() == 0) {
                    return false;
                }
                vEEditorLIZIZ.LLJLLIL.genEditorStatus();
                int i = VEPublishSettingManager.LIZIZ;
                return EnumC2255021DOa.LLILLJJLI.LL.LIZJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int lf() {
        int iDoLensOneKeyHdrDetect;
        VEEditor vEEditorLIZIZ = LIZIZ();
        synchronized (vEEditorLIZIZ) {
            try {
                iDoLensOneKeyHdrDetect = vEEditorLIZIZ.LLJLLIL.doLensOneKeyHdrDetect();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iDoLensOneKeyHdrDetect;
    }

    @Override // X.InterfaceC1452170ntP
    public final int ng() {
        return LIZIZ().LJIJJLI();
    }

    @Override // X.InterfaceC1452170ntP
    public final int pause() {
        int iLJJIIJZLJL;
        VEEditor vEEditorLIZIZ = LIZIZ();
        synchronized (vEEditorLIZIZ) {
            try {
                iLJJIIJZLJL = vEEditorLIZIZ.LJJIIJZLJL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJJIIJZLJL;
    }

    @Override // X.InterfaceC1452170ntP
    public final int play() {
        LIZJ().removeMessages(100);
        C786410Ut5.LJLJJI(100, 100L, LIZJ());
        return LIZIZ().LJJIIZ();
    }

    @Override // X.InterfaceC1452170ntP
    public final int prepare() {
        return LIZIZ().LJJIIZI();
    }

    @Override // X.InterfaceC1452170ntP
    public final int refreshCurrentFrame() {
        return LIZIZ().LJJIJIIJI();
    }

    @Override // X.InterfaceC1452170ntP
    public final void releaseResource() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        synchronized (vEEditorLIZIZ) {
            try {
                vEEditorLIZIZ.LLLILZJ = false;
                C2484209oO.LJIIIIZZ("VEEditor", "onReleaseResource... ");
                if (vEEditorLIZIZ.LLJLLIL.getNativeHandler() == 0) {
                    return;
                }
                vEEditorLIZIZ.LLJLLIL.releasePreviewSurface();
                SurfaceView surfaceView = vEEditorLIZIZ.LLJZIJLIL;
                if (surfaceView != null) {
                    surfaceView.getHolder().removeCallback(vEEditorLIZIZ.LLLLLLIL);
                } else {
                    TextureView textureView = vEEditorLIZIZ.LLL;
                    if (textureView != null && textureView.getSurfaceTextureListener() == vEEditorLIZIZ.LLLLLL) {
                        vEEditorLIZIZ.LLL.setSurfaceTextureListener(null);
                    }
                }
                vEEditorLIZIZ.LLJZIJLIL = null;
                vEEditorLIZIZ.LLL = null;
                TEInterface tEInterface = vEEditorLIZIZ.LLJLLIL;
                if (tEInterface != null) {
                    tEInterface.setOpenGLListeners(null);
                    vEEditorLIZIZ.LLJLLIL.setInfoListener(null);
                    vEEditorLIZIZ.LLJLLIL.setErrorListener(null);
                    C2484209oO.LJIIIIZZ("VEEditor", "onReleaseResource... setNativeHandler 0");
                    vEEditorLIZIZ.LLJLLIL.setNativeHandler(0L);
                    vEEditorLIZIZ.LJIIIIZZ();
                }
                vEEditorLIZIZ.LLILZLL = null;
                Bitmap bitmap = vEEditorLIZIZ.LLLLIILLL;
                if (bitmap != null && !bitmap.isRecycled()) {
                    C786410Ut5.LJJJJ(vEEditorLIZIZ.LLLLIILLL);
                    vEEditorLIZIZ.LLLLIILLL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int removeAllVideoSound() {
        return LIZIZ().LLILLL.removeAllVideoSound();
    }

    @Override // X.InterfaceC1452170ntP
    public final int restoreAllVideoSound() {
        return LIZIZ().LLILLL.restoreAllVideoSound();
    }

    @Override // X.InterfaceC1452170ntP
    public final VEMVAudioInfo rf() {
        InterfaceC2255101DOi interfaceC2255101DOi = LIZIZ().LL;
        if (interfaceC2255101DOi != null) {
            return interfaceC2255101DOi.getMVOriginalBackgroundAudio();
        }
        C2484209oO.LIZJ("VEEditor", "MV IS NOT SUPPORT !!!");
        return null;
    }

    @Override // X.InterfaceC1452170ntP
    public final void stop() {
        VEEditor vEEditorLIZIZ = LIZIZ();
        synchronized (vEEditorLIZIZ) {
            try {
                if (vEEditorLIZIZ.LLJLLIL != null) {
                    C2484209oO.LJIIIIZZ("VEEditor", "stop... ");
                    vEEditorLIZIZ.LLJLLIL.stop();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int updateAlgorithmFromNormal() {
        return LIZIZ().LLILLL.updateAlgorithmFromNormal();
    }

    @Override // X.InterfaceC1452170ntP
    public final int wf() {
        return LIZIZ().LLJLLIL.setDestroyVersion(true);
    }

    @Override // X.InterfaceC1452170ntP
    public final Rect LLJLLIL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1452170ntP
    public final Pair<Integer, Integer> getCanvasSize() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1452170ntP
    public final InterfaceC349860Dnc yf() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1452170ntP
    public final void Af(InterfaceC1464130oCh interfaceC1464130oCh) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        synchronized (vEEditorLIZIZ) {
            try {
                if (vEEditorLIZIZ.LLJLLIL != null) {
                    C2484209oO.LJIIIIZZ("VEEditor", "onRelease Async... ");
                    vEEditorLIZIZ.LLJILLL = interfaceC1464130oCh;
                    vEEditorLIZIZ.LLJLLIL.stop();
                    vEEditorLIZIZ.LLJLLIL.releaseEngineAsync();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void Ef(Function1<? super Surface, Unit> function1) {
        C1DOY c1doy = (C1DOY) this.LJIILL.getValue();
        if (c1doy.LIZIZ.isEmpty()) {
            c1doy.LIZ.LLJJ = c1doy.LIZJ;
        }
        if (!c1doy.LIZIZ.contains(function1)) {
            c1doy.LIZIZ.add(function1);
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void Gf(InterfaceC1464200oCo interfaceC1464200oCo) {
        this.LJIIJ.remove(interfaceC1464200oCo);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Te(int i) {
        LIZIZ().LLILZ.LJIIIIZZ.LIZ.getClass();
        return i;
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean Uf(VEVideoEncodeSettings vEVideoEncodeSettings) {
        return LIZIZ().LJJII(vEVideoEncodeSettings);
    }

    @Override // X.InterfaceC1452170ntP
    public final void We(InterfaceC1464190oCn interfaceC1464190oCn) {
        if (this.LJI.isEmpty()) {
            LIZIZ().LLJILJIL = this.LJII;
            C2255061DOe c2255061DOe = this.LJIILIIL;
            if (c2255061DOe != null) {
                c2255061DOe.LIZJ = this.LJII;
            }
        }
        if (!LIZ(this.LJI, interfaceC1464190oCn)) {
            this.LJI.add(interfaceC1464190oCn);
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int cancelGenVideoFrame(int i) {
        return LIZIZ().LLILLL.cancelGenVideoFrame(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final void cg(InterfaceC1464120oCg interfaceC1464120oCg) {
        if (((ArrayList) this.LJ).contains(interfaceC1464120oCg)) {
            return;
        }
        ((ArrayList) this.LJ).add(interfaceC1464120oCg);
        LIZJ().removeMessages(100);
        C786410Ut5.LJLJJI(100, 100L, LIZJ());
    }

    @Override // X.InterfaceC1452170ntP
    public final void df(InterfaceC1464200oCo interfaceC1464200oCo) {
        if (this.LJIIJ.isEmpty()) {
            VEEditor vEEditorLIZIZ = LIZIZ();
            C2255041DOc c2255041DOc = this.LJIIJJI;
            vEEditorLIZIZ.getClass();
            C2484209oO.LJI("VEEditor", "setOnInfoListener...");
            vEEditorLIZIZ.LLJJI = c2255041DOc;
            C2255061DOe c2255061DOe = this.LJIILIIL;
            if (c2255061DOe != null) {
                C2255041DOc c2255041DOc2 = this.LJIIJJI;
                c2255061DOe.LIZLLL = c2255041DOc2;
                VEEditor vEEditor = c2255061DOe.LIZ;
                if (vEEditor != null) {
                    C2484209oO.LJI("VEEditor", "setOnInfoListener...");
                    vEEditor.LLJJI = c2255041DOc2;
                }
            }
        }
        if (!LIZ(this.LJIIJ, interfaceC1464200oCo)) {
            this.LJIIJ.add(interfaceC1464200oCo);
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void dg(Function1<? super Surface, Unit> function1) {
        C1DOY c1doy = (C1DOY) this.LJIILL.getValue();
        c1doy.LIZIZ.remove(function1);
        if (c1doy.LIZIZ.isEmpty()) {
            c1doy.LIZ.LLJJ = null;
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void enableEffect(boolean z) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableEffect... enable = ");
        sbLIZ.append(z);
        C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        int iEnableEffect = vEEditorLIZIZ.LLJLLIL.enableEffect(z);
        if (iEnableEffect != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("enableEffect failed, ret = ");
            sbLIZ2.append(iEnableEffect);
            C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void enableSimpleProcessor(boolean z) {
        LIZIZ().LJIILLIIL(z);
    }

    @Override // X.InterfaceC1452170ntP
    public final float getColorFilterIntensity(String str) {
        C1DOV c1dov = LIZIZ().LLILZ;
        c1dov.getClass();
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return c1dov.LIZIZ.getColorFilterIntensity(str);
    }

    @Override // X.InterfaceC1452170ntP
    public final Bitmap getCurrDisplayImage(int i) {
        return LIZIZ().LJIJJ(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final void hf(InterfaceC1464200oCo interfaceC1464200oCo) {
        if (this.LJIIIIZZ.isEmpty()) {
            LIZIZ().LLJJIII = this.LJIIIZ;
            C2484209oO.LJI("VEEditor", "setOnErrorListener...");
            C2255061DOe c2255061DOe = this.LJIILIIL;
            if (c2255061DOe != null) {
                C2255031DOb c2255031DOb = this.LJIIIZ;
                c2255061DOe.LJ = c2255031DOb;
                VEEditor vEEditor = c2255061DOe.LIZ;
                if (vEEditor != null) {
                    vEEditor.LLJJIII = c2255031DOb;
                    C2484209oO.LJI("VEEditor", "setOnErrorListener...");
                }
            }
        }
        if (!LIZ(this.LJIIIIZZ, interfaceC1464200oCo)) {
            this.LJIIIIZZ.add(interfaceC1464200oCo);
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int hg(AbstractC574600MgE abstractC574600MgE) {
        int iLIZ = abstractC574600MgE.LIZ(LIZIZ(), this.LJIIL);
        this.LJIIL = true;
        return iLIZ;
    }

    @Override // X.InterfaceC1452170ntP
    public final int ig(int[] iArr) {
        int iRemoveFilter;
        C1DOV c1dov = LIZIZ().LLILZ;
        synchronized (c1dov.LIZ) {
            try {
                C2484209oO.LJI("VEEditor_VEFilterInvoker", "deleteFilters...");
                iRemoveFilter = c1dov.LIZIZ.removeFilter(iArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iRemoveFilter;
    }

    @Override // X.InterfaceC1452170ntP
    public final int kf(VEVideoEncodeSettings vEVideoEncodeSettings) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        synchronized (vEEditorLIZIZ) {
            try {
                if (vEEditorLIZIZ.LLLILZJ) {
                    if (vEEditorLIZIZ.LLJLLIL.getNativeHandler() == 0) {
                        return -1;
                    }
                    if (-1 == vEVideoEncodeSettings.getEnableRemuxVideoRes()) {
                        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("remux_video_res", VEConfigCenter.DataType.INTEGER, -1);
                        if (value != null && value.getValue() != null && (value.getValue() instanceof Integer)) {
                            int iIntValue = ((Integer) value.getValue()).intValue();
                            vEVideoEncodeSettings.setEnableRemuxVideoRes(iIntValue);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("getRemuxErrorCode::remuxVideoRes = ");
                            sbLIZ.append(iIntValue);
                            C2484209oO.LJI("VESDK", C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            C2484209oO.LJI("VESDK", "getRemuxErrorCode::No remux video resolution config");
                        }
                    }
                    vEEditorLIZIZ.LLJLLIL.genEditorStatus();
                    long nativeContext = VERuntime.getInstance().getNativeContext();
                    int i = VEPublishSettingManager.LIZIZ;
                    EnumC2255021DOa enumC2255021DOa = EnumC2255021DOa.LLILLJJLI;
                    enumC2255021DOa.LL.LIZLLL(vEVideoEncodeSettings, nativeContext);
                    VEVideoEncodeSettings vEVideoEncodeSettingsLJ = enumC2255021DOa.LL.LJ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("VideoEncodeSettings = ");
                    sbLIZ2.append(vEVideoEncodeSettingsLJ.toString());
                    C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                    int iLIZ = enumC2255021DOa.LL.LIZ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("before synthesis report remux error code = ");
                    sbLIZ3.append(iLIZ);
                    C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
                    return iLIZ;
                }
                throw new VEException(-105, "Make sure the initialization is successful before calling!!!");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void kg(C12D6 c12d6) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.LLJILJILJ = c12d6;
        if (vEEditorLIZIZ.LLJILJILJ != null) {
            TEInterface.nativeOpenOutputCallback(true);
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int mf(int i) {
        LIZIZ().LLILZ.LJIIIIZZ.LIZ.getClass();
        return i;
    }

    @Override // X.InterfaceC1452170ntP
    public final void mg(Bitmap bitmap) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        if (vEEditorLIZIZ.LLJJJJJIL.get()) {
            C2484209oO.LJIIIIZZ("VEEditor", "no need to setPreviewSurfaceBitmap, is destroying, just return");
        } else {
            C2484209oO.LJI("VEEditor", "setPreviewSurfaceBitmap...");
            vEEditorLIZIZ.LLJLLIL.setPreviewSurfaceBitmap(bitmap, true);
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void setBackgroundColor(int i) {
        LIZIZ().LJJIJLIJ(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final void setHeightWidthRatio(float f) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setHeightWidthRatio... ratio:");
        sbLIZ.append(f);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        vEEditorLIZIZ.LLJLLIL.setHeightWidthRatio(f);
    }

    @Override // X.InterfaceC1452170ntP
    public final int setInfoStickerRestoreMode(int i) {
        InterfaceC2255161DOo interfaceC2255161DOo = LIZIZ().LLILLJJLI;
        if (interfaceC2255161DOo == null) {
            C2484209oO.LIZJ("VEEditor", "setInfoStickerRestoreMode STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return interfaceC2255161DOo.setInfoStickerRestoreMode(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final void setLoopPlay(boolean z) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        C2484209oO.LJI("VEEditor", "setLoopPlay");
        vEEditorLIZIZ.LLJLLIL.setLooping(z);
    }

    @Override // X.InterfaceC1452170ntP
    public final void setPageMode(int i) {
        LIZIZ().LJJJJI(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final int setPreviewFps(int i) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPreviewFps = ");
        sbLIZ.append(i);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        vEEditorLIZIZ.LLJLLIL.setPreviewFps(i);
        return 0;
    }

    @Override // X.InterfaceC1452170ntP
    public final void sf(InterfaceC1464170oCl interfaceC1464170oCl) {
        LIZIZ().LLLL = interfaceC1464170oCl;
    }

    @Override // X.InterfaceC1452170ntP
    public final void tf(VEEditor.SCALE_MODE scale_mode) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        if (vEEditorLIZIZ.LLJJJJJIL.get()) {
            C2484209oO.LJIIIIZZ("VEEditor", "set scale mode failed,is destroying, just return");
        }
        if (vEEditorLIZIZ.LLJJJJJIL.get()) {
            C2484209oO.LJIIIIZZ("VEEditor", "set scale mode failed,is destroying, just return");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setScaleMode... mode:");
        sbLIZ.append(scale_mode);
        sbLIZ.append(", x = ");
        sbLIZ.append(0.0f);
        sbLIZ.append(", y = ");
        sbLIZ.append(0.0f);
        C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        switch (C1778410wNb.LIZ[scale_mode.ordinal()]) {
            case 1:
                vEEditorLIZIZ.LLJLLIL.setResizer(2, 0.0f, 0.0f);
                break;
            case 2:
                vEEditorLIZIZ.LLJLLIL.setResizer(1, 0.0f, 0.0f);
                break;
            case 3:
                vEEditorLIZIZ.LLJLLIL.setResizer(3, 0.0f, 0.0f);
                break;
            case 4:
                vEEditorLIZIZ.LLJLLIL.setResizer(4, 0.0f, 0.0f);
                break;
            case 5:
                vEEditorLIZIZ.LLJLLIL.setResizer(5, 0.0f, 0.0f);
                break;
            case 6:
                vEEditorLIZIZ.LLJLLIL.setResizer(6, 0.0f, 0.0f);
                break;
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int xf(boolean z) {
        String[] strArr;
        boolean z2;
        boolean z3;
        VEEditor vEEditorLIZIZ = LIZIZ();
        synchronized (vEEditorLIZIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enableReversePlay:");
                sbLIZ.append(z);
                C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                VEEditorResManager vEEditorResManager = vEEditorLIZIZ.LLILZLL;
                if (!vEEditorResManager.mReverseDone) {
                    C2484209oO.LIZJ("VEEditor", "enableReversePlay error: reverse video is not ready!");
                    return -100;
                }
                String[] strArr2 = vEEditorResManager.mReverseVideoPath;
                if (strArr2 != null && strArr2.length > 0) {
                    TEVideoUtils.nativeCancelCompileProbe();
                    long durationUs = vEEditorLIZIZ.LLJLLIL.getDurationUs();
                    vEEditorLIZIZ.LLJLLIL.stop();
                    if (!z) {
                        strArr = vEEditorLIZIZ.LLILZLL.mVideoPaths;
                    } else {
                        strArr = vEEditorLIZIZ.LLILZLL.mReverseVideoPath;
                    }
                    int iUpdateTrackClips = vEEditorLIZIZ.LLJLLIL.updateTrackClips(0, 0, strArr);
                    if (iUpdateTrackClips != 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateTrackClips failed, ret = ");
                        sbLIZ2.append(iUpdateTrackClips);
                        C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                        return iUpdateTrackClips;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("enableReversePlay: mReverseAudioPaths == null: ");
                    if (vEEditorLIZIZ.LLILZLL.mReverseAudioPaths == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sbLIZ3.append(z2);
                    C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("enableReversePlay: mOriginalSoundTrackType = ");
                    sbLIZ4.append(vEEditorLIZIZ.LLILZLL.mOriginalSoundTrackType);
                    C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ4));
                    VEEditorResManager vEEditorResManager2 = vEEditorLIZIZ.LLILZLL;
                    String[] strArr3 = vEEditorResManager2.mReverseAudioPaths;
                    if (strArr3 != null && vEEditorResManager2.mOriginalSoundTrackType != 1) {
                        TEInterface tEInterface = vEEditorLIZIZ.LLJLLIL;
                        int iAddAudioTrack = tEInterface.addAudioTrack(strArr3[0], 0, tEInterface.getDuration(), 0, vEEditorLIZIZ.LLJLLIL.getDuration(), false);
                        vEEditorLIZIZ.LLILZLL.mOriginalSoundTrackIndex = vEEditorLIZIZ.LLJJIJI.LIZ(iAddAudioTrack);
                        VEEditorResManager vEEditorResManager3 = vEEditorLIZIZ.LLILZLL;
                        vEEditorResManager3.mOriginalSoundTrackType = 1;
                        vEEditorResManager3.mReverseAudioDone = true;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("enableReversePlay: add org audio track index = ");
                        sbLIZ5.append(vEEditorLIZIZ.LLILZLL.mOriginalSoundTrackIndex);
                        sbLIZ5.append(" mOriginalSoundTrackType = ");
                        sbLIZ5.append(vEEditorLIZIZ.LLILZLL.mOriginalSoundTrackType);
                        C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ5));
                    }
                    TEInterface tEInterface2 = vEEditorLIZIZ.LLJLLIL;
                    if (z != vEEditorLIZIZ.LLLJ) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    tEInterface2.updateTrackFilterDuration(0, 0, z3, durationUs);
                    vEEditorLIZIZ.LLJLLIL.createTimeline();
                    int iPrepareEngine = vEEditorLIZIZ.LLJLLIL.prepareEngine(0);
                    if (iPrepareEngine != 0) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("enableReversePlay() prepareEngine failed: result: ");
                        sbLIZ6.append(iPrepareEngine);
                        C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ6));
                        return iPrepareEngine;
                    }
                    vEEditorLIZIZ.LLILZ.getClass();
                    vEEditorLIZIZ.LJJIJIIJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                    vEEditorLIZIZ.LLLJ = z;
                    if (z) {
                        new C1404320meE().LIZJ("iesve_veeditor_time_effect_id", "reverse");
                        vEEditorLIZIZ.LLLLIIL.getClass();
                    }
                    return 0;
                }
                C2484209oO.LIZJ("VEEditor", "enableReversePlay error: reverse video path is invalid!");
                return -105;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1DOr] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.1DOb] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.1DOc] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1DOf] */
    public C1DOT(VEEditor vEEditor, C2255061DOe c2255061DOe) {
        this.LJIILJJIL = vEEditor;
        this.LJIILIIL = c2255061DOe;
        c2255061DOe.LIZ = vEEditor;
    }

    public static final boolean LIZ(CopyOnWriteArrayList<?> copyOnWriteArrayList, Object obj) {
        Iterator<?> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            if (it2.next() == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1452170ntP
    public final int Lf(C1463750oC5 c1463750oC5, boolean z) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        String[] strArr = c1463750oC5.LIZ;
        String[] strArr2 = c1463750oC5.LIZIZ;
        int[] iArr = c1463750oC5.LIZJ;
        int[] iArr2 = c1463750oC5.LIZLLL;
        float[] fArr = c1463750oC5.LJ;
        String[] strArr3 = c1463750oC5.LJFF;
        String[] strArr4 = c1463750oC5.LJI;
        int[] iArr3 = c1463750oC5.LJII;
        int[] iArr4 = c1463750oC5.LJIIIIZZ;
        float[] fArr2 = c1463750oC5.LJIIIZ;
        ROTATE_DEGREE[] rotate_degreeArr = c1463750oC5.LJIIJ;
        vEEditorLIZIZ.getClass();
        if (strArr != null && strArr.length != 0) {
            boolean[] zArr = new boolean[strArr.length];
            Arrays.fill(zArr, true);
            return vEEditorLIZIZ.LJI(zArr, strArr, strArr2, iArr, iArr2, fArr, strArr3, strArr4, iArr3, iArr4, fArr2, rotate_degreeArr);
        }
        return -100;
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean Mf(String str, VEVideoEncodeSettings vEVideoEncodeSettings) {
        return LIZIZ().LJIIIZ(str, null, vEVideoEncodeSettings);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Nf(int i, InterfaceC1464150oCj interfaceC1464150oCj) {
        return LIZIZ().LLILLL.beginGenVideoFrames(i, 1, true, interfaceC1464150oCj);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Rf(int i, VEEditor.SET_RANGE_MODE set_range_mode) {
        int iPrepareEngine;
        C2255151DOn c2255151DOn = LIZIZ().LLILZIL;
        synchronized (c2255151DOn.LIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInOut... ");
                sbLIZ.append(0);
                sbLIZ.append(" ");
                sbLIZ.append(i);
                sbLIZ.append(" mode ");
                sbLIZ.append(set_range_mode.getValue());
                C2484209oO.LJI("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ));
                c2255151DOn.LIZIZ.stop();
                c2255151DOn.LIZIZ.setTimeRange(0, i, set_range_mode.getValue());
                iPrepareEngine = c2255151DOn.LIZIZ.prepareEngine(0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iPrepareEngine;
    }

    @Override // X.InterfaceC1452170ntP
    public final void Tf(int i, int i2) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMaxWidthHeight... width:");
        sbLIZ.append(i);
        sbLIZ.append(", height:");
        sbLIZ.append(i2);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        vEEditorLIZIZ.LLJLLIL.setMaxWidthHeight(i, i2);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Ue(int i, InterfaceC1464140oCi interfaceC1464140oCi) {
        int iSeekWithResult;
        VEEditor vEEditorLIZIZ = LIZIZ();
        synchronized (vEEditorLIZIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("seekWithResult... ");
                sbLIZ.append(i);
                C2484209oO.LJIIIIZZ("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                vEEditorLIZIZ.LLLLIIIILLL = interfaceC1464140oCi;
                vEEditorLIZIZ.LLJLLIL.setSeekFrameCallback(vEEditorLIZIZ.LLLLLLLLL);
                iSeekWithResult = vEEditorLIZIZ.LLJLLIL.seekWithResult(i, -1, -1);
                if (iSeekWithResult != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("seek failed, result = ");
                    sbLIZ2.append(iSeekWithResult);
                    C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ2));
                    vEEditorLIZIZ.LLLLIIIILLL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iSeekWithResult;
    }

    @Override // X.InterfaceC1452170ntP
    public final void Vf(int i, int i2) {
        LIZIZ().LJJJJJL(i, i2);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Wf(int i, ROTATE_DEGREE rotate_degree) {
        C2255151DOn c2255151DOn = LIZIZ().LLILZIL;
        c2255151DOn.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setFileRotate...");
        sbLIZ.append(0);
        sbLIZ.append(" ");
        sbLIZ.append(i);
        sbLIZ.append(" ");
        sbLIZ.append(rotate_degree);
        C2484209oO.LJI("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ));
        TEInterface tEInterface = c2255151DOn.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("");
        sbLIZ2.append(rotate_degree.ordinal());
        return tEInterface.setClipAttr(0, 0, i, "clip rotate", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC1452170ntP
    public final int addMetadata(String str, String str2) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        synchronized (vEEditorLIZIZ) {
            try {
                C2484209oO.LJIIIIZZ("VEEditor", "addMetadata...");
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    vEEditorLIZIZ.LLJLLIL.addMetaData(str, str2);
                    return 0;
                }
                return -100;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int bg(int i, InterfaceC1464140oCi interfaceC1464140oCi) {
        return Ue(i, interfaceC1464140oCi);
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean ef(int i, int i2) {
        LIZIZ().LJJJJJL(i, i2);
        return true;
    }

    @Override // X.InterfaceC1452170ntP
    public final int fg(int i, int i2) {
        C2255151DOn c2255151DOn = LIZIZ().LLILZIL;
        synchronized (c2255151DOn.LIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("moveClip, trackType:");
                sbLIZ.append(0);
                sbLIZ.append(" from:");
                sbLIZ.append(i);
                sbLIZ.append(" to:");
                sbLIZ.append(i2);
                sbLIZ.append(" isMoveEffect:");
                sbLIZ.append(true);
                C2484209oO.LJIIIIZZ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ));
                c2255151DOn.LIZIZ.stop();
                int iMoveClip = c2255151DOn.LIZIZ.moveClip(0, i, i2, true);
                if (iMoveClip < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("moveClip failed, ret = ");
                    sbLIZ2.append(iMoveClip);
                    C2484209oO.LIZJ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iMoveClip;
                }
                VEEditor vEEditor = c2255151DOn.LIZ;
                vEEditor.LLJLL = 0;
                int iLJJIJ = vEEditor.LJJIJ();
                if (iLJJIJ == 0) {
                    return 0;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Prepare Engine failed, ret = ");
                sbLIZ3.append(iLJJIJ);
                C2484209oO.LIZJ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ3));
                return iLJJIJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final VESize getInitSize(int i, int i2) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        VESize vESize = new VESize(0, 0);
        VESize vESize2 = vEEditorLIZIZ.LLIZ;
        float f = vESize2.width;
        float f2 = vESize2.height;
        float f3 = i;
        float f4 = i2;
        if (f / f2 > f3 / f4) {
            vESize.width = i;
            vESize.height = (int) (f3 / (vESize2.width / f2));
        } else {
            vESize.height = i2;
            vESize.width = (int) (f4 / (vESize2.height / f));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getInitSize... surfaceWidth:");
        sbLIZ.append(i);
        sbLIZ.append(", surfaceHeight:");
        sbLIZ.append(i2);
        sbLIZ.append(", width:");
        sbLIZ.append(vESize.width);
        sbLIZ.append(", height:");
        sbLIZ.append(vESize.height);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        return vESize;
    }

    @Override // X.InterfaceC1452170ntP
    public final int nf(int i, VEEditor.SEEK_MODE seek_mode) {
        LIZJ().removeMessages(100);
        C786410Ut5.LJLILLLLZI(LIZJ(), 100);
        return LIZIZ().LJJIJIIJIL(i, seek_mode);
    }

    @Override // X.InterfaceC1452170ntP
    public final int setInfoStickerAlpha(int i, float f) {
        InterfaceC2255161DOo interfaceC2255161DOo = LIZIZ().LLILLJJLI;
        if (interfaceC2255161DOo == null) {
            C2484209oO.LIZJ("VEEditor", "setInfoStickerAlpha STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return interfaceC2255161DOo.setInfoStickerAlpha(i, f);
    }

    @Override // X.InterfaceC1452170ntP
    public final int setPreviewFps(int i, boolean z) {
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPreviewFps = ");
        sbLIZ.append(i);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        vEEditorLIZIZ.LLJLLIL.setPreviewFps(i);
        return 0;
    }

    @Override // X.InterfaceC1452170ntP
    public final int uf(int i, int i2) {
        int iPrepareEngine;
        C2255151DOn c2255151DOn = LIZIZ().LLILZIL;
        synchronized (c2255151DOn.LIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setInOut... ");
                sbLIZ.append(i);
                sbLIZ.append(" ");
                sbLIZ.append(i2);
                C2484209oO.LJI("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ));
                c2255151DOn.LIZIZ.stop();
                c2255151DOn.LIZIZ.setTimeRange(i, i2, 0);
                iPrepareEngine = c2255151DOn.LIZIZ.prepareEngine(0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iPrepareEngine;
    }

    @Override // X.InterfaceC1452170ntP
    public final int updateTrackFilterParam(int i, VEBaseFilterParam vEBaseFilterParam) {
        return LIZIZ().LJJJJZ(i, vEBaseFilterParam);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Cf(int i, int i2, InterfaceC1464140oCi interfaceC1464140oCi) {
        return LIZIZ().LJJIJL(i, i2, interfaceC1464140oCi);
    }

    @Override // X.InterfaceC1452170ntP
    public final void Df(int i, int i2, int i3) {
        LIZIZ().LJJJIL(i, i2, i3);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Oe(int i, int i2, VEBaseFilterParam vEBaseFilterParam) {
        return LIZIZ().LJJJJLL(i, i2, vEBaseFilterParam);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Re(boolean[] zArr, C1463750oC5 c1463750oC5, boolean z) {
        return LIZIZ().LJI(zArr, c1463750oC5.LIZ, c1463750oC5.LIZIZ, c1463750oC5.LIZJ, c1463750oC5.LIZLLL, c1463750oC5.LJ, c1463750oC5.LJFF, c1463750oC5.LJI, c1463750oC5.LJII, c1463750oC5.LJIIIIZZ, c1463750oC5.LJIIIZ, c1463750oC5.LJIIJ);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Yf(int i, VEEditor.SEEK_MODE seek_mode, InterfaceC1464180oCm interfaceC1464180oCm) {
        return LIZIZ().LJJIJIL(i, seek_mode, interfaceC1464180oCm);
    }

    @Override // X.InterfaceC1452170ntP
    public final int cf(VETimelineParams vETimelineParams, int i, int i2) {
        C2255151DOn c2255151DOn = LIZIZ().LLILZIL;
        c2255151DOn.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSceneTime with start/end time");
        sbLIZ.append(vETimelineParams.toString());
        sbLIZ.append(" startTime: ");
        sbLIZ.append(i);
        sbLIZ.append(" endTime: ");
        sbLIZ.append(i2);
        C2484209oO.LJIIIIZZ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (c2255151DOn.LIZ) {
            try {
                c2255151DOn.LIZIZ.stop();
                int iUpdateSenceTime = c2255151DOn.LIZIZ.updateSenceTime(vETimelineParams);
                if (iUpdateSenceTime < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateSceneTime failed, ret = ");
                    sbLIZ2.append(iUpdateSenceTime);
                    C2484209oO.LIZJ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iUpdateSenceTime;
                }
                c2255151DOn.LIZ.LLJLL = 0;
                c2255151DOn.LIZIZ.setTimeRange(i, i2, 0);
                int iPrepareEngine = c2255151DOn.LIZIZ.prepareEngine(0);
                if (iPrepareEngine != 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Prepare Engine failed, ret = ");
                    sbLIZ3.append(iPrepareEngine);
                    C2484209oO.LIZJ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ3));
                    return iPrepareEngine;
                }
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int gg(int i, ArrayList arrayList, ArrayList arrayList2) {
        int i2 = i;
        C2255151DOn c2255151DOn = LIZIZ().LLILZIL;
        synchronized (c2255151DOn.LIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("insertClip, trackType:");
                sbLIZ.append(0);
                sbLIZ.append("clipIndex:");
                sbLIZ.append(i2);
                C2484209oO.LJIIIIZZ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ));
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("index: ");
                    sbLIZ2.append(i3);
                    sbLIZ2.append("clipSourceParams: ");
                    sbLIZ2.append(((VEClipSourceParam) arrayList.get(i3)).toString());
                    C2484209oO.LJIIIIZZ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                }
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("index: ");
                    sbLIZ3.append(i4);
                    sbLIZ3.append("clipTimelineParams: ");
                    sbLIZ3.append(((VEClipTimelineParam) arrayList2.get(i4)).toString());
                    C2484209oO.LJIIIIZZ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ3));
                }
                c2255151DOn.LIZIZ.stop();
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    int iInsertClip = c2255151DOn.LIZIZ.insertClip(0, 0, i2, (VEClipSourceParam) arrayList.get(i5), (VEClipTimelineParam) arrayList2.get(i5));
                    if (iInsertClip < 0) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("insertClip failed, ret = ");
                        sbLIZ4.append(iInsertClip);
                        C2484209oO.LIZJ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ4));
                        return iInsertClip;
                    }
                    i2++;
                }
                c2255151DOn.LIZ.LLJLL = 0;
                TEInterface tEInterface = c2255151DOn.LIZIZ;
                tEInterface.setTimeRange(0, tEInterface.getDuration(), 1);
                int iLJJIJ = c2255151DOn.LIZ.LJJIJ();
                if (iLJJIJ == 0) {
                    return 0;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("Prepare Engine failed, ret = ");
                sbLIZ5.append(iLJJIJ);
                C2484209oO.LIZJ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ5));
                return iLJJIJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean og(float f, int i, int i2) {
        return LIZIZ().LJJJJJ(f, i, i2);
    }

    @Override // X.InterfaceC1452170ntP
    public final int vf(VEImageTransformFilterParam vEImageTransformFilterParam, int i, int i2) {
        return LIZIZ().LJFF(0, 0, vEImageTransformFilterParam, i, i2);
    }

    @Override // X.InterfaceC1452170ntP
    public final String Of(int i, int i2, int i3, String str) {
        String clipInfoStringWithPath;
        C2255151DOn c2255151DOn = LIZIZ().LLILZIL;
        synchronized (c2255151DOn.LIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getClipFileInfoStringWithPath... ");
                sbLIZ.append(i);
                sbLIZ.append(", ");
                sbLIZ.append(i2);
                sbLIZ.append(", ");
                sbLIZ.append(i3);
                C2484209oO.LJI("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ));
                clipInfoStringWithPath = c2255151DOn.LIZIZ.getClipInfoStringWithPath(i, i2, i3, str);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getClipInfoStringWithPath result ");
                sbLIZ2.append(clipInfoStringWithPath);
                C2484209oO.LJI("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return clipInfoStringWithPath;
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean Qe(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, InterfaceC574560MgA interfaceC574560MgA) {
        return LIZIZ().LJIIJ(str, str2, vEVideoEncodeSettings, interfaceC574560MgA);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Sf(VETimelineParams vETimelineParams, boolean z, int i, boolean z2) {
        int i2;
        C2255151DOn c2255151DOn = LIZIZ().LLILZIL;
        c2255151DOn.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSceneTime... ");
        sbLIZ.append(vETimelineParams.toString());
        C2484209oO.LJIIIIZZ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (c2255151DOn.LIZ) {
            try {
                c2255151DOn.LIZIZ.stop();
                int iUpdateSenceTime = c2255151DOn.LIZIZ.updateSenceTime(vETimelineParams);
                if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (iUpdateSenceTime >= 0) {
                            i2 = 0;
                        } else {
                            i2 = iUpdateSenceTime;
                        }
                        jSONObject.put("resultCode", String.valueOf(i2));
                        jSONObject.put("sceneTime", vETimelineParams.toString());
                        b.LIZIZ("vesdk_event_editor_update_scene_time", "business", jSONObject, true);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (iUpdateSenceTime < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateSceneTime failed, ret = ");
                    sbLIZ2.append(iUpdateSenceTime);
                    C2484209oO.LIZJ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iUpdateSenceTime;
                }
                VEEditor vEEditor = c2255151DOn.LIZ;
                vEEditor.LLJLL = 0;
                vEEditor.LJJJJL();
                c2255151DOn.LIZIZ.setTimeRange(0, iUpdateSenceTime, 0);
                int iPrepareEngine = c2255151DOn.LIZIZ.prepareEngine(0);
                if (iPrepareEngine != 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Prepare Engine failed, ret = ");
                    sbLIZ3.append(iPrepareEngine);
                    C2484209oO.LIZJ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ3));
                    return iPrepareEngine;
                }
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void setDisplayPos(int i, int i2, int i3, int i4) {
        this.LIZIZ.set(i, i2, i3, i4);
        VEEditor vEEditorLIZIZ = LIZIZ();
        vEEditorLIZIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDisplayPos... ");
        sbLIZ.append(i);
        sbLIZ.append(" ");
        sbLIZ.append(i2);
        sbLIZ.append(" ");
        sbLIZ.append(i3);
        sbLIZ.append(" ");
        sbLIZ.append(i4);
        C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
        vEEditorLIZIZ.LJJJ(i3 / vEEditorLIZIZ.LLJL, i4 / vEEditorLIZIZ.LLJLIL, 0.0f, -(((vEEditorLIZIZ.LLJJL / 2) - (i3 / 2)) - i), ((vEEditorLIZIZ.LLJJLIIIJLLLLLLLZ / 2) - (i4 / 2)) - i2);
    }

    @Override // X.InterfaceC1452170ntP
    public final int lg(int[] iArr, int i, int i2, VEEditor.GET_FRAMES_FLAGS get_frames_flags, final InterfaceC1464140oCi interfaceC1464140oCi) {
        int images;
        this.LIZLLL = true;
        VEEditor vEEditorLIZIZ = LIZIZ();
        InterfaceC1464140oCi interfaceC1464140oCi2 = new InterfaceC1464140oCi() { // from class: X.1DOd
            @Override // X.InterfaceC1464140oCi
            public final int onGetImageData(byte[] bArr, int i3, int i4, int i5, float f) {
                if (bArr == null) {
                    C1DOT c1dot = this.LIZ;
                    if (c1dot.LIZLLL) {
                        c1dot.cancelGetVideoFrames();
                    }
                }
                return interfaceC1464140oCi.onGetImageData(bArr, i3, i4, i5, f);
            }
        };
        synchronized (vEEditorLIZIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getImages... width:");
                sbLIZ.append(i);
                sbLIZ.append(", height:");
                sbLIZ.append(i2);
                sbLIZ.append(", flags:");
                sbLIZ.append(get_frames_flags);
                sbLIZ.append(", isRough: ");
                sbLIZ.append(false);
                C2484209oO.LJI("VEEditor", C2188811AlT.LIZIZ(sbLIZ));
                if (i == 0 || i2 == 0) {
                    C2484209oO.LIZJ("VEEditor", "getImages error, size invalid");
                    images = -100;
                } else {
                    vEEditorLIZIZ.LLLLII = interfaceC1464140oCi2;
                    vEEditorLIZIZ.LLJLLIL.setGetImageCallback(vEEditorLIZIZ.LLLLLLL);
                    images = vEEditorLIZIZ.LLJLLIL.getImages(iArr, i, i2, false, get_frames_flags.getValue());
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("resultCode", images);
                    jSONObject.put("has_effect", 1);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                b.LIZIZ("vesdk_editor_get_frame", "performance", jSONObject, true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return images;
    }

    @Override // X.InterfaceC1452170ntP
    public final void setDisplayState(float f, float f2, float f3, int i, int i2) {
        LIZIZ().LJJJ(f, f2, f3, i, i2);
    }
}
