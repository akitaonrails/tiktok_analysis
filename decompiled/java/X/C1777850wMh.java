package X;

/* JADX INFO: renamed from: X.0wMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777850wMh implements InterfaceC1815550xLV {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1777850wMh() {
        this(false, false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777850wMh)) {
            return false;
        }
        C1777850wMh c1777850wMh = (C1777850wMh) obj;
        return this.LIZ == c1777850wMh.LIZ && this.LIZIZ == c1777850wMh.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MainEditor(isFirstEntry=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", removeBoardItemIfExisting=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777850wMh(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
