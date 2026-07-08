package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Y1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07Y1 implements InterfaceC1905407dE {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07Y1) && Intrinsics.LJFF(this.LIZ, ((C07Y1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StringValue(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07Y1(String str) {
        this.LIZ = str;
    }
}
