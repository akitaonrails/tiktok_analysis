package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.100c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191756100c extends AbstractC191754100a {
    public static final C191756100c LIZIZ = new C191756100c();
    public static final String LIZJ = "recommend_care_mode_banner";

    @Override // X.AbstractC191754100a
    public final long LIZIZ() {
        return C100Z.LIZ(LIZJ) < LIZJ() ? TimeUnit.SECONDS.toMillis(C0C64.LJIILLIIL().LJIJ(31744, 604800, "tns_comment_banner_frequency_control", true)) : TimeUnit.SECONDS.toMillis(C0C64.LJIILLIIL().LJIJ(31744, 2592000, "tns_comment_banner_frequency_control_limit", true));
    }

    @Override // X.AbstractC191754100a
    public final int LIZJ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 3, "tns_comment_banner_frequency_control_count", true);
    }

    @Override // X.AbstractC191755100b
    public final String LIZ() {
        return LIZJ;
    }
}
