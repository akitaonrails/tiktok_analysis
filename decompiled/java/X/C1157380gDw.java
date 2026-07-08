package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157380gDw {
    public final EnumC1154170g8l LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157380gDw)) {
            return false;
        }
        C1157380gDw c1157380gDw = (C1157380gDw) obj;
        return this.LIZ == c1157380gDw.LIZ && Intrinsics.LJFF(this.LIZIZ, c1157380gDw.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IAPPurchaseDetail(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157380gDw(EnumC1154170g8l enumC1154170g8l, String str) {
        this.LIZ = enumC1154170g8l;
        this.LIZIZ = str;
    }
}
