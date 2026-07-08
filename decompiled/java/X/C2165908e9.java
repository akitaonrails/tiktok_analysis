package X;

import Y.ARunnableS113S0100000_13;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08e9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2165908e9 {
    public final boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public long LJI;
    public boolean LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public double LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public double LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public double LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;

    public final void LJIIIIZZ() {
        String strX3;
        this.LJIIJJI = true;
        StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        if (this.LJIIJJI) {
            this.LJIILIIL = C2204961BRm.LLFFF(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null));
            this.LJIIL = C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null)) * C2204961BRm.LLFZ(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null));
        } else {
            this.LJIILIIL = ((long) C2204961BRm.LLI(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null))) * ((long) C2204961BRm.LLF(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null)));
            this.LJIIL = ((long) C2204961BRm.LLI(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null))) * ((long) C2204961BRm.LLFII(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null)));
        }
        this.LJIILJJIL = LJFF(this.LJIILIIL, this.LJIIL);
        try {
            StatFs statFs2 = new StatFs(LIZ(C792400V6o.LIZ).getAbsolutePath());
            if (this.LJIIJJI) {
                this.LJIILLIIL = C2204961BRm.LLFFF(statFs2, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null));
                this.LJIILL = C2204961BRm.LLIFFJFJJ(statFs2, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null)) * C2204961BRm.LLFZ(statFs2, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null));
            } else {
                this.LJIILLIIL = ((long) C2204961BRm.LLI(statFs2, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null))) * ((long) C2204961BRm.LLF(statFs2, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null)));
                this.LJIILL = ((long) C2204961BRm.LLI(statFs2, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null))) * ((long) C2204961BRm.LLFII(statFs2, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null)));
            }
            this.LJIIZILJ = LJFF(this.LJIILLIIL, this.LJIILL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            strX3 = C786410Ut5.X3();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strX3 = null;
        }
        boolean zEquals = TextUtils.equals(strX3, "mounted");
        this.LJIJJLI = zEquals;
        try {
            if (zEquals) {
                StatFs statFs3 = new StatFs(C786410Ut5.W3().getAbsolutePath());
                if (this.LJIIJJI) {
                    this.LJIJI = C2204961BRm.LLFFF(statFs3, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null));
                    this.LJIJ = C2204961BRm.LLIFFJFJJ(statFs3, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null)) * C2204961BRm.LLFZ(statFs3, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null));
                } else {
                    this.LJIJI = ((long) C2204961BRm.LLI(statFs3, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null))) * ((long) C2204961BRm.LLF(statFs3, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null)));
                    this.LJIJ = ((long) C2204961BRm.LLI(statFs3, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null))) * ((long) C2204961BRm.LLFII(statFs3, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null)));
                }
                this.LJIJJ = LJFF(this.LJIJI, this.LJIJ);
            } else {
                this.LJIJ = 0L;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        this.LJIL = Environment.isExternalStorageRemovable();
    }

    public final void LJI() throws Throwable {
        String str;
        int i;
        String str2 = C792400V6o.LIZ.getApplicationInfo().nativeLibraryDir;
        if (!TextUtils.isEmpty(str2) && str2.endsWith("arm64")) {
            this.LIZIZ = true;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        if (Build.SUPPORTED_ABIS.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr = Build.SUPPORTED_ABIS;
                if (i3 >= strArr.length) {
                    break;
                }
                sb.append(strArr[i3]);
                if (i3 != strArr.length - 1) {
                    sb.append(", ");
                }
                i3++;
            }
        } else {
            sb = new StringBuilder(Build.CPU_ABI);
        }
        String string = sb.toString();
        if (string != null && string.contains("64")) {
            this.LIZJ = true;
        }
        C2166208eC c2166208eC = C2166108eB.LIZ;
        BufferedReader bufferedReader = null;
        String strTrim = null;
        bufferedReader = null;
        String string2 = c2166208eC.LIZ.getString("sp_cpu_model", null);
        int i4 = c2166208eC.LIZ.getInt("sp_cpu_core_num", -1);
        try {
            if (!TextUtils.isEmpty(string2)) {
                this.LIZLLL = string2;
                this.LJ = i4;
                return;
            }
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new C0VSF("/proc/cpuinfo"));
                    i = 0;
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line != null) {
                                String[] strArrSplit = line.split(":");
                                if (strArrSplit.length == 2) {
                                    if (strArrSplit[0].startsWith("Hardware")) {
                                        strTrim = strArrSplit[1].trim();
                                    } else if (strArrSplit[0].startsWith("processor")) {
                                        i++;
                                    }
                                }
                            } else {
                                try {
                                    break;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i2 = i;
                            str = strTrim;
                            bufferedReader = bufferedReader2;
                            TryCatchGuardChecker.doCheck(e);
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                }
                            }
                            strTrim = str;
                            i = i2;
                        }
                    }
                    bufferedReader2.close();
                } catch (Exception e4) {
                    e = e4;
                    str = null;
                }
                this.LIZLLL = strTrim;
                this.LJ = i;
                if (TextUtils.isEmpty(strTrim) && C2162508db.LIZJ()) {
                    this.LIZLLL = Build.HARDWARE;
                }
                if (TextUtils.isEmpty(this.LIZLLL)) {
                    this.LIZLLL = "unknown";
                }
                c2166208eC.LIZ.edit().putString("sp_cpu_model", this.LIZLLL).apply();
                c2166208eC.LIZ.edit().putInt("sp_cpu_core_num", this.LJ).apply();
            } catch (Throwable th) {
                th = th;
                BufferedReader bufferedReader3 = bufferedReader;
                TryCatchGuardChecker.doCheck(th);
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                        throw th;
                    } catch (Exception e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void LJII() {
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(C792400V6o.LIZ, "activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv+7san+EGOTQMwPWKmc/DrDqwEDA==", null));
        this.LJFF = (int) (memoryInfo.totalMem / 536870912);
        if (Build.VERSION.SDK_INT >= 24) {
            this.LJIIJ = "jemalloc";
            return;
        }
        C2166208eC c2166208eC = C2166108eB.LIZ;
        String string = c2166208eC.LIZ.getString("sp_malloc_impl", null);
        if (string == null) {
            string = "unknown";
            c2166208eC.LIZ.edit().putString("sp_malloc_impl", "unknown").apply();
        }
        this.LJIIJ = string;
    }

    public C2165908e9() {
        if (C2140508a3.LIZ()) {
            C787900UvU.LIZ.LIZJ(new ARunnableS113S0100000_13(new Throwable("Don't use DeviceInfoUtil on main thread."), 278));
        }
        boolean z = C792400V6o.LJIIZILJ;
        this.LIZ = z;
        if (z) {
            try {
                LJI();
                LJII();
                LJIIIIZZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public final void LIZIZ(JSONObject jSONObject) {
        if (!this.LIZ) {
            return;
        }
        try {
            C2165908e9 c2165908e9 = C2166008eA.LIZ;
            if (c2165908e9.LIZ) {
                jSONObject.put("apm_is_app_64", c2165908e9.LIZIZ);
                jSONObject.put("apm_is_device_64", c2165908e9.LIZJ);
                jSONObject.put("apm_cpu_model", c2165908e9.LIZLLL);
                int i = c2165908e9.LJ;
                if (i > 0) {
                    jSONObject.put("apm_cpu_core_num", i);
                }
            }
            if (c2165908e9.LIZ) {
                jSONObject.put("apm_physical_mem", c2165908e9.LJFF);
                jSONObject.put("apm_malloc_impl", c2165908e9.LJIIJ);
            }
            c2165908e9.LJ(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(JSONObject jSONObject) {
        if (!this.LIZ) {
            return;
        }
        try {
            C2166008eA.LIZ.LIZLLL(jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZLLL(JSONObject jSONObject) throws JSONException {
        boolean z;
        if (this.LIZ) {
            this.LJI = Debug.getNativeHeapAllocatedSize() / 1048576;
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            long jFreeMemory = runtime.freeMemory();
            long j = runtime.totalMemory();
            this.LJIIIIZZ = jMaxMemory / 1048576;
            long j2 = j - jFreeMemory;
            this.LJIIIZ = j2 / 1048576;
            if (j2 > jMaxMemory * 0.95f) {
                z = true;
            } else {
                z = false;
            }
            this.LJII = z;
            jSONObject.put("apm_native_heap_size", this.LJI);
            jSONObject.put("apm_java_heap_leak", this.LJII);
            jSONObject.put("apm_java_heap_used", this.LJIIIZ);
            jSONObject.put("apm_java_heap_max", this.LJIIIIZZ);
        }
    }

    public final void LJ(JSONObject jSONObject) throws JSONException {
        if (this.LIZ) {
            if (this.LJIIL != 0) {
                jSONObject.put("apm_sys_avail_size", this.LJIILIIL / 1048576);
                jSONObject.put("apm_sys_avail_ratio", this.LJIILJJIL);
            }
            if (this.LJIILL != 0) {
                jSONObject.put("apm_data_avail_size", this.LJIILLIIL / 1073741824);
                jSONObject.put("apm_data_avail_ratio", this.LJIIZILJ);
            }
            if (this.LJIJ != 0) {
                jSONObject.put("apm_sd_avail_size", this.LJIJI / 1073741824);
                jSONObject.put("apm_sd_avail_ratio", this.LJIJJ);
            }
            if (this.LJIJJLI) {
                jSONObject.put("apm_external_removable", this.LJIL);
            }
        }
    }

    public static double LJFF(long j, long j2) {
        if (j2 == 0) {
            return 0.0d;
        }
        return Math.round((j / j2) * 100.0d) / 100.0d;
    }
}
