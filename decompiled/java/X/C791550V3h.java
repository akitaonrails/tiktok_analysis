package X;

/* JADX INFO: renamed from: X.0V3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791550V3h {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final long LJFF;
    public final int LJI;
    public final int LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MonitorConfig{enableAtrace=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableBinder=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableLock=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enableIO=");
        sbLIZ.append(false);
        sbLIZ.append(", enableLooperMonitor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enableStackSampling=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", atraceTag=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", runMode=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", alogRef=");
        sbLIZ.append(0L);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C791550V3h(C791570V3j c791570V3j) {
        this.LIZ = c791570V3j.LIZ;
        this.LIZIZ = c791570V3j.LIZIZ;
        this.LIZLLL = c791570V3j.LIZLLL;
        this.LIZJ = c791570V3j.LIZJ;
        this.LJFF = c791570V3j.LJFF;
        this.LJI = c791570V3j.LJI;
        this.LJ = c791570V3j.LJ;
        this.LJII = c791570V3j.LJII;
    }
}
