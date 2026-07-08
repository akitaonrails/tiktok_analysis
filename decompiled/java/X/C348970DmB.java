package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348970DmB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(NLEEditor nLEEditor) {
        long maxEnd;
        NLEModel model = nLEEditor.getModel();
        if (model.getMainTrack() != null && C13LP.LJJJLL(model.getMainTrack().getSlots()) != null) {
            NLETrack mainTrack = model.getMainTrack();
            if (mainTrack != null) {
                maxEnd = mainTrack.getMaxEnd();
            } else {
                maxEnd = 0;
            }
            VecNLETrackSPtr tracks = model.getTracks();
            ArrayList<NLETrack> arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (!nLETrack.getMainTrack()) {
                    arrayList.add(nLETrack);
                }
            }
            for (NLETrack nLETrack2 : arrayList) {
                Iterator it2 = new C13EO(nLETrack2.getSlots()).iterator();
                while (true) {
                    C13EN c13en = (C13EN) it2;
                    if (c13en.hasNext()) {
                        NLETrackSlot nLETrackSlot = (NLETrackSlot) c13en.next();
                        if (((int) nLETrackSlot.getEndTime()) != -2 || nLETrackSlot.hasExtra("extra_sts_original_end_time")) {
                            if (nLETrackSlot.hasExtra("extra_sts_original_end_time") && nLETrackSlot.hasExtra("extra_sts_original_end_time")) {
                                nLETrackSlot.setEndTime(CastLongProtector.parseLong(nLETrackSlot.getExtra("extra_sts_original_end_time")));
                                nLETrackSlot.removeExtraWithKey("extra_sts_original_end_time");
                            }
                            if (nLETrackSlot.getEndTime() > maxEnd) {
                                if (nLETrackSlot.getStartTime() > maxEnd) {
                                    nLETrackSlot.setExtra("extra_sts_original_end_time", String.valueOf(nLETrackSlot.getEndTime()));
                                    nLETrackSlot.setEndTime(nLETrackSlot.getStartTime());
                                } else {
                                    LIZ(maxEnd, nLETrackSlot);
                                }
                            } else if (Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "ORIGIN") && Intrinsics.LJFF(C13LP.LJJLIIIJJI(nLETrack2.getSlots()), nLETrackSlot)) {
                                LIZ(maxEnd, nLETrackSlot);
                            }
                        }
                    }
                }
            }
        }
    }

    public static List LIZJ(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            arrayList.add(mainTrack);
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "ORIGIN")) {
                arrayList2.add(nLETrack);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        ArrayList arrayList3 = new ArrayList();
        for (NLETrack nLETrack2 : tracks2) {
            if (Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "DUB")) {
                arrayList3.add(nLETrack2);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next());
        }
        return arrayList;
    }

    public static boolean LIZLLL(NLEModel nLEModel) {
        ArrayList arrayList = (ArrayList) LIZJ(nLEModel);
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            if (slots != null && !slots.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static void LJFF(NLETrackSlot nLETrackSlot) {
        String extra;
        Float fLJIIIIZZ;
        if (nLETrackSlot.hasExtra("extra_sts_original_volume") && (extra = nLETrackSlot.getExtra("extra_sts_original_volume")) != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra)) != null) {
            float fFloatValue = fLJIIIIZZ.floatValue();
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null) {
                C351220Dpo.LLLLLL(mainSegment, fFloatValue);
            }
        }
    }

    public static void LIZ(long j, NLETrackSlot nLETrackSlot) {
        nLETrackSlot.setExtra("extra_sts_original_end_time", String.valueOf(nLETrackSlot.getEndTime()));
        nLETrackSlot.setEndTime(j);
    }

    public static NLEModel LJ(NLEModel nLEModel, Float f) {
        long maxEnd;
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        VecNLETrackSlotSPtr slots2;
        VecNLETrackSlotSPtr slots3;
        VecNLETrackSlotSPtr slots4;
        NLETrackSlot nLETrackSlot;
        VecNLETrackSlotSPtr slots5;
        NLETrackSlot nLETrackSlot2;
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEModel.deepClone(false));
        if (f != null) {
            C349080DmM.LJIIJ(nLEModelDynamicCast, f.floatValue());
        }
        C349080DmM.LIZLLL(nLEModelDynamicCast);
        NLETrack mainTrack = nLEModelDynamicCast.getMainTrack();
        if (mainTrack != null && (slots5 = mainTrack.getSlots()) != null && (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(slots5)) != null) {
            if (nLETrackSlot2.hasExtra("extra_sc_original_video_duration")) {
                nLETrackSlot2.removeExtraWithKey("extra_sc_original_video_duration");
            }
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
            if (nLESegmentVideoDynamicCast != null) {
                nLESegmentVideoDynamicCast.clearCurveSpeedPoint();
                if (nLESegmentVideoDynamicCast.getAbsSpeed() != 1.0f) {
                    nLESegmentVideoDynamicCast.setAbsSpeed(1.0f);
                }
                nLETrackSlot2.setEndTime(nLETrackSlot2.getStartTime() + ((long) ((nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / nLESegmentVideoDynamicCast.getCurveAveSpeed())));
            }
        }
        NLETrack mainTrack2 = nLEModelDynamicCast.getMainTrack();
        if (mainTrack2 != null) {
            maxEnd = mainTrack2.getMaxEnd();
        } else {
            maxEnd = 0;
        }
        NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModelDynamicCast);
        if (nLETrackLIZ != null && (slots4 = nLETrackLIZ.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJLIIIJL(slots4)) != null) {
            LIZ(maxEnd, nLETrackSlot);
        }
        VecNLETrackSPtr tracks = nLEModelDynamicCast.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (!nLETrack2.getMainTrack() && !Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "ORIGIN") && !Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "DUB")) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            nLEModelDynamicCast.removeTrack((NLETrack) it2.next());
        }
        NLETrack mainTrack3 = nLEModelDynamicCast.getMainTrack();
        if (mainTrack3 != null && (slots3 = mainTrack3.getSlots()) != null) {
            Iterator<NLETrackSlot> it3 = slots3.iterator();
            while (it3.hasNext()) {
                LJFF(it3.next());
            }
        }
        NLETrack nLETrackLIZ2 = C346780Die.LIZ(nLEModelDynamicCast);
        if (nLETrackLIZ2 != null && (slots2 = nLETrackLIZ2.getSlots()) != null) {
            Iterator<NLETrackSlot> it4 = slots2.iterator();
            while (it4.hasNext()) {
                LJFF(it4.next());
            }
        }
        Iterator<NLETrack> it5 = nLEModelDynamicCast.getTracks().iterator();
        while (true) {
            if (it5.hasNext()) {
                next = it5.next();
                if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "DUB")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack3 = next;
        if (nLETrack3 != null && (slots = nLETrack3.getSlots()) != null) {
            Iterator<NLETrackSlot> it6 = slots.iterator();
            while (it6.hasNext()) {
                LJFF(it6.next());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack4 : nLEModelDynamicCast.getTracks()) {
            VecNLETrackSlotSPtr sortedSlots = nLETrack4.getSortedSlots();
            ArrayList arrayList3 = new ArrayList();
            for (NLETrackSlot nLETrackSlot3 : sortedSlots) {
                NLETrackSlot nLETrackSlot4 = nLETrackSlot3;
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot4.getMainSegment());
                if (C351220Dpo.LLLFFI(nLETrackSlot4) || TEVideoUtils.nativeCheckAudioFile(nLESegmentAudioDynamicCast.getResource().getResourceFile()) != 0) {
                    arrayList3.add(nLETrackSlot3);
                }
            }
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                nLETrack4.removeSlot((NLETrackSlot) it7.next());
                if (nLETrack4.getSlots().isEmpty()) {
                    arrayList2.add(nLETrack4);
                }
            }
        }
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            nLEModelDynamicCast.removeTrack((NLETrack) it8.next());
        }
        return nLEModelDynamicCast;
    }
}
