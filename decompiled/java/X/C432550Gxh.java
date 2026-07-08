package X;

/* JADX INFO: renamed from: X.0Gxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432550Gxh {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C432550Gxh() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C432550Gxh)) {
            return false;
        }
        C432550Gxh c432550Gxh = (C432550Gxh) obj;
        return this.LIZ == c432550Gxh.LIZ && this.LIZIZ == c432550Gxh.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordTrashBinUiState(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isActivated=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C432550Gxh(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public static C432550Gxh LIZ(C432550Gxh c432550Gxh, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = c432550Gxh.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c432550Gxh.LIZIZ;
        }
        c432550Gxh.getClass();
        return new C432550Gxh(z, z2);
    }
}
