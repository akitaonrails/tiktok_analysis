package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O6v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614110O6v extends AbstractC614100O6u {
    public final C613690O5f LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C614110O6v)) {
            return false;
        }
        C614110O6v c614110O6v = (C614110O6v) obj;
        return Intrinsics.LJFF(this.LIZ, c614110O6v.LIZ) && this.LIZIZ == c614110O6v.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MotaNetRespInfo(requestParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C614110O6v(C613690O5f c613690O5f, int i) {
        this.LIZ = c613690O5f;
        this.LIZIZ = i;
    }
}
