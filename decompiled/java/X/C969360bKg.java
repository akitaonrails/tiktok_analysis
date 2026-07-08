package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSequentialEventReportSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969360bKg {
    public final String LIZ = "ttlive_link_interact_sequential_event_monitor";
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1630));

    public final void LIZIZ(JSONObject jSONObject) {
        JSONObject jSONObjectInvoke;
        JSONObject jSONObjectInvoke2;
        LinkmicSequentialEventReportSetting linkmicSequentialEventReportSetting = LinkmicSequentialEventReportSetting.INSTANCE;
        if (linkmicSequentialEventReportSetting.getValue().enable) {
            C969390bKj c969390bKj = (C969390bKj) this.LIZIZ.getValue();
            long j = linkmicSequentialEventReportSetting.getValue().expireTime;
            String str = c969390bKj.LIZ;
            String str2 = c969390bKj.LIZIZ;
            String str3 = c969390bKj.LIZJ;
            long jLIZIZ = C963140bAe.LIZIZ();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strInvoke = c969390bKj.LIZLLL.invoke(jSONObject);
            if (!a0.LJJJIL(strInvoke)) {
                JSONObject jSONObject2 = new JSONObject();
                C0K04.LJFF(FollowStatusChangeMethod.PARAM_UID, strInvoke, jSONObject2);
                C0K04.LJFF(Scene.SCENE_SERVICE, str, jSONObject2);
                C0K04.LJFF("sub_scene", str2, jSONObject2);
                C0K04.LJFF("live_type", str3, jSONObject2);
                C0K04.LJ("server_time", jLIZIZ, jSONObject2);
                C0K04.LJ("client_time", jCurrentTimeMillis, jSONObject2);
                C0K04.LJI("code", new JSONArray(), jSONObject2);
                C0K04.LJI("event", new JSONArray(), jSONObject2);
                Function1<Object, JSONObject> function1 = c969390bKj.LJ;
                if (function1 != null && (jSONObjectInvoke2 = function1.invoke(jSONObject)) != null) {
                    try {
                        C189200o6.m2constructorimpl(jSONObjectInvoke2.put("user_id", UserService.getInstance().user().getCurrentUserId()));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                    C0K04.LJII("extra", jSONObject2, jSONObjectInvoke2);
                }
                Function1<Object, JSONObject> function12 = c969390bKj.LJFF;
                if (function12 != null && (jSONObjectInvoke = function12.invoke(jSONObject)) != null) {
                    C0K04.LJII("ab", jSONObject2, jSONObjectInvoke);
                }
                InterfaceC969400bKk interfaceC969400bKk = c969390bKj.LJI;
                if (interfaceC969400bKk != null) {
                    interfaceC969400bKk.LIZIZ(false, j, true, C969390bKj.LIZ(strInvoke, str, str2), C786410Ut5.J3(jSONObject2), false);
                }
            }
        }
    }

    public final void LIZ(int i, String str) {
        if (LinkmicSequentialEventReportSetting.INSTANCE.getValue().enable) {
            C969390bKj c969390bKj = (C969390bKj) this.LIZIZ.getValue();
            String str2 = c969390bKj.LIZ;
            String str3 = c969390bKj.LIZIZ;
            if (!a0.LJJJIL(str) && c969390bKj.LJI != null) {
                String strLIZ = C969390bKj.LIZ(str, str2, str3);
                c969390bKj.LJI.LIZ(strLIZ, new C969380bKi(c969390bKj, strLIZ, null, i, System.currentTimeMillis()));
            }
        }
    }

    public final void LIZJ(String str, String str2, JSONObject jSONObject, Map map) {
        Unit unit;
        if (str != null && !a0.LJJJIL(str) && LinkmicSequentialEventReportSetting.INSTANCE.getValue().enable) {
            C969390bKj c969390bKj = (C969390bKj) this.LIZIZ.getValue();
            String str3 = c969390bKj.LIZ;
            String str4 = c969390bKj.LIZIZ;
            long jLIZIZ = C963140bAe.LIZIZ();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!a0.LJJJIL(str) && c969390bKj.LJI != null) {
                String strLIZ = C969390bKj.LIZ(str, str3, str4);
                JSONObject jSONObject2 = new JSONObject();
                C0K04.LJFF("event_id", str2, jSONObject2);
                C0K04.LJ("server_time", jLIZIZ, jSONObject2);
                C0K04.LJ("client_time", jCurrentTimeMillis, jSONObject2);
                if (map != null) {
                    try {
                        for (Map.Entry entry : map.entrySet()) {
                            jSONObject2.putOpt((String) entry.getKey(), entry.getValue());
                        }
                        unit = Unit.LIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
                c969390bKj.LJI.LIZ(strLIZ, new C969370bKh(c969390bKj, strLIZ, jSONObject2, jSONObject));
            }
        }
    }
}
