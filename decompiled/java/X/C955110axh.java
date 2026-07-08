package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0axh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955110axh extends AbstractC955360ay6 {
    public final int LIZ;
    public final String LIZIZ;
    public final C955230axt LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955110axh)) {
            return false;
        }
        C955110axh c955110axh = (C955110axh) obj;
        return this.LIZ == c955110axh.LIZ && Intrinsics.LJFF(this.LIZIZ, c955110axh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c955110axh.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutError(errorCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955110axh(int i, String str, C955230axt c955230axt) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = c955230axt;
    }
}
