package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS232S0300000_23;

/* JADX INFO: renamed from: X.0owF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492370owF extends AbstractC1492360owE {
    public final InterfaceC1492410owJ LJIIIIZZ;

    @Override // X.AbstractC1492360owE
    public final void LIZLLL() {
        super.LIZLLL();
        this.LJIIIIZZ.LIZ();
        if (C1486510omn.LIZIZ()) {
            C0VG4.LIZIZ.LIZ();
        }
    }

    @Override // X.AbstractC1492360owE
    public final void LJ() {
        super.LJ();
        if (C1486510omn.LIZIZ()) {
            C0VG4.LIZIZ.LIZIZ();
        }
    }

    public C1492370owF(C1492460owO c1492460owO) {
        this.LJIIIIZZ = c1492460owO;
    }

    @Override // X.AbstractC1492360owE
    public final void LIZ(C2344009Gk c2344009Gk) {
        c2344009Gk.LIZLLL(this.LIZIZ, "feed_start");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - this.LIZIZ, "timing_res_feed");
        Long l = this.LIZJ;
        if (l != null) {
            c2344009Gk.LIZLLL(l.longValue() - this.LIZIZ, "timing_no_network");
        }
    }

    @Override // X.AbstractC1492360owE
    public final void LIZJ(EnumC1492290ow7 enumC1492290ow7, HashMap<String, HashMap<String, Object>> map) {
        Unit unit;
        try {
            if (!map.containsKey("extra_info")) {
                map.put("extra_info", new HashMap<>());
            }
            HashMap<String, Object> map2 = map.get("extra_info");
            if (map2 != null) {
                map2.put("start_time", Long.valueOf(this.LIZIZ));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (enumC1492290ow7 != EnumC1492290ow7.NETWORK_GOOD && enumC1492290ow7 != EnumC1492290ow7.UNKNOWN_STATUS) {
            this.LJIIIIZZ.LIZIZ(this, enumC1492290ow7, map);
            return;
        }
        C11NZ.LJLJJLL(10000L, TimeUnit.MILLISECONDS).LIZIZ(new C1436920nUo(new C1436780nUa(), new AwS232S0300000_23(this, (C1492370owF) enumC1492290ow7, (EnumC1492290ow7) map, (HashMap<String, HashMap<String, Object>>) 6)));
    }
}
