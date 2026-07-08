package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155660gBA {
    public final String LIZ;
    public final Boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155660gBA)) {
            return false;
        }
        C1155660gBA c1155660gBA = (C1155660gBA) obj;
        return Intrinsics.LJFF(this.LIZ, c1155660gBA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1155660gBA.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateUserData(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isBlock=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155660gBA(String str, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = bool;
    }
}
