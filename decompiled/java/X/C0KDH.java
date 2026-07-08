package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KDH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KDH {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KDH)) {
            return false;
        }
        C0KDH c0kdh = (C0KDH) obj;
        return Intrinsics.LJFF(this.LIZ, c0kdh.LIZ) && this.LIZIZ == c0kdh.LIZIZ && this.LIZJ == c0kdh.LIZJ && this.LIZLLL == c0kdh.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PackagePrivilegeModel(packageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", emoteCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", perkCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", priceGroup=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KDH() {
        this("", 0, 0, 0);
    }

    public C0KDH(String str, int i, int i2, int i3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
