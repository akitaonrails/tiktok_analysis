package X;

import Y.ARunnableS9S1100000_3;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2341909Fp {
    public static final List<InterfaceC2342209Fs> LIZ;
    public static final C01GW LIZIZ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(576));
        arrayList.add(new InterfaceC2342209Fs() { // from class: X.09Fq
            public static boolean LIZJ(String str, String str2) {
                if (!TextUtils.equals(str, "im_story")) {
                    if (TextUtils.equals(str, "story") && TextUtils.equals(str2, "from_chat")) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC2342209Fs
            public final boolean LIZ(String str, Map<String, String> map) {
                String str2;
                String str3 = null;
                if (map != null) {
                    str2 = map.get("shoot_way");
                    str3 = map.get("enter_from");
                } else {
                    str2 = null;
                }
                return LIZJ(str2, str3);
            }

            @Override // X.InterfaceC2342209Fs
            public final boolean LIZIZ(String str, JSONObject jSONObject) {
                String strOptString;
                String strOptString2 = null;
                if (jSONObject != null) {
                    strOptString = jSONObject.optString("shoot_way", "");
                    strOptString2 = jSONObject.optString("enter_from", "");
                } else {
                    strOptString = null;
                }
                return LIZJ(strOptString, strOptString2);
            }
        });
        arrayList.add(new InterfaceC2342209Fs() { // from class: X.09Fu
            @Override // X.InterfaceC2342209Fs
            public final boolean LIZ(String str, Map<String, String> map) {
                String str2;
                if (u.LJJIIJZLJL(str, "tool_performance_", false)) {
                    String str3 = null;
                    if (map != null) {
                        str2 = map.get("tool_performance_");
                    } else {
                        str2 = null;
                    }
                    if (TextUtils.isEmpty(str2) && map != null) {
                        String str4 = C2342609Fw.LIZ.LIZIZ;
                        if (str4 == null) {
                            str4 = "no_creationId";
                        }
                        map.put("creation_id", str4);
                    }
                    if (map != null) {
                        str3 = map.get("shoot_way");
                    }
                    if (TextUtils.isEmpty(str3) && map != null) {
                        String str5 = C2342609Fw.LIZ.LIZ;
                        if (str5 == null) {
                            str5 = "no_shootWay";
                        }
                        map.put("shoot_way", str5);
                    }
                }
                return false;
            }

            @Override // X.InterfaceC2342209Fs
            public final boolean LIZIZ(String str, JSONObject jSONObject) throws JSONException {
                String strOptString;
                if (u.LJJIIJZLJL(str, "tool_performance_", false)) {
                    String strOptString2 = null;
                    if (jSONObject != null) {
                        strOptString = jSONObject.optString("creation_id", "");
                    } else {
                        strOptString = null;
                    }
                    if (TextUtils.isEmpty(strOptString) && jSONObject != null) {
                        String str2 = C2342609Fw.LIZ.LIZIZ;
                        if (str2 == null) {
                            str2 = "no_creationId";
                        }
                        jSONObject.put("creation_id", str2);
                    }
                    if (jSONObject != null) {
                        strOptString2 = jSONObject.optString("shoot_way", "");
                    }
                    if (TextUtils.isEmpty(strOptString2) && jSONObject != null) {
                        String str3 = C2342609Fw.LIZ.LIZ;
                        if (str3 == null) {
                            str3 = "no_shootWay";
                        }
                        jSONObject.put("shoot_way", str3);
                    }
                }
                return false;
            }
        });
        arrayList.add(new InterfaceC2342209Fs() { // from class: X.09Fr
            @Override // X.InterfaceC2342209Fs
            public final boolean LIZ(String str, Map<String, String> map) {
                if (Intrinsics.LJFF(str, "shoot") && map != null && map.containsKey("is_ui_shoot")) {
                    String str2 = null;
                    if (1 != 0 && this != null) {
                        if (map != null) {
                            str2 = map.get("is_ui_shoot");
                        }
                        if (Intrinsics.LJFF(str2, "true") && !map.containsKey("after_consumption")) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            }

            @Override // X.InterfaceC2342209Fs
            public final boolean LIZIZ(String str, JSONObject jSONObject) {
                if (Intrinsics.LJFF(str, "shoot") && jSONObject != null && jSONObject.has("is_ui_shoot") && this != null && jSONObject != null && jSONObject.optBoolean("is_ui_shoot", false) && !jSONObject.has("after_consumption")) {
                    return true;
                }
                return false;
            }
        });
        if (((Boolean) C2342309Ft.LIZ.getValue()).booleanValue()) {
            arrayList.add(new InterfaceC2342209Fs() { // from class: X.09Fo
                @Override // X.InterfaceC2342209Fs
                public final boolean LIZ(String str, Map<String, String> map) {
                    if (C21309718aN.LJIIZILJ.LIZIZ()) {
                        C2341709Fn.LIZ.execute(new ARunnableS9S1100000_3(map, str, 1));
                        return false;
                    }
                    return false;
                }

                @Override // X.InterfaceC2342209Fs
                public final boolean LIZIZ(String str, JSONObject jSONObject) {
                    if (C21309718aN.LJIIZILJ.LIZIZ()) {
                        C2341709Fn.LIZ.execute(new ARunnableS9S1100000_3(jSONObject, str, 0));
                        return false;
                    }
                    return false;
                }
            });
        }
    }

    public static void LIZ(String str, Map map) {
        List<InterfaceC2342209Fs> list = LIZ;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((InterfaceC2342209Fs) it2.next()).LIZ(str, map)) {
                    return;
                }
            }
        }
        try {
            C0CHQ.LIZ().LIZJ().LJIIIIZZ(str, map);
            ((Boolean) LIZIZ.getValue()).booleanValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        String strJ3;
        List<InterfaceC2342209Fs> list = LIZ;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (((InterfaceC2342209Fs) it2.next()).LIZIZ(str, jSONObject)) {
                    return;
                }
            }
        }
        try {
            C0CHQ.LIZ().LIZJ().LJIIL(str, jSONObject);
            if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onEventV3() called with: eventName:");
            sbLIZ.append(str);
            sbLIZ.append(" with params: ");
            if (jSONObject == null || (strJ3 = C786410Ut5.J3(jSONObject)) == null) {
                strJ3 = "";
            }
            sbLIZ.append(strJ3);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
