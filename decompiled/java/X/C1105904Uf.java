package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.04Uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1105904Uf {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(909));

    public static final boolean LIZ() {
        if (C1106104Uh.LIZ()) {
            return ((Boolean) LIZ.getValue()).booleanValue();
        }
        boolean zLIZ = false;
        try {
            SettingsManager.LIZLLL().getClass();
            zLIZ = SettingsManager.LIZ("ec_search_use_origin_top", false);
            return zLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return zLIZ;
        }
    }
}
