package X;

/* JADX INFO: renamed from: X.08Kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2100808Kw {
    public final long LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public C2100808Kw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2100808Kw)) {
            return false;
        }
        C2100808Kw c2100808Kw = (C2100808Kw) obj;
        return this.LIZ == c2100808Kw.LIZ && this.LIZIZ == c2100808Kw.LIZIZ && this.LIZJ == c2100808Kw.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MonitorConfig(sampleThresholdMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topN=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logToLogcat=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2100808Kw(int i) {
        boolean z = C08L4.LIZ.log;
        this.LIZ = 32L;
        this.LIZIZ = 3;
        this.LIZJ = z;
    }
}
