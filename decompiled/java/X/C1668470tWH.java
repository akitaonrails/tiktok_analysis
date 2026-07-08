package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668470tWH {
    public final float LIZ;
    public final AbstractC1668700tWe LIZIZ;

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BorderStroke(width=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZ));
        sbLIZ.append(", brush=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1668470tWH)) {
            return false;
        }
        C1668470tWH c1668470tWH = (C1668470tWH) obj;
        if (C1668650tWZ.LIZJ(this.LIZ, c1668470tWH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1668470tWH.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C1668470tWH(float f, C1680950tqP c1680950tqP) {
        this.LIZ = f;
        this.LIZIZ = c1680950tqP;
    }
}
