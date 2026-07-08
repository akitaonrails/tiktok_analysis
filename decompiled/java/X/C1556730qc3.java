package X;

/* JADX INFO: renamed from: X.0qc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556730qc3 {
    public final int LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556730qc3)) {
            return false;
        }
        C1556730qc3 c1556730qc3 = (C1556730qc3) obj;
        return this.LIZ == c1556730qc3.LIZ && this.LIZIZ == c1556730qc3.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelDismissSetAsDefaultExtras(defaultPermission=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isDefaultSet=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556730qc3(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
