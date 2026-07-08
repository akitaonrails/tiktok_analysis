package X;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKAppToAppRequest;
import com.orbu.core.adapter.TTKResponseKt;
import com.ss.android.ugc.aweme.compliance.sandbox.api.experiment.SandboxApp2AppSwitch;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WaP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825790WaP implements InterfaceC825760WaM {
    public static final C825790WaP LIZ = new C825790WaP();
    public static final CopyOnWriteArraySet<String> LIZIZ = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<String> LIZJ = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArraySet<String> LIZLLL = new CopyOnWriteArraySet<>();
    public static final boolean LJ;
    public static final List<String> LJFF;

    static {
        SandboxApp2AppSwitch.SandboxApp2AppConfigData sandboxApp2AppConfigData;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            sandboxApp2AppConfigData = SandboxApp2AppSwitch.LIZ;
            SandboxApp2AppSwitch.SandboxApp2AppConfigData sandboxApp2AppConfigData2 = (SandboxApp2AppSwitch.SandboxApp2AppConfigData) settingsManagerLIZLLL.LJIIIIZZ("sandbox_app2app_validate_switch", SandboxApp2AppSwitch.SandboxApp2AppConfigData.class, sandboxApp2AppConfigData);
            if (sandboxApp2AppConfigData2 != null) {
                sandboxApp2AppConfigData = sandboxApp2AppConfigData2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sandboxApp2AppConfigData = SandboxApp2AppSwitch.LIZ;
        }
        if (sandboxApp2AppConfigData.enable) {
            C825700WaG.LIZJ.add(LIZ);
        }
        LJ = sandboxApp2AppConfigData.useAutoDFID;
        LJFF = C1697810uHb.LJIIJJI("INTENT_BTM", "wrangler_activity_start_stack_info", "pns.sandbox.dataflow_id");
    }

    public static JSONObject LIZJ(Intent intent) {
        String string;
        String string2;
        Bundle extras;
        Object obj;
        String string3;
        JSONObject jSONObject = new JSONObject();
        try {
            Uri data = intent.getData();
            if (data != null) {
                string = data.toString();
            } else {
                string = null;
            }
            jSONObject.put("data", string);
            jSONObject.put("type", intent.getType());
            jSONObject.put("action", intent.getAction());
            jSONObject.put("package", intent.getPackage());
            ComponentName component = intent.getComponent();
            if (component != null) {
                string2 = component.toString();
            } else {
                string2 = null;
            }
            jSONObject.put("component", string2);
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<T> it2 = categories.iterator();
                while (it2.hasNext()) {
                    jSONArray.put((String) it2.next());
                }
                jSONObject.put("categories", jSONArray);
            }
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            if (extras != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (String str : extras.keySet()) {
                    if (!LJFF.contains(str)) {
                        try {
                            obj = extras.get(str);
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            obj = null;
                        } catch (OutOfMemoryError e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            obj = null;
                        }
                        if (obj == null) {
                            string3 = null;
                        } else {
                            string3 = obj.toString();
                        }
                        jSONObject2.put(str, string3);
                    }
                }
                if (jSONObject2.length() != 0) {
                    jSONObject.put("extras", jSONObject2);
                    return jSONObject;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return jSONObject;
    }

    public static String LIZLLL(Intent intent) {
        if (intent.getPackage() != null) {
            return intent.getPackage();
        }
        ComponentName component = intent.getComponent();
        if (component != null && C2204961BRm.LJJIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga8jM9SinkIRA2PeaSynmMuA6bz03FNruUB6COGdoohTnq9w==", null)) != null) {
            ComponentName component2 = intent.getComponent();
            if (component2 == null) {
                return null;
            }
            return C2204961BRm.LJJIJIL(component2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga8jM9SinkIRA2PeaSynmMuA6bz03FNruUB6COGdoohTnq9w==", null));
        }
        return intent.getAction();
    }

    public static boolean LJFF(Intent intent) {
        ComponentName component;
        Set<String> categories = intent.getCategories();
        if (categories != null && (!(categories instanceof Collection) || !categories.isEmpty())) {
            Iterator<T> it2 = categories.iterator();
            while (it2.hasNext()) {
                if (LIZLLL.contains(it2.next())) {
                    return true;
                }
            }
        }
        String strLJJIJIL = intent.getPackage();
        if ((strLJJIJIL != null || ((component = intent.getComponent()) != null && (strLJJIJIL = C2204961BRm.LJJIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga8jM9SinkIRA2PeaSynmMuA6bz03FNruUB6COGdoohTnq9w==", null))) != null)) && LIZIZ.contains(strLJJIJIL)) {
            return true;
        }
        if (intent.getAction() == null || !LIZJ.contains(intent.getAction())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC825760WaM
    public final boolean LIZ(Intent intent, C825750WaL c825750WaL) {
        Intent intent2;
        Uri data;
        String scheme;
        try {
            TTKOrbu tTKOrbu = TTKOrbu.INSTANCE;
            if (!tTKOrbu.enableInterceptor()) {
                return false;
            }
            String string = null;
            if (!Intrinsics.LJFF("android.intent.action.VIEW", intent.getAction())) {
                intent2 = null;
            } else {
                intent2 = intent;
            }
            boolean z = true;
            if (intent2 != null && (data = intent2.getData()) != null && (scheme = data.getScheme()) != null && (Intrinsics.LJFF("intent", scheme) || Intrinsics.LJFF("http", scheme) || Intrinsics.LJFF("https", scheme))) {
                return false;
            }
            String strLIZLLL = LIZLLL(intent);
            if (LJFF(intent)) {
                return false;
            }
            if (strLIZLLL != null && !a0.LJJJIL(strLIZLLL)) {
                z = false;
            }
            if (z) {
                LJ(Integer.valueOf(intent.getIntExtra("pns.sandbox.dataflow_id", -1)), "app2app_target_is_null", strLIZLLL);
                return false;
            }
            if (C825730WaJ.LIZ(EnumC825810WaR.APP2APP, c825750WaL.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("is from system or sdk , do not need to validate. codePointTags:");
                String[] strArr = c825750WaL.LIZ;
                if (strArr != null) {
                    string = Arrays.toString(strArr);
                }
                sbLIZ.append(string);
                C2188811AlT.LIZIZ(sbLIZ);
                LJ(Integer.valueOf(intent.getIntExtra("pns.sandbox.dataflow_id", -1)), "app2app_uninterested_call", LIZLLL(intent));
                return false;
            }
            return TTKResponseKt.isBlock(tTKOrbu.shouldInterceptTTKRequest(new TTKAppToAppRequest(LIZJ(intent), strLIZLLL, C2097908Jt.LIZJ(new Pair("x-tt-dataflow-id", LIZIZ(intent, strLIZLLL, c825750WaL))))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Intent r5, java.lang.String r6, X.C825750WaL r7) {
        /*
            java.lang.String r0 = "pns.sandbox.dataflow_id"
            r1 = 1209008127(0x480fffff, float:147455.98)
            int r4 = r5.getIntExtra(r0, r1)
            boolean r0 = X.C825790WaP.LJ
            if (r0 == 0) goto L52
            if (r4 == 0) goto L4a
            if (r4 == r1) goto L4a
        L11:
            if (r6 == 0) goto L55
            if (r4 == r1) goto L58
            r0 = 1207969288(0x48002608, float:131224.12)
            if (r4 != r0) goto L43
            boolean r0 = com.bytedance.pumbaa.utility.dfid.AutoDFIDManager.LIZIZ
            java.lang.String r3 = "enableAutoDFID"
            if (r0 == 0) goto L40
            java.lang.Integer r0 = r7.LIZIZ
            if (r0 != 0) goto L40
            boolean r0 = r5.hasExtra(r3)
            if (r0 == 0) goto L48
            r0 = 0
            boolean r0 = r5.getBooleanExtra(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L33:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "app2app_no_auto_dfid"
            LJ(r2, r0, r1)
        L40:
            r5.removeExtra(r3)
        L43:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            return r0
        L48:
            r0 = 0
            goto L33
        L4a:
            java.lang.Integer r0 = r7.LIZIZ
            if (r0 == 0) goto L62
            int r4 = r0.intValue()
        L52:
            if (r4 == 0) goto L55
            goto L11
        L55:
            r4 = 1209008127(0x480fffff, float:147455.98)
        L58:
            java.lang.String r1 = "app2app_dfid_or_payload_illegal"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            LJ(r0, r1, r6)
            goto L43
        L62:
            r4 = 1209008127(0x480fffff, float:147455.98)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C825790WaP.LIZIZ(android.content.Intent, java.lang.String, X.0WaL):java.lang.String");
    }

    public static void LJ(Integer num, String str, String str2) {
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error_type", str);
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("dataflow_id", string);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("payload", str2);
        Npth.reportBizException("sandbox_validation_params_error", new Throwable(), str, linkedHashMap, linkedHashMap, true);
    }
}
