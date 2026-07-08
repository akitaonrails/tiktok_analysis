package X;

import Y.ARunnableS0S0400010_5;
import Y.ARunnableS0S1501000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.net.Uri;
import android.util.Size;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.nle.editor_jni.INLEMattingRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaOnDone;
import com.bytedance.ies.nle.editor_jni.INLEMediaOnProgressChanged;
import com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnDone;
import com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnProgressChanged;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.NLECurveSpeedCalculator;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaReverse;
import com.bytedance.ies.nle.editor_jni.NLEMediaReverseUtil;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecDouble;
import com.bytedance.ies.nle.editor_jni.VecNLECommonKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLEKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS15S0600000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0DqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351560DqM extends C350680Dow implements InterfaceC354900Dvk {
    public int LJ;
    public NLETrack LJFF;
    public NLETrackSlot LJI;
    public final Map<String, Boolean> LJII;
    public final Map<String, C443120HZe<NLEMediaReverse, INLEMediaOnProgressChanged, INLEMediaOnDone>> LJIIIIZZ;
    public final boolean LJIIIZ;

    public final boolean LLJJIJI() {
        List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(C350870DpF.LJI(this.LIZ));
        if ((listLJJLIIIJLJLI.size() > 0 ? ((NLETimeSpaceNode) C13LP.LJJLIIIJJI(listLJJLIIIJLJLI)).getLayer() + 1 : 0) < ((Number) C0E5G.LIZIZ(EnumC357850E1f.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue()) {
            return true;
        }
        C372670EjJ.LIZ(2131850358);
        return false;
    }

    @Override // X.InterfaceC354900Dvk
    public final void LJJJJLI() {
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI != null) {
            this.LJII.put(nLETrackSlotLLJJI.getUUID(), Boolean.TRUE);
            C443120HZe c443120HZe = (C443120HZe) ((LinkedHashMap) this.LJIIIIZZ).get(nLETrackSlotLLJJI.getUUID());
            if (c443120HZe != null) {
                ((NLEMediaReverse) c443120HZe.getFirst()).cancelReverse();
                this.LJIIIIZZ.remove(nLETrackSlotLLJJI.getUUID());
            }
        }
    }

    @Override // X.InterfaceC354900Dvk
    public final float LLIZLLLIL() {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLJJI.getMainSegment())) == null) {
            return 1.0f;
        }
        return nLESegmentVideoDynamicCast.getAbsSpeed();
    }

    public C351560DqM(C0E48 c0e48) {
        boolean zLLJJIJI;
        super(c0e48);
        this.LJII = new LinkedHashMap();
        this.LJIIIIZZ = new LinkedHashMap();
        NLETrack nLETrackRn = c0e48.Rn();
        if (nLETrackRn != null) {
            zLLJJIJI = C351220Dpo.LLJJIJI(nLETrackRn);
        } else {
            zLLJJIJI = false;
        }
        this.LJIIIZ = zLLJJIJI;
    }

    public static String LLJJJJJIL(Bitmap bitmap) {
        Context context = C351620DqS.LIZ;
        String path = null;
        if (context == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        File fileX2 = C786410Ut5.x2(context);
        if (fileX2 != null) {
            path = fileX2.getPath();
        }
        sbLIZ.append(path);
        sbLIZ.append('/');
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".png");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            C0VSV c0vsv = new C0VSV(new C0VSJ(strLIZIZ));
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, c0vsv);
            c0vsv.flush();
            c0vsv.close();
            return strLIZIZ;
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return strLIZIZ;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return strLIZIZ;
        }
    }

    @Override // X.InterfaceC354900Dvk
    public final boolean LJJJI(EnumC356070Dxd enumC356070Dxd) {
        NLETrackSlot nLETrackSlotLLJJI;
        boolean z;
        String strLIZIZ;
        List<NLECommonKeyframe> listLJJLIIIJJIZ;
        long jLLLLLLJ = C351220Dpo.LLLLLLJ(C350870DpF.LJ(this.LIZ));
        NLETrack nLETrackLLJJIII = LLJJIII();
        if (nLETrackLLJJIII == null || (nLETrackSlotLLJJI = LLJJI()) == null) {
            return false;
        }
        VecNLETrackSlotSPtr keyframes = nLETrackSlotLLJJI.getKeyframes();
        if ((keyframes == null || keyframes.isEmpty()) && !C351220Dpo.LLFF(nLETrackSlotLLJJI, NLEKeyframeType.Video)) {
            z = false;
        } else {
            z = true;
        }
        int iLJJLIIJ = ((int) C351220Dpo.LJJLIIJ(nLETrackSlotLLJJI)) - 90;
        if (!z) {
            iLJJLIIJ %= 360;
        }
        String strValueOf = String.valueOf((int) Math.abs(C351220Dpo.LJJLIIJ(nLETrackSlotLLJJI)));
        String strValueOf2 = String.valueOf(Math.abs(iLJJLIIJ));
        int i = iLJJLIIJ % 360;
        if (Math.abs(i) != 90 && Math.abs(i) != 270) {
            if (Math.abs(iLJJLIIJ) % 180 == 0 && Math.abs(nLETrackSlotLLJJI.getScale() - LLJJJJ(nLETrackSlotLLJJI)) <= 0.01f) {
                nLETrackSlotLLJJI.setScale(1.0f);
            }
        } else if (Math.abs(nLETrackSlotLLJJI.getScale() - 1.0f) <= 0.01f) {
            nLETrackSlotLLJJI.setScale(LLJJJJ(nLETrackSlotLLJJI));
        }
        nLETrackSlotLLJJI.setRotation(iLJJLIIJ);
        C350870DpF.LJIIIZ(this.LIZ, "rotate_changed_event", Integer.valueOf(iLJJLIIJ));
        C350870DpF.LJIIIZ(this.LIZ, "current_rotate_degree", Integer.valueOf(-iLJJLIIJ));
        if (!nLETrackLLJJIII.hasExtra("track_extra_is_rotated")) {
            nLETrackLLJJIII.setExtra("track_extra_is_rotated", "true");
        }
        C0E1X c0e1x = new C0E1X(C0E1V.ROTATE_FUNCTION.getNameId(), strValueOf, strValueOf2, null, null, 24);
        if (C351230Dpp.LIZLLL(Boolean.valueOf(this.LJIIIZ))) {
            InterfaceC351610DqR interfaceC351610DqROg = this.LIZ.og();
            NLEKeyframeType nLEKeyframeType = NLEKeyframeType.Video;
            if (interfaceC351610DqROg.yv(nLEKeyframeType) || ((listLJJLIIIJJIZ = this.LIZ.og().LJJLIIIJJIZ(jLLLLLLJ)) != null && !listLJJLIIIJJIZ.isEmpty())) {
                this.LIZ.og().Xb(nLEKeyframeType, false);
            }
        } else {
            this.LIZ.og().LLIILII(false);
        }
        if (!this.LIZ.og().X5() && !this.LIZ.og().yv(NLEKeyframeType.Video)) {
            strLIZIZ = C051R.LIZIZ(c0e1x);
        } else {
            strLIZIZ = C051R.LIZIZ(new C0E1X(C0E1V.ADD_KEY_FRAME.getNameId(), null, null, null, null, 30));
        }
        LLJJ(strLIZIZ, enumC356070Dxd);
        return true;
    }

    @Override // X.InterfaceC354900Dvk
    public final boolean LJJJJLL(EnumC356070Dxd enumC356070Dxd) {
        int i = C349360Dmo.LIZJ;
        return C350670Dov.LIZJ(this.LIZ, enumC356070Dxd, null, null, null, true);
    }

    @Override // X.InterfaceC354900Dvk
    public final void LJJLI(final InterfaceC351200Dpm interfaceC351200Dpm) {
        final NLETrackSlot nLETrackSlotLLJJI;
        NLESegment mainSegment;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        double d;
        String resourceFile;
        NLEError nLEErrorLLJJIJIL;
        String strLLJJJIL;
        String strLLJJJIL2;
        String strLLJJJIL3;
        String strLLJJJIL4;
        if (LLJJIII() != null && (nLETrackSlotLLJJI = LLJJI()) != null) {
            if (Intrinsics.LJFF(((LinkedHashMap) this.LJII).get(nLETrackSlotLLJJI.getUUID()), Boolean.TRUE)) {
                if (interfaceC351200Dpm != null) {
                    interfaceC351200Dpm.LIZLLL();
                }
                this.LJII.remove(nLETrackSlotLLJJI.getUUID());
                if (!((Boolean) C275380Aqm.LIZ.getValue()).booleanValue()) {
                    return;
                }
            }
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLJJI.getMainSegment());
            if (nLESegmentVideoDynamicCast != null) {
                this.LIZLLL.pause(false);
                long jJh = this.LIZLLL.Jh();
                final C351180Dpk c351180Dpk = new C351180Dpk();
                NLETrackSlot nLETrackSlot = (NLETrackSlot) C350110Do1.LIZIZ(LLZ(), nLETrackSlotLLJJI).getFirst();
                NLETrackSlot renderProxy = nLETrackSlotLLJJI.getRenderProxy();
                NLESegment mainSegment2 = null;
                if (renderProxy != null) {
                    mainSegment = renderProxy.getMainSegment();
                } else {
                    mainSegment = null;
                }
                NLEModel nLEModelLLZ = LLZ();
                C350110Do1.LIZJ.getClass();
                NLETrackSlot nLETrackSlotLIZIZ = C347000Dj0.LIZIZ(nLEModelLLZ, nLETrackSlotLLJJI);
                if (nLETrackSlotLIZIZ != null) {
                    mainSegment2 = nLETrackSlotLIZIZ.getMainSegment();
                }
                if (!C351220Dpo.LLLIL(nLETrackSlotLLJJI) && (strLLJJJIL4 = LLJJJIL(NLEResType.VIDEO, nLETrackSlotLLJJI.getMainSegment().getResource().getResourceFile())) != null && !C2113008Po.LIZIZ(strLLJJJIL4)) {
                    z = true;
                } else {
                    z = false;
                }
                if (mainSegment == null || ((C351220Dpo.LJJLIIIJJI(mainSegment).length() > 0 && !Intrinsics.LJFF(C351220Dpo.LJJLIIIJJI(mainSegment), mainSegment.getResource().getResourceFile())) || (strLLJJJIL3 = LLJJJIL(NLEResType.VIDEO, mainSegment.getResource().getResourceFile())) == null || C2113008Po.LIZIZ(strLLJJJIL3))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (nLETrackSlot != null && !C351220Dpo.LLLIL(nLETrackSlot) && (strLLJJJIL2 = LLJJJIL(NLEResType.AUDIO, nLETrackSlot.getMainSegment().getResource().getResourceFile())) != null && !C2113008Po.LIZIZ(strLLJJJIL2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (mainSegment2 == null || ((C351220Dpo.LJJLIIIJJI(mainSegment2).length() > 0 && !Intrinsics.LJFF(C351220Dpo.LJJLIIIJJI(mainSegment2), mainSegment2.getResource().getResourceFile())) || (strLLJJJIL = LLJJJIL(NLEResType.AUDIO, mainSegment2.getResource().getResourceFile())) == null || C2113008Po.LIZIZ(strLLJJJIL))) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                int i = 0;
                for (Pair pair : C1697810uHb.LJIIJJI(new Pair(Boolean.valueOf(z), 4), new Pair(Boolean.valueOf(z2), 4), new Pair(Boolean.valueOf(z3), 1), new Pair(Boolean.valueOf(z4), 1))) {
                    boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                    int iIntValue = ((Number) pair.getSecond()).intValue();
                    if (!zBooleanValue) {
                        iIntValue = 0;
                    }
                    i += iIntValue;
                }
                double d2 = 0.0d;
                if (z && i != 0) {
                    d = 4.0d / ((double) i);
                } else {
                    d = 0.0d;
                }
                if (z2 && i != 0) {
                    d2 = 4.0d / ((double) i);
                }
                double d3 = d + d2;
                final C351190Dpl c351190Dpl = new C351190Dpl(d, d2, d3, (1.0d - d3) / ((double) 2));
                C013C c013c = new C013C();
                c013c.element = true;
                final AwS15S0600000_5 awS15S0600000_5 = new AwS15S0600000_5(this, new C351160Dpi(interfaceC351200Dpm, c351190Dpl, this, nLETrackSlotLLJJI, c351180Dpk, c013c, jJh), c351180Dpk, nLETrackSlotLLJJI, interfaceC351200Dpm, c351190Dpl, 1);
                if (C351220Dpo.LLLIL(nLETrackSlotLLJJI)) {
                    c351180Dpk.LIZ = C351220Dpo.LJJLIIIJJI(nLESegmentVideoDynamicCast);
                    c013c.element = false;
                    awS15S0600000_5.invoke();
                    return;
                }
                NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                if (resource != null && (resourceFile = resource.getResourceFile()) != null) {
                    final String strLLJJJIL5 = LLJJJIL(NLEResType.VIDEO, resourceFile);
                    if (strLLJJJIL5 == null) {
                        if (interfaceC351200Dpm != null) {
                            interfaceC351200Dpm.LIZIZ(-2);
                            interfaceC351200Dpm.LIZJ();
                            return;
                        }
                        return;
                    }
                    if (!C2113008Po.LIZIZ(strLLJJJIL5)) {
                        INLEMediaReverseOnProgressChanged iNLEMediaReverseOnProgressChanged = new INLEMediaReverseOnProgressChanged() { // from class: X.0DqW
                            @Override // com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnProgressChanged
                            public final void onChanged(double d4) {
                                C351560DqM c351560DqM = this.LIZ;
                                C786410Ut5.LJJZZIII(c351560DqM.LIZJ, new ARunnableS0S0400010_5(c351560DqM, nLETrackSlotLLJJI, interfaceC351200Dpm, d4, c351190Dpl, 0));
                            }
                        };
                        INLEMediaReverseOnDone iNLEMediaReverseOnDone = new INLEMediaReverseOnDone() { // from class: X.0DqU
                            @Override // com.bytedance.ies.nle.editor_jni.INLEMediaReverseOnDone
                            public final void onDone(int i2) {
                                C351560DqM c351560DqM = this.LIZ;
                                C786410Ut5.LJJZZIII(c351560DqM.LIZJ, new ARunnableS0S1501000_5(c351560DqM, nLETrackSlotLLJJI, i2, c351180Dpk, strLLJJJIL5, awS15S0600000_5, interfaceC351200Dpm, 0));
                            }
                        };
                        if (((Boolean) C275380Aqm.LIZ.getValue()).booleanValue()) {
                            nLEErrorLLJJIJIL = LLJJJ(nLETrackSlotLLJJI.getUUID(), resourceFile, strLLJJJIL5, iNLEMediaReverseOnProgressChanged, iNLEMediaReverseOnDone);
                        } else {
                            nLEErrorLLJJIJIL = LLJJIJIL(resourceFile, strLLJJJIL5, iNLEMediaReverseOnProgressChanged, iNLEMediaReverseOnDone);
                        }
                        if (nLEErrorLLJJIJIL != NLEError.SUCCESS) {
                            if (interfaceC351200Dpm != null) {
                                interfaceC351200Dpm.LIZIZ(-1);
                                interfaceC351200Dpm.LIZJ();
                                return;
                            }
                            return;
                        }
                        if (interfaceC351200Dpm != null) {
                            interfaceC351200Dpm.LIZLLL();
                            return;
                        }
                        return;
                    }
                    c351180Dpk.LIZ = strLLJJJIL5;
                    awS15S0600000_5.invoke();
                }
            }
        }
    }

    @Override // X.InterfaceC354900Dvk
    public final boolean LLIL(EnumC356070Dxd enumC356070Dxd) throws IOException {
        NLETrackSlot nLETrackSlotLLJJI;
        NLEResourceAV aVFile;
        String resourceFile;
        boolean z;
        int layer;
        long maxEnd;
        long maxEnd2;
        AbstractC349500Dn2 businessTrackLinkageManager;
        INLEMattingRuntime mattingApi;
        NLETrack nLETrackLLJJIII = LLJJIII();
        if (nLETrackLLJJIII == null || (nLETrackSlotLLJJI = LLJJI()) == null) {
            return false;
        }
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLJJI.deepClone(true));
        NLESegmentAIMatting segment = null;
        if (nLETrackSlotDynamicCast == null) {
            return false;
        }
        nLETrackSlotDynamicCast.setStartTime(nLETrackSlotLLJJI.getEndTime());
        nLETrackSlotDynamicCast.setEndTime(nLETrackSlotDynamicCast.getStartTime() + nLETrackSlotLLJJI.getDuration());
        NLEFilter audioFilter = nLETrackSlotDynamicCast.getAudioFilter();
        if (audioFilter != null) {
            audioFilter.setStartTime(nLETrackSlotDynamicCast.getStartTime());
            audioFilter.setEndTime(nLETrackSlotDynamicCast.getEndTime());
        }
        nLETrackSlotDynamicCast.setExtra("is_editorpro_copy_video_clip", "1");
        NLEAIMatting aIMatting = nLETrackSlotLLJJI.getAIMatting();
        if (aIMatting != null) {
            segment = aIMatting.getSegment();
        }
        if (nLETrackSlotLLJJI.getAIMatting() != null && nLETrackSlotDynamicCast.getAIMatting() != null && segment != null) {
            NLEAIMattingType nLEAIMattingType = NLEAIMattingType.TYPE_CUSTOM;
            if ((nLEAIMattingType.swigValue() & segment.getMattingType()) > 0) {
                int iSwigValue = nLEAIMattingType.swigValue() | NLEAIMattingType.TYPE_INTERACTIVE.swigValue();
                INLEMediaSession iNLEMediaSessionF1 = this.LIZ.f1();
                if (iNLEMediaSessionF1 != null && (mattingApi = iNLEMediaSessionF1.getMattingApi()) != null) {
                    mattingApi.copyMattingFile(segment.getWorkSpace(), nLETrackSlotLLJJI.getUUID(), nLETrackSlotDynamicCast.getUUID(), iSwigValue);
                }
            }
        }
        if (nLETrackLLJJIII.getMainTrack()) {
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(this.LIZ).deepClone());
            NLETrack mainTrack = LLZ().getMainTrack();
            if (mainTrack != null) {
                maxEnd = mainTrack.getMaxEnd();
            } else {
                maxEnd = 0;
            }
            C350110Do1.LJIIJJI(LLZ(), nLETrackSlotLLJJI, nLETrackSlotDynamicCast);
            nLETrackLLJJIII.addSlotAfterSlot(nLETrackSlotDynamicCast, nLETrackSlotLLJJI);
            C350110Do1.LJII(LLZ());
            this.LIZ.Rn().timeSort();
            TrackLinkageManagerProvider.Companion.getClass();
            TrackLinkageManagerProvider trackLinkageManagerProviderLIZ = C356700Dye.LIZ();
            if (trackLinkageManagerProviderLIZ != null && (businessTrackLinkageManager = trackLinkageManagerProviderLIZ.getBusinessTrackLinkageManager()) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C349470Dmz(null, nLETrackSlotDynamicCast, new Pair(-1, Integer.valueOf(nLETrackLLJJIII.getSlotIndex(nLETrackSlotDynamicCast))), null, 24));
                businessTrackLinkageManager.LIZJ(new C349510Dn3("add_video", arrayList, nLEModelDynamicCast));
            }
            NLETrack mainTrack2 = LLZ().getMainTrack();
            if (mainTrack2 != null) {
                maxEnd2 = mainTrack2.getMaxEnd();
            } else {
                maxEnd2 = 0;
            }
            if (maxEnd2 > maxEnd) {
                C351510DqH c351510DqH = C351510DqH.LIZ;
                C0E48 c0e48 = this.LIZ;
                c351510DqH.getClass();
                C351510DqH.LIZIZ(maxEnd, c0e48);
            }
            C350110Do1.LJFF(LLZ());
        } else {
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotDynamicCast.getMainSegment());
            if (nLESegmentVideoDynamicCast == null || (aVFile = nLESegmentVideoDynamicCast.getAVFile()) == null || (resourceFile = aVFile.getResourceFile()) == null) {
                return false;
            }
            NLETrack nLETrackLJIIZILJ = C351510DqH.LJIIZILJ(C351510DqH.LIZ, this.LIZ, nLETrackSlotDynamicCast.getStartTime(), resourceFile);
            List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(C350870DpF.LJI(this.LIZ));
            if (nLETrackLJIIZILJ == null) {
                z = true;
            } else {
                z = false;
            }
            if (listLJJLIIIJLJLI != null && !listLJJLIIIJLJLI.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJLJLI, 10));
                Iterator<NLETrack> it2 = listLJJLIIIJLJLI.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(it2.next().getLayer()));
                }
                Iterator it3 = arrayList2.iterator();
                if (it3.hasNext()) {
                    int iIntValue = ((Number) it3.next()).intValue();
                    while (it3.hasNext()) {
                        int iIntValue2 = ((Number) it3.next()).intValue();
                        if (iIntValue < iIntValue2) {
                            iIntValue = iIntValue2;
                        }
                    }
                    layer = iIntValue + 1;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                layer = 0;
            }
            if (!z && nLETrackLJIIZILJ != null) {
                layer = nLETrackLJIIZILJ.getLayer();
            }
            nLETrackSlotDynamicCast.setTransformZ(layer + 1);
            if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
                long jLJII = C351220Dpo.LJII(C350870DpF.LJI(this.LIZ));
                long endTime = nLETrackSlotDynamicCast.getEndTime();
                long j = endTime - jLJII;
                if (endTime > jLJII) {
                    nLETrackSlotDynamicCast.setEndTime(jLJII);
                    NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotDynamicCast.getMainSegment());
                    if (nLESegmentVideoDynamicCast2 != null) {
                        nLESegmentVideoDynamicCast2.setTimeClipEnd(nLESegmentVideoDynamicCast2.getTimeClipEnd() - j);
                    }
                }
            }
            if (nLETrackLJIIZILJ == null) {
                NLETrack nLETrack = new NLETrack();
                nLETrack.setLayer(layer);
                nLETrack.setExtra("track_type", "video");
                nLETrack.setExtraTrackType(NLETrackType.VIDEO);
                nLETrack.setMainTrack(false);
                nLETrack.addSlot(nLETrackSlotDynamicCast);
                nLETrack.setExtra("track_layer", String.valueOf(layer));
                nLETrack.setExtra("track_extra_pip", "true");
                LLZ().addTrack(nLETrack);
            } else {
                nLETrackLJIIZILJ.addSlot(nLETrackSlotDynamicCast);
            }
        }
        C350870DpF.LIZJ(this.LIZ, C051R.LIZIZ(new C0E1X(C0E1V.COPY.getNameId(), null, null, null, null, 30)));
        C350870DpF.LJIIIZ(this.LIZ, "select_slot_event", new C358740E4q(nLETrackSlotDynamicCast, 0, null, false, 0, 254));
        this.LIZ.getPlayer().LJIJI(nLETrackSlotDynamicCast.getStartTime() + ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(7);
        return true;
    }

    @Override // X.InterfaceC354900Dvk
    public final boolean LLILZ(EnumC356070Dxd enumC356070Dxd) {
        NLETrackSlot nLETrackSlotLLJJI;
        boolean z;
        boolean z2 = false;
        if (LLJJIII() == null || (nLETrackSlotLLJJI = LLJJI()) == null) {
            return false;
        }
        int iAbs = Math.abs(Boolean.compare(nLETrackSlotLLJJI.getMirror_X(), true));
        if (iAbs == 1) {
            z = true;
        } else {
            z = false;
        }
        nLETrackSlotLLJJI.setMirror_X(z);
        if (iAbs == 2) {
            z2 = true;
        }
        nLETrackSlotLLJJI.setMirror_Y(z2);
        LLJJ(null, enumC356070Dxd);
        return true;
    }

    public final float LLJJJJ(NLETrackSlot nLETrackSlot) {
        NLEStyCrop crop;
        float width = nLETrackSlot.getMainSegment().getResource().getWidth();
        float height = nLETrackSlot.getMainSegment().getResource().getHeight();
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null && (crop = nLESegmentVideoDynamicCast.getCrop()) != null) {
            float xRight = crop.getXRight() - crop.getXLeft();
            float yLower = crop.getYLower() - crop.getYUpper();
            if (!Float.isInfinite(xRight) && !Float.isNaN(xRight) && xRight != 0.0f) {
                width *= xRight;
            }
            if (!Float.isInfinite(yLower) && !Float.isNaN(yLower) && yLower != 0.0f) {
                height *= yLower;
            }
        }
        float canvasRatio = this.LIZ.LLFII().LJI().getModel().getCanvasRatio();
        if (canvasRatio == 0.0f) {
            canvasRatio = 0.5625f;
        }
        float f = width / height;
        if (f >= canvasRatio) {
            if (1.0f / f > canvasRatio) {
                return f;
            }
            return 1.0f / canvasRatio;
        }
        float f2 = 1.0f / f;
        if (f2 < canvasRatio) {
            return f2;
        }
        return canvasRatio;
    }

    public static int LLJJIJIIJIL(String str, String str2) {
        NLEError nLEErrorReverseAudio;
        if (str.length() != 0 && str2.length() != 0) {
            nLEErrorReverseAudio = NLEMediaReverseUtil.reverseAudio(str, str2);
        } else {
            NLELoggerListener logger = NLE.INSTANCE.getLogger();
            if (logger != null) {
                logger.onLog(LogLevel.LEVEL_ERROR, "reverseAudio: invalid file paths");
            }
            nLEErrorReverseAudio = NLEError.FAILED;
        }
        return nLEErrorReverseAudio.swigValue();
    }

    @Override // X.InterfaceC354900Dvk
    public final boolean LJLLI(EnumC356070Dxd enumC356070Dxd, InterfaceC349350Dmn interfaceC349350Dmn) {
        int i = C349360Dmo.LIZJ;
        return C350670Dov.LIZJ(this.LIZ, enumC356070Dxd, interfaceC349350Dmn, null, null, true);
    }

    public final String LLJJJIL(NLEResType nLEResType, String str) {
        File fileLIZJ;
        String str2;
        InterfaceC353240Dt4 interfaceC353240Dt4Ie = this.LIZ.Ie();
        if (interfaceC353240Dt4Ie != null && (fileLIZJ = interfaceC353240Dt4Ie.LIZJ()) != null) {
            Uri uriLJIILIIL = C2471909mP.LJIILIIL(str);
            C844470XAv.LIZ.getClass();
            String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(C20130113pb.LJ(new C0VSJ(C09N5.LIZ(C844470XAv.LIZ(), uriLJIILIIL))), ":", "_", false), ";", "", false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJJIFFI);
            sbLIZ.append("_Reverse.");
            if (nLEResType == NLEResType.VIDEO) {
                str2 = "mp4";
            } else {
                str2 = "wav";
            }
            sbLIZ.append(str2);
            C0VSJ c0vsj = new C0VSJ(fileLIZJ, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sourceFile =");
            sbLIZ2.append(str);
            sbLIZ2.append(" outputFile = ");
            sbLIZ2.append(c0vsj.getAbsolutePath());
            C355090Dw3.LIZIZ("---ReversePlay", C2188811AlT.LIZIZ(sbLIZ2));
            return c0vsj.getAbsolutePath();
        }
        return null;
    }

    @Override // X.InterfaceC354900Dvk
    public final void changeVolume(float f, EnumC356070Dxd enumC356070Dxd) {
        NLETrackSlot nLETrackSlotLLJJI;
        NLEKeyframe next;
        VecNLECommonKeyframe sortedCommonKeyframes;
        List<NLECommonKeyframe> listLJJLIIIJJIZ;
        NLESegmentAudio nLESegmentAudio;
        NLETrackSlot nLETrackSlotLIZ;
        NLESegment mainSegment;
        NLESegment mainSegment2;
        float fFloatValue;
        String strValueOf;
        NLETrack nLETrackLLJJIII = LLJJIII();
        if (nLETrackLLJJIII != null && (nLETrackSlotLLJJI = LLJJI()) != null) {
            if (nLETrackSlotLLJJI.hasExtra("slot_mute_volume")) {
                if (f == 0.0f) {
                    strValueOf = "1.0";
                } else {
                    strValueOf = String.valueOf(f);
                }
                nLETrackSlotLLJJI.setExtra("slot_mute_volume", strValueOf);
            }
            boolean zLLLFZ = C351220Dpo.LLLFZ(nLETrackSlotLLJJI);
            if (Boolean.parseBoolean(nLETrackLLJJIII.getExtra("is_maintrack_mute")) && !C351220Dpo.LLLFZ(nLETrackSlotLLJJI)) {
                nLETrackLLJJIII.setExtra("is_maintrack_mute", "false");
            }
            if (C350870DpF.LJIIIIZZ(nLETrackLLJJIII) == NLETrackType.VIDEO) {
                nLETrackLLJJIII.setExtra("track_extra_is_video_edit_volume", "true");
            } else if (C350870DpF.LJIIIIZZ(nLETrackLLJJIII) == NLETrackType.AUDIO) {
                nLETrackLLJJIII.setExtra("track_extra_is_audio_edit_volume", "true");
            }
            if (C351220Dpo.LLILLL(nLETrackLLJJIII) && nLETrackLLJJIII.getSortedSlots().size() > 1) {
                nLETrackLLJJIII.setExtra("AudioTrackType", "EDITOR_MUSIC");
            }
            if (C351220Dpo.LLILL(nLETrackLLJJIII) && nLETrackSlotLLJJI.hasExtra("volume_enhance_rate")) {
                nLETrackSlotLLJJI.setExtra("volume_before_enhance", String.valueOf(f));
                Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlotLLJJI.getExtra("volume_enhance_rate"));
                if (fLJIIIIZZ != null) {
                    fFloatValue = fLJIIIIZZ.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                C351220Dpo.LLLLLL(nLETrackSlotLLJJI.getMainSegment(), fFloatValue * f);
            } else {
                C351220Dpo.LLLLLL(nLETrackSlotLLJJI.getMainSegment(), f);
            }
            NLEModel nLEModelLLZ = LLZ();
            Pair pairLIZIZ = C350110Do1.LIZIZ(nLEModelLLZ, nLETrackSlotLLJJI);
            NLETrackSlot nLETrackSlot = (NLETrackSlot) pairLIZIZ.getFirst();
            pairLIZIZ.getSecond();
            if (nLETrackSlot != null && (mainSegment2 = nLETrackSlot.getMainSegment()) != null) {
                C351220Dpo.LLLLLL(mainSegment2, f);
            }
            C350110Do1.LIZJ.getClass();
            NLETrack nLETrackLIZ = C346960Diw.LIZ(nLEModelLLZ);
            if (nLETrackLIZ != null && (nLETrackSlotLIZ = C347000Dj0.LIZ(nLETrackLIZ, nLETrackSlotLLJJI)) != null) {
                if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null) {
                    C351220Dpo.LLLLLL(mainSegment, 0.0f);
                }
                C351220Dpo.LLLLLL(nLETrackSlotLIZ.getMainSegment(), f);
            }
            long jLLLLLLJ = C351220Dpo.LLLLLLJ(C350870DpF.LJ(this.LIZ));
            Object obj = null;
            if (this.LIZ.og().X5()) {
                this.LIZ.og().LLIILII(false);
                NLESegmentVideo nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlotLLJJI.getMainSegment());
                if (nLESegmentVideo != null) {
                    nLESegmentVideo.setEnableAudio(this.LIZ.og().LLILZLL());
                }
                NLETrackSlot nLETrackSlotAh = this.LIZ.og().Ah(jLLLLLLJ);
                if (nLETrackSlotAh != null) {
                    nLETrackSlotAh.removeExtraWithKey("slot_mute_volume");
                }
                if (zLLLFZ && f > 0.0f) {
                    for (NLETrackSlot nLETrackSlot2 : nLETrackSlotLLJJI.getKeyframes()) {
                        Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(nLETrackSlot2.getExtra("slot_mute_volume"));
                        if (fLJIIIIZZ2 != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment())) != null) {
                            nLESegmentAudio.setVolume(fLJIIIIZZ2.floatValue());
                        }
                    }
                    obj = null;
                    NLESegmentVideo nLESegmentVideo2 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlotLLJJI.getMainSegment());
                    if (nLESegmentVideo2 != null) {
                        nLESegmentVideo2.setEnableAudio(true);
                    }
                    if (C350110Do1.LJ(LLZ())) {
                        C350110Do1.LJIILIIL(LLZ(), nLETrackSlotLLJJI);
                    }
                }
            }
            InterfaceC351610DqR interfaceC351610DqROg = this.LIZ.og();
            NLEKeyframeType nLEKeyframeType = NLEKeyframeType.Volume;
            if (interfaceC351610DqROg.yv(nLEKeyframeType) || ((listLJJLIIIJJIZ = this.LIZ.og().LJJLIIIJJIZ(jLLLLLLJ)) != null && !listLJJLIIIJJIZ.isEmpty())) {
                this.LIZ.og().Xb(nLEKeyframeType, false);
                NLESegmentVideo nLESegmentVideo3 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(obj, nLETrackSlotLLJJI.getMainSegment());
                if (nLESegmentVideo3 != null) {
                    nLESegmentVideo3.setEnableAudio(this.LIZ.og().LLILZLL());
                }
                if (zLLLFZ && f > 0.0f) {
                    Iterator<NLEKeyframe> it2 = nLETrackSlotLLJJI.getSwingKeyframes().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (NLEKeyframeType.Volume == next.getKeyframeType()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    NLEKeyframe nLEKeyframe = next;
                    if (nLEKeyframe != null && (sortedCommonKeyframes = nLEKeyframe.getSortedCommonKeyframes()) != null) {
                        for (NLECommonKeyframe nLECommonKeyframe : sortedCommonKeyframes) {
                            if (C2327809Ae.LJIIIIZZ(nLECommonKeyframe.getExtra("slot_mute_volume")) != null) {
                                VecDouble vecDouble = new VecDouble();
                                vecDouble.add(Double.valueOf(r0.floatValue()));
                                nLECommonKeyframe.setValue(vecDouble);
                            }
                        }
                    }
                    NLESegmentVideo nLESegmentVideo4 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlotLLJJI.getMainSegment());
                    if (nLESegmentVideo4 != null) {
                        nLESegmentVideo4.setEnableAudio(true);
                    }
                    if (C350110Do1.LJ(LLZ())) {
                        C350110Do1.LJIILIIL(LLZ(), nLETrackSlotLLJJI);
                    }
                }
            }
            if (nLETrackLLJJIII.getMainTrack() && (nLETrackLLJJIII.getTrackType() == NLETrackType.VIDEO || NLETrackType.AUDIO == nLETrackLLJJIII.getTrackType())) {
                VecNLETrackSlotSPtr slots = nLETrackLLJJIII.getSlots();
                if ((slots instanceof Collection) && slots.isEmpty()) {
                    nLETrackLLJJIII.setExtra("is_maintrack_mute", "true");
                } else {
                    Iterator<NLETrackSlot> it3 = slots.iterator();
                    while (it3.hasNext()) {
                        if (!C351220Dpo.LLLFZ(it3.next())) {
                            break;
                        }
                    }
                    nLETrackLLJJIII.setExtra("is_maintrack_mute", "true");
                }
            }
            LLJJ(null, enumC356070Dxd);
        }
    }

    @Override // X.InterfaceC354900Dvk
    public final void LJLLJ(C351630DqT c351630DqT, EnumC356070Dxd enumC356070Dxd, NLETrackSlot nLETrackSlot) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        if ((nLETrackSlot != null || (nLETrackSlot = LLJJI()) != null) && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
            if (c351630DqT == null) {
                C351510DqH.LIZ.getClass();
                C351510DqH.LJJJJ(nLESegmentVideoDynamicCast);
                EnumC356070Dxd enumC356070Dxd2 = EnumC356070Dxd.DONE;
                if (enumC356070Dxd2 == enumC356070Dxd) {
                    LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.DELETE_VIDEO_BG.getNameId(), null, null, null, null, 30)), enumC356070Dxd2);
                    return;
                } else {
                    LLJJ(null, enumC356070Dxd);
                    return;
                }
            }
            NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
            nLEStyCanvas.setType(NLECanvasType.IMAGE);
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceFile(c351630DqT.LIZ);
            nLEStyCanvas.setImage(nLEResourceNode);
            nLESegmentVideoDynamicCast.setCanvasStyle(nLEStyCanvas);
            EnumC356070Dxd enumC356070Dxd3 = EnumC356070Dxd.DONE;
            if (enumC356070Dxd3 == enumC356070Dxd) {
                LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.VIDEO_BG.getNameId(), null, null, null, null, 30)), enumC356070Dxd3);
            } else {
                LLJJ(null, enumC356070Dxd);
            }
        }
    }

    @Override // X.InterfaceC354900Dvk
    public final void LLFII(C351600DqQ c351600DqQ, EnumC356070Dxd enumC356070Dxd, Function1<? super NLETrackSlot, Unit> function1) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI != null) {
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLJJI.getMainSegment());
            NLEStyCrop nLEStyCrop = new NLEStyCrop();
            PointF pointF = c351600DqQ.LIZ;
            float f8 = 0.0f;
            if (pointF != null) {
                f = pointF.x;
            } else {
                f = 0.0f;
            }
            nLEStyCrop.setXLeft(f);
            PointF pointF2 = c351600DqQ.LIZ;
            if (pointF2 != null) {
                f2 = pointF2.y;
            } else {
                f2 = 0.0f;
            }
            nLEStyCrop.setYUpper(f2);
            PointF pointF3 = c351600DqQ.LIZJ;
            if (pointF3 != null) {
                f3 = pointF3.x;
            } else {
                f3 = 0.0f;
            }
            nLEStyCrop.setXLeftLower(f3);
            PointF pointF4 = c351600DqQ.LIZJ;
            if (pointF4 != null) {
                f4 = pointF4.y;
            } else {
                f4 = 0.0f;
            }
            nLEStyCrop.setYLeftLower(f4);
            PointF pointF5 = c351600DqQ.LIZIZ;
            if (pointF5 != null) {
                f5 = pointF5.x;
            } else {
                f5 = 0.0f;
            }
            nLEStyCrop.setXRightUpper(f5);
            PointF pointF6 = c351600DqQ.LIZIZ;
            if (pointF6 != null) {
                f6 = pointF6.y;
            } else {
                f6 = 0.0f;
            }
            nLEStyCrop.setYRightUpper(f6);
            PointF pointF7 = c351600DqQ.LIZLLL;
            if (pointF7 != null) {
                f7 = pointF7.x;
            } else {
                f7 = 0.0f;
            }
            nLEStyCrop.setXRight(f7);
            PointF pointF8 = c351600DqQ.LIZLLL;
            if (pointF8 != null) {
                f8 = pointF8.y;
            }
            nLEStyCrop.setYLower(f8);
            boolean z = true;
            if (nLESegmentVideoDynamicCast != null) {
                nLESegmentVideoDynamicCast.setIsWithEffect(true);
            }
            if ((Math.abs(nLETrackSlotLLJJI.getRotation()) != 90.0f && Math.abs(nLETrackSlotLLJJI.getRotation()) != 270.0f) || nLETrackSlotLLJJI.getScale() != LLJJJJ(nLETrackSlotLLJJI)) {
                z = false;
            }
            if (nLESegmentVideoDynamicCast != null) {
                nLESegmentVideoDynamicCast.setCrop(nLEStyCrop);
            }
            if (z) {
                nLETrackSlotLLJJI.setScale(LLJJJJ(nLETrackSlotLLJJI));
            }
            if (function1 != null) {
                function1.invoke(nLETrackSlotLLJJI);
            }
            LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.CROP.getNameId(), null, null, null, null, 30)), enumC356070Dxd);
            this.LIZ.getPlayer().LJJIIZ(Integer.valueOf(VEEditor.SEEK_MODE.EDITOR_REFRESH_MODE_FOECE.getValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c3  */
    @Override // X.InterfaceC354900Dvk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot> LLIIII(com.bytedance.ies.nle.editor_jni.NLETrackSlot r23, X.EnumC356070Dxd r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351560DqM.LLIIII(com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.0Dxd, boolean):kotlin.Pair");
    }

    @Override // X.InterfaceC354900Dvk
    public final void LLIIZ(boolean z, boolean z2, EnumC356070Dxd enumC356070Dxd) {
        String nameId;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot slotByIndex;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot next;
        VecNLETrackSlotSPtr sortedSlots2;
        float volume;
        float fDoubleValue;
        float volume2;
        NLEKeyframe next2;
        VecNLECommonKeyframe sortedCommonKeyframes;
        float fFloatValue;
        float fFloatValue2;
        float f;
        float fFloatValue3;
        this.LIZ.Rn().setExtra("is_maintrack_mute", String.valueOf(z));
        VecNLETrackSlotSPtr sortedSlots3 = this.LIZ.Rn().getSortedSlots();
        Float fValueOf = Float.valueOf(1.0f);
        if (sortedSlots3 != null) {
            for (NLETrackSlot nLETrackSlot : sortedSlots3) {
                NLESegmentVideo nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                if (z) {
                    if (nLESegmentVideo != null) {
                        volume = nLESegmentVideo.getVolume();
                    } else {
                        volume = 0.0f;
                    }
                    nLETrackSlot.setExtra("slot_mute_volume", String.valueOf(volume));
                    if (nLESegmentVideo != null) {
                        nLESegmentVideo.setVolume(0.0f);
                    }
                    for (NLETrackSlot nLETrackSlot2 : nLETrackSlot.getKeyframes()) {
                        NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment());
                        if (nLESegmentAudio != null) {
                            volume2 = nLESegmentAudio.getVolume();
                        } else {
                            volume2 = 0.0f;
                        }
                        nLETrackSlot2.setExtra("slot_mute_volume", String.valueOf(volume2));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("muteVolume open save keyframe volume ");
                        sbLIZ.append(volume2);
                        sbLIZ.append(" slot ");
                        sbLIZ.append(nLETrackSlot2.getUUID());
                        C355090Dw3.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment());
                        if (nLESegmentAudio2 != null) {
                            nLESegmentAudio2.setVolume(0.0f);
                        }
                    }
                    VecNLEKeyframe swingKeyframes = nLETrackSlot.getSwingKeyframes();
                    ArrayList arrayList = new ArrayList();
                    for (NLEKeyframe nLEKeyframe : swingKeyframes) {
                        if (nLEKeyframe.getKeyframeType() == NLEKeyframeType.Volume) {
                            arrayList.add(nLEKeyframe);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        VecNLECommonKeyframe sortedCommonKeyframes2 = ((NLEKeyframe) it2.next()).getSortedCommonKeyframes();
                        if (sortedCommonKeyframes2 != null) {
                            for (NLECommonKeyframe nLECommonKeyframe : sortedCommonKeyframes2) {
                                Double d = (Double) C13LP.LJJJLL(nLECommonKeyframe.getValue());
                                if (d != null) {
                                    fDoubleValue = (float) d.doubleValue();
                                } else {
                                    fDoubleValue = 1.0f;
                                }
                                nLECommonKeyframe.setExtra("slot_mute_volume", String.valueOf(fDoubleValue));
                                VecDouble vecDouble = new VecDouble();
                                vecDouble.add(Double.valueOf(0.0d));
                                nLECommonKeyframe.setValue(vecDouble);
                            }
                        }
                    }
                } else {
                    Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("slot_mute_volume"));
                    if (fLJIIIIZZ == null || fLJIIIIZZ.floatValue() <= 0.0f) {
                        fLJIIIIZZ = fValueOf;
                    }
                    if (nLESegmentVideo != null) {
                        if (C351220Dpo.LLI(nLETrackSlot)) {
                            fFloatValue3 = fLJIIIIZZ.floatValue();
                        } else {
                            fFloatValue3 = 0.0f;
                        }
                        nLESegmentVideo.setVolume(fFloatValue3);
                        if (z2) {
                            nLESegmentVideo.setEnableAudio(true);
                        }
                    }
                    for (NLETrackSlot nLETrackSlot3 : nLETrackSlot.getKeyframes()) {
                        Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(nLETrackSlot3.getExtra("slot_mute_volume"));
                        if (fLJIIIIZZ2 != null) {
                            fFloatValue2 = fLJIIIIZZ2.floatValue();
                            if (fFloatValue2 < 0.0f) {
                                fFloatValue2 = 1.0f;
                            }
                        } else {
                            fFloatValue2 = 1.0f;
                        }
                        NLESegmentVideo nLESegmentVideo2 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot3.getMainSegment());
                        if (nLESegmentVideo2 != null) {
                            if (C351220Dpo.LLI(nLETrackSlot)) {
                                f = fFloatValue2;
                            } else {
                                f = 0.0f;
                            }
                            nLESegmentVideo2.setVolume(f);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("muteVolume close reset  keyframe volume ");
                            sbLIZ2.append(nLESegmentVideo2.getVolume());
                            sbLIZ2.append("  ");
                            sbLIZ2.append(fFloatValue2);
                            sbLIZ2.append("  slot ");
                            sbLIZ2.append(nLETrackSlot3.getUUID());
                            C355090Dw3.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                            nLESegmentVideo2.setEnableAudio(true);
                        }
                    }
                    Iterator<NLEKeyframe> it3 = nLETrackSlot.getSwingKeyframes().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (next2.getKeyframeType() == NLEKeyframeType.Volume) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    NLEKeyframe nLEKeyframe2 = next2;
                    if (nLEKeyframe2 != null && (sortedCommonKeyframes = nLEKeyframe2.getSortedCommonKeyframes()) != null) {
                        for (NLECommonKeyframe nLECommonKeyframe2 : sortedCommonKeyframes) {
                            Float fLJIIIIZZ3 = C2327809Ae.LJIIIIZZ(nLECommonKeyframe2.getExtra("slot_mute_volume"));
                            if (fLJIIIIZZ3 != null) {
                                fFloatValue = fLJIIIIZZ3.floatValue();
                                if (fFloatValue < 0.0f) {
                                    fFloatValue = 1.0f;
                                }
                            } else {
                                fFloatValue = 1.0f;
                            }
                            if (!C351220Dpo.LLI(nLETrackSlot)) {
                                fFloatValue = 0.0f;
                            }
                            VecDouble vecDouble2 = new VecDouble();
                            vecDouble2.add(Double.valueOf(fFloatValue));
                            nLECommonKeyframe2.setValue(vecDouble2);
                        }
                    }
                }
            }
        }
        NLEModel nLEModelLLZ = LLZ();
        NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModelLLZ);
        if (nLETrackLIZ != null && (sortedSlots = nLETrackLIZ.getSortedSlots()) != null) {
            int i = 0;
            for (NLETrackSlot nLETrackSlot4 : sortedSlots) {
                int i2 = i + 1;
                if (i >= 0) {
                    NLETrackSlot nLETrackSlot5 = nLETrackSlot4;
                    NLESegmentAudio nLESegmentAudio3 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot5.getMainSegment());
                    if (nLESegmentAudio3 != null) {
                        if (z) {
                            nLETrackSlot5.setExtra("slot_mute_volume", String.valueOf(nLESegmentAudio3.getVolume()));
                            nLETrackSlot5.clearKeyframe();
                            nLETrackSlot5.clearSwingKeyframe();
                            nLESegmentAudio3.setVolume(0.0f);
                        } else {
                            Float fLJIIIIZZ4 = C2327809Ae.LJIIIIZZ(nLETrackSlot5.getExtra("slot_mute_volume"));
                            if (fLJIIIIZZ4 == null || fLJIIIIZZ4.floatValue() <= 0.0f) {
                                fLJIIIIZZ4 = fValueOf;
                            }
                            nLESegmentAudio3.setVolume(fLJIIIIZZ4.floatValue());
                            NLETrack mainTrack2 = nLEModelLLZ.getMainTrack();
                            if (mainTrack2 != null && (sortedSlots2 = mainTrack2.getSortedSlots()) != null) {
                                Iterator<NLETrackSlot> it4 = sortedSlots2.iterator();
                                while (it4.hasNext()) {
                                    next = it4.next();
                                    if (next.getStartTime() == nLETrackSlot5.getStartTime()) {
                                        break;
                                    }
                                }
                                next = null;
                                C349070DmL.LIZIZ(nLETrackSlot5, next);
                            } else {
                                next = null;
                                C349070DmL.LIZIZ(nLETrackSlot5, next);
                            }
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C350110Do1.LIZJ.getClass();
        NLETrack nLETrackLIZ2 = C346960Diw.LIZ(nLEModelLLZ);
        if (nLETrackLIZ2 != null && (mainTrack = nLEModelLLZ.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot6 : slots) {
                NLETrackSlot nLETrackSlotLIZ = C347000Dj0.LIZ(nLETrackLIZ2, nLETrackSlot6);
                if (nLETrackSlotLIZ != null) {
                    int iLIZJ = C350110Do1.LIZJ(nLEModelLLZ, nLETrackSlot6);
                    NLETrack nLETrackLIZ3 = C346780Die.LIZ(nLEModelLLZ);
                    if (nLETrackLIZ3 != null && (slotByIndex = nLETrackLIZ3.getSlotByIndex(iLIZJ)) != null) {
                        C351220Dpo.LLLLLL(slotByIndex.getMainSegment(), 0.0f);
                        slotByIndex.clearKeyframe();
                        slotByIndex.clearSwingKeyframe();
                    } else {
                        NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot6.getMainSegment()).setEnableAudio(false);
                    }
                    NLESegmentAudio nLESegmentAudio4 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlotLIZ.getMainSegment());
                    if (nLESegmentAudio4 != null) {
                        if (z) {
                            nLETrackSlotLIZ.setExtra("slot_mute_volume", String.valueOf(nLESegmentAudio4.getVolume()));
                            nLESegmentAudio4.setVolume(0.0f);
                            nLETrackSlotLIZ.clearKeyframe();
                            nLETrackSlotLIZ.clearSwingKeyframe();
                        } else {
                            Float fLJIIIIZZ5 = C2327809Ae.LJIIIIZZ(nLETrackSlotLIZ.getExtra("slot_mute_volume"));
                            if (fLJIIIIZZ5 == null || fLJIIIIZZ5.floatValue() <= 0.0f) {
                                fLJIIIIZZ5 = fValueOf;
                            }
                            nLESegmentAudio4.setVolume(fLJIIIIZZ5.floatValue());
                            C349070DmL.LIZIZ(nLETrackSlotLIZ, nLETrackSlot6);
                        }
                    }
                }
            }
        }
        if (z) {
            nameId = C0E1V.CLOSE_VOLUME.getNameId();
        } else {
            nameId = C0E1V.OPEN_VOLUME.getNameId();
        }
        LLJJ(C051R.LIZIZ(new C0E1X(nameId, null, null, null, null, 30)), enumC356070Dxd);
        this.LIZ.og().LJIILIIL(C352310DrZ.LIZLLL(C350870DpF.LJ(this.LIZ)));
    }

    @Override // X.InterfaceC354900Dvk
    public final void LLIZ(NLETrackSlot nLETrackSlot, float f, EnumC356070Dxd enumC356070Dxd) {
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            nLESegmentVideoDynamicCast.setAlpha(f);
        }
        if (this.LIZ.og().X5()) {
            this.LIZ.og().LLIILII(false);
        }
        LLJJ(null, enumC356070Dxd);
    }

    public final NLEError LLJJIJIL(String str, String str2, INLEMediaReverseOnProgressChanged iNLEMediaReverseOnProgressChanged, INLEMediaReverseOnDone iNLEMediaReverseOnDone) {
        File fileLIZLLL;
        String absolutePath;
        InterfaceC353240Dt4 interfaceC353240Dt4Ie = this.LIZ.Ie();
        if (interfaceC353240Dt4Ie != null) {
            fileLIZLLL = interfaceC353240Dt4Ie.LIZLLL();
        } else {
            fileLIZLLL = null;
        }
        C351510DqH c351510DqH = C351510DqH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (fileLIZLLL == null || (absolutePath = fileLIZLLL.getAbsolutePath()) == null) {
            absolutePath = "";
        }
        sbLIZ.append(absolutePath);
        sbLIZ.append(File.separator);
        return C351510DqH.LJIJJLI(c351510DqH, str, str2, C2188811AlT.LIZIZ(sbLIZ), iNLEMediaReverseOnProgressChanged, iNLEMediaReverseOnDone);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, com.bytedance.ies.nle.editor_jni.NLETrack] */
    /* JADX WARN: Type inference failed for: r3v57, types: [T, com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
    @Override // X.InterfaceC354900Dvk
    public final EnumC356180Dxo LLILLJJLI(AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, Function2 function2, EnumC356070Dxd enumC356070Dxd, C351590DqP c351590DqP) {
        T t;
        String resourceFile;
        long jLLLLLLJ;
        long maxEnd;
        boolean z;
        NLECurveSpeedCalculator nLECurveSpeedCalculator;
        long startTime;
        long timeClipEnd;
        boolean z2;
        int i;
        int i2;
        long measuredEndTime;
        boolean z3;
        NLENode nLENode;
        String uuid;
        NLETrackSlot nLETrackSlotLJL;
        long endTime;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile2;
        NLETrackSlot nLETrackSlot = c351590DqP.LIZ;
        boolean z4 = c351590DqP.LIZIZ;
        Long l = c351590DqP.LIZJ;
        boolean z5 = c351590DqP.LIZLLL;
        boolean z6 = c351590DqP.LJ;
        boolean z7 = c351590DqP.LJFF;
        C259800zU c259800zU = new C259800zU();
        if (nLETrackSlot == null) {
            NLETrackSlot nLETrackSlotLLJJI = LLJJI();
            t = nLETrackSlotLLJJI;
            if (nLETrackSlotLLJJI == null) {
                return EnumC356180Dxo.NOT_SELECT_SLOT;
            }
        } else {
            t = nLETrackSlot;
        }
        c259800zU.element = t;
        C259800zU c259800zU2 = new C259800zU();
        NLETrack trackBySlot = LLZ().getTrackBySlot(nLETrackSlot);
        ?? r1 = trackBySlot;
        if (trackBySlot == null) {
            NLETrack nLETrackLLJJIII = LLJJIII();
            r1 = nLETrackLLJJIII;
            if (nLETrackLLJJIII == null) {
                return EnumC356180Dxo.NOT_SELECT_SLOT;
            }
        }
        c259800zU2.element = r1;
        this.LJFF = r1;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) ((NLETrackSlot) c259800zU.element).getMainSegment());
        if (nLESegmentVideoDynamicCast == null) {
            return EnumC356180Dxo.NOT_SELECT_SLOT;
        }
        NLETrackSlot renderProxy = ((NLETrackSlot) c259800zU.element).getRenderProxy();
        if (renderProxy != null && (mainSegment = renderProxy.getMainSegment()) != null && (resource = mainSegment.getResource()) != null && (resourceFile2 = resource.getResourceFile()) != null && resourceFile2.length() != 0) {
            resourceFile = ((NLETrackSlot) c259800zU.element).getRenderProxy().getMainSegment().getResource().getResourceFile();
        } else {
            NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
            if (resource2 != null) {
                resourceFile = resource2.getResourceFile();
            }
            return EnumC356180Dxo.NOT_SELECT_SLOT;
        }
        if (resourceFile != null) {
            C01GW<C365840EVy> c01gw = C365840EVy.LIZIZ;
            C351010DpT.LIZ().getClass();
            C558340Lv6 c558340Lv6LIZLLL = C20137613qo.LIZ.LIZLLL(resourceFile);
            if (c558340Lv6LIZLLL.LJIIJ && awS549S0100000_5 != null) {
                awS549S0100000_5.invoke();
            }
            if (l != null) {
                jLLLLLLJ = l.longValue();
            } else {
                jLLLLLLJ = C351220Dpo.LLLLLLJ(this.LIZLLL.Jh());
            }
            final boolean mainTrack = ((NLETrack) c259800zU2.element).getMainTrack();
            NLETrack mainTrack2 = C350870DpF.LJI(this.LIZ).getMainTrack();
            if (mainTrack2 != null) {
                maxEnd = mainTrack2.getMaxEnd();
            } else {
                maxEnd = 0;
            }
            if (jLLLLLLJ >= ((NLETimeSpaceNode) c259800zU.element).getStartTime() && jLLLLLLJ <= ((NLETimeSpaceNode) c259800zU.element).getEndTime()) {
                z = false;
            } else {
                z = true;
            }
            if (!mainTrack) {
                if (z) {
                    endTime = ((NLETimeSpaceNode) c259800zU.element).getEndTime();
                } else {
                    endTime = jLLLLLLJ;
                }
                if (maxEnd - endTime < 100000) {
                    C372670EjJ.LIZ(2131834095);
                    return EnumC356180Dxo.FAIL_TO_SPLIT;
                }
            }
            if (z) {
                timeClipEnd = nLESegmentVideoDynamicCast.getTimeClipEnd();
            } else {
                long duration = ((NLETimeSpaceNode) c259800zU.element).getDuration();
                VecNLEPointSPtr seqCurveSpeedPoints = nLESegmentVideoDynamicCast.getSeqCurveSpeedPoints();
                if (seqCurveSpeedPoints != null && !seqCurveSpeedPoints.isEmpty()) {
                    nLECurveSpeedCalculator = new NLECurveSpeedCalculator(seqCurveSpeedPoints);
                    nLECurveSpeedCalculator.setSeqDuration(duration);
                } else {
                    nLECurveSpeedCalculator = null;
                }
                long timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
                if (nLECurveSpeedCalculator != null) {
                    startTime = nLECurveSpeedCalculator.sequenceDelToSegmentDel(jLLLLLLJ - ((NLETimeSpaceNode) c259800zU.element).getStartTime());
                } else {
                    startTime = (long) ((jLLLLLLJ - ((NLETimeSpaceNode) c259800zU.element).getStartTime()) / ((NLETimeSpaceNode) c259800zU.element).getSpeed());
                }
                timeClipEnd = timeClipStart + startTime;
            }
            int slotIndex = ((NLETrack) c259800zU2.element).getSlotIndex((NLETrackSlot) c259800zU.element);
            if (slotIndex < 0 && (nLENode = (NLENode) c259800zU.element) != null && (uuid = nLENode.getUUID()) != null && (nLETrackSlotLJL = C351220Dpo.LJL(LLZ(), uuid)) != null) {
                slotIndex = ((NLETrack) c259800zU2.element).getSlotIndex(nLETrackSlotLJL);
            }
            this.LJ = slotIndex + 1;
            final C013C c013c = new C013C();
            if (!mainTrack && ((NLETrack) c259800zU2.element).getSlots().size() > this.LJ && ((NLETrack) c259800zU2.element).getSortedSlots().get(this.LJ).getStartTime() - ((NLETimeSpaceNode) c259800zU.element).getMeasuredEndTime() < TimeUnit.MILLISECONDS.toMicros(LivePreCreateNextRoomPlayer.ENABLE)) {
                z2 = true;
            } else {
                z2 = false;
            }
            c013c.element = z2;
            final C259800zU c259800zU3 = new C259800zU();
            C013C c013c2 = new C013C();
            C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = jLLLLLLJ;
            final C259800zU c259800zU4 = new C259800zU();
            final C259800zU c259800zU5 = new C259800zU();
            if (!z) {
                if (((NLETimeSpaceNode) c259800zU.element).getMeasuredEndTime() - jLLLLLLJ > 100000 && jLLLLLLJ - ((NLETimeSpaceNode) c259800zU.element).getStartTime() > 100000) {
                    if (c013c.element && !LLJJIJI()) {
                        return EnumC356180Dxo.FAIL_TO_ADD_PIP;
                    }
                    if (z4) {
                        int i3 = C349360Dmo.LIZJ;
                        if (!C350670Dov.LIZJ(this.LIZ, EnumC356070Dxd.NONE, new InterfaceC349350Dmn() { // from class: X.0Dmm
                            public final /* synthetic */ int LIZLLL = LivePreCreateNextRoomPlayer.ENABLE;

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.InterfaceC349350Dmn
                            public final void LIZ(NLETrackSlot nLETrackSlot2, NLETrackSlot nLETrackSlot3) {
                                if (c013c.element) {
                                    c259800zU3.element = nLETrackSlot3;
                                } else if (!mainTrack) {
                                    long startTime2 = nLETrackSlot3.getStartTime();
                                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                    nLETrackSlot3.setStartTime(startTime2 + timeUnit.toMicros(this.LIZLLL));
                                    nLETrackSlot3.setEndTime(nLETrackSlot3.getEndTime() + timeUnit.toMicros(this.LIZLLL));
                                }
                                nLETrackSlot3.setExtra("freeze_ref_video_uuid", nLETrackSlot2.getUUID());
                                c259800zU4.element = nLETrackSlot2;
                                c259800zU5.element = nLETrackSlot3;
                            }
                        }, (NLETrackSlot) c259800zU.element, Long.valueOf(C351220Dpo.LLLLLLL(jLLLLLLJ)), false)) {
                            return EnumC356180Dxo.FAIL_TO_SPLIT;
                        }
                    }
                } else {
                    if (((NLETimeSpaceNode) c259800zU.element).getMeasuredEndTime() - jLLLLLLJ >= jLLLLLLJ - ((NLETimeSpaceNode) c259800zU.element).getStartTime()) {
                        c013c2.element = true;
                        if (this.LJ >= 2) {
                            measuredEndTime = ((NLETrack) c259800zU2.element).getSortedSlots().get(this.LJ - 2).getMeasuredEndTime();
                        } else {
                            measuredEndTime = 0;
                        }
                        if (!mainTrack && ((NLETimeSpaceNode) c259800zU.element).getStartTime() - measuredEndTime < TimeUnit.MILLISECONDS.toMicros(LivePreCreateNextRoomPlayer.ENABLE)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c013c.element = z3;
                        c238400w2.element = ((NLETimeSpaceNode) c259800zU.element).getStartTime() - TimeUnit.MILLISECONDS.toMicros(LivePreCreateNextRoomPlayer.ENABLE);
                        c259800zU4.element = LLJJI();
                        if (c238400w2.element < 0) {
                            c238400w2.element = 0L;
                        }
                    }
                    if (c013c.element && !LLJJIJI()) {
                        return EnumC356180Dxo.FAIL_TO_ADD_PIP;
                    }
                }
            }
            int i4 = c558340Lv6LIZLLL.LIZLLL;
            if (i4 != 90 && i4 != 270) {
                i = c558340Lv6LIZLLL.LIZIZ;
            } else {
                i = c558340Lv6LIZLLL.LIZJ;
            }
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = i;
            C118300cf c118300cf2 = new C118300cf();
            int i5 = c558340Lv6LIZLLL.LIZLLL;
            if (i5 != 90 && i5 != 270) {
                i2 = c558340Lv6LIZLLL.LIZJ;
            } else {
                i2 = c558340Lv6LIZLLL.LIZIZ;
            }
            c118300cf2.element = i2;
            boolean zLLIL = C351220Dpo.LLIL((NLETrackSlot) c259800zU.element);
            int i6 = i / 2;
            if (zLLIL) {
                c118300cf.element = i6;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C351820Dqm(z, this, c259800zU, c118300cf, c118300cf2, z4, c558340Lv6LIZLLL, awS549S0100000_52, zLLIL, i6, z5, timeClipEnd, nLESegmentVideoDynamicCast, resourceFile, c259800zU3, c259800zU2, jLLLLLLJ, mainTrack, LivePreCreateNextRoomPlayer.ENABLE, c013c2, c238400w2, c013c, z6, c259800zU4, z7, c259800zU5, function2, null), 3);
            return EnumC356180Dxo.SUCCESS;
        }
        return EnumC356180Dxo.NOT_SELECT_SLOT;
    }

    public final NLEError LLJJJ(String str, String str2, String str3, final INLEMediaReverseOnProgressChanged iNLEMediaReverseOnProgressChanged, final INLEMediaReverseOnDone iNLEMediaReverseOnDone) {
        File fileLIZLLL;
        String absolutePath;
        Size size;
        InterfaceC353240Dt4 interfaceC353240Dt4Ie = this.LIZ.Ie();
        if (interfaceC353240Dt4Ie != null) {
            fileLIZLLL = interfaceC353240Dt4Ie.LIZLLL();
        } else {
            fileLIZLLL = null;
        }
        INLEMediaOnProgressChanged iNLEMediaOnProgressChanged = new INLEMediaOnProgressChanged() { // from class: X.0DqN
            @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnProgressChanged
            public final void onChanged(double d) {
                iNLEMediaReverseOnProgressChanged.onChanged(d);
            }
        };
        INLEMediaOnDone iNLEMediaOnDone = new INLEMediaOnDone() { // from class: X.0DqO
            @Override // com.bytedance.ies.nle.editor_jni.INLEMediaOnDone
            public final void onDone(int i) {
                iNLEMediaReverseOnDone.onDone(i);
            }
        };
        C351510DqH c351510DqH = C351510DqH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (fileLIZLLL == null || (absolutePath = fileLIZLLL.getAbsolutePath()) == null) {
            absolutePath = "";
        }
        sbLIZ.append(absolutePath);
        sbLIZ.append(File.separator);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c351510DqH.getClass();
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str2);
        if (videoFileInfo == null) {
            iNLEMediaOnDone.onDone(NLEError.FILE_ACCESS_ERROR.ordinal());
        } else {
            int i = videoFileInfo.rotation;
            if (i != 90 && i != 270) {
                size = new Size(videoFileInfo.width, videoFileInfo.height);
            } else {
                size = new Size(videoFileInfo.height, videoFileInfo.width);
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(videoFileInfo.duration);
            NLEModel nLEModel = new NLEModel();
            NLETrack nLETrack = new NLETrack();
            nLETrack.setMainTrack(true);
            NLETrackSlot nLETrackSlot = new NLETrackSlot();
            NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
            nLESegmentVideo.setTimeClipStart(0L);
            nLESegmentVideo.setTimeClipEnd(micros);
            nLESegmentVideo.setVolume(1.0f);
            nLESegmentVideo.setRewind(true);
            NLEResourceAV nLEResourceAV = new NLEResourceAV();
            nLEResourceAV.setResourceType(NLEResType.VIDEO);
            nLEResourceAV.setResourceFile(str2);
            nLEResourceAV.setDuration(timeUnit.toMicros(videoFileInfo.duration));
            nLESegmentVideo.setReversedAVFile(nLEResourceAV);
            nLETrackSlot.setMainSegment(nLESegmentVideo);
            nLETrackSlot.setStartTime(0L);
            nLETrackSlot.setEndTime(micros - 0);
            nLETrack.addSlotAtEnd(nLETrackSlot);
            nLEModel.addTrack(nLETrack);
            Size sizeLIZJ = C351510DqH.LIZJ(new Size(-1, -1), size, new Size(1080, 1920));
            NLEMediaReverse nLEMediaReverse = new NLEMediaReverse();
            NLEError nLEErrorStartReverse = nLEMediaReverse.startReverse(nLEModel, str3, iNLEMediaOnProgressChanged, iNLEMediaOnDone, strLIZIZ, sizeLIZJ.getWidth(), sizeLIZJ.getHeight(), true);
            if (nLEErrorStartReverse != NLEError.SUCCESS) {
                iNLEMediaOnDone.onDone(nLEErrorStartReverse.ordinal());
            } else {
                this.LJIIIIZZ.put(str, new C443120HZe<>(nLEMediaReverse, iNLEMediaOnProgressChanged, iNLEMediaOnDone));
            }
        }
        return NLEError.SUCCESS;
    }
}
