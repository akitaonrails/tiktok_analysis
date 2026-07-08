package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cMY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1008960cMY extends AbstractC1009010cMd {
    public final C1009270cN3 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1008960cMY) && Intrinsics.LJFF(this.LIZ, ((C1008960cMY) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlideTiles(logInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1008960cMY(C1009270cN3 c1009270cN3) {
        this.LIZ = c1009270cN3;
    }
}
