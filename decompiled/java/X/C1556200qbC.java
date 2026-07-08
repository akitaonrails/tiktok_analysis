package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556200qbC {
    public final String LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append('(');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556200qbC)) {
            return false;
        }
        C1556200qbC c1556200qbC = (C1556200qbC) obj;
        if (Intrinsics.LJFF(this.LIZ, c1556200qbC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1556200qbC.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C1556200qbC(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
