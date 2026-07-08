package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.network.observer.bean.DetectorParam;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0owE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1492360owE implements InterfaceC1492480owQ {
    public Long LIZJ;
    public C1492390owH LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public long LIZ = -1;
    public long LIZIZ = -1;
    public final C1492380owG LJI = new C1492380owG(this);
    public final C584860Mwm LJII = new C584860Mwm(this);

    public abstract void LIZ(C2344009Gk c2344009Gk);

    public abstract void LIZJ(EnumC1492290ow7 enumC1492290ow7, HashMap<String, HashMap<String, Object>> map);

    @Override // X.InterfaceC1492480owQ
    public final void destroy() {
        try {
            this.LJ = true;
            this.LJFF = true;
            ConcurrentHashMap<Long, C1436780nUa> concurrentHashMap = C1492260ow4.LIZ;
            C1492260ow4.LIZIZ(this.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final long LIZIZ() {
        DetectorParam detectorParam;
        ConcurrentHashMap<Long, C1436780nUa> concurrentHashMap = C1492260ow4.LIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            detectorParam = (DetectorParam) SettingsManager.LJII("network_monitor_config", DetectorParam.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (detectorParam == null) {
            detectorParam = new DetectorParam(new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"});
        }
        return C1492260ow4.LIZ(detectorParam, new C1492280ow6(C1514430pVp.LIZIZ(), C1514430pVp.LIZJ()), this.LJI, this.LJII);
    }

    public void LIZLLL() {
        Unit unit;
        try {
            C1492390owH c1492390owH = this.LIZLLL;
            if (c1492390owH != null) {
                if (c1492390owH.LIZ == EnumC1492290ow7.NO_NETWORK) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJ(c1492390owH.LIZIZ, "network_status_detail");
                    LIZ(c2344009Gk);
                    C20684815ws.LJIILLIIL("network_observe_false_alert", c2344009Gk.LIZ);
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        destroy();
    }

    public void LJ() {
        try {
            this.LIZIZ = System.currentTimeMillis();
            this.LIZ = LIZIZ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
