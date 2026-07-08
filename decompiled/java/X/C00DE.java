package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00DE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00DE implements InterfaceC1557660qdY {
    public final String LIZ;

    public C00DE() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00DE) && Intrinsics.LJFF(this.LIZ, ((C00DE) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Manual(tag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00DE(String str) {
        this.LIZ = str;
    }
}
