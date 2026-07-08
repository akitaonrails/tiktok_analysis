package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867230Y0j {
    public final C1785320wYk LIZ;
    public final List<C1777420wM0> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C867230Y0j)) {
            return false;
        }
        C867230Y0j c867230Y0j = (C867230Y0j) obj;
        return Intrinsics.LJFF(this.LIZ, c867230Y0j.LIZ) && Intrinsics.LJFF(this.LIZIZ, c867230Y0j.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubPageRenderState(subPage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", renderRows=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C867230Y0j(C1785320wYk c1785320wYk, List<C1777420wM0> list) {
        this.LIZ = c1785320wYk;
        this.LIZIZ = list;
    }
}
