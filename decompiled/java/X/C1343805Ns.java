package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1343805Ns {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1343805Ns)) {
            return false;
        }
        C1343805Ns c1343805Ns = (C1343805Ns) obj;
        return Intrinsics.LJFF(this.LIZ, c1343805Ns.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1343805Ns.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DistinctDep(panel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1343805Ns(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
