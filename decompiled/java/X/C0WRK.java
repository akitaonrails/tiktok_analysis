package X;

import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0WRK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WRK extends C0WRL {
    public static final C0WRK LIZIZ = new C0WRK();
    public static C0WQE<String, Map<String, C0WR6>> LIZJ;

    @Override // X.C0WRP
    public final String name() {
        return "stash";
    }

    @Override // X.C0WRL
    public final boolean LIZIZ(C0WRN c0wrn) {
        String string;
        Map<String, C0WR6> linkedHashMap;
        C0WRM c0wrm;
        Object objLIZ;
        Object objLIZ2;
        String str = (String) c0wrn.LIZ.LIZJ.get("stash_key");
        PrivacyEvent privacyEvent = c0wrn.LJ;
        C0WR6 c0wr6Query = privacyEvent.query(str);
        if (c0wr6Query != null && (objLIZ2 = c0wr6Query.LIZ()) != null) {
            string = objLIZ2.toString();
        } else {
            string = null;
        }
        if (string != null && !a0.LJJJIL(string)) {
            if (LIZJ == null) {
                synchronized (this) {
                    try {
                        if (LIZJ == null) {
                            C0WQE<String, Map<String, C0WR6>> c0wqe = new C0WQE<>(C823240WRe.LIZ().stashCacheLimit);
                            LIZJ = c0wqe;
                            c0wqe.setOnRemoveListener(new C0WQB() { // from class: X.0WQD
                                @Override // X.C0WQB
                                public final void LIZ(Map.Entry entry) {
                                    C823280WRi c823280WRi = C823280WRi.LIZ;
                                    C823280WRi.LIZJ("StashAction cache size reach limit!", "action_error", new Throwable("StashAction cache size reach limit!"));
                                }
                            });
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            C0WQE<String, Map<String, C0WR6>> c0wqe2 = LIZJ;
            if (c0wrn.LIZ.LIZJ.containsKey("merge_stash_key")) {
                String str2 = (String) c0wrn.LIZ.LIZJ.get("merge_stash_key");
                if (str2 == null) {
                    str2 = "";
                }
                C0WR6 c0wr6Query2 = privacyEvent.contextInfo().query(str2);
                if (c0wr6Query2 != null) {
                    objLIZ = c0wr6Query2.LIZ();
                } else {
                    objLIZ = null;
                }
                String strValueOf = String.valueOf(objLIZ);
                synchronized (c0wqe2) {
                    try {
                        linkedHashMap = c0wqe2.pop(strValueOf);
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap<>();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                linkedHashMap = new LinkedHashMap<>();
            }
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            Object obj = c0wrn.LIZ.LIZJ.get("fields");
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    linkedHashSet.add(jSONArray.optString(i));
                }
            }
            Object obj2 = c0wrn.LIZ.LIZJ.get("additional_report_fields");
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj2;
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    linkedHashSet.add(jSONArray2.optString(i2));
                }
            }
            for (String str3 : linkedHashSet) {
                C0WQ7 c0wq7 = C0WQ7.LIZ;
                String strTriggerBiz = privacyEvent.triggerBiz();
                c0wq7.getClass();
                C0WQG c0wqgLIZ = C0WQ7.LIZ(strTriggerBiz, str3);
                if (c0wqgLIZ != null) {
                    c0wrm = c0wqgLIZ.LIZ;
                } else {
                    c0wrm = null;
                }
                if (c0wrm == C0WRM.Engine) {
                    linkedHashMap.put(str3, new C0WQ8(c0wqgLIZ.LIZIZ, c0wrn.LIZ.LIZJ.get(str3)));
                } else {
                    C0WR6 c0wr6Query3 = privacyEvent.contextInfo().query(str3);
                    if (c0wr6Query3 != null) {
                        linkedHashMap.put(str3, new C0WQ8(c0wr6Query3.LIZ, c0wr6Query3.LIZ()));
                    }
                }
            }
            synchronized (c0wqe2) {
                try {
                    c0wqe2.put(string, linkedHashMap);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        this.LIZ = "value of stash_key is null or blank!";
        return false;
    }
}
