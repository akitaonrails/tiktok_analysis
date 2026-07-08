package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AFwS196S0000000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664380Q4e {
    public long LIZIZ;
    public long LIZLLL;
    public C664400Q4g LJFF;
    public boolean LJI;
    public String LIZ = "";
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public final List<C664440Q4k> LJ = new ArrayList();
    public String LJII = "";
    public String LJIIIIZZ = "";
    public final Map<String, Object> LJIIIZ = new ConcurrentHashMap();
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(458));

    public final C664440Q4k LJ() {
        synchronized (this) {
            try {
                if (((ArrayList) this.LJ).isEmpty()) {
                    return null;
                }
                return (C664440Q4k) ((ArrayList) this.LJ).get(((ArrayList) r1).size() - 1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ(C664440Q4k c664440Q4k) {
        synchronized (this) {
            try {
                ((ArrayList) this.LJ).add(c664440Q4k);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(long j, String str) {
        ((ConcurrentHashMap) this.LJIIIZ).put(str, Long.valueOf(j));
    }

    public final void LIZJ(String str, String str2) {
        ((ConcurrentHashMap) this.LJIIIZ).put(str, str2);
    }

    public static final void LIZLLL(String str, long j, JSONObject jSONObject) {
        if (j >= 0) {
            jSONObject.put(str, j);
        }
    }
}
