package X;

/* JADX INFO: renamed from: X.0TyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764310TyX extends AbstractC764660Tz6 {
    public final EnumC764860TzQ LIZ;
    public final EnumC764870TzR LIZIZ;
    public final double LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C764310TyX)) {
            return false;
        }
        C764310TyX c764310TyX = (C764310TyX) obj;
        return this.LIZ == c764310TyX.LIZ && this.LIZIZ == c764310TyX.LIZIZ && Double.compare(this.LIZJ, c764310TyX.LIZJ) == 0;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.X2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateKaraokeSetting(lyricsState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originalState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", toneValue=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764310TyX(EnumC764860TzQ enumC764860TzQ, EnumC764870TzR enumC764870TzR, double d) {
        this.LIZ = enumC764860TzQ;
        this.LIZIZ = enumC764870TzR;
        this.LIZJ = d;
    }
}
