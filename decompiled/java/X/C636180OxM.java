package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636180OxM extends AbstractC636210OxP {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C636180OxM) && Intrinsics.LJFF(this.LIZ, ((C636180OxM) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fail(error=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C636180OxM(Throwable th) {
        this.LIZ = th;
    }
}
