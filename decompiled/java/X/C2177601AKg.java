package X;

/* JADX INFO: renamed from: X.1AKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177601AKg {
    public final EnumC2177591AKf LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final EnumC2177591AKf LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2177601AKg)) {
            return false;
        }
        C2177601AKg c2177601AKg = (C2177601AKg) obj;
        return this.LIZ == c2177601AKg.LIZ && this.LIZIZ == c2177601AKg.LIZIZ && this.LIZJ == c2177601AKg.LIZJ && this.LIZLLL == c2177601AKg.LIZLLL && this.LJ == c2177601AKg.LJ && this.LJFF == c2177601AKg.LJFF && this.LJI == c2177601AKg.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemorySnapshot(javaHeap=");
        sbLIZ.append(this.LIZ.name());
        sbLIZ.append('(');
        long j = this.LIZJ;
        sbLIZ.append((int) ((j > 0 ? this.LIZIZ / j : 0.0f) * 100));
        sbLIZ.append("% of ");
        long j2 = 1048576;
        sbLIZ.append(this.LIZJ / j2);
        sbLIZ.append("MB), deviceRam=");
        sbLIZ.append(this.LIZLLL.name());
        sbLIZ.append('(');
        sbLIZ.append(this.LJ / j2);
        sbLIZ.append("MB of ");
        sbLIZ.append(this.LJFF / j2);
        sbLIZ.append("MB))");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2177601AKg(EnumC2177591AKf enumC2177591AKf, long j, long j2, EnumC2177591AKf enumC2177591AKf2, long j3, long j4, long j5) {
        this.LIZ = enumC2177591AKf;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = enumC2177591AKf2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJI = j5;
    }
}
