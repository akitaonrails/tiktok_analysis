package X;

/* JADX INFO: renamed from: X.053i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12908053i implements C053Z {
    public final int LIZ;
    public final long LIZIZ;
    public final EnumC12927054b LIZJ;
    public final EnumC12930054e LIZLLL = EnumC12930054e.X_TIMES_IN_DURATION;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12908053i)) {
            return false;
        }
        C12908053i c12908053i = (C12908053i) obj;
        return this.LIZ == c12908053i.LIZ && this.LIZIZ == c12908053i.LIZIZ && this.LIZJ == c12908053i.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("XTimesInDurationConfig(times=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timeUnit=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C053Z
    public final String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL.getTag());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZJ.getTag());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12908053i(int i, long j, EnumC12927054b enumC12927054b) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = enumC12927054b;
    }
}
