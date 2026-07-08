package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bpn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988650bpn extends AbstractC1007980cKy {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C988650bpn) && Intrinsics.LJFF(this.LIZ, ((C988650bpn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserInteract(interactType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C988650bpn(String str) {
        this.LIZ = str;
    }
}
