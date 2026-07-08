package X;

import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.os.Build;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VAT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VAT extends C0V1P {
    public final Map<String, C0VAV> LLIZLLLIL = new ConcurrentHashMap();
    public long LLJ = -1;
    public boolean LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.C0V1P
    public final boolean LJIIIZ() {
        return true;
    }

    @Override // X.C0V1P
    public final void LJIIJJI() {
        if (Build.VERSION.SDK_INT > 29) {
            return;
        }
        this.LLJI = ActivityLifeObserver.getInstance().isForeground();
        this.LLJ = System.currentTimeMillis();
        C0VAZ c0vaz = new C0VAZ();
        C793310VAb c793310VAb = new C793310VAb();
        try {
            AnonymousClass0832 anonymousClass0832 = new AnonymousClass0832();
            ((HashMap) anonymousClass0832.LIZ).put("alarm", c0vaz);
            ((HashMap) anonymousClass0832.LIZ).put("power", c793310VAb);
            anonymousClass0832.LIZ();
            C0VAX c0vax = new C0VAX();
            ((ConcurrentHashMap) this.LLIZLLLIL).put("alarm", c0vaz);
            ((ConcurrentHashMap) this.LLIZLLLIL).put("cpu_active_time", c0vax);
            ((ConcurrentHashMap) this.LLIZLLLIL).put("power", c793310VAb);
            C791820V4i c791820V4i = C787900UvU.LIZ;
            c791820V4i.LIZ(this);
            if (C792400V6o.LJIIIZ() && this.LL) {
                C793370VAh c793370VAh = C0VAY.LIZ;
                c793370VAh.getClass();
                c791820V4i.LIZJ(new ARunnableS113S0100000_13(c793370VAh, 147));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hook failed: ");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            ActivityLifeObserver.getInstance().unregister(this);
            ((IConfigManager) C792600V7i.LIZ(IConfigManager.class)).unregisterConfigListener(this);
        }
    }

    public C0VAT() {
        this.LLILZIL = "battery";
    }

    @Override // X.C0V1P, X.InterfaceC792030V5d
    public final void LIZ() {
        super.LIZ();
        C793370VAh c793370VAh = C0VAY.LIZ;
        c793370VAh.getClass();
        C787900UvU.LIZ.LIZJ(new ARunnableS113S0100000_13(c793370VAh, 147));
    }

    @Override // X.C0V1P
    public final void LJIIL() {
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTimer record, current is background? : ");
            sbLIZ.append(ActivityLifeObserver.getInstance().isForeground());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LJIILL();
        Iterator it2 = ((ConcurrentHashMap) this.LLIZLLLIL).values().iterator();
        while (it2.hasNext()) {
            ((C0VAV) it2.next()).LJ();
        }
    }

    @Override // X.C0V1P
    public final long LJIILJJIL() {
        return this.LLJIJIL * 60000;
    }

    public final void LJIILL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LLJ != -1) {
            C793370VAh c793370VAh = C0VAY.LIZ;
            c793370VAh.LIZIZ = ActivityLifeObserver.getInstance().getTopActivityClassName();
            c793370VAh.LIZJ(new C793390VAj(jCurrentTimeMillis, jCurrentTimeMillis - this.LLJ, "ground_record", this.LLJI));
        }
        this.LLJ = jCurrentTimeMillis;
    }

    @Override // X.C0V1P
    public final void LIZJ(JSONObject jSONObject) {
        this.LLJIJIL = jSONObject.optLong("battery_record_interval", 10L);
        boolean z = false;
        int iOptInt = jSONObject.optInt("enable_upload", 0);
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mRecordInterval:");
            sbLIZ.append(this.LLJIJIL);
            sbLIZ.append(",mBatteryCollectEnabled");
            sbLIZ.append(iOptInt);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (iOptInt <= 0 || this.LLJIJIL <= 0) {
            ((ConcurrentHashMap) this.LLIZLLLIL).clear();
            ActivityLifeObserver.getInstance().unregister(this);
            C787900UvU.LIZ.LJI(this);
        }
        if (jSONObject.optInt("trace_enable", 0) == 1) {
            z = true;
        }
        this.LLJILJIL = z;
        if (z) {
            C0VAU.LIZ = jSONObject.optLong("max_single_wake_lock_hold_time_second", 120L) * 1000;
            C0VAU.LIZIZ = jSONObject.optInt("max_total_wake_lock_acquire_count", 5);
            C0VAU.LIZJ = jSONObject.optLong("max_total_wake_lock_hold_time_second", 240L) * 1000;
            C0VAU.LIZLLL = jSONObject.optInt("max_wake_up_alarm_invoke_count", 5);
            C0VAU.LJ = jSONObject.optInt("max_normal_alarm_invoke_count", 10);
            jSONObject.optLong("max_single_loc_request_time_second", 120L);
            jSONObject.optInt("max_total_loc_request_count", 5);
            jSONObject.optLong("max_total_loc_request_time_second", 240L);
        }
    }

    @Override // X.C0V1P, X.InterfaceC792700V7s
    public final void LIZLLL(Activity activity) {
        super.LIZLLL(activity);
        C792400V6o.LJIIIIZZ();
        LJIILL();
        Iterator it2 = ((ConcurrentHashMap) this.LLIZLLLIL).values().iterator();
        while (it2.hasNext()) {
            ((C0VAV) it2.next()).LIZLLL();
        }
        this.LLJI = true;
    }

    @Override // X.C0V1P, X.InterfaceC792700V7s
    public final void LJII(Activity activity) {
        super.LJII(activity);
        C792400V6o.LJIIIIZZ();
        LJIILL();
        Iterator it2 = ((ConcurrentHashMap) this.LLIZLLLIL).values().iterator();
        while (it2.hasNext()) {
            ((C0VAV) it2.next()).LJIJ();
        }
        this.LLJI = false;
    }
}
