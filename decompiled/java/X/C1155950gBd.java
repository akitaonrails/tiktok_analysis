package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155950gBd extends AbstractC1155960gBe {
    public final C1577560r9e LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155950gBd) && Intrinsics.LJFF(this.LIZ, ((C1155950gBd) obj).LIZ);
    }

    public final int hashCode() {
        C1577560r9e c1577560r9e = this.LIZ;
        if (c1577560r9e == null) {
            return 0;
        }
        return c1577560r9e.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155950gBd(C1577560r9e c1577560r9e) {
        this.LIZ = c1577560r9e;
    }
}
