package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507490pKd {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1507490pKd)) {
            return false;
        }
        C1507490pKd c1507490pKd = (C1507490pKd) obj;
        return Intrinsics.LJFF(this.LIZ, c1507490pKd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1507490pKd.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestHeader(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1507490pKd(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
