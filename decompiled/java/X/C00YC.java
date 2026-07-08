package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00YC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00YC {
    public final long LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00YC)) {
            return false;
        }
        C00YC c00yc = (C00YC) obj;
        return this.LIZ == c00yc.LIZ && Intrinsics.LJFF(this.LIZIZ, c00yc.LIZIZ);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        String str = this.LIZIZ;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesInnerFeedBackSyncEvent(collectionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00YC(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
