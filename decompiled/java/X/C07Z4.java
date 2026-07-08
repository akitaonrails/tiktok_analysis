package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Z4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Z4 {
    public final EnumC1799930wwJ LIZ;
    public final String LIZIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07Z4)) {
            return false;
        }
        C07Z4 c07z4 = (C07Z4) obj;
        return this.LIZ == c07z4.LIZ && Intrinsics.LJFF(this.LIZIZ, c07z4.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRevisitCta(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07Z4(EnumC1799930wwJ enumC1799930wwJ) {
        this.LIZ = enumC1799930wwJ;
    }
}
