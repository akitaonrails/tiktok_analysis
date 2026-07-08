package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516100KLw {
    public final String LIZ;
    public final String LIZIZ;

    public C516100KLw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C516100KLw)) {
            return false;
        }
        C516100KLw c516100KLw = (C516100KLw) obj;
        return Intrinsics.LJFF(this.LIZ, c516100KLw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c516100KLw.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkStatusModel(networkSpeed=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", networkType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C516100KLw(int i) {
        this.LIZ = "";
        this.LIZIZ = "";
    }
}
