package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rXJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592230rXJ extends C09AY implements Function0<Boolean> {
    public C1592230rXJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        if (C1592440rXe.LIZ < 0) {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "bottom_tab_animation_optimization", true);
            C1592440rXe.LIZ = iLJIJ;
            if (iLJIJ < 0) {
                C1592440rXe.LIZ = 0;
            }
        }
        return Boolean.valueOf(C1592440rXe.LIZ == 1);
    }
}
