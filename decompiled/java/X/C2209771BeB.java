package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209771BeB {
    public static final List<String> LJII = Collections.singletonList("DeviceManager");
    public final InterfaceC2209801BeE LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public final C2209571Bdr LIZLLL;
    public volatile JSONObject LJ = new JSONObject();
    public final SharedPreferences LJFF;
    public final C2209901BeO LJI;

    public final JSONObject LIZ() {
        return C2200271B9l.LJ(this.LJ);
    }

    public final String LIZLLL() {
        if (this.LIZIZ) {
            return this.LJ.optString("user_unique_id", "");
        }
        C2209571Bdr c2209571Bdr = this.LIZLLL;
        if (c2209571Bdr == null) {
            return "";
        }
        if (c2209571Bdr.LJIIZILJ == null) {
            c2209571Bdr.LJIIZILJ = c2209571Bdr.LIZJ.getString("user_unique_id", "");
        }
        return c2209571Bdr.LJIIZILJ;
    }

    public static Set LIZJ(String str) {
        String[] strArrSplit;
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(",")) != null && strArrSplit.length > 0) {
            for (String str2 : strArrSplit) {
                if (!TextUtils.isEmpty(str2)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    public static boolean LJ(JSONObject jSONObject) {
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("device_id", "");
            String strOptString2 = jSONObject.optString("install_id", "");
            if (C2200271B9l.LIZ(strOptString) && C2200271B9l.LIZ(strOptString2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJFF(JSONObject jSONObject) {
        String str;
        boolean zBooleanValue = C0XD8.LIZ.LIZIZ(new Object[0]).booleanValue();
        if (zBooleanValue) {
            str = "Harmony";
        } else {
            str = "Android";
        }
        try {
            jSONObject.put("platform", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJI.LJJZZI.LJIIZILJ(LJII, "loadHarmonyInfo failed", e, new Object[0]);
        }
        if (!zBooleanValue) {
            return;
        }
        try {
            jSONObject.put("harmony_os_api", C1964207mi.LIZ("hw_sc.build.os.apiversion"));
            jSONObject.put("harmony_os_version", C1964207mi.LIZ("hw_sc.build.platform.version"));
            jSONObject.put("harmony_release_type", C1964207mi.LIZ("hw_sc.build.os.releasetype"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.LJJZZI.LJIIIZ(0, LJII, "loadHarmonyInfo failed", th);
        }
    }

    public final void LJI(String str) {
        boolean z;
        if (((CopyOnWriteArrayList) this.LJI.LJL).contains("ab_sdk_version")) {
            this.LJI.LJJZZI.LJ(0, LJII, "update header failed for header: {} is blocked!", "ab_sdk_version");
            return;
        }
        Object objOpt = this.LJ.opt("ab_sdk_version");
        if (str == null ? objOpt == null : str.equals(objOpt)) {
            z = false;
        } else {
            synchronized (this) {
                try {
                    try {
                        JSONObject jSONObject = this.LJ;
                        JSONObject jSONObject2 = new JSONObject();
                        C2200271B9l.LIZLLL(jSONObject2, jSONObject);
                        jSONObject2.put("ab_sdk_version", str);
                        this.LJ = jSONObject2;
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LJI.LJJZZI.LJIIZILJ(LJII, "update header failed", e, new Object[0]);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            z = true;
        }
        this.LJI.LJJZZI.LJIIIZ(0, LJII, "updateHeader -> key:{}, old:{}, new:{}", "ab_sdk_version", objOpt, str);
        if (!z) {
            return;
        }
        C2209571Bdr c2209571Bdr = this.LIZLLL;
        c2209571Bdr.LJIILLIIL = str;
        c2209571Bdr.LIZJ.edit().putString("ab_sdk_version", str).apply();
    }

    public final void LJII(JSONObject jSONObject) {
        this.LJI.LJJZZI.LJIIIZ(0, LJII, "updateHeader: {}", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        String abSdkVersion = this.LJI.getAbSdkVersion();
        synchronized (this) {
            try {
                C2200271B9l.LIZLLL(jSONObject2, this.LJ);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next)) {
                        try {
                            jSONObject2.put(next, LIZIZ(next, jSONObject));
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LJI.LJJZZI.LJIIZILJ(null, "updateHeader put header key:{} value failed", null, next, e);
                        }
                    }
                }
                try {
                    jSONObject2.put("sdk_version", 507170290);
                    jSONObject2.put("sdk_version_code", C2209781BeC.LIZ);
                    jSONObject2.put("sdk_version_name", "5.7.17-bugfix.2");
                    if (!TextUtils.isEmpty(abSdkVersion)) {
                        jSONObject2.put("ab_sdk_version", abSdkVersion);
                    }
                    LJFF(jSONObject2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LJI.LJJZZI.LJIIZILJ(null, "updateHeader put header sdk version or load harmony info failed", th, new Object[0]);
                    this.LJI.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
                }
                Iterator it2 = ((CopyOnWriteArrayList) this.LJI.LJL).iterator();
                while (it2.hasNext()) {
                    jSONObject2.remove((String) it2.next());
                }
                this.LJ = jSONObject2;
                this.LIZIZ = true;
                this.LIZJ = LJ(this.LJ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        SharedPreferences.Editor editorEdit = this.LJFF.edit();
        editorEdit.putLong("version_code", this.LJ.optLong("version_code", 0L));
        editorEdit.putString("channel", this.LJ.optString("channel", ""));
        editorEdit.apply();
        if (!C2210111Bej.LIZIZ()) {
            C2210111Bej.LIZJ("set_header", new InterfaceC800590Var() { // from class: X.1Be2
                @Override // X.InterfaceC800590Var
                public final Object LIZ() {
                    JSONObject jSONObject3 = new JSONObject();
                    C0VS7.LIZIZ(this.LIZ.LJ, jSONObject3);
                    try {
                        jSONObject3.put("appId", this.LIZ.LJI.LJIIIZ);
                        return jSONObject3;
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        this.LIZ.LJI.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
                        return jSONObject3;
                    }
                }
            });
        }
    }

    public final Object LIZIZ(String str, JSONObject jSONObject) {
        List<String> list;
        if ("custom".equals(str) && this.LJI.LJJLIIIJL) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                return jSONObject.opt(str);
            }
            ArrayList<String> arrayList = new ArrayList();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C2209571Bdr c2209571Bdr = this.LIZLLL;
                if (c2209571Bdr.LJIILIIL.LJJLIIIJL && (list = c2209571Bdr.LJIJJ) != null && !((ArrayList) list).isEmpty() && !((ArrayList) c2209571Bdr.LJIJJ).contains(next)) {
                    arrayList.add(next);
                }
            }
            for (String str2 : arrayList) {
                jSONObjectOptJSONObject.remove(str2);
                this.LJI.LJJZZI.LJFF(0, LJII, "custom header:{} removed by header control ", str2);
                this.LJI.LJJJJLI.LIZIZ(EnumC2210021Bea.REMOVE_CUSTOM_HEADER_COUNT, 1);
            }
            return jSONObjectOptJSONObject;
        }
        return jSONObject.opt(str);
    }

    public C2209771BeB(C2209901BeO c2209901BeO, C2209571Bdr c2209571Bdr, C2210131Bel c2210131Bel) {
        this.LJI = c2209901BeO;
        this.LIZLLL = c2209571Bdr;
        this.LIZ = c2210131Bel;
        this.LJFF = c2209571Bdr.LJ;
    }
}
