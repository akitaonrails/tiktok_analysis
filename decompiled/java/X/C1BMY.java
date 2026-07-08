package X;

import Y.ARunnableS107S0000000_34;
import Y.ARunnableS52S0110000_34;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.ies.safemode.SmartProtected.state.SmartProtectedStateMachine;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

/* JADX INFO: renamed from: X.1BMY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BMY {
    public static volatile C1BMY LJI;
    public static long LJII;
    public ScheduledExecutorService LIZ;
    public boolean LIZIZ;
    public ExceptionManager.ExceptionRecord LIZJ;
    public int LIZLLL;
    public Context LJ;
    public SmartProtectedStateMachine LJFF;

    public final void LIZLLL() {
        C2200391B9x.LIZJ(C786410Ut5.j4("startCheckAndReport immediatelyStart %b", new Object[]{Boolean.FALSE}));
        ScheduledExecutorService scheduledExecutorServiceLJ = C807400Vlq.LJ();
        this.LIZ = scheduledExecutorServiceLJ;
        ARunnableS52S0110000_34 aRunnableS52S0110000_34 = new ARunnableS52S0110000_34(this, 3);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        scheduledExecutorServiceLJ.scheduleWithFixedDelay(aRunnableS52S0110000_34, 0L, 10L, timeUnit);
        this.LIZ.schedule(new ARunnableS107S0000000_34(3), 30L, timeUnit);
    }

    public static synchronized C1BMY LIZIZ() {
        if (LJI == null) {
            LJI = new C1BMY();
        }
        return LJI;
    }

    public final void LJFF() {
        synchronized (this.LIZ) {
            try {
                if (!this.LIZIZ) {
                    this.LIZIZ = true;
                    this.LIZ.shutdown();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(ExceptionManager.ExceptionRecord exceptionRecord, int i) throws Throwable {
        Context context = C2203571BMd.LJIILLIIL.LIZ;
        String crashType = exceptionRecord.getCrashType();
        Intent intentPutExtra = new Intent(context, (Class<?>) SafeModeActivity.class).addFlags(268435456).addFlags(32768).putExtra("crashType", crashType).putExtra("crashStack", exceptionRecord.getCrashReason()).putExtra("reachType", i);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentPutExtra, "Context_startActivity_1");
        C1701330uNH.LIZ(intentPutExtra, context);
        C2204961BRm.LJJJJJL(context, intentPutExtra, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtmpO5Tb/ePGxNucZAtYhp9ED+w2aBA==", null));
        C08OH c08ohLIZ = C08OH.LIZ(this.LJ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        c08ohLIZ.getClass();
        try {
            FileUtils.writeStringToFile(c08ohLIZ.LIZ, String.valueOf(jCurrentTimeMillis), Charset.forName("UTF-8"));
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final synchronized void LIZ(long j, String str, String str2) {
        C2203571BMd c2203571BMd = C2203571BMd.LJIILLIIL;
        c2203571BMd.LIZIZ();
        LJFF();
        if (SystemClock.elapsedRealtime() - LJII > 2000) {
            c2203571BMd.LIZIZ.getClass();
        }
        c2203571BMd.getClass();
        if (this.LJFF != null) {
            LIZIZ();
            SafeModeReporter.LJ(SafeModeReporter.CrashInfo.LIZIZ(str, str2), 0);
            this.LJFF.LIZJ(j, str, str2);
        } else {
            LIZIZ();
            SafeModeReporter.LJ(SafeModeReporter.CrashInfo.LIZIZ(str, str2), 4);
            C2200391B9x.LIZIZ("BootProtector", "machine is null,so skip exception in addException");
        }
    }

    public final synchronized void LIZJ(Context context, boolean z, C823690WSx c823690WSx) {
        if (this.LIZ == null) {
            if (context != null) {
                LJII = SystemClock.elapsedRealtime();
                C2203571BMd c2203571BMd = C2203571BMd.LJIILLIIL;
                C2200391B9x.LIZJ(c2203571BMd.toString());
                this.LJ = context;
                c2203571BMd.LIZ = context;
                c2203571BMd.LIZIZ = c823690WSx;
                if (z) {
                    LIZLLL();
                }
            } else {
                throw new RuntimeException("ProtectTask context is null");
            }
        }
    }
}
