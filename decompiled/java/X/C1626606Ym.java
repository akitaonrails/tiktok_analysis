package X;

/* JADX INFO: renamed from: X.06Ym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1626606Ym {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1626606Ym() {
        this(true, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1626606Ym)) {
            return false;
        }
        C1626606Ym c1626606Ym = (C1626606Ym) obj;
        return this.LIZ == c1626606Ym.LIZ && this.LIZIZ == c1626606Ym.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendButtonUiState(isShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAdjustSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1626606Ym(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
