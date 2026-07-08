package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTemplate;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0nqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450190nqD {
    public AbstractC1450210nqF LIZ;
    public final C1450180nqC LIZIZ;

    public final void LIZ() {
        long duration;
        Long lValueOf;
        VecNLETrackSPtr tracks;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        VecNLETrackSlotSPtr childElementLists;
        NLETrackSlot nLETrackSlot2;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZIZ.LJ;
        NLEModel nLEModelLIZ = interfaceC1452170ntP != null ? C352130DrH.LIZ(interfaceC1452170ntP) : null;
        SrcLiveVideoInfo srcLiveInfo = this.LIZIZ.LIZ.getSrcLiveInfo();
        if (srcLiveInfo == null || srcLiveInfo.getDuration() <= 0) {
            duration = 3000000;
        } else {
            SrcLiveVideoInfo srcLiveInfo2 = this.LIZIZ.LIZ.getSrcLiveInfo();
            duration = ((long) (srcLiveInfo2 != null ? srcLiveInfo2.getDuration() : 0)) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        StringBuilder sb = new StringBuilder("fit edit tracks to duration: ");
        sb.append(duration);
        sb.append(", ");
        if (nLEModelLIZ == null || (mainTrack = nLEModelLIZ.getMainTrack()) == null || (slots = mainTrack.getSlots()) == null) {
            lValueOf = null;
        } else {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            long duration2 = 0;
            while (it2.hasNext()) {
                duration2 += it2.next().getDuration();
            }
            lValueOf = Long.valueOf(duration2);
        }
        sb.append(lValueOf);
        C1450070nq1.LIZLLL(sb.toString());
        if (nLEModelLIZ != null && (tracks = nLEModelLIZ.getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                if (!nLETrack.getMainTrack()) {
                    nLETrack.setStartTime(0L);
                    nLETrack.setEndTime(duration);
                    nLETrack.setDuration(duration);
                    if (C351220Dpo.LLJI(nLETrack)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fit color filter: ");
                        sbLIZ.append(nLETrack);
                        C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLL(nLETrack.getSlots());
                        if (nLETimeSpaceNode != null) {
                            nLETimeSpaceNode.setStartTime(0L);
                            nLETimeSpaceNode.setEndTime(duration);
                            nLETimeSpaceNode.setDuration(duration);
                        }
                    } else if (C351220Dpo.LLJLILLLLZIIL(nLETrack) || C351220Dpo.LLLJL(nLETrack) || C351220Dpo.LLJJJJ(nLETrack) || C371780Ehs.LJIILL(nLETrack)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fit effect track: ");
                        sbLIZ2.append(nLETrack);
                        C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                        if (nLETrack.getSlots().size() == 1) {
                            NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) C13LP.LJJJJZI(nLETrack.getSlots());
                            if (nLETimeSpaceNode2.getStartTime() == 0 && nLETimeSpaceNode2.getEndTime() != duration) {
                                ((NLETimeSpaceNode) C13LP.LJJJJZI(nLETrack.getSlots())).setEndTime(duration);
                                ((NLETimeSpaceNode) C13LP.LJJJJZI(nLETrack.getSlots())).setDuration(duration);
                            }
                        }
                        if (nLETrack.getTrackType() == NLETrackType.STICKER && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots())) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && NLESegmentTemplate.dynamicCast(mainSegment) != null) {
                            VecNLETrackSlotSPtr slots2 = nLETrack.getSlots();
                            NLESegmentTemplate nLESegmentTemplateDynamicCast = NLESegmentTemplate.dynamicCast((slots2 == null || (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(slots2)) == null) ? null : nLETrackSlot2.getMainSegment());
                            if (nLESegmentTemplateDynamicCast != null && (childElementLists = nLESegmentTemplateDynamicCast.getChildElementLists()) != null) {
                                Iterator<NLETrackSlot> it3 = childElementLists.iterator();
                                while (it3.hasNext()) {
                                    NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast((NLENode) it3.next());
                                    if (nLETrackSlotDynamicCast != null && nLETrackSlotDynamicCast.getStartTime() == 0 && nLETrackSlotDynamicCast.getEndTime() != duration) {
                                        nLETrackSlotDynamicCast.setEndTime(duration);
                                        nLETrackSlotDynamicCast.setDuration(duration);
                                    }
                                    C1450070nq1.LIZLLL("isNewTextTemplateSegment is true");
                                }
                            }
                        }
                    } else if (nLETrack.getSlots().size() == 1) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fit other single track: ");
                        sbLIZ3.append(nLETrack);
                        C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ3));
                        NLETimeSpaceNode nLETimeSpaceNode3 = (NLETimeSpaceNode) C13LP.LJJJLL(nLETrack.getSlots());
                        if (nLETimeSpaceNode3 != null) {
                            nLETimeSpaceNode3.setStartTime(0L);
                            nLETimeSpaceNode3.setEndTime(duration);
                            nLETimeSpaceNode3.setDuration(duration);
                        }
                    } else if (nLETrack.getSlots().size() > 1) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("fit other multiple track: ");
                        sbLIZ4.append(nLETrack);
                        C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ4));
                        ArrayList arrayList = new ArrayList();
                        for (NLETrackSlot nLETrackSlot3 : nLETrack.getSlots()) {
                            if (nLETrackSlot3.getEndTime() > duration || nLETrackSlot3.getMeasuredEndTime() > duration) {
                                arrayList.add(nLETrackSlot3);
                            }
                        }
                        if (arrayList.size() > 0) {
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("remove slots before: ");
                            sbLIZ5.append(nLETrack);
                            C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ5));
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                nLETrack.removeSlot((NLETrackSlot) it4.next());
                            }
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("remove slots after: ");
                            sbLIZ6.append(nLETrack);
                            C1450070nq1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ6));
                        }
                    }
                }
            }
        }
        InterfaceC1452170ntP interfaceC1452170ntP2 = this.LIZIZ.LJ;
        if (interfaceC1452170ntP2 != null) {
            interfaceC1452170ntP2.jg();
        }
    }

    public final void LIZLLL(boolean z) {
        long maxTargetEnd;
        Number numberValueOf;
        NLEModel nLEModelLIZ;
        ArrayList<TextStickerModel> arrayList;
        CopyOnWriteArrayList<TextStickerModel> textStickerModels;
        AbstractC1450210nqF abstractC1450210nqF = this.LIZ;
        if (abstractC1450210nqF == null || (numberValueOf = abstractC1450210nqF.LIZLLL(this.LIZIZ)) == null) {
            InterfaceC1452170ntP interfaceC1452170ntP = this.LIZIZ.LJ;
            if (interfaceC1452170ntP != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null) {
                maxTargetEnd = nLEModelLIZ.getMaxTargetEnd();
            } else {
                maxTargetEnd = 0;
            }
            numberValueOf = Long.valueOf(maxTargetEnd);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" updateStickerDuration currentDuration = ");
        sbLIZ.append(numberValueOf);
        sbLIZ.append(", isCompileMode = ");
        sbLIZ.append(z);
        C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!z) {
            ImageStickerInfoNewEngine stickerInfoNewEngine = this.LIZIZ.LIZ.getStickerInfoNewEngine();
            if (stickerInfoNewEngine != null && (textStickerModels = stickerInfoNewEngine.getTextStickerModels()) != null) {
                arrayList = new ArrayList(textStickerModels);
            } else {
                arrayList = new ArrayList();
            }
            for (TextStickerModel textStickerModel : arrayList) {
                textStickerModel.getBaseStickerModel().setUiStartTime(0.0f);
                textStickerModel.getBaseStickerModel().setUiEndTime(numberValueOf.floatValue());
                textStickerModel.getBaseStickerModel().setStartTime(0.0f);
                textStickerModel.getBaseStickerModel().setEndTime(numberValueOf.floatValue());
            }
            for (StickerItemModel stickerItemModel : this.LIZIZ.LIZ.getStickerInfo().getStickers()) {
                stickerItemModel.uiStartTime = 0;
                stickerItemModel.uiEndTime = numberValueOf.intValue();
                stickerItemModel.startTime = 0;
                stickerItemModel.endTime = numberValueOf.intValue();
            }
        }
        LIZ();
    }

    public C1450190nqD(AbstractC1450210nqF abstractC1450210nqF, C1450180nqC c1450180nqC) {
        this.LIZ = abstractC1450210nqF;
        this.LIZIZ = c1450180nqC;
    }

    public final void LIZJ(AbstractC1450210nqF abstractC1450210nqF, InterfaceC1450310nqP interfaceC1450310nqP) {
        if (this.LIZ != null) {
            AbstractC1450210nqF.LJII(this.LIZIZ);
        }
        this.LIZ = abstractC1450210nqF;
        if (abstractC1450210nqF != null) {
            abstractC1450210nqF.LIZ(this.LIZIZ);
        }
        if (this.LIZ != null) {
            AbstractC1450210nqF.LJI(this.LIZIZ, true);
        }
        AbstractC1450210nqF abstractC1450210nqF2 = this.LIZ;
        if (abstractC1450210nqF2 != null) {
            abstractC1450210nqF2.LJFF(this.LIZIZ, interfaceC1450310nqP);
        }
        LIZLLL(false);
    }

    public static void LIZIZ(C1450190nqD c1450190nqD, boolean z, boolean z2, InterfaceC1450310nqP interfaceC1450310nqP, boolean z3, int i) {
        AbstractC1450210nqF abstractC1450210nqF;
        boolean z4 = true;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) == 0) {
            z4 = false;
        }
        if ((i & 8) != 0) {
            interfaceC1450310nqP = null;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if (z4 && c1450190nqD.LIZ != null) {
            AbstractC1450210nqF.LJII(c1450190nqD.LIZIZ);
        }
        AbstractC1450210nqF abstractC1450210nqF2 = c1450190nqD.LIZ;
        if (abstractC1450210nqF2 != null) {
            abstractC1450210nqF2.LIZ(c1450190nqD.LIZIZ);
        }
        if (z4 && c1450190nqD.LIZ != null) {
            AbstractC1450210nqF.LJI(c1450190nqD.LIZIZ, z2);
        }
        if (z && (abstractC1450210nqF = c1450190nqD.LIZ) != null) {
            abstractC1450210nqF.LJFF(c1450190nqD.LIZIZ, interfaceC1450310nqP);
        }
        c1450190nqD.LIZLLL(z3);
    }
}
