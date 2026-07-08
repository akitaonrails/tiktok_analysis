package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349660DnI {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(NLETrackSlot nLETrackSlot) {
        long jLongValue;
        long endTime;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        String extra = nLETrackSlot.getExtra("clip_start");
        if (extra != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(extra)) != null) {
            jLongValue = lLJIILIIL2.longValue();
        } else {
            jLongValue = 0;
        }
        String extra2 = nLETrackSlot.getExtra("clip_end");
        if (extra2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(extra2)) != null) {
            endTime = lLJIILIIL.longValue();
        } else {
            endTime = nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime();
        }
        return new Pair(Long.valueOf(jLongValue), Long.valueOf(endTime));
    }

    public static void LIZIZ(long j, NLETrackSlot nLETrackSlot, long j2) {
        nLETrackSlot.setExtra("clip_start", String.valueOf(j));
        nLETrackSlot.setExtra("clip_end", String.valueOf(j2));
    }
}
