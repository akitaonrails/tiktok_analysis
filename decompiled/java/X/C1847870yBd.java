package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxet.vtree.monitor.bean.PageCostTimeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847870yBd {
    public static final ConcurrentHashMap<String, Integer> LIZ = new ConcurrentHashMap<>();
    public static final List<PageCostTimeInfo> LIZIZ = new ArrayList();
    public static boolean LIZJ = true;
    public static volatile boolean LIZLLL;

    public static void LIZJ(String str) throws JSONException {
        int iIntValue;
        InterfaceC1848440yCY interfaceC1848440yCY;
        ConcurrentHashMap<String, Integer> concurrentHashMap = LIZ;
        Integer num = concurrentHashMap.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        concurrentHashMap.put(str, Integer.valueOf(iIntValue + 1));
        if (LIZJ) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("monitor_type", "globalVTreePerf");
            jSONObject.put("full", new JSONObject(concurrentHashMap));
            String strJ3 = C786410Ut5.J3(jSONObject);
            if (strJ3.length() == 0) {
                return;
            }
            if (C1847960yBm.LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleTotalCostTime jsonString: ");
                sbLIZ.append(strJ3);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C1847960yBm c1847960yBm = C1847960yBm.LJII;
            if (c1847960yBm != null && (interfaceC1848440yCY = c1847960yBm.LJ) != null) {
                interfaceC1848440yCY.LIZ(strJ3, "globalVTreePerf");
            }
        }
    }

    public static void LIZ(String str, String str2) {
        try {
            LIZJ(str);
            LIZIZ(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (C1847960yBm.LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addBuildCostTime ex: ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        LIZJ = !LIZJ;
    }

    public static void LIZIZ(String str, String str2) throws JSONException {
        InterfaceC1848440yCY interfaceC1848440yCY;
        int iIntValue;
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                PageCostTimeInfo pageCostTimeInfo = (PageCostTimeInfo) it2.next();
                if (Intrinsics.LJFF(pageCostTimeInfo.getPageOid(), str2)) {
                    pageCostTimeInfo.setTotalCount(pageCostTimeInfo.getTotalCount() + 1);
                    Integer num = pageCostTimeInfo.getFull().get(str);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    pageCostTimeInfo.getFull().put(str, Integer.valueOf(iIntValue + 1));
                }
            } else {
                PageCostTimeInfo pageCostTimeInfo2 = new PageCostTimeInfo();
                pageCostTimeInfo2.setPageOid(str2);
                pageCostTimeInfo2.setTotalCount(1);
                pageCostTimeInfo2.getFull().put(str, 1);
                ((ArrayList) LIZIZ).add(pageCostTimeInfo2);
                break;
            }
        }
        if (LIZJ) {
            List<PageCostTimeInfo> list = LIZIZ;
            C08XD.LJIL(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("monitor_type", "rootPageVTreePerf");
            HashMap map = new HashMap();
            for (PageCostTimeInfo pageCostTimeInfo3 : (ArrayList) list) {
                map.put(pageCostTimeInfo3.getPageOid(), pageCostTimeInfo3.getFull());
                if (map.size() >= 10) {
                    break;
                }
            }
            jSONObject.put("full", new JSONObject(map));
            String strJ3 = C786410Ut5.J3(jSONObject);
            if (strJ3.length() == 0) {
                return;
            }
            if (C1847960yBm.LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("handleTopPageCostTime jsonString: ");
                sbLIZ.append(strJ3);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C1847960yBm c1847960yBm = C1847960yBm.LJII;
            if (c1847960yBm != null && (interfaceC1848440yCY = c1847960yBm.LJ) != null) {
                interfaceC1848440yCY.LIZ(strJ3, "rootPageVTreePerf");
            }
        }
    }
}
