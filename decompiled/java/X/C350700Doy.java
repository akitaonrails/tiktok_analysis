package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Doy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1294060jmO
public final class C350700Doy {
    public static final /* synthetic */ int LIZ = 0;

    public static NLETrackSlot LIZJ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        NLETrackSlot next;
        Iterator<NLETrackSlot> it2 = nLEModel.getMainTrack().getSortedSlots().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (LJ(nLEModel.getMainTrack(), nLETrackSlot, next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static void LJIIIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        NLEVideoAnimation next;
        NLETrackSlot nLETrackSlotLIZJ = LIZJ(nLEModel, nLETrackSlot);
        if (nLETrackSlotLIZJ != null) {
            String strLJIIZILJ = C351220Dpo.LJIIZILJ(nLETrackSlot);
            Iterator<NLEVideoAnimation> it2 = nLETrackSlotLIZJ.getVideoAnims().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(C351220Dpo.LJIJ(next), strLJIIZILJ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLEVideoAnimation nLEVideoAnimation = next;
            if (nLEVideoAnimation != null) {
                nLEVideoAnimation.setStartTime(nLETrackSlot.getStartTime() - nLETrackSlotLIZJ.getStartTime());
                nLEVideoAnimation.setEndTime((nLETrackSlot.getStartTime() - nLETrackSlotLIZJ.getStartTime()) + nLETrackSlot.getDuration());
                NLETrack mainTrack = nLEModel.getMainTrack();
                if (mainTrack != null) {
                    long startTime = nLEVideoAnimation.getStartTime();
                    C351510DqH.LIZ.getClass();
                    long jLJJIJ = startTime - C351510DqH.LJJIJ(mainTrack, nLETrackSlotLIZJ);
                    long jLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlotLIZJ) - nLEVideoAnimation.getEndTime();
                    nLETrackSlot.setExtra("anim_start_time_dis", String.valueOf(jLJJIJ));
                    nLETrackSlot.setExtra("anim_end_time_dis", String.valueOf(jLJJIIZI));
                }
            }
        }
    }

    public static void LIZIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot, String str) {
        NLETrack next;
        NLETrackSlot nLETrackSlotLIZLLL;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLLLILI(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null && (nLETrackSlotLIZLLL = LIZLLL(nLEModel, nLETrackSlot, str)) != null) {
            nLETrack.removeSlot(nLETrackSlotLIZLLL);
        }
    }

