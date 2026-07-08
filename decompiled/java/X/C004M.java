package X;

import android.graphics.Point;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004M, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C004M implements C004L {
    public final Point LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C004M) && Intrinsics.LJFF(this.LIZ, ((C004M) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorCoordinate(coordinate=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C004M(Point point) {
        this.LIZ = point;
    }
}
