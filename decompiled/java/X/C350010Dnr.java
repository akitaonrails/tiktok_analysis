package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350010Dnr {
    public final C350040Dnu LIZ;
    public final C350050Dnv LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C350010Dnr)) {
            return false;
        }
        C350010Dnr c350010Dnr = (C350010Dnr) obj;
        return Intrinsics.LJFF(this.LIZ, c350010Dnr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c350010Dnr.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiffResult(mainTrackDiffResult=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subTrackDiffResult=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C350010Dnr(C350040Dnu c350040Dnu, C350050Dnv c350050Dnv) {
        this.LIZ = c350040Dnu;
        this.LIZIZ = c350050Dnv;
    }
}
