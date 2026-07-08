package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveBatteryReceiverOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostChargeTestSettings;
import com.bytedance.android.livesdk.performance.power.WatchRefreshRateSetting;
import com.bytedance.android.livesdk.settings.PerfMiloSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Set;

/* JADX INFO: renamed from: X.0jwW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300340jwW {
    public C1300350jwX LIZ;
    public C1300410jwd LIZIZ;
    public IntentFilter LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public float LJFF = -1.0f;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ = 1;
    public int LJIIIZ = 1;
    public boolean LJIIJ = true;
    public int LJIIJJI = -1;
    public boolean LJIILJJIL = true;
    public int LJIILL = -1;
    public final BPEAHandler LJIILLIIL = new BPEAHandler(Looper.getMainLooper());
    public long LJIIZILJ = 0;
    public float LJIJ = 0.0f;

    public final synchronized void LJIIJ() {
        this.LJIILIIL = false;
        this.LJI = -1;
        if (this.LIZLLL) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (PerfMiloSetting.enable()) {
                LJIIIZ();
                this.LIZLLL = false;
            } else {
                Context contextLIZ = C01AB.LIZ();
                if (contextLIZ != null) {
                    C786410Ut5.LJJIFFI(contextLIZ, this.LIZ);
                }
                this.LIZLLL = false;
            }
        }
    }

    public final void LIZIZ() {
        if (this.LJ || C01AB.LIZ() == null) {
            return;
        }
        try {
            Intent intentLJIJJ = C786410Ut5.LJIJJ(C01AB.LIZ(), null, this.LIZJ);
            if (intentLJIJJ != null) {
                LIZ(intentLJIJJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("LiveBatteryManager", "ensureInitialValue failed", e);
        }
    }

    public final void LJIIIIZZ() {
        try {
            C1300410jwd c1300410jwd = this.LIZIZ;
            C2200821BBo.LIZ.getClass();
            if (!C2200821BBo.LIZ()) {
                C2200791BBl.LIZ.getClass();
                Set<InterfaceC1300470jwj> set = C2200791BBl.LJI;
                synchronized (set) {
                    try {
                        set.add(c1300410jwd);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            Intent intentLJIJJ = C786410Ut5.LJIJJ(C01AB.LIZ(), null, this.LIZJ);
            if (intentLJIJJ != null) {
                LIZ(intentLJIJJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LiveBatteryManager", e);
        }
    }

    public final void LJIIIZ() {
        try {
            C1300410jwd c1300410jwd = this.LIZIZ;
            C2200821BBo.LIZ.getClass();
            if (C2200821BBo.LIZ()) {
                return;
            }
            C2200791BBl.LIZ.getClass();
            Set<InterfaceC1300470jwj> set = C2200791BBl.LJI;
            synchronized (set) {
                try {
                    set.remove(c1300410jwd);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJFF("LiveBatteryManager", "milo unregister", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0jwd] */
    public C1300340jwW() {
        Context contextLIZ = C01AB.LIZ();
        if (WatchRefreshRateSetting.isEnable() && contextLIZ != null) {
            C1300360jwY c1300360jwY = C1300360jwY.LIZ;
            Context contextN3 = C786410Ut5.N3(contextLIZ);
            synchronized (c1300360jwY) {
                C1300360jwY.LIZIZ = contextN3;
                if (contextN3 != null && ((Boolean) C1300360jwY.LJIIL.getValue()).booleanValue() && Build.VERSION.SDK_INT >= 30) {
                    if (!C1300360jwY.LJI) {
                        if (C464660IKa.LIZ()) {
                            ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerPageEventCallback((C1AU9) C1300360jwY.LJIILIIL.getValue());
                        } else {
                            ((Application) C1300360jwY.LIZIZ).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) C1300360jwY.LJIILJJIL.getValue());
                        }
                        C1300360jwY.LJI = true;
                    }
                    C1300360jwY.LJ = Integer.MIN_VALUE;
                    C1300360jwY.LJFF = Integer.MAX_VALUE;
                }
            }
        }
        if (PerfMiloSetting.enable()) {
            this.LIZIZ = new InterfaceC1300470jwj() { // from class: X.0jwd
                @Override // X.InterfaceC1300470jwj
                public final void LIZ(C1512930pTP c1512930pTP) {
                    C1300340jwW c1300340jwW = this.LIZ;
                    c1300340jwW.LJ = true;
                    c1300340jwW.LJIILIIL = false;
                    c1300340jwW.LIZ(c1512930pTP.LIZJ);
                }
            };
        }
        this.LIZ = new C1300350jwX(this);
        this.LIZJ = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public static int LIZJ() {
        if (C01AB.LIZ() == null) {
            return -1;
        }
        PowerManager powerManager = (PowerManager) C786410Ut5.H2(C01AB.LIZ(), "power");
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        try {
            return powerManager.getCurrentThermalStatus();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public final int LJ() {
        if (LiveHostChargeTestSettings.enable()) {
            return LiveHostChargeTestSettings.mockBatteryLevel();
        }
        LIZIZ();
        return this.LJI;
    }

    public final float LJFF() throws Exception {
        if (C01AB.LIZ() == null) {
            return this.LJFF;
        }
        Intent intentLJIJJ = C786410Ut5.LJIJJ(C01AB.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentLJIJJ != null) {
            LIZ(intentLJIJJ);
        }
        return this.LJFF;
    }

    public final int LJI() {
        return LiveHostChargeTestSettings.enable() ? LiveHostChargeTestSettings.mockBatteryScale() : this.LJII;
    }

    public final boolean LJII() {
        if (LiveHostChargeTestSettings.enable()) {
            return LiveHostChargeTestSettings.mockIsCharge();
        }
        if (LiveBatteryReceiverOptSetting.INSTANCE.enable() && this.LIZLLL) {
            if (this.LJ) {
                return this.LJIIL;
            }
            LIZIZ();
            return this.LJIIL;
        }
        if (C01AB.LIZ() == null) {
            return this.LJIIL;
        }
        C20441214yg.LIZIZ("LiveBatteryManager", "isCharging: not registered, use sync query");
        Intent intentLJIJJ = C786410Ut5.LJIJJ(C01AB.LIZ(), null, this.LIZJ);
        if (intentLJIJJ != null) {
            LIZ(intentLJIJJ);
        }
        return this.LJIIL;
    }

    public static C1300340jwW LIZLLL() {
        return C476230Ilx.LIZ;
    }

    public final void LIZ(Intent intent) {
        boolean z;
        if (intent == null) {
            return;
        }
        try {
            boolean z2 = false;
            this.LJFF = intent.getIntExtra("temperature", 0) / 10.0f;
            this.LJII = intent.getIntExtra("scale", -1);
            this.LJIIIIZZ = intent.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
            this.LJIIIZ = intent.getIntExtra("health", 1);
            this.LJIIJ = intent.getBooleanExtra("present", true);
            this.LJIIJJI = intent.getIntExtra("voltage", -1);
            try {
                if (intent.getStringExtra("technology") != null) {
                    try {
                        intent.getStringExtra("technology");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            int intExtra = intent.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
            int intExtra2 = intent.getIntExtra("level", -1);
            this.LJI = intExtra2;
            if (intExtra != 2 && intExtra != 5) {
                z = false;
            } else {
                z = true;
            }
            this.LJIIL = z;
            if (this.LJIILIIL || z) {
                z2 = true;
            }
            this.LJIILIIL = z2;
            if (intExtra2 > 0) {
                if (this.LJIIZILJ > 0 && this.LJIILL > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIZILJ;
                    if (jCurrentTimeMillis > 0) {
                        this.LJIJ = (this.LJI - this.LJIILL) / jCurrentTimeMillis;
                    }
                }
                this.LJIILL = this.LJI;
                this.LJIIZILJ = System.currentTimeMillis();
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            C20441214yg.LJI("LiveBatteryManager", e3);
        }
    }
}
