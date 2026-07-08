package X;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0zyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916480zyI extends AbstractC1916470zyH {
    public static final C1916480zyI LIZIZ = new C1916480zyI();
    public static final String LIZJ = "comment_filter_all_expired_popup";

    @Override // X.AbstractC1916470zyH
    public final long LIZIZ() {
        return TimeUnit.SECONDS.toMillis(C0C64.LJIILLIIL().LJIJ(31744, 604800, "tns_comment_halfsheet_frequency_control", true));
    }

    @Override // X.AbstractC191755100b
    public final String LIZ() {
        return LIZJ;
    }
}
