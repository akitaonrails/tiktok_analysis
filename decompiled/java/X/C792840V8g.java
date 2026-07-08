package X;

import java.util.Objects;

/* JADX INFO: renamed from: X.0V8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792840V8g {
    public int LIZ;
    public String LIZIZ;
    public long LIZJ;
    public double LIZLLL;
    public double LJ;
    public String LJFF;
    public long LJI;
    public int LJII;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LIZ), this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThreadExceptionItem{threadId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", threadName='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", threadCpuTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", processCpuTime=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", cpuUsage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", weight=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", nice=");
        sbLIZ.append(this.LJII);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C792840V8g)) {
            return false;
        }
        C792840V8g c792840V8g = (C792840V8g) obj;
        String str = this.LIZIZ;
        if (str != null && this.LIZ == c792840V8g.LIZ && str.equals(c792840V8g.LIZIZ)) {
            return true;
        }
        return false;
    }
}
