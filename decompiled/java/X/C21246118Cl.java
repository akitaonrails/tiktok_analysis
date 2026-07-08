package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21246118Cl {
    public static PageInfoStack LIZ;
    public static JSONObject LIZIZ;
    public static final C18EH<String> LIZJ = new C18EH<>("process_recovery_cache_new", new C21246318Cn(), new C21246418Co());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C21246218Cm());

    public static C18G6 LIZ() {
        return (C18G6) LIZLLL.getValue();
    }

    public static void LIZIZ() throws JSONException {
        Object c098200Yq;
        Object c098200Yq2;
        BcmParams bcmParams;
        Map<String, Object> map;
        C18G6 c18g6;
        C21241518Ar chainRecorderExp = BtmServiceImpl.INSTANCE.getChainRecorderExp();
        chainRecorderExp.getClass();
        try {
            C18G6 c18g6LIZJ = chainRecorderExp.LIZJ();
            if (c18g6LIZJ != null) {
                JSONObject jSONObject = new JSONObject();
                synchronized (chainRecorderExp.LJ) {
                    try {
                        for (Map.Entry<String, String> entry : chainRecorderExp.LJ.entrySet()) {
                            jSONObject.putOpt(entry.getKey(), entry.getValue());
                        }
                    } finally {
                    }
                }
                c18g6LIZJ.LIZ("key_btm_chain", C786410Ut5.J3(jSONObject));
            }
            C18G6 c18g6LIZJ2 = chainRecorderExp.LIZJ();
            if (c18g6LIZJ2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                C21248618Dk c21248618Dk = C21248618Dk.LIZ;
                synchronized (c21248618Dk.LJIIJ()) {
                    try {
                        for (Map.Entry<String, C21246818Cs> entry2 : c21248618Dk.LJIIJ().entrySet()) {
                            jSONObject2.putOpt(entry2.getKey(), ((Gson) chainRecorderExp.LIZ.getValue()).LJIILL(entry2.getValue()));
                        }
                    } finally {
                    }
                }
                c18g6LIZJ2.LIZ("btmId_btmPageInfo_map", C786410Ut5.J3(jSONObject2));
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C18CS.LIZ.LIZJ().LJIILLIIL() == 1 && (c18g6 = (C18G6) C1287110jbB.LIZ.getValue()) != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry3 : C1287110jbB.LIZIZ.entrySet()) {
                jSONObject3.putOpt(entry3.getKey(), entry3.getValue());
            }
            c18g6.LIZ("key_union_chain", C786410Ut5.J3(jSONObject3));
        }
        C21246718Cr.LIZ.getClass();
        if (C18CS.LIZ.LIZJ().LJIJ().LIZIZ() != 1 && (bcmParams = C21246718Cr.LIZLLL) != null && (map = bcmParams.toMap()) != null) {
            for (Map.Entry<String, Object> entry4 : map.entrySet()) {
                String key = entry4.getKey();
                Object value = entry4.getValue();
                C21246718Cr.LIZ.getClass();
                C21246718Cr.LIZIZ().LIZLLL(value.toString(), key, false);
            }
        }
        C18G6 c18g6LIZ = LIZ();
        if (c18g6LIZ != null) {
            c18g6LIZ.LIZ("launch_id", BtmServiceImpl.INSTANCE.getLaunchIdExp());
        }
        C18G6 c18g6LIZ2 = LIZ();
        if (c18g6LIZ2 != null) {
            c18g6LIZ2.LIZ("last_btmId", C18CJ.LJ);
        }
        InterfaceC21246518Cp saveCacheCallback = BtmServiceImpl.INSTANCE.getSaveCacheCallback();
        if (saveCacheCallback != null) {
            saveCacheCallback.LIZIZ();
        }
        C18E5 c18e5 = C18E5.LIZ;
        C18G6 c18g6LIZ3 = LIZ();
        c18e5.getClass();
        if (c18g6LIZ3 != null) {
            BufferBtm bufferBtm = C18E5.LIZLLL;
            c18g6LIZ3.LIZ("key_page_buffer", bufferBtm != null ? bufferBtm.toString() : null);
        }
        C18G6 c18g6LIZ4 = LIZ();
        if (c18g6LIZ4 != null) {
            C21247918Dd c21247918Dd = C18E3.LJII;
            c18g6LIZ4.LIZ("paused_info", c21247918Dd != null ? c21247918Dd.toString() : null);
        }
        C18G6 c18g6LIZ5 = LIZ();
        if (c18g6LIZ5 != null) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry entry5 : ((LinkedHashMap) C21249518Dt.LIZ).entrySet()) {
                    jSONObject4.putOpt((String) entry5.getKey(), entry5.getValue());
                }
                c18g6LIZ5.LIZ("singleton_cache", C786410Ut5.J3(jSONObject4));
                c098200Yq2 = Unit.LIZ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
        } else {
            c098200Yq2 = null;
        }
        C189200o6.m2constructorimpl(c098200Yq2);
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
            C18CE.LIZ.LJFF(1121, "SingletonCache", null, null, false);
        }
    }
}
