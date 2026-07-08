package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02t5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C729702t5 implements InterfaceC729102sz {
    public final Object LIZ;

    public C729702t5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C729702t5) && Intrinsics.LJFF(this.LIZ, ((C729702t5) obj).LIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspPageContextCompState(dummy=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C729702t5(int i) {
        this.LIZ = null;
    }
}
