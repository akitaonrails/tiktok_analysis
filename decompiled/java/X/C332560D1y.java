package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332560D1y {
    public final float LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332560D1y)) {
            return false;
        }
        C332560D1y c332560D1y = (C332560D1y) obj;
        return Float.compare(this.LIZ, c332560D1y.LIZ) == 0 && Intrinsics.LJFF(this.LIZIZ, c332560D1y.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StarDisplayInfo(rating=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", displayText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public C332560D1y(float f, String str) {
        this.LIZ = f;
        this.LIZIZ = str;
    }
}
