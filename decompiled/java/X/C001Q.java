package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.001Q, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C001Q {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C001Q)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.LJFF(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchPdpExpressionInfo(pageExpressionType=");
        sbLIZ.append(0);
        sbLIZ.append(", auctionId=");
        sbLIZ.append((Object) null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
