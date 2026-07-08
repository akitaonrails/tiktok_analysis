package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1889907aj {
    public final boolean LIZ;
    public final Integer LIZIZ;

    public C1889907aj() {
        this(true, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1889907aj)) {
            return false;
        }
        C1889907aj c1889907aj = (C1889907aj) obj;
        return this.LIZ == c1889907aj.LIZ && Intrinsics.LJFF(this.LIZIZ, c1889907aj.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        Integer num = this.LIZIZ;
        return iZ2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BodyLoadMoreConfig(autoLoadMore=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", preLoadMoreCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1889907aj(boolean z, Integer num) {
        this.LIZ = z;
        this.LIZIZ = num;
    }
}
