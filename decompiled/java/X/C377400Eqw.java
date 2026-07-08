package X;

/* JADX INFO: renamed from: X.0Eqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377400Eqw {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public C377400Eqw() {
        this(false, 0, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C377400Eqw)) {
            return false;
        }
        C377400Eqw c377400Eqw = (C377400Eqw) obj;
        return this.LIZ == c377400Eqw.LIZ && this.LIZIZ == c377400Eqw.LIZIZ && this.LIZJ == c377400Eqw.LIZJ && this.LIZLLL == c377400Eqw.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskStates(show=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", marginBottom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", numOfTasks=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasFailedTask=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C377400Eqw(boolean z, int i, int i2, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z2;
    }
}
