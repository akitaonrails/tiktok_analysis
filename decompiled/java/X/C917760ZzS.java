package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917760ZzS {
    public final int LIZ;
    public final Integer LIZIZ;

    public C917760ZzS() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C917760ZzS)) {
            return false;
        }
        C917760ZzS c917760ZzS = (C917760ZzS) obj;
        return this.LIZ == c917760ZzS.LIZ && Intrinsics.LJFF(this.LIZIZ, c917760ZzS.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Integer num = this.LIZIZ;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareRevenueSnapshot(shareRevenueSwitch=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shareRevenueRatio=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C917760ZzS(int i, Integer num) {
        this.LIZ = i;
        this.LIZIZ = num;
    }
}
