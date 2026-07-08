package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556130qb5 extends AbstractC1556140qb6 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1556130qb5) && Intrinsics.LJFF(this.LIZ, ((C1556130qb5) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenInExternalBrowser(link=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556130qb5(String str) {
        this.LIZ = str;
    }
}
