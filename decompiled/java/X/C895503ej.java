package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C895503ej {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C895503ej)) {
            return false;
        }
        C895503ej c895503ej = (C895503ej) obj;
        return Intrinsics.LJFF(this.LIZ, c895503ej.LIZ) && Intrinsics.LJFF(this.LIZIZ, c895503ej.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean LIZ() {
        return C123100dR.LIZ(this.LIZ) || C123100dR.LIZ(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = this.LIZIZ;
        if (str == null) {
            str = "";
        }
        sbLIZ.append(str);
        sbLIZ.append('/');
        String str2 = this.LIZ;
        sbLIZ.append(str2 != null ? str2 : "");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C895503ej(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
