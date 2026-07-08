package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS82S0200000_13;
import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.PerfConfig;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0V41, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V41 {
    public static volatile C0V41 LJIJI;
    public C0V3G LIZ;
    public volatile boolean LIZIZ;
    public boolean LJ;
    public C0V42 LJIIIIZZ;
    public Thread LJIILL;
    public int LJIILLIIL;
    public long LIZJ = 2500;
    public long LIZLLL = Mp4ScreenVideoLoadTimeout.CONTROL;
    public final StringBuilder LJI = new StringBuilder(1200);
    public final StringBuilder LJII = new StringBuilder(1200);
    public C0V42 LJIIIZ = null;
    public volatile boolean LJIIJ = false;
    public volatile boolean LJIIJJI = false;
    public boolean LJIIL = true;
    public boolean LJIILIIL = true;
    public final LinkedList<C0V1I> LJIILJJIL = new LinkedList<>();
    public final ARunnableS113S0100000_13 LJIIZILJ = new ARunnableS113S0100000_13(this, 52);
    public final ARunnableS113S0100000_13 LJIJ = new ARunnableS113S0100000_13(this, 53);
    public final String LJFF = C0V41.class.getName();

    public static JSONObject LIZLLL() {
        try {
            JSONObject jSONObject = new JSONObject();
            Context context = C792400V6o.LIZ;
            if (context != null) {
                ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++d6h9wTkewE4PWy7deSl6Os=", null));
                jSONObject.put("availMem", memoryInfo.availMem);
                jSONObject.put("lowMemory", memoryInfo.lowMemory);
                jSONObject.put("threshold", memoryInfo.threshold);
                jSONObject.put("totalMem", memoryInfo.totalMem);
            }
            Runtime runtime = Runtime.getRuntime();
            jSONObject.put("max_memory", runtime.maxMemory());
            jSONObject.put("free_memory", runtime.freeMemory());
            jSONObject.put("total_memory", runtime.totalMemory());
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static C0V41 LIZJ() {
        if (LJIJI == null) {
            synchronized (C0V41.class) {
                try {
                    if (LJIJI == null) {
                        LJIJI = new C0V41();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIJI;
    }

    public static JSONObject LJ(C0V42 c0v42) {
        long j = c0v42.LJII - c0v42.LJI;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", c0v42.LJIIIIZZ);
            jSONObject.put("crash_time", c0v42.LJIIIIZZ);
            jSONObject.put("is_main_process", C792400V6o.LJIIIZ());
            jSONObject.put("process_name", C792400V6o.LIZIZ());
            jSONObject.put("block_duration", j);
            jSONObject.put("last_scene", c0v42.LJIJ);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final void LIZ(C0V1I c0v1i) {
        while (this.LJIILJJIL.size() != 0) {
            if (c0v1i.LIZLLL - this.LJIILJJIL.getFirst().LIZLLL >= 0 && c0v1i.LIZLLL - this.LJIILJJIL.getFirst().LIZLLL <= 60000) {
                if (this.LJIILJJIL.size() <= 60) {
                    break;
                } else {
                    this.LJIILJJIL.removeFirst();
                }
            } else {
                this.LJIILJJIL.removeFirst();
            }
        }
        this.LJIILJJIL.addLast(c0v1i);
    }

    public final void LJFF(boolean z) throws Throwable {
        boolean z2;
        StackTraceElement[] stackTraceElementArr;
        try {
            if (this.LIZ.LIZLLL != null) {
                C0V42 c0v42 = this.LJIIIZ;
                if (c0v42 != null) {
                    if (z) {
                        c0v42.LJFF = true;
                    }
                    C787900UvU.LIZ.LIZJ(new ARunnableS82S0200000_13(this, c0v42, 18));
                    this.LJIIIZ = null;
                }
                C0V42 c0v422 = this.LJIIIIZZ;
                if (c0v422 != null && c0v422.LJI >= 0 && c0v422.LJII == -1) {
                    c0v422.LJII = AbstractC791470V2z.LIZIZ;
                    if (this.LJ) {
                        this.LIZ.LIZ(this.LJIIZILJ);
                        this.LIZ.LIZ(this.LJIJ);
                    }
                    C0V42 c0v423 = this.LJIIIIZZ;
                    if (c0v423.LJII - c0v423.LJI > this.LIZJ) {
                        String strLIZJ = C314640CVa.LIZJ();
                        if (TextUtils.isEmpty(strLIZJ)) {
                            c0v423.LJIJ = ActivityLifeObserver.getInstance().getTopActivityClassName();
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZJ);
                            sbLIZ.append(",");
                            sbLIZ.append(ActivityLifeObserver.getInstance().getTopActivityClassName());
                            c0v423.LJIJ = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        this.LJIIIIZZ.LJIIIIZZ = System.currentTimeMillis();
                        if (!this.LJ) {
                            this.LJIIIIZZ.LJIIJJI = true;
                        }
                        C0V42 c0v424 = this.LJIIIIZZ;
                        c0v424.LIZLLL = z;
                        c0v424.LIZJ = this.LJIIJ;
                        C0V42 c0v425 = this.LJIIIIZZ;
                        c0v425.getClass();
                        C0V42 c0v426 = new C0V42(c0v425.LJI, c0v425.LIZIZ);
                        c0v426.LJII = c0v425.LJII;
                        boolean z3 = c0v425.LIZ;
                        c0v426.LIZ = z3;
                        c0v426.LIZJ = c0v425.LIZJ;
                        c0v426.LIZLLL = c0v425.LIZLLL;
                        c0v426.LJ = c0v425.LJ;
                        c0v426.LJFF = c0v425.LJFF;
                        c0v426.LJIIIIZZ = c0v425.LJIIIIZZ;
                        c0v426.LJIIIZ = c0v425.LJIIIZ;
                        c0v426.LJIIJ = c0v425.LJIIJ;
                        c0v426.LJIIL = c0v425.LJIIL;
                        c0v426.LJIILIIL = c0v425.LJIILIIL;
                        c0v426.LJIILJJIL = c0v425.LJIILJJIL;
                        c0v426.LJIILL = c0v425.LJIILL;
                        c0v426.LJIILLIIL = c0v425.LJIILLIIL;
                        c0v426.LJIIZILJ = c0v425.LJIIZILJ;
                        c0v426.LJIJ = c0v425.LJIJ;
                        c0v426.LJIJI = c0v425.LJIJI;
                        c0v426.LJIJJ = c0v425.LJIJJ;
                        c0v426.LJIJJLI = c0v425.LJIJJLI;
                        c0v426.LJIL = c0v425.LJIL;
                        c0v426.LJIIJJI = c0v425.LJIIJJI;
                        if (!z3) {
                            c0v426.LIZ();
                        }
                        if (c0v426.LJII - c0v426.LJI >= this.LIZLLL) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c0v426.LJIIIZ = z2;
                        C0V35 c0v35LJ = C791560V3i.LIZLLL().LJ();
                        if (c0v35LJ != null) {
                            StackTraceElement[] stackTraceElementArr2 = c0v426.LJIILJJIL;
                            if (stackTraceElementArr2 == null) {
                                stackTraceElementArr2 = new StackTraceElement[]{new StackTraceElement("Invalid Stack\n", "a", "a.java", 1)};
                            }
                            if (c0v426.LJIIIZ) {
                                stackTraceElementArr = c0v426.LJIILL;
                                if (stackTraceElementArr == null) {
                                    stackTraceElementArr = new StackTraceElement[]{new StackTraceElement("Invalid Stack\n", "a", "a.java", 1)};
                                }
                            } else {
                                stackTraceElementArr = null;
                            }
                            if (!TextUtils.isEmpty("uuid")) {
                                c0v35LJ.LJIIL = "uuid";
                            }
                            c0v35LJ.LJIIIZ = stackTraceElementArr2;
                            if (stackTraceElementArr != null) {
                                c0v35LJ.LJIIJ = stackTraceElementArr;
                            }
                            if (!TextUtils.isEmpty(null)) {
                                c0v35LJ.LJIIJJI = null;
                            }
                        }
                        if (c0v426.LJIIJ) {
                            C787900UvU.LIZ.LIZJ(new ARunnableS82S0200000_13(this, c0v426, 18));
                        } else {
                            this.LJIIIZ = c0v426;
                        }
                        C0V42 c0v427 = this.LJIIIIZZ;
                        if (c0v427.LJII - c0v427.LJI > this.LIZLLL && z && this.LJIIJJI) {
                            C20684088k.LIZ();
                        }
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJII(C0V42 c0v42, String str) {
        if (PerfConfig.LIZ) {
            JSONObject jSONObjectLJ = LJ(c0v42);
            JSONObject jSONObjectLIZJ = C2257208ss.LIZ().LIZJ(true);
            jSONObjectLIZJ.put("crash_section", C792400V6o.LJII(c0v42.LJIIIIZZ));
            jSONObjectLIZJ.put("belong_frame", String.valueOf(c0v42.LIZLLL));
            jSONObjectLIZJ.put("belong_dump", String.valueOf(c0v42.LIZJ));
            jSONObjectLIZJ.put("block_stack_type", "messageKey");
            jSONObjectLJ.put("filters", jSONObjectLIZJ);
            jSONObjectLJ.put("event_type", "lag");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("at ");
            sbLIZ.append(str);
            sbLIZ.append(".*(a.java:-1)");
            jSONObjectLJ.put("stack", C2188811AlT.LIZIZ(sbLIZ));
            C0V1I c0v1i = new C0V1I("block_monitor", jSONObjectLJ);
            c0v1i.LIZJ = true;
            C792310V6f.LJIIIZ().LIZJ(c0v1i);
        }
    }

    public static JSONObject LIZIZ(C0V42 c0v42, String str, boolean z) throws JSONException {
        JSONObject jSONObjectLIZJ = C2257208ss.LIZ().LIZJ(true);
        jSONObjectLIZJ.put("crash_section", C792400V6o.LJII(c0v42.LJIIIIZZ));
        jSONObjectLIZJ.put("belong_frame", String.valueOf(z));
        jSONObjectLIZJ.put("belong_dump", String.valueOf(c0v42.LIZJ));
        jSONObjectLIZJ.put("block_input", String.valueOf(c0v42.LJ));
        jSONObjectLIZJ.put("block_frame", String.valueOf(c0v42.LJFF));
        jSONObjectLIZJ.put("block_message", str);
        jSONObjectLIZJ.put("block_stack_type", "stack");
        jSONObjectLIZJ.put("buuid", c0v42.LJIIZILJ);
        jSONObjectLIZJ.put("belong_poll_once", String.valueOf(c0v42.LJIIJ));
        return jSONObjectLIZJ;
    }

    public final void LJI(C0V42 c0v42, String str, boolean z) {
        if (!this.LJIIL) {
            return;
        }
        JSONObject jSONObjectLJ = LJ(c0v42);
        jSONObjectLJ.put("stack", c0v42.LJIILLIIL);
        jSONObjectLJ.put("message", str);
        jSONObjectLJ.put("ignore_stack", this.LJIIIIZZ.LJIIJJI);
        jSONObjectLJ.put("event_type", "lag");
        jSONObjectLJ.put("filters", LIZIZ(c0v42, str, z));
        C0V1I c0v1i = new C0V1I("block_monitor", c0v42.LJI, jSONObjectLJ);
        LIZ(c0v1i);
        C792310V6f.LJIIIZ().LIZJ(c0v1i);
    }

    public final void LJIIIIZZ(C0V42 c0v42, String str, boolean z) {
        StackTraceElement[] stackTraceElementArr;
        String string;
        String methodName;
        String methodName2;
        String fileName;
        String fileName2;
        if (!this.LJIILIIL) {
            return;
        }
        JSONObject jSONObjectLIZIZ = LIZIZ(c0v42, str, c0v42.LIZLLL);
        jSONObjectLIZIZ.put("sbuuid", "empty");
        JSONObject jSONObjectLJ = LJ(c0v42);
        jSONObjectLJ.put("message", str);
        StackTraceElement[] stackTraceElementArr2 = c0v42.LJIILJJIL;
        if (stackTraceElementArr2 != null && (stackTraceElementArr = c0v42.LJIILL) != null) {
            int length = stackTraceElementArr2.length;
            int length2 = stackTraceElementArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= Math.min(length, length2)) {
                    break;
                }
                int i3 = (length - i) - 1;
                int i4 = (length2 - i) - 1;
                if (!c0v42.LJIILJJIL[i3].equals(c0v42.LJIILL[i4])) {
                    StackTraceElement stackTraceElement = c0v42.LJIILJJIL[i3];
                    StackTraceElement stackTraceElement2 = c0v42.LJIILL[i4];
                    if (stackTraceElement == stackTraceElement2 || (stackTraceElement != null && stackTraceElement2 != null && stackTraceElement.getClassName().equals(stackTraceElement2.getClassName()) && (((methodName = stackTraceElement.getMethodName()) == (methodName2 = stackTraceElement2.getMethodName()) || (methodName != null && methodName.equals(methodName2))) && ((fileName = stackTraceElement.getFileName()) == (fileName2 = stackTraceElement2.getFileName()) || (fileName != null && fileName.equals(fileName2)))))) {
                        i2++;
                    }
                } else {
                    i2++;
                    i++;
                }
            }
            if (i2 == 0) {
                jSONObjectLIZIZ.put("serious_stack_coincide", "none");
            } else if (i2 == length && i2 == length2) {
                jSONObjectLIZIZ.put("serious_stack_coincide", "full");
            } else {
                jSONObjectLIZIZ.put("serious_stack_coincide", "part");
                this.LJII.setLength(0);
                for (int i5 = 0; i5 <= length - i2; i5++) {
                    StringBuilder sb = this.LJII;
                    sb.append("\tat ");
                    sb.append(c0v42.LJIILJJIL[i5].getClassName());
                    sb.append(e3.d);
                    sb.append(c0v42.LJIILJJIL[i5].getMethodName());
                    sb.append(e3.h);
                    sb.append(c0v42.LJIILJJIL[i5].getFileName());
                    sb.append(":");
                    sb.append(c0v42.LJIILJJIL[i5].getLineNumber());
                    sb.append(")\n");
                }
                jSONObjectLJ.put("stack1", this.LJII.toString());
                this.LJII.setLength(0);
                for (int i6 = 0; i6 <= length2 - i2; i6++) {
                    StringBuilder sb2 = this.LJII;
                    sb2.append("\tat ");
                    sb2.append(c0v42.LJIILL[i6].getClassName());
                    sb2.append(e3.d);
                    sb2.append(c0v42.LJIILL[i6].getMethodName());
                    sb2.append(e3.h);
                    sb2.append(c0v42.LJIILL[i6].getFileName());
                    sb2.append(":");
                    sb2.append(c0v42.LJIILL[i6].getLineNumber());
                    sb2.append(")\n");
                }
                jSONObjectLJ.put("stack2", this.LJII.toString());
            }
            this.LJII.setLength(0);
            while (i2 > 0) {
                StringBuilder sb3 = this.LJII;
                sb3.append("\tat ");
                int i7 = length - i2;
                sb3.append(c0v42.LJIILJJIL[i7].getClassName());
                sb3.append(e3.d);
                sb3.append(c0v42.LJIILJJIL[i7].getMethodName());
                sb3.append(e3.h);
                sb3.append(c0v42.LJIILJJIL[i7].getFileName());
                sb3.append(":");
                sb3.append(c0v42.LJIILJJIL[i7].getLineNumber());
                sb3.append(")\n");
                i2--;
            }
            if (this.LJII.length() == 0) {
                string = c0v42.LJIILLIIL;
            } else {
                string = this.LJII.toString();
            }
            jSONObjectLJ.put("stack", string);
            jSONObjectLIZIZ.put("sbuuid", c0v42.LJIIZILJ);
        }
        jSONObjectLJ.put("stack_cost", c0v42.LJIILIIL - c0v42.LJIIL);
        jSONObjectLJ.put("filters", jSONObjectLIZIZ);
        jSONObjectLJ.put("event_type", "serious_lag");
        jSONObjectLJ.put("block_looper_info", c0v42.LJIJI);
        jSONObjectLJ.put("block_cpu_info", c0v42.LJIJJ);
        jSONObjectLJ.put("block_memory_info", c0v42.LJIJJLI);
        jSONObjectLJ.put("custom", c0v42.LJIL);
        jSONObjectLJ.put("block_error_info", z);
        C0V1I c0v1i = new C0V1I("serious_block_monitor", c0v42.LJI, jSONObjectLJ);
        LIZ(c0v1i);
        C792310V6f.LJIIIZ().LIZJ(c0v1i);
    }
}
