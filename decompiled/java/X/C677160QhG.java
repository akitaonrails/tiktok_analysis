package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.player.PlayerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.player.IPlayerDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0QhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677160QhG {
    public static final C677160QhG LIZ = new C677160QhG();
    public static final ConcurrentHashMap<String, C0IS1<C0IR0>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC1479620obg>> LIZJ = new ConcurrentHashMap<>();

    public static void LIZ(List list) {
        InterfaceC676420Qg4 interfaceC676420Qg4;
        IECommerceHostService iECommerceHostService;
        boolean z;
        if (list != null && !list.isEmpty()) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MediaStrategyManager appendPlayList ");
            sbLIZ.append("mall_home_scene");
            sbLIZ.append(" awemeStrList=");
            sbLIZ.append(list.size());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC1479620obg>> concurrentHashMap = LIZJ;
            if (concurrentHashMap.get("mall_home_scene") == null) {
                concurrentHashMap.put("mall_home_scene", new CopyOnWriteArrayList<>());
            }
            CopyOnWriteArrayList copyOnWriteArrayList = concurrentHashMap.get("mall_home_scene");
            if (copyOnWriteArrayList != null) {
                LIZ.getClass();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    LIZ.getClass();
                    InterfaceC1479620obg iPlayRequest = null;
                    String name = null;
                    iPlayRequest = null;
                    iPlayRequest = null;
                    if (str != null) {
                        try {
                            C1227904rF.LIZ.getClass();
                            Aweme aweme = (Aweme) C1227904rF.LIZLLL().LJII(str, Aweme.class);
                            if (aweme != null) {
                                LIZ.getClass();
                                if (C034S.LIZ()) {
                                    C1120604Zw.LIZ.LIZ();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    IPlayerDependencyService iPlayerDependencyServiceCreateIPlayerDependencyServicebyMonsterPlugin = PlayerDependencyService.createIPlayerDependencyServicebyMonsterPlugin(false);
                                    if (iPlayerDependencyServiceCreateIPlayerDependencyServicebyMonsterPlugin != null) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    String name2 = IPlayerDependencyService.class.getName();
                                    if (iPlayerDependencyServiceCreateIPlayerDependencyServicebyMonsterPlugin != null) {
                                        name = iPlayerDependencyServiceCreateIPlayerDependencyServicebyMonsterPlugin.getClass().getName();
                                    }
                                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                                    iECommerceHostService = iPlayerDependencyServiceCreateIPlayerDependencyServicebyMonsterPlugin;
                                } else {
                                    C1120604Zw.LIZ.LIZ();
                                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPlayerDependencyService.class);
                                }
                                iPlayRequest = ((IPlayerDependencyService) iECommerceHostService).toIPlayRequest(aweme);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                            String message = th.getMessage();
                            c2341109Fh2.getClass();
                            C2341109Fh.LIZ(message);
                        }
                    }
                    arrayList.add(iPlayRequest);
                }
                copyOnWriteArrayList.addAll(arrayList);
                C0IS1<C0IR0> c0is1 = LIZIZ.get("mall_home_scene");
                if (c0is1 != null && (interfaceC676420Qg4 = (InterfaceC676420Qg4) c0is1.LIZLLL()) != null) {
                    interfaceC676420Qg4.LJIIIIZZ("mall_home_scene", copyOnWriteArrayList);
                }
            }
        }
    }

    public static void LIZIZ(List list) {
        Integer numValueOf;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaStrategyManager refreshPlayList ");
        sbLIZ.append("mall_home_scene");
        sbLIZ.append(" awemeStrList=");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        LIZJ.remove("mall_home_scene");
        LIZ(list);
    }
}
