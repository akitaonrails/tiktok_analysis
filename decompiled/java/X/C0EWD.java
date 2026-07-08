package X;

import Y.ARunnableS14S0400000_5;
import android.app.Activity;
import android.os.Handler;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EWD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EWD {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIL;
    public final Activity LIZ;
    public final InterfaceC1455860nzM LIZIZ;
    public final InterfaceC1461350o8D LIZJ;
    public final InterfaceC366390EYb LIZLLL;
    public final InterfaceC366660EZc LJ;
    public final InterfaceC1455850nzL LJFF;
    public final Function0<VideoPublishEditModel> LJI;
    public Boolean LJIIIIZZ;
    public Boolean LJIIIZ;
    public ARunnableS14S0400000_5 LJIIJJI;
    public final C0EWE LJII = new InterfaceC608270NtR<Object, NLEModel>() { // from class: X.0EWE
        @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
        public final Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
            return C1414150mu5.LIZ;
        }

        @Override // X.InterfaceC608270NtR
        public final void setValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, NLEModel nLEModel) {
            C1414150mu5.LIZ = nLEModel;
        }
    };
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1264));

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C0EWD.class, "originalNleModel", "getOriginalNleModel()Lcom/bytedance/ies/nle/editor_jni/NLEModel;", 0);
        C13LE.LIZ.getClass();
        LJIIL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    public final NLEModel LJII() {
        C0EWE c0ewe = this.LJII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJIIL;
        c0ewe.getClass();
        return C1414150mu5.LIZ;
    }

    public static void LJ(NLETrack nLETrack) {
        NLEStyCanvas canvasStyle;
        if (nLETrack == null) {
            return;
        }
        nLETrack.clearVideoEffect();
        nLETrack.clearKeyframeSlot();
        nLETrack.clearFilter();
        VecNLETrackSlotSPtr slots = nLETrack.getSlots();
        if (slots != null) {
            for (NLETrackSlot nLETrackSlot : (ArrayList) C13LP.LJJJJLI(slots)) {
                nLETrackSlot.clearVideoAnim();
                NLECanvasType type = null;
                nLETrackSlot.setEndTransition(null);
                nLETrackSlot.clearVideoEffect();
                nLETrackSlot.clearMask();
                nLETrackSlot.clearKeyframe();
                nLETrackSlot.clearSwingKeyframe();
                nLETrackSlot.clearFilter();
                nLETrackSlot.clearChromaChannel();
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                if (nLESegmentVideoDynamicCast != null) {
                    NLEStyCanvas canvasStyle2 = nLESegmentVideoDynamicCast.getCanvasStyle();
                    if (canvasStyle2 != null) {
                        type = canvasStyle2.getType();
                    }
                    if (type == NLECanvasType.VIDEO_FRAME && (canvasStyle = nLESegmentVideoDynamicCast.getCanvasStyle()) != null) {
                        canvasStyle.setType(NLECanvasType.COLOR);
                    }
                }
                nLETrackSlot.setRotation(0.0f);
            }
        }
    }

    public static long LJI(NLEModel nLEModel) {
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            return mainTrack.getMeasuredEndTime();
        }
        return 0L;
    }

    public static boolean LJIIIIZZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        Iterator it3 = arrayList.iterator();
        int i = 0;
        while (it3.hasNext()) {
            if (NLESegmentVideo.dynamicCast((NLENode) ((NLETrackSlot) it3.next()).getMainSegment()) != null) {
                i++;
            }
        }
        if (i != 1) {
            return false;
        }
        return true;
    }

    public final void LJIIJJI(InterfaceC1446740nke interfaceC1446740nke) {
        NLEModel nLEModelLIZ;
        NLEModel nLEModelDynamicCast;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        VecNLETrackSPtr tracks;
        NLEModel nLEModelLJII;
        NLETrack mainTrack2;
        InterfaceC1452170ntP value = interfaceC1446740nke.g().getValue();
        if (value != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null && (nLEModelDynamicCast = NLEModel.dynamicCast(nLEModelLIZ.deepClone())) != null) {
            C0EWE c0ewe = this.LJII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LJIIL;
            c0ewe.getClass();
            C1414150mu5.LIZ = nLEModelDynamicCast;
            NLEModel nLEModelLJII2 = LJII();
            NLETrack mainTrack3 = null;
            if (nLEModelLJII2 != null && (mainTrack2 = nLEModelLJII2.getMainTrack()) != null) {
                mainTrack2.removeExtraWithKey("using_template_type");
                mainTrack2.removeExtraWithKey("using_template_id");
            }
            boolean zLJIIIIZZ = LJIIIIZZ(LJII());
            NLEModel nLEModelLJII3 = LJII();
            if (nLEModelLJII3 != null && (tracks = nLEModelLJII3.getTracks()) != null) {
                for (NLETrack nLETrack : tracks) {
                    if (nLETrack.getTrackType() != NLETrackType.VIDEO && nLETrack.getTrackType() != NLETrackType.MV && !C351220Dpo.LLLII(nLETrack) && (nLEModelLJII = LJII()) != null) {
                        nLEModelLJII.removeTrack(nLETrack);
                    }
                }
            }
            NLEModel nLEModelLJII4 = LJII();
            if (nLEModelLJII4 != null && (mainTrack = nLEModelLJII4.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
                for (NLETrackSlot nLETrackSlot : slots) {
                    if (!Intrinsics.LJFF(nLETrackSlot.getExtra("is_from_template"), "true")) {
                        LJIIJ(nLETrackSlot, zLJIIIIZZ, false);
                    }
                }
            }
            NLEModel nLEModelLJII5 = LJII();
            if (nLEModelLJII5 != null) {
                mainTrack3 = nLEModelLJII5.getMainTrack();
            }
            LJ(mainTrack3);
        }
    }

    public static void LIZ(NLETrack nLETrack, long j) {
        boolean z;
        if (nLETrack.getSlots().size() == 1) {
            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLZIJ(0, nLETrack.getSlots());
            if (nLETimeSpaceNode != null) {
                nLETimeSpaceNode.setEndTime(j);
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TemplateApplier#applyTemplate: slot: ");
                sbLIZ.append(nLETimeSpaceNode.getStartTime());
                sbLIZ.append(", ");
                sbLIZ.append(nLETimeSpaceNode.getEndTime());
                C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        Iterator<NLETrackSlot> it2 = nLETrack.getSlots().iterator();
        while (true) {
            if (it2.hasNext()) {
                NLETrackSlot next = it2.next();
                if (next.getStartTime() < j && next.getEndTime() > j) {
                    next.setEndTime(j);
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        VecNLETrackSlotSPtr slots = nLETrack.getSlots();
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot : slots) {
            if (nLETrackSlot.getStartTime() >= j) {
                arrayList.add(nLETrackSlot);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            nLETrack.removeSlot((NLETrackSlot) it3.next());
            C201955140j.LIZJ(C1398350mUb.LIZIZ, "TemplateApplier#applyTemplate: remove slot");
        }
        if (z) {
            return;
        }
        NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) C13LP.LJJJLZIJ(nLETrack.getSlots().size() - 1, nLETrack.getSlots());
        if (nLETimeSpaceNode2 == null) {
            return;
        }
        nLETimeSpaceNode2.setEndTime(j);
        C201955140j.LIZJ(C1398350mUb.LIZIZ, "TemplateApplier#applyTemplate, set last slot endTime");
    }

    public static void LJIIJ(NLETrackSlot nLETrackSlot, boolean z, boolean z2) {
        long micros;
        nLETrackSlot.setScale(1.0f);
        nLETrackSlot.setRelativeWidth(1.0f);
        nLETrackSlot.setRelativeHeight(1.0f);
        nLETrackSlot.setTransformX(0.0f);
        nLETrackSlot.setTransformY(0.0f);
        nLETrackSlot.getMainSegment();
        nLETrackSlot.setScale(1.0f);
        nLETrackSlot.setRelativeWidth(1.0f);
        nLETrackSlot.setRelativeHeight(1.0f);
        nLETrackSlot.setTransformX(0.0f);
        nLETrackSlot.setTransformY(0.0f);
        nLETrackSlot.clearVideoAnim();
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            nLESegmentVideoDynamicCast.setCrop(null);
            nLESegmentVideoDynamicCast.setClip(null);
            nLESegmentVideoDynamicCast.setAlpha(1.0f);
            VecNLEPointSPtr segCurveSpeedPoints = nLESegmentVideoDynamicCast.getSegCurveSpeedPoints();
            int i = 0;
            if (segCurveSpeedPoints != null && !segCurveSpeedPoints.isEmpty()) {
                nLESegmentVideoDynamicCast.setSegCurveSpeedPoints(new VecNLEPointSPtr());
            }
            VecNLEPointSPtr curveSpeedPoints = nLESegmentVideoDynamicCast.getCurveSpeedPoints();
            if (curveSpeedPoints != null && !curveSpeedPoints.isEmpty()) {
                nLESegmentVideoDynamicCast.setCurveSpeedPoints(new VecNLEPointSPtr());
            }
            NLEResourceAV aVFile = nLESegmentVideoDynamicCast.getAVFile();
            if (aVFile != null) {
                if (aVFile.getResourceType() == NLEResType.IMAGE) {
                    if (z) {
                        micros = TimeUnit.MILLISECONDS.toMicros(10000L);
                    } else {
                        micros = TimeUnit.MILLISECONDS.toMicros(3000L);
                    }
                } else if (z2) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    C2356009La c2356009La = C2356009La.LIZ;
                    String resourceFile = aVFile.getResourceFile();
                    c2356009La.getClass();
                    VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(resourceFile);
                    if (vEVideoFileInfoLIZ != null) {
                        i = vEVideoFileInfoLIZ.duration;
                    }
                    micros = timeUnit.toMicros(i);
                } else {
                    Long lValueOf = Long.valueOf(aVFile.getDuration());
                    if (lValueOf.longValue() > 0) {
                        micros = lValueOf.longValue();
                    } else {
                        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                        C2356009La c2356009La2 = C2356009La.LIZ;
                        String resourceFile2 = aVFile.getResourceFile();
                        c2356009La2.getClass();
                        VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ2 = C2356009La.LIZ(resourceFile2);
                        if (vEVideoFileInfoLIZ2 != null) {
                            i = vEVideoFileInfoLIZ2.duration;
                        }
                        micros = timeUnit2.toMicros(i);
                    }
                }
                if (micros > 0) {
                    nLESegmentVideoDynamicCast.setTimeClipStart(0L);
                    nLESegmentVideoDynamicCast.setTimeClipEnd(micros);
                    nLESegmentVideoDynamicCast.setSpeed(1.0f);
                    nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + micros);
                    aVFile.setDuration(micros);
                }
            }
        }
    }

    public final void LIZIZ(long j, NLEModel nLEModel, boolean z) {
        InterfaceC1455850nzL interfaceC1455850nzL;
        C385670FAf<InterfaceC1461660o8i> c385670FAfAT;
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ;
        C385670FAf<InterfaceC1461660o8i> c385670FAfAT2;
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ2;
        List<TextStickerData> listEt0;
        InterfaceC1455850nzL interfaceC1455850nzL2;
        C385670FAf<InterfaceC1461660o8i> c385670FAfAT3;
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ3;
        boolean z2;
        C385670FAf<InterfaceC1461650o8h> c385670FAfIz2;
        InterfaceC1461650o8h interfaceC1461650o8hLIZJ;
        C385670FAf<InterfaceC1461650o8h> c385670FAfIz22;
        InterfaceC1461650o8h interfaceC1461650o8hLIZJ2;
        InterfaceC1455850nzL interfaceC1455850nzL3;
        InterfaceC1461650o8h interfaceC1461650o8hLIZJ3;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getTrackType() == NLETrackType.STICKER && !Intrinsics.LJFF(nLETrack2.getExtra("is_from_template"), "true")) {
                arrayList.add(nLETrack);
            }
        }
        for (NLETrack nLETrack3 : (ArrayList) C13LP.LJJJJLI(arrayList)) {
            ArrayList arrayList2 = new ArrayList();
            VecNLETrackSlotSPtr slots = nLETrack3.getSlots();
            if (slots != null) {
                for (NLETrackSlot nLETrackSlot : (ArrayList) C13LP.LJJJJLI(slots)) {
                    if (nLETrackSlot != null && NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String strLJIIIZ = C348350DlB.LJIIIZ(nLETrackSlot);
                    if (C385050F7v.LJIIIZ(nLETrackSlot)) {
                        arrayList2.add(nLETrackSlot);
                    } else {
                        if (nLETrackSlot.getStartTime() >= j) {
                            arrayList2.add(nLETrackSlot);
                            if (z && (interfaceC1455850nzL3 = this.LJFF) != null && !z2 && strLJIIIZ != null && (interfaceC1461650o8hLIZJ3 = interfaceC1455850nzL3.Iz2().LIZJ()) != null) {
                                interfaceC1461650o8hLIZJ3.Qj(strLJIIIZ);
                            }
                        }
                        if (nLETrackSlot.getStartTime() < j && nLETrackSlot.getEndTime() > j) {
                            nLETrackSlot.setEndTime(j);
                            if (z && !z2 && strLJIIIZ != null) {
                                InterfaceC1455850nzL interfaceC1455850nzL4 = this.LJFF;
                                if (interfaceC1455850nzL4 != null && (c385670FAfIz22 = interfaceC1455850nzL4.Iz2()) != null && (interfaceC1461650o8hLIZJ2 = c385670FAfIz22.LIZJ()) != null) {
                                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                                    interfaceC1461650o8hLIZJ2.l0(new Pair<>(Integer.valueOf((int) timeUnit.toMillis(j)), Integer.valueOf((int) timeUnit.toMillis(j))));
                                }
                                InterfaceC1455850nzL interfaceC1455850nzL5 = this.LJFF;
                                if (interfaceC1455850nzL5 != null && (c385670FAfIz2 = interfaceC1455850nzL5.Iz2()) != null && (interfaceC1461650o8hLIZJ = c385670FAfIz2.LIZJ()) != null) {
                                    TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
                                    interfaceC1461650o8hLIZJ.nF0(strLJIIIZ, (int) timeUnit2.toMillis(j), (int) timeUnit2.toMillis(nLETrackSlot.getStartTime()));
                                }
                            }
                        }
                    }
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                nLETrack3.removeSlot((NLETrackSlot) it2.next());
            }
            VecNLETrackSlotSPtr slots2 = nLETrack3.getSlots();
            if (slots2 == null || slots2.isEmpty()) {
                nLEModel.removeTrack(nLETrack3);
            }
        }
        if (!z) {
            return;
        }
        int millis = (int) TimeUnit.MICROSECONDS.toMillis(j);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        InterfaceC1455850nzL interfaceC1455850nzL6 = this.LJFF;
        if (interfaceC1455850nzL6 != null && (c385670FAfAT2 = interfaceC1455850nzL6.AT()) != null && (interfaceC1461660o8iLIZJ2 = c385670FAfAT2.LIZJ()) != null && (listEt0 = interfaceC1461660o8iLIZJ2.Et0()) != null) {
            ArrayList arrayList5 = new ArrayList();
            for (TextStickerData textStickerData : listEt0) {
                if (!textStickerData.getCompatModel().isFromPugcTemplate()) {
                    arrayList5.add(textStickerData);
                }
            }
            ArrayList<TextStickerModel> arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                arrayList6.add(C0F7U.LJ((TextStickerData) it3.next(), null, 3));
            }
            boolean z3 = false;
            for (TextStickerModel textStickerModel : arrayList6) {
                if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                    arrayList3.add(Integer.valueOf(textStickerModel.getId()));
                } else {
                    float f = millis;
                    if (textStickerModel.getBaseStickerModel().getStartTime() >= f) {
                        arrayList3.add(Integer.valueOf(textStickerModel.getId()));
                    }
                    if (textStickerModel.getBaseStickerModel().getStartTime() < f && textStickerModel.getBaseStickerModel().getEndTime() > f) {
                        arrayList4.add(Integer.valueOf(textStickerModel.getId()));
                        z3 = true;
                    }
                }
            }
            if (z3 && (interfaceC1455850nzL2 = this.LJFF) != null && (c385670FAfAT3 = interfaceC1455850nzL2.AT()) != null && (interfaceC1461660o8iLIZJ3 = c385670FAfAT3.LIZJ()) != null) {
                interfaceC1461660o8iLIZJ3.LJJJJJ(millis);
            }
        }
        if ((!arrayList3.isEmpty()) && (interfaceC1455850nzL = this.LJFF) != null && (c385670FAfAT = interfaceC1455850nzL.AT()) != null && (interfaceC1461660o8iLIZJ = c385670FAfAT.LIZJ()) != null) {
            interfaceC1461660o8iLIZJ.ad(arrayList3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x044e A[LOOP:18: B:225:0x0448->B:227:0x044e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x064b A[PHI: r9
      0x064b: PHI (r9v4 boolean) = (r9v3 boolean), (r9v5 boolean) binds: [B:383:0x06fb, B:330:0x0649] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06f5  */
    /* JADX WARN: Type inference failed for: r4v30, types: [X.0FVq] */
    /* JADX WARN: Type inference failed for: r6v18, types: [X.0FVq] */
    /* JADX WARN: Type inference failed for: r7v10, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v13, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14, com.bytedance.ies.nle.editor_jni.NLEModel r15, boolean r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EWD.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:395:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0895 A[LOOP:17: B:441:0x088f->B:443:0x0895, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(boolean r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 2282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EWD.LJFF(boolean, boolean, boolean):java.lang.Object");
    }

    public final void LJIIIZ(InterfaceC366660EZc interfaceC366660EZc, C0E4T c0e4t, NLEModel nLEModel) {
        Handler handler = (Handler) this.LJIIJ.getValue();
        if (handler != null) {
            ARunnableS14S0400000_5 aRunnableS14S0400000_5 = this.LJIIJJI;
            if (aRunnableS14S0400000_5 != null) {
                handler.removeCallbacks(aRunnableS14S0400000_5);
            }
            ARunnableS14S0400000_5 aRunnableS14S0400000_52 = new ARunnableS14S0400000_5(this, interfaceC366660EZc, c0e4t, nLEModel, 9);
            this.LJIIJJI = aRunnableS14S0400000_52;
            handler.postDelayed(aRunnableS14S0400000_52, 200L);
            return;
        }
        interfaceC366660EZc.d10(true, c0e4t, nLEModel);
    }

    public final Object LIZJ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2) {
        float fFloatValue;
        Float fLJIIIIZZ;
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEModel.deepClone());
        if (nLEModelDynamicCast == null) {
            C098200Yq c098200Yq = new C098200Yq(new RuntimeException("apply template failed"));
            C189200o6.m2constructorimpl(c098200Yq);
            return c098200Yq;
        }
        if (z2 && videoPublishEditModel != null) {
            InterfaceC366390EYb interfaceC366390EYb = this.LIZLLL;
            if (interfaceC366390EYb != null && this.LJ != null) {
                interfaceC366390EYb.Aa2(this.LIZ, videoPublishEditModel, nLEModelDynamicCast);
                C0EZ1 c0ez1WM2 = this.LIZJ.WM2();
                if (c0ez1WM2 != null) {
                    c0ez1WM2.r(EnumC356070Dxd.COMMIT);
                }
                C0E4T c0e4tLX = interfaceC366390EYb.LX();
                if (C189200o6.m7isFailureimpl(LIZLLL(videoPublishEditModel, nLEModelDynamicCast, z))) {
                    C098200Yq c098200Yq2 = new C098200Yq(new RuntimeException("apply pugc template failed"));
                    C189200o6.m2constructorimpl(c098200Yq2);
                    return c098200Yq2;
                }
                C347840DkM.LIZJ(nLEModelDynamicCast);
                this.LIZLLL.tv2(nLEModelDynamicCast);
                videoPublishEditModel.setEditMusicSyncMode(false);
                NLETrack mainTrack = nLEModelDynamicCast.getMainTrack();
                if (mainTrack != null) {
                    mainTrack.removeExtraWithKey("ep_stick_point_switch");
                }
                LJIIIZ(this.LJ, c0e4tLX, NLEModel.dynamicCast(nLEModelDynamicCast.deepClone(false)));
                NLETrack mainTrack2 = nLEModelDynamicCast.getMainTrack();
                String extra = null;
                if (mainTrack2 != null) {
                    extra = mainTrack2.getExtra("biz_ugc_template_cover_time");
                }
                if (C298990Bnl.LIZ() && C123100dR.LIZ(extra)) {
                    if (extra != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra)) != null) {
                        fFloatValue = fLJIIIIZZ.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    videoPublishEditModel.setVideoCoverStartTm(fFloatValue);
                }
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                return unit;
            }
            C098200Yq c098200Yq3 = new C098200Yq(new RuntimeException("apply pugc template failed"));
            C189200o6.m2constructorimpl(c098200Yq3);
            return c098200Yq3;
        }
        return LIZLLL(videoPublishEditModel, nLEModelDynamicCast, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0EWE] */
    public C0EWD(Activity activity, InterfaceC1446740nke interfaceC1446740nke, InterfaceC1461350o8D interfaceC1461350o8D, InterfaceC366390EYb interfaceC366390EYb, InterfaceC366660EZc interfaceC366660EZc, InterfaceC1455850nzL interfaceC1455850nzL, Function0 function0) {
        this.LIZ = activity;
        this.LIZIZ = interfaceC1446740nke;
        this.LIZJ = interfaceC1461350o8D;
        this.LIZLLL = interfaceC366390EYb;
        this.LJ = interfaceC366660EZc;
        this.LJFF = interfaceC1455850nzL;
        this.LJI = function0;
    }
}
