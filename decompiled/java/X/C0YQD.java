package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YQD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YQD {
    public final String LIZ;
    public final String LIZIZ;
    public final C874210YRf LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YQD)) {
            return false;
        }
        C0YQD c0yqd = (C0YQD) obj;
        return Intrinsics.LJFF(this.LIZ, c0yqd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yqd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0yqd.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudioAuthConfig(serviceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", host=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", authToken=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YQD(String str, String str2, C874210YRf c874210YRf) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c874210YRf;
    }
}
