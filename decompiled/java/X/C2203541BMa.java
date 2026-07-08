package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.1BMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203541BMa {
    public static final C805560Vis LIZ = C805560Vis.LJ("safe_mode_v2_status");

    public static synchronized C1BMX LIZ() {
        C1BMX c1bmx;
        try {
            c1bmx = (C1BMX) new Gson().LJII(LIZ.LIZJ("protected_activity_result", ""), C1BMX.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c1bmx = null;
        }
        return c1bmx;
    }

    public static synchronized void LIZIZ(boolean z) {
        LIZ.LIZ.edit().putBoolean("last_operator_is_clean", z).apply();
    }

    public static synchronized void LIZJ(C1BMX c1bmx) {
        LIZ.LJIIIIZZ("protected_activity_result", GsonProtectorUtils.toJson(new Gson(), c1bmx, C1BMX.class));
    }
}
