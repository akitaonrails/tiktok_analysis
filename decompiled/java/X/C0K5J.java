package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K5J, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K5J {
    public final C0K5G LIZ;
    public final C0K5H LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K5J)) {
            return false;
        }
        C0K5J c0k5j = (C0K5J) obj;
        return Intrinsics.LJFF(this.LIZ, c0k5j.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k5j.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MetricInfo(pageShowTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageMemory=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K5J(C0K5G c0k5g, C0K5H c0k5h) {
        this.LIZ = c0k5g;
        this.LIZIZ = c0k5h;
    }
}
