package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02xG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C755602xG implements InterfaceC0148002o {
    public final C755502xF LL;

    public C755602xG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C755602xG) && Intrinsics.LJFF(this.LL, ((C755602xG) obj).LL);
    }

    public final int hashCode() {
        C755502xF c755502xF = this.LL;
        if (c755502xF == null) {
            return 0;
        }
        return c755502xF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderSummaryState(summaryVO=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C755602xG(int i) {
        this.LL = null;
    }
}
