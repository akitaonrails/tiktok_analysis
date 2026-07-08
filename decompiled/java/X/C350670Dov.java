package X;

import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLEStyClip;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;

/* JADX INFO: renamed from: X.0Dov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350670Dov {
    public static NLEStyCrop LIZ(NLEStyClip nLEStyClip) {
        NLEStyCrop nLEStyCrop = new NLEStyCrop();
        NLEPoint leftUpper = nLEStyClip.getLeftUpper();
        if (leftUpper == null) {
            leftUpper = new NLEPoint();
        }
        NLEPoint leftLower = nLEStyClip.getLeftLower();
        if (leftLower == null) {
            leftLower = new NLEPoint();
        }
        NLEPoint rightUpper = nLEStyClip.getRightUpper();
        if (rightUpper == null) {
            rightUpper = new NLEPoint();
        }
        NLEPoint rightLower = nLEStyClip.getRightLower();
        if (rightLower == null) {
            rightLower = new NLEPoint();
        }
        float f = 1;
        float f2 = 2;
        nLEStyCrop.setXLeftUpper((leftUpper.getX() + f) / f2);
        nLEStyCrop.setYLeftUpper((f - leftUpper.getY()) / f2);
        nLEStyCrop.setXRightUpper((rightUpper.getX() + f) / f2);
        nLEStyCrop.setYRightUpper((f - rightUpper.getY()) / f2);
        nLEStyCrop.setXLeftLower((leftLower.getX() + f) / f2);
        nLEStyCrop.setYLeftLower((f - leftLower.getY()) / f2);
        nLEStyCrop.setXRightLower((rightLower.getX() + f) / f2);
        nLEStyCrop.setYRightLower((f - rightLower.getY()) / f2);
        return nLEStyCrop;
    }

    public static void LIZIZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, long[] jArr) {
        long measuredEndTime;
        long transitionDuration;
        NLESegmentTransition endTransition;
        long startTime = nLETrackSlot.getStartTime();
        if (nLETrack.getMainTrack()) {
            measuredEndTime = nLETrackSlot.getEndTime();
        } else {
            measuredEndTime = nLETrackSlot.getMeasuredEndTime();
        }
        if (nLETrack.getMainTrack()) {
            int slotIndex = nLETrack.getSlotIndex(nLETrackSlot);
            VecNLETrackSlotSPtr sortedSlots = nLETrack.getSortedSlots();
            long transitionDuration2 = 0;
            if (slotIndex > 0 && slotIndex < sortedSlots.size() && (endTransition = sortedSlots.get(slotIndex - 1).getEndTransition()) != null && C347020Dj2.LIZ(endTransition)) {
                transitionDuration = endTransition.getTransitionDuration();
            } else {
                transitionDuration = 0;
            }
            NLESegmentTransition endTransition2 = nLETrackSlot.getEndTransition();
            if (endTransition2 != null && C347020Dj2.LIZ(endTransition2)) {
                transitionDuration2 = endTransition2.getTransitionDuration();
            }
            long j = 2;
            startTime += transitionDuration / j;
            measuredEndTime -= transitionDuration2 / j;
        }
        jArr[0] = startTime;
        jArr[1] = measuredEndTime;
    }

    public static void LJ(NLETrackSlot nLETrackSlot, NLETrack nLETrack, NLETrackSlot nLETrackSlot2, C0E48 c0e48) {
        if (nLETrackSlot.getDuration() < C349360Dmo.LIZIZ) {
            nLETrack.removeSlot(nLETrackSlot);
            String strLJIIZILJ = C351220Dpo.LJIIZILJ(nLETrackSlot);
            if (strLJIIZILJ == null) {
                strLJIIZILJ = "";
            }
            c0e48.LLFII().LJ(new C350650Dot(nLETrackSlot2, strLJIIZILJ), EnumC356070Dxd.COMMIT);
            return;
        }
        C350700Doy.LJIIIZ(C350870DpF.LJI(c0e48), nLETrackSlot);
        C350700Doy.LJIIJ(C350870DpF.LJI(c0e48), nLETrackSlot, nLETrackSlot2);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(X.C0E48 r22, X.EnumC356070Dxd r23, X.InterfaceC349350Dmn r24, com.bytedance.ies.nle.editor_jni.NLETrackSlot r25, java.lang.Long r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 2066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350670Dov.LIZJ(X.0E48, X.0Dxd, X.0Dmn, com.bytedance.ies.nle.editor_jni.NLETrackSlot, java.lang.Long, boolean):boolean");
    }
}
