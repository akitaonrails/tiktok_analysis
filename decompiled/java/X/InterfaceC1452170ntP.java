package X;

import Y.ARunnableS119S0100000_19;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ttve.model.VEAudioTrackIndex;
import com.ss.android.ugc.asve.editor.NLECommitStatisticsConfig;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ntP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1452170ntP {
    void Af(InterfaceC1464130oCh interfaceC1464130oCh);

    int Bf(VEVideoEncodeSettings vEVideoEncodeSettings);

    int Cf(int i, int i2, InterfaceC1464140oCi interfaceC1464140oCi);

    void Df(int i, int i2, int i3);

    void Ef(Function1<? super Surface, Unit> function1);

    void Ff(boolean z);

    void Gf(InterfaceC1464200oCo interfaceC1464200oCo);

    boolean Hf();

    void If();

    void Jf(C1435820nT2 c1435820nT2);

    void Kf(NLECommitStatisticsConfig nLECommitStatisticsConfig);

    SurfaceView LJIJJLI();

    Rect LLJLLIL();

    int LLL();

    int Lf(C1463750oC5 c1463750oC5, boolean z);

    boolean Mf(String str, VEVideoEncodeSettings vEVideoEncodeSettings);

    int Nf(int i, InterfaceC1464150oCj interfaceC1464150oCj);

    int Oe(int i, int i2, VEBaseFilterParam vEBaseFilterParam);

    String Of(int i, int i2, int i3, String str);

    void Pe(Boolean bool);

    void Pf(int i, int i2);

    boolean Qe(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, InterfaceC574560MgA interfaceC574560MgA);

    int Qf();

    int Re(boolean[] zArr, C1463750oC5 c1463750oC5, boolean z);

    int Rf(int i, VEEditor.SET_RANGE_MODE set_range_mode);

    void Se();

    int Sf(VETimelineParams vETimelineParams, boolean z, int i, boolean z2);

    int Te(int i);

    void Tf(int i, int i2);

    int Ue(int i, InterfaceC1464140oCi interfaceC1464140oCi);

    boolean Uf(VEVideoEncodeSettings vEVideoEncodeSettings);

    void Ve(NLEModel nLEModel);

    void Vf(int i, int i2);

    void We(InterfaceC1464190oCn interfaceC1464190oCn);

    int Wf(int i, ROTATE_DEGREE rotate_degree);

    void Xe();

    void Xf();

    List<VEAudioTrackIndex> Ye();

    int Yf(int i, VEEditor.SEEK_MODE seek_mode, InterfaceC1464180oCm interfaceC1464180oCm);

    void Ze(ARunnableS119S0100000_19 aRunnableS119S0100000_19);

    String Zf();

    int addMetadata(String str, String str2);

    String[] af();

    void ag();

    NLEModel bf(boolean z);

    int bg(int i, InterfaceC1464140oCi interfaceC1464140oCi);

    int cancelGenVideoFrame(int i);

    int cancelGetVideoFrames();

    int cf(VETimelineParams vETimelineParams, int i, int i2);

    void cg(InterfaceC1464120oCg interfaceC1464120oCg);

    void destroy();

    void df(InterfaceC1464200oCo interfaceC1464200oCo);

    void dg(Function1<? super Surface, Unit> function1);

    boolean ef(int i, int i2);

    void eg();

    void enableEffect(boolean z);

    void enableSimpleProcessor(boolean z);

    VEEditorModel ff();

    int fg(int i, int i2);

    int genRandomSolve();

    int genSmartCutting();

    List<VEClipAlgorithmParam> getAllVideoRangeData();

    Pair<Integer, Integer> getCanvasSize();

    float getColorFilterIntensity(String str);

    String getCompileStuckResult();

    Bitmap getCurrDisplayImage();

    Bitmap getCurrDisplayImage(int i);

    int getDuration();

    long getHandler();

    VESize getInitSize();

    VESize getInitSize(int i, int i2);

    float getPlayFps();

    VEEditor.VEState getState();

    int getVEColorSpace();

    String getWorkspace();

    void gf(Function0 function0, boolean z, boolean z2);

    int gg(int i, ArrayList arrayList, ArrayList arrayList2);

    void hf(InterfaceC1464200oCo interfaceC1464200oCo);

    int hg(AbstractC574600MgE abstractC574600MgE);

    /* JADX INFO: renamed from: if, reason: not valid java name */
    int mo51if();

    int ig(int[] iArr);

    int initBingoAlgorithm();

    boolean isUseFilterProcess();

    void jf();

    void jg();

    int kf(VEVideoEncodeSettings vEVideoEncodeSettings);

    void kg(C12D6 c12d6);

    int lf();

    int lg(int[] iArr, int i, int i2, VEEditor.GET_FRAMES_FLAGS get_frames_flags, InterfaceC1464140oCi interfaceC1464140oCi);

    int mf(int i);

    void mg(Bitmap bitmap);

    int nf(int i, VEEditor.SEEK_MODE seek_mode);

    int ng();

    void of();

    boolean og(float f, int i, int i2);

    int pause();

    void pauseCompile();

    void pf(String str);

    int play();

    int prepare();

    boolean qf(NLEModel nLEModel);

    int refreshCurrentFrame();

    void releaseResource();

    int removeAllVideoSound();

    int restoreAllVideoSound();

    void resumeCompile();

    VEMVAudioInfo rf();

    void setBackgroundColor(int i);

    @InterfaceC1294060jmO
    void setDisplayPos(int i, int i2, int i3, int i4);

    void setDisplayState(float f, float f2, float f3, int i, int i2);

    void setHeightWidthRatio(float f);

    int setInfoStickerAlpha(int i, float f);

    int setInfoStickerRestoreMode(int i);

    void setLoopPlay(boolean z);

    void setPageMode(int i);

    int setPreviewFps(int i);

    int setPreviewFps(int i, boolean z);

    int setPreviewMaxFps(int i);

    void setPreviewSurfaceTexDesc(String str);

    void setReuseFirstAVFileInfo(boolean z);

    void setSmartRecodeParam(boolean z, int i);

    void sf(InterfaceC1464170oCl interfaceC1464170oCl);

    void stop();

    void tf(VEEditor.SCALE_MODE scale_mode);

    int uf(int i, int i2);

    int updateAlgorithmFromNormal();

    void updateSurfaceView(SurfaceView surfaceView);

    int updateTrackFilterParam(int i, VEBaseFilterParam vEBaseFilterParam);

    int vf(VEImageTransformFilterParam vEImageTransformFilterParam, int i, int i2);

    int wf();

    int xf(boolean z);

    void yc(NLEModel nLEModel);

    InterfaceC349860Dnc yf();

    void zf(boolean z);
}
