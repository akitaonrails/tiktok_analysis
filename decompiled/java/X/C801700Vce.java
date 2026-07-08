package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.dumper.LocaleInfo;
import com.bytedance.crash.dumper.MemoryInfo;
import com.bytedance.crash.dumper.Scraps;
import com.bytedance.crash.looper.MessageRecorder;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Vce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801700Vce {
    public final File LIZ;
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final AtomicBoolean LJI = new AtomicBoolean(false);
    public final AtomicBoolean LJII = new AtomicBoolean(false);
    public final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public final AtomicBoolean LJIIJJI = new AtomicBoolean(false);
    public final AtomicBoolean LJIIL = new AtomicBoolean(false);
    public final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public final AtomicBoolean LJIILJJIL = new AtomicBoolean(false);
    public final AtomicBoolean LJIILL = new AtomicBoolean(false);
    public final AtomicBoolean LJIILLIIL = new AtomicBoolean(false);
    public final AtomicBoolean LJIIZILJ = new AtomicBoolean(false);
    public final AtomicBoolean LJIJ = new AtomicBoolean(false);
    public final AtomicBoolean LJIJI = new AtomicBoolean(false);
    public final AtomicBoolean LJIJJ = new AtomicBoolean(false);
    public final AtomicBoolean LJIJJLI = new AtomicBoolean(false);
    public long LIZIZ = 0;
    public CrashType LIZJ = CrashType.UNKNOWN;
    public int LIZLLL = 0;

    public C801700Vce(C0VSJ c0vsj) {
        this.LIZ = c0vsj;
    }

    public final void LIZ(int i, boolean z, long j, boolean z2, boolean z3) {
        C799500VXw c799500VXw;
        CrashType crashType = CrashType.NATIVE;
        if (j != 0) {
            long j2 = this.LIZIZ;
            if (j2 == 0 || j2 > j) {
                this.LIZIZ = j;
                this.LIZJ = crashType;
            }
        }
        this.LIZLLL = i;
        try {
            if (this.LJFF.compareAndSet(false, true)) {
                C801630VcX.LIZ(this.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C801940Vd2.LIZ("dumpCommonParams", th);
        }
        if (this.LJI.compareAndSet(false, true)) {
            LocaleInfo.dump(this.LIZ);
        }
        if (this.LJII.compareAndSet(false, true)) {
            C801690Vcd.LIZ(this.LIZ);
            C801690Vcd.LIZIZ(this.LIZ);
        }
        if (this.LJIIIIZZ.compareAndSet(false, true)) {
            MemoryInfo.LIZ(this.LIZ);
        }
        if (this.LJIIIZ.compareAndSet(false, true)) {
            Scraps.dump(this.LIZ);
        }
        if (z3) {
            try {
                if (this.LJIIJ.compareAndSet(false, true)) {
                    MessageRecorder.LIZ(this.LIZ);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        if (this.LJIIJJI.compareAndSet(false, true)) {
            C801620VcW.LIZ(this.LIZ);
        }
        try {
            if (this.LJIILIIL.compareAndSet(false, true)) {
                C0VYR.LIZJ.LIZ(this.LIZ);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C801940Vd2.LIZ("dumpAppVersion", th3);
        }
        if (this.LJIIL.compareAndSet(false, true)) {
            C0VYH.LIZ(this.LIZ);
        }
        if (z && this.LJIILJJIL.compareAndSet(false, true)) {
            File file = this.LIZ;
            Map mapZ = C2204961BRm.Z(new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud82d22r9XLbXxG20tygELz1", null));
            if (!mapZ.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(file.getAbsolutePath());
                sbLIZ.append("/");
                sbLIZ.append("all_thread_stacks");
                sbLIZ.append(".json");
                C801720Vcg c801720Vcg = new C801720Vcg(C2188811AlT.LIZIZ(sbLIZ));
                c801720Vcg.LJIIIZ();
                c801720Vcg.LJII("all_thread_stacks");
                c801720Vcg.LJIIIZ();
                c801720Vcg.LJII("thread_all_count");
                c801720Vcg.LIZIZ(mapZ.size());
                c801720Vcg.LJIIIIZZ();
                c801720Vcg.LJII("thread_stacks");
                c801720Vcg.LIZ('[');
                boolean z4 = true;
                for (Map.Entry entry : mapZ.entrySet()) {
                    StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
                    if (z4) {
                        z4 = false;
                    } else {
                        c801720Vcg.LJIIIIZZ();
                    }
                    c801720Vcg.LJIIIZ();
                    Thread thread = (Thread) entry.getKey();
                    c801720Vcg.LJII("thread_name");
                    c801720Vcg.LIZ.LIZ('\"');
                    c801720Vcg.LIZLLL(thread.getName());
                    c801720Vcg.LIZ.LIZ('(');
                    c801720Vcg.LIZ.LIZJ(thread.getId());
                    c801720Vcg.LIZ.LIZ(')');
                    c801720Vcg.LIZ('\"');
                    c801720Vcg.LJIIIIZZ();
                    c801720Vcg.LJII("thread_stack");
                    c801720Vcg.LIZ('[');
                    if (stackTraceElementArr.length > 0) {
                        for (int i2 = 0; i2 < stackTraceElementArr.length; i2++) {
                            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
                            c801720Vcg.LIZ.LIZ('\"');
                            c801720Vcg.LIZLLL(stackTraceElement.getClassName());
                            c801720Vcg.LIZ.LIZ('.');
                            c801720Vcg.LIZLLL(stackTraceElement.getMethodName());
                            c801720Vcg.LIZ.LIZ('(');
                            c801720Vcg.LIZLLL(stackTraceElement.getFileName());
                            c801720Vcg.LIZ.LIZ(':');
                            c801720Vcg.LIZ.LIZIZ(stackTraceElement.getLineNumber());
                            c801720Vcg.LIZ.LIZ(')');
                            c801720Vcg.LIZ('\"');
                            if (i2 != stackTraceElementArr.length - 1) {
                                c801720Vcg.LJIIIIZZ();
                            }
                        }
                    } else {
                        c801720Vcg.LIZLLL("\"(Native Method)\"");
                    }
                    c801720Vcg.LIZ(']');
                    c801720Vcg.LJIIJ();
                }
                c801720Vcg.LIZ(']');
                c801720Vcg.LJIIJ();
                c801720Vcg.LJIIJ();
                c801720Vcg.LJI();
            }
        }
        if (this.LJIILL.compareAndSet(false, true)) {
            C08OQ.LIZ(this.LIZ);
        }
        if (z2 && this.LJIIZILJ.compareAndSet(false, true)) {
            C0VJM.LIZ(this.LIZ);
        }
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP != null && (c799500VXw = c802790VeP.LJIIJJI) != null && this.LJIJJLI.compareAndSet(false, true)) {
            c799500VXw.LIZ(this.LIZ);
        }
        if (this.LJIJ.compareAndSet(false, true)) {
            C801640VcY.LIZIZ(this.LIZ, this.LIZJ, this.LIZLLL);
        }
        if (this.LJIJI.compareAndSet(false, true)) {
            C801760Vck.LIZ(this.LIZ, this.LIZJ);
        }
        if (this.LJIJJ.compareAndSet(false, true) && C802110VdJ.LIZ()) {
            C802110VdJ.LIZ.flush();
        }
        if (this.LJIILLIIL.compareAndSet(false, true)) {
            C803170Vf1.LIZ(this.LIZ);
        }
    }
}
