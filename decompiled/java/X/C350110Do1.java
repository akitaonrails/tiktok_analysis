package X;

import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Do1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350110Do1 {
    public static boolean LIZ;
    public static final ReentrantLock LIZIZ = new ReentrantLock();
    public static final C347000Dj0 LIZJ = new C347000Dj0();

    public static boolean LJ(NLEModel nLEModel) {
        if (C346780Die.LIZ(nLEModel) != null || LJIIIIZZ(nLEModel)) {
            return true;
        }
        return false;
    }

    public static void LJFF(NLEModel nLEModel) {
        boolean z;
        if (C346780Die.LIZ(nLEModel) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
        }
        if (LJIIIIZZ(nLEModel)) {
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
        }
        LJIILL(nLEModel);
    }

    public static void LJII(NLEModel nLEModel) {
        NLETrackSlot next;
        Object next2;
        NLETrackSlot next3;
        NLESegmentAudio nLESegmentAudio;
        float fFloatValue;
        Float fLJIIIIZZ;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            mainTrack.timeSort();
        }
        LIZJ.getClass();
        NLETrack nLETrackLIZ = C346960Diw.LIZ(nLEModel);
        if (nLETrackLIZ != null) {
            for (NLETrackSlot nLETrackSlot : nLEModel.getMainTrack().getSlots()) {
                NLETrackSlot nLETrackSlotLIZ = C347000Dj0.LIZ(nLETrackLIZ, nLETrackSlot);
                if (nLETrackSlotLIZ != null) {
                    nLETrackSlotLIZ.setStartTime(nLETrackSlot.getStartTime());
                    nLETrackSlotLIZ.setEndTime(nLETrackSlot.getEndTime());
                    nLETrackSlotLIZ.setDuration(nLETrackSlot.getDuration());
                    NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                    if (nLESegmentAudio2 != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlotLIZ.getMainSegment())) != null) {
                        if (nLETrackSlotLIZ.hasExtra("extra_svc_speed")) {
                            String extra = nLETrackSlotLIZ.getExtra("extra_svc_speed");
                            if (extra != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra)) != null) {
                                fFloatValue = fLJIIIIZZ.floatValue();
                            } else {
                                fFloatValue = 1.0f;
                            }
                            float absSpeed = nLESegmentAudio2.getAbsSpeed();
                            if (absSpeed != 0.0f) {
                                nLESegmentAudio.setAbsSpeed(absSpeed * fFloatValue);
                                nLESegmentAudio.setTimeClipEnd(nLESegmentAudio2.getTimeClipStart() + ((long) ((nLESegmentAudio2.getTimeClipEnd() - nLESegmentAudio2.getTimeClipStart()) * fFloatValue)));
                            }
                        } else {
                            nLESegmentAudio.setAbsSpeed(nLESegmentAudio2.getAbsSpeed());
                            nLESegmentAudio.setTimeClipEnd(nLESegmentAudio2.getTimeClipEnd());
                        }
                        nLESegmentAudio.setTimeClipStart(nLESegmentAudio2.getTimeClipStart());
                    }
                }
            }
        }
        if (!((ArrayList) C346780Die.LIZIZ(nLEModel)).isEmpty()) {
            for (NLETrack nLETrack : (ArrayList) C346780Die.LIZIZ(nLEModel)) {
                if (nLETrack.getLayer() == 0) {
                    NLETrack mainTrack2 = nLEModel.getMainTrack();
                    if (mainTrack2 != null) {
                        for (NLETrackSlot nLETrackSlot2 : mainTrack2.getSlots()) {
                            if (nLETrackSlot2.hasExtra("original_audio_uuid")) {
                                String extra2 = nLETrackSlot2.getExtra("original_audio_uuid");
                                Iterator<NLETrackSlot> it2 = nLETrack.getSlots().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (Intrinsics.LJFF(next.getUUID(), extra2)) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                NLETrackSlot nLETrackSlot3 = next;
                                if (nLETrackSlot3 != null) {
                                    LJIIIZ(nLETrackSlot2, nLETrackSlot3);
                                }
                            }
                        }
                    }
                } else {
                    VecNLETrackSPtr tracks = nLEModel.getTracks();
                    ArrayList arrayList = new ArrayList();
                    for (NLETrack nLETrack2 : tracks) {
                        if (C351220Dpo.LLLIIL(nLETrack2)) {
                            arrayList.add(nLETrack2);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (((NLETimeSpaceNode) next2).getLayer() + 1 == nLETrack.getLayer()) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    NLETrack nLETrack3 = (NLETrack) next2;
                    if (nLETrack3 != null) {
                        for (NLETrackSlot nLETrackSlot4 : nLETrack3.getSlots()) {
                            if (nLETrackSlot4.hasExtra("original_audio_uuid")) {
                                String extra3 = nLETrackSlot4.getExtra("original_audio_uuid");
                                Iterator<NLETrackSlot> it4 = nLETrack.getSlots().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next3 = it4.next();
                                        if (Intrinsics.LJFF(next3.getUUID(), extra3)) {
                                            break;
                                        }
                                    } else {
                                        next3 = null;
                                        break;
                                    }
                                }
                                NLETrackSlot nLETrackSlot5 = next3;
                                if (nLETrackSlot5 != null) {
                                    LJIIIZ(nLETrackSlot4, nLETrackSlot5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static boolean LJIIIIZZ(NLEModel nLEModel) {
        if (C346960Diw.LIZ(nLEModel) != null) {
            return true;
        }
        return false;
    }

    public static void LJIILL(NLEModel nLEModel) {
        String extra = nLEModel.getExtra("extra_key_realign_origin_slots");
        if (extra != null) {
            ReentrantLock reentrantLock = LIZIZ;
            reentrantLock.lock();
            try {
                if (Boolean.parseBoolean(extra)) {
                    LJII(nLEModel);
                    nLEModel.setExtra("extra_key_realign_origin_slots", "false");
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public static NLETrackSlot LIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        if (LJIIIIZZ(nLEModel)) {
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
        }
        if (C346780Die.LIZ(nLEModel) != null) {
            int iLIZJ = LIZJ(nLEModel, nLETrackSlot);
            if (iLIZJ == -1) {
                nLEModel.setExtra("extra_key_realign_origin_slots", "true");
            }
            NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModel);
            if (nLETrackLIZ != null) {
                return nLETrackLIZ.getSlotByIndex(iLIZJ);
            }
            return null;
        }
        return null;
    }

    public static Pair LIZIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        Object next;
        NLETrack nLETrack;
        Object next2;
        NLETrackSlot nLETrackSlot2 = null;
        if (!C351220Dpo.LLIFFJFJJ(nLETrackSlot)) {
            return new Pair(null, null);
        }
        if (!((ArrayList) C346780Die.LIZIZ(nLEModel)).isEmpty()) {
            NLETrack trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot);
            if (trackBySlot == null) {
                return new Pair(null, null);
            }
            String strLJLJL = C351220Dpo.LJLJL(nLETrackSlot, "original_audio_uuid", "");
            if (trackBySlot.getMainTrack()) {
                Iterator it2 = ((ArrayList) C346780Die.LIZIZ(nLEModel)).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (((NLETimeSpaceNode) next2).getLayer() == 0) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                nLETrack = (NLETrack) next2;
            } else if (C351220Dpo.LLLIIL(trackBySlot)) {
                Iterator it3 = ((ArrayList) C346780Die.LIZIZ(nLEModel)).iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (((NLETimeSpaceNode) next).getLayer() == trackBySlot.getLayer() + 1) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                nLETrack = (NLETrack) next;
            }
            if (nLETrack != null) {
                Iterator<NLETrackSlot> it4 = nLETrack.getSlots().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    NLETrackSlot next3 = it4.next();
                    if (Intrinsics.LJFF(next3.getUUID(), strLJLJL)) {
                        nLETrackSlot2 = next3;
                        break;
                    }
                }
                return new Pair(nLETrackSlot2, nLETrack);
            }
        }
        return new Pair(null, null);
    }

    public static int LIZJ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        VecNLETrackSlotSPtr sortedSlots = nLEModel.getMainTrack().getSortedSlots();
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot2 : sortedSlots) {
            if (C351220Dpo.LLIFFJFJJ(nLETrackSlot2)) {
                arrayList.add(nLETrackSlot2);
            }
        }
        return arrayList.indexOf(nLETrackSlot);
    }

    public static void LIZLLL(NLEModel nLEModel, C19EG c19eg) {
        List sortedSlots;
        if (LIZ) {
            return;
        }
        c19eg.getFilesDir().getAbsolutePath();
        NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModel);
        if (nLETrackLIZ == null) {
            return;
        }
        NLETrack nLETrackLIZLLL = C350870DpF.LIZLLL(nLEModel);
        if (nLETrackLIZLLL == null || (sortedSlots = nLETrackLIZLLL.getSortedSlots()) == null) {
            sortedSlots = C13BV.INSTANCE;
        }
        if (nLETrackLIZ.getSortedSlots().size() != sortedSlots.size()) {
            LJII(nLEModel);
        }
        LIZ = true;
    }

    public static void LJI(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        NLETrackSlot nLETrackSlot2;
        Object next;
        VecNLETrackSlotSPtr slots;
        NLETrack trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot);
        if (trackBySlot == null) {
            return;
        }
        String str = "";
        String strLJLJL = C351220Dpo.LJLJL(nLETrackSlot, "original_audio_uuid", "");
        if (strLJLJL != null) {
            str = strLJLJL;
        }
        if (C351220Dpo.LLLIIL(trackBySlot) && str.length() > 0) {
            Iterator it2 = ((ArrayList) C346780Die.LIZIZ(nLEModel)).iterator();
            while (true) {
                nLETrackSlot2 = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((NLETimeSpaceNode) next).getLayer() == trackBySlot.getLayer() + 1) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack = (NLETrack) next;
            if (nLETrack != null && (slots = nLETrack.getSlots()) != null) {
                Iterator<NLETrackSlot> it3 = slots.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    NLETrackSlot next2 = it3.next();
                    if (Intrinsics.LJFF(next2.getUUID(), str)) {
                        nLETrackSlot2 = next2;
                        break;
                    }
                }
                NLETrackSlot nLETrackSlot3 = nLETrackSlot2;
                if (nLETrackSlot3 != null) {
                    LJIIIZ(nLETrackSlot, nLETrackSlot3);
                }
            }
        }
    }

    public static void LJIIIZ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        float fFloatValue;
        NLESegmentAudio nLESegmentAudio;
        nLETrackSlot2.setStartTime(nLETrackSlot.getStartTime());
        nLETrackSlot2.setEndTime(nLETrackSlot.getEndTime());
        nLETrackSlot2.setDuration(nLETrackSlot.getDuration());
        Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot2.getExtra("original_audio_speed_rate"));
        if (fLJIIIIZZ != null) {
            fFloatValue = fLJIIIIZZ.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
        if (nLESegmentAudio2 != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment())) != null) {
            nLESegmentAudio.setAbsSpeed(nLESegmentAudio2.getAbsSpeed() * fFloatValue);
            if (!C351220Dpo.LJZ(nLETrackSlot) && C351220Dpo.LJZ(nLETrackSlot2)) {
                nLESegmentAudio.clearSegCurveSpeedPoint();
            }
            nLESegmentAudio.setTimeClipStart((long) (nLESegmentAudio2.getTimeClipStart() * fFloatValue));
            nLESegmentAudio.setTimeClipEnd((long) (nLESegmentAudio2.getTimeClipEnd() * fFloatValue));
        }
    }

    public static void LJIIL(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        if (LJIIIIZZ(nLEModel)) {
            LIZJ.getClass();
            C349070DmL.LIZ(nLEModel, nLETrackSlot, true);
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
        }
        Pair pairLIZIZ = LIZIZ(nLEModel, nLETrackSlot);
        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) pairLIZIZ.getFirst();
        NLETrack nLETrack = (NLETrack) pairLIZIZ.getSecond();
        if (nLETrackSlot2 == null) {
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
            return;
        }
        if (nLETrack != null) {
            nLETrack.removeSlot(nLETrackSlot2);
            if (nLETrack.getSlots().isEmpty()) {
                nLEModel.removeTrack(nLETrack);
            }
        }
        nLEModel.setExtra("extra_key_realign_origin_slots", "true");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static void LJIILIIL(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        ?? r4;
        Object next;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot2;
        C259800zU c259800zU = new C259800zU();
        if (nLETrackSlot.hasExtra("original_audio_uuid")) {
            String extra = nLETrackSlot.getExtra("original_audio_uuid");
            NLETrack trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot);
            if (trackBySlot != null) {
                Iterator it2 = ((ArrayList) C346780Die.LIZIZ(nLEModel)).iterator();
                while (true) {
                    r4 = 0;
                    nLETrackSlot2 = null;
                    r4 = 0;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((NLETimeSpaceNode) next).getLayer() + 1 == trackBySlot.getLayer()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLETrack nLETrack = (NLETrack) next;
                if (nLETrack != null && (slots = nLETrack.getSlots()) != null) {
                    Iterator<NLETrackSlot> it3 = slots.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        NLETrackSlot next2 = it3.next();
                        if (Intrinsics.LJFF(next2.getUUID(), extra)) {
                            nLETrackSlot2 = next2;
                            break;
                        }
                    }
                    r4 = nLETrackSlot2;
                }
                c259800zU.element = r4;
                C349070DmL.LIZIZ(r4, nLETrackSlot);
            }
        }
        LIZJ.getClass();
        NLETrackSlot nLETrackSlotLIZIZ = C347000Dj0.LIZIZ(nLEModel, nLETrackSlot);
        if (nLETrackSlotLIZIZ != null) {
            nLETrackSlotLIZIZ.clearKeyframe();
            nLETrackSlotLIZIZ.clearSwingKeyframe();
            NLETrackSlot nLETrackSlot3 = (NLETrackSlot) c259800zU.element;
            if (nLETrackSlot3 != null) {
                nLETrackSlot3.clearKeyframe();
            }
            NLETrackSlot nLETrackSlot4 = (NLETrackSlot) c259800zU.element;
            if (nLETrackSlot4 != null) {
                nLETrackSlot4.clearSwingKeyframe();
            }
            NLETrackSlot nLETrackSlotLIZIZ2 = C347000Dj0.LIZIZ(nLEModel, nLETrackSlot);
            if (nLETrackSlotLIZIZ2 != null) {
                C349070DmL.LIZIZ(nLETrackSlotLIZIZ2, nLETrackSlot);
            }
        }
    }

    public static void LJIIJJI(NLEModel nLEModel, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        int iLIZJ;
        NLETrackSlot slotByIndex;
        NLETrackSlot nLETrackSlotLIZ;
        NLETrackSlot nLETrackSlotDynamicCast;
        LIZJ.getClass();
        NLETrack nLETrackLIZ = C346960Diw.LIZ(nLEModel);
        if (nLETrackLIZ != null && (nLETrackSlotLIZ = C347000Dj0.LIZ(nLETrackLIZ, nLETrackSlot)) != null && (nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLIZ.deepClone(true))) != null) {
            nLETrackSlotDynamicCast.setStartTime(nLETrackSlotLIZ.getEndTime());
            nLETrackSlotDynamicCast.setEndTime(nLETrackSlotDynamicCast.getStartTime() + nLETrackSlotLIZ.getDuration());
            nLETrackSlot2.setExtra("extra_associated_vc_slot_id", nLETrackSlotDynamicCast.getUUID());
            nLETrackLIZ.addSlot(nLETrackSlotDynamicCast);
        }
        NLETrack nLETrackLIZ2 = C346780Die.LIZ(nLEModel);
        if (nLETrackLIZ2 == null || (iLIZJ = LIZJ(nLEModel, nLETrackSlot)) < 0 || (slotByIndex = nLETrackLIZ2.getSlotByIndex(iLIZJ)) == null) {
            return;
        }
        int iLIZ = C347240DjO.LIZ(nLEModel, nLETrackLIZ2.getTrackType());
        NLETrackSlot nLETrackSlotDynamicCast2 = NLETrackSlot.dynamicCast(slotByIndex.deepClone(true));
        if (nLETrackSlotDynamicCast2 != null) {
            nLETrackSlotDynamicCast2.setStartTime(slotByIndex.getEndTime());
            nLETrackSlotDynamicCast2.setEndTime(nLETrackSlotDynamicCast2.getStartTime() + slotByIndex.getDuration());
            NLEFilter audioFilter = nLETrackSlotDynamicCast2.getAudioFilter();
            if (audioFilter != null) {
                audioFilter.setStartTime(nLETrackSlotDynamicCast2.getStartTime());
                audioFilter.setEndTime(nLETrackSlotDynamicCast2.getEndTime());
            }
            nLETrackSlotDynamicCast2.setLayer(iLIZ);
            nLETrackSlot2.setExtra("original_audio_uuid", nLETrackSlotDynamicCast2.getUUID());
            nLETrackLIZ2.addSlotAfterSlot(nLETrackSlotDynamicCast2, slotByIndex);
        }
    }

    public static void LJIILJJIL(NLEModel nLEModel, NLETrackSlot nLETrackSlot, C350740Dp2 c350740Dp2) {
        NLETrackSlot slotByIndex;
        float fFloatValue;
        float absSpeed;
        boolean keepTone;
        if (LJIIIIZZ(nLEModel)) {
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
        }
        if (C346780Die.LIZ(nLEModel) != null) {
            int iLIZJ = LIZJ(nLEModel, nLETrackSlot);
            if (iLIZJ == -1) {
                nLEModel.setExtra("extra_key_realign_origin_slots", "true");
                return;
            }
            NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModel);
            if (nLETrackLIZ != null && (slotByIndex = nLETrackLIZ.getSlotByIndex(iLIZJ)) != null) {
                Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(slotByIndex.getExtra("original_audio_speed_rate"));
                if (fLJIIIIZZ != null) {
                    fFloatValue = fLJIIIIZZ.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(slotByIndex.getMainSegment());
                Float f = c350740Dp2.LIZ;
                if (f != null) {
                    absSpeed = f.floatValue() * fFloatValue;
                } else {
                    absSpeed = nLESegmentAudioDynamicCast.getAbsSpeed();
                }
                Boolean bool = c350740Dp2.LIZIZ;
                if (bool != null) {
                    keepTone = bool.booleanValue();
                } else {
                    keepTone = nLESegmentAudioDynamicCast.getKeepTone();
                }
                slotByIndex.setEndTime(nLETrackSlot.getEndTime());
                slotByIndex.setDuration(nLETrackSlot.getDuration());
                nLESegmentAudioDynamicCast.setAbsSpeed(absSpeed + 0.001f);
                nLESegmentAudioDynamicCast.setKeepTone(keepTone);
                nLEModel.setExtra("extra_key_realign_origin_slots", "true");
            }
        }
    }

    public static void LJIIJ(long j, NLEModel nLEModel, long j2, NLETrackSlot nLETrackSlot) {
        NLETrackSlot slotByIndex;
        float fFloatValue;
        if (LJIIIIZZ(nLEModel)) {
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
        }
        if (C346780Die.LIZ(nLEModel) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncClip::slot.startTime=");
            sbLIZ.append(nLETrackSlot.getStartTime());
            sbLIZ.append(", slot.endTime=");
            sbLIZ.append(nLETrackSlot.getEndTime());
            sbLIZ.append(", startTime=");
            sbLIZ.append(j);
            sbLIZ.append(", duration=");
            sbLIZ.append(j2);
            C355090Dw3.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            int iLIZJ = LIZJ(nLEModel, nLETrackSlot);
            NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModel);
            if (nLETrackLIZ != null && (slotByIndex = nLETrackLIZ.getSlotByIndex(iLIZJ)) != null) {
                Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(slotByIndex.getExtra("original_audio_speed_rate"));
                if (fLJIIIIZZ != null) {
                    fFloatValue = fLJIIIIZZ.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(slotByIndex.getMainSegment());
                nLESegmentAudioDynamicCast.setTimeClipStart((long) (j * fFloatValue));
                nLESegmentAudioDynamicCast.setTimeClipEnd((long) (j2 * fFloatValue));
                slotByIndex.setStartTime(nLETrackSlot.getStartTime());
                slotByIndex.setEndTime(nLETrackSlot.getEndTime());
                slotByIndex.setDuration(nLETrackSlot.getDuration());
                NLETrack nLETrackLIZ2 = C346780Die.LIZ(nLEModel);
                if (nLETrackLIZ2 != null) {
                    nLETrackLIZ2.timeSort();
                }
                nLEModel.setExtra("extra_key_realign_origin_slots", "true");
                return;
            }
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
        }
    }
}
