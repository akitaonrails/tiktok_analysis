package X;

/* JADX INFO: renamed from: X.0ZXE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZXE {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZXE)) {
            return false;
        }
        C0ZXE c0zxe = (C0ZXE) obj;
        return this.LIZ == c0zxe.LIZ && this.LIZIZ == c0zxe.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceMinHeightSpacing(topExtraPx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bottomExtraPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZXE(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
