package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K5K, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K5K {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K5K)) {
            return false;
        }
        C0K5K c0k5k = (C0K5K) obj;
        return Intrinsics.LJFF(this.LIZ, c0k5k.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k5k.LIZIZ) && this.LIZJ == c0k5k.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivilegePageTabData(packageId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", perkNum=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K5K(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
    }
}
