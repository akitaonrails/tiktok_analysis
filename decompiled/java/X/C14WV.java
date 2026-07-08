package X;

import android.content.Context;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.14WV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14WV {
    public final Context LIZ;
    public long LIZIZ;
    public long LIZJ;
    public float LIZLLL;
    public float LJ;
    public long LJFF;
    public long LJI;
    public final int LJII = Process.myPid();
    public final long LJIIIIZZ;
    public final int LJIIIZ;

    public final Map<String, Object> LIZ() {
        return C2097608Jq.LJIIIIZZ(new Pair("peak_memory_usage", Long.valueOf(this.LJI)), new Pair("current_memory_usage", Long.valueOf(this.LJFF)), new Pair("peak_cpu_usage", Float.valueOf(this.LJ)), new Pair("current_cpu_usage", Float.valueOf(this.LIZLLL)));
    }

    public C14WV(C19EG c19eg) {
        long jSysconf;
        this.LIZ = c19eg;
        try {
            jSysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSysconf = 100;
        }
        this.LJIIIIZZ = jSysconf;
        this.LJIIIZ = Runtime.getRuntime().availableProcessors();
    }
}
