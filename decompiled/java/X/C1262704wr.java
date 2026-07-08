package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04wr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1262704wr {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1262704wr)) {
            return false;
        }
        C1262704wr c1262704wr = (C1262704wr) obj;
        return this.LIZ == c1262704wr.LIZ && Intrinsics.LJFF(this.LIZIZ, c1262704wr.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShoppingTaskGeckoPreloadStarted(success=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1262704wr(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
