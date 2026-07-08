package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335290DCl extends AbstractC335340DCq {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C335290DCl) && Intrinsics.LJFF(this.LIZ, ((C335290DCl) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C335290DCl(String str) {
        this.LIZ = str;
    }
}
