package X;

import Y.ARunnableS119S0100000_19;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.INLEExporter;
import com.bytedance.ies.nle.editor_jni.INLEListenerAsyncReleaseEngineUnitResource;
import com.bytedance.ies.nle.editor_jni.INLEListenerBeginVideoFrame;
import com.bytedance.ies.nle.editor_jni.INLEListenerByteBufferEncoder;
import com.bytedance.ies.nle.editor_jni.INLEListenerCommon;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.INLEListenerEncoder;
import com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame;
import com.bytedance.ies.nle.editor_jni.INLEListenerGetImage;
import com.bytedance.ies.nle.editor_jni.INLEListenerSurfaceStatus;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMonitor;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEBranchListener;
import com.bytedance.ies.nle.editor_jni.NLEClipAlgorithmParam;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaABConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPlayerPreviewMode;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.ies.nle.editor_jni.NLEResFillMode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResizeAlgorithm;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentTimeEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVEUserConfig;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEVideoInvisibleWatermark;
import com.bytedance.ies.nle.editor_jni.NLE_GET_FRAME_FLAGS;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecLongLong;
import com.bytedance.ies.nle.editor_jni.VecNLEClipAlgorithmParam;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEAudioTrackIndex;
import com.ss.android.ugc.asve.editor.NLECommitStatisticsConfig;
import com.ss.android.ugc.asve.editor.NLEDropFrameParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEUserConfig;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463670oBx implements InterfaceC1452170ntP {
    public final Map<String, Throwable> LIZ;
    public final String LIZIZ;
    public final InterfaceC349870Dnd LIZJ;
    public Runnable LIZLLL;
    public final C0E9H LJ;
    public boolean LJFF;
    public final C1463860oCG LJI;
    public Throwable LJII;
    public final C349850Dnb LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public long LJIIJJI;
    public boolean LJIIL;
    public ArrayList<Long> LJIILIIL;
    public ArrayList<Long> LJIILJJIL;
    public List<Integer> LJIILL;
    public List<Integer> LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public final C0E9E LJIJJLI;
    public C0E9D LJIL;
    public final C01GW LJJ;
    public final SurfaceView LJJI;
    public Pair<Integer, Integer> LJJIFFI;
    public final Rect LJJII;
    public final List<InterfaceC1464120oCg> LJJIII;
    public final C01GW LJJIIJ;
    public final CopyOnWriteArrayList<InterfaceC1464190oCn> LJJIIJZLJL;
    public final C1463890oCJ LJJIIZ;
    public final CopyOnWriteArrayList<InterfaceC1464200oCo> LJJIIZI;
    public final C1463800oCA LJJIJ;
    public final CopyOnWriteArrayList<InterfaceC1464200oCo> LJJIJIIJI;
    public final C1463810oCB LJJIJIIJIL;
    public final CopyOnWriteArrayList<Function1<Surface, Unit>> LJJIJIL;

    @Override // X.InterfaceC1452170ntP
    public final int Qf() {
        return -101;
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean og(float f, int i, int i2) {
        return true;
    }

    @Override // X.InterfaceC1452170ntP
    public final VEMVAudioInfo rf() {
        return null;
    }

    @Override // X.InterfaceC1452170ntP
    public final void tf(VEEditor.SCALE_MODE scale_mode) {
    }

    @Override // X.InterfaceC1452170ntP
    public final void If() {
        ((ArrayList) this.LJJIII).clear();
        LIZIZ().removeMessages(100);
    }

    public final Handler LIZIZ() {
        return (Handler) this.LJJIIJ.getValue();
    }

    public final NLEModel LIZJ() {
        NLEModel model = getModel();
        return model == null ? new NLEModel() : model;
    }

    public final C348100Dkm LIZLLL() {
        return (C348100Dkm) this.LJJ.getValue();
    }

    public final void LJI() {
        C2219091BtD c2219091BtD = C2219091BtD.LIZ;
        c2219091BtD.getClass();
        if (((Boolean) C2219091BtD.LJ.getValue(c2219091BtD, C2219091BtD.LIZIZ[2])).booleanValue()) {
            C1463860oCG c1463860oCG = this.LJI;
            if (c1463860oCG == null) {
                c1463860oCG = null;
            }
            NLEMediaABConfig nleMediaAbConfig = c1463860oCG.getMediaConfig().getNleMediaAbConfig();
            if (nleMediaAbConfig != null) {
                nleMediaAbConfig.setEnableApiThreadCheck(true);
            }
            C1463860oCG c1463860oCG2 = this.LJI;
            if (c1463860oCG2 == null) {
                c1463860oCG2 = null;
            }
            NLEMediaABConfig nleMediaAbConfig2 = c1463860oCG2.getMediaConfig().getNleMediaAbConfig();
            if (nleMediaAbConfig2 != null) {
                nleMediaAbConfig2.setEnableApiTimeCost(true);
            }
            C1463860oCG c1463860oCG3 = this.LJI;
            if (c1463860oCG3 == null) {
                c1463860oCG3 = null;
            }
            NLEMediaABConfig nleMediaAbConfig3 = c1463860oCG3.getMediaConfig().getNleMediaAbConfig();
            if (nleMediaAbConfig3 != null) {
                nleMediaAbConfig3.setThreadSamplingProb(1.0d);
            }
        }
        C1463860oCG c1463860oCG4 = this.LJI;
        if (c1463860oCG4 == null) {
            c1463860oCG4 = null;
        }
        NLEMediaABConfig nleMediaAbConfig4 = c1463860oCG4.getMediaConfig().getNleMediaAbConfig();
        if (nleMediaAbConfig4 == null || !nleMediaAbConfig4.getEnableApiThreadCheck()) {
            C1463860oCG c1463860oCG5 = this.LJI;
            NLEMediaABConfig nleMediaAbConfig5 = (c1463860oCG5 != null ? c1463860oCG5 : null).getMediaConfig().getNleMediaAbConfig();
            if (nleMediaAbConfig5 == null || !nleMediaAbConfig5.getEnableApiTimeCost()) {
                return;
            }
        }
        NLE nle = NLE.INSTANCE;
        if (nle.getMonitor() == null) {
            nle.setMonitor(new INLEMonitor() { // from class: X.08Zx
                /* JADX WARN: Type inference failed for: r6v0, types: [X.082W] */
                @Override // com.bytedance.ies.nle.editor_jni.INLEMonitor
                public final void onEvent(String str, int i, String str2, long j) {
                    String str3;
                    if (!Intrinsics.LJFF(str, NLEEditorJniJNI.NLEMonitor_KEY_API_MONITOR_COST_get()) && !Intrinsics.LJFF(str, NLEEditorJniJNI.NLEMonitor_KEY_NLE_SET_DATA_SOURCE_get())) {
                        if (Intrinsics.LJFF(str, NLEEditorJniJNI.NLEMonitor_KEY_API_MONITOR_THREAD_get())) {
                            Throwable thRemove = this.LIZ.LIZ.remove(JSONObjectProtectorUtils.getString(new JSONObject(str2), NLEEditorJniJNI.NLEMonitor_PARAM_UUID_get()));
                            if (thRemove == null) {
                                thRemove = new Throwable() { // from class: X.082V
                                    {
                                        StringBuilder sb = new StringBuilder();
                                        for (StackTraceElement stackTraceElement : getStackTrace()) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(stackTraceElement.getClassName());
                                            sbLIZ.append(' ');
                                            sbLIZ.append(stackTraceElement.getMethodName());
                                            sbLIZ.append('\n');
                                            sb.append(C2188811AlT.LIZIZ(sbLIZ));
                                        }
                                        int iHashCode = sb.toString().hashCode();
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("nleMultiThread_");
                                        sbLIZ2.append(iHashCode);
                                        StackTraceElement stackTraceElement2 = new StackTraceElement("com.bytedance.ies.nleeditor.NLEMultiThreadThrowable", C2188811AlT.LIZIZ(sbLIZ2), "NLE.NLEMultiThreadThrowable", iHashCode);
                                        StackTraceElement[] stackTraceElementArr = new StackTraceElement[getStackTrace().length + 1];
                                        stackTraceElementArr[0] = stackTraceElement2;
                                        System.arraycopy(getStackTrace(), 0, stackTraceElementArr, 1, getStackTrace().length);
                                        setStackTrace(stackTraceElementArr);
                                    }
                                };
                            }
                            HashMap map = new HashMap();
                            map.put("key", str);
                            map.put("msg", str2);
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2139808Zw(thRemove, str2, map, null), 3);
                            return;
                        }
                        if (Intrinsics.LJFF(str, NLEEditorJniJNI.NLEMonitor_KEY_API_MONITOR_CACHE_SAVE_get())) {
                            Throwable th = new Throwable() { // from class: X.082V
                                {
                                    StringBuilder sb = new StringBuilder();
                                    for (StackTraceElement stackTraceElement : getStackTrace()) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(stackTraceElement.getClassName());
                                        sbLIZ.append(' ');
                                        sbLIZ.append(stackTraceElement.getMethodName());
                                        sbLIZ.append('\n');
                                        sb.append(C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                    int iHashCode = sb.toString().hashCode();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("nleMultiThread_");
                                    sbLIZ2.append(iHashCode);
                                    StackTraceElement stackTraceElement2 = new StackTraceElement("com.bytedance.ies.nleeditor.NLEMultiThreadThrowable", C2188811AlT.LIZIZ(sbLIZ2), "NLE.NLEMultiThreadThrowable", iHashCode);
                                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[getStackTrace().length + 1];
                                    stackTraceElementArr[0] = stackTraceElement2;
                                    System.arraycopy(getStackTrace(), 0, stackTraceElementArr, 1, getStackTrace().length);
                                    setStackTrace(stackTraceElementArr);
                                }
                            };
                            this.LIZ.LIZ.put(JSONObjectProtectorUtils.getString(new JSONObject(str2), NLEEditorJniJNI.NLEMonitor_PARAM_UUID_get()), th);
                            return;
                        }
                        if (Intrinsics.LJFF(str, NLEEditorJniJNI.NLEMonitor_KEY_API_MONITOR_CACHE_CLEAN_get())) {
                            String string = JSONObjectProtectorUtils.getString(new JSONObject(str2), NLEEditorJniJNI.NLEMonitor_PARAM_UUID_get());
                            this.LIZ.LIZ.remove(string);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("NLEMonitor: threadCache size ");
                            sbLIZ.append(this.LIZ.LIZ.size());
                            sbLIZ.append(" remove uuid ");
                            sbLIZ.append(string);
                            C2188811AlT.LIZIZ(sbLIZ);
                            return;
                        }
                        if (!Intrinsics.LJFF(str, "resource_type_error") && !Intrinsics.LJFF(str, "compile_param_error")) {
                            return;
                        }
                        ?? r6 = new Throwable() { // from class: X.082W
                            {
                                StringBuilder sb = new StringBuilder();
                                for (StackTraceElement stackTraceElement : getStackTrace()) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(stackTraceElement.getClassName());
                                    sbLIZ2.append(' ');
                                    sbLIZ2.append(stackTraceElement.getMethodName());
                                    sbLIZ2.append('\n');
                                    sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                                }
                                int iHashCode = sb.toString().hashCode();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("nleParamError_");
                                sbLIZ3.append(iHashCode);
                                StackTraceElement stackTraceElement2 = new StackTraceElement("com.bytedance.ies.nleeditor.NLEParamError", C2188811AlT.LIZIZ(sbLIZ3), "NLE.NLEParamError", iHashCode);
                                StackTraceElement[] stackTraceElementArr = new StackTraceElement[getStackTrace().length + 1];
                                stackTraceElementArr[0] = stackTraceElement2;
                                System.arraycopy(getStackTrace(), 0, stackTraceElementArr, 1, getStackTrace().length);
                                setStackTrace(stackTraceElementArr);
                            }
                        };
                        HashMap map2 = new HashMap();
                        map2.put("key", str);
                        map2.put("msg", str2);
                        if (Intrinsics.LJFF(str, "resource_type_error")) {
                            str3 = "nle_resource_type_error";
                        } else {
                            str3 = "nle_compile_param_error";
                        }
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2139708Zv(str3, r6, str2, map2, null), 3);
                        return;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(str, str2);
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2140008Zy(linkedHashMap, null), 3);
                }
            });
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int LLL() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return (int) (((C389960FQs) c1463860oCG.getPlayerApi()).getCurrentPosition() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    @Override // X.InterfaceC1452170ntP
    public final void Se() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setSrcMaxHWRatio(2.4f);
    }

    @Override // X.InterfaceC1452170ntP
    public final void Xe() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C389960FQs) c1463860oCG.getPlayerApi()).recycleEngine();
    }

    @Override // X.InterfaceC1452170ntP
    public final void Xf() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setSurfaceReDraw(true);
    }

    @Override // X.InterfaceC1452170ntP
    public final List<VEAudioTrackIndex> Ye() {
        return new ArrayList();
    }

    @Override // X.InterfaceC1452170ntP
    public final String Zf() {
        commit();
        done();
        return store();
    }

    @Override // X.InterfaceC1452170ntP
    public final void ag() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).enableWatermarkMetadata(Boolean.TRUE);
    }

    @Override // X.InterfaceC1452170ntP
    public final int cancelGetVideoFrames() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).cancelGetVideoFrames();
    }

    @Override // X.InterfaceC1452170ntP
    public final void eg() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C389960FQs) c1463860oCG.getPlayerApi()).removeOnInfoListener(this.LJJIJIIJIL);
        this.LJJIJIIJI.clear();
    }

    @Override // X.InterfaceC1452170ntP
    public final int genRandomSolve() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463850oCF) c1463860oCG.getAlgorithmApi()).genRandomSolve();
    }

    @Override // X.InterfaceC1452170ntP
    public final int genSmartCutting() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463850oCF) c1463860oCG.getAlgorithmApi()).genSmartCutting();
    }

    @Override // X.InterfaceC1452170ntP
    public final List<VEClipAlgorithmParam> getAllVideoRangeData() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        VecNLEClipAlgorithmParam allVideoRangeData = ((C1463850oCF) c1463860oCG.getAlgorithmApi()).getAllVideoRangeData();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(allVideoRangeData, 10));
        for (NLEClipAlgorithmParam nLEClipAlgorithmParam : allVideoRangeData) {
            VEClipAlgorithmParam vEClipAlgorithmParam = new VEClipAlgorithmParam();
            vEClipAlgorithmParam.index = nLEClipAlgorithmParam.getIndex();
            vEClipAlgorithmParam.bingoEffect = nLEClipAlgorithmParam.getBingoEffect();
            vEClipAlgorithmParam.range = (int) nLEClipAlgorithmParam.getRange();
            vEClipAlgorithmParam.rotate = nLEClipAlgorithmParam.getRotate();
            vEClipAlgorithmParam.trimIn = (int) nLEClipAlgorithmParam.getTrimIn();
            vEClipAlgorithmParam.trimOut = (int) nLEClipAlgorithmParam.getTrimOut();
            arrayList.add(vEClipAlgorithmParam);
        }
        return arrayList;
    }

    @Override // X.InterfaceC1452170ntP
    public final String getCompileStuckResult() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463840oCE) c1463860oCG.getExporterApi()).getCompileStuckResult();
    }

    @Override // X.InterfaceC1452170ntP
    public final Bitmap getCurrDisplayImage() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).getCurrDisplayImage(-1);
    }

    @Override // X.InterfaceC1452170ntP
    public final VESize getInitSize() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        PairIntInt initSize = ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).getInitSize();
        return new VESize(initSize.getFirst(), initSize.getSecond());
    }

    @Override // X.InterfaceC1452170ntP
    public final float getPlayFps() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).getPlayFps();
    }

    @Override // X.InterfaceC1452170ntP
    public final VEEditor.VEState getState() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        NLEPlayerState nLEPlayerStateState = ((C389960FQs) c1463860oCG.getPlayerApi()).state();
        if (nLEPlayerStateState == null) {
            return null;
        }
        switch (C1778400wNa.LIZ[nLEPlayerStateState.ordinal()]) {
            case 1:
                return VEEditor.VEState.PREPARED;
            case 2:
                return VEEditor.VEState.STARTED;
            case 3:
                return VEEditor.VEState.PAUSED;
            case 4:
                return VEEditor.VEState.SEEKING;
            case 5:
                return VEEditor.VEState.STOPPED;
            case 6:
                return VEEditor.VEState.IDLE;
            default:
                return VEEditor.VEState.ANY;
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int getVEColorSpace() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).getVEColorSpace();
    }

    @Override // X.InterfaceC1452170ntP
    /* JADX INFO: renamed from: if */
    public final int mo51if() {
        C0E9H c0e9h = this.LJ;
        long duration = ((long) getDuration()) * 1000;
        Iterator<NLETrack> it2 = c0e9h.getModel().getTracks().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            if (next.getTrackType() == NLETrackType.EFFECT) {
                for (NLETrackSlot nLETrackSlot : next.getSlots()) {
                    if (NLESegmentTimeEffect.dynamicCast(nLETrackSlot.getMainSegment()) != null) {
                        int timeEffectType = (int) NLESegmentTimeEffect.dynamicCast(nLETrackSlot.getMainSegment()).getTimeEffectType();
                        if (timeEffectType == 2) {
                            duration -= (nLETrackSlot.getDuration() / ((long) 3)) * ((long) 2);
                        } else if (timeEffectType == 3) {
                            duration -= (long) (nLETrackSlot.getDuration() * 0.5f);
                        }
                    }
                }
            }
        }
        return (int) (duration / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    @Override // X.InterfaceC1452170ntP
    public final int initBingoAlgorithm() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463850oCF) c1463860oCG.getAlgorithmApi()).initBingoAlgorithm();
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean isUseFilterProcess() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).isUseFilterProcess();
    }

    @Override // X.InterfaceC1452170ntP
    public final void jf() {
        getBranch().clear();
    }

    @Override // X.InterfaceC1452170ntP
    public final void jg() {
        commit();
    }

    @Override // X.InterfaceC1452170ntP
    public final int lf() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463960oCQ) c1463860oCG.getFilterApi()).doLensOneKeyDetect();
    }

    @Override // X.InterfaceC1452170ntP
    public final void of() {
        done();
    }

    @Override // X.InterfaceC1452170ntP
    public final int pause() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C389960FQs) c1463860oCG.getPlayerApi()).pause();
    }

    @Override // X.InterfaceC1452170ntP
    public final void pauseCompile() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463840oCE) c1463860oCG.getExporterApi()).pauseCompile();
    }

    @Override // X.InterfaceC1452170ntP
    public final int prepare() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C389960FQs) c1463860oCG.getPlayerApi()).prepare();
    }

    @Override // X.InterfaceC1452170ntP
    public final int refreshCurrentFrame() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C389960FQs) c1463860oCG.getPlayerApi()).refreshCurrentFrame();
    }

    @Override // X.InterfaceC1452170ntP
    public final void releaseResource() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C389960FQs) c1463860oCG.getPlayerApi()).releaseResource();
    }

    @Override // X.InterfaceC1452170ntP
    public final int removeAllVideoSound() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463850oCF) c1463860oCG.getAlgorithmApi()).removeAllVideoSound();
    }

    @Override // X.InterfaceC1452170ntP
    public final int restoreAllVideoSound() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463850oCF) c1463860oCG.getAlgorithmApi()).restoreAllVideoSound();
    }

    @Override // X.InterfaceC1452170ntP
    public final void resumeCompile() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463840oCE) c1463860oCG.getExporterApi()).resumeCompile();
    }

    @Override // X.InterfaceC1452170ntP
    public final void stop() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C389960FQs) c1463860oCG.getPlayerApi()).stop();
    }

    @Override // X.InterfaceC1452170ntP
    public final int updateAlgorithmFromNormal() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463850oCF) c1463860oCG.getAlgorithmApi()).updateAlgorithmFromNormal();
    }

    @Override // X.InterfaceC1452170ntP
    public final int wf() {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setDestroyVersion(true);
    }

    public static void LJIIIIZZ() throws IllegalAccessException {
        StackTraceElement stackTraceElement = ThreadMethodProxy.getStackTrace(C786410Ut5.u3())[2];
        if (C2219091BtD.LIZIZ()) {
            throw new IllegalAccessException("nle call ve");
        }
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("nle call ve, method: ");
        sbLIZ.append(stackTraceElement);
        sbLIZ.append(" : ");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        interfaceC1463990oCTLIZLLL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean Hf() {
        NLESegment mainSegment;
        NLETrack next;
        NLETrackSlot slotByIndex;
        Iterator<NLETrack> it2 = LIZJ().getTracks().iterator();
        while (true) {
            mainSegment = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.getMainTrack()) {
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null && (slotByIndex = nLETrack.getSlotByIndex(0)) != null) {
            mainSegment = slotByIndex.getMainSegment();
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment);
        return (nLESegmentVideoDynamicCast == null || nLESegmentVideoDynamicCast.getCanvasStyle() == null) ? false : true;
    }

    @Override // X.InterfaceC1452170ntP
    public final String[] af() {
        C347500Djo c347500DjoLJJIFFI = LIZLLL().LIZLLL().LJJIFFI(EnumC356030DxZ.VIDEO);
        if (c347500DjoLJJIFFI == null) {
            return null;
        }
        return new String[]{c347500DjoLJJIFFI.LIZIZ};
    }

    @Override // X.InterfaceC1452170ntP
    public final void destroy() {
        LIZIZ().removeMessages(100);
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C389960FQs) c1463860oCG.getPlayerApi()).removeOnInfoListener(this.LJJIJIIJIL);
        this.LJJIJIIJI.clear();
        C1463860oCG c1463860oCG2 = this.LJI;
        if (c1463860oCG2 == null) {
            c1463860oCG2 = null;
        }
        ((C1464250oCt) c1463860oCG2.getEffectApi()).removeEffectMessageCenterCallback();
        C1463860oCG c1463860oCG3 = this.LJI;
        if (c1463860oCG3 == null) {
            c1463860oCG3 = null;
        }
        ((C389960FQs) c1463860oCG3.getPlayerApi()).destroy();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_nle_release_exporter_resource", true, false)) {
            C1463860oCG c1463860oCG4 = this.LJI;
            ((C0FRA) (c1463860oCG4 != null ? c1463860oCG4 : null).getExporterApi()).LIZIZ();
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final VEEditorModel ff() {
        NLEResourceNode effectSDKTransition;
        String resourceFile;
        NLEModel nLEModelLIZJ = LIZJ();
        VEEditorModel vEEditorModel = new VEEditorModel();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        VecNLETrackSPtr tracks = nLEModelLIZJ.getTracks();
        if (tracks != null) {
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getMainTrack() && nLETrack.getEnable()) {
                    for (NLETrackSlot nLETrackSlot : nLETrack.getSortedSlots()) {
                        arrayList.add(NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()).getAVFile().getResourceFile());
                        NLESegmentTransition endTransition = nLETrackSlot.getEndTransition();
                        if (endTransition != null && (effectSDKTransition = endTransition.getEffectSDKTransition()) != null && (resourceFile = effectSDKTransition.getResourceFile()) != null) {
                            arrayList3.add(resourceFile);
                        }
                    }
                }
                if (nLETrack.getTrackType() == NLETrackType.AUDIO) {
                    Iterator<NLETrackSlot> it2 = nLETrack.getSortedSlots().iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(NLESegmentAudio.dynamicCast(it2.next().getMainSegment()).getAVFile().getResourceFile());
                    }
                }
            }
        }
        float canvasRatio = nLEModelLIZJ.getCanvasRatio();
        vEEditorModel.videoOutRes = canvasRatio == 1.3333334f ? EnumC1464490oDH.VIDEO_OUT_RATIO_4_3 : canvasRatio == 0.75f ? EnumC1464490oDH.VIDEO_OUT_RATIO_3_4 : canvasRatio == 1.7777778f ? EnumC1464490oDH.VIDEO_OUT_RATIO_16_9 : canvasRatio == 0.5625f ? EnumC1464490oDH.VIDEO_OUT_RATIO_9_16 : canvasRatio == 1.0f ? EnumC1464490oDH.VIDEO_OUT_RATIO_1_1 : EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL;
        vEEditorModel.videoPaths = (String[]) arrayList.toArray(new String[0]);
        vEEditorModel.audioPaths = (String[]) arrayList2.toArray(new String[0]);
        vEEditorModel.transitions = (String[]) arrayList3.toArray(new String[0]);
        return vEEditorModel;
    }

    @Override // X.InterfaceC1452170ntP
    public final int getDuration() {
        LIZLLL();
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return (int) (((C389960FQs) c1463860oCG.getPlayerApi()).getDuration() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    @Override // X.InterfaceC1452170ntP
    public final long getHandler() throws IllegalAccessException {
        LJIIIIZZ();
        return -1;
    }

    @Override // X.InterfaceC1452170ntP
    public final int ng() {
        LIZLLL();
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        NLEModel nLEModel = c1463860oCG.LJFF;
        return (int) ((nLEModel != null ? nLEModel.getMaxTargetEndWithoutTimeEffect() : 0L) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }

    @Override // X.InterfaceC1452170ntP
    public final int play() {
        LIZIZ().removeMessages(100);
        C786410Ut5.LJLJJI(100, 100L, LIZIZ());
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C389960FQs) c1463860oCG.getPlayerApi()).play();
    }

    @Override // X.InterfaceC1452170ntP
    public final SurfaceView LJIJJLI() {
        return this.LJJI;
    }

    @Override // X.InterfaceC1452170ntP
    public final Rect LLJLLIL() {
        return this.LJJII;
    }

    @Override // X.InterfaceC1452170ntP
    public final Pair<Integer, Integer> getCanvasSize() {
        return this.LJJIFFI;
    }

    @Override // X.InterfaceC1452170ntP
    public final String getWorkspace() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1452170ntP
    public final InterfaceC349860Dnc yf() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1452170ntP
    public final void Af(final InterfaceC1464130oCh interfaceC1464130oCh) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C389960FQs) c1463860oCG.getPlayerApi()).releaseEngineUnitResourceAsync(new INLEListenerAsyncReleaseEngineUnitResource() { // from class: X.0oCU
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerAsyncReleaseEngineUnitResource
            public final void onReleaseEngineUnitResourceSuccess() {
                interfaceC1464130oCh.onReleaseEngineUnitResourceSuccess();
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerAsyncReleaseEngineUnitResource
            public final void onReleaseEngineUnitResourceError(int i) {
                interfaceC1464130oCh.LIZ();
            }
        });
    }

    @Override // X.InterfaceC1452170ntP
    public final int Bf(VEVideoEncodeSettings vEVideoEncodeSettings) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463840oCE) c1463860oCG.getExporterApi()).getCompileLevel(C1776260wK8.LJ(vEVideoEncodeSettings));
    }

    @Override // X.InterfaceC1452170ntP
    public final void Ef(Function1<? super Surface, Unit> function1) {
        if (this.LJJIJIL.isEmpty()) {
            C1463860oCG c1463860oCG = this.LJI;
            if (c1463860oCG == null) {
                c1463860oCG = null;
            }
            final CopyOnWriteArrayList<Function1<Surface, Unit>> copyOnWriteArrayList = this.LJJIJIL;
            ((C389960FQs) c1463860oCG.getPlayerApi()).LJJ = new INLEListenerSurfaceStatus() { // from class: X.0FPI
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSurfaceStatus
                public final void onSurfaceCreatedDone() {
                    Iterator<Function1<Surface, Unit>> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke(null);
                    }
                }
            };
        }
        if (!LIZ(this.LJJIJIL, function1)) {
            this.LJJIJIL.add(function1);
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void Ff(boolean z) {
        this.LJIJ = z;
    }

    @Override // X.InterfaceC1452170ntP
    public final void Gf(InterfaceC1464200oCo interfaceC1464200oCo) {
        this.LJJIJIIJI.remove(interfaceC1464200oCo);
    }

    @Override // X.InterfaceC1452170ntP
    public final void Jf(final C1435820nT2 c1435820nT2) {
        this.LJIIIZ = true;
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setEncoderByteBufferListener(new INLEListenerByteBufferEncoder() { // from class: X.0oCV
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerByteBufferEncoder
            public final void onEncoderDataAvailable(ByteBuffer byteBuffer, long j, int i, boolean z) {
                InterfaceC1464160oCk interfaceC1464160oCk = c1435820nT2;
                if (interfaceC1464160oCk != null) {
                    interfaceC1464160oCk.onEncoderDataAvailable(byteBuffer, j, i, z);
                }
            }
        });
    }

    @Override // X.InterfaceC1452170ntP
    public final void Kf(NLECommitStatisticsConfig nLECommitStatisticsConfig) {
        if (this.LJIIL) {
            return;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        arrayList.addAll(nLECommitStatisticsConfig.diffDurationList);
        arrayList.add(Long.MAX_VALUE);
        this.LJIILIIL = arrayList;
        ArrayList<Long> arrayList2 = new ArrayList<>();
        arrayList2.addAll(nLECommitStatisticsConfig.renderDurationList);
        arrayList2.add(Long.MAX_VALUE);
        this.LJIILJJIL = arrayList2;
        ArrayList<Long> arrayList3 = this.LJIILIIL;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            ArrayList arrayList4 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList4.add(0);
            }
            this.LJIILL = arrayList4;
            ArrayList<Long> arrayList5 = this.LJIILJJIL;
            if (arrayList5 != null) {
                int size2 = arrayList5.size();
                ArrayList arrayList6 = new ArrayList(size2);
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList6.add(0);
                }
                this.LJIILLIIL = arrayList6;
                this.LJIIL = true;
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJ(long j) {
        if (!this.LJIIL) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        this.LJIIJJI = jCurrentTimeMillis;
        LJFF(this.LJIILJJIL, this.LJIILLIIL, jCurrentTimeMillis);
    }

    public final int LJII(float f) {
        C0E9H c0e9h = this.LJ;
        if (f > 3.0f) {
            f = 3.0f;
        }
        VecNLETrackSPtr tracks = c0e9h.getModel().getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                it2.next().setSpeed(f);
            }
        }
        c0e9h.commit();
        return 0;
    }

    @Override // X.InterfaceC1452170ntP
    public final void Pe(Boolean bool) {
        LIZLLL().LJIIIZ().Pe(bool);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Te(int i) {
        INLEMediaSession iNLEMediaSession;
        INLEMediaRuntime mediaRuntimeApi;
        C348100Dkm c348100DkmLIZLLL = LIZLLL();
        if (c348100DkmLIZLLL == null || (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) == null || (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) == null) {
            return 0;
        }
        return (int) (mediaRuntimeApi.mapOriginalPositionToTimeEffectPosition(((double) i) / 1000.0d, 0) * 1000.0d);
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean Uf(VEVideoEncodeSettings vEVideoEncodeSettings) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463840oCE) c1463860oCG.getExporterApi()).isEnableRemuxVideo(C1776260wK8.LJ(vEVideoEncodeSettings));
    }

    @Override // X.InterfaceC1452170ntP
    public final void Ve(NLEModel nLEModel) {
        setModel(nLEModel);
    }

    @Override // X.InterfaceC1452170ntP
    public final void We(InterfaceC1464190oCn interfaceC1464190oCn) {
        if (this.LJJIIJZLJL.isEmpty()) {
            C1463860oCG c1463860oCG = this.LJI;
            if (c1463860oCG == null) {
                c1463860oCG = null;
            }
            ((C389960FQs) c1463860oCG.getPlayerApi()).setFirstFrameListener(this.LJJIIZ);
        }
        if (!LIZ(this.LJJIIJZLJL, interfaceC1464190oCn)) {
            this.LJJIIJZLJL.add(interfaceC1464190oCn);
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void Ze(ARunnableS119S0100000_19 aRunnableS119S0100000_19) {
        this.LIZLLL = aRunnableS119S0100000_19;
    }

    @Override // X.InterfaceC1452170ntP
    public final NLEModel bf(boolean z) {
        NLENode nLENodeDeepClone;
        NLEModel model = getModel();
        if (model == null) {
            return null;
        }
        if (z) {
            nLENodeDeepClone = model.getStage();
        } else {
            nLENodeDeepClone = model.deepClone();
        }
        return NLEModel.dynamicCast(nLENodeDeepClone);
    }

    @Override // X.InterfaceC1452170ntP
    public final int cancelGenVideoFrame(int i) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463850oCF) c1463860oCG.getAlgorithmApi()).cancelGenVideoFrame(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final void cg(InterfaceC1464120oCg interfaceC1464120oCg) {
        if (((ArrayList) this.LJJIII).contains(interfaceC1464120oCg)) {
            return;
        }
        ((ArrayList) this.LJJIII).add(interfaceC1464120oCg);
        LIZIZ().removeMessages(100);
        C786410Ut5.LJLJJI(100, 100L, LIZIZ());
    }

    @Override // X.InterfaceC1452170ntP
    public final void df(InterfaceC1464200oCo interfaceC1464200oCo) {
        if (this.LJJIJIIJI.isEmpty()) {
            C1463860oCG c1463860oCG = this.LJI;
            if (c1463860oCG == null) {
                c1463860oCG = null;
            }
            INLEPlayer.DefaultImpls.addOnInfoListener$default(c1463860oCG.getPlayerApi(), this.LJJIJIIJIL, false, 2, null);
        }
        if (!LIZ(this.LJJIJIIJI, interfaceC1464200oCo)) {
            this.LJJIJIIJI.add(interfaceC1464200oCo);
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final void dg(Function1<? super Surface, Unit> function1) {
        this.LJJIJIL.remove(function1);
    }

    @Override // X.InterfaceC1452170ntP
    public final void enableEffect(boolean z) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).enableEffect(z);
    }

    @Override // X.InterfaceC1452170ntP
    public final void enableSimpleProcessor(boolean z) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).enableSimpleProcessor(z);
    }

    @Override // X.InterfaceC1452170ntP
    public final float getColorFilterIntensity(String str) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463960oCQ) c1463860oCG.getFilterApi()).getColorFilterIntensity(str);
    }

    @Override // X.InterfaceC1452170ntP
    public final Bitmap getCurrDisplayImage(int i) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).getCurrDisplayImage(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final void hf(InterfaceC1464200oCo interfaceC1464200oCo) {
        if (this.LJJIIZI.isEmpty()) {
            C1463860oCG c1463860oCG = this.LJI;
            if (c1463860oCG == null) {
                c1463860oCG = null;
            }
            ((C389960FQs) c1463860oCG.getPlayerApi()).setOnErrorListener(this.LJJIJ);
            if (!LIZ(this.LJJIIZI, interfaceC1464200oCo)) {
                this.LJJIIZI.add(interfaceC1464200oCo);
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int hg(AbstractC574600MgE abstractC574600MgE) throws IllegalAccessException {
        LJIIIIZZ();
        return -1;
    }

    @Override // X.InterfaceC1452170ntP
    public final int ig(int[] iArr) throws IllegalAccessException {
        LJIIIIZZ();
        return -1;
    }

    @Override // X.InterfaceC1452170ntP
    public final int kf(VEVideoEncodeSettings vEVideoEncodeSettings) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463840oCE) c1463860oCG.getExporterApi()).getRemuxErrorCode(C1776260wK8.LJ(vEVideoEncodeSettings));
    }

    @Override // X.InterfaceC1452170ntP
    public final void kg(final C12D6 c12d6) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C389960FQs) c1463860oCG.getPlayerApi()).setVideoOutputListener(new INLEListenerVideoOutput() { // from class: X.0oCe
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
            public final void onRefresh(int i, long j) {
                c12d6.LIZ(i, (int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            }
        });
    }

    @Override // X.InterfaceC1452170ntP
    public final int mf(int i) {
        INLEMediaSession iNLEMediaSession;
        INLEMediaRuntime mediaRuntimeApi;
        C348100Dkm c348100DkmLIZLLL = LIZLLL();
        if (c348100DkmLIZLLL != null && (iNLEMediaSession = c348100DkmLIZLLL.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null) {
            return (int) (mediaRuntimeApi.mapTimeEffectPositionToOriginalPosition(((double) i) / 1000.0d) * 1000.0d);
        }
        return 0;
    }

    @Override // X.InterfaceC1452170ntP
    public final void mg(Bitmap bitmap) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setPreviewSurfaceImage(bitmap);
    }

    @Override // X.InterfaceC1452170ntP
    public final void pf(String str) {
        if (str != null && (!a0.LJJJIL(str))) {
            restore(str);
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean qf(NLEModel nLEModel) {
        setModel(nLEModel);
        boolean zCommit = commit();
        boolean zDone = done();
        if (zCommit && zDone) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1452170ntP
    public final void setBackgroundColor(int i) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setBackgroundColor(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final void setHeightWidthRatio(float f) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setHeightWidthRatio(f);
    }

    @Override // X.InterfaceC1452170ntP
    public final int setInfoStickerRestoreMode(int i) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1EQC) c1463860oCG.getStickerApi()).setInfoStickerRestoreMode(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final void setLoopPlay(boolean z) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setLoopPlay(z);
    }

    @Override // X.InterfaceC1452170ntP
    public final void setPageMode(int i) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setPageMode(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final int setPreviewFps(int i) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setPreviewFps(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final int setPreviewMaxFps(int i) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setPreviewMaxFps(i);
    }

    @Override // X.InterfaceC1452170ntP
    public final void setPreviewSurfaceTexDesc(String str) {
        C1463860oCG c1463860oCG = this.LJI;
        C1463860oCG c1463860oCG2 = null;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setPreviewFillMode(NLEPlayerPreviewMode.FILL);
        C1463860oCG c1463860oCG3 = this.LJI;
        if (c1463860oCG3 != null) {
            c1463860oCG2 = c1463860oCG3;
        }
        ((C1463950oCP) c1463860oCG2.getMediaRuntimeApi()).setPreviewSurfaceTexDesc(str);
    }

    @Override // X.InterfaceC1452170ntP
    public final void setReuseFirstAVFileInfo(boolean z) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        c1463860oCG.setReuseFirstAVFileInfo(false);
    }

    @Override // X.InterfaceC1452170ntP
    public final void sf(final InterfaceC1464170oCl interfaceC1464170oCl) {
        this.LJIIIZ = true;
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setEncoderListener(new INLEListenerEncoder() { // from class: X.0oCS
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerEncoder
            public final void onEncoderDataAvailable(byte[] bArr, long j, int i, boolean z) {
                InterfaceC1464170oCl interfaceC1464170oCl2 = interfaceC1464170oCl;
                if (interfaceC1464170oCl2 != null) {
                    interfaceC1464170oCl2.onEncoderDataAvailable(bArr, j, i, z);
                }
            }
        });
    }

    @Override // X.InterfaceC1452170ntP
    public final void updateSurfaceView(SurfaceView surfaceView) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        c1463860oCG.updateSurfaceView(surfaceView);
    }

    @Override // X.InterfaceC1452170ntP
    public final int xf(boolean z) {
        LIZLLL().LIZLLL().LJIIIZ(z);
        return 0;
    }

    @Override // X.InterfaceC1452170ntP
    public final void yc(NLEModel nLEModel) {
        setModel(nLEModel);
        commit();
        done();
    }

    @Override // X.InterfaceC1452170ntP
    public final void zf(boolean z) {
        this.LJIIJ = z;
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
        int length = c1463750oC5.LIZ.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = true;
        }
        return Re(zArr, c1463750oC5, z);
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean Mf(String str, VEVideoEncodeSettings vEVideoEncodeSettings) throws Exception {
        String watermarkStr;
        String absolutePath;
        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ASNLEEditor compile：outFilePath: ");
        sbLIZ.append(str);
        sbLIZ.append(", outWav: ");
        C1463860oCG c1463860oCG = null;
        sbLIZ.append((String) null);
        sbLIZ.append(", settings: ");
        sbLIZ.append(vEVideoEncodeSettings);
        sbLIZ.append(", enableUploadingWhileCompile: ");
        sbLIZ.append(this.LJIIIZ);
        interfaceC1463990oCTLIZLLL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && !Intrinsics.LJFF(a0.LJLIIIL(str).toString(), "")) {
            if (C2219091BtD.LIZIZ()) {
                C1463860oCG c1463860oCG2 = this.LJI;
                if (c1463860oCG2 == null) {
                    c1463860oCG2 = null;
                }
                INLEExporter exporterApi = c1463860oCG2.getExporterApi();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                File externalFilesDir = C2219091BtD.LIZ().getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    absolutePath = externalFilesDir.getAbsolutePath();
                } else {
                    absolutePath = null;
                }
                sbLIZ2.append(absolutePath);
                sbLIZ2.append("/nle_compile_dump");
                ((C1463840oCE) exporterApi).setCompileDumpFilePath(C2188811AlT.LIZIZ(sbLIZ2));
            }
            NLEVideoEncodeSettings nLEVideoEncodeSettingsLJ = C1776260wK8.LJ(vEVideoEncodeSettings);
            NLEVideoInvisibleWatermark mVideoInvisibleWatermark = nLEVideoEncodeSettingsLJ.getMVideoInvisibleWatermark();
            if (mVideoInvisibleWatermark != null) {
                watermarkStr = mVideoInvisibleWatermark.getWatermarkStr();
            } else {
                watermarkStr = null;
            }
            if (C123100dR.LIZ(watermarkStr)) {
                nLEVideoEncodeSettingsLJ.setEnableInvisibleWatermark(true);
            }
            nLEVideoEncodeSettingsLJ.setEnableUploadingWhileCompile(this.LJIIIZ);
            nLEVideoEncodeSettingsLJ.setEnableMainTrackSourceMediaInfo(this.LJIIJ);
            C1463860oCG c1463860oCG3 = this.LJI;
            if (c1463860oCG3 != null) {
                c1463860oCG = c1463860oCG3;
            }
            return ((C1463840oCE) c1463860oCG.getExporterApi()).compile(str, nLEVideoEncodeSettingsLJ);
        }
        throw new Exception("outFilePath is invalid");
    }

    @Override // X.InterfaceC1452170ntP
    public final int Nf(int i, final InterfaceC1464150oCj interfaceC1464150oCj) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463850oCF) c1463860oCG.getAlgorithmApi()).beginGenVideoFrames(i, new INLEListenerBeginVideoFrame() { // from class: X.0oCc
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerBeginVideoFrame
            public final void onProgress(float f) {
                InterfaceC1464150oCj interfaceC1464150oCj2 = interfaceC1464150oCj;
                if (interfaceC1464150oCj2 != null) {
                    interfaceC1464150oCj2.onProgress(f);
                }
            }
        });
    }

    @Override // X.InterfaceC1452170ntP
    public final void Pf(int i, int i2) {
        this.LJJIFFI = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // X.InterfaceC1452170ntP
    public final int Rf(int i, VEEditor.SET_RANGE_MODE set_range_mode) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return C1463690oBz.LIZLLL(c1463860oCG, 0, i, set_range_mode);
    }

    @Override // X.InterfaceC1452170ntP
    public final void Tf(int i, int i2) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setMaxWidthAndHeight(i, i2);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Ue(int i, final InterfaceC1464140oCi interfaceC1464140oCi) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C389960FQs) c1463860oCG.getPlayerApi()).seekWithFrame(((long) i) * 1000, -1, new INLEListenerGetImage() { // from class: X.0oCL
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerGetImage
            public final int onGetImageData(byte[] bArr, int i2, int i3, int i4, float f) {
                return interfaceC1464140oCi.onGetImageData(bArr, i2, i3, i4, f);
            }
        });
    }

    @Override // X.InterfaceC1452170ntP
    public final void Vf(int i, int i2) {
        if (ef(i, i2)) {
            commit();
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int Wf(int i, ROTATE_DEGREE rotate_degree) throws IllegalAccessException {
        LJIIIIZZ();
        return -1;
    }

    @Override // X.InterfaceC1452170ntP
    public final int addMetadata(String str, String str2) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).addMetadata(str, str2);
    }

    @Override // X.InterfaceC1452170ntP
    public final int bg(int i, final InterfaceC1464140oCi interfaceC1464140oCi) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C389960FQs) c1463860oCG.getPlayerApi()).seekWithFrameStable(((long) i) * 1000, new INLEListenerGetImage() { // from class: X.0oCN
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerGetImage
            public final int onGetImageData(byte[] bArr, int i2, int i3, int i4, float f) {
                return interfaceC1464140oCi.onGetImageData(bArr, i2, i3, i4, f);
            }
        });
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean ef(int i, int i2) {
        boolean z;
        boolean z2;
        float f = i / i2;
        float canvasRatio = getModel().getCanvasRatio();
        if (f == canvasRatio) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !z;
        Integer numLJ = C348350DlB.LJ(getModel());
        if (numLJ != null && numLJ.intValue() == i) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z3) {
            InterfaceC349870Dnd interfaceC349870Dnd = this.LIZJ;
            if (interfaceC349870Dnd != null) {
                interfaceC349870Dnd.LIZ(this, f, canvasRatio);
            }
            getModel().setCanvasRatio(f);
        }
        if (z2) {
            C348350DlB.LJIIJJI(getModel(), i);
        }
        if (!z3 && !z2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1452170ntP
    public final int fg(int i, int i2) {
        return C347200DjK.LIZIZ(this.LJ, i, i2, true);
    }

    @Override // X.InterfaceC1452170ntP
    public final VESize getInitSize(int i, int i2) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        PairIntInt initSize = ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).getInitSize(i, i2);
        return new VESize(initSize.getFirst(), initSize.getSecond());
    }

    @Override // X.InterfaceC1452170ntP
    public final int nf(int i, VEEditor.SEEK_MODE seek_mode) {
        LIZIZ().removeMessages(100);
        C786410Ut5.LJLILLLLZI(LIZIZ(), 100);
        NLESeekFlag nLESeekFlagLIZJ = C1463690oBz.LIZJ(seek_mode);
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C389960FQs) c1463860oCG.getPlayerApi()).seekTime(((long) i) * 1000, nLESeekFlagLIZJ);
    }

    @Override // X.InterfaceC1452170ntP
    public final int setInfoStickerAlpha(int i, float f) throws IllegalAccessException {
        LJIIIIZZ();
        return -1;
    }

    @Override // X.InterfaceC1452170ntP
    public final int setPreviewFps(int i, boolean z) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setPreviewFps(i, z);
    }

    @Override // X.InterfaceC1452170ntP
    public final void setSmartRecodeParam(boolean z, int i) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463840oCE) c1463860oCG.getExporterApi()).setSmartRecodeParam(z, i);
    }

    @Override // X.InterfaceC1452170ntP
    public final int uf(int i, int i2) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return C1463690oBz.LIZLLL(c1463860oCG, i, i2, VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED);
    }

    @Override // X.InterfaceC1452170ntP
    public final int updateTrackFilterParam(int i, VEBaseFilterParam vEBaseFilterParam) throws IllegalAccessException {
        LJIIIIZZ();
        return -1;
    }

    public static void LJFF(ArrayList arrayList, List list, long j) {
        int i = 0;
        if (arrayList != null && !arrayList.isEmpty() && list != null && !((ArrayList) list).isEmpty()) {
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (j < ((Number) obj).longValue()) {
                        ArrayList arrayList2 = (ArrayList) list;
                        if (i < arrayList2.size()) {
                            ListProtector.set(arrayList2, i, Integer.valueOf(((Number) ListProtector.get(arrayList2, i)).intValue() + 1));
                            return;
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int Cf(int i, int i2, final InterfaceC1464140oCi interfaceC1464140oCi) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C389960FQs) c1463860oCG.getPlayerApi()).seekWithFrame(((long) i) * 1000, i2, new INLEListenerGetImage() { // from class: X.0oCM
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerGetImage
            public final int onGetImageData(byte[] bArr, int i3, int i4, int i5, float f) {
                return interfaceC1464140oCi.onGetImageData(bArr, i3, i4, i5, f);
            }
        });
    }

    @Override // X.InterfaceC1452170ntP
    public final void Df(int i, int i2, int i3) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setImageResizeInfo(i, i2, NLEResFillMode.swigToEnum(i3), NLEResizeAlgorithm.swigToEnum(0));
    }

    @Override // X.InterfaceC1452170ntP
    public final int Oe(int i, int i2, VEBaseFilterParam vEBaseFilterParam) throws IllegalAccessException {
        LJIIIIZZ();
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0565  */
    @Override // X.InterfaceC1452170ntP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Re(boolean[] r33, X.C1463750oC5 r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 1851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1463670oBx.Re(boolean[], X.0oC5, boolean):int");
    }

    @Override // X.InterfaceC1452170ntP
    public final int Yf(int i, VEEditor.SEEK_MODE seek_mode, InterfaceC1464180oCm interfaceC1464180oCm) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        NLESeekFlag nLESeekFlagLIZJ = C1463690oBz.LIZJ(seek_mode);
        return ((C389960FQs) c1463860oCG.getPlayerApi()).seekTime(((long) i) * 1000, nLESeekFlagLIZJ, new C1466730oGt(interfaceC1464180oCm, 1));
    }

    @Override // X.InterfaceC1452170ntP
    public final int cf(VETimelineParams vETimelineParams, int i, int i2) {
        int iLIZJ = C347200DjK.LIZJ(this.LJ, vETimelineParams, true, -1, false);
        uf(i, i2);
        return iLIZJ;
    }

    @Override // X.InterfaceC1452170ntP
    public final void gf(Function0 function0, boolean z, boolean z2) {
        C1463860oCG c1463860oCG;
        INLEPlayer playerApi;
        C1463860oCG c1463860oCG2;
        INLEPlayer playerApi2;
        boolean zLIZ = C255700A0i.LIZ();
        if (zLIZ && (c1463860oCG2 = this.LJI) != null && (playerApi2 = c1463860oCG2.getPlayerApi()) != null) {
            C389960FQs c389960FQs = (C389960FQs) playerApi2;
            c389960FQs.skipNextSeek(true);
            c389960FQs.setSkipSeekBlock(AFwS210S0000000_22.get$arr$(33));
        }
        if (C0BIX.LIZ()) {
            this.LJIIZILJ = true;
            function0.invoke();
            if (!z) {
                this.LJIIZILJ = false;
                commit();
            }
        } else {
            this.LJIIZILJ = false;
            function0.invoke();
        }
        if (zLIZ && !z && (c1463860oCG = this.LJI) != null && (playerApi = c1463860oCG.getPlayerApi()) != null) {
            C389960FQs c389960FQs2 = (C389960FQs) playerApi;
            c389960FQs2.skipNextSeek(false);
            c389960FQs2.LJJIIZI = null;
            if (z2) {
                c389960FQs2.seekTime(0L, NLESeekFlag.EDITOR_SEEK_FLAG_LastSeek, new C1466730oGt(this, 0));
                c389960FQs2.play();
            }
        }
    }

    @Override // X.InterfaceC1452170ntP
    public final int gg(int i, ArrayList arrayList, ArrayList arrayList2) {
        NLETrack next;
        NLEResType nLEResType;
        boolean z;
        C0E9H c0e9h = this.LJ;
        Iterator<NLETrack> it2 = c0e9h.getModel().getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLETrack nLETrack = next;
                if (nLETrack.getTrackType() == NLETrackType.VIDEO && nLETrack.getMainTrack() && nLETrack.getEnable()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack2 = next;
        if (nLETrack2 != null) {
            int i2 = 0;
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    VEClipSourceParam vEClipSourceParam = (VEClipSourceParam) obj;
                    NLETrackSlot nLETrackSlot = new NLETrackSlot();
                    NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                    NLEResourceAV nLEResourceAV = new NLEResourceAV();
                    nLEResourceAV.setResourceFile(vEClipSourceParam.clipFilePath);
                    if (C2286708xd.LJIILL(vEClipSourceParam.clipFilePath)) {
                        nLEResType = NLEResType.IMAGE;
                    } else {
                        nLEResType = NLEResType.VIDEO;
                    }
                    nLEResourceAV.setResourceType(nLEResType);
                    nLEResourceAV.setWidth(vEClipSourceParam.clipWidth);
                    nLEResourceAV.setHeight(vEClipSourceParam.clipHeight);
                    if (nLEResourceAV.getResourceType() == NLEResType.VIDEO && (!VEUtils.getAudioFileInfoForAllTracks(vEClipSourceParam.clipFilePath).isEmpty())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nLEResourceAV.setHasAudio(z);
                    nLESegmentVideo.setAVFile(nLEResourceAV);
                    nLESegmentVideo.setTimeClipStart(((long) ((VEClipTimelineParam) ListProtector.get(arrayList2, i2)).trimIn) * 1000);
                    nLESegmentVideo.setTimeClipEnd(((long) ((VEClipTimelineParam) ListProtector.get(arrayList2, i2)).trimOut) * 1000);
                    nLESegmentVideo.setSpeed((float) ((VEClipTimelineParam) ListProtector.get(arrayList2, i2)).speed);
                    nLETrackSlot.setMainSegment(nLESegmentVideo);
                    nLETrack2.addSlotAtIndex(nLETrackSlot, i);
                    i++;
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c0e9h.commit();
            return 0;
        }
        return -1;
    }

    @Override // X.InterfaceC1452170ntP
    public final int vf(VEImageTransformFilterParam vEImageTransformFilterParam, int i, int i2) throws IllegalAccessException {
        LJIIIIZZ();
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0oCJ] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0oCA] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0oCB] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0E9H, com.bytedance.ies.nle.editor_jni.NLEEditor] */
    public C1463670oBx(String str, TextureView textureView, EnumC1464030oCX enumC1464030oCX, EnumC1442010nd1 enumC1442010nd1) {
        this.LIZ = new LinkedHashMap();
        this.LJIIJJI = -1L;
        this.LJIJJLI = new C0E9E();
        C0FGC.LIZ(2);
        NLE nle = NLE.INSTANCE;
        nle.setLogger(new NLELoggerListener() { // from class: X.0oC3
            @Override // com.bytedance.ies.nle.editor_jni.NLELoggerListener
            public final void onLog(LogLevel logLevel, String str2) {
                int i;
                if (logLevel == null) {
                    i = -1;
                } else {
                    i = C560120Lxy.LIZ[logLevel.ordinal()];
                    if (i == 1) {
                        return;
                    }
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("NLE ");
                                sbLIZ.append(str2);
                                interfaceC1463990oCTLIZLLL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                                return;
                            }
                            return;
                        }
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("NLE ");
                        sbLIZ2.append(str2);
                        interfaceC1463990oCTLIZLLL2.w(C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL3 = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("NLE ");
                    sbLIZ3.append(str2);
                    interfaceC1463990oCTLIZLLL3.i(C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL4 = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("NLE ");
                sbLIZ4.append(str2);
                interfaceC1463990oCTLIZLLL4.d(C2188811AlT.LIZIZ(sbLIZ4));
            }
        });
        nle.setLogLevel(LogLevel.LEVEL_DEBUG);
        ?? r3 = new NLEEditor() { // from class: X.0E9H
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final boolean commit() throws Throwable {
                long jCurrentTimeMillis;
                Function1<? super NLEModel, Unit> function1;
                if (this.LIZ.LJIJJ) {
                    return super.commit();
                }
                boolean z = false;
                if (C0BIX.LIZ() && this.LIZ.LJIIZILJ) {
                    return true;
                }
                C1463670oBx c1463670oBx = this.LIZ;
                c1463670oBx.getClass();
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("template_async_render_anr_fix_switch", false)) {
                    C1463860oCG c1463860oCG = c1463670oBx.LJI;
                    if (c1463860oCG == null) {
                        c1463860oCG = null;
                    }
                    NLEMediaConfig mediaConfig = c1463860oCG.getMediaConfig();
                    if (C1452960nug.LJIIL) {
                        NLETrack mainTrack = c1463670oBx.LIZJ().getMainTrack();
                        if (Intrinsics.LJFF(mainTrack != null ? mainTrack.getExtra("async_render") : null, "async_render")) {
                            z = true;
                        }
                    }
                    mediaConfig.setEnableResourceAsyncRender(z);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ASYNC_RENDER: NLE commit setNLEAsyncRenderFlag NLEMediaAbConfig enableResourceAsyncRender=");
                C1463860oCG c1463860oCG2 = c1463670oBx.LJI;
                if (c1463860oCG2 == null) {
                    c1463860oCG2 = null;
                }
                sbLIZ.append(c1463860oCG2.getMediaConfig().getEnableResourceAsyncRender());
                sbLIZ.append(", NLEGlobalConfig enableResourceAsyncRender=");
                sbLIZ.append(C1452960nug.LJIIL);
                sbLIZ.append(", NLEModel enableAsyncRender=");
                NLETrack mainTrack2 = c1463670oBx.LIZJ().getMainTrack();
                sbLIZ.append(Intrinsics.LJFF(mainTrack2 != null ? mainTrack2.getExtra("async_render") : null, "async_render"));
                C2188811AlT.LIZIZ(sbLIZ);
                C1463670oBx c1463670oBx2 = this.LIZ;
                if (!c1463670oBx2.LJFF && (function1 = C1452960nug.LJIILIIL) != null) {
                    function1.invoke(c1463670oBx2.LIZJ());
                }
                C1463670oBx c1463670oBx3 = this.LIZ;
                Throwable th = c1463670oBx3.LJII;
                if (th != null) {
                    throw th;
                }
                NLETrack mainTrack3 = c1463670oBx3.LIZJ().getMainTrack();
                if (Intrinsics.LJFF(mainTrack3 != null ? mainTrack3.getExtra("business") : null, "cutsame") && c1463670oBx3.LJJIFFI.getFirst().intValue() > 0 && c1463670oBx3.LJJIFFI.getSecond().intValue() > 0) {
                    c1463670oBx3.Vf(c1463670oBx3.LJJIFFI.getFirst().intValue(), c1463670oBx3.LJJIFFI.getSecond().intValue());
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                boolean zCommit = super.commit();
                C1463670oBx c1463670oBx4 = this.LIZ;
                if (c1463670oBx4.LJIIL) {
                    if (c1463670oBx4.LJIIJJI >= 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                        jCurrentTimeMillis2 = c1463670oBx4.LJIIJJI;
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    c1463670oBx4.LJIIJJI = -1L;
                    C1463670oBx.LJFF(c1463670oBx4.LJIILIIL, c1463670oBx4.LJIILL, jCurrentTimeMillis - jCurrentTimeMillis2);
                }
                return zCommit;
            }

            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final void addConsumer(NLEEditorListener nLEEditorListener) {
                C0E9D c0e9d = this.LIZ.LJIL;
                if (c0e9d != null && c0e9d.LIZ(nLEEditorListener)) {
                    return;
                }
                this.LIZ.LJIJJLI.LIZ.add(nLEEditorListener);
                super.addConsumer(nLEEditorListener);
            }

            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final void removeConsumer(NLEEditorListener nLEEditorListener) {
                C0E9D c0e9d = this.LIZ.LJIL;
                if (c0e9d != null && c0e9d.LIZIZ(nLEEditorListener)) {
                    return;
                }
                this.LIZ.LJIJJLI.LIZ.remove(nLEEditorListener);
                super.removeConsumer(nLEEditorListener);
            }

            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final void setBranchListener(NLEBranchListener nLEBranchListener) {
                C1463670oBx c1463670oBx = this.LIZ;
                C0E9D c0e9d = c1463670oBx.LJIL;
                if (c0e9d != null) {
                    c0e9d.LIZ.LIZJ = nLEBranchListener;
                } else {
                    c1463670oBx.LJIJJLI.LIZJ = nLEBranchListener;
                    super.setBranchListener(nLEBranchListener);
                }
            }

            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final void setListener(NLEEditorListener nLEEditorListener) {
                C1463670oBx c1463670oBx = this.LIZ;
                C0E9D c0e9d = c1463670oBx.LJIL;
                if (c0e9d != null) {
                    c0e9d.LIZ.LIZIZ = nLEEditorListener;
                } else {
                    c1463670oBx.LJIJJLI.LIZIZ = nLEEditorListener;
                    super.setListener(nLEEditorListener);
                }
            }
        };
        this.LJ = r3;
        this.LJIIIIZZ = new C349850Dnb(new AwS549S0100000_5(this, 43));
        this.LJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 44));
        this.LJJIFFI = new Pair<>(0, 0);
        this.LJJII = new Rect();
        this.LJJIII = new ArrayList();
        this.LJJIIJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 36));
        this.LJJIIJZLJL = new CopyOnWriteArrayList<>();
        this.LJJIIZ = new INLEListenerFirstFrame() { // from class: X.0oCJ
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame
            public final void onRendered() {
                this.LIZ.getClass();
                Iterator<InterfaceC1464190oCn> it2 = this.LIZ.LJJIIJZLJL.iterator();
                while (it2.hasNext()) {
                    it2.next().onRendered();
                }
            }
        };
        this.LJJIIZI = new CopyOnWriteArrayList<>();
        this.LJJIJ = new INLEListenerCommon() { // from class: X.0oCA
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
            public final void onCallback(int i, int i2, float f, String str2) {
                Iterator<InterfaceC1464200oCo> it2 = this.LIZ.LJJIIZI.iterator();
                while (it2.hasNext()) {
                    it2.next().onCallback(i, i2, f, str2);
                }
            }
        };
        this.LJJIJIIJI = new CopyOnWriteArrayList<>();
        this.LJJIJIIJIL = new INLEListenerCommon() { // from class: X.0oCB
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
            public final void onCallback(int i, int i2, float f, String str2) {
                Iterator<InterfaceC1464200oCo> it2 = this.LIZ.LJJIJIIJI.iterator();
                while (it2.hasNext()) {
                    it2.next().onCallback(i, i2, f, str2);
                }
            }
        };
        this.LJJIJIL = new CopyOnWriteArrayList<>();
        this.LIZIZ = str;
        this.LJJI = null;
        this.LIZJ = null;
        enumC1464030oCX.getValue();
        enumC1442010nd1.getValue();
        NLEMediaConfig nLEMediaConfigLIZIZ = C1463690oBz.LIZIZ(str, "");
        C1419820n3E.LIZ.LIZ();
        C1463860oCG c1463860oCG = new C1463860oCG(nLEMediaConfigLIZIZ, textureView, (NLEEditor) r3, true);
        this.LJI = c1463860oCG;
        r3.addConsumer(new C354000DuI() { // from class: X.0Ehw
            @Override // X.C354000DuI
            public final void LIZ() {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1463670oBx c1463670oBx = this.LIZ;
                    C1463860oCG c1463860oCG2 = c1463670oBx.LJI;
                    if (c1463860oCG2 == null) {
                        c1463860oCG2 = null;
                    }
                    c1463860oCG2.setDataSource(c1463670oBx.LIZJ());
                    this.LIZ.LJ(jCurrentTimeMillis);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    NLELoggerListener logger = NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        LogLevel logLevel = LogLevel.LEVEL_DEBUG;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("NLEEditor callback: ");
                        sbLIZ.append(th);
                        logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    this.LIZ.LJII = th;
                }
            }
        });
        NLEDropFrameParams nLEDropFrameParams = C1452960nug.LJII;
        if (nLEDropFrameParams.isSetParams()) {
            ((C1463880oCI) c1463860oCG.getMediaSettingApi()).setDropFrameParam(true, nLEDropFrameParams.delayTime, nLEDropFrameParams.maxDropCount);
        }
        LJI();
    }

    @Override // X.InterfaceC1452170ntP
    public final String Of(int i, int i2, int i3, String str) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        return ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).getFileInfo(String.valueOf(i3), str);
    }

    @Override // X.InterfaceC1452170ntP
    public final boolean Qe(String str, String str2, VEVideoEncodeSettings vEVideoEncodeSettings, final InterfaceC574560MgA interfaceC574560MgA) {
        String watermarkStr;
        String absolutePath;
        INLEListenerCompile iNLEListenerCompile = new INLEListenerCompile() { // from class: X.0Mg8
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
            public final void onCompileDone() {
                InterfaceC574560MgA interfaceC574560MgA2 = interfaceC574560MgA;
                if (interfaceC574560MgA2 != null) {
                    interfaceC574560MgA2.onCompileDone();
                }
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
            public final void onCompileProgress(float f) {
                InterfaceC574560MgA interfaceC574560MgA2 = interfaceC574560MgA;
                if (interfaceC574560MgA2 != null) {
                    interfaceC574560MgA2.onCompileProgress(f);
                }
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
            public final void onCompileError(int i, int i2, float f, String str3) {
                InterfaceC574560MgA interfaceC574560MgA2 = interfaceC574560MgA;
                if (interfaceC574560MgA2 != null) {
                    interfaceC574560MgA2.onCompileError(i, i2, f, str3);
                }
            }
        };
        C1463860oCG c1463860oCG = null;
        if (C2219091BtD.LIZIZ()) {
            C1463860oCG c1463860oCG2 = this.LJI;
            if (c1463860oCG2 == null) {
                c1463860oCG2 = null;
            }
            INLEExporter exporterApi = c1463860oCG2.getExporterApi();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            File externalFilesDir = C2219091BtD.LIZ().getExternalFilesDir(null);
            if (externalFilesDir != null) {
                absolutePath = externalFilesDir.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            sbLIZ.append(absolutePath);
            sbLIZ.append("/nle_compile_dump");
            ((C1463840oCE) exporterApi).setCompileDumpFilePath(C2188811AlT.LIZIZ(sbLIZ));
        }
        NLEVideoEncodeSettings nLEVideoEncodeSettingsLJ = C1776260wK8.LJ(vEVideoEncodeSettings);
        NLEVideoInvisibleWatermark mVideoInvisibleWatermark = nLEVideoEncodeSettingsLJ.getMVideoInvisibleWatermark();
        if (mVideoInvisibleWatermark != null) {
            watermarkStr = mVideoInvisibleWatermark.getWatermarkStr();
        } else {
            watermarkStr = null;
        }
        if (C123100dR.LIZ(watermarkStr)) {
            nLEVideoEncodeSettingsLJ.setEnableInvisibleWatermark(true);
        }
        nLEVideoEncodeSettingsLJ.setEnableUploadingWhileCompile(this.LJIIIZ);
        if (str2 != null && !Intrinsics.LJFF(a0.LJLIIIL(str2).toString(), "")) {
            C1463860oCG c1463860oCG3 = this.LJI;
            if (c1463860oCG3 != null) {
                c1463860oCG = c1463860oCG3;
            }
            return ((C1463840oCE) c1463860oCG.getExporterApi()).compile(str, str2, nLEVideoEncodeSettingsLJ, iNLEListenerCompile);
        }
        C1463860oCG c1463860oCG4 = this.LJI;
        if (c1463860oCG4 != null) {
            c1463860oCG = c1463860oCG4;
        }
        return ((C1463840oCE) c1463860oCG.getExporterApi()).compile(str, nLEVideoEncodeSettingsLJ, iNLEListenerCompile);
    }

    @Override // X.InterfaceC1452170ntP
    public final int Sf(VETimelineParams vETimelineParams, boolean z, int i, boolean z2) {
        return C347200DjK.LIZJ(this.LJ, vETimelineParams, z, i, z2);
    }

    @Override // X.InterfaceC1452170ntP
    public final void setDisplayPos(int i, int i2, int i3, int i4) {
        this.LJJII.set(i, i2, i3, i4);
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setDisplayPos(i, i2, i3, i4);
    }

    @Override // X.InterfaceC1452170ntP
    public final int lg(int[] iArr, int i, int i2, VEEditor.GET_FRAMES_FLAGS get_frames_flags, final InterfaceC1464140oCi interfaceC1464140oCi) throws Exception {
        NLE_GET_FRAME_FLAGS nle_get_frame_flags;
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        INLEMediaRuntime mediaRuntimeApi = c1463860oCG.getMediaRuntimeApi();
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i3 : iArr) {
            arrayList.add(Long.valueOf(((long) i3) * 1000));
        }
        VecLongLong vecLongLong = new VecLongLong(arrayList);
        int i4 = C1778400wNa.LJIIIZ[get_frames_flags.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                nle_get_frame_flags = NLE_GET_FRAME_FLAGS.NLE_GET_FRAMES_MODE_NOEFFECT;
            } else {
                throw new Exception("NLE not support this flag");
            }
        } else {
            nle_get_frame_flags = NLE_GET_FRAME_FLAGS.NLE_GET_FRAMES_MODE_NORMAL;
        }
        return ((C1463950oCP) mediaRuntimeApi).getImages(vecLongLong, i, i2, nle_get_frame_flags, new INLEListenerGetImage() { // from class: X.0oCK
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerGetImage
            public final int onGetImageData(byte[] bArr, int i5, int i6, int i7, float f) {
                return interfaceC1464140oCi.onGetImageData(bArr, i5, i6, i7, f);
            }
        });
    }

    @Override // X.InterfaceC1452170ntP
    public final void setDisplayState(float f, float f2, float f3, int i, int i2) {
        C1463860oCG c1463860oCG = this.LJI;
        if (c1463860oCG == null) {
            c1463860oCG = null;
        }
        ((C1463950oCP) c1463860oCG.getMediaRuntimeApi()).setDisplayState(f, f2, f3, i, i2);
    }

    public /* synthetic */ C1463670oBx(String str, EnumC1464030oCX enumC1464030oCX, EnumC1442010nd1 enumC1442010nd1, boolean z, SurfaceView surfaceView, VEUserConfig vEUserConfig, int i) {
        Pair pair;
        VEUserConfig vEUserConfig2 = vEUserConfig;
        SurfaceView surfaceView2 = surfaceView;
        boolean z2 = (i & 8) != 0 ? true : z;
        surfaceView2 = (i & 16) != 0 ? null : surfaceView2;
        vEUserConfig2 = (i & 64) != 0 ? null : vEUserConfig2;
        if ((i & 256) != 0) {
            pair = new Pair(0, 0);
        } else {
            pair = null;
        }
        this(str, enumC1464030oCX, enumC1442010nd1, z2, surfaceView2, null, vEUserConfig2, pair, (i & 512) != 0 ? "" : null);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0oCJ] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0oCA] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0oCB] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0E9H, com.bytedance.ies.nle.editor_jni.NLEEditor] */
    public C1463670oBx(String str, EnumC1464030oCX enumC1464030oCX, EnumC1442010nd1 enumC1442010nd1, boolean z, SurfaceView surfaceView, InterfaceC349870Dnd interfaceC349870Dnd, VEUserConfig vEUserConfig, Pair pair, String str2) {
        VEUserConfig.VEUserConfigItem<?>[] configItems;
        NLEVEUserConfig nleVEUserConfig;
        this.LIZ = new LinkedHashMap();
        this.LJIIJJI = -1L;
        this.LJIJJLI = new C0E9E();
        C0FGC.LIZ(2);
        NLE nle = NLE.INSTANCE;
        nle.setLogger(new NLELoggerListener() { // from class: X.0oC3
            @Override // com.bytedance.ies.nle.editor_jni.NLELoggerListener
            public final void onLog(LogLevel logLevel, String str22) {
                int i;
                if (logLevel == null) {
                    i = -1;
                } else {
                    i = C560120Lxy.LIZ[logLevel.ordinal()];
                    if (i == 1) {
                        return;
                    }
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL = C2219091BtD.LIZLLL();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("NLE ");
                                sbLIZ.append(str22);
                                interfaceC1463990oCTLIZLLL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                                return;
                            }
                            return;
                        }
                        InterfaceC1463990oCT interfaceC1463990oCTLIZLLL2 = C2219091BtD.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("NLE ");
                        sbLIZ2.append(str22);
                        interfaceC1463990oCTLIZLLL2.w(C2188811AlT.LIZIZ(sbLIZ2));
                        return;
                    }
                    InterfaceC1463990oCT interfaceC1463990oCTLIZLLL3 = C2219091BtD.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("NLE ");
                    sbLIZ3.append(str22);
                    interfaceC1463990oCTLIZLLL3.i(C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                InterfaceC1463990oCT interfaceC1463990oCTLIZLLL4 = C2219091BtD.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("NLE ");
                sbLIZ4.append(str22);
                interfaceC1463990oCTLIZLLL4.d(C2188811AlT.LIZIZ(sbLIZ4));
            }
        });
        nle.setLogLevel(LogLevel.LEVEL_DEBUG);
        ?? r3 = new NLEEditor() { // from class: X.0E9H
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final boolean commit() throws Throwable {
                long jCurrentTimeMillis;
                Function1<? super NLEModel, Unit> function1;
                if (this.LIZ.LJIJJ) {
                    return super.commit();
                }
                boolean z2 = false;
                if (C0BIX.LIZ() && this.LIZ.LJIIZILJ) {
                    return true;
                }
                C1463670oBx c1463670oBx = this.LIZ;
                c1463670oBx.getClass();
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("template_async_render_anr_fix_switch", false)) {
                    C1463860oCG c1463860oCG = c1463670oBx.LJI;
                    if (c1463860oCG == null) {
                        c1463860oCG = null;
                    }
                    NLEMediaConfig mediaConfig = c1463860oCG.getMediaConfig();
                    if (C1452960nug.LJIIL) {
                        NLETrack mainTrack = c1463670oBx.LIZJ().getMainTrack();
                        if (Intrinsics.LJFF(mainTrack != null ? mainTrack.getExtra("async_render") : null, "async_render")) {
                            z2 = true;
                        }
                    }
                    mediaConfig.setEnableResourceAsyncRender(z2);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ASYNC_RENDER: NLE commit setNLEAsyncRenderFlag NLEMediaAbConfig enableResourceAsyncRender=");
                C1463860oCG c1463860oCG2 = c1463670oBx.LJI;
                if (c1463860oCG2 == null) {
                    c1463860oCG2 = null;
                }
                sbLIZ.append(c1463860oCG2.getMediaConfig().getEnableResourceAsyncRender());
                sbLIZ.append(", NLEGlobalConfig enableResourceAsyncRender=");
                sbLIZ.append(C1452960nug.LJIIL);
                sbLIZ.append(", NLEModel enableAsyncRender=");
                NLETrack mainTrack2 = c1463670oBx.LIZJ().getMainTrack();
                sbLIZ.append(Intrinsics.LJFF(mainTrack2 != null ? mainTrack2.getExtra("async_render") : null, "async_render"));
                C2188811AlT.LIZIZ(sbLIZ);
                C1463670oBx c1463670oBx2 = this.LIZ;
                if (!c1463670oBx2.LJFF && (function1 = C1452960nug.LJIILIIL) != null) {
                    function1.invoke(c1463670oBx2.LIZJ());
                }
                C1463670oBx c1463670oBx3 = this.LIZ;
                Throwable th = c1463670oBx3.LJII;
                if (th != null) {
                    throw th;
                }
                NLETrack mainTrack3 = c1463670oBx3.LIZJ().getMainTrack();
                if (Intrinsics.LJFF(mainTrack3 != null ? mainTrack3.getExtra("business") : null, "cutsame") && c1463670oBx3.LJJIFFI.getFirst().intValue() > 0 && c1463670oBx3.LJJIFFI.getSecond().intValue() > 0) {
                    c1463670oBx3.Vf(c1463670oBx3.LJJIFFI.getFirst().intValue(), c1463670oBx3.LJJIFFI.getSecond().intValue());
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                boolean zCommit = super.commit();
                C1463670oBx c1463670oBx4 = this.LIZ;
                if (c1463670oBx4.LJIIL) {
                    if (c1463670oBx4.LJIIJJI >= 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                        jCurrentTimeMillis2 = c1463670oBx4.LJIIJJI;
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    c1463670oBx4.LJIIJJI = -1L;
                    C1463670oBx.LJFF(c1463670oBx4.LJIILIIL, c1463670oBx4.LJIILL, jCurrentTimeMillis - jCurrentTimeMillis2);
                }
                return zCommit;
            }

            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final void addConsumer(NLEEditorListener nLEEditorListener) {
                C0E9D c0e9d = this.LIZ.LJIL;
                if (c0e9d != null && c0e9d.LIZ(nLEEditorListener)) {
                    return;
                }
                this.LIZ.LJIJJLI.LIZ.add(nLEEditorListener);
                super.addConsumer(nLEEditorListener);
            }

            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final void removeConsumer(NLEEditorListener nLEEditorListener) {
                C0E9D c0e9d = this.LIZ.LJIL;
                if (c0e9d != null && c0e9d.LIZIZ(nLEEditorListener)) {
                    return;
                }
                this.LIZ.LJIJJLI.LIZ.remove(nLEEditorListener);
                super.removeConsumer(nLEEditorListener);
            }

            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final void setBranchListener(NLEBranchListener nLEBranchListener) {
                C1463670oBx c1463670oBx = this.LIZ;
                C0E9D c0e9d = c1463670oBx.LJIL;
                if (c0e9d != null) {
                    c0e9d.LIZ.LIZJ = nLEBranchListener;
                } else {
                    c1463670oBx.LJIJJLI.LIZJ = nLEBranchListener;
                    super.setBranchListener(nLEBranchListener);
                }
            }

            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final void setListener(NLEEditorListener nLEEditorListener) {
                C1463670oBx c1463670oBx = this.LIZ;
                C0E9D c0e9d = c1463670oBx.LJIL;
                if (c0e9d != null) {
                    c0e9d.LIZ.LIZIZ = nLEEditorListener;
                } else {
                    c1463670oBx.LJIJJLI.LIZIZ = nLEEditorListener;
                    super.setListener(nLEEditorListener);
                }
            }
        };
        this.LJ = r3;
        this.LJIIIIZZ = new C349850Dnb(new AwS549S0100000_5(this, 43));
        this.LJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 44));
        this.LJJIFFI = new Pair<>(0, 0);
        this.LJJII = new Rect();
        this.LJJIII = new ArrayList();
        this.LJJIIJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 36));
        this.LJJIIJZLJL = new CopyOnWriteArrayList<>();
        this.LJJIIZ = new INLEListenerFirstFrame() { // from class: X.0oCJ
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerFirstFrame
            public final void onRendered() {
                this.LIZ.getClass();
                Iterator<InterfaceC1464190oCn> it2 = this.LIZ.LJJIIJZLJL.iterator();
                while (it2.hasNext()) {
                    it2.next().onRendered();
                }
            }
        };
        this.LJJIIZI = new CopyOnWriteArrayList<>();
        this.LJJIJ = new INLEListenerCommon() { // from class: X.0oCA
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
            public final void onCallback(int i, int i2, float f, String str22) {
                Iterator<InterfaceC1464200oCo> it2 = this.LIZ.LJJIIZI.iterator();
                while (it2.hasNext()) {
                    it2.next().onCallback(i, i2, f, str22);
                }
            }
        };
        this.LJJIJIIJI = new CopyOnWriteArrayList<>();
        this.LJJIJIIJIL = new INLEListenerCommon() { // from class: X.0oCB
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCommon
            public final void onCallback(int i, int i2, float f, String str22) {
                Iterator<InterfaceC1464200oCo> it2 = this.LIZ.LJJIJIIJI.iterator();
                while (it2.hasNext()) {
                    it2.next().onCallback(i, i2, f, str22);
                }
            }
        };
        this.LJJIJIL = new CopyOnWriteArrayList<>();
        this.LIZIZ = str;
        this.LJJI = surfaceView;
        this.LIZJ = interfaceC349870Dnd;
        enumC1464030oCX.getValue();
        enumC1442010nd1.getValue();
        NLEMediaConfig nLEMediaConfigLIZIZ = C1463690oBz.LIZIZ(str, str2);
        if (vEUserConfig != null && (configItems = vEUserConfig.getConfigItems()) != null) {
            for (VEUserConfig.VEUserConfigItem<?> vEUserConfigItem : configItems) {
                Object value = vEUserConfigItem.getValue();
                if (value instanceof Boolean) {
                    NLEVEUserConfig nleVEUserConfig2 = nLEMediaConfigLIZIZ.getNleVEUserConfig();
                    if (nleVEUserConfig2 != null) {
                        nleVEUserConfig2.addConfig(vEUserConfigItem.id.value(), ((Boolean) value).booleanValue());
                    }
                } else if ((value instanceof Integer) && (nleVEUserConfig = nLEMediaConfigLIZIZ.getNleVEUserConfig()) != null) {
                    nleVEUserConfig.addConfig(vEUserConfigItem.id.value(), ((Number) value).intValue());
                }
            }
        }
        C1463860oCG c1463860oCGLIZ = C0F9X.LIZ(nLEMediaConfigLIZIZ, surfaceView, r3, 8);
        this.LJI = c1463860oCGLIZ;
        addConsumer(new C354000DuI() { // from class: X.0Ehv
            @Override // X.C354000DuI
            public final void LIZ() {
                try {
                    C1463670oBx c1463670oBx = this.LIZ;
                    if (!c1463670oBx.LJFF) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C1463670oBx c1463670oBx2 = this.LIZ;
                        if (c1463670oBx2.LJIJ) {
                            c1463670oBx2.LJIJI = true;
                        } else {
                            C1463860oCG c1463860oCG = c1463670oBx2.LJI;
                            (c1463860oCG != null ? c1463860oCG : null).setDataSource(c1463670oBx2.LIZJ());
                        }
                        this.LIZ.LJ(jCurrentTimeMillis);
                        return;
                    }
                    NLEModel model = c1463670oBx.LJ.getModel();
                    if (model != null) {
                        C1463670oBx c1463670oBx3 = this.LIZ;
                        if (true ^ model.getTracks().isEmpty()) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            C1463860oCG c1463860oCG2 = c1463670oBx3.LJI;
                            (c1463860oCG2 != null ? c1463860oCG2 : null).setDataSource(model);
                            c1463670oBx3.LJ(jCurrentTimeMillis2);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    NLELoggerListener logger = NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        LogLevel logLevel = LogLevel.LEVEL_DEBUG;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("NLEEditor callback: ");
                        sbLIZ.append(th);
                        logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    this.LIZ.LJII = th;
                }
            }
        });
        NLEDropFrameParams nLEDropFrameParams = C1452960nug.LJII;
        if (nLEDropFrameParams.isSetParams()) {
            ((C1463880oCI) c1463860oCGLIZ.getMediaSettingApi()).setDropFrameParam(true, nLEDropFrameParams.delayTime, nLEDropFrameParams.maxDropCount);
        }
        this.LJJIFFI = pair;
        LJI();
    }
}
