package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849860XVo {
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r12, java.lang.String r13, java.lang.String r14, org.json.JSONObject r15, X.InterfaceC849870XVp r16) {
        /*
            r4 = r12
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 != 0) goto L6
            return
        L6:
            boolean r0 = X.C2093608Ic.LJ(r14)
            if (r0 != 0) goto L1b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.1DcT r1 = new X.1DcT
            java.lang.String r0 = "User-Agent"
            r1.<init>(r0, r14)
            r2.add(r1)
        L1b:
            X.0XVq r0 = new java.lang.Object() { // from class: X.0XVq
                static {
                    /*
                        X.0XVq r0 = new X.0XVq
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0XVq) X.0XVq.LIZ X.0XVq
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C849880XVq.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C849880XVq.<init>():void");
                }
            }
            r0.getClass()
            boolean r0 = X.C2093608Ic.LJ(r13)
            if (r0 != 0) goto Lbd
            if (r4 == 0) goto Lbd
            if (r15 == 0) goto L4c
            java.lang.String r0 = "label"
            java.lang.String r7 = r15.optString(r0)     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = "ext_json"
            org.json.JSONObject r12 = r15.optJSONObject(r0)     // Catch: java.lang.Exception -> L48
            boolean r0 = X.C2093608Ic.LJ(r7)     // Catch: java.lang.Exception -> L48
            if (r0 != 0) goto L4c
            java.lang.String r5 = "wap_stat"
            java.lang.String r6 = "app_download"
            r8 = 0
            r10 = r8
            X.C810650Vr5.LIZIZ(r4, r5, r6, r7, r8, r10, r12)     // Catch: java.lang.Exception -> L48
            goto L4c
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4c:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto Lab
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r13)
            r2.<init>(r1, r0)
            android.content.pm.PackageManager r0 = r4.getPackageManager()     // Catch: java.lang.Exception -> La1
            android.content.ComponentName r0 = r2.resolveActivity(r0)     // Catch: java.lang.Exception -> La1
            if (r0 == 0) goto Lab
            com.ss.android.ugc.aweme.compliance.sandbox.api.services.ISandboxService r1 = X.C2429209fW.LIZ()     // Catch: java.lang.Exception -> La1
            r0 = 1207967489(0x48001f01, float:131196.02)
            r1.appendDataFlowId(r2, r0)     // Catch: java.lang.Exception -> La1
            java.lang.String r0 = ""
            android.content.Intent r3 = android.content.Intent.createChooser(r2, r0)     // Catch: java.lang.Exception -> La1
            if (r3 == 0) goto Lab
            boolean r0 = r4 instanceof android.app.Activity     // Catch: java.lang.Exception -> La1
            if (r0 != 0) goto L82
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r0)     // Catch: java.lang.Exception -> La1
        L82:
            com.bytedance.router.monitor.RouterPageMonitor r0 = com.bytedance.router.monitor.RouterPageMonitor.INSTANCE     // Catch: java.lang.Exception -> L9c
            com.bytedance.router.monitor.page.IRouterPageEventDispatcher r1 = r0.getDispatcher()     // Catch: java.lang.Exception -> L9c
            java.lang.String r0 = "Context_startActivity_1"
            r1.dispatchActivityOpReached(r4, r3, r0)     // Catch: java.lang.Exception -> L9c
            X.C1701330uNH.LIZ(r3, r4)     // Catch: java.lang.Exception -> L9c
            X.0WZX r2 = new X.0WZX     // Catch: java.lang.Exception -> L9c
            java.lang.String r1 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkh5Y4VdTSGkoolG9570WjdrCLzHtKA=="
            r0 = 0
            r2.<init>(r1, r0)     // Catch: java.lang.Exception -> L9c
            X.C2204961BRm.LJJJJJL(r4, r3, r2)     // Catch: java.lang.Exception -> L9c
            goto Lbd
        L9c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> La1
            goto Lab
        La1:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = "webview_download_resolveActivity"
            X.C1AF0.LIZJ(r0)
        Lab:
            r0 = 2131837954(0x7f114402, float:1.9309118E38)
            java.lang.String r1 = r4.getString(r0)
            X.0iBy r0 = new X.0iBy
            r0.<init>(r4)
            r0.LIZJ(r1)
            r0.LIZLLL()
        Lbd:
            if (r16 == 0) goto Lc2
            r16.LIZ()
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C849860XVo.LIZ(android.content.Context, java.lang.String, java.lang.String, org.json.JSONObject, X.0XVp):void");
    }

    public static JSONObject LIZIZ(long j, Context context, String str, String str2, String str3, String str4) {
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("label", "browser");
            jSONObject2.put("pageUrl", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("referer_url", str3);
            }
            if (!TextUtils.isEmpty(str3) && !str3.equals(str4)) {
                jSONObject2.put("init_url", str4);
            }
            jSONObject2.put("ad_id", j);
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("log_extra", str);
            }
            if (j <= 0) {
                jSONObject2.put("in_white_list", 1);
            }
            jSONObject.put("ext_json", jSONObject2);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public static void LIZJ(Context context, String str, String str2, String str3, String str4, JSONObject jSONObject, InterfaceC849870XVp interfaceC849870XVp) {
        if (context != null && !C2093608Ic.LJ(str)) {
            LIZ(context, str, str2, jSONObject, interfaceC849870XVp);
        }
    }
}
