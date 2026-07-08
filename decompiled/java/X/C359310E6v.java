package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0E6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359310E6v {
    public static final C359310E6v LIZ = new C359310E6v();

    public static int LIZIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        VecNLETrackSlotSPtr sortedSlots;
        NLETimeSpaceNode nLETimeSpaceNode;
        int i;
        NLETrack nLETrackLJLLILLLL = C351220Dpo.LJLLILLLL(nLEModel, nLETrackSlot.getUUID());
        if (nLETrackLJLLILLLL == null || (sortedSlots = nLETrackLJLLILLLL.getSortedSlots()) == null || sortedSlots.isEmpty()) {
            return 0;
        }
        Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(it2.next().getUUID(), nLETrackSlot.getUUID())) {
                if (i2 < 0 || (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLZIJ(i2 + 1, sortedSlots)) == null) {
                    return 0;
                }
                long startTime = nLETimeSpaceNode.getStartTime() - nLETrackSlot.getStartTime();
                if (startTime <= 0 || (i = (int) (startTime / 1000)) < 0) {
                    return 0;
                }
                return i;
            }
            i2++;
        }
        return 0;
    }

    public static Long LIZJ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot next;
        NLETrack nLETrackLJLLILLLL = C351220Dpo.LJLLILLLL(nLEModel, nLETrackSlot.getUUID());
        if (nLETrackLJLLILLLL == null || nLETrackLJLLILLLL.getMainTrack() || (sortedSlots = nLETrackLJLLILLLL.getSortedSlots()) == null) {
            return null;
        }
        long measuredEndTime = nLETrackSlot.getMeasuredEndTime();
        Iterator<NLETrackSlot> it2 = sortedSlots.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLETrackSlot nLETrackSlot2 = next;
                if (!Intrinsics.LJFF(nLETrackSlot2.getUUID(), nLETrackSlot.getUUID()) && nLETrackSlot2.getStartTime() >= measuredEndTime) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrackSlot nLETrackSlot3 = next;
        if (nLETrackSlot3 == null) {
            return null;
        }
        return Long.valueOf(nLETrackSlot3.getStartTime() - measuredEndTime);
    }

    public static long LIZLLL(AIGCGenerationParam aIGCGenerationParam, String str) {
        if (aIGCGenerationParam.maxPipAppendDurationMs <= 0 || a0.LJJJIL(str)) {
            return -1L;
        }
        long j = C20137613qo.LIZ.LIZLLL(str).LJ;
        if (j <= 0) {
            return -1L;
        }
        long j2 = aIGCGenerationParam.duration;
        if (j2 < 0 || j2 <= 0) {
            return -1L;
        }
        long j3 = aIGCGenerationParam.maxPipAppendDurationMs;
        if (j3 < 0) {
            j3 = 0;
        }
        long jMin = Math.min(j, Math.min(j2, j3));
        if (jMin < 0) {
            return 0L;
        }
        return jMin;
    }

    public static long LIZ(AIGCGenerationParam aIGCGenerationParam, String str, boolean z) {
        long jMin = aIGCGenerationParam.duration;
        if (jMin < 0) {
            jMin = 0;
        }
        int i = aIGCGenerationParam.maxPipAppendDurationMs;
        if (i > 0) {
            jMin = Math.min(jMin, i);
        }
        if (z && str != null && !a0.LJJJIL(str)) {
            long j = C20137613qo.LIZ.LIZLLL(str).LJ;
            if (j > 0) {
                return Math.min(jMin, j);
            }
            return jMin;
        }
        return jMin;
    }
}
