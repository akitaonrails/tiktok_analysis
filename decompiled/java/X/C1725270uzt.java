package X;

import android.net.Uri;
import android.net.http.SslError;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.base.PipoEventService;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerEventReportConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS123S1100000_9;
import kotlin.jvm.internal.AwS140S1100000_26;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725270uzt {
    public static final C1725270uzt LIZ = new C1725270uzt();

    public static void LJI(String str, Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", str);
            jSONObject.put("error_message", Log.getStackTraceString(th));
            LJ(LIZ, "rd_pipo_universal_container_exception", jSONObject, null, 12);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1AF0.LJ(th2);
        }
    }

    public static void LJIIL(SslError sslError, SparkContext sparkContext) {
        String str;
        String string;
        if (C1725380v04.LIZ().enableLoadUrlEvent && sparkContext != null && (str = sparkContext.containerId) != null) {
            if (sslError == null || (string = Integer.valueOf(sslError.getPrimaryError()).toString()) == null) {
                string = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append("(ssl_error)");
            C1725360v02.LIZ.LIZ(str).LJIIIIZZ("", string, C2188811AlT.LIZIZ(sbLIZ), null, new AwS123S1100000_9(sparkContext, str, 18));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(org.json.JSONObject r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C603950NmT
            if (r0 == 0) goto L24
            r5 = r8
            X.0NmT r5 = (X.C603950NmT) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            java.lang.Object r7 = r5.LL
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            goto L59
        L24:
            X.0NmT r5 = new X.0NmT
            r5.<init>(r6, r8)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r4)
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r0 = "pipo_container_add_memory_in_event"
            r1.getClass()     // Catch: java.lang.Throwable -> L8c
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r2)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L93
            X.0v0h r1 = X.C1725770v0h.LIZ     // Catch: java.lang.Throwable -> L8c
            X.0uus r0 = X.C1717770unn.LIZJ()     // Catch: java.lang.Throwable -> L8c
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L8c
            r5.LL = r7     // Catch: java.lang.Throwable -> L8c
            r5.LLILZ = r2     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r4 = r1.LIZ(r0, r5)     // Catch: java.lang.Throwable -> L8c
            if (r4 != r3) goto L5c
            return r3
        L59:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L8c
        L5c:
            X.0qOK r4 = (X.C1548220qOK) r4     // Catch: java.lang.Throwable -> L8c
            if (r4 != 0) goto L63
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L8c
            return r0
        L63:
            java.lang.String r1 = "memory_status"
            int r0 = r4.LIZLLL     // Catch: java.lang.Throwable -> L8c
            r7.put(r1, r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = "memory_avail_percent"
            float r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L8c
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r0)     // Catch: java.lang.Throwable -> L8c
            r7.put(r1, r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = "total_memory"
            float r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L8c
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r0)     // Catch: java.lang.Throwable -> L8c
            r7.put(r1, r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = "app_memory"
            float r0 = r4.LIZ     // Catch: java.lang.Throwable -> L8c
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r0)     // Catch: java.lang.Throwable -> L8c
            r7.put(r1, r0)     // Catch: java.lang.Throwable -> L8c
            goto L93
        L8c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        L93:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725270uzt.LIZIZ(org.json.JSONObject, X.05Vn):java.lang.Object");
    }

    public final void LJII(String str, String str2) {
        String strLIZJ;
        String host;
        String path;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        try {
            Uri uriLIZLLL = C759510Tqn.LIZLLL(str, "sendHandleUrlEvent");
            if (uriLIZLLL != null) {
                strLIZJ = C759510Tqn.LIZJ(uriLIZLLL, "url", "sendHandleUrlEvent");
            } else {
                strLIZJ = null;
            }
            Uri uriLIZLLL2 = C759510Tqn.LIZLLL(strLIZJ, "sendHandleUrlEvent 2");
            if (uriLIZLLL2 != null) {
                host = uriLIZLLL2.getHost();
                path = uriLIZLLL2.getPath();
            } else {
                host = null;
                path = null;
            }
            if (uriLIZLLL2 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZLLL2, "bdhm_bid");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("schema", str);
            jSONObject.put("url_host", host);
            jSONObject.put("url_path", path);
            jSONObject.put("handle_result", str2);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                jSONObject.put("bdhm_bid", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
            LJ(this, "rd_pipo_handle_url", jSONObject, null, 12);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("uri illegal, scene: sendHandleUrlEvent, msg: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(", raw uri: ");
            sbLIZ.append(str);
            LJFF("204", C2188811AlT.LIZIZ(sbLIZ), null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r9, java.lang.String r10, org.json.JSONObject r11) {
        /*
            java.lang.String r4 = "pipo_additional_tracking_params"
            r8 = 0
            r7 = 1
            if (r9 == 0) goto L36
            int r0 = r9.length()
            if (r0 == 0) goto L36
            r0 = 0
        Ld:
            r0 = r0 ^ 1
            r6 = 0
            if (r0 == 0) goto L34
            if (r9 == 0) goto L34
            X.0uzq r0 = X.C1725240uzq.LIZ
            r0.getClass()
            java.util.Map<java.lang.String, X.0uzn> r0 = X.C1725240uzq.LIZLLL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r9)
            X.0uzn r0 = (X.InterfaceC1725210uzn) r0
            if (r0 == 0) goto L34
            org.json.JSONObject r5 = r0.LIZIZ()
            if (r5 != 0) goto L38
        L2b:
            if (r10 == 0) goto L33
            int r0 = r10.length()
            if (r0 != 0) goto L38
        L33:
            return
        L34:
            r5 = r6
            goto L2b
        L36:
            r0 = 1
            goto Ld
        L38:
            if (r10 == 0) goto L3b
            goto L3d
        L3b:
            r3 = r6
            goto L48
        L3d:
            int r0 = r10.length()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L3b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L4c
        L48:
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L4c
            goto L58
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L58:
            boolean r0 = X.C189200o6.m7isFailureimpl(r3)
            if (r0 == 0) goto L5f
            r3 = r6
        L5f:
            java.lang.String r2 = r11.optString(r4)     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L74
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L74
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L76
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L76
        L70:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L76
            goto L82
        L74:
            r1 = r6
            goto L70
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L82:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L89
            r6 = r1
        L89:
            r0 = 3
            org.json.JSONObject[] r1 = new org.json.JSONObject[r0]
            r1[r8] = r6
            r1[r7] = r3
            r0 = 2
            r1[r0] = r5
            org.json.JSONObject r3 = X.C1530940pwS.LIZ(r1)
            java.lang.String r2 = "payment_method_id"
            java.lang.String r1 = r3.optString(r2)
            if (r1 == 0) goto La8
            int r0 = r1.length()
            if (r0 == 0) goto La8
            r11.put(r2, r1)
        La8:
            java.lang.String r0 = X.C786410Ut5.J3(r3)
            r11.put(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725270uzt.LIZ(java.lang.String, java.lang.String, org.json.JSONObject):void");
    }

    public static void LJIIIZ(WebResourceRequest webResourceRequest, WebResourceError webResourceError, SparkContext sparkContext) {
        String str;
        String string;
        String string2;
        boolean z;
        CharSequence description;
        String string3;
        PipoContainerEventReportConfig pipoContainerEventReportConfigLIZ = C1725380v04.LIZ();
        if ((!pipoContainerEventReportConfigLIZ.enableLoadUrlEvent && !pipoContainerEventReportConfigLIZ.enableResourceErrorEvent) || sparkContext == null || (str = sparkContext.containerId) == null || webResourceRequest == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String str2 = "";
        if (url == null || (string = url.toString()) == null) {
            string = "";
        }
        if (webResourceError != null && (string3 = Integer.valueOf(webResourceError.getErrorCode()).toString()) != null) {
            str2 = string3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (webResourceError != null && (description = webResourceError.getDescription()) != null) {
            string2 = description.toString();
        } else {
            string2 = null;
        }
        sbLIZ.append(string2);
        sbLIZ.append("(receive_error)");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z2 = true;
        if (pipoContainerEventReportConfigLIZ.enableLoadUrlEvent && webResourceRequest.isForMainFrame()) {
            z = true;
        } else {
            z = false;
        }
        if (!pipoContainerEventReportConfigLIZ.enableResourceErrorEvent || webResourceRequest.isForMainFrame()) {
            C1717770unn.LIZJ().isDebug();
            z2 = false;
        }
        if (z) {
            C1725360v02.LIZ.LIZ(str).LJIIIIZZ(string, str2, strLIZIZ, null, new AwS123S1100000_9(sparkContext, str, 16));
        }
        if (z2) {
            C1725360v02.LIZ.LIZ(str).LJFF(string, str2, strLIZIZ, null, AFwS240S0000000_9.get$arr$(943));
        }
    }

    public static void LJIIJJI(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, SparkContext sparkContext) {
        String str;
        String string;
        String reasonPhrase;
        boolean z;
        String string2;
        PipoContainerEventReportConfig pipoContainerEventReportConfigLIZ = C1725380v04.LIZ();
        if ((!pipoContainerEventReportConfigLIZ.enableLoadUrlEvent && !pipoContainerEventReportConfigLIZ.enableResourceErrorEvent) || sparkContext == null || (str = sparkContext.containerId) == null || webResourceRequest == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String str2 = "";
        if (url == null || (string = url.toString()) == null) {
            string = "";
        }
        if (webResourceResponse != null && (string2 = Integer.valueOf(webResourceResponse.getStatusCode()).toString()) != null) {
            str2 = string2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (webResourceResponse == null || (reasonPhrase = webResourceResponse.getReasonPhrase()) == null) {
            reasonPhrase = null;
        }
        sbLIZ.append(reasonPhrase);
        sbLIZ.append("(http_error)");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z2 = true;
        if (pipoContainerEventReportConfigLIZ.enableLoadUrlEvent && webResourceRequest.isForMainFrame()) {
            z = true;
        } else {
            z = false;
        }
        if (!pipoContainerEventReportConfigLIZ.enableResourceErrorEvent || webResourceRequest.isForMainFrame()) {
            C1717770unn.LIZJ().isDebug();
            z2 = false;
        }
        if (z) {
            C1725360v02.LIZ.LIZ(str).LJIIIIZZ(string, str2, strLIZIZ, null, new AwS123S1100000_9(sparkContext, str, 17));
        }
        if (z2) {
            C1725360v02.LIZ.LIZ(str).LJFF(string, str2, strLIZIZ, null, AFwS240S0000000_9.get$arr$(944));
        }
    }

    public final void LJIIIIZZ(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (str != null) {
                jSONObject.put("url", str);
            }
            jSONObject.put("step", str2);
            if (str3 != null) {
                jSONObject.put("error_message", str3);
            }
            LJ(this, "rd_pipo_container_report_llm", jSONObject, null, 12);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.lang.String r7, X.InterfaceC1364105Vn r8, org.json.JSONObject r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C603960NmU
            if (r0 == 0) goto L4f
            r5 = r8
            X.0NmU r5 = (X.C603960NmU) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L55
            java.lang.Object r9 = r5.LL
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            X.C155000ia.LIZIZ(r4)
        L27:
            java.lang.String r1 = "rd_pipo_universal_container_load_url"
            r0 = 12
            LJ(r6, r1, r9, r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r4)
            X.0uus r0 = X.C1717770unn.LIZJ()
            r0.isDebug()
            java.lang.String r0 = "biz"
            java.lang.String r0 = r9.optString(r0)
            LIZ(r0, r2, r9)
            r5.LL = r9
            r5.LLILZ = r1
            java.lang.Object r0 = r6.LIZIZ(r9, r5)
            if (r0 != r3) goto L27
            return r3
        L4f:
            X.0NmU r5 = new X.0NmU
            r5.<init>(r6, r8)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1725270uzt.LJIIJ(java.lang.String, X.05Vn, org.json.JSONObject):java.lang.Object");
    }

    public static JSONObject LIZJ(int i, String str, String str2, String str3) throws JSONException {
        JSONObject jSONObjectLJI;
        String host;
        String path;
        String host2;
        String path2;
        InterfaceC1725350v01 interfaceC1725350v01 = C1725360v02.LIZIZ.get(str2);
        JSONObject jSONObjectLIZLLL = null;
        if (interfaceC1725350v01 != null) {
            jSONObjectLJI = interfaceC1725350v01.LJI();
            jSONObjectLIZLLL = interfaceC1725350v01.LIZLLL();
        } else {
            jSONObjectLJI = null;
        }
        Uri uriLIZLLL = C759510Tqn.LIZLLL(str, "sendWebViewTerminateEvent schema");
        Uri uriLIZLLL2 = C759510Tqn.LIZLLL(C759510Tqn.LIZJ(uriLIZLLL, "url", "sendWebViewTerminateEvent url"), "sendWebViewTerminateEvent url");
        String strLIZJ = C759510Tqn.LIZJ(uriLIZLLL, "pipo_hybrid_biz", "sendWebViewTerminateEvent biz");
        String str4 = "";
        if (strLIZJ == null && (strLIZJ = C759510Tqn.LIZJ(uriLIZLLL, "biz", "sendWebViewTerminateEvent biz fallback")) == null) {
            strLIZJ = "";
        }
        String strLIZJ2 = C759510Tqn.LIZJ(uriLIZLLL, "bdhm_bid", "sendWebViewTerminateEvent bid");
        if (strLIZJ2 == null) {
            strLIZJ2 = "";
        }
        String strLIZJ3 = C759510Tqn.LIZJ(uriLIZLLL, "pipo_additional_tracking_params", "sendWebViewTerminateEvent additional params");
        if (strLIZJ3 == null) {
            strLIZJ3 = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", System.currentTimeMillis());
        jSONObject.put("biz", strLIZJ);
        jSONObject.put("bdhm_bid", strLIZJ2);
        if (uriLIZLLL2 == null || (host = uriLIZLLL2.getHost()) == null) {
            host = "";
        }
        jSONObject.put("url_original_host", host);
        if (uriLIZLLL2 == null || (path = uriLIZLLL2.getPath()) == null) {
            path = "";
        }
        jSONObject.put("url_original_path", path);
        if (uriLIZLLL2 == null || (host2 = uriLIZLLL2.getHost()) == null) {
            host2 = "";
        }
        jSONObject.put("url_prev_decision_host", host2);
        if (uriLIZLLL2 != null && (path2 = uriLIZLLL2.getPath()) != null) {
            str4 = path2;
        }
        jSONObject.put("url_prev_decision_path", str4);
        jSONObject.put("pipo_additional_tracking_params", strLIZJ3);
        JSONObject jSONObjectLIZ = C1530940pwS.LIZ(jSONObject, jSONObjectLJI, jSONObjectLIZLLL);
        jSONObjectLIZ.put("timestamp", System.currentTimeMillis());
        jSONObjectLIZ.put("is_blank", str3);
        jSONObjectLIZ.put("terminated_reason", i);
        jSONObjectLIZ.put("container_id", str2);
        String strOptString = jSONObjectLIZ.optString("url_prev_decision_host");
        if (strOptString == null || strOptString.length() == 0) {
            jSONObjectLIZ.put("url_prev_decision_host", jSONObjectLIZ.optString("url_original_host"));
        }
        String strOptString2 = jSONObjectLIZ.optString("url_prev_decision_path");
        if (strOptString2 == null || strOptString2.length() == 0) {
            jSONObjectLIZ.put("url_prev_decision_path", jSONObjectLIZ.optString("url_original_path"));
        }
        return jSONObjectLIZ;
    }

    public static void LJFF(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("biz", str3);
            jSONObject.put("error_code", str);
            jSONObject.put("error_message", str2);
            if (str4 != null) {
                jSONObject.put("bdhm_bid", str4);
            }
            LJ(LIZ, "rd_pipo_universal_container_exception", jSONObject, null, 12);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public final void LJIILIIL(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        JSONObject jSONObject;
        try {
            if (str == null || (jSONObject = C1725360v02.LIZ.LIZ(str).LJI()) == null) {
                jSONObject = new JSONObject();
            }
            if (bool != null) {
                jSONObject.put("validDeviceWidthViewPort", bool.booleanValue());
            }
            if (bool2 != null) {
                jSONObject.put("scrollableHorizontalOverflow", bool2.booleanValue());
            }
            if (bool3 != null) {
                jSONObject.put("horizontalContentOverflow", bool3.booleanValue());
            }
            LJ(this, "rd_pipo_universal_container_page_rendering_status", jSONObject, null, 12);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0v01] */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public static void LIZLLL(String str, String str2, boolean z, boolean z2, int i) throws JSONException {
        if ((i & 2) != 0) {
            str2 = null;
        }
        ?? r7 = z;
        if ((i & 4) != 0) {
            r7 = 0;
        }
        ?? r8 = z2;
        if ((i & 8) != 0) {
            r8 = 0;
        }
        if (C1725380v04.LIZ().enableCloseEvent && str != null && str2 != null) {
            ?? jSONObject = new JSONObject();
            jSONObject.put("finish_by_user", r7);
            jSONObject.put("finish_by_destroy", r8);
            C1725360v02.LIZ.LIZ(str2).LIZJ(str, jSONObject, new AwS140S1100000_26(str, (String) null, (Function1<? super JSONObject, Unit>) 57));
        }
    }

    public static void LJ(C1725270uzt c1725270uzt, String str, JSONObject jSONObject, List list, int i) {
        boolean z;
        Iterator<String> itKeys;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            list = C13BV.INSTANCE;
        }
        c1725270uzt.getClass();
        C1713870uhV.LIZIZ(str, jSONObject);
        if (z) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object obj = jSONObject.get(next);
                        if (list.contains(next)) {
                            jSONObject2.put(next, obj);
                        } else {
                            jSONObject3.put(next, obj);
                        }
                    }
                }
                ((InterfaceC1724730uz1) ((InterfaceC1547650qNP) C1954707lB.LIZLLL(InterfaceC1724730uz1.class))).LIZ(str, jSONObject3, jSONObject2);
                try {
                    PipoEventService.LIZJ().LIZ(str, jSONObject3, jSONObject2, null);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }

    public final void LJIILJJIL(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String host;
        int i;
        String path;
        try {
            Uri uriLIZLLL = C759510Tqn.LIZLLL(str, "select contact event");
            JSONObject jSONObject = new JSONObject();
            String str9 = "";
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("biz", str2);
            if (uriLIZLLL == null || (host = uriLIZLLL.getHost()) == null) {
                host = "";
            }
            jSONObject.put("url_host", host);
            if (uriLIZLLL != null && (path = uriLIZLLL.getPath()) != null) {
                str9 = path;
            }
            jSONObject.put("url_path", str9);
            jSONObject.put("step", str4);
            if (str3 != null) {
                jSONObject.put("bdhm_bid", str3);
            }
            if (str6 != null) {
                jSONObject.put("jsb_name", str6);
            }
            if (str5 != null) {
                jSONObject.put("result", str5);
            }
            if (str7 != null) {
                jSONObject.put("error_code", str7);
            }
            if (str8 != null) {
                jSONObject.put("error_message", str8);
            }
            int i2 = 1;
            if (bool != null) {
                if (bool.booleanValue()) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("has_contact_name", i);
            }
            if (bool2 != null) {
                if (!bool2.booleanValue()) {
                    i2 = 0;
                }
                jSONObject.put("has_phone_number", i2);
            }
            LJ(this, "rd_pipo_container_select_contact", jSONObject, null, 12);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }
}
