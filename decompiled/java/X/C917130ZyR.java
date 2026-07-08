package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917130ZyR implements InterfaceC0148002o {
    public final Object LL;

    public C917130ZyR() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C917130ZyR) && Intrinsics.LJFF(this.LL, ((C917130ZyR) obj).LL);
    }

    public final int hashCode() {
        Object obj = this.LL;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaReviewState(reviewData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C917130ZyR(Object obj) {
        this.LL = obj;
    }
}
