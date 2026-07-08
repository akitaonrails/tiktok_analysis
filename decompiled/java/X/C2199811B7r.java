package X;

import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199811B7r {
    public final long LIZ;
    public final AtomicLong LIZIZ;
    public volatile long LIZJ;
    public long LIZLLL;
    public int LJ;
    public volatile RunnableC2199701B7g LJFF;
    public int LJI;
    public JSONObject LJII;

    public final long LIZ() {
        long j = this.LIZIZ.get();
        long j2 = this.LIZLLL;
        if (j2 > 0) {
            long j3 = j2 + 1;
            if (j > j3) {
                return j3;
            }
        }
        return j;
    }

    public final long LIZIZ() {
        RunnableC2199701B7g runnableC2199701B7g = this.LJFF;
        if (runnableC2199701B7g != null) {
            long j = runnableC2199701B7g.LLJILJILJ;
            if (j > this.LIZJ) {
                return j;
            }
        }
        return this.LIZJ;
    }

    public final long LIZJ() {
        return this.LIZIZ.get() - this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Segment{startOffset=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",\t currentOffset=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",\t currentOffsetRead=");
        sbLIZ.append(LIZIZ());
        sbLIZ.append(",\t endOffset=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2199811B7r(JSONObject jSONObject) {
        AtomicLong atomicLong = new AtomicLong();
        this.LIZIZ = atomicLong;
        this.LJI = 0;
        this.LIZ = jSONObject.optLong("st");
        LJ(jSONObject.optLong("en"));
        LIZLLL(jSONObject.optLong("cu"));
        long jLIZ = LIZ();
        if (jLIZ >= atomicLong.get()) {
            this.LIZJ = jLIZ;
        }
    }

    public final void LIZLLL(long j) {
        long j2 = this.LIZ;
        if (j < j2) {
            j = j2;
        }
        long j3 = this.LIZLLL;
        if (j3 > 0) {
            long j4 = j3 + 1;
            if (j > j4) {
                j = j4;
            }
        }
        this.LIZIZ.set(j);
    }

    public final void LJ(long j) {
        if (j >= this.LIZ) {
            this.LIZLLL = j;
            return;
        }
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EndOffset = ");
            sbLIZ.append(j);
            sbLIZ.append(", segment = ");
            sbLIZ.append(this);
            C1490830otl.LIZIZ("Segment", "setEndOffset", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (j != -1) {
            return;
        }
        this.LIZLLL = j;
    }

    public C2199811B7r(C2199811B7r c2199811B7r) {
        AtomicLong atomicLong = new AtomicLong();
        this.LIZIZ = atomicLong;
        this.LJI = 0;
        this.LIZ = c2199811B7r.LIZ;
        this.LIZLLL = c2199811B7r.LIZLLL;
        atomicLong.set(c2199811B7r.LIZIZ.get());
        this.LIZJ = atomicLong.get();
        this.LJ = c2199811B7r.LJ;
    }

    public C2199811B7r(long j, long j2) {
        AtomicLong atomicLong = new AtomicLong();
        this.LIZIZ = atomicLong;
        this.LJI = 0;
        this.LIZ = j;
        atomicLong.set(j);
        this.LIZJ = j;
        if (j2 >= j) {
            this.LIZLLL = j2;
        } else {
            this.LIZLLL = -1L;
        }
    }
}
