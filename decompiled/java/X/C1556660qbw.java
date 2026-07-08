package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556660qbw {
    public final List<InterfaceC1806790x7N> LIZ;
    public final EnumC1562990qm9 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556660qbw)) {
            return false;
        }
        C1556660qbw c1556660qbw = (C1556660qbw) obj;
        return Intrinsics.LJFF(this.LIZ, c1556660qbw.LIZ) && this.LIZIZ == c1556660qbw.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WalletFullPackageResult(rechargeItemList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", switchPanelType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556660qbw() {
        this(C13BV.INSTANCE, EnumC1562990qm9.DEFAULT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1556660qbw(List<? extends InterfaceC1806790x7N> list, EnumC1562990qm9 enumC1562990qm9) {
        this.LIZ = list;
        this.LIZIZ = enumC1562990qm9;
    }
}
