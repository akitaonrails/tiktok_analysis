package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350690Dox {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJIIJ(NLETrackSlot nLETrackSlot) {
        if (!C351220Dpo.LLIIJI(nLETrackSlot)) {
            nLETrackSlot.removeExtraWithKey("anim_type");
            nLETrackSlot.removeExtraWithKey("ep_anim_res_id");
        }
    }

    public static void LIZLLL(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        if (!C351220Dpo.LLIIJI(nLETrackSlot)) {
            return;
        }
        C351510DqH.LIZ.getClass();
        long jLJJIJ = C351510DqH.LJJIJ(nLETrack, nLETrackSlot);
        long jLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlot);
        NLEVideoAnimation nLEVideoAnimationLJIILL = C351220Dpo.LJIILL(nLETrackSlot, "in_video_anim");
        NLEVideoAnimation nLEVideoAnimationLJIILL2 = C351220Dpo.LJIILL(nLETrackSlot, "out_video_anim");
        if (nLEVideoAnimationLJIILL != null) {
            long endTime = nLEVideoAnimationLJIILL.getEndTime() - nLEVideoAnimationLJIILL.getStartTime();
            nLEVideoAnimationLJIILL.setStartTime(jLJJIJ);
            nLEVideoAnimationLJIILL.setEndTime(nLEVideoAnimationLJIILL.getStartTime() + endTime);
        }
        if (nLEVideoAnimationLJIILL2 != null) {
            long endTime2 = nLEVideoAnimationLJIILL2.getEndTime() - nLEVideoAnimationLJIILL2.getStartTime();
            nLEVideoAnimationLJIILL2.setEndTime(jLJJIIZI);
            nLEVideoAnimationLJIILL2.setStartTime(jLJJIIZI - endTime2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0024 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(com.bytedance.ies.nle.editor_jni.NLEModel r11, com.bytedance.ies.nle.editor_jni.NLETrackSlot r12) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350690Dox.LJIIL(com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public static void LIZ(long j, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        C351510DqH.LIZ.getClass();
        LIZIZ(nLETrackSlot, C351510DqH.LJJIJ(nLETrack, nLETrackSlot), C351510DqH.LJJIIZI(nLETrackSlot));
    }

    public static void LIZIZ(NLETrackSlot nLETrackSlot, long j, long j2) {
        long endTime;
        long endTime2;
        if (!C351220Dpo.LLIIJI(nLETrackSlot)) {
            return;
        }
        long j3 = j2 - j;
        NLEVideoAnimation nLEVideoAnimationLJIILL = C351220Dpo.LJIILL(nLETrackSlot, "in_video_anim");
        NLEVideoAnimation nLEVideoAnimationLJIILL2 = C351220Dpo.LJIILL(nLETrackSlot, "combo_video_anim");
        NLEVideoAnimation nLEVideoAnimationLJIILL3 = C351220Dpo.LJIILL(nLETrackSlot, "out_video_anim");
        if (nLEVideoAnimationLJIILL != null) {
            long jMin = Math.min(j3, nLEVideoAnimationLJIILL.getDuration());
            endTime2 = j3 - jMin;
            if (LJIIJJI(nLEVideoAnimationLJIILL, jMin, j)) {
                nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIILL);
                endTime = j;
            } else {
                nLEVideoAnimationLJIILL.setStartTime(j);
                nLEVideoAnimationLJIILL.setEndTime(nLEVideoAnimationLJIILL.getStartTime() + jMin);
                endTime = nLEVideoAnimationLJIILL.getEndTime();
            }
        } else {
            endTime = j;
            endTime2 = j3;
        }
        if (nLEVideoAnimationLJIILL2 != null) {
            long jMax = Math.max(endTime, nLEVideoAnimationLJIILL2.getStartTime());
            long jMin2 = Math.min((j3 - jMax) + j, nLEVideoAnimationLJIILL2.getDuration());
            endTime2 = j3 - (jMax - j);
            if (LJIIJJI(nLEVideoAnimationLJIILL2, jMin2, jMax)) {
                nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIILL2);
            } else {
                nLEVideoAnimationLJIILL2.setStartTime(jMax);
                nLEVideoAnimationLJIILL2.setEndTime(nLEVideoAnimationLJIILL2.getStartTime() + jMin2);
                endTime2 = (j3 - nLEVideoAnimationLJIILL2.getEndTime()) + j;
                nLEVideoAnimationLJIILL2.getEndTime();
            }
        }
        if (nLEVideoAnimationLJIILL3 != null) {
            long jMin3 = Math.min(endTime2, nLEVideoAnimationLJIILL3.getDuration());
            long j4 = j3 + j;
            if (LJIIJJI(nLEVideoAnimationLJIILL3, jMin3, j4 - jMin3)) {
                nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIILL3);
            } else {
                nLEVideoAnimationLJIILL3.setEndTime(j4);
                nLEVideoAnimationLJIILL3.setStartTime(nLEVideoAnimationLJIILL3.getEndTime() - jMin3);
            }
        }
        LJIIJ(nLETrackSlot);
    }

    public static void LIZJ(long j, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        if (!C351220Dpo.LLIIJI(nLETrackSlot)) {
            return;
        }
        C351510DqH.LIZ.getClass();
        long jLJJIJ = C351510DqH.LJJIJ(nLETrack, nLETrackSlot);
        long jLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlot);
        long startTime = jLJJIIZI - jLJJIJ;
        NLEVideoAnimation nLEVideoAnimationLJIILL = C351220Dpo.LJIILL(nLETrackSlot, "in_video_anim");
        NLEVideoAnimation nLEVideoAnimationLJIILL2 = C351220Dpo.LJIILL(nLETrackSlot, "combo_video_anim");
        NLEVideoAnimation nLEVideoAnimationLJIILL3 = C351220Dpo.LJIILL(nLETrackSlot, "out_video_anim");
        if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            if (nLEVideoAnimationLJIILL3 != null) {
                long jMin = Math.min(startTime, nLEVideoAnimationLJIILL3.getDuration());
                if (jMin < 10000) {
                    nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIILL3);
                } else {
                    startTime -= jMin;
                    nLEVideoAnimationLJIILL3.setEndTime(jLJJIIZI);
                    nLEVideoAnimationLJIILL3.setStartTime(nLEVideoAnimationLJIILL3.getEndTime() - jMin);
                }
            }
            if (nLEVideoAnimationLJIILL2 != null) {
                long endTime = nLEVideoAnimationLJIILL2.getEndTime() - Math.abs(j);
                startTime = endTime - jLJJIJ;
                long jMin2 = Math.min(startTime, nLEVideoAnimationLJIILL2.getDuration());
                if (jMin2 < 10000) {
                    nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIILL2);
                } else {
                    nLEVideoAnimationLJIILL2.setEndTime(endTime);
                    nLEVideoAnimationLJIILL2.setStartTime(nLEVideoAnimationLJIILL2.getEndTime() - jMin2);
                    startTime = nLEVideoAnimationLJIILL2.getStartTime() - jLJJIJ;
                }
            }
            if (nLEVideoAnimationLJIILL != null) {
                long jMin3 = Math.min(startTime, nLEVideoAnimationLJIILL.getDuration());
                if (jMin3 < 10000) {
                    nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIILL);
                } else {
                    nLEVideoAnimationLJIILL.setStartTime(jLJJIJ);
                    nLEVideoAnimationLJIILL.setEndTime(nLEVideoAnimationLJIILL.getStartTime() + jMin3);
                }
            }
            LJIIJ(nLETrackSlot);
        }
    }

    public static void LJ(long j, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        if (!C351220Dpo.LLIIJI(nLETrackSlot)) {
            return;
        }
        C351510DqH.LIZ.getClass();
        long jLJJIJ = C351510DqH.LJJIJ(nLETrack, nLETrackSlot);
        NLEVideoAnimation nLEVideoAnimationLJIILL = C351220Dpo.LJIILL(nLETrackSlot, "in_video_anim");
        NLEVideoAnimation nLEVideoAnimationLJIILL2 = C351220Dpo.LJIILL(nLETrackSlot, "combo_video_anim");
        NLEVideoAnimation nLEVideoAnimationLJIILL3 = C351220Dpo.LJIILL(nLETrackSlot, "out_video_anim");
        if (nLEVideoAnimationLJIILL != null) {
            long duration = nLEVideoAnimationLJIILL.getDuration();
            nLEVideoAnimationLJIILL.setStartTime(jLJJIJ);
            nLEVideoAnimationLJIILL.setEndTime(jLJJIJ + duration);
        }
        if (nLEVideoAnimationLJIILL3 != null) {
            nLEVideoAnimationLJIILL3.setStartTime(nLEVideoAnimationLJIILL3.getStartTime() + j);
            nLEVideoAnimationLJIILL3.setEndTime(nLEVideoAnimationLJIILL3.getEndTime() + j);
        }
        if (nLEVideoAnimationLJIILL2 != null) {
            nLEVideoAnimationLJIILL2.setStartTime(nLEVideoAnimationLJIILL2.getStartTime() + j);
            nLEVideoAnimationLJIILL2.setEndTime(nLEVideoAnimationLJIILL2.getEndTime() + j);
        }
    }

    public static void LJFF(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, C0E48 c0e48) {
        long timeClipStart;
        long duration;
        long timeClipStart2;
        if (!C351220Dpo.LLIIJI(nLETrackSlot2)) {
            return;
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        long duration2 = 0;
        if (nLESegmentVideoDynamicCast != null) {
            timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
        } else {
            timeClipStart = 0;
        }
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null) {
            duration = mainSegment.getDuration();
        } else {
            duration = 0;
        }
        long j = duration + timeClipStart;
        NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
        if (nLESegmentVideoDynamicCast2 != null) {
            timeClipStart2 = nLESegmentVideoDynamicCast2.getTimeClipStart();
        } else {
            timeClipStart2 = 0;
        }
        NLESegment mainSegment2 = nLETrackSlot2.getMainSegment();
        if (mainSegment2 != null) {
            duration2 = mainSegment2.getDuration();
        }
        long j2 = duration2 + timeClipStart2;
        long j3 = timeClipStart2 - timeClipStart;
        long j4 = j2 - j;
        long duration3 = nLETrackSlot2.getDuration() - nLETrackSlot.getDuration();
        if (Math.abs(j3) > 10000) {
            if (duration3 > 10000) {
                LJ(duration3, c0e48.Rn(), nLETrackSlot2);
                return;
            } else {
                LIZJ(duration3, c0e48.Rn(), nLETrackSlot2);
                return;
            }
        }
        if (Math.abs(j4) <= 10000) {
            return;
        }
        if (duration3 > 10000) {
            LIZLLL(c0e48.Rn(), nLETrackSlot2);
        } else {
            LIZ(duration3, c0e48.Rn(), nLETrackSlot2);
        }
    }

    public static void LJI(long j, NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        long duration = nLETrackSlot.getDuration() - j;
        if (duration > 0) {
            LIZLLL(c0e48.Rn(), nLETrackSlot);
        } else {
            LIZ(duration, c0e48.Rn(), nLETrackSlot);
        }
    }

    public static void LJII(long j, NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        long duration;
        long endTime;
        if (!C351220Dpo.LLIIJI(nLETrackSlot)) {
            return;
        }
        C351510DqH c351510DqH = C351510DqH.LIZ;
        NLETrack nLETrackRn = c0e48.Rn();
        c351510DqH.getClass();
        long jLJJIJ = C351510DqH.LJJIJ(nLETrackRn, nLETrackSlot);
        long jLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlot);
        long j2 = jLJJIIZI - jLJJIJ;
        NLEVideoAnimation nLEVideoAnimationLJIILL = C351220Dpo.LJIILL(nLETrackSlot, "in_video_anim");
        NLEVideoAnimation nLEVideoAnimationLJIILL2 = C351220Dpo.LJIILL(nLETrackSlot, "combo_video_anim");
        NLEVideoAnimation nLEVideoAnimationLJIILL3 = C351220Dpo.LJIILL(nLETrackSlot, "out_video_anim");
        if (nLEVideoAnimationLJIILL != null) {
            long duration2 = (nLEVideoAnimationLJIILL.getDuration() * nLETrackSlot.getDuration()) / j;
            nLEVideoAnimationLJIILL.setStartTime(jLJJIJ);
            nLEVideoAnimationLJIILL.setEndTime(nLEVideoAnimationLJIILL.getStartTime() + Math.min(duration2, j2));
            if (nLEVideoAnimationLJIILL.getEndTime() - nLEVideoAnimationLJIILL.getStartTime() < 10000) {
                nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIILL);
            }
        }
        if (nLEVideoAnimationLJIILL3 != null) {
            if (nLEVideoAnimationLJIILL != null) {
                duration = j2 - nLEVideoAnimationLJIILL.getDuration();
            } else {
                duration = 0;
            }
            long jMin = Math.min(duration, (nLEVideoAnimationLJIILL3.getDuration() * nLETrackSlot.getDuration()) / j);
            nLEVideoAnimationLJIILL3.setEndTime(jLJJIIZI);
            long endTime2 = nLEVideoAnimationLJIILL3.getEndTime() - jMin;
            if (nLEVideoAnimationLJIILL != null) {
                endTime = nLEVideoAnimationLJIILL.getEndTime();
            } else {
                endTime = jLJJIJ;
            }
            nLEVideoAnimationLJIILL3.setStartTime(Math.max(endTime2, endTime));
            if (nLEVideoAnimationLJIILL3.getEndTime() - nLEVideoAnimationLJIILL3.getStartTime() < 10000) {
                nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIILL3);
            }
        }
        if (nLEVideoAnimationLJIILL2 != null) {
            if (nLEVideoAnimationLJIILL != null) {
                jLJJIJ = nLEVideoAnimationLJIILL.getEndTime();
            }
            if (nLEVideoAnimationLJIILL3 != null) {
                jLJJIIZI = nLEVideoAnimationLJIILL3.getStartTime();
            }
            long startTime = (nLEVideoAnimationLJIILL2.getStartTime() * nLETrackSlot.getDuration()) / j;
            long endTime3 = (nLEVideoAnimationLJIILL2.getEndTime() * nLETrackSlot.getDuration()) / j;
            nLEVideoAnimationLJIILL2.setStartTime(Math.max(startTime, jLJJIJ));
            nLEVideoAnimationLJIILL2.setEndTime(Math.min(endTime3, jLJJIIZI));
            if (nLEVideoAnimationLJIILL2.getEndTime() - nLEVideoAnimationLJIILL2.getStartTime() < 10000) {
                nLETrackSlot.removeVideoAnim(nLEVideoAnimationLJIILL2);
            }
        }
        LJIIJ(nLETrackSlot);
    }

    public static void LJIIIZ(long j, NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        long jMax;
        long jMin;
        if (!C351220Dpo.LLIIJI(nLETrackSlot)) {
            return;
        }
        C351510DqH c351510DqH = C351510DqH.LIZ;
        NLETrack nLETrackRn = c0e48.Rn();
        c351510DqH.getClass();
        long jLJJIJ = C351510DqH.LJJIJ(nLETrackRn, nLETrackSlot);
        long jLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlot);
        for (NLEVideoAnimation nLEVideoAnimation : nLETrackSlot.getVideoAnims()) {
            nLEVideoAnimation.setStartTime(nLEVideoAnimation.getStartTime() - j);
            nLEVideoAnimation.setEndTime(nLEVideoAnimation.getEndTime() - j);
        }
        for (NLEVideoAnimation nLEVideoAnimation2 : nLETrackSlot.getVideoAnims()) {
            if (Intrinsics.LJFF(C351220Dpo.LJIJ(nLEVideoAnimation2), "in_video_anim")) {
                jMax = jLJJIJ;
            } else {
                jMax = Math.max(nLEVideoAnimation2.getStartTime(), jLJJIJ);
            }
            if (Intrinsics.LJFF(C351220Dpo.LJIJ(nLEVideoAnimation2), "out_video_anim")) {
                jMin = jLJJIIZI;
            } else {
                jMin = Math.min(nLEVideoAnimation2.getEndTime(), jLJJIIZI);
            }
            nLEVideoAnimation2.setStartTime(jMax);
            nLEVideoAnimation2.setEndTime(jMin);
            if (jMin - jMax < 10000) {
                nLETrackSlot.removeVideoAnim(nLEVideoAnimation2);
            }
        }
        LJIIJ(nLETrackSlot);
    }

    public static boolean LJIIJJI(NLEVideoAnimation nLEVideoAnimation, long j, long j2) {
        if ((Math.abs(j - nLEVideoAnimation.getDuration()) <= 10000 && Math.abs(j2 - nLEVideoAnimation.getStartTime()) <= 10000) || j >= 10000) {
            return false;
        }
        return true;
    }

    public static void LJIIIIZZ(NLESegmentTransition nLESegmentTransition, NLESegmentTransition nLESegmentTransition2, NLETrackSlot nLETrackSlot, NLETrack nLETrack) {
        NLETrackSlot nLETrackSlot2;
        long transitionDuration;
        long transitionDuration2;
        VecNLETrackSlotSPtr sortedSlots = nLETrack.getSortedSlots();
        if (sortedSlots != null) {
            int iIndexOf = sortedSlots.indexOf(nLETrackSlot);
            VecNLETrackSlotSPtr sortedSlots2 = nLETrack.getSortedSlots();
            if (sortedSlots2 != null && (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(iIndexOf + 1, sortedSlots2)) != null) {
                if (C347020Dj2.LIZ(nLESegmentTransition) && nLESegmentTransition != null) {
                    transitionDuration = nLESegmentTransition.getTransitionDuration();
                } else {
                    transitionDuration = 0;
                }
                if (C347020Dj2.LIZ(nLESegmentTransition2) && nLESegmentTransition2 != null) {
                    transitionDuration2 = nLESegmentTransition2.getTransitionDuration();
                } else {
                    transitionDuration2 = 0;
                }
                long j = transitionDuration2 - transitionDuration;
                if (Math.abs(j) < 10000) {
                    return;
                }
                if (j > 0) {
                    LIZ(0L, nLETrack, nLETrackSlot);
                    LIZJ(0L, nLETrack, nLETrackSlot2);
                } else {
                    LIZLLL(nLETrack, nLETrackSlot);
                    LJ(0L, nLETrack, nLETrackSlot2);
                }
            }
        }
    }
}
