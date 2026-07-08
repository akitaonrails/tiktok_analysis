package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00dS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C123200dS {
    public static int LIZ(String str) {
        try {
            return CastIntegerProtector.parseInt(str);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("convert liveJourneyPoints error: ");
            sbLIZ.append(str);
            C20441214yg.LJ("LiveQuickPostManager", C2188811AlT.LIZIZ(sbLIZ));
            return 0;
        }
    }
}
