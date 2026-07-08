package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.001w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0130001w {
    public final String LIZ;
    public final List<C0119001l> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0130001w)) {
            return false;
        }
        C0130001w c0130001w = (C0130001w) obj;
        return Intrinsics.LJFF(this.LIZ, c0130001w.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0130001w.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuctionNoteDisplayGroup(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", items=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0130001w(String str, List<C0119001l> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
