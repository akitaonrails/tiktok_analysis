package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155860gBU {
    public final int LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155860gBU)) {
            return false;
        }
        C1155860gBU c1155860gBU = (C1155860gBU) obj;
        return this.LIZ == c1155860gBU.LIZ && Intrinsics.LJFF(this.LIZIZ, c1155860gBU.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Object obj = this.LIZIZ;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InvokeIapBuyProductV2Result(resultState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rawResult=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155860gBU(int i, Object obj) {
        this.LIZ = i;
        this.LIZIZ = obj;
    }
}
