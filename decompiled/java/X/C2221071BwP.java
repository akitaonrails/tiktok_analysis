package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221071BwP {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2221071BwP)) {
            return false;
        }
        C2221071BwP c2221071BwP = (C2221071BwP) obj;
        return Intrinsics.LJFF(this.LIZ, c2221071BwP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2221071BwP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2221071BwP.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2221071BwP.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZLLL;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ZipEntryReadRequest(path=" + this.LIZ + ", encoding=" + this.LIZIZ + ", position=" + this.LIZJ + ", length=" + this.LIZLLL + ")";
    }

    public C2221071BwP(String str, String str2, Integer num, Integer num2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
        this.LIZLLL = num2;
    }
}
