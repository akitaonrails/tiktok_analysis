package X;

import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.info.model.ColdBootInfo;
import com.bytedance.lynx.hybrid.info.model.HybridInfo;
import com.bytedance.lynx.hybrid.info.model.HybridInfoColdBootResponse;
import com.bytedance.lynx.hybrid.info.net.NetworkAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.SoftReference;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ptZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529150ptZ {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1529170ptb());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1529180ptc());
    public static SoftReference<ColdBootInfo> LIZJ;

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static ColdBootInfo LIZ() {
        Object c098200Yq;
        ColdBootInfo coldBootInfo;
        if (!LIZIZ().contains("cb_info")) {
            return null;
        }
        SoftReference<ColdBootInfo> softReference = LIZJ;
        if (softReference != null && (coldBootInfo = softReference.get()) != null) {
            return coldBootInfo;
        }
        try {
            c098200Yq = (ColdBootInfo) C1058250de3.LIZ(LIZIZ().getString("cb_info", ""), ColdBootInfo.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        ColdBootInfo coldBootInfo2 = (ColdBootInfo) c098200Yq;
        if (coldBootInfo2 == null) {
            return null;
        }
        LIZJ = new SoftReference<>(coldBootInfo2);
        return coldBootInfo2;
    }

    public static void LIZLLL(String str) {
        String str2;
        ColdBootInfo coldBootInfoLIZ;
        if (str != null && str.length() != 0) {
            NetworkAdapter networkAdapter = (NetworkAdapter) C1529130ptX.LJFF.getValue();
            networkAdapter.getClass();
            C1529030ptN c1529030ptNLIZIZ = networkAdapter.LIZIZ(str, EnumC2201908jx.GET, networkAdapter.LIZ, C2097608Jq.LJ(), null, "cold-boot");
            if (c1529030ptNLIZIZ.LIZ && (str2 = c1529030ptNLIZIZ.LIZLLL) != null) {
                try {
                    HybridInfoColdBootResponse hybridInfoColdBootResponse = (HybridInfoColdBootResponse) C1058250de3.LIZ(str2, HybridInfoColdBootResponse.class);
                    ColdBootInfo coldBootInfo = hybridInfoColdBootResponse.cold_boot;
                    if (coldBootInfo != null && ((coldBootInfoLIZ = LIZ()) == null || coldBootInfoLIZ.updated_at != coldBootInfo.updated_at)) {
                        LIZIZ().erase("cb_info");
                        LIZIZ().storeString("cb_info", C1058250de3.LIZLLL(coldBootInfo));
                    }
                    Map<String, HybridInfo> map = hybridInfoColdBootResponse.page_info;
                    if (map != null) {
                        for (Map.Entry<String, HybridInfo> entry : map.entrySet()) {
                            LIZJ(entry.getKey(), entry.getValue());
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cold boot parse fail, url:");
                    sbLIZ.append(str);
                    sbLIZ.append(", error:");
                    sbLIZ.append(Unit.LIZ);
                    C2283308x5.LIZ(6, C2188811AlT.LIZIZ(sbLIZ), null);
                    return;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cold boot fail, url:");
            sbLIZ2.append(str);
            sbLIZ2.append(", error:");
            sbLIZ2.append(c1529030ptNLIZIZ.LIZJ);
            sbLIZ2.append(",code:");
            sbLIZ2.append(c1529030ptNLIZIZ.LIZIZ);
            C2283308x5.LIZ(6, C2188811AlT.LIZIZ(sbLIZ2), null);
        }
    }

    public static void LIZJ(String str, HybridInfo hybridInfo) throws JSONException {
        if (hybridInfo.validity_period <= 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("info", C1058250de3.LIZLLL(hybridInfo));
        jSONObject.put("expire", System.currentTimeMillis() + ((long) (hybridInfo.validity_period * LSPassThroughRecordSizeConfig.DEFAULT)));
        ((Keva) LIZIZ.getValue()).storeString(str, C786410Ut5.J3(jSONObject));
    }
}
