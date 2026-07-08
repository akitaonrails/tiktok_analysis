package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673080tdi implements InterfaceC1673050tdf {
    public final C1686860tzw LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1673080tdi) && Intrinsics.LJFF(this.LIZ, ((C1673080tdi) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1673080tdi(C1686860tzw c1686860tzw) {
        this.LIZ = c1686860tzw;
    }
}
