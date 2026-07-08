package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09qC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2495409qC implements InterfaceC2499409qq {
    public final String LIZ;

    public C2495409qC() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2495409qC) && Intrinsics.LJFF(this.LIZ, ((C2495409qC) obj).LIZ);
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
        sbLIZ.append("Intercepted(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2495409qC(String str) {
        this.LIZ = str;
    }
}
