package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UxT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789130UxT {
    public final CharSequence LIZ;
    public final AbstractC789120UxS LIZIZ;
    public final AbstractC789090UxP LIZJ;

    public C789130UxT() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C789130UxT)) {
            return false;
        }
        C789130UxT c789130UxT = (C789130UxT) obj;
        return Intrinsics.LJFF(this.LIZ, c789130UxT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c789130UxT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c789130UxT.LIZJ);
    }

    public final int hashCode() {
        CharSequence charSequence = this.LIZ;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        AbstractC789120UxS abstractC789120UxS = this.LIZIZ;
        int iHashCode2 = (iHashCode + (abstractC789120UxS == null ? 0 : abstractC789120UxS.hashCode())) * 31;
        AbstractC789090UxP abstractC789090UxP = this.LIZJ;
        return iHashCode2 + (abstractC789090UxP != null ? abstractC789090UxP.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChipData(label=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", leading=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trailing=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C789130UxT(CharSequence charSequence, int i) {
        this.LIZ = (i & 1) != 0 ? null : charSequence;
        this.LIZIZ = null;
        this.LIZJ = null;
    }
}
