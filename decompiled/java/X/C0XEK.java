package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0XEK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XEK implements InterfaceC2259901Dcq {
    public static final C0XEK LIZ = new C0XEK();

    @Override // X.InterfaceC2259901Dcq
    public final boolean LIZ() {
        if (!C0XEL.LIZ().open) {
            return false;
        }
        C1510170pOx c1510170pOx = C1510170pOx.LIZ;
        float f = C0XEL.LIZ().diskCacheMonitorRate;
        c1510170pOx.getClass();
        return C1510170pOx.LIZJ(f);
    }

    @Override // X.InterfaceC2259901Dcq
    public final boolean LIZIZ() {
        if (!C0XEL.LIZ().open) {
            return false;
        }
        C1510170pOx c1510170pOx = C1510170pOx.LIZ;
        float f = C0XEL.LIZ().memoryCacheMonitorRate;
        c1510170pOx.getClass();
        return C1510170pOx.LIZJ(f);
    }

    @Override // X.InterfaceC2259901Dcq
    public final boolean LIZJ() {
        if (!C0XEL.LIZ().open) {
            return false;
        }
        C1510170pOx c1510170pOx = C1510170pOx.LIZ;
        float f = C0XEL.LIZ().registerMonitorRate;
        c1510170pOx.getClass();
        return C1510170pOx.LIZJ(f);
    }

    @Override // X.InterfaceC2259901Dcq
    public final void LIZLLL(Map map) {
        C2241008qG c2241008qG = new C2241008qG();
        C2241008qG c2241008qG2 = new C2241008qG();
        c2241008qG.LIZLLL("register_timing", "init_feature_set");
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            c2241008qG2.LIZJ((Long) entry.getValue(), (String) entry.getKey());
        }
        C793770VBv.LJII("ttm_feature_register_monitor", c2241008qG.LJ(), c2241008qG2.LJ(), null);
    }

    @Override // X.InterfaceC2259901Dcq
    public final void LJ(Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        for (Map.Entry entry : map.entrySet()) {
            c2344009Gk.LJ(entry.getValue(), (String) entry.getKey());
        }
        C20684815ws.LJIILLIIL("ttm_feature_monitor", c2344009Gk.LIZ);
    }
}
