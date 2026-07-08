package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08ZM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08ZM {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08ZM)) {
            return false;
        }
        C08ZM c08zm = (C08ZM) obj;
        return Intrinsics.LJFF(this.LIZ, c08zm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c08zm.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CallKey(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", context=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C08ZM(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
