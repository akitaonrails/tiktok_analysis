package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.001u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0128001u {
    public final List<C0130001w> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0128001u)) {
            return false;
        }
        C0128001u c0128001u = (C0128001u) obj;
        return Intrinsics.LJFF(this.LIZ, c0128001u.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0128001u.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuctionNoteDisplayState(groups=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clickSchema=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0128001u(List<C0130001w> list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }
}
