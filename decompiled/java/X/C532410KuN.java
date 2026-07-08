package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532410KuN<OUT> implements InterfaceC532390KuL<OUT> {
    public final OUT LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C532410KuN) && Intrinsics.LJFF(this.LIZ, ((C532410KuN) obj).LIZ);
    }

    public final int hashCode() {
        OUT out = this.LIZ;
        if (out == null) {
            return 0;
        }
        return out.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C532410KuN(OUT out) {
        this.LIZ = out;
    }
}
