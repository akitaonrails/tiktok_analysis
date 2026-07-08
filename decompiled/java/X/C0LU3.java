package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LU3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LU3 extends C0LU9 {
    public final C542800LQo<Boolean> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LU3) && Intrinsics.LJFF(this.LIZ, ((C0LU3) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCArchWorkflowCanceled(cancellationResult=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LU3(C542800LQo<Boolean> c542800LQo) {
        this.LIZ = c542800LQo;
    }
}
