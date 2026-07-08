package X;

/* JADX INFO: renamed from: X.0wMV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777730wMV {
    public final boolean LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public C1777730wMV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777730wMV)) {
            return false;
        }
        C1777730wMV c1777730wMV = (C1777730wMV) obj;
        return this.LIZ == c1777730wMV.LIZ && this.LIZIZ == c1777730wMV.LIZIZ && this.LIZJ == c1777730wMV.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoGenSugPara(filterVideoGenSug=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxClientSeq=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxServerSeq=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1777730wMV(int i) {
        this(false, Long.MAX_VALUE, Long.MAX_VALUE);
    }

    public C1777730wMV(boolean z, long j, long j2) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
