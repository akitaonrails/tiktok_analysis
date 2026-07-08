package X;

import java.util.List;

/* JADX INFO: renamed from: X.0hly, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216920hly {
    public final C0TFZ LIZ;
    public long LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public EnumC1216900hlw LJ;
    public List<String> LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationOptions(bpea=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeout=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", maxCacheTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", caller=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", accuracyLevel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", allowedSignals=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        long j = this.LIZJ;
        return j > 0 ? "GPS_cache_priority" : j == 0 ? "GPS_real_time" : j == -2 ? "GPS_system_cache" : "GPS_cache";
    }

    public C1216920hly(C0TFZ c0tfz, long j, long j2, String str, int i) {
        EnumC1216900hlw enumC1216900hlw;
        c0tfz = (i & 1) != 0 ? null : c0tfz;
        j = (i & 2) != 0 ? 30000L : j;
        j2 = (i & 4) != 0 ? 600000L : j2;
        str = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            enumC1216900hlw = EnumC1216900hlw.None;
        } else {
            enumC1216900hlw = null;
        }
        this.LIZ = c0tfz;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str;
        this.LJ = enumC1216900hlw;
        this.LJFF = null;
    }
}
