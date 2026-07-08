package X;

import android.content.Context;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0VA1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VA1 implements C0V9Z {
    public static volatile C0VA1 LJI;
    public static int LJII;
    public boolean LIZ;
    public final C793270V9x LIZIZ;
    public final C793280V9y LIZJ;
    public final C0VA3 LIZLLL;
    public final C793250V9v LJ;
    public final C793290V9z LJFF;

    public final synchronized void LIZ() {
        if (this.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("end, obj:");
            sbLIZ.append(this);
            C2188811AlT.LIZIZ(sbLIZ);
            boolean z = C2040807z4.LIZ;
            this.LIZIZ.getClass();
            this.LIZJ.getClass();
            C0VA3 c0va3 = this.LIZLLL;
            if (c0va3.LIZIZ) {
                c0va3.LIZIZ = false;
                C0VA2 c0va2 = c0va3.LIZLLL;
                ((ArrayList) c0va2.LIZ).clear();
                ((ArrayList) c0va2.LIZIZ).clear();
                ((ArrayList) c0va2.LIZJ).clear();
                c0va2.LJFF = 0L;
                c0va2.LJI = 0L;
                c0va2.LJII = 0L;
                ((HashMap) c0va3.LJ).clear();
                ((HashMap) c0va3.LJFF).clear();
                C0VA4 c0va4 = c0va3.LJII;
                ((ArrayList) c0va4.LIZ).clear();
                ((ArrayList) c0va4.LIZIZ).clear();
                c0va4.LIZJ = 0L;
                c0va4.LIZLLL = 0L;
                c0va4.LJ = 0L;
                c0va4.LJFF = 0.0d;
                C0VAG c0vag = c0va3.LJIIIZ;
                c0vag.LIZ = null;
                c0vag.LIZIZ = -1;
                c0vag.LJII = 0L;
                c0vag.LJIILIIL = 0L;
                c0vag.LJIILJJIL = 0L;
                c0vag.LJIILL = 0.0d;
                c0vag.LJIILLIIL = 0.0d;
                ((HashMap) c0va3.LJIIJ).clear();
                ((HashMap) c0va3.LJIIJJI).clear();
                C0VA5 c0va5 = c0va3.LJIILIIL;
                ((ArrayList) c0va5.LIZ).clear();
                ((ArrayList) c0va5.LIZIZ).clear();
                c0va5.LIZJ = 0L;
                c0va5.LIZLLL = 0L;
                c0va5.LJ = 0L;
                c0va3.LJIILJJIL.clear();
            }
            this.LIZ = false;
        }
    }

    public final synchronized C0VA1 LJI() {
        if (!this.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start, obj:");
            sbLIZ.append(this);
            C2188811AlT.LIZIZ(sbLIZ);
            boolean z = C2040807z4.LIZ;
            this.LIZIZ.getClass();
            this.LIZJ.getClass();
            C0VA3 c0va3 = this.LIZLLL;
            if (!c0va3.LIZIZ) {
                c0va3.LIZIZ = true;
                c0va3.LIZ();
            }
            this.LIZ = true;
        }
        return this;
    }

    public final int LIZIZ() {
        C793270V9x c793270V9x = this.LIZIZ;
        c793270V9x.getClass();
        if (C2040807z4.LIZ) {
            return c793270V9x.LJ;
        }
        BatteryManager batteryManager = c793270V9x.LIZJ;
        if (batteryManager == null) {
            return c793270V9x.LJ;
        }
        int iLLD = c793270V9x.LJ;
        try {
            iLLD = (int) C2204961BRm.LLD(batteryManager, 4, new C0WZX("dzBzEgAjS8/YVFkiQFyTZ17d7BzqoAoS7urIfwu9f4VwGWNU/Jl6Jl41aXJgvk6ANz207B5D8LEC1O0=", null));
            return iLLD;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            boolean z = C2040807z4.LIZ;
            return iLLD;
        }
    }

    public final C0V9W LIZJ() {
        C0V9W c0v9w = new C0V9W();
        c0v9w.LIZ = C0VAI.LIZJ();
        c0v9w.LIZIZ = this.LIZIZ.LIZLLL;
        c0v9w.LIZJ = LIZIZ();
        c0v9w.LIZLLL = LIZLLL();
        c0v9w.LJ = LJFF();
        c0v9w.LJFF = this.LIZIZ.LJFF;
        ((C0VA1) this.LIZLLL.LIZ).LJFF.getClass();
        return c0v9w;
    }

    public final int LIZLLL() {
        C793280V9y c793280V9y = this.LIZJ;
        if (Build.VERSION.SDK_INT < 29) {
            c793280V9y.getClass();
            return -1;
        }
        PowerManager powerManager = c793280V9y.LIZIZ;
        if (powerManager != null) {
            return powerManager.getCurrentThermalStatus();
        }
        return -1;
    }

    public final int LJFF() {
        PowerManager powerManager = this.LIZIZ.LIZIZ;
        if (powerManager != null) {
            return powerManager.isPowerSaveMode() ? 1 : 0;
        }
        return -1;
    }

    public static C0VA1 LJ(Context context) {
        if (LJI == null) {
            synchronized (C0VA1.class) {
                try {
                    if (LJI == null) {
                        LJI = new C0VA1(context, C793290V9z.LJ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    public C0VA1(Context context, C793290V9z c793290V9z) {
        C793290V9z c793290V9z2;
        Context contextN3 = C786410Ut5.N3(context);
        if (c793290V9z == null) {
            c793290V9z2 = C793290V9z.LJ;
        } else {
            c793290V9z2 = c793290V9z;
        }
        this.LJFF = c793290V9z2;
        this.LIZIZ = new C793270V9x(contextN3, this);
        this.LIZJ = new C793280V9y(contextN3, this);
        this.LIZLLL = new C0VA3(contextN3, this);
        this.LJ = new C793250V9v(this);
        LJII |= 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addOptFlag for all:");
        sbLIZ.append(1);
        sbLIZ.append(",now:");
        sbLIZ.append(LJII);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z = C2040807z4.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("new assist obj:");
        sbLIZ2.append(this);
        sbLIZ2.append(" config : ");
        sbLIZ2.append(c793290V9z);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
