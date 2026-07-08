package X;

/* JADX INFO: renamed from: X.0EsN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378290EsN {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378290EsN)) {
            return false;
        }
        C378290EsN c378290EsN = (C378290EsN) obj;
        return this.LIZ == c378290EsN.LIZ && this.LIZIZ == c378290EsN.LIZIZ && this.LIZJ == c378290EsN.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionSheetStyles(actionFont=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", primaryColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", separatorColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C378290EsN(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
