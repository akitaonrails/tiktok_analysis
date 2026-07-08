package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0XqK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861140XqK implements InterfaceC1785530wZ5 {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C861140XqK)) {
            return false;
        }
        C861140XqK c861140XqK = (C861140XqK) obj;
        return Intrinsics.LJFF(this.LIZ, c861140XqK.LIZ) && this.LIZIZ == c861140XqK.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenFaq(schema=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fromRankType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C861140XqK(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
