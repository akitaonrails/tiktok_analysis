package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219940hqq extends AbstractC1588120rQg {
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1219940hqq) && Intrinsics.LJFF(this.LJI, ((C1219940hqq) obj).LJI);
    }

    public final int hashCode() {
        return this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadUpPagination(loadUpPageToken=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1219940hqq(String str) {
        super(3, 0, null, EnumC1586890rOh.UNKNOWN, null, str, 20);
        this.LJI = str;
    }
}
