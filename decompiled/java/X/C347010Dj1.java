package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347010Dj1 {
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r2 == null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r9, com.bytedance.ies.nle.editor_jni.NLETrackSlot r10) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347010Dj1.LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLETrackSlot):boolean");
    }

    public static boolean LIZJ(List list, List list2) {
        if (list == null || list.size() != list2.size()) {
            return true;
        }
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                if (!Intrinsics.LJFF(((NLENode) obj).getStringId(), ((NLENode) ListProtector.get(list, i)).getStringId())) {
                    return true;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return false;
    }

    public static final void LIZIZ(int i, VecNLETrackSlotSPtr vecNLETrackSlotSPtr, long[] jArr) {
        long transitionDuration;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(i, vecNLETrackSlotSPtr);
        long transitionDuration2 = 0;
        if (nLETrackSlot == null) {
            jArr[0] = 0;
            jArr[1] = 0;
            return;
        }
        long startTime = nLETrackSlot.getStartTime();
        long endTime = nLETrackSlot.getEndTime();
        NLESegmentTransition endTransition = nLETrackSlot.getEndTransition();
        if (endTransition != null && C347020Dj2.LIZ(endTransition)) {
            transitionDuration = endTransition.getTransitionDuration() / ((long) 2);
        } else {
            transitionDuration = 0;
        }
        if (i > 0 && i < vecNLETrackSlotSPtr.size()) {
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ListProtector.get(vecNLETrackSlotSPtr, i - 1);
            if (C347020Dj2.LIZIZ(nLETrackSlot2)) {
                NLESegmentTransition endTransition2 = nLETrackSlot2.getEndTransition();
                if (endTransition2 != null) {
                    transitionDuration2 = endTransition2.getTransitionDuration();
                }
                transitionDuration2 /= (long) 2;
            }
        }
        jArr[0] = startTime + transitionDuration2;
        jArr[1] = endTime - transitionDuration;
    }
}
