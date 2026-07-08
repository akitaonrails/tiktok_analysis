package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mpn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411490mpn implements InterfaceC1411480mpm {
    public final C1787830wcn LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1411490mpn) && Intrinsics.LJFF(this.LIZ, ((C1411490mpn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CashierDismiss(order=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1411490mpn(C1787830wcn c1787830wcn) {
        this.LIZ = c1787830wcn;
    }
}
