package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869450Y8x {
    public final String LIZ;
    public final C0VRJ LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C869450Y8x)) {
            return false;
        }
        C869450Y8x c869450Y8x = (C869450Y8x) obj;
        return Intrinsics.LJFF(this.LIZ, c869450Y8x.LIZ) && this.LIZIZ == c869450Y8x.LIZIZ && Intrinsics.LJFF(this.LIZJ, c869450Y8x.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderEntry(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", orderType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", castType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C869450Y8x(String str, C0VRJ c0vrj, String str2) {
        this.LIZ = str;
        this.LIZIZ = c0vrj;
        this.LIZJ = str2;
    }
}
