package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576790Mjl extends AbstractC576850Mjr {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C576790Mjl) && Intrinsics.LJFF(this.LIZ, ((C576790Mjl) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoSuccess(photoPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C576790Mjl(String str) {
        this.LIZ = str;
    }
}
