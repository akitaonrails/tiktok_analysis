package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Aq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C290601Aq {
    public final C1B0X LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C290601Aq)) {
            return false;
        }
        C290601Aq c290601Aq = (C290601Aq) obj;
        return Intrinsics.LJFF(this.LIZ, c290601Aq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c290601Aq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c290601Aq.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatedOrder(requestContext=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contractId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iapPayload=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C290601Aq(C1B0X c1b0x, String str, String str2) {
        this.LIZ = c1b0x;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
