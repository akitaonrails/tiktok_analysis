package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04h8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1165204h8 {
    public final Number LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165204h8)) {
            return false;
        }
        C1165204h8 c1165204h8 = (C1165204h8) obj;
        return Intrinsics.LJFF(this.LIZ, c1165204h8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1165204h8.LIZIZ);
    }

    public final int hashCode() {
        Number number = this.LIZ;
        return ((number == null ? 0 : number.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RiskSignalResult(factor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1165204h8(Number number, String str) {
        this.LIZ = number;
        this.LIZIZ = str;
    }
}
