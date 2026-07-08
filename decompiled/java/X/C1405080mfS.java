package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405080mfS extends AbstractC1405090mfT {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1405080mfS) && Intrinsics.LJFF(this.LIZ, ((C1405080mfS) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloudMergeFailed(exception=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1405080mfS(Throwable th) {
        this.LIZ = th;
    }
}
