package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481460IuO extends AbstractC481570IuZ {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C481460IuO) && Intrinsics.LJFF(this.LIZ, ((C481460IuO) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CancelRandomMatchFailed(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C481460IuO(Throwable th) {
        this.LIZ = th;
    }
}
