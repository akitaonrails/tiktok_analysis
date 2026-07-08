package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901180ZWy implements C0ZX0 {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C901180ZWy)) {
            return false;
        }
        C901180ZWy c901180ZWy = (C901180ZWy) obj;
        return Intrinsics.LJFF(this.LIZ, c901180ZWy.LIZ) && this.LIZIZ == c901180ZWy.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Buffering(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalDurationMillis=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C901180ZWy(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
