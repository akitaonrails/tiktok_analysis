package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00IL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IL {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00IL)) {
            return false;
        }
        C00IL c00il = (C00IL) obj;
        return Intrinsics.LJFF(this.LIZ, c00il.LIZ) && this.LIZIZ == c00il.LIZIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RegionSnapshot(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isCached=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00IL(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
