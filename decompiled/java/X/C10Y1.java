package X;

import android.os.SystemClock;
import com.bytedance.deeplink.glue.LinkPhase;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10Y1, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10Y1 {
    public static final C01GW<C10Y1> LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(147));
    public final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, String> LIZJ = new ConcurrentHashMap<>();

    public final void LIZ(LinkPhase linkPhase) {
        if (!C295460Bi4.LIZ()) {
            return;
        }
        String mobKey = linkPhase.getMobKey();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.LIZ.get(mobKey) != null) {
            this.LIZ.put(mobKey, Long.valueOf(jElapsedRealtime));
        } else {
            this.LIZ.put(mobKey, Long.valueOf(jElapsedRealtime));
        }
    }

    public final void LIZJ(LinkPhase linkPhase) {
        if (!C295460Bi4.LIZ()) {
            return;
        }
        String mobKey = linkPhase.getMobKey();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.LIZIZ.get(mobKey) != null) {
            this.LIZIZ.put(mobKey, Long.valueOf(jElapsedRealtime));
        } else {
            this.LIZIZ.put(mobKey, Long.valueOf(jElapsedRealtime));
        }
    }

    public final void LIZLLL(String str) {
        if (!C295460Bi4.LIZ()) {
            return;
        }
        this.LIZJ.put("enter_to", str);
    }

    public final void LIZIZ(LinkPhase linkPhase, long j) {
        if (!C295460Bi4.LIZ()) {
            return;
        }
        String mobKey = linkPhase.getMobKey();
        if (this.LIZ.get(mobKey) != null) {
            this.LIZ.put(mobKey, Long.valueOf(j));
        } else {
            this.LIZ.put(mobKey, Long.valueOf(j));
        }
    }
}
