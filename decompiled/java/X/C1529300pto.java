package X;

import com.bytedance.lynx.hybrid.info.model.DomainInfo;
import com.bytedance.lynx.hybrid.info.model.HybridInfo;
import com.bytedance.lynx.hybrid.info.model.ResourceInfo;
import com.bytedance.lynx.hybrid.info.model.TemplateInfo;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529300pto {
    public static HybridInfo LIZ(n nVar) throws JSONException {
        String strLJIL;
        String strLJIL2;
        String strLJIL3;
        int iLJIIJJI;
        TemplateInfo templateInfo;
        Object c098200Yq;
        double dOptDouble;
        String strLJIL4;
        n nVarLJIILIIL;
        n nVarLJIILIIL2;
        Object domainInfo;
        int iLJIIJJI2;
        Object c098200Yq2;
        n nVarLJIILIIL3;
        n nVarLJIILIIL4;
        Object c098200Yq3;
        Object obj = null;
        if (nVar instanceof m) {
            return null;
        }
        n nVarLJJIJ = nVar.LJJIJ("page_info");
        k kVarLJJIIZ = nVarLJJIJ.LJJIIZ("url");
        String str = "";
        if (kVarLJJIIZ == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
            strLJIL = "";
        }
        k kVarLJJIIZ2 = nVarLJJIJ.LJJIIZ("oid");
        if (kVarLJJIIZ2 == null || (strLJIL2 = kVarLJJIIZ2.LJIL()) == null) {
            strLJIL2 = "";
        }
        k kVarLJJIIZ3 = nVarLJJIJ.LJJIIZ("engine_type");
        if (kVarLJJIIZ3 == null || (strLJIL3 = kVarLJJIIZ3.LJIL()) == null) {
            strLJIL3 = "";
        }
        k kVarLJJIIZ4 = nVarLJJIJ.LJJIIZ("validity_period");
        if (kVarLJJIIZ4 != null) {
            iLJIIJJI = kVarLJJIIZ4.LJIIJJI();
        } else {
            iLJIIJJI = 604800;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        k kVarLJJIIZ5 = nVarLJJIJ.LJJIIZ("resource_infos");
        if (kVarLJJIIZ5 != null && (nVarLJIILIIL3 = kVarLJJIIZ5.LJIILIIL()) != null) {
            for (Map.Entry<String, k> entry : nVarLJIILIIL3.entrySet()) {
                String key = entry.getKey();
                k value = entry.getValue();
                if (value != null) {
                    nVarLJIILIIL4 = value.LJIILIIL();
                } else {
                    nVarLJIILIIL4 = null;
                }
                try {
                    c098200Yq3 = LIZIZ(nVarLJIILIIL4);
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq3 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq3) && c098200Yq3 != null) {
                    linkedHashMap.put(key, c098200Yq3);
                }
            }
        }
        k kVarLJJIIZ6 = nVarLJJIJ.LJJIIZ("template_info");
        if (kVarLJJIIZ6 != null && (!Intrinsics.LJFF(kVarLJJIIZ6, m.LL))) {
            try {
                c098200Yq2 = (TemplateInfo) C1058250de3.LIZIZ().LIZJ(kVarLJJIIZ6, TemplateInfo.class);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            templateInfo = (TemplateInfo) c098200Yq2;
        } else {
            templateInfo = null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        k kVarLJJIIZ7 = nVarLJJIJ.LJJIIZ("domain_infos");
        if (kVarLJJIIZ7 != null && (nVarLJIILIIL = kVarLJJIIZ7.LJIILIIL()) != null) {
            for (Map.Entry<String, k> entry2 : nVarLJIILIIL.entrySet()) {
                String key2 = entry2.getKey();
                k value2 = entry2.getValue();
                if (value2 != null) {
                    nVarLJIILIIL2 = value2.LJIILIIL();
                } else {
                    nVarLJIILIIL2 = null;
                }
                if (nVarLJIILIIL2 == null) {
                    domainInfo = null;
                } else {
                    try {
                        k kVarLJJIIZ8 = nVarLJIILIIL2.LJJIIZ("source");
                        if (kVarLJJIIZ8 != null) {
                            iLJIIJJI2 = kVarLJJIIZ8.LJIIJJI();
                        } else {
                            iLJIIJJI2 = -1;
                        }
                        domainInfo = new DomainInfo(iLJIIJJI2);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        domainInfo = new C098200Yq(th3);
                        C189200o6.m2constructorimpl(domainInfo);
                    }
                }
                C189200o6.m2constructorimpl(domainInfo);
                if (!C189200o6.m7isFailureimpl(domainInfo) && domainInfo != null) {
                    linkedHashMap2.put(key2, domainInfo);
                }
            }
        }
        try {
            k kVarLJJIIZ9 = nVar.LJJIIZ("extra");
            if (kVarLJJIIZ9 != null && (strLJIL4 = kVarLJJIIZ9.LJIL()) != null) {
                str = strLJIL4;
            }
            c098200Yq = new JSONObject(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            dOptDouble = jSONObject.optDouble("entrance_rate", 0.0d);
        } else {
            dOptDouble = 0.0d;
        }
        HybridInfo hybridInfo = new HybridInfo(strLJIL2, strLJIL, strLJIL3, iLJIIJJI, linkedHashMap, linkedHashMap2, templateInfo, dOptDouble);
        C1529150ptZ.LIZJ(strLJIL2, hybridInfo);
        return hybridInfo;
    }

    public static ResourceInfo LIZIZ(n nVar) {
        int iLJIIJJI;
        LinkedHashMap linkedHashMap;
        String strLJIL;
        String strLJIL2;
        String strLJIL3;
        boolean zLJ;
        String strLJIL4 = null;
        if (nVar == null) {
            return null;
        }
        k kVarLJJIIZ = nVar.LJJIIZ("source");
        int iLJIIJJI2 = -1;
        if (kVarLJJIIZ != null) {
            iLJIIJJI = kVarLJJIIZ.LJIIJJI();
        } else {
            iLJIIJJI = -1;
        }
        k kVarLJJIIZ2 = nVar.LJJIIZ("type");
        if (kVarLJJIIZ2 != null) {
            iLJIIJJI2 = kVarLJJIIZ2.LJIIJJI();
        }
        k kVarLJJIIZ3 = nVar.LJJIIZ("req_header");
        if (kVarLJJIIZ3 != null) {
            n nVarLJIILIIL = kVarLJJIIZ3.LJIILIIL();
            linkedHashMap = new LinkedHashMap();
            for (String str : nVarLJIILIIL.LJJIJIL()) {
                linkedHashMap.put(str, nVarLJIILIIL.LJJIIZ(str).LJIL());
            }
        } else {
            linkedHashMap = null;
        }
        k kVarLJJIIZ4 = nVar.LJJIIZ("access_key");
        if (kVarLJJIIZ4 != null) {
            strLJIL = kVarLJJIIZ4.LJIL();
        } else {
            strLJIL = null;
        }
        k kVarLJJIIZ5 = nVar.LJJIIZ("channel_name");
        if (kVarLJJIIZ5 != null) {
            strLJIL2 = kVarLJJIIZ5.LJIL();
        } else {
            strLJIL2 = null;
        }
        k kVarLJJIIZ6 = nVar.LJJIIZ("bundle");
        if (kVarLJJIIZ6 != null) {
            strLJIL3 = kVarLJJIIZ6.LJIL();
        } else {
            strLJIL3 = null;
        }
        k kVarLJJIIZ7 = nVar.LJJIIZ(Scene.SCENE_SERVICE);
        if (kVarLJJIIZ7 != null) {
            strLJIL4 = kVarLJJIIZ7.LJIL();
        }
        k kVarLJJIIZ8 = nVar.LJJIIZ("is_mainframe");
        if (kVarLJJIIZ8 != null) {
            zLJ = kVarLJJIIZ8.LJ();
        } else {
            zLJ = false;
        }
        return new ResourceInfo(iLJIIJJI, iLJIIJJI2, linkedHashMap, strLJIL, strLJIL2, strLJIL3, strLJIL4, zLJ);
    }
}
