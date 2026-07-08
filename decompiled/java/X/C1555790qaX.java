package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555790qaX extends AbstractC1556060qay {
    public final Throwable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1555790qaX) && Intrinsics.LJFF(this.LIZ, ((C1555790qaX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(e=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555790qaX(Throwable th) {
        this.LIZ = th;
    }
}
