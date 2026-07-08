package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.096P, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C096P extends C096Q {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C096P)) {
            return false;
        }
        C096P c096p = (C096P) obj;
        return Intrinsics.LJFF(this.LIZ, c096p.LIZ) && this.LIZIZ == c096p.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(errorMessage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C096P(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
