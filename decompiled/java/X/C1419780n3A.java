package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n3A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419780n3A extends C343950De5 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1419780n3A) && Intrinsics.LJFF(this.LIZ, ((C1419780n3A) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelReason(buttonName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1419780n3A(String str) {
        this.LIZ = str;
    }
}
