package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799500VXw {
    public final ICommonParams LIZ;

    public C799500VXw(ICommonParams iCommonParams) {
        this.LIZ = iCommonParams;
    }

    public final void LIZ(File file) {
        try {
            LIZIZ(file);
            C0VSJ c0vsj = new C0VSJ(file, "bytest.json");
            if (!C0VJL.LJFF) {
                C0VJL.LJFF = true;
                try {
                    String str = C0VJL.LIZIZ().LIZIZ;
                    if (str != null) {
                        C08SE.LJIIIIZZ(c0vsj, str, false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(File file) {
        try {
            List<String> patchInfo = this.LIZ.getPatchInfo();
            if (patchInfo == null) {
                return;
            }
            C801720Vcg c801720Vcg = new C801720Vcg(new C0VSJ(file, "patch_info.json").getAbsolutePath());
            c801720Vcg.LIZ('[');
            boolean z = false;
            for (String str : patchInfo) {
                if (z) {
                    c801720Vcg.LJIIIIZZ();
                }
                c801720Vcg.LIZLLL(str);
                z = true;
            }
            c801720Vcg.LIZ(']');
            c801720Vcg.LJI();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final JSONObject LIZJ(CrashType crashType) {
        List<String> patchInfo;
        if (crashType == CrashType.ENSURE) {
            JSONObject jSONObject = new JSONObject();
            try {
                ICommonParams iCommonParams = this.LIZ;
                if (iCommonParams != null && (patchInfo = iCommonParams.getPatchInfo()) != null && !patchInfo.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it2 = patchInfo.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next());
                    }
                    jSONObject.put("patch_info", jSONArray);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            JSONObject jSONObject2 = new JSONObject();
            C0VJL.LIZ(jSONObject2);
            C0VJO.LJIIIIZZ(jSONObject, "filters", jSONObject2);
            return jSONObject;
        }
        return null;
    }

    public static final void LIZLLL(JSONObject jSONObject, JSONObject jSONObject2, File file) {
        JSONObject jSONObject3;
        try {
            String strLJFF = C2112008Pe.LJFF(new C0VSJ(file, "patch_info.json"));
            if (strLJFF != null) {
                C0VJO.LJIIIIZZ(jSONObject, "patch_info", new JSONArray(strLJFF));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C0VSJ c0vsj = new C0VSJ(file, "bytest.json");
        try {
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (c0vsj.isFile() && c0vsj.exists()) {
            jSONObject3 = new JSONObject(C08SE.LIZJ(c0vsj));
            JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("slardar_filter");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("filters");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
                jSONObject.put("filters", jSONObjectOptJSONObject2);
            }
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() != 0) {
                if ("true".equals(jSONObjectOptJSONObject.optString("core_dump_switch"))) {
                    jSONObjectOptJSONObject2.put("coredump_bytest", true);
                }
                C0VJO.LIZLLL(jSONObjectOptJSONObject2, jSONObjectOptJSONObject);
            } else {
                jSONObjectOptJSONObject2.put("coredump_bytest", false);
            }
        } else {
            jSONObject3 = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject3 == null) {
            C0VJL.LIZJ(jSONObject3, jSONObject2);
        } else {
            C0VJL.LIZJ(jSONObject3, jSONObjectOptJSONObject3);
        }
    }
}
