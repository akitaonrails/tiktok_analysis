package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06oC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1718606oC implements InterfaceC1719106oH {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1718606oC)) {
            return false;
        }
        C1718606oC c1718606oC = (C1718606oC) obj;
        return this.LIZ == c1718606oC.LIZ && Intrinsics.LJFF(this.LIZIZ, c1718606oC.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlockedStatusChanged(isBlocked=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1718606oC(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
