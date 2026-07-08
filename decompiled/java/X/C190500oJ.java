package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00oJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C190500oJ {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C190500oJ)) {
            return false;
        }
        C190500oJ c190500oJ = (C190500oJ) obj;
        return Intrinsics.LJFF(this.LIZ, c190500oJ.LIZ) && this.LIZIZ == c190500oJ.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForceInsertContribution(from=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rankAfterStep=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C190500oJ(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
