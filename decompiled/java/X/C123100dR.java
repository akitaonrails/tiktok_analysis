package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00dR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C123100dR {
    public static final boolean LIZ(String str) {
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static final Integer LIZIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf = null;
        if (z) {
            return null;
        }
        try {
            numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str));
            return numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return numValueOf;
        }
    }
}
