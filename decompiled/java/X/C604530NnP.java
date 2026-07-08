package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NnP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604530NnP {
    public final String LIZ;
    public final C604540NnQ LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C604530NnP)) {
            return false;
        }
        C604530NnP c604530NnP = (C604530NnP) obj;
        return Intrinsics.LJFF(this.LIZ, c604530NnP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c604530NnP.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationPayload(entrance=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", gpsRequestConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C604530NnP(String str, C604540NnQ c604540NnQ) {
        this.LIZ = str;
        this.LIZIZ = c604540NnQ;
    }
}
