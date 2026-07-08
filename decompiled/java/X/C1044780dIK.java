package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dIK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044780dIK {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1044780dIK)) {
            return false;
        }
        C1044780dIK c1044780dIK = (C1044780dIK) obj;
        return Intrinsics.LJFF(this.LIZ, c1044780dIK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1044780dIK.LIZIZ) && this.LIZJ == c1044780dIK.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1044780dIK.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShoppingTaskAdClickRequest(event=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", refer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", awemeStruct=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1044780dIK(String str, String str2, int i, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = str3;
    }
}
