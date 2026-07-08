package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YQG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQG {
    public final String LIZ;
    public final String LIZIZ;
    public final C874210YRf LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YQG)) {
            return false;
        }
        C0YQG c0yqg = (C0YQG) obj;
        return Intrinsics.LJFF(this.LIZ, c0yqg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yqg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0yqg.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageAuthConfig(serviceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", host=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", authToken=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YQG(String str, String str2, C874210YRf c874210YRf) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c874210YRf;
    }
}
