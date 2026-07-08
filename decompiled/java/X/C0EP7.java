package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EP7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EP7 {
    public final String LIZ;
    public final EnumC1984607q0 LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EP7)) {
            return false;
        }
        C0EP7 c0ep7 = (C0EP7) obj;
        return Intrinsics.LJFF(this.LIZ, c0ep7.LIZ) && this.LIZIZ == c0ep7.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0ep7.LIZJ) && this.LIZLLL == c0ep7.LIZLLL && this.LJ == c0ep7.LJ && this.LJFF == c0ep7.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PathInfo(originalPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", location=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", compositeIndex=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", textElementIndex=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", itemIndex=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0EP7(String str, EnumC1984607q0 enumC1984607q0, String str2, int i, int i2) {
        this(str, enumC1984607q0, str2, i, i2, -1);
    }

    public C0EP7(String str, EnumC1984607q0 enumC1984607q0, String str2, int i, int i2, int i3) {
        this.LIZ = str;
        this.LIZIZ = enumC1984607q0;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
    }
}
