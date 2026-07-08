package X;

import java.security.SecureRandom;

/* JADX INFO: renamed from: X.0QTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670910QTh {
    public static boolean LIZ() {
        Boolean boolValueOf = C664390Q4f.LJII;
        if (boolValueOf == null) {
            boolean z = true;
            if (!C2187451AjH.LJIIJ()) {
                float fNextFloat = new SecureRandom().nextFloat();
                if (C670970QTn.LIZ < 0.0f) {
                    C670970QTn.LIZ = C0C64.LJIILLIIL().LJIILL(31744, "search_player_performance_sample_rate", true, 0.06f);
                }
                if (fNextFloat >= C670970QTn.LIZ) {
                    z = false;
                }
            }
            boolValueOf = Boolean.valueOf(z);
            C664390Q4f.LJII = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
