package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440070HNl implements InterfaceC440090HNn {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C440070HNl() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440070HNl)) {
            return false;
        }
        C440070HNl c440070HNl = (C440070HNl) obj;
        return Intrinsics.LJFF(this.LIZ, c440070HNl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c440070HNl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c440070HNl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c440070HNl.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageElement(deviceImageAbsolutePath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deviceImageLocalPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onlineImagePath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onlineImageUrl=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C440070HNl(String str, String str2, String str3, String str4, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
