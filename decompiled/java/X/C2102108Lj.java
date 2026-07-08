package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08Lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2102108Lj {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2102108Lj)) {
            return false;
        }
        C2102108Lj c2102108Lj = (C2102108Lj) obj;
        return Intrinsics.LJFF(this.LIZ, c2102108Lj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2102108Lj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2102108Lj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2102108Lj.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MountEntry(device=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mountPoint=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fsType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", options=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2102108Lj(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
