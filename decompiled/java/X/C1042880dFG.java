package X;

import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0dFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042880dFG {
    public static SSPResponse.PreConnect LIZJ(n nVar) {
        int iLJIIJJI;
        String strLJIL;
        String strLJIL2;
        Integer numValueOf;
        String strLJIL3;
        k kVar;
        n nVarLJIILIIL = null;
        if (nVar instanceof m) {
            return null;
        }
        SSPResponse.PreConnect preConnect = new SSPResponse.PreConnect();
        k kVarLJJIIZ = nVar.LJJIIZ("level");
        if (kVarLJJIIZ != null) {
            iLJIIJJI = kVarLJJIIZ.LJIIJJI();
        } else {
            iLJIIJJI = 1;
        }
        preConnect.level = iLJIIJJI;
        k kVarLJJIIZ2 = nVar.LJJIIZ("domain");
        if (kVarLJJIIZ2 != null) {
            strLJIL = kVarLJJIIZ2.LJIL();
        } else {
            strLJIL = null;
        }
        preConnect.domain = strLJIL;
        k kVarLJJIIZ3 = nVar.LJJIIZ("protocol");
        if (kVarLJJIIZ3 != null) {
            strLJIL2 = kVarLJJIIZ3.LJIL();
        } else {
            strLJIL2 = null;
        }
        preConnect.protocol = strLJIL2;
        k kVarLJJIIZ4 = nVar.LJJIIZ("source");
        if (kVarLJJIIZ4 != null) {
            numValueOf = Integer.valueOf(kVarLJJIIZ4.LJIIJJI());
        } else {
            numValueOf = null;
        }
        preConnect.source = numValueOf;
        k kVarLJJIIZ5 = nVar.LJJIIZ("custom");
        if (kVarLJJIIZ5 != null && (strLJIL3 = kVarLJJIIZ5.LJIL()) != null && (kVar = GsonProtectorUtils.parse(C1058250de3.LIZJ(), strLJIL3)) != null) {
            nVarLJIILIIL = kVar.LJIILIIL();
        }
        preConnect.custom = nVarLJIILIIL;
        return preConnect;
    }

    public static List LIZLLL(h hVar) {
        Object c098200Yq;
        if (hVar == null || (hVar instanceof m)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<k> it2 = hVar.iterator();
        while (it2.hasNext()) {
            try {
                c098200Yq = it2.next().LJIILIIL();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            n nVar = (n) c098200Yq;
            if (nVar != null) {
                SSPResponse.Rule rule = new SSPResponse.Rule(null, null, null, 7, null);
                rule.name = nVar.LJJIIZ("name").LJIL();
                rule.type = nVar.LJJIIZ("type").LJIL();
                rule.regex = nVar.LJJIIZ("regex").LJIL();
                arrayList.add(rule);
            }
        }
        return arrayList;
    }

    public static SSPResponse.Data LIZ(n nVar, String str) {
        int iLJIIJJI;
        int iLJIIJJI2;
        int iLJIIJJI3;
        SSPResponse.Prefetch prefetch;
        int iLJIIJJI4;
        String strLJIL;
        LinkedHashMap linkedHashMap;
        Integer numValueOf;
        n nVarLJIILIIL;
        String strLJIL2;
        k kVar;
        if (nVar instanceof m) {
            return null;
        }
        SSPResponse.Data data = new SSPResponse.Data();
        if (str == null) {
            str = "";
        }
        data.logID = str;
        k kVarLJJIIZ = nVar.LJJIIZ("validity_period");
        if (kVarLJJIIZ != null) {
            iLJIIJJI = kVarLJJIIZ.LJIIJJI();
        } else {
            iLJIIJJI = 0;
        }
        data.validityPeriod = iLJIIJJI;
        k kVarLJJIIZ2 = nVar.LJJIIZ("match_type");
        if (kVarLJJIIZ2 != null) {
            iLJIIJJI2 = kVarLJJIIZ2.LJIIJJI();
        } else {
            iLJIIJJI2 = 0;
        }
        data.matchType = iLJIIJJI2;
        data.expire = System.currentTimeMillis() + ((long) (data.validityPeriod * LSPassThroughRecordSizeConfig.DEFAULT));
        k kVarLJJIIZ3 = nVar.LJJIIZ("mode");
        if (kVarLJJIIZ3 != null) {
            iLJIIJJI3 = kVarLJJIIZ3.LJIIJJI();
        } else {
            iLJIIJJI3 = -1;
        }
        data.mode = iLJIIJJI3;
        k kVarLJJIIZ4 = nVar.LJJIIZ("prefetch_list");
        if (kVarLJJIIZ4 != null) {
            h hVarLJIIL = kVarLJJIIZ4.LJIIL();
            int size = hVarLJIIL.size();
            SSPResponse.Prefetch[] prefetchArr = new SSPResponse.Prefetch[size];
            for (int i = 0; i < size; i++) {
                n nVarLJIILIIL2 = hVarLJIIL.LJJIIJZLJL(i).LJIILIIL();
                if (nVarLJIILIIL2 instanceof m) {
                    prefetch = new SSPResponse.Prefetch();
                } else {
                    prefetch = new SSPResponse.Prefetch();
                    k kVarLJJIIZ5 = nVarLJIILIIL2.LJJIIZ("level");
                    if (kVarLJJIIZ5 != null) {
                        iLJIIJJI4 = kVarLJJIIZ5.LJIIJJI();
                    } else {
                        iLJIIJJI4 = 1;
                    }
                    prefetch.level = Integer.valueOf(iLJIIJJI4);
                    k kVarLJJIIZ6 = nVarLJIILIIL2.LJJIIZ("url");
                    if (kVarLJJIIZ6 != null) {
                        strLJIL = kVarLJJIIZ6.LJIL();
                    } else {
                        strLJIL = null;
                    }
                    prefetch.url = strLJIL;
                    k kVarLJJIIZ7 = nVarLJIILIIL2.LJJIIZ("reqHeader");
                    if (kVarLJJIIZ7 != null) {
                        n nVarLJIILIIL3 = kVarLJJIIZ7.LJIILIIL();
                        linkedHashMap = new LinkedHashMap();
                        for (String str2 : nVarLJIILIIL3.LJJIJIL()) {
                            linkedHashMap.put(str2, nVarLJIILIIL3.LJJIIZ(str2).LJIL());
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    prefetch.reqHeader = linkedHashMap;
                    k kVarLJJIIZ8 = nVarLJIILIIL2.LJJIIZ("source");
                    if (kVarLJJIIZ8 != null) {
                        numValueOf = Integer.valueOf(kVarLJJIIZ8.LJIIJJI());
                    } else {
                        numValueOf = null;
                    }
                    prefetch.source = numValueOf;
                    k kVarLJJIIZ9 = nVarLJIILIIL2.LJJIIZ("custom");
                    if (kVarLJJIIZ9 != null && (strLJIL2 = kVarLJJIIZ9.LJIL()) != null && (kVar = GsonProtectorUtils.parse(C1058250de3.LIZJ(), strLJIL2)) != null) {
                        nVarLJIILIIL = kVar.LJIILIIL();
                    } else {
                        nVarLJIILIIL = null;
                    }
                    prefetch.custom = nVarLJIILIIL;
                }
                prefetchArr[i] = prefetch;
            }
            data.prefetchList = prefetchArr;
        }
        k kVarLJJIIZ10 = nVar.LJJIIZ("preconnect_list");
        if (kVarLJJIIZ10 != null) {
            h hVarLJIIL2 = kVarLJJIIZ10.LJIIL();
            int size2 = hVarLJIIL2.size();
            SSPResponse.PreConnect[] preConnectArr = new SSPResponse.PreConnect[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                SSPResponse.PreConnect preConnectLIZJ = LIZJ(hVarLJIIL2.LJJIIJZLJL(i2).LJIILIIL());
                if (preConnectLIZJ == null) {
                    preConnectLIZJ = new SSPResponse.PreConnect();
                }
                preConnectArr[i2] = preConnectLIZJ;
            }
            data.preConnectList = preConnectArr;
        }
        k kVarLJJIIZ11 = nVar.LJJIIZ("subpage_preconnect_list");
        if (kVarLJJIIZ11 != null) {
            h hVarLJIIL3 = kVarLJJIIZ11.LJIIL();
            int size3 = hVarLJIIL3.size();
            SSPResponse.PreConnect[] preConnectArr2 = new SSPResponse.PreConnect[size3];
            for (int i3 = 0; i3 < size3; i3++) {
                SSPResponse.PreConnect preConnectLIZJ2 = LIZJ(hVarLJIIL3.LJJIIJZLJL(i3).LJIILIIL());
                if (preConnectLIZJ2 == null) {
                    preConnectLIZJ2 = new SSPResponse.PreConnect();
                }
                preConnectArr2[i3] = preConnectLIZJ2;
            }
            data.subpagePreConnectList = preConnectArr2;
        }
        return data;
    }

    public static void LJ(SSPResponse sSPResponse, n nVar) {
        h hVarLJIIL;
        if (nVar != null && !(nVar instanceof m)) {
            try {
                for (String str : nVar.LJJIJIL()) {
                    if (sSPResponse.LJ == null) {
                        sSPResponse.LJ = new LinkedHashMap();
                    }
                    Map<String, List<SSPResponse.Rule>> map = sSPResponse.LJ;
                    if (map != null) {
                        try {
                            k kVarLJJIIZ = nVar.LJJIIZ(str);
                            if (kVarLJJIIZ != null) {
                                hVarLJIIL = kVarLJJIIZ.LJIIL();
                            } else {
                                hVarLJIIL = null;
                            }
                            List<SSPResponse.Rule> listLIZLLL = LIZLLL(hVarLJIIL);
                            if (listLIZLLL == null) {
                                listLIZLLL = C13BV.INSTANCE;
                            }
                            map.put(str, listLIZLLL);
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                sSPResponse.LJI = th2.getMessage();
            }
        }
    }

    public static void LIZIZ(SSPResponse sSPResponse, n nVar, String str) {
        if (nVar != null && !(nVar instanceof m)) {
            try {
                for (String str2 : nVar.LJJIJIL()) {
                    if (sSPResponse.LIZLLL == null) {
                        sSPResponse.LIZLLL = new LinkedHashMap();
                    }
                    Map<String, SSPResponse.Data> map = sSPResponse.LIZLLL;
                    if (map != null) {
                        map.put(str2, LIZ(nVar.LJJIIZ(str2).LJIILIIL(), str));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                sSPResponse.LJI = th.getMessage();
            }
        }
    }
}
