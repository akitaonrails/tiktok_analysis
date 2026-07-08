package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.006J, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C006J {
    public final Integer LIZ;
    public final boolean LIZIZ;

    public C006J() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C006J)) {
            return false;
        }
        C006J c006j = (C006J) obj;
        return Intrinsics.LJFF(this.LIZ, c006j.LIZ) && this.LIZIZ == c006j.LIZIZ;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        return ((num == null ? 0 : num.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaReviewTopIndicatorOptions(backIconResId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", showNumberTitle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C006J(int i) {
        this.LIZ = null;
        this.LIZIZ = true;
    }
}
