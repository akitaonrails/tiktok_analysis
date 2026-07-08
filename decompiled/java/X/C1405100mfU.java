package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405100mfU extends AbstractC1405090mfT {
    public final String LIZ;
    public final int LIZIZ = 2;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1405100mfU)) {
            return false;
        }
        C1405100mfU c1405100mfU = (C1405100mfU) obj;
        return Intrinsics.LJFF(this.LIZ, c1405100mfU.LIZ) && this.LIZIZ == c1405100mfU.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloudMergeSuccess(resultVID=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1405100mfU(String str) {
        this.LIZ = str;
    }
}
