package X;

/* JADX INFO: renamed from: X.0dI6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044640dI6 {
    public boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public C1044640dI6() {
        this(0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1044640dI6)) {
            return false;
        }
        C1044640dI6 c1044640dI6 = (C1044640dI6) obj;
        return this.LIZ == c1044640dI6.LIZ && this.LIZIZ == c1044640dI6.LIZIZ && this.LIZJ == c1044640dI6.LIZJ && this.LIZLLL == c1044640dI6.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DanmakuInteractionState(hasDigg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasReport=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", displayCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", danmuType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1044640dI6 LIZ(C1044640dI6 c1044640dI6) {
        return new C1044640dI6(c1044640dI6.LIZ, c1044640dI6.LIZIZ, c1044640dI6.LIZJ, c1044640dI6.LIZLLL);
    }

    public /* synthetic */ C1044640dI6(int i, int i2) {
        this(false, false, 0, (i2 & 8) != 0 ? 0 : i);
    }

    public C1044640dI6(boolean z, boolean z2, int i, int i2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
