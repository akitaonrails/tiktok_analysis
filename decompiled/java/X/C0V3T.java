package X;

import android.util.Pair;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.monitor.collector.c;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V3T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V3T extends c {
    @Override // com.bytedance.monitor.collector.c
    public final Pair<String, ?> LIZ() {
        try {
            if (C791560V3i.LJIIJJI) {
                return new Pair<>(this.LIZ, !C791560V3i.LJIIJJI ? null : MonitorJni.doDumpAtrace());
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // com.bytedance.monitor.collector.c
    public final void LJ(int i) {
    }

    public C0V3T(int i) {
        super(i, "atrace_event");
    }

    @Override // com.bytedance.monitor.collector.c
    public final Pair<String, ?> LIZIZ(long j, long j2) {
        String strDoDumpAtraceRange;
        try {
            if (!C791560V3i.LJIIJJI) {
                return null;
            }
            String str = this.LIZ;
            if (!C791560V3i.LJIIJJI) {
                strDoDumpAtraceRange = null;
            } else {
                strDoDumpAtraceRange = MonitorJni.doDumpAtraceRange(j, j2);
            }
            return new Pair<>(str, strDoDumpAtraceRange);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
