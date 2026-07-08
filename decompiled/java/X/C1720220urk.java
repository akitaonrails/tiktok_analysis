package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0urk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720220urk extends AbstractC2201008jo {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1720220urk)) {
            return false;
        }
        C1720220urk c1720220urk = (C1720220urk) obj;
        return Intrinsics.LJFF(this.LIZ, c1720220urk.LIZ) && this.LIZIZ == c1720220urk.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SetWebViewHeightAction(cardId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1720220urk(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
