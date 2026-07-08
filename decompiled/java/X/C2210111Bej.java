package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210111Bej {
    public static volatile Boolean LIZ = Boolean.FALSE;

    public static boolean LIZIZ() {
        return !LIZ.booleanValue();
    }

    public static String LIZ(AbstractC2209931BeR abstractC2209931BeR) {
        if (abstractC2209931BeR == null) {
            return "";
        }
        if (abstractC2209931BeR instanceof C2210841Bfu) {
            return "FORWARD_EVENT";
        }
        if (abstractC2209931BeR instanceof C2209941BeS) {
            if (!"applog_trace".equals(((C2209941BeS) abstractC2209931BeR).LLJL)) {
                return "EVENT_V3";
            }
            return "TRACE";
        }
        if (abstractC2209931BeR instanceof C2209991BeX) {
            return "EVENT_V3";
        }
        if (abstractC2209931BeR instanceof C2209961BeU) {
            return ((C2209961BeU) abstractC2209931BeR).LLJJJJLIIL.toUpperCase(Locale.ROOT);
        }
        if (abstractC2209931BeR instanceof C2209971BeV) {
            return "LAUNCH";
        }
        if (abstractC2209931BeR instanceof C2210011BeZ) {
            return "TERMINATE";
        }
        if (!(abstractC2209931BeR instanceof C2209981BeW)) {
            return "";
        }
        return "LOG_DATA";
    }

    public static String LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applog_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(String str, InterfaceC800590Var interfaceC800590Var) {
        if (!LIZIZ() && !C2200271B9l.LJI(str)) {
            C800570Vap.LLILZIL.LIZIZ(new Object[0]).LJ(LJ(str), interfaceC800590Var);
        }
    }

    public static void LIZLLL(final Object obj, String str) {
        if (!LIZIZ() && !C2200271B9l.LJI(str)) {
            if (obj instanceof AbstractC2209931BeR) {
                C800570Vap.LLILZIL.LIZIZ(new Object[0]).LJ(LJ(str), new InterfaceC800590Var() { // from class: X.1Beu
                    @Override // X.InterfaceC800590Var
                    public final Object LIZ() {
                        JSONObject jSONObjectLJIILJJIL = ((AbstractC2209931BeR) obj).LJIILJJIL();
                        JSONObject jSONObject = new JSONObject();
                        C0VS7.LIZIZ(jSONObjectLJIILJJIL, jSONObject);
                        try {
                            jSONObject.put("$$APP_ID", ((AbstractC2209931BeR) obj).LLJILJILJ);
                            jSONObject.put("$$EVENT_TYPE", C2210111Bej.LIZ((AbstractC2209931BeR) obj));
                            jSONObject.put("$$PRIORITY", ((AbstractC2209931BeR) obj).LLJJ);
                            jSONObject.put("$$EVENT_LOCAL_ID", ((AbstractC2209931BeR) obj).LLJJIII);
                            return jSONObject;
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return jSONObject;
                        }
                    }
                });
            } else {
                C800570Vap.LLILZIL.LIZIZ(new Object[0]).LIZLLL(obj, LJ(str));
            }
        }
    }
}
