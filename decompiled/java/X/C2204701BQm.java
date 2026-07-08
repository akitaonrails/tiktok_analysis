package X;

import Y.ARunnableS103S0200000_34;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.impl.JsBridge2ConfigImpl;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204701BQm {
    public static Boolean LJIIJ = Boolean.TRUE;
    public final Collection<String> LIZ;
    public final C1BR0 LIZJ;
    public final String LJ;
    public final Executor LJFF;
    public final Map<String, C2204651BQh> LIZIZ = new ConcurrentHashMap();
    public final Set<C1BRJ> LIZLLL = new CopyOnWriteArraySet();
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public volatile boolean LJII = false;
    public final C1BR9 LJIIIIZZ = new C1BR6<C1BRK>() { // from class: X.1BR9
        @Override // X.C1BR6
        public final C1BRK LIZIZ() {
            C1BRK c1brkLIZ = JsBridge2ConfigImpl.LIZLLL().LIZ();
            if (c1brkLIZ == null) {
                return null;
            }
            return c1brkLIZ;
        }
    };
    public final AtomicInteger LJIIIZ = new AtomicInteger(0);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1BR9] */
    public C2204701BQm(C1BR0 c1br0) {
        this.LIZJ = c1br0;
        String strLIZJ = c1br0.LIZJ();
        if (TextUtils.isEmpty(strLIZJ)) {
            this.LJ = c1br0.Ap().url;
        } else {
            this.LJ = strLIZJ;
        }
        this.LJFF = c1br0.LIZIZ();
        this.LIZ = new LinkedList(c1br0.LJFF());
    }

    public final C2204651BQh LIZIZ(String str, List<TimeLineEvent> list) {
        if (!((LinkedList) this.LIZ).contains(str) && !TextUtils.equals(str, "host")) {
            C2204811BQx c2204811BQx = new C2204811BQx();
            c2204811BQx.LIZJ(str, "namespace");
            c2204811BQx.LIZJ(str, "list");
            c2204811BQx.LIZ("label_illegal_namespace", list);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Namespace: ");
            sbLIZ.append(str);
            sbLIZ.append(" not registered.");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return LIZ(str, list, null);
    }

    public static void LIZLLL(String str, String str2, String str3) {
        C2204811BQx c2204811BQx = new C2204811BQx();
        c2204811BQx.LIZLLL();
        c2204811BQx.LIZJ(str2, "from");
        c2204811BQx.LIZ = "label_parse_package_version";
        if (!TextUtils.isEmpty(str3)) {
            c2204811BQx.LIZJ(str3, "url");
        }
        if (TextUtils.isEmpty(str)) {
            c2204811BQx.LIZJ("null", "response");
            ((CopyOnWriteArrayList) C2204711BQn.LJII).add(c2204811BQx.LIZIZ());
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                c2204811BQx.LIZJ(str, "response");
                ((CopyOnWriteArrayList) C2204711BQn.LJII).add(c2204811BQx.LIZIZ());
                return;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("packages");
            if (jSONObjectOptJSONObject2 == null) {
                c2204811BQx.LIZJ(str, "response");
                ((CopyOnWriteArrayList) C2204711BQn.LJII).add(c2204811BQx.LIZIZ());
                return;
            }
            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObjectOptJSONObject2, next);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "channel");
                    Long lValueOf = Long.valueOf(JSONObjectProtectorUtils.getLong(jSONObject, "package_version"));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(next);
                    sbLIZ.append("_");
                    sbLIZ.append(string);
                    c2204811BQx.LIZJ(lValueOf, C2188811AlT.LIZIZ(sbLIZ));
                }
                if (str2 != "from_network" && str2 != "from_merge") {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str2);
                    sbLIZ2.append("_");
                    sbLIZ2.append("build_in");
                    C1544520qIM.LIZ("JSBridge2", C2188811AlT.LIZIZ(sbLIZ2), jSONArray);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str2);
                    sbLIZ3.append("_");
                    sbLIZ3.append("build_in");
                    C1544520qIM.LIZ("BDXBridge", C2188811AlT.LIZIZ(sbLIZ3), jSONArray);
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str2);
                    sbLIZ4.append("_");
                    sbLIZ4.append("Internet");
                    C1544520qIM.LIZ("JSBridge2", C2188811AlT.LIZIZ(sbLIZ4), jSONArray);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(str2);
                    sbLIZ5.append("_");
                    sbLIZ5.append("Internet");
                    C1544520qIM.LIZ("BDXBridge", C2188811AlT.LIZIZ(sbLIZ5), jSONArray);
                }
            }
            ((CopyOnWriteArrayList) C2204711BQn.LJII).add(c2204811BQx.LIZIZ());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            c2204811BQx.LIZJ(str, "response");
            c2204811BQx.LIZJ(e.getClass().getSimpleName(), "exception_name");
            c2204811BQx.LIZJ(e.getMessage(), "exception_message");
            ((CopyOnWriteArrayList) C2204711BQn.LJII).add(c2204811BQx.LIZIZ());
        }
    }

    public final C2204651BQh LIZ(String str, List list, JSONObject jSONObject) {
        if (LIZ() != null) {
            LIZ().LIZ(str, jSONObject);
        }
        C2204651BQh c2204651BQh = (C2204651BQh) ((ConcurrentHashMap) this.LIZIZ).get(str);
        C2204811BQx c2204811BQx = new C2204811BQx();
        c2204811BQx.LIZJ(str, "namespace");
        if (c2204651BQh == null) {
            this.LIZJ.LJIIIZ();
            C2204651BQh c2204651BQh2 = new C2204651BQh(str, 128, this.LIZJ.LIZ(), this.LIZJ.LIZIZ(), jSONObject, list, this.LJIIIIZZ);
            ((ConcurrentHashMap) this.LIZIZ).put(str, c2204651BQh2);
            c2204811BQx.LIZ("label_repository_create_config", list);
            return c2204651BQh2;
        }
        if (jSONObject == null) {
            return c2204651BQh;
        }
        c2204651BQh.LIZLLL(list, jSONObject);
        InterfaceC2204671BQj interfaceC2204671BQj = c2204651BQh.LIZJ;
        String str2 = c2204651BQh.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("com.bytedance.ies.web.jsbridge2.PermissionConfig.");
        sbLIZ.append(str2);
        interfaceC2204671BQj.LIZ(C2188811AlT.LIZIZ(sbLIZ), C786410Ut5.J3(jSONObject));
        c2204811BQx.LIZ("label_repository_update_config", list);
        return c2204651BQh;
    }

    public final void LIZJ(boolean z, final String str, C1BRI c1bri) {
        if (!TextUtils.isEmpty(str)) {
            if (!z) {
                this.LIZJ.LIZ().LIZIZ("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", new InterfaceC1059350dfp() { // from class: X.1BQl
                    @Override // X.InterfaceC1059350dfp
                    public final void LIZ(String str2) {
                        JSONObject jSONObjectOptJSONObject;
                        JSONObject jSONObjectOptJSONObject2;
                        C2204701BQm c2204701BQm = this.LIZ;
                        String str3 = str;
                        c2204701BQm.getClass();
                        try {
                            JSONObject jSONObject = new JSONObject(str3);
                            if (jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) == 0) {
                                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("data");
                                if (jSONObjectOptJSONObject3 == null) {
                                    jSONObjectOptJSONObject = null;
                                } else {
                                    jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("packages");
                                }
                                if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(str2)) {
                                    JSONObject jSONObject2 = new JSONObject(str2);
                                    JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("data");
                                    if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("packages")) != null) {
                                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                        while (itKeys.hasNext()) {
                                            String next = itKeys.next();
                                            jSONObjectOptJSONObject2.put(next, JSONObjectProtectorUtils.getJSONArray(jSONObjectOptJSONObject, next));
                                        }
                                        String strJ3 = C786410Ut5.J3(jSONObject2);
                                        c2204701BQm.LIZJ.LIZ().LIZ("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", strJ3);
                                        C2204701BQm.LIZLLL(strJ3, "from_merge", null);
                                        return;
                                    }
                                    c2204701BQm.LIZJ.LIZ().LIZ("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", str3);
                                    return;
                                }
                                c2204701BQm.LIZJ.LIZ().LIZ("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", str3);
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C2204811BQx c2204811BQx = new C2204811BQx();
                            c2204811BQx.LIZJ(e.getClass().getSimpleName(), "exception_name");
                            c2204811BQx.LIZJ(e.getMessage(), "exception_message");
                            c2204811BQx.LIZJ(str3, "response");
                            c2204811BQx.LIZJ(str2, "value");
                            c2204811BQx.LIZ("label_repository_merge_config_exception", C2204711BQn.LJII);
                        }
                    }
                });
            }
            try {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "data"), "packages"), this.LIZJ.W2());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                    String strOptString = jSONObject.optString("channel");
                    if (TextUtils.equals(strOptString, "_jsb_auth")) {
                        LIZ("host", C2204711BQn.LJII, jSONObject);
                    } else if (strOptString.startsWith("_jsb_auth.")) {
                        LIZ(strOptString.replace("_jsb_auth.", ""), C2204711BQn.LJII, jSONObject);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Malformed config: ");
                        sbLIZ.append(C786410Ut5.J3(jSONObject));
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
                C2204811BQx c2204811BQx = new C2204811BQx();
                c2204811BQx.LIZJ(this.LIZJ.W2(), "key");
                c2204811BQx.LIZ("label_repository_parse_config", C2204711BQn.LJII);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Parse configurations failed, url: ");
                sbLIZ2.append(this.LJ);
                sbLIZ2.append(", response: ");
                sbLIZ2.append(str);
                C2188811AlT.LIZIZ(sbLIZ2);
                C2204811BQx c2204811BQx2 = new C2204811BQx();
                c2204811BQx2.LIZJ(e.getClass().getSimpleName(), "exception_name");
                c2204811BQx2.LIZJ(e.getMessage(), "exception_message");
                if (TextUtils.isEmpty(str)) {
                    str = "null";
                }
                c2204811BQx2.LIZJ(str, "response");
                c2204811BQx2.LIZ("label_repository_parse_config_exception", C2204711BQn.LJII);
            }
            this.LJII = true;
            C2204811BQx c2204811BQx3 = new C2204811BQx();
            c2204811BQx3.LIZJ("true", "config_repository_fetched");
            c2204811BQx3.LIZ("label_permission_checker_fetch", C2204711BQn.LJII);
            C786410Ut5.LJJZZIII(this.LJI, new ARunnableS103S0200000_34(this, c1bri, 2));
        }
    }
}
