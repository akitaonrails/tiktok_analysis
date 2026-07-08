package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795000VGo implements InterfaceC795090VGx {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final Context LL;
    public final InterfaceC787600Uv0 LLILLJJLI;
    public final C795040VGs LLILLL;
    public final C0VH8 LLILZ;
    public final C0VI1 LLILZIL;
    public final C795030VGr LLILZLL;
    public final Handler LLIZ;
    public final List<Intent> LLIZLLLIL;
    public Intent LLJ;
    public InterfaceC794980VGm LLJI;

    static {
        C0VI8.LIZIZ("SystemAlarmDispatcher");
    }

    public final void LIZIZ() {
        if (this.LLIZ.getLooper().getThread() != C786410Ut5.u3()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean LIZJ() {
        LIZIZ();
        synchronized (this.LLIZLLLIL) {
            try {
                Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
                while (it2.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it2.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ() {
        C0VI8.LIZ().getClass();
        this.LLILZ.LJFF(this);
        C795040VGs c795040VGs = this.LLILLL;
        if (!c795040VGs.LIZ.isShutdown()) {
            c795040VGs.LIZ.shutdownNow();
        }
        this.LLJI = null;
    }

    public final void LJI() {
        LIZIZ();
        PowerManager.WakeLock wakeLockLIZ = C789740UyS.LIZ(this.LL, "ProcessCommand");
        try {
            wakeLockLIZ.acquire();
            ((C0VG9) this.LLILZIL.LIZLLL).LIZ(new ARunnableS113S0100000_13(this, 13));
            wakeLockLIZ.release();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            wakeLockLIZ.release();
            throw th;
        }
    }

    public C795000VGo(Context context) {
        Context contextN3 = C786410Ut5.N3(context);
        this.LL = contextN3;
        this.LLILZLL = new C795030VGr(contextN3);
        this.LLILLL = new C795040VGs();
        C0VI1 c0vi1LJII = C0VI1.LJII(context);
        this.LLILZIL = c0vi1LJII;
        C0VH8 c0vh8 = c0vi1LJII.LJFF;
        this.LLILZ = c0vh8;
        this.LLILLJJLI = c0vi1LJII.LIZLLL;
        c0vh8.LIZ(this);
        this.LLIZLLLIL = new ArrayList();
        this.LLJ = null;
        this.LLIZ = new Handler(Looper.getMainLooper());
    }

    public final void LJFF(Runnable runnable) {
        C786410Ut5.LJJZZIII(this.LLIZ, runnable);
    }

    public final void LIZ(int i, Intent intent) {
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)});
        c0vi8LIZ.getClass();
        LIZIZ();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C0VI8.LIZ().getClass();
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && LIZJ()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.LLIZLLLIL) {
            try {
                boolean z = !((ArrayList) this.LLIZLLLIL).isEmpty();
                ((ArrayList) this.LLIZLLLIL).add(intent);
                if (!z) {
                    LJI();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC795090VGx
    public final void LIZLLL(String str, boolean z) {
        Intent intent = new Intent(this.LL, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        LJFF(new RunnableC794990VGn(0, intent, this));
    }
}
