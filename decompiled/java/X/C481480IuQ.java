package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481480IuQ extends AbstractC481570IuZ {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C481480IuQ) && Intrinsics.LJFF(this.LIZ, ((C481480IuQ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetRandomMatchStateTimeoutFailed(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C481480IuQ(Throwable th) {
        this.LIZ = th;
    }
}
