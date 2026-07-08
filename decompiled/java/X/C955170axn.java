package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0axn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955170axn extends AbstractC955360ay6 {
    public final C942080acg LIZ;
    public final C955230axt LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955170axn)) {
            return false;
        }
        C955170axn c955170axn = (C955170axn) obj;
        return Intrinsics.LJFF(this.LIZ, c955170axn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c955170axn.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutDidChanged(renderResult=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955170axn(C942080acg c942080acg, C955230axt c955230axt) {
        this.LIZ = c942080acg;
        this.LIZIZ = c955230axt;
    }
}
