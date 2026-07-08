package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00YA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YA {
    public final String LIZ;
    public final Throwable LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00YA)) {
            return false;
        }
        C00YA c00ya = (C00YA) obj;
        return Intrinsics.LJFF(this.LIZ, c00ya.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00ya.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th = this.LIZIZ;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrivacyDataNetworkResult(body=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00YA(String str, Throwable th) {
        this.LIZ = str;
        this.LIZIZ = th;
    }
}
