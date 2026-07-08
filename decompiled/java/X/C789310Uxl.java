package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789310Uxl implements InterfaceC204700qb {
    public final Runnable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C789310Uxl) && Intrinsics.LJFF(this.LIZ, ((C789310Uxl) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloseCardRunnable(runnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C789310Uxl(RunnableC1870170ylb runnableC1870170ylb) {
        this.LIZ = runnableC1870170ylb;
    }
}
