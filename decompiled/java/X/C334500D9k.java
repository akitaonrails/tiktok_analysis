package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334500D9k {
    public final C334430D9d LIZ;
    public final C00Y8 LIZIZ;

    public C334500D9k() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C334500D9k)) {
            return false;
        }
        C334500D9k c334500D9k = (C334500D9k) obj;
        return Intrinsics.LJFF(this.LIZ, c334500D9k.LIZ) && this.LIZIZ == c334500D9k.LIZIZ;
    }

    public final int hashCode() {
        C334430D9d c334430D9d = this.LIZ;
        return ((c334430D9d == null ? 0 : c334430D9d.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutProductInfoState(viewState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", quantitySyncState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C334500D9k(int i) {
        this(null, C00Y8.IDLE);
    }

    public C334500D9k(C334430D9d c334430D9d, C00Y8 c00y8) {
        this.LIZ = c334430D9d;
        this.LIZIZ = c00y8;
    }
}
