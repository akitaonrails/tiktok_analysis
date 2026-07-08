package X;

import android.os.Debug;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* JADX INFO: renamed from: X.0V6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792390V6n {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public final long LIZ() {
        long j = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count"));
        long j2 = j - this.LIZJ;
        this.LIZJ = j;
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("blockingGcCount:");
            sbLIZ.append(this.LIZJ);
            C792910V8n.LIZ("APM-Memory", C2188811AlT.LIZIZ(sbLIZ));
        }
        return j2;
    }

    public final long LIZIZ() {
        long j = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time"));
        long j2 = j - this.LIZLLL;
        this.LIZLLL = j;
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("blockingGcTime:");
            sbLIZ.append(this.LIZLLL);
            C792910V8n.LIZ("APM-Memory", C2188811AlT.LIZIZ(sbLIZ));
        }
        return j2;
    }

    public final long LIZJ() {
        long j = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.gc-count"));
        long j2 = j - this.LIZ;
        this.LIZ = j;
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gcCount:");
            sbLIZ.append(j);
            C792910V8n.LIZ("APM-Memory", C2188811AlT.LIZIZ(sbLIZ));
        }
        return j2;
    }

    public final long LIZLLL() {
        long j = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.gc-time"));
        long j2 = j - this.LIZIZ;
        this.LIZIZ = j;
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gcTime:");
            sbLIZ.append(this.LIZIZ);
            C792910V8n.LIZ("APM-Memory", C2188811AlT.LIZIZ(sbLIZ));
        }
        return j2;
    }
}
