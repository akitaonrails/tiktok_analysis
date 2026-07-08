package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C620080OTu {
    public final C1537720q7O LIZ;
    public final C0OU7 LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C620080OTu)) {
            return false;
        }
        C620080OTu c620080OTu = (C620080OTu) obj;
        return Intrinsics.LJFF(this.LIZ, c620080OTu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c620080OTu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c620080OTu.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingHybridView(view=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C620080OTu(C1537720q7O c1537720q7O, C0OU7 c0ou7, String str) {
        this.LIZ = c1537720q7O;
        this.LIZIZ = c0ou7;
        this.LIZJ = str;
    }
}
