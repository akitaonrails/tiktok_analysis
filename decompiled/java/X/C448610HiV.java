package X;

/* JADX INFO: renamed from: X.0HiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448610HiV {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C448610HiV() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448610HiV)) {
            return false;
        }
        C448610HiV c448610HiV = (C448610HiV) obj;
        return this.LIZ == c448610HiV.LIZ && this.LIZIZ == c448610HiV.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VisualSearchQRCodeEntryState(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C448610HiV(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
