package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555960qao implements InterfaceC1557210qcp {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1555960qao) && Intrinsics.LJFF(this.LIZ, ((C1555960qao) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Value(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555960qao(String str) {
        this.LIZ = str;
    }
}
