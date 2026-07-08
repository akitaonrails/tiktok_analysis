package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xGA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812240xGA extends AbstractC1812500xGa {
    public final C1812750xGz LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1812240xGA) && Intrinsics.LJFF(this.LIZ, ((C1812240xGA) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportAction(logBean=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1812240xGA(C1812750xGz c1812750xGz) {
        this.LIZ = c1812750xGz;
    }
}
