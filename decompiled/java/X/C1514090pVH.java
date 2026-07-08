package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0pVH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514090pVH {
    public static boolean LIZIZ;
    public static int LIZLLL;
    public static InterfaceC830890Wid LJ;
    public static final C01GW LJIIIZ;
    public static Float LJIIJ;
    public static Float LJIIJJI;
    public static Float LJIIL;
    public static final C1514090pVH LIZ = new C1514090pVH();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1514080pVG());
    public static final String LJFF = "feed_load_more";
    public static final String LJI = "feed_load_more_rule_strategy";
    public static final String LJII = "feed_load_more_smart_strategy";
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1510510pPV());

    static {
        if (!C0COD.LIZ() && ((Boolean) C1514130pVL.LIZ.getValue()).booleanValue()) {
            if (TTMStrategyCenterManager.isInit()) {
                TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("feed_load_more", new ArrayList(), null, new C1514110pVJ());
            } else {
                TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new C1514100pVI());
            }
        }
        LJIIIZ = C452501pT.LIZIZ(new C1514120pVK());
    }

    public static void LIZ() {
        if (LIZIZ) {
            return;
        }
        LJFF("checkAndEnsureEvaluatorAvailable");
        LIZIZ = true;
        if (LJIIIIZZ.getValue() != null) {
            C1511690pRP.LIZJ(0L, new Runnable() { // from class: X.0pUa
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FeedLoadMoreMLExpV2Helper@fa9d.checkAndEnsureEvaluatorAvailable$1");
                    try {
                        C1514090pVH.LIZ.getClass();
                        AbstractC1511510pR7 abstractC1511510pR7 = (AbstractC1511510pR7) C1514090pVH.LJIIIIZZ.getValue();
                        if (abstractC1511510pR7 != null) {
                            abstractC1511510pR7.preloadEnv();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FeedLoadMoreMLExpV2Helper@fa9d.checkAndEnsureEvaluatorAvailable$1");
                }
            });
        }
        if (C0COD.LIZ() && ((Boolean) C1514130pVL.LIZ.getValue()).booleanValue()) {
            if (TTMStrategyCenterManager.isInit()) {
                TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(LJFF, new ArrayList(), null, new C1514110pVJ());
            } else {
                TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new C1514100pVI());
            }
        }
    }

    public static Float LIZIZ() {
        if (LJIIJ == null) {
            LJIIJ = Float.valueOf(LJ().getFloat("value_feed_ml_v2", 4.0f));
        }
        return LJIIJ;
    }

    public static Float LIZJ() {
        if (LJIIL == null) {
            LJIIL = Float.valueOf(LJ().getFloat("value_feed_initfetch_ml_v2", 4.0f));
        }
        return LJIIL;
    }

    public static Float LIZLLL() {
        if (LJIIJJI == null) {
            LJIIJJI = Float.valueOf(LJ().getFloat("value_feed_loadmore_ml_v2", 4.0f));
        }
        return LJIIJJI;
    }

    public static Keva LJ() {
        return (Keva) LJIIIZ.getValue();
    }

    public static void LJFF(String str) {
        ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJJIIZI();
    }
}