    public static NLETrackSlot LIZLLL(NLEModel nLEModel, NLETrackSlot nLETrackSlot, String str) {
        NLETrackSlot nLETrackSlot2;
        NLETrack next;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            nLETrackSlot2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLLLILI(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack == null) {
            return null;
        }
        Iterator<NLETrackSlot> it3 = nLETrack.getSortedSlots().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            NLETrackSlot next2 = it3.next();
            NLETrackSlot nLETrackSlot3 = next2;
            if (nLETrackSlot3.hasExtra("anim_type")) {
                boolean zLJFF = Intrinsics.LJFF(nLETrackSlot3.getExtra("anim_type"), str);
                if (LJ(nLEModel.getMainTrack(), nLETrackSlot3, nLETrackSlot) && zLJFF) {
                    nLETrackSlot2 = next2;
                    break;
                }
            }
        }
        return nLETrackSlot2;
    }

    public static boolean LJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        return LJFF(nLETrackSlot.getStartTime(), nLETrack, nLETrackSlot.getEndTime(), nLETrackSlot2);
    }

    public static void LJI(NLEModel nLEModel, NLEModel nLEModel2, boolean z) {
        NLETrackSlot nLETrackSlot;
        VecNLETrackSlotSPtr sortedSlots;
        TrackLinkageManagerProvider.Companion.getClass();
        AbstractC349500Dn2 businessTrackLinkageManager = C356700Dye.LIZ().getBusinessTrackLinkageManager();
        if (businessTrackLinkageManager != null) {
            businessTrackLinkageManager.LIZLLL.clear();
            businessTrackLinkageManager.LIZLLL.addAll(C1697810uHb.LJ(NLEResType.ANIMATION_VIDEO_IN, NLEResType.ANIMATION_VIDEO_OUT, NLEResType.ANIMATION_VIDEO_COMBO));
            ArrayList arrayList = new ArrayList();
            NLETrack mainTrack = nLEModel2.getMainTrack();
            if (mainTrack == null) {
                return;
            }
            int size = mainTrack.getSlots().size();
            for (int i = 0; i < size; i++) {
                NLETrack mainTrack2 = nLEModel.getMainTrack();
                NLETrackSlot nLETrackSlot2 = null;
                if (mainTrack2 != null && (sortedSlots = mainTrack2.getSortedSlots()) != null) {
                    nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(i, sortedSlots);
                } else {
                    nLETrackSlot = null;
                }
                VecNLETrackSlotSPtr sortedSlots2 = mainTrack.getSortedSlots();
                if (sortedSlots2 != null) {
                    nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(i, sortedSlots2);
                }
                arrayList.add(new C349470Dmz(nLETrackSlot, nLETrackSlot2, null, null, 12));
            }
            businessTrackLinkageManager.LIZJ(new C349510Dn3("stick_point", arrayList, nLEModel));
            businessTrackLinkageManager.LIZLLL.clear();
            businessTrackLinkageManager.LIZLLL.addAll(C348600Dla.LIZIZ());
        }
    }

    public static void LJIIIIZZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot, String str) {
        NLETrackSlot nLETrackSlotLIZLLL;
        C351510DqH.LIZ.getClass();
        NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlot, str);
        if (nLEVideoAnimationLJIJ != null && (nLETrackSlotLIZLLL = LIZLLL(nLEModel, nLETrackSlot, str)) != null) {
            nLETrackSlotLIZLLL.setStartTime(nLEVideoAnimationLJIJ.getStartTime() + nLETrackSlot.getStartTime());
            nLETrackSlotLIZLLL.setEndTime(nLEVideoAnimationLJIJ.getStartTime() + nLETrackSlot.getStartTime() + nLEVideoAnimationLJIJ.getDuration());
            NLETrack mainTrack = nLEModel.getMainTrack();
            if (mainTrack != null) {
                long startTime = nLEVideoAnimationLJIJ.getStartTime() - C351510DqH.LJJIJ(mainTrack, nLETrackSlot);
                long jLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlot) - nLEVideoAnimationLJIJ.getEndTime();
                nLETrackSlotLIZLLL.setExtra("anim_start_time_dis", String.valueOf(startTime));
                nLETrackSlotLIZLLL.setExtra("anim_end_time_dis", String.valueOf(jLJJIIZI));
            }
        }
    }

    public static void LJIIJ(NLEModel nLEModel, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        NLEVideoAnimation next;
        NLETrack mainTrack;
        Iterator<NLEVideoAnimation> it2 = nLETrackSlot2.getVideoAnims().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(C351220Dpo.LJIJ(next), C351220Dpo.LJIIZILJ(nLETrackSlot))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLEVideoAnimation nLEVideoAnimation = next;
        if (nLEVideoAnimation != null && (mainTrack = nLEModel.getMainTrack()) != null) {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            C351510DqH.LIZ.getClass();
            nLETrackSlot.setExtra("anchor_main_slot_duration", String.valueOf(timeUnit.toMillis(C351510DqH.LJJIIZI(nLETrackSlot2) - C351510DqH.LJJIJ(mainTrack, nLETrackSlot2))));
            long startTime = nLEVideoAnimation.getStartTime() - C351510DqH.LJJIJ(mainTrack, nLETrackSlot2);
            long jLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlot2) - nLEVideoAnimation.getEndTime();
            nLETrackSlot.setExtra("anim_start_time_dis", String.valueOf(startTime));
            nLETrackSlot.setExtra("anim_end_time_dis", String.valueOf(jLJJIIZI));
        }
    }

    @InterfaceC1294060jmO
    public static NLETrackSlot LIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot, String str, long j) {
        NLETrackSlot nLETrackSlot2;
        NLETrack next;
        NLETrack next2;
        VecNLETrackSlotSPtr slots;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            nLETrackSlot2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLLLILI(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack == null) {
            Iterator<NLETrack> it3 = nLEModel.getTracks().iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    NLETrack nLETrack2 = next2;
                    if (nLETrack2 != null && C351220Dpo.LLJJIII(nLETrack2) && nLETrack2.getLayer() == 0 && ((slots = nLETrack2.getSlots()) == null || slots.isEmpty())) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            nLETrack = next2;
            if (nLETrack != null) {
                nLETrack.setEnable(false);
                nLETrack.setExtra("EffectTrackType", "VIDEO_ANIM");
            } else {
                nLETrack = new NLETrack();
                nLETrack.setEnable(false);
                nLETrack.setMainTrack(false);
                nLETrack.setLayer(0);
                nLETrack.setExtra("track_type", "video_effect");
                nLETrack.setExtraTrackType(NLETrackType.EFFECT);
                nLETrack.setExtra("EffectTrackType", "VIDEO_ANIM");
                nLEModel.addTrack(nLETrack);
            }
        }
        C351510DqH.LIZ.getClass();
        NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlot, str);
        if (nLEVideoAnimationLJIJ != null) {
            nLETrackSlot2 = new NLETrackSlot();
            nLETrackSlot2.setMainSegment(nLEVideoAnimationLJIJ.getSegment());
            nLETrackSlot2.setStartTime(nLEVideoAnimationLJIJ.getStartTime() + nLETrackSlot.getStartTime());
            nLETrackSlot2.setEndTime(nLEVideoAnimationLJIJ.getStartTime() + nLETrackSlot.getStartTime() + nLEVideoAnimationLJIJ.getDuration());
            nLETrackSlot2.setExtra("ep_anim_default_duration", String.valueOf(j));
            nLETrackSlot2.setExtra("anim_type", str);
            NLETrack mainTrack = nLEModel.getMainTrack();
            if (mainTrack != null) {
                nLETrackSlot2.setExtra("anchor_main_slot_duration", String.valueOf(TimeUnit.MICROSECONDS.toMillis(C351510DqH.LJJIIZI(nLETrackSlot) - C351510DqH.LJJIJ(mainTrack, nLETrackSlot))));
                long startTime = nLEVideoAnimationLJIJ.getStartTime() - C351510DqH.LJJIJ(mainTrack, nLETrackSlot);
                long jLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlot) - nLEVideoAnimationLJIJ.getEndTime();
                nLETrackSlot2.setExtra("anim_start_time_dis", String.valueOf(startTime));
                nLETrackSlot2.setExtra("anim_end_time_dis", String.valueOf(jLJJIIZI));
            }
            nLETrack.addSlot(nLETrackSlot2);
        }
        return nLETrackSlot2;
    }

    public static boolean LJFF(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot) {
        if (nLETrack == null) {
            return false;
        }
        long startTime = nLETrackSlot.getStartTime();
        C351510DqH.LIZ.getClass();
        long j3 = 30000;
        long jLJJIJ = (startTime + C351510DqH.LJJIJ(nLETrack, nLETrackSlot)) - j3;
        long startTime2 = nLETrackSlot.getStartTime() + C351510DqH.LJJIIZI(nLETrackSlot) + j3;
        if (jLJJIJ > j || startTime2 < j2) {
            return false;
        }
        return true;
    }

    public static NLETrackSlot LJII(NLEModel nLEModel, NLETrackSlot nLETrackSlot, String str, long j) {
        NLETrackSlot nLETrackSlotLIZLLL;
        C351510DqH.LIZ.getClass();
        NLEVideoAnimation nLEVideoAnimationLJIJ = C351510DqH.LJIJ(nLETrackSlot, str);
        if (nLEVideoAnimationLJIJ != null && (nLETrackSlotLIZLLL = LIZLLL(nLEModel, nLETrackSlot, str)) != null) {
            nLETrackSlotLIZLLL.setMainSegment(nLEVideoAnimationLJIJ.getSegment());
            nLETrackSlotLIZLLL.setStartTime(nLEVideoAnimationLJIJ.getStartTime() + nLETrackSlot.getStartTime());
            nLETrackSlotLIZLLL.setEndTime(nLEVideoAnimationLJIJ.getStartTime() + nLETrackSlot.getStartTime() + nLEVideoAnimationLJIJ.getDuration());
            nLETrackSlotLIZLLL.setExtra("ep_anim_default_duration", String.valueOf(j));
            NLETrack mainTrack = nLEModel.getMainTrack();
            if (mainTrack != null) {
                long startTime = nLEVideoAnimationLJIJ.getStartTime() - C351510DqH.LJJIJ(mainTrack, nLETrackSlot);
                long jLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlot) - nLEVideoAnimationLJIJ.getEndTime();
                nLETrackSlotLIZLLL.setExtra("anim_start_time_dis", String.valueOf(startTime));
                nLETrackSlotLIZLLL.setExtra("anim_end_time_dis", String.valueOf(jLJJIIZI));
            }
            return nLETrackSlotLIZLLL;
        }
        return null;
    }
}
