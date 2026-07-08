package X;

/* JADX INFO: renamed from: X.04zg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280204zg {
    public final int LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1280204zg)) {
            return false;
        }
        C1280204zg c1280204zg = (C1280204zg) obj;
        return this.LIZ == c1280204zg.LIZ && this.LIZIZ == c1280204zg.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxSheetAdaptSize(width=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fullCorner=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1280204zg(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
