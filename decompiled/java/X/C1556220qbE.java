package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556220qbE {
    public final List<InterfaceC1806790x7N> LIZ;

    public C1556220qbE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1556220qbE) && Intrinsics.LJFF(this.LIZ, ((C1556220qbE) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletRechargeListUI(rechargeItemList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556220qbE(int i) {
        this(C13BV.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1556220qbE(List<? extends InterfaceC1806790x7N> list) {
        this.LIZ = list;
    }
}
