package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Zk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1883807Zk {
    public final float LIZ;
    public final float LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1883807Zk)) {
            return false;
        }
        C1883807Zk c1883807Zk = (C1883807Zk) obj;
        return Float.compare(this.LIZ, c1883807Zk.LIZ) == 0 && Float.compare(this.LIZIZ, c1883807Zk.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c1883807Zk.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentBounds(start=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public C1883807Zk(String str, float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = str;
    }
}
