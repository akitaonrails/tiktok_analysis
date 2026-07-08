package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1889707ah {
    public final Integer LIZ;
    public final Integer LIZIZ;

    public C1889707ah() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1889707ah)) {
            return false;
        }
        C1889707ah c1889707ah = (C1889707ah) obj;
        return Intrinsics.LJFF(this.LIZ, c1889707ah.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1889707ah.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPPanelTopBarUIConfig(applyAllIconResId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", applyAllTextResId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1889707ah(Integer num, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = num2;
    }
}
