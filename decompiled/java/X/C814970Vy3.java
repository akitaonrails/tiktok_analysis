package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vy3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C814970Vy3 {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C814970Vy3)) {
            return false;
        }
        C814970Vy3 c814970Vy3 = (C814970Vy3) obj;
        return Intrinsics.LJFF(this.LIZ, c814970Vy3.LIZ) && this.LIZIZ == c814970Vy3.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RightFallback(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C814970Vy3(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
