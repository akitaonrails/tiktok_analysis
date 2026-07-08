package X;

import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Dj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347090Dj9 {
    public static boolean LIZ(NLETrackSlot nLETrackSlot) {
        Unit unit;
        try {
            if (C347080Dj8.LIZJ(nLETrackSlot) != null) {
                return true;
            }
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null) {
                if (NLESegmentTextTemplate.dynamicCast(mainSegment) != null) {
                    return true;
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return false;
        }
    }
}
