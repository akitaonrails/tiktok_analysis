package X;

/* JADX INFO: renamed from: X.1BuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219731BuF {
    public boolean LIZ;
    public EnumC2219711BuD LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJ;

    public C2219731BuF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2219731BuF)) {
            return false;
        }
        C2219731BuF c2219731BuF = (C2219731BuF) obj;
        return this.LIZ == c2219731BuF.LIZ && this.LIZIZ == c2219731BuF.LIZIZ && this.LIZJ == c2219731BuF.LIZJ && this.LIZLLL == c2219731BuF.LIZLLL && this.LJ == c2219731BuF.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ;
    }

    public final String toString() {
        return "NetworkStatusData(isConnected=" + this.LIZ + ", networkType=" + this.LIZIZ + ", weakNet=" + this.LIZJ + ", hasSystemProxy=" + this.LIZLLL + ", signalStrength=" + this.LJ + ")";
    }

    public C2219731BuF(int i) {
        EnumC2219711BuD enumC2219711BuD = EnumC2219711BuD.NONE;
        this.LIZ = false;
        this.LIZIZ = enumC2219711BuD;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = 0;
    }
}
