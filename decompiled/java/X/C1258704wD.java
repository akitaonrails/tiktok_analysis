package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04wD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1258704wD {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1258704wD)) {
            return false;
        }
        C1258704wD c1258704wD = (C1258704wD) obj;
        return Intrinsics.LJFF(this.LIZ, c1258704wD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1258704wD.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventSourceInfo(eventSource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originDomain=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1258704wD(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
