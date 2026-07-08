package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CYF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CYF extends C0CYD {
    public final C948850anb LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0CYF) && Intrinsics.LJFF(this.LIZ, ((C0CYF) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnRandomMatchEventReceived(randomMatchData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0CYF(C948850anb c948850anb) {
        this.LIZ = c948850anb;
    }
}
