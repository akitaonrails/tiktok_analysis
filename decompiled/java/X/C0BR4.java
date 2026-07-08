package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BR4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BR4 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4952));

    public static final boolean LIZ() {
        int iLJI;
        if (C1106104Uh.LIZ()) {
            iLJI = ((Number) LIZ.getValue()).intValue();
        } else {
            try {
                iLJI = C0C59.LJ().LJI("show_satisfaction_sheet", 0, true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return false;
            }
        }
        return iLJI == 1;
    }
}
