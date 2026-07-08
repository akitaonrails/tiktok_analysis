package X;

/* JADX INFO: renamed from: X.0VAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793390VAj {
    public long LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public String LJFF;
    public final long LJI;
    public final String LJII;
    public long LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatteryLogEntity{id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", front=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", time=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", type='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", status=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", scene='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", accumulation=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", source='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", versionId=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", processName='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mainProcess=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", startUuid='");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append('\'');
        sbLIZ.append(", deleteFlag=");
        sbLIZ.append(false);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C793390VAj() {
    }

    public C793390VAj(long j, long j2, String str, boolean z) {
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJI = j2;
    }

    public C793390VAj(String str, long j, long j2, String str2, String str3, boolean z, boolean z2) {
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = z2;
        this.LJFF = str2;
        this.LJI = j2;
        this.LJII = str3;
    }
}
