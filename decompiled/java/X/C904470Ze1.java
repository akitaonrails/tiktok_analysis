package X;

/* JADX INFO: renamed from: X.0Ze1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904470Ze1 {
    public final EnumC904450Zdz LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C904470Ze1)) {
            return false;
        }
        C904470Ze1 c904470Ze1 = (C904470Ze1) obj;
        return this.LIZ == c904470Ze1.LIZ && this.LIZIZ == c904470Ze1.LIZIZ && this.LIZJ == c904470Ze1.LIZJ && this.LIZLLL == c904470Ze1.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaLoadedAllData(mediaType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isGroup=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", numOfMediaLoaded=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasUserLoadedAll=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C904470Ze1(EnumC904450Zdz enumC904450Zdz, boolean z, int i, boolean z2) {
        this.LIZ = enumC904450Zdz;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = z2;
    }
}
