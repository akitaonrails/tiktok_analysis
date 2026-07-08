package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YP5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YP5 {
    public final C0YP2 LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YP5)) {
            return false;
        }
        C0YP5 c0yp5 = (C0YP5) obj;
        return Intrinsics.LJFF(this.LIZ, c0yp5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yp5.LIZIZ) && this.LIZJ == c0yp5.LIZJ && this.LIZLLL == c0yp5.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewMessage(params=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", msgUuid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", createdAt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", toStringPrivacyFilter=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YP5(C0YP2 c0yp2, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = c0yp2;
        this.LIZIZ = str;
        this.LIZJ = jCurrentTimeMillis;
        this.LIZLLL = false;
    }
}
