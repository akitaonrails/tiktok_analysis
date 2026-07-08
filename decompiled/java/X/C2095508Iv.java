package X;

import java.util.Map;

/* JADX INFO: renamed from: X.08Iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2095508Iv {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public C2095508Iv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2095508Iv)) {
            return false;
        }
        C2095508Iv c2095508Iv = (C2095508Iv) obj;
        return this.LIZ == c2095508Iv.LIZ && this.LIZIZ == c2095508Iv.LIZIZ && this.LIZJ == c2095508Iv.LIZJ && this.LIZLLL == c2095508Iv.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IoCounters(readBytes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", writeBytes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", syscr=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", syscw=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return this.LIZ >= 0 || this.LIZIZ >= 0 || this.LIZJ >= 0 || this.LIZLLL >= 0;
    }

    public C2095508Iv(int i) {
        this.LIZ = -1L;
        this.LIZIZ = -1L;
        this.LIZJ = -1L;
        this.LIZLLL = -1L;
    }

    public final void LIZIZ(String str, String str2, String str3, String str4, Map map) {
        long j = this.LIZ;
        if (j >= 0) {
            map.put(str, Long.valueOf(j / 1024));
        }
        long j2 = this.LIZIZ;
        if (j2 >= 0) {
            map.put(str2, Long.valueOf(j2 / 1024));
        }
        long j3 = this.LIZJ;
        if (j3 >= 0) {
            map.put(str3, Long.valueOf(j3));
        }
        long j4 = this.LIZLLL;
        if (j4 >= 0) {
            map.put(str4, Long.valueOf(j4));
        }
    }
}
