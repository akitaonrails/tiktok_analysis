package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556020qau extends AbstractC1574500r4i {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556020qau)) {
            return false;
        }
        C1556020qau c1556020qau = (C1556020qau) obj;
        return Intrinsics.LJFF(this.LIZ, c1556020qau.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1556020qau.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FypComponent(component=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceVideoId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1574500r4i
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fyp:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(':');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556020qau(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
