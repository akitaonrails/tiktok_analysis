package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2081808Do {
    public static final C2081808Do LIZ = new C2081808Do();

    public static void LIZJ(String str, C2344009Gk c2344009Gk, JSONObject jSONObject, int i) throws JSONException {
        Iterator<String> itKeys;
        if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(next);
                    c2344009Gk.LJFF(C2188811AlT.LIZIZ(sbLIZ), (String) obj);
                } else if (obj instanceof Long) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(next);
                    c2344009Gk.LIZLLL(((Number) obj).longValue(), C2188811AlT.LIZIZ(sbLIZ2));
                } else if (obj instanceof Integer) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append(next);
                    c2344009Gk.LIZJ(((Number) obj).intValue(), C2188811AlT.LIZIZ(sbLIZ3));
                } else if (obj instanceof Double) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str);
                    sbLIZ4.append(next);
                    c2344009Gk.LIZ(((Number) obj).doubleValue(), C2188811AlT.LIZIZ(sbLIZ4));
                } else if (obj instanceof Float) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(str);
                    sbLIZ5.append(next);
                    c2344009Gk.LIZIZ(((Number) obj).floatValue(), C2188811AlT.LIZIZ(sbLIZ5));
                } else if (obj instanceof Boolean) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(str);
                    sbLIZ6.append(next);
                    c2344009Gk.LJ(obj, C2188811AlT.LIZIZ(sbLIZ6));
                } else if ((obj instanceof JSONObject) && i > 0) {
                    LIZ.getClass();
                    LIZJ(str, c2344009Gk, (JSONObject) obj, i - 1);
                }
            }
        }
    }

    public static void LIZ(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2, String str2, boolean z) throws JSONException {
        if (str != null && str.length() != 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (jSONObject2 != null) {
                LIZ.getClass();
                LIZJ("", c2344009Gk, jSONObject2, 5);
            }
            if (jSONObject != null) {
                LIZ.getClass();
                LIZJ("duration_", c2344009Gk, jSONObject, 5);
            }
            if (num != null) {
                c2344009Gk.LIZJ(num.intValue(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            }
            if (str2 != null) {
                c2344009Gk.LJFF("log_type", str2);
            }
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("monitor_");
                sbLIZ.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        }
    }

    public static void LIZIZ(C2081808Do c2081808Do, final String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2, String str2, int i) {
        final boolean z;
        final JSONObject jSONObject3 = jSONObject2;
        final JSONObject jSONObject4 = jSONObject;
        final Integer num2 = num;
        final String str3 = null;
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            jSONObject4 = null;
        }
        if ((i & 8) != 0) {
            jSONObject3 = null;
        }
        if ((i & 16) == 0) {
            str3 = str2;
        }
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        c2081808Do.getClass();
        C15O7.LIZJ(new Callable() { // from class: X.08Dp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("ReportToTeaUtil@d54f.report$1");
                try {
                    C2081808Do c2081808Do2 = C2081808Do.LIZ;
                    String str4 = str;
                    Integer num3 = num2;
                    JSONObject jSONObject5 = jSONObject4;
                    JSONObject jSONObject6 = jSONObject3;
                    String str5 = str3;
                    boolean z2 = z;
                    c2081808Do2.getClass();
                    C2081808Do.LIZ(str4, num3, jSONObject5, jSONObject6, str5, z2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    String str6 = str;
                    if (str6 != null) {
                        c2344009Gk.LJFF("service_name", str6);
                    }
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    c2344009Gk.LJFF("error_msg", message);
                    C20684815ws.LJIILLIIL("report_to_tea_util_error", c2344009Gk.LIZ);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ReportToTeaUtil@d54f.report$1");
                return unit;
            }
        });
    }
}
