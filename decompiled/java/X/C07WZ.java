package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07WZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07WZ implements InterfaceC1875007Wa {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07WZ) && Intrinsics.LJFF(this.LIZ, ((C07WZ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failure(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07WZ(String str) {
        this.LIZ = str;
    }
}
