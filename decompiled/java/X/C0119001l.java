package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.001l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0119001l {
    public final String LIZ;
    public final Integer LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0119001l)) {
            return false;
        }
        C0119001l c0119001l = (C0119001l) obj;
        return Intrinsics.LJFF(this.LIZ, c0119001l.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0119001l.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuctionNoteDisplayItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0119001l(String str, Integer num) {
        this.LIZ = str;
        this.LIZIZ = num;
    }
}
