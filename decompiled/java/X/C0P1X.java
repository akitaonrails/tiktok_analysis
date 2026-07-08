package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P1X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P1X {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0P1X)) {
            return false;
        }
        C0P1X c0p1x = (C0P1X) obj;
        return Intrinsics.LJFF(this.LIZ, c0p1x.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0p1x.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InjectionPayload(musicId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0P1X(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
