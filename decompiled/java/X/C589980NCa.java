package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589980NCa {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C589980NCa)) {
            return false;
        }
        C589980NCa c589980NCa = (C589980NCa) obj;
        return Intrinsics.LJFF(this.LIZ, c589980NCa.LIZ) && this.LIZIZ == c589980NCa.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaceholderConfig(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", color=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C589980NCa(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
