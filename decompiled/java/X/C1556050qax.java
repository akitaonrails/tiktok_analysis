package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556050qax extends AbstractC1556060qay {
    public final C1766490w4N LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1556050qax) && Intrinsics.LJFF(this.LIZ, ((C1556050qax) obj).LIZ);
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

    public C1556050qax(C1766490w4N c1766490w4N) {
        this.LIZ = c1766490w4N;
    }
}
