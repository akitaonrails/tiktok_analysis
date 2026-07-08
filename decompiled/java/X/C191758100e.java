package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.100e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191758100e extends AbstractC191754100a {
    public static final C191758100e LIZIZ = new C191758100e();
    public static final String LIZJ = "comment_dislike_top_guide_popup";

    @Override // X.AbstractC191754100a
    public final long LIZIZ() {
        return C100Z.LIZ(LIZJ) < LIZJ() ? TimeUnit.SECONDS.toMillis(C0C64.LJIILLIIL().LJIJ(31744, 604800, "tns_comment_dislike_frequency_control", true)) : TimeUnit.SECONDS.toMillis(C0C64.LJIILLIIL().LJIJ(31744, 2592000, "tns_comment_dislike_frequency_control_limit", true));
    }

    @Override // X.AbstractC191754100a
    public final int LIZJ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 3, "tns_comment_dislike_frequency_control_count", true);
    }

    @Override // X.AbstractC191755100b
    public final String LIZ() {
        return LIZJ;
    }
}
