package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08RX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RX {
    public static final C08RX LIZ = new C08RX();
    public static final ConcurrentLinkedQueue<C1884107Zn> LIZIZ = new ConcurrentLinkedQueue<>();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static void LIZ() {
        if (LIZJ.compareAndSet(false, true)) {
            while (true) {
                try {
                    C1884107Zn c1884107ZnPoll = LIZIZ.poll();
                    if (c1884107ZnPoll == null) {
                        break;
                    }
                    try {
                        C20684815ws.LJIJ(c1884107ZnPoll.LIZ, c1884107ZnPoll.LIZIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    LIZJ.set(false);
                    if ((!LIZIZ.isEmpty()) && LIZIZ()) {
                        LIZ();
                    }
                    throw th2;
                }
            }
            LIZJ.set(false);
            if ((!r1.isEmpty()) && LIZIZ()) {
                LIZ();
            }
        }
    }

    public static boolean LIZIZ() {
        Object c098200Yq;
        if (C202094145s.LIZLLL <= 0 && C202094145s.LJFF <= 0 && C202094145s.LJ <= 0) {
            long j = C202094145s.LJIIL;
            if (j <= 0 || SystemClock.uptimeMillis() - j < 3000) {
                return false;
            }
        }
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService == null) {
            return false;
        }
        try {
            c098200Yq = Boolean.valueOf(iAccountService.LIZ());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static void LIZJ(JSONObject jSONObject) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "kids_kshield_delayed_mob_report", true, true)) {
            LIZIZ.clear();
        } else if (!LIZIZ()) {
            LIZIZ.offer(new C1884107Zn(jSONObject));
        } else {
            LIZIZ.offer(new C1884107Zn(jSONObject));
            LIZ();
        }
    }
}
