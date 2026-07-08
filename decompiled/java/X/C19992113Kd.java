package X;

import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13Kd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19992113Kd {
    public final C19991913Kb<Object, Object> LIZ = new C19991913Kb<>(6);
    public final C19991913Kb<Object, Object> LIZIZ = new C19991913Kb<>(6);

    public final void LIZ(C13Z3 c13z3) {
        Object objLIZLLL = this.LIZIZ.LIZLLL(c13z3);
        if (objLIZLLL != null) {
            if (objLIZLLL instanceof C13B1) {
                C13B2 c13b2 = (C13B2) objLIZLLL;
                Object[] objArr = c13b2.LIZ;
                int i = c13b2.LIZIZ;
                for (int i2 = 0; i2 < i; i2++) {
                    C19991813Ka.LIZJ(this.LIZ, (C20035813aO) objArr[i2], new AwS609S0100000_30(c13z3, 16));
                }
                return;
            }
            C19991813Ka.LIZJ(this.LIZ, (C20035813aO) objLIZLLL, new AwS609S0100000_30(c13z3, 16));
        }
    }
}
