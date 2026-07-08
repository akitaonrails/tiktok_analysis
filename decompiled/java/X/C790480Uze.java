package X;

import Y.ARunnableS24S0101000_13;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Uze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790480Uze {
    public final C0HA4 LIZ;
    public final Function1<Integer, Unit> LIZIZ;
    public final Function1<String, Unit> LIZJ;
    public long LIZLLL;
    public Integer LJ;
    public boolean LJFF;
    public int LJI;

    public C790480Uze(C0HA4 c0ha4, C1452405mM c1452405mM, C1450505m3 c1450505m3) {
        this.LIZ = c0ha4;
        this.LIZIZ = c1452405mM;
        this.LIZJ = c1450505m3;
    }

    public final boolean LIZ(int i, int i2, int i3, boolean z) {
        long jUptimeMillis;
        long j = 0;
        try {
            jUptimeMillis = SystemClock.uptimeMillis();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            jUptimeMillis = 0;
        }
        long j2 = jUptimeMillis - this.LIZLLL;
        if (!z && jUptimeMillis > 0 && j2 < 50) {
            if (!((Boolean) C136900ff.LIZ.getValue()).booleanValue()) {
                this.LIZJ.invoke("throttled discard headerInset=" + i + " targetTop=" + i2 + " currentTop=" + i3);
                return true;
            }
            long j3 = 50 - j2;
            try {
                this.LJ = Integer.valueOf(i);
                if (this.LJFF) {
                    Function1<String, Unit> function1 = this.LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("merge pending headerInset=");
                    sbLIZ.append(i);
                    sbLIZ.append(" targetTop=");
                    sbLIZ.append(i2);
                    sbLIZ.append(" currentTop=");
                    sbLIZ.append(i3);
                    function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
                    return true;
                }
                this.LJFF = true;
                int i4 = this.LJI;
                Function1<String, Unit> function12 = this.LIZJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("schedule retry headerInset=");
                sbLIZ2.append(i);
                sbLIZ2.append(" targetTop=");
                sbLIZ2.append(i2);
                sbLIZ2.append(" currentTop=");
                sbLIZ2.append(i3);
                sbLIZ2.append(" delayMs=");
                sbLIZ2.append(j3);
                function12.invoke(C2188811AlT.LIZIZ(sbLIZ2));
                C0HA4 c0ha4 = this.LIZ;
                ARunnableS24S0101000_13 aRunnableS24S0101000_13 = new ARunnableS24S0101000_13(i4, this, 1);
                if (j3 >= 0) {
                    j = j3;
                }
                HandlerHook.viewPostDelay(c0ha4, aRunnableS24S0101000_13, j);
                return true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                this.LJFF = false;
                Function1<String, Unit> function13 = this.LIZJ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("schedule error headerInset=");
                sbLIZ3.append(i);
                sbLIZ3.append(" error=");
                sbLIZ3.append(th2.getMessage());
                function13.invoke(C2188811AlT.LIZIZ(sbLIZ3));
                return true;
            }
        }
        if (jUptimeMillis > 0) {
            this.LIZLLL = jUptimeMillis;
        }
        return false;
    }
}
