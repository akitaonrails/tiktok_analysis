package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989690brT implements InterfaceC1715120ujW {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989690brT) && Intrinsics.LJFF(this.LIZ, ((C989690brT) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Exception(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989690brT(Throwable th) {
        this.LIZ = th;
    }
}
