package X;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0VGM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VGM implements InterfaceC1100950ekv {
    public final long LIZ;
    public C854540Xfg LIZJ;
    public boolean LJ;
    public long LJFF;
    public final Set<Function1<Float, Unit>> LIZIZ = new LinkedHashSet();
    public float LIZLLL = -1.0f;

    @Override // X.InterfaceC1101140elE
    public final void stop() {
    }

    @Override // X.InterfaceC1101140elE
    public final void LJI() {
        if (this.LIZIZ.isEmpty()) {
            return;
        }
        float f = C476230Ilx.LIZ.LJFF;
        Iterator<Function1<Float, Unit>> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Float.valueOf(f));
        }
    }

    @Override // X.InterfaceC1101140elE
    public final void destroy() {
        this.LIZIZ.clear();
        if (this.LIZJ != null) {
            C786410Ut5.LJJIFFI(C01AB.LIZ(), this.LIZJ);
        }
    }

    @Override // X.InterfaceC1101140elE
    public final void start() {
        this.LIZJ = new C854540Xfg(this, 5);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        LIZ(Build.VERSION.SDK_INT >= 26 ? C786410Ut5.LJIJJLI(C01AB.LIZ(), this.LIZJ, intentFilter, 2) : C786410Ut5.LJIJJ(C01AB.LIZ(), this.LIZJ, intentFilter));
    }

    @Override // X.InterfaceC1088600eR0
    public final float getBatteryTemperature() {
        try {
            if (SystemClock.elapsedRealtime() - this.LJFF >= this.LIZ) {
                LIZ(Build.VERSION.SDK_INT >= 26 ? C786410Ut5.LJIJJLI(C01AB.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), 2) : C786410Ut5.LJIJJ(C01AB.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return this.LIZLLL;
    }

    public C0VGM(long j) {
        this.LIZ = j;
    }

    public final void LIZ(Intent intent) {
        boolean z;
        if (intent == null) {
            return;
        }
        try {
            boolean z2 = false;
            this.LIZLLL = intent.getIntExtra("temperature", 0) / 10;
            intent.getIntExtra("scale", -1);
            intent.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
            intent.getIntExtra("health", 1);
            intent.getBooleanExtra("present", true);
            intent.getIntExtra("voltage", -1);
            try {
                intent.getStringExtra("technology");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            int intExtra = intent.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
            intent.getIntExtra("level", -1);
            if (intExtra != 2 && intExtra != 5) {
                z = false;
            } else {
                z = true;
            }
            if (this.LJ || z) {
                z2 = true;
            }
            this.LJ = z2;
            this.LJFF = SystemClock.elapsedRealtime();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJI("LiveBatteryManager", e2);
        }
    }
}
