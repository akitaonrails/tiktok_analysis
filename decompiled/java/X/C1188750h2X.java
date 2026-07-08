package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.RouteManager;
import com.bytedance.router.saf.SAFNavigationRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiSlashPreload;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0h2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188750h2X {
    public static volatile boolean LJFF;
    public static final C1188750h2X LIZ = new C1188750h2X();
    public static final ConcurrentHashSet<String> LIZIZ = new ConcurrentHashSet<>();
    public static final ConcurrentHashMap<String, C09AE> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C09AE> LIZLLL = new ConcurrentHashMap<>();
    public static final C054G LJ = C2296808zG.LIZIZ();
    public static final C1188810h2d LJI = new C1188810h2d();
    public static final C1183630guH<String, C1183620guG> LJII = new C1183630guH<>(4);
    public static final C1183630guH<String, C1183560guA> LJIIIIZZ = new C1183630guH<>(4);

    public static void LJ() {
        if ((C1183580guC.LIZ() || C0BMZ.LIZ()) && !LJFF) {
            LJFF = true;
            RouteManager.getInstance().addGlobalResultCallback(new AbsOpenResultCallback() { // from class: X.0h2c
                @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
                public final void onOpen(Intent intent) {
                    C1951107kb.LIZIZ(this, intent);
                    if (intent != null) {
                        C1188750h2X.LIZ.getClass();
                        C1188750h2X.LJIIIIZZ(intent, false);
                    }
                }
            });
            C1074030e3V.LJ.add(new InterfaceC1074040e3W() { // from class: X.0h2b
                @Override // X.InterfaceC1074040e3W
                public final void onOpen(Intent intent) {
                    C1188750h2X.LIZ.getClass();
                    C1188750h2X.LJIIIIZZ(intent, true);
                }
            });
            SAFNavigationRoute.Companion.addRouteStartListeners(C1209050hZH.get$arr$(2));
        }
    }

    public static void LIZ(Aweme aweme) {
        String aid;
        ConcurrentHashMap<String, C09AE> concurrentHashMap;
        C09AE c09ae;
        if (C280270Ayf.LIZ() && (aid = aweme.getAid()) != null && (c09ae = (concurrentHashMap = LIZJ).get(aid)) != null) {
            c09ae.LIZIZ(null);
            concurrentHashMap.remove(aid);
        }
    }

    public static boolean LIZIZ(String str) {
        if (!C123100dR.LIZ(str) || !LIZIZ.contains(str) || str == null) {
            return false;
        }
        LIZIZ.remove(str);
        return true;
    }

    public static void LIZJ(Intent intent) {
        Bundle extras;
        C1188840h2g.LIZ();
        intent.putExtra("EXTRA_PRELOAD_PAGE_START_TIME", SystemClock.elapsedRealtime());
        C20152913tH.LIZLLL.getClass();
        C20152113t9 c20152113t9LIZIZ = C20153113tJ.LIZIZ();
        if (c20152113t9LIZIZ != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            c20152113t9LIZIZ.LIZLLL(extras, PoiSlashPreload.class);
        }
    }

    public static void LIZLLL(Aweme aweme) {
        String aid;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (C123100dR.LIZ(aid) && aid != null) {
            ConcurrentHashMap<String, C09AE> concurrentHashMap = LIZLLL;
            C09AE c09ae = concurrentHashMap.get(aid);
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            concurrentHashMap.remove(aid);
        }
    }

    public static void LJFF(Aweme aweme, String str) {
        String aid = aweme.getAid();
        if (C123100dR.LIZ(aid) && aid != null) {
            LIZIZ.add(aid);
        }
        C1188460h24.LIZ.getClass();
        C1188440h22 c1188440h22LJ = C1188460h24.LJ(aweme, "preload", null);
        if (c1188440h22LJ == null) {
            return;
        }
        Intent intent = new Intent();
        String poiId = c1188440h22LJ.getPoiId();
        if (poiId == null) {
            poiId = "";
        }
        intent.putExtra("poi_id", poiId);
        intent.putExtra("from_group_id", aweme.getAid());
        intent.putExtra("enter_from", str);
        intent.putExtra("preload_flag", "anchor_show_preload");
        C01GW c01gw = C0AQH.LIZ;
        long jLongValue = 20000;
        if (((Number) c01gw.getValue()).longValue() > 20000) {
            jLongValue = ((Number) c01gw.getValue()).longValue();
        }
        intent.putExtra("timeout", jLongValue);
        intent.putExtra("strategy_id", 0);
        intent.putExtra("preload_request_extra_params", c1188440h22LJ.getPoiRequestExtraParams());
        LIZJ(intent);
    }

    public static void LJIIIIZZ(Intent intent, boolean z) {
        String strValueOf;
        if (!C297190Bkr.LIZ()) {
            return;
        }
        if (z) {
            strValueOf = intent.getDataString();
        } else {
            strValueOf = String.valueOf(intent.getData());
        }
        if (strValueOf != null) {
            if (a0.LJJIIZI(strValueOf, "aweme://poi/detail", false) || a0.LJJIIZI(strValueOf, "aweme://slash/poi/detail", false)) {
                LIZJ(intent);
            }
        }
    }

    public static void LJI(Aweme aweme, String str, String str2) {
        boolean zLJI = MethodIDManager.LJI(72026);
        C1188460h24.LIZ.getClass();
        C1188440h22 c1188440h22LJ = C1188460h24.LJ(aweme, "preload", null);
        if (c1188440h22LJ == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        Intent intent = new Intent();
        String poiId = c1188440h22LJ.getPoiId();
        if (poiId == null) {
            poiId = "";
        }
        intent.putExtra("poi_id", poiId);
        intent.putExtra("from_group_id", aweme.getAid());
        intent.putExtra("enter_from", str);
        intent.putExtra("preload_flag", str2);
        C01GW c01gw = C0AQH.LIZ;
        long jLongValue = 20000;
        if (((Number) c01gw.getValue()).longValue() > 20000) {
            jLongValue = ((Number) c01gw.getValue()).longValue();
        }
        intent.putExtra("timeout", jLongValue);
        intent.putExtra("strategy_id", 0);
        intent.putExtra("preload_request_extra_params", c1188440h22LJ.getPoiRequestExtraParams());
        LIZJ(intent);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static Object LJII(Aweme aweme, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str2;
        C1185690gxb c1185690gxbLIZJ;
        boolean zLIZIZ;
        String aid = aweme.getAid();
        String str3 = null;
        if (!C123100dR.LIZ(aid)) {
            aid = null;
        }
        if (aid != null) {
            Boolean.valueOf(LIZIZ.add(aid));
        }
        PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
        if (poiDataStruct != null) {
            str3 = poiDataStruct.poiId;
        }
        if (str3 == null) {
            str2 = "";
        } else {
            str2 = str3;
        }
        C1185510gxJ c1185510gxJ = (C1185510gxJ) C1185470gxF.LIZ.getValue();
        synchronized (c1185510gxJ) {
            try {
                c1185690gxbLIZJ = c1185510gxJ.LIZIZ.LIZJ(str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c1185690gxbLIZJ == null) {
            zLIZIZ = false;
        } else {
            zLIZIZ = c1185510gxJ.LIZIZ(c1185690gxbLIZJ.LIZ);
        }
        if (zLIZIZ) {
            return Unit.LIZ;
        }
        Bundle bundle = new Bundle();
        if (str3 == null) {
            str3 = "";
        }
        C786410Ut5.LJJJI("poi_id", str3, bundle);
        C786410Ut5.LJJJI("from_group_id", aweme.getAid(), bundle);
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("preload_flag", "anchor_show_preload", bundle);
        C01GW c01gw = C0AQH.LIZ;
        long jLongValue = 20000;
        if (((Number) c01gw.getValue()).longValue() > 20000) {
            jLongValue = ((Number) c01gw.getValue()).longValue();
        }
        bundle.putLong("timeout", jLongValue);
        bundle.putInt("strategy_id", 0);
        Object objLIZ = C1183850gud.LIZ.LIZ(bundle, interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
