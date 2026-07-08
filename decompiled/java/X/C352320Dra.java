package X;

import android.graphics.PointF;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C352320Dra {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(InterfaceC1455860nzM interfaceC1455860nzM) {
        interfaceC1455860nzM.tH1(C364410EQl.LIZIZ());
    }

    public static void LIZLLL(InterfaceC1455860nzM interfaceC1455860nzM, float f) {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ2;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor2;
        NLEModel model;
        NLEModel nLEModelLIZ;
        VecNLETrackSlotSPtr slots;
        NLENode nLENode;
        NLETrack next;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots2;
        NLETrackSlot nLETrackSlot;
        AbstractC1452680nuE abstractC1452680nuEGc = interfaceC1455860nzM.gc();
        if (abstractC1452680nuEGc != null && (interfaceC1452170ntPLJIJ2 = abstractC1452680nuEGc.LJIJ()) != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ2)) != null && (nLEEditor2 = c348100DkmLIZIZ2.LIZ) != null && (model = nLEEditor2.getModel()) != null) {
            NLETrack mainTrack2 = model.getMainTrack();
            if (mainTrack2 != null && (slots = mainTrack2.getSlots()) != null && (nLENode = (NLENode) C13LP.LJJJLL(slots)) != null && nLENode.hasExtra("extra_has_style_conversion")) {
                nLENode.removeExtraWithKey("extra_has_style_conversion");
                NLEModel model2 = nLEEditor2.getModel();
                if (model2 != null && (mainTrack = model2.getMainTrack()) != null && (slots2 = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots2)) != null) {
                    if (nLETrackSlot.hasExtra("extra_sc_original_video_duration")) {
                        nLETrackSlot.removeExtraWithKey("extra_sc_original_video_duration");
                    }
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null) {
                        nLESegmentVideoDynamicCast.clearCurveSpeedPoint();
                        if (nLESegmentVideoDynamicCast.getAbsSpeed() != 1.0f) {
                            nLESegmentVideoDynamicCast.setAbsSpeed(1.0f);
                        }
                        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + ((long) ((nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / nLESegmentVideoDynamicCast.getCurveAveSpeed())));
                    }
                }
                C348970DmB.LIZIZ(nLEEditor2);
                Iterator<NLETrack> it2 = nLEEditor2.getModel().getTracks().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "DUB")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLETrack nLETrack = next;
                if (nLETrack != null && nLETrack.hasExtra("extra_sc_disable_dub")) {
                    nLETrack.setEnable(true);
                    nLETrack.removeExtraWithKey("extra_sc_disable_dub");
                }
            }
            InterfaceC1452170ntP value = interfaceC1455860nzM.g().getValue();
            if (value != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null) {
                C349080DmM.LJIIJ(nLEModelLIZ, f);
                C349080DmM.LIZLLL(nLEModelLIZ);
            }
            nLEEditor2.commit();
        }
        LIZJ(interfaceC1455860nzM);
        AbstractC1452680nuE abstractC1452680nuEGc2 = interfaceC1455860nzM.gc();
        if (abstractC1452680nuEGc2 != null && (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc2.LJIJ()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            nLEEditor.commit();
        }
    }

    public static void LJ(InterfaceC1455860nzM interfaceC1455860nzM, Effect effect) {
        byte[] bArrLIZJ = null;
        if (effect == null) {
            AbstractC1452680nuE abstractC1452680nuEGc = interfaceC1455860nzM.gc();
            if (abstractC1452680nuEGc != null) {
                abstractC1452680nuEGc.LJJIII(null);
                return;
            }
            return;
        }
        String effectId = effect.getEffectId();
        String strLIZ = C352370Drf.LIZ(effect);
        String unzipPath = effect.getUnzipPath();
        InterfaceC1452170ntP value = interfaceC1455860nzM.g().getValue();
        if (value == null) {
            return;
        }
        int duration = value.getDuration();
        C2296208zA.LIZ().getClass();
        if (unzipPath != null) {
            bArrLIZJ = C2299808zk.LJFF.getValue().LIZ.LIZJ(unzipPath);
        }
        AudioEffectParam audioEffectParam = new AudioEffectParam(effectId, 0, 0, unzipPath, strLIZ, 0, duration, bArrLIZJ, null, new ArrayList());
        AbstractC1452680nuE abstractC1452680nuEGc2 = interfaceC1455860nzM.gc();
        if (abstractC1452680nuEGc2 == null) {
            return;
        }
        abstractC1452680nuEGc2.LJJIII(audioEffectParam);
    }

    public static void LIZ(Effect effect, float f, InterfaceC1455860nzM interfaceC1455860nzM, Function2 function2) {
        NLEModel nLEModelLIZ;
        InterfaceC1452170ntP value = interfaceC1455860nzM.g().getValue();
        if (value != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null) {
            C349080DmM.LJIIJ(nLEModelLIZ, f);
            C349080DmM.LIZLLL(nLEModelLIZ);
        }
        String effectId = effect.getEffectId();
        String strLIZ = C352370Drf.LIZ(effect);
        String unzipPath = effect.getUnzipPath();
        InterfaceC1452170ntP value2 = interfaceC1455860nzM.g().getValue();
        if (value2 != null && unzipPath.length() > 0) {
            int duration = value2.getDuration();
            C2296208zA.LIZ().getClass();
            AudioEffectParam audioEffectParam = new AudioEffectParam(effectId, 0, 0, unzipPath, strLIZ, 0, duration, C2299808zk.LJFF.getValue().LIZ.LIZJ(unzipPath), null, new ArrayList());
            audioEffectParam.setShowErrorToast(true);
            audioEffectParam.setResId(effect.getResource_id());
            audioEffectParam.setPanel(effect.getPanel());
            interfaceC1455860nzM.tH1(C364410EQl.LIZ(true, audioEffectParam));
            if (function2 != null) {
                function2.invoke(effect, audioEffectParam);
            }
        }
    }

    public static void LIZIZ(C19536311c1 c19536311c1, float f, InterfaceC1455860nzM interfaceC1455860nzM, Function2 function2) {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        String str;
        List<? extends List<Double>> list;
        VEUtils.VEAudioFileInfo audioFileInfo;
        int i;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        NLETrackSlot nLETrackSlotLIZIZ;
        NLETrack next;
        Long lValueOf;
        NLETrack mainTrack2;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot2;
        NLESegment mainSegment;
        NLEResourceNode resource;
        NLEResType resourceType;
        boolean zLLJJIJI;
        NLETrack next2;
        long duration;
        double dLongValue;
        VecNLETrackSlotSPtr slots2;
        NLETrackSlot nLETrackSlot3;
        NLESegment mainSegment2;
        double dDoubleValue;
        double dDoubleValue2;
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ2;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor2;
        if (C1664460tPo.LJFF(c19536311c1.LIZJ)) {
            EnumC356240Dxu enumC356240Dxu = EnumC356240Dxu.EDIT;
            AbstractC1452680nuE abstractC1452680nuEGc = interfaceC1455860nzM.gc();
            if (abstractC1452680nuEGc != null && (interfaceC1452170ntPLJIJ2 = abstractC1452680nuEGc.LJIJ()) != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ2)) != null && (nLEEditor2 = c348100DkmLIZIZ2.LIZ) != null) {
                LIZJ(interfaceC1455860nzM);
                if (c19536311c1.LIZIZ != null) {
                    C349080DmM.LIZIZ(c19536311c1, nLEEditor2, enumC356240Dxu, false);
                    if (function2 != null) {
                        function2.invoke(c19536311c1.LIZJ, null);
                        return;
                    }
                    return;
                }
                if (c19536311c1.LIZ == null) {
                    return;
                }
                C349080DmM.LIZ(c19536311c1, enumC356240Dxu);
                NLEModel model2 = nLEEditor2.getModel();
                String strLJ = C348930Dm7.LJ(c19536311c1.LIZ);
                if (strLJ != null) {
                    ArrayList arrayList = new ArrayList();
                    VecNLETrackSPtr tracks = model2.getTracks();
                    ArrayList arrayList2 = new ArrayList();
                    for (NLETrack nLETrack : tracks) {
                        if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "AUDIO_RECORD")) {
                            arrayList2.add(nLETrack);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        VecNLETrackSlotSPtr slots3 = ((NLETrack) it2.next()).getSlots();
                        ArrayList arrayList3 = new ArrayList();
                        for (NLETrackSlot nLETrackSlot4 : slots3) {
                            if (Intrinsics.LJFF(C348930Dm7.LJ(nLETrackSlot4), strLJ)) {
                                arrayList3.add(nLETrackSlot4);
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(it3.next());
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            C19536311c1 c19536311c12 = new C19536311c1((NLETrackSlot) it4.next(), c19536311c1.LIZJ, null);
                            c19536311c12.LJ = c19536311c1.LJ;
                            C349080DmM.LIZ(c19536311c12, enumC356240Dxu);
                        }
                    }
                }
                if (function2 == null) {
                    return;
                }
                function2.invoke(c19536311c1.LIZJ, null);
                return;
            }
            return;
        }
        if (C1664460tPo.LIZLLL(c19536311c1.LIZJ)) {
            EnumC356240Dxu enumC356240Dxu2 = EnumC356240Dxu.EDIT;
            AbstractC1452680nuE abstractC1452680nuEGc2 = interfaceC1455860nzM.gc();
            if (abstractC1452680nuEGc2 == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc2.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null || (str = c19536311c1.LJ) == null || (list = c19536311c1.LJFF) == null || (audioFileInfo = VEUtils.getAudioFileInfo(str)) == null || (i = audioFileInfo.duration) == 0 || (mainTrack = model.getMainTrack()) == null || (sortedSlots = mainTrack.getSortedSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) == null) {
                return;
            }
            NLEModel model3 = nLEEditor.getModel();
            if (C351220Dpo.LLIFFJFJJ(nLETrackSlot)) {
                nLETrackSlotLIZIZ = C348930Dm7.LIZIZ(model3, nLETrackSlot);
                if (nLETrackSlotLIZIZ == null) {
                    return;
                }
            } else {
                nLETrackSlotLIZIZ = nLETrackSlot;
            }
            LIZLLL(interfaceC1455860nzM, f);
            Long lValueOf2 = Long.valueOf(i);
            System.currentTimeMillis();
            NLEModel model4 = nLEEditor.getModel();
            if (model4 != null && Long.valueOf(model4.getEndTime()) != null && !list.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Iterator<? extends List<Double>> it5 = list.iterator();
                int i2 = 0;
                while (true) {
                    if (it5.hasNext()) {
                        List<Double> next3 = it5.next();
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            List<Double> list2 = next3;
                            if (list2.size() != 2) {
                                break;
                            }
                            if (i2 != 1 || ((Number) ListProtector.get(list2, 0)).doubleValue() != 0.0d || ((Number) ListProtector.get(list2, 1)).doubleValue() != 0.0d) {
                                arrayList4.add(ListProtector.get(list2, 0));
                                arrayList5.add(ListProtector.get(list2, 1));
                            }
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    } else if (arrayList4.size() == arrayList5.size() && arrayList4.size() > 1) {
                        if (nLEEditor.getModel() != null) {
                            double endTime = r0.getEndTime() / 1000000.0d;
                            if (lValueOf2 != null) {
                                dLongValue = lValueOf2.longValue() / 1000.0d;
                            } else {
                                Iterator<NLETrack> it6 = nLEEditor.getModel().getTracks().iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        next2 = it6.next();
                                        if (Intrinsics.LJFF(next2.getExtra("AudioTrackType"), "BGM")) {
                                            break;
                                        }
                                    } else {
                                        next2 = null;
                                        break;
                                    }
                                }
                                NLETrack nLETrack2 = next2;
                                if (nLETrack2 != null && (slots2 = nLETrack2.getSlots()) != null && (nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLL(slots2)) != null && (mainSegment2 = nLETrackSlot3.getMainSegment()) != null) {
                                    duration = mainSegment2.getDuration();
                                } else {
                                    duration = 0;
                                }
                                dLongValue = duration / 1000000.0d;
                            }
                            Double d = (Double) C13LP.LJJLIIIJL(arrayList4);
                            if (d != null) {
                                dDoubleValue = d.doubleValue();
                            } else {
                                dDoubleValue = 0.0d;
                            }
                            Double d2 = (Double) C13LP.LJJLIIIJL(arrayList5);
                            if (d2 != null) {
                                dDoubleValue2 = d2.doubleValue();
                            } else {
                                dDoubleValue2 = 0.0d;
                            }
                            if (dDoubleValue < endTime && dDoubleValue2 < dLongValue) {
                                arrayList4.add(Double.valueOf(endTime));
                                arrayList5.add(Double.valueOf(dLongValue));
                            }
                        }
                        ArrayList<PointF> arrayList6 = new ArrayList();
                        double dDoubleValue3 = ((Number) ListProtector.get(arrayList5, arrayList5.size() - 1)).doubleValue();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("input video duration ");
                        NLEModel model5 = nLEEditor.getModel();
                        if (model5 != null) {
                            lValueOf = Long.valueOf(model5.getEndTime());
                        } else {
                            lValueOf = null;
                        }
                        sbLIZ.append(lValueOf);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C352330Drb c352330Drb = new C352330Drb();
                        int size = arrayList4.size() - 1;
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                int i5 = i4 + 1;
                                double dDoubleValue4 = (((Number) ListProtector.get(arrayList4, i5)).doubleValue() - ((Number) ListProtector.get(arrayList4, i4)).doubleValue()) / (((Number) ListProtector.get(arrayList5, i5)).doubleValue() - ((Number) ListProtector.get(arrayList5, i4)).doubleValue());
                                if (dDoubleValue4 < 0.0d) {
                                    break;
                                }
                                double dDoubleValue5 = ((Number) ListProtector.get(arrayList5, i4)).doubleValue();
                                C352340Drc c352340Drc = new C352340Drc(dDoubleValue4, dDoubleValue5, ((Number) ListProtector.get(arrayList5, i5)).doubleValue());
                                C352340Drc c352340Drc2 = c352330Drb.LIZ;
                                if (c352340Drc2 == null) {
                                    c352330Drb.LIZ = c352340Drc;
                                } else if (Math.abs(c352340Drc2.LIZ - dDoubleValue4) > 2.0E-5d) {
                                    ((ArrayList) c352330Drb.LIZIZ).add(c352340Drc2);
                                    c352330Drb.LIZ = c352340Drc;
                                } else if (dDoubleValue5 - c352340Drc2.LIZJ > 0.0d) {
                                    ((ArrayList) c352330Drb.LIZIZ).add(c352340Drc2);
                                    c352330Drb.LIZ = c352340Drc;
                                } else {
                                    c352340Drc2.LIZJ = c352340Drc.LIZJ;
                                }
                                i4 = i5;
                            } else {
                                C352340Drc c352340Drc3 = c352330Drb.LIZ;
                                if (c352340Drc3 != null) {
                                    ((ArrayList) c352330Drb.LIZIZ).add(c352340Drc3);
                                }
                                for (C352340Drc c352340Drc4 : (ArrayList) c352330Drb.LIZIZ) {
                                    double d3 = c352340Drc4.LIZIZ;
                                    double d4 = c352340Drc4.LIZJ;
                                    double d5 = c352340Drc4.LIZ;
                                    int i6 = 1;
                                    do {
                                        PointF pointF = new PointF((float) (((((double) (i6 - 1)) * ((d4 - d3) / 3.0d)) + d3) / dDoubleValue3), (float) d5);
                                        arrayList6.add(pointF);
                                        String.valueOf(pointF);
                                        i6++;
                                    } while (i6 < 4);
                                    arrayList6.add(new PointF((float) ((d3 + (((d4 - d3) / 30.0d) * 29.0d)) / dDoubleValue3), (float) d5));
                                }
                                NLEModel model6 = nLEEditor.getModel();
                                if (model6 != null && (mainTrack2 = model6.getMainTrack()) != null && (slots = mainTrack2.getSlots()) != null && (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(slots)) != null && (mainSegment = nLETrackSlot2.getMainSegment()) != null && (resource = mainSegment.getResource()) != null && (resourceType = resource.getResourceType()) != null && C347860DkO.LIZ[resourceType.ordinal()] == 1) {
                                    nLETrackSlot2.setExtra("extra_sc_original_video_duration", String.valueOf(nLETrackSlot2.getEndTime() - nLETrackSlot2.getStartTime()));
                                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
                                    if (nLESegmentVideoDynamicCast != null) {
                                        nLESegmentVideoDynamicCast.clearCurveSpeedPoint();
                                        for (PointF pointF2 : arrayList6) {
                                            NLEPoint nLEPoint = new NLEPoint();
                                            nLEPoint.setX(pointF2.x);
                                            nLEPoint.setY(pointF2.y);
                                            nLESegmentVideoDynamicCast.addCurveSpeedPoint(nLEPoint);
                                        }
                                        if (nLESegmentVideoDynamicCast.getAbsSpeed() != 1.0f) {
                                            nLESegmentVideoDynamicCast.setAbsSpeed(1.0f);
                                        }
                                        nLETrackSlot2.setEndTime(nLETrackSlot2.getStartTime() + ((long) ((nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / nLESegmentVideoDynamicCast.getCurveAveSpeed())));
                                        NLETrack mainTrack3 = nLEEditor.getModel().getMainTrack();
                                        if (mainTrack3 != null) {
                                            zLLJJIJI = C351220Dpo.LLJJIJI(mainTrack3);
                                        } else {
                                            zLLJJIJI = false;
                                        }
                                        if (C351230Dpp.LIZLLL(Boolean.valueOf(zLLJJIJI))) {
                                            nLETrackSlot2.adjustSwingKeyframeForAllType(100L);
                                        } else {
                                            nLETrackSlot2.adjustKeyFrame(100L);
                                        }
                                        nLEEditor.commit();
                                    }
                                }
                                if (nLEEditor.getModel() != null) {
                                    double endTime2 = r0.getEndTime() / 1000000.0d;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("warped video actual duration ");
                                    sbLIZ2.append(endTime2);
                                    sbLIZ2.append(",  loss is ");
                                    sbLIZ2.append(endTime2 - dDoubleValue3);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                }
                                System.currentTimeMillis();
                            }
                        }
                    }
                }
            }
            C348970DmB.LIZIZ(nLEEditor);
            C19536311c1 c19536311c13 = new C19536311c1(null, c19536311c1.LIZJ, C348930Dm7.LJII(nLETrackSlotLIZIZ));
            c19536311c13.LJ = c19536311c1.LJ;
            nLETrackSlot.setExtra("extra_has_style_conversion", "true");
            C349080DmM.LIZIZ(c19536311c13, nLEEditor, enumC356240Dxu2, false);
            VecNLETrackSPtr tracks2 = nLEEditor.getModel().getTracks();
            ArrayList arrayList7 = new ArrayList();
            for (NLETrack nLETrack3 : tracks2) {
                if (Intrinsics.LJFF(nLETrack3.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
                    arrayList7.add(nLETrack3);
                }
            }
            Iterator it7 = arrayList7.iterator();
            while (it7.hasNext()) {
                for (NLETrackSlot nLETrackSlot5 : ((NLETrack) it7.next()).getSortedSlots()) {
                    if (C351220Dpo.LLLFFI(nLETrackSlot5)) {
                        nLETrackSlot5.setExtra("extra_is_vc_slot_mute", "true");
                        NLESegment mainSegment3 = nLETrackSlot5.getMainSegment();
                        if (mainSegment3 != null) {
                            C351220Dpo.LLLLLJLJLL(mainSegment3);
                        }
                    }
                }
            }
            Iterator<NLETrack> it8 = nLEEditor.getModel().getTracks().iterator();
            while (true) {
                if (it8.hasNext()) {
                    next = it8.next();
                    if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "DUB")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack4 = next;
            if (nLETrack4 != null) {
                nLETrack4.setEnable(false);
                nLETrack4.setExtra("extra_sc_disable_dub", "1");
            }
            nLEEditor.commit();
            if (function2 == null) {
                return;
            }
            function2.invoke(c19536311c1.LIZJ, null);
            return;
        }
        LIZ(c19536311c1.LIZJ, f, interfaceC1455860nzM, function2);
    }
}
