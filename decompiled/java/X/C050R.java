package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050R, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C050R {
    public final String LIZ;
    public final boolean LIZIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C050R)) {
            return false;
        }
        C050R c050r = (C050R) obj;
        return Intrinsics.LJFF(this.LIZ, c050r.LIZ) && this.LIZIZ == c050r.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Result(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", suppressGroupSenderPrefix=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C050R(String str) {
        this.LIZ = str;
    }
}
