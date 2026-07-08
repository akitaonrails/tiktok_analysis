package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670750tZx {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1670750tZx)) {
            return false;
        }
        C1670750tZx c1670750tZx = (C1670750tZx) obj;
        return this.LIZ == c1670750tZx.LIZ && Intrinsics.LJFF(this.LIZIZ, c1670750tZx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1670750tZx.LIZJ) && this.LIZLLL == c1670750tZx.LIZLLL;
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return ((iY2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectionUserItemModel(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isAnchor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1670750tZx(long j, String str, String str2, boolean z) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
    }
}
