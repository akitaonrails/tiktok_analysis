package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b7S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961160b7S extends C955670ayb {
    public String LJ;
    public final int LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C961160b7S)) {
            return false;
        }
        C961160b7S c961160b7S = (C961160b7S) obj;
        return Intrinsics.LJFF(this.LJ, c961160b7S.LJ) && this.LJFF == c961160b7S.LJFF && Intrinsics.LJFF(this.LJI, c961160b7S.LJI);
    }

    public final int hashCode() {
        return (((this.LJ.hashCode() * 31) + this.LJFF) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpgradeTitleItem(title=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", titleType=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", hint=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C961160b7S(String str, int i, int i2) {
        String str2;
        i = (i2 & 2) != 0 ? -1 : i;
        if ((i2 & 4) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(str, i, str2);
    }

    public C961160b7S(String str, int i, String str2) {
        this.LJ = str;
        this.LJFF = i;
        this.LJI = str2;
    }
}
