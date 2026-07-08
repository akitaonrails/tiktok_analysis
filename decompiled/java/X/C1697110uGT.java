package X;

import X.InterfaceC1451105m9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uGT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697110uGT<T extends InterfaceC1451105m9<? extends Boolean>> {
    public final String LIZ;
    public final T LIZIZ;

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.LIZIZ;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AccessibilityAction(label=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1697110uGT)) {
            return false;
        }
        C1697110uGT c1697110uGT = (C1697110uGT) obj;
        if (Intrinsics.LJFF(this.LIZ, c1697110uGT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1697110uGT.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C1697110uGT(String str, T t) {
        this.LIZ = str;
        this.LIZIZ = t;
    }
}
