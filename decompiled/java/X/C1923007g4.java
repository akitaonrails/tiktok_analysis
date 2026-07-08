package X;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1923007g4 {
    public static final /* synthetic */ int LIZ = 0;

    public static Boolean LIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        boolean z = true;
        if (obj instanceof Number) {
            if (((Number) obj).intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return Boolean.valueOf(u.LJIJI((String) obj, "true", true));
    }

    public static Number LIZIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        boolean z = false;
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                return 1;
            }
            return 0;
        }
        if (obj instanceof String) {
            if (((CharSequence) obj).length() > 0) {
                z = true;
            }
            if (z && (!a0.LJJJIL(r1)) && !u.LJIJI((String) obj, "null", true)) {
                try {
                    return Double.valueOf(CastDoubleProtector.parseDouble((String) obj));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return null;
    }
}
