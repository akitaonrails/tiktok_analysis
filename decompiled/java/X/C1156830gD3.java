package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gD3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156830gD3 {
    public final long LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156830gD3)) {
            return false;
        }
        C1156830gD3 c1156830gD3 = (C1156830gD3) obj;
        return this.LIZ == c1156830gD3.LIZ && Intrinsics.LJFF(this.LIZIZ, c1156830gD3.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheKey(collectionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", variantTag=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156830gD3(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
