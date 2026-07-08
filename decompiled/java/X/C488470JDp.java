package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488470JDp {
    public final String LIZ;
    public final String LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C488470JDp() {
        String str = null;
        this(str, str, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C488470JDp)) {
            return false;
        }
        C488470JDp c488470JDp = (C488470JDp) obj;
        return Intrinsics.LJFF(this.LIZ, c488470JDp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c488470JDp.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditedInfo(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C488470JDp(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public /* synthetic */ C488470JDp(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
