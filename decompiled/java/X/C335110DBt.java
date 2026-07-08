package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335110DBt extends AbstractC335160DBy {
    public final C334540D9o LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C335110DBt) && Intrinsics.LJFF(this.LIZ, ((C335110DBt) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Deals(deals=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C335110DBt(C334540D9o c334540D9o) {
        this.LIZ = c334540D9o;
    }
}
