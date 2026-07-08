package X;

import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844810y6h {
    public static boolean LIZIZ;
    public static final HashMap<String, InterfaceC830890Wid> LIZ = new HashMap<>();
    public static final C0UWA LIZJ = new C0UWA(0);

    public static void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerDecision sceneKey:");
        sbLIZ.append("live_creator_replay_list_preload_v1");
        sbLIZ.append(' ');
        C20441214yg.LIZIZ("LiveCreatorAiStrategyManager", C2188811AlT.LIZIZ(sbLIZ));
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("live_creator_replay_list_preload_v1", C13BV.INSTANCE, null, new AbstractC830880Wic() { // from class: X.0y6g
            @Override // X.AbstractC830880Wic
            public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
                AbstractC1833980xpE abstractC1833980xpE;
                long jLongValue;
                C1844780y6e<?> c1844780y6e;
                if (interfaceC805220ViK.LIZIZ() == EnumC1910390zoT.CelResult) {
                    Object objLIZJ = interfaceC805220ViK.LIZJ();
                    if (!(objLIZJ instanceof Boolean)) {
                        objLIZJ = null;
                    }
                    if (Intrinsics.LJFF(objLIZJ, Boolean.TRUE)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("result Strategy is ");
                        sbLIZ2.append(interfaceC805220ViK.LIZLLL().LIZIZ);
                        C20441214yg.LIZIZ("LiveCreatorAiStrategyManager", C2188811AlT.LIZIZ(sbLIZ2));
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C0UWA c0uwa = C1844810y6h.LIZJ;
                        if (jCurrentTimeMillis - c0uwa.LIZ() > 10000) {
                            c0uwa.LIZIZ(jCurrentTimeMillis);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Trigger preload at ");
                            sbLIZ3.append(jCurrentTimeMillis);
                            C20441214yg.LIZIZ("LiveCreatorAiStrategyManager", C2188811AlT.LIZIZ(sbLIZ3));
                            C1833940xpA c1833940xpA = C1833940xpA.LJ;
                            AbstractC1833980xpE abstractC1833980xpE2 = AbstractC1844760y6c.LIZJ.get("live_replay_list");
                            if ((abstractC1833980xpE2 instanceof AbstractC1833980xpE) && (abstractC1833980xpE = abstractC1833980xpE2) != null) {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                long j = abstractC1833980xpE.LIZIZ;
                                ConcurrentHashMap<String, Long> concurrentHashMap = AbstractC1844760y6c.LIZ;
                                Long l = concurrentHashMap.get("live_replay_list");
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                C1844780y6e<?> c1844780y6e2 = AbstractC1844760y6c.LIZIZ.get("live_replay_list");
                                if ((c1844780y6e2 instanceof C1844780y6e) && (c1844780y6e = c1844780y6e2) != null && jCurrentTimeMillis2 - c1844780y6e.LIZIZ <= c1844780y6e.LIZJ && jCurrentTimeMillis2 - jLongValue < j) {
                                    return;
                                }
                                concurrentHashMap.put("live_replay_list", Long.valueOf(jCurrentTimeMillis2));
                                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1833970xpD(c1833940xpA, abstractC1833980xpE, jCurrentTimeMillis2, null), 3);
                            }
                        }
                    }
                }
            }

            @Override // X.AbstractC830880Wic
            public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("registerSceneResult scene : ");
                sbLIZ2.append(interfaceC830890Wid);
                sbLIZ2.append(", stateCode: ");
                sbLIZ2.append(enumC2213771Bkd);
                C20441214yg.LIZIZ("LiveCreatorAiStrategyManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (interfaceC830890Wid != null && interfaceC830890Wid.getSceneKey() != null) {
                    C1844810y6h.LIZ.put(interfaceC830890Wid.getSceneKey(), interfaceC830890Wid);
                }
            }
        });
    }
}
