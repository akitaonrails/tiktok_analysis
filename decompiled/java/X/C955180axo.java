package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0axo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955180axo extends AbstractC955360ay6 {
    public final C942080acg LIZ;
    public final C955230axt LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955180axo)) {
            return false;
        }
        C955180axo c955180axo = (C955180axo) obj;
        return Intrinsics.LJFF(this.LIZ, c955180axo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c955180axo.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutPipelineEndSuccess(renderResult=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955180axo(C942080acg c942080acg, C955230axt c955230axt) {
        this.LIZ = c942080acg;
        this.LIZIZ = c955230axt;
    }
}
