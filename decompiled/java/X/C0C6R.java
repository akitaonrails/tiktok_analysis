package X;

import Y.ARunnableS73S0200000_4;
import android.os.Looper;
import android.os.Process;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS1S1100200_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0C6R, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C6R {
    public static C0C6R LJJII;
    public static Keva LJJIIJ;
    public boolean LJIIJJI;
    public Keva LJIIL;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public String LJIILLIIL;
    public int LJIJ;
    public static int LJJIII = 10;
    public static final Object LJJIIJZLJL = new Object();
    public ScheduledExecutorService LIZ = C807400Vlq.LJ();
    public final String LIZIZ = "current_app_version";
    public final String LIZJ = "sdk_init_time";
    public final String LIZLLL = "error_message";
    public final String LJ = "sdk_repo_init";
    public final String LJFF = "sdk_init_code";
    public final String LJI = "sdk_init_type";
    public final String LJII = "sdk_repo_sample";
    public final String LJIIIIZZ = "sdk_repo_data_load";
    public final String LJIIIZ = "sdk_repo_data_load_level";
    public int LJIIJ = 10;
    public final JSONObject LJIILL = new JSONObject();
    public long LJIIZILJ = Long.MAX_VALUE;
    public final AtomicInteger LJIJI = new AtomicInteger(0);
    public final AtomicInteger LJIJJ = new AtomicInteger(0);
    public final AtomicInteger LJIJJLI = new AtomicInteger(0);
    public final AtomicInteger LJIL = new AtomicInteger(0);
    public final AtomicBoolean LJJ = new AtomicBoolean(false);
    public final AtomicBoolean LJJI = new AtomicBoolean(false);
    public final JSONArray LJJIFFI = new JSONArray();

    public static boolean LJ() {
        BufferedReader bufferedReader;
        boolean z = false;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/proc/");
            sbLIZ.append(Process.myPid());
            sbLIZ.append("/cmdline");
            bufferedReader = new BufferedReader(new C0VSF(C2188811AlT.LIZIZ(sbLIZ)));
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    if (a0.LJJIIZI(line, ":", false)) {
                        z = true;
                    }
                }
                try {
                    bufferedReader.close();
                    return z;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return z;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            return false;
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return false;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            throw th2;
                        } catch (IOException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            throw th2;
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public C0C6R() {
        new JSONArray();
    }

    public final void LJI(Function0<Unit> function0) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.LIZ;
            if (scheduledExecutorService != null && scheduledExecutorService.isShutdown()) {
                this.LIZ = C807400Vlq.LJ();
            }
            ScheduledExecutorService scheduledExecutorService2 = this.LIZ;
            if (scheduledExecutorService2 != null) {
                scheduledExecutorService2.execute(new ARunnableS73S0200000_4(this, function0, 43));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append("recordMessage");
            C0C46.LIZIZ("ABMockEvent", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    public final void LIZLLL(String str, Callable callable) {
        long jNanoTime = System.nanoTime();
        C118300cf c118300cf = new C118300cf();
        C118300cf c118300cf2 = new C118300cf();
        C259800zU c259800zU = new C259800zU();
        try {
            c118300cf.element = ((Number) callable.call()).intValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c259800zU.element = th.toString();
            c118300cf2.element = -1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initRepo: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("initRepo", new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
        }
        LJI(new C0C6S(this, str, c118300cf, c118300cf2, System.nanoTime(), jNanoTime, Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper()), c259800zU));
    }

    public final void LJFF(long j, String str) {
        try {
            if (j < 1000) {
                this.LJIJI.incrementAndGet();
            } else if (j >= Mp4ScreenVideoLoadTimeout.CONTROL) {
                if (j < 10000) {
                    this.LJIJJLI.incrementAndGet();
                } else {
                    this.LJIL.incrementAndGet();
                }
            } else {
                this.LJIJJ.incrementAndGet();
            }
            this.LJJI.set(true);
            synchronized (this.LJIILL) {
                try {
                    int i = this.LJIJ + 1;
                    this.LJIJ = i;
                    if (i <= 20) {
                        this.LJIILL.put(str, j);
                        if (j < this.LJIIZILJ) {
                            this.LJIIZILJ = j;
                            this.LJIILLIIL = str;
                        }
                        this.LJJ.set(true);
                    } else if (j > this.LJIIZILJ) {
                        this.LJIILL.remove(this.LJIILLIIL);
                        this.LJIILL.put(str, j);
                        this.LJIILLIIL = str;
                        this.LJIIZILJ = j;
                        this.LJJ.set(true);
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
        }
    }

    public static final <T> T LJIIIIZZ(String str, String str2, C0C6T<T> c0c6t) {
        try {
            return c0c6t.call();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str2);
            C0C46.LIZIZ(str, new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
            return null;
        }
    }

    public final <T> T LIZJ(String str, T t, Class<Object> cls, InterfaceC308060C5s<T> interfaceC308060C5s) {
        long jNanoTime = System.nanoTime();
        try {
            t = (T) interfaceC308060C5s.LIZ(cls, str, t);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getValue: ");
            sbLIZ.append(str);
            sbLIZ.append(", --message: ");
            sbLIZ.append(th.getMessage());
            C0C46.LIZIZ("ABMockEvent", new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
        }
        LJI(new AwS1S1100200_4(this, System.nanoTime(), jNanoTime, str, 1));
        return t;
    }

    public final <T> T LIZ(String str, T t, boolean z, int i, int i2, Class<Object> cls, InterfaceC20718089s<T> interfaceC20718089s) {
        T tLIZ = t;
        long jNanoTime = System.nanoTime();
        try {
            tLIZ = interfaceC20718089s.LIZ(str, tLIZ, Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), cls);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getValue: ");
            sbLIZ.append(str);
            sbLIZ.append(",  --message: ");
            sbLIZ.append(th.getMessage());
            C0C46.LIZIZ("ABMockEvent", new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
        }
        LJI(new AwS1S1100200_4(this, System.nanoTime(), jNanoTime, str, 0));
        return tLIZ;
    }
}
