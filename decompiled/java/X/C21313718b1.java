package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughEnableCommonParamsConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughParamGuardExp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18b1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21313718b1 {
    public static final C21313718b1 LIZ = new C21313718b1();

    public static JSONObject LIZJ(JSONObject jSONObject) {
        if (!LSPassThroughParamGuardExp.INSTANCE.hitExperiment()) {
            return jSONObject;
        }
        C21313818b2.LIZ.getClass();
        Set<String> set = C21313818b2.LJI;
        if (set.isEmpty()) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (set.contains(next)) {
                C2365509Or.LIZLLL(jSONObject2, next, jSONObject.opt(next));
            } else {
                C21314018b4.LIZ.getClass();
                C21314018b4.LJI(next, "append");
            }
        }
        return jSONObject2;
    }

    public static List LIZLLL(List list) {
        if (!LSPassThroughParamGuardExp.INSTANCE.hitExperiment()) {
            return list;
        }
        C21313818b2.LIZ.getClass();
        Set<String> set = C21313818b2.LJI;
        if (set.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = (String) obj;
            if (set.contains(str)) {
                arrayList.add(obj);
            } else {
                C21314018b4.LIZ.getClass();
                C21314018b4.LJI(str, "get");
            }
        }
        return arrayList;
    }

    public static Map LIZ(PageFinder pageFinder, String str, Map map) {
        boolean z;
        if (LSPassThroughEnableCommonParamsConfig.INSTANCE.enable()) {
            if (Intrinsics.LJFF(str, "show_product_shelf")) {
                C20684815ws.LJIILLIIL("ttls_rd_passthrough_show_product_shelf", map);
            }
            String strLIZ = C21313518az.LIZ(C21313518az.LIZ, pageFinder, map, null, str, 4);
            C21313818b2 c21313818b2 = C21313818b2.LIZ;
            boolean z2 = true;
            if (c21313818b2.LIZJ(strLIZ) != null) {
                z = true;
            } else {
                z = false;
            }
            if (c21313818b2.LJFF(str) == null) {
                z2 = false;
            }
            if (z || z2) {
                ((HashMap) map).put("local_service_pass_through_uuid", C21313518az.LIZLLL(pageFinder));
            }
            return null;
        }
        if (C21313818b2.LIZ.LJFF(str) == null) {
            return null;
        }
        C21313518az.LIZ.getClass();
        return C2097908Jt.LIZJ(new Pair("local_service_pass_through_uuid", C21313518az.LIZLLL(pageFinder)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(com.bytedance.android.btm.api.model.PageFinder r6, java.util.List r7, java.lang.String r8) {
        /*
            r2 = 0
            r1 = 1
            if (r7 == 0) goto Lc
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Exception -> L52
            if (r0 != 0) goto Lc
            r0 = 0
            goto Ld
        Lc:
            r0 = 1
        Ld:
            if (r0 == 0) goto L15
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L52
            r0.<init>()     // Catch: java.lang.Exception -> L52
            return r0
        L15:
            java.util.List r5 = LIZLLL(r7)     // Catch: java.lang.Exception -> L52
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Exception -> L52
            if (r0 == 0) goto L25
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L52
            r0.<init>()     // Catch: java.lang.Exception -> L52
            return r0
        L25:
            if (r8 == 0) goto L30
            java.lang.String[] r0 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L52
            r0[r2] = r8     // Catch: java.lang.Exception -> L52
            java.util.List r4 = X.C1697810uHb.LJIILJJIL(r0)     // Catch: java.lang.Exception -> L52
            goto L35
        L30:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L52
            r4.<init>()     // Catch: java.lang.Exception -> L52
        L35:
            com.bytedance.android.btm.api.BtmSDK r3 = com.bytedance.android.btm.api.BtmSDK.INSTANCE     // Catch: java.lang.Exception -> L52
            r3.getBtmPageInfoV2(r6)     // Catch: java.lang.Exception -> L52
            X.18Bt r2 = new X.18Bt     // Catch: java.lang.Exception -> L52
            r2.<init>()     // Catch: java.lang.Exception -> L52
            r2.LIZIZ = r6     // Catch: java.lang.Exception -> L52
            r1 = 20
            r0 = 0
            X.18C6 r1 = r3.getBcmChainByBtmModel(r2, r1, r0)     // Catch: java.lang.Exception -> L52
            X.18az r0 = X.C21313518az.LIZ     // Catch: java.lang.Exception -> L52
            r0.getClass()     // Catch: java.lang.Exception -> L52
            java.util.Map r0 = X.C21313518az.LJII(r1, r5, r4)     // Catch: java.lang.Exception -> L52
            return r0
        L52:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0hTX r1 = X.C1205490hTX.LIZ
            X.18bH r0 = X.EnumC21315318bH.PT_GET_VALUE_ERROR
            r1.LJ(r0, r2)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21313718b1.LIZIZ(com.bytedance.android.btm.api.model.PageFinder, java.util.List, java.lang.String):java.util.Map");
    }
}
