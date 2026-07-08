package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Z2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Z2 {
    public final String LIZ;
    public final EnumC1799930wwJ LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07Z2)) {
            return false;
        }
        C07Z2 c07z2 = (C07Z2) obj;
        return Intrinsics.LJFF(this.LIZ, c07z2.LIZ) && this.LIZIZ == c07z2.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Target(clientKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", missionType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07Z2(EnumC1799930wwJ enumC1799930wwJ, String str) {
        this.LIZ = str;
        this.LIZIZ = enumC1799930wwJ;
    }
}
