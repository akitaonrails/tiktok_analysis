package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jGX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274310jGX {
    public final List<C1274320jGY> LIZ = new ArrayList();

    public final void LIZIZ() {
        synchronized (this.LIZ) {
            try {
                LIZJ(System.currentTimeMillis());
                ((ArrayList) this.LIZ).size();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ(double d) {
        synchronized (this.LIZ) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                LIZJ(jCurrentTimeMillis);
                ((ArrayList) this.LIZ).add(new C1274320jGY(d, jCurrentTimeMillis));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(long j) {
        long j2 = j - ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        while (!((ArrayList) this.LIZ).isEmpty() && ((C1274320jGY) ListProtector.get(this.LIZ, 0)).LIZIZ < j2) {
            ListProtector.remove(this.LIZ, 0);
        }
    }
}
