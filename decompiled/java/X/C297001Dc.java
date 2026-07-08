package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01Dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C297001Dc {
    public final C1B0X LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C297001Dc)) {
            return false;
        }
        C297001Dc c297001Dc = (C297001Dc) obj;
        return Intrinsics.LJFF(this.LIZ, c297001Dc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c297001Dc.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchasePreparation(requestContext=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clientPayload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C297001Dc(C1B0X c1b0x, String str) {
        this.LIZ = c1b0x;
        this.LIZIZ = str;
    }
}
