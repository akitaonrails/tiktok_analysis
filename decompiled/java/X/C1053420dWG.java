package X;

/* JADX INFO: renamed from: X.0dWG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053420dWG extends AbstractC1053500dWO {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    public C1053420dWG() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1053420dWG)) {
            return false;
        }
        C1053420dWG c1053420dWG = (C1053420dWG) obj;
        return this.LIZ == c1053420dWG.LIZ && this.LIZIZ == c1053420dWG.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistoryFooterItemData(showDeleteAllAction=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deleteAllEnabled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1053500dWO
    public final int LIZ() {
        return this.LIZJ;
    }

    public C1053420dWG(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = 2;
    }
}
