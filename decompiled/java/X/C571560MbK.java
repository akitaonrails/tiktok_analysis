package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileSettings;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.gamora.editorpro.dynamic.PipLimit;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571560MbK implements InterfaceC2357009Lk {
    public static int LJ;
    public static final Map<String, String> LJFF = new LinkedHashMap();
    public final CreativeInfo LIZ;
    public boolean LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 177));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 178));

    public static final void LIZJ() {
        try {
            ((LinkedHashMap) LJFF).clear();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
        }
    }

    public final String LJ() {
        C0VSJ c0vsj = new C0VSJ((String) this.LIZJ.getValue());
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((String) this.LIZJ.getValue());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('-');
        int i = LJ;
        LJ = i + 1;
        sbLIZ2.append(i);
        sbLIZ2.append("-concat-v.mp4");
        sbLIZ.append(C1449640npK.LIZ(C2188811AlT.LIZIZ(sbLIZ2)));
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).getPath();
    }

    public final InterfaceC1452170ntP LJFF() {
        return (InterfaceC1452170ntP) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC2357009Lk
    public final void destroy() {
        if (this.LIZIZ) {
            LJFF().destroy();
        }
    }

    public C571560MbK(CreativeInfo creativeInfo) {
        this.LIZ = creativeInfo;
    }

    @Override // X.InterfaceC2357009Lk
    public final Pair<Integer, Integer> LIZIZ(boolean z) {
        int i;
        int i2;
        int videoWidth = C0CHQ.LIZ().LJJIIZ().getVideoWidth();
        int videoHeight = C0CHQ.LIZ().LJJIIZ().getVideoHeight();
        C1455910nzR.LIZ.getClass();
        PipLimit pipLimitLIZLLL = C1455910nzR.LIZLLL();
        pipLimitLIZLLL.countLimit = Math.max(pipLimitLIZLLL.countLimit, 0);
        if (z && (i = pipLimitLIZLLL.widthLimit) != -1 && (i2 = pipLimitLIZLLL.heightLimit) != -1) {
            if (i2 * i <= videoWidth * videoHeight) {
                return new Pair<>(Integer.valueOf(i), Integer.valueOf(pipLimitLIZLLL.heightLimit));
            }
            return new Pair<>(Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
        }
        return new Pair<>(Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
    }

    public final void LIZLLL(CutVideoCompileSettings cutVideoCompileSettings, C0MBM c0mbm) {
        int iIntValue;
        InterfaceC1452170ntP interfaceC1452170ntPLJFF = LJFF();
        Integer num = cutVideoCompileSettings.LJIILJJIL;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        interfaceC1452170ntPLJFF.setPageMode(iIntValue);
        List<VideoSegment> list = cutVideoCompileSettings.segments;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<VideoSegment> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C571500MbE.LJFF(it2.next()));
        }
        C571620MbQ.LIZ(LJFF(), arrayList);
        try {
            VEVideoEncodeSettings vEVideoEncodeSettingsLIZIZ = C571620MbQ.LIZIZ(cutVideoCompileSettings);
            List<VideoSegment> list2 = cutVideoCompileSettings.segments;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<VideoSegment> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    VideoSegment next = it3.next();
                    C2356009La c2356009La = C2356009La.LIZ;
                    String str = next.originPath;
                    c2356009La.getClass();
                    VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(str);
                    if (vEVideoFileInfoLIZ != null && vEVideoFileInfoLIZ.bHDR) {
                        vEVideoEncodeSettingsLIZIZ.setVideoTrc(0);
                        break;
                    }
                }
            }
            LJFF().Qe(cutVideoCompileSettings.videoOutputPath, cutVideoCompileSettings.audioOutputPath, vEVideoEncodeSettingsLIZIZ, c0mbm);
        } catch (VEException e) {
            TryCatchGuardChecker.doCheck(e);
            c0mbm.onCompileError(4118, 0, 0.0f, e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, java.lang.Object, java.lang.String] */
    @Override // X.InterfaceC2357009Lk
    public final void LIZ(String str, VideoSegment videoSegment, boolean z, boolean z2, Pair<Integer, Integer> pair, Function1<? super Float, Unit> function1, InterfaceC537740L7c interfaceC537740L7c, Function2<? super Boolean, ? super String, Unit> function2) {
        String strLIZ;
        Pair<Integer, Integer> pairLIZIZ;
        int iIntValue;
        NLEModel nLEModelLIZ;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLEResourceNode resource;
        int iMin;
        int iMin2;
        int iMin3;
        String strLJ = str;
        ?? LJFF2 = videoSegment.LJFF(false);
        LJFF2.toString();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = LJFF2;
        if (pair != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) c259800zU.element);
            sbLIZ.append("_trim_");
            sbLIZ.append(pair.getFirst().intValue());
            sbLIZ.append('_');
            sbLIZ.append(pair.getSecond().intValue());
            c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
        }
        String str2 = (String) ((LinkedHashMap) LJFF).get(c259800zU.element);
        if (str2 != null && C2286708xd.LIZJ(str2)) {
            if (!a0.LJJIIZI(str2, this.LIZ.getCreationId(), false)) {
                if (strLJ == null) {
                    strLJ = LJ();
                }
                C2286708xd.LJFF(str2, strLJ);
                str2 = strLJ;
            }
            if (function1 != null) {
                function1.invoke(Float.valueOf(1.0f));
            }
            function2.invoke(Boolean.TRUE, str2);
            return;
        }
        if (strLJ == null) {
            strLJ = LJ();
        }
        List listSingletonList = Collections.singletonList(videoSegment);
        Object first = null;
        Integer numLIZIZ = null;
        CompileConfigResolution compileConfigResolution = new CompileConfigResolution(-1, -1, null, null, 12, null);
        Object second = null;
        if (interfaceC537740L7c != null) {
            numLIZIZ = interfaceC537740L7c.LIZIZ();
            strLIZ = interfaceC537740L7c.LIZ();
        } else {
            strLIZ = null;
        }
        CutVideoCompileSettings cutVideoCompileSettingsLIZ = new C1440190na5(new C1440200na6(listSingletonList, strLJ, null, compileConfigResolution, 0, null, 0, numLIZIZ, strLIZ, 496)).LIZ();
        if (z2) {
            int iMin4 = Math.min(videoSegment.width, videoSegment.height);
            Math.max(videoSegment.width, videoSegment.height);
            Pair pairLIZIZ2 = C571570MbL.LIZIZ();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C571610MbP());
            arrayList.add(new C571590MbN());
            arrayList.add(new C571600MbO(Math.max(1081, ((Number) pairLIZIZ2.getFirst()).intValue())));
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Integer numLIZ = ((InterfaceC571580MbM) it2.next()).LIZ(iMin4);
                    if (numLIZ != null) {
                        Integer numValueOf = Integer.valueOf(numLIZ.intValue());
                        if (numValueOf != null) {
                            int iIntValue2 = numValueOf.intValue();
                            int iLIZ = C0C1C.LIZ();
                            iMin3 = Math.min(videoSegment.LJ(), Math.min(iIntValue2, iLIZ));
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("EditorPro SourceImportFps -> videoFPS = ");
                            sbLIZ2.append(videoSegment.LJ());
                            sbLIZ2.append(", maxVESupportFps = ");
                            sbLIZ2.append(iLIZ);
                            sbLIZ2.append(", fastImportFpsLimit = ");
                            sbLIZ2.append(iIntValue2);
                            sbLIZ2.append(", compileFps = ");
                            sbLIZ2.append(iMin3);
                            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                }
                iMin3 = 30;
                cutVideoCompileSettingsLIZ.LIZJ = iMin3;
            } else {
                iMin3 = 30;
                cutVideoCompileSettingsLIZ.LIZJ = iMin3;
            }
        }
        if (pair != null) {
            cutVideoCompileSettingsLIZ.LJIILIIL = Collections.singletonList(pair);
        }
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
        if (interfaceC537740L7c == null || (pairLIZIZ = interfaceC537740L7c.getResolution()) == null) {
            pairLIZIZ = LIZIZ(z);
        }
        C201955140j.LIZIZ("CutOptimizedCompressVideoHelper", pairLIZIZ + "; setting " + cutVideoCompileSettingsLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        List listSingletonList2 = Collections.singletonList(LJFF2);
        C0MBM c0mbm = new C0MBM(function2, strLJ, this, jCurrentTimeMillis, c259800zU, function1);
        C1DOU c1dou = new C1DOU((String[]) listSingletonList2.toArray(new String[0]));
        if (!cutVideoCompileSettingsLIZ.LJIILIIL.isEmpty()) {
            Pair pair2 = (Pair) C13LP.LJJJLL(cutVideoCompileSettingsLIZ.LJIILIIL);
            if (pair2 != null) {
                first = pair2.getFirst();
            }
            Pair pair3 = (Pair) C13LP.LJJJLL(cutVideoCompileSettingsLIZ.LJIILIIL);
            if (pair3 != null) {
                second = pair3.getSecond();
            }
            if (first != null && second != null) {
                c1dou.LIZIZ = C13LP.LLII(Collections.singletonList(first));
                c1dou.LIZJ = C13LP.LLII(Collections.singletonList(second));
            }
        }
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(LJFF());
        if (c348100DkmLIZIZ != null) {
            C571670MbV.LIZ(c1dou, c348100DkmLIZIZ.LIZ);
            LJFF().setPreviewFps(C310640CFq.LIZ());
            InterfaceC1452170ntP interfaceC1452170ntPLJFF = LJFF();
            Integer num = cutVideoCompileSettingsLIZ.LJIILJJIL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            interfaceC1452170ntPLJFF.setPageMode(iIntValue);
            LJFF().Tf(pairLIZIZ.getFirst().intValue(), pairLIZIZ.getSecond().intValue());
            LJFF().enableSimpleProcessor(true);
            if (LJFF().prepare() != 0) {
                c0mbm.onCompileError(4118, 0, 0.0f, "prepare error, suspend by user");
                return;
            }
            if ((cutVideoCompileSettingsLIZ.LIZ == -1 || cutVideoCompileSettingsLIZ.LIZIZ == -1) && (nLEModelLIZ = C352130DrH.LIZ(LJFF())) != null && (mainTrack = nLEModelLIZ.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                Pair pair4 = new Pair(Integer.valueOf((int) resource.getWidth()), Integer.valueOf((int) resource.getHeight()));
                int iMin5 = Math.min(((Number) pair4.getFirst()).intValue(), ((Number) pair4.getSecond()).intValue());
                int iMin6 = Math.min(pairLIZIZ.getFirst().intValue(), pairLIZIZ.getSecond().intValue());
                if (iMin5 > iMin6) {
                    float fIntValue = ((Number) pair4.getSecond()).intValue() / ((Number) pair4.getFirst()).floatValue();
                    if (fIntValue >= 1.0f) {
                        iMin2 = Math.min(((Number) pair4.getFirst()).intValue(), iMin6);
                        iMin = (int) (iMin2 * fIntValue);
                    } else {
                        iMin = Math.min(((Number) pair4.getSecond()).intValue(), iMin6);
                        iMin2 = (int) (iMin / fIntValue);
                    }
                    pair4 = new Pair(Integer.valueOf(iMin2), Integer.valueOf(iMin));
                }
                LIZLLL(new CutVideoCompileSettings(cutVideoCompileSettingsLIZ.segments, cutVideoCompileSettingsLIZ.videoOutputPath, cutVideoCompileSettingsLIZ.audioOutputPath, ((Number) pair4.getFirst()).intValue(), ((Number) pair4.getSecond()).intValue(), cutVideoCompileSettingsLIZ.LIZJ, cutVideoCompileSettingsLIZ.LIZLLL, cutVideoCompileSettingsLIZ.LJ, cutVideoCompileSettingsLIZ.LJFF, cutVideoCompileSettingsLIZ.LJI, cutVideoCompileSettingsLIZ.LJII, cutVideoCompileSettingsLIZ.LJIIIIZZ, cutVideoCompileSettingsLIZ.LJIIIZ, cutVideoCompileSettingsLIZ.LJIIJ, cutVideoCompileSettingsLIZ.LJIIJJI, cutVideoCompileSettingsLIZ.LJIIL, cutVideoCompileSettingsLIZ.LJIILIIL, cutVideoCompileSettingsLIZ.LJIILJJIL), c0mbm);
                return;
            }
            LIZLLL(cutVideoCompileSettingsLIZ, c0mbm);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
