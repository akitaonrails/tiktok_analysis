package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Giz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423430Giz {
    public final boolean LIZ;
    public final C448570HiR LIZIZ;

    public C423430Giz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C423430Giz)) {
            return false;
        }
        C423430Giz c423430Giz = (C423430Giz) obj;
        return this.LIZ == c423430Giz.LIZ && Intrinsics.LJFF(this.LIZIZ, c423430Giz.LIZIZ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        C448570HiR c448570HiR = this.LIZIZ;
        return iZ2 + (c448570HiR == null ? 0 : c448570HiR.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualSearchQRCodeAnchorState(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", display=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C423430Giz(int i) {
        this(false, null);
    }

    public C423430Giz(boolean z, C448570HiR c448570HiR) {
        this.LIZ = z;
        this.LIZIZ = c448570HiR;
    }
}
