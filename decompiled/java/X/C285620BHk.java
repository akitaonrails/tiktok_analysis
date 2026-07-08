package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0BHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C285620BHk {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C285610BHj());

    public static boolean LIZ() {
        if (C1106104Uh.LIZ()) {
            return ((Boolean) LIZ.getValue()).booleanValue();
        }
        try {
            return C0C59.LJ().LJI("enable_ecom_authorization", 0, true) == 1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
