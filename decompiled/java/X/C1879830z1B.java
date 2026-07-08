package X;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z1B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879830z1B {
    public static void LIZ(InterfaceC1881340z3c interfaceC1881340z3c) {
        if (!LJ(interfaceC1881340z3c)) {
            return;
        }
        Map<String, String> mapLIZIZ = LIZIZ(interfaceC1881340z3c);
        n nVarLIZJ = LIZJ(interfaceC1881340z3c);
        if (LIZLLL(interfaceC1881340z3c)) {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).reportROI2Event(true, "middle_click_button", mapLIZIZ, nVarLIZJ);
        } else {
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).reportROI2Event(false, "MapUserAction", mapLIZIZ, nVarLIZJ);
        }
    }

    public static Map LIZIZ(InterfaceC1881340z3c interfaceC1881340z3c) {
        C1882420z5M c1882420z5MLIZJ;
        JSONObject jSONObject;
        Map<String, String> mapLLF = null;
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZJ = C1882380z5I.LIZJ(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZJ = null;
        }
        String strLJFF = C1882380z5I.LJFF(c1882420z5MLIZJ, "roi2_extra");
        if (strLJFF != null) {
            try {
                jSONObject = new JSONObject(strLJFF);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("GameDetailPageROI2Reporter", "getLogMap", e);
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "tracking_data");
                if (jSONObject2 != null) {
                    mapLLF = C500260Jjc.LLF(jSONObject2);
                    return mapLLF;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20441214yg.LJFF("GameDetailPageROI2Reporter", "getLogMap: getJSONObject or toStringMap error", e2);
            }
        }
        return mapLLF;
    }

    public static n LIZJ(InterfaceC1881340z3c interfaceC1881340z3c) {
        C1882420z5M c1882420z5MLIZJ;
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZJ = C1882380z5I.LIZJ(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZJ = null;
        }
        String strLJFF = C1882380z5I.LJFF(c1882420z5MLIZJ, "awemeRawAd");
        if (strLJFF != null) {
            try {
                return (n) C7740030o.LIZ().getGson().LJII(strLJFF, n.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("GameDetailPageROI2Reporter", "getPesudoAdData", e);
            }
        }
        return null;
    }

    public static boolean LIZLLL(InterfaceC1881340z3c interfaceC1881340z3c) {
        C1882420z5M c1882420z5MLIZJ;
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZJ = C1882380z5I.LIZJ(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZJ = null;
        }
        String strLJFF = C1882380z5I.LJFF(c1882420z5MLIZJ, "roi2_traffic_type");
        if (C041J.LIZ(strLJFF) && Intrinsics.LJFF(strLJFF, "2")) {
            return true;
        }
        return false;
    }

    public static boolean LJ(InterfaceC1881340z3c interfaceC1881340z3c) {
        C1882420z5M c1882420z5MLIZJ;
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZJ = C1882380z5I.LIZJ(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZJ = null;
        }
        String strLJFF = C1882380z5I.LJFF(c1882420z5MLIZJ, "roi2_traffic_type");
        if (!C041J.LIZ(strLJFF)) {
            return false;
        }
        if (!Intrinsics.LJFF(strLJFF, "1") && !Intrinsics.LJFF(strLJFF, "2")) {
            return false;
        }
        return true;
    }
}
