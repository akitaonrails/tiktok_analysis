package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ud3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711110ud3 extends AbstractC1711120ud4 {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1711110ud3)) {
            return false;
        }
        C1711110ud3 c1711110ud3 = (C1711110ud3) obj;
        return Intrinsics.LJFF(this.LIZ, c1711110ud3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1711110ud3.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmptyContact(actionText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", actionLink=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1711110ud3(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
