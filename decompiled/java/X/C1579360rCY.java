package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579360rCY {
    public final int[] LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1579360rCY)) {
            return false;
        }
        C1579360rCY c1579360rCY = (C1579360rCY) obj;
        return Intrinsics.LJFF(this.LIZ, c1579360rCY.LIZ) && this.LIZIZ == c1579360rCY.LIZIZ;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CardSpec(colors=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        sbLIZ.append(", heightDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1579360rCY(int[] iArr, int i) {
        this.LIZ = iArr;
        this.LIZIZ = i;
    }
}
