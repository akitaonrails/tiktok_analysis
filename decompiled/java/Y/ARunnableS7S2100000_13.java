package Y;

import X.C0VC5;
import X.C0VC8;
import X.C0VFR;
import X.C0X5C;
import X.C1550720qSM;
import X.C1551330qTL;
import X.C1956807lW;
import X.C1C7U;
import X.C2188811AlT;
import X.C2241008qG;
import X.C786410Ut5;
import X.C794420VEi;
import X.C802580Ve4;
import X.EnumC797980VSa;
import android.content.Context;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.token.AuthTokenMultiProcessSharedProvider;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.TTHYBRIDXHR;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS7S2100000_13 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    public final void LIZ$0() {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("url", this.s0);
        c2241008qG.LIZ.put("web_url", C0X5C.LIZ((WebView) this.l2));
        c2241008qG.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(C0X5C.LJ((WebView) this.l2) ? 1 : 0));
        TTHYBRIDXHR tthybridxhrLIZJ = C0X5C.LIZJ((WebView) this.l2);
        c2241008qG.LIZ.put("disable_hook_js", Integer.valueOf((int) (tthybridxhrLIZJ != null ? tthybridxhrLIZJ.LIZLLL : 0)));
        c2241008qG.LIZ.put(Scene.SCENE_SERVICE, this.s1);
        c2241008qG.LIZ.put("type", String.valueOf(C0X5C.LIZIZ((WebView) this.l2)));
        C794420VEi.LIZIZ("webview_ttnet_intercept_status", "", c2241008qG.LJ());
    }

    public final void LIZ$1() {
        WebView webView = ((TTHYBRIDXHR) this.l2).LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("!function(){window.imy_realxhr_callback(\"");
        sbLIZ.append(this.s0);
        sbLIZ.append("\", JSON.parse(decodeURIComponent(\"");
        sbLIZ.append(this.s1);
        sbLIZ.append("\")))}()");
        webView.evaluateJavascript(C2188811AlT.LIZIZ(sbLIZ), new ValueCallback() { // from class: X.0X5S
            @Override // android.webkit.ValueCallback
            public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
            }
        });
    }

    public final void LIZ$2() {
        String str = this.s0;
        String str2 = this.s1;
        Throwable th = (Throwable) this.l2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tag=");
        sbLIZ.append(str);
        sbLIZ.append(" message=");
        sbLIZ.append(str2);
        C0VFR c0vfr = new C0VFR(C2188811AlT.LIZIZ(sbLIZ), th);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", "exception");
            jSONObject.put("timestamp", System.currentTimeMillis());
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            c0vfr.printStackTrace(printWriter);
            Throwable cause = c0vfr.getCause();
            if (cause != null) {
                cause.printStackTrace(printWriter);
                Throwable cause2 = cause.getCause();
                if (cause2 != null) {
                    cause2.printStackTrace(printWriter);
                }
            }
            String string = stringWriter.toString();
            printWriter.close();
            jSONObject.put("stack", string);
            jSONObject.put("exception_type", 1);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_");
            sbLIZ2.append(str2);
            jSONObject.put("message", C2188811AlT.LIZIZ(sbLIZ2));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apm_sdk", "apm6_error");
            jSONObject.put("filters", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject3.put("data", jSONArray);
            JSONObject jSONObjectLIZ = C1956807lW.LIZ(C0VC5.LIZIZ());
            if (jSONObjectLIZ != null) {
                jSONObjectLIZ.put("aid", "44444");
            }
            jSONObject3.put("header", jSONObjectLIZ);
            C0VC8.LIZIZ(C0VC8.LIZJ, C786410Ut5.J3(jSONObject3).getBytes());
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static final void run$0(ARunnableS7S2100000_13 aRunnableS7S2100000_13) {
        boolean zLIZ;
        C1C7U.LIZ("WsChannelMultiProcessSharedProvider@4b59.createNotifyRunnable$3");
        try {
            WsChannelMultiProcessSharedProvider wsChannelMultiProcessSharedProvider = (WsChannelMultiProcessSharedProvider) aRunnableS7S2100000_13.l2;
            wsChannelMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(WsChannelMultiProcessSharedProvider.LIZ(wsChannelMultiProcessSharedProvider.getContext(), aRunnableS7S2100000_13.s0, aRunnableS7S2100000_13.s1), null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WsChannelMultiProcessSharedProvider@4b59.createNotifyRunnable$3");
    }

    public static final void run$1(ARunnableS7S2100000_13 aRunnableS7S2100000_13) {
        boolean zLIZ;
        C1C7U.LIZ("TTHYBRIDXHR$Companion@50df.resetStatus$2");
        try {
            aRunnableS7S2100000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTHYBRIDXHR$Companion@50df.resetStatus$2");
    }

    public static final void run$2(ARunnableS7S2100000_13 aRunnableS7S2100000_13) {
        boolean zLIZ;
        C1C7U.LIZ("TTHYBRIDXHR@9107.xhrCallback$2");
        try {
            aRunnableS7S2100000_13.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTHYBRIDXHR@9107.xhrCallback$2");
    }

    public static final void run$3(ARunnableS7S2100000_13 aRunnableS7S2100000_13) {
        boolean zLIZ;
        C1C7U.LIZ("AuthTokenMultiProcessSharedProvider@10ee.createNotifyRunnable$3");
        try {
            AuthTokenMultiProcessSharedProvider authTokenMultiProcessSharedProvider = (AuthTokenMultiProcessSharedProvider) aRunnableS7S2100000_13.l2;
            authTokenMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(AuthTokenMultiProcessSharedProvider.LIZIZ(authTokenMultiProcessSharedProvider.getContext(), aRunnableS7S2100000_13.s0, aRunnableS7S2100000_13.s1), null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AuthTokenMultiProcessSharedProvider@10ee.createNotifyRunnable$3");
    }

    public static final void run$4(ARunnableS7S2100000_13 aRunnableS7S2100000_13) {
        boolean zLIZ;
        C1C7U.LIZ("UploadManager@6676.uploadGraphicInfoAsync$1");
        try {
            try {
                C802580Ve4.LIZIZ = aRunnableS7S2100000_13.s0;
                String str = aRunnableS7S2100000_13.s1;
                C802580Ve4.LIZ = str;
                List<JSONObject> listLIZJ = C802580Ve4.LIZJ(str);
                C802580Ve4.LIZLLL((Context) aRunnableS7S2100000_13.l2, aRunnableS7S2100000_13.s0, listLIZJ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UploadManager@6676.uploadGraphicInfoAsync$1");
    }

    public static final void run$5(ARunnableS7S2100000_13 aRunnableS7S2100000_13) {
        boolean zLIZ;
        C1C7U.LIZ("CustomExceptionHelper@71f4.reportSlardarIfNeed$1");
        try {
            aRunnableS7S2100000_13.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CustomExceptionHelper@71f4.reportSlardarIfNeed$1");
    }

    public static final void run$6(ARunnableS7S2100000_13 aRunnableS7S2100000_13) {
        boolean zLIZ;
        C1C7U.LIZ("PushMultiProcessSharedProvider@62c6.createNotifyRunnable$3");
        try {
            PushMultiProcessSharedProvider pushMultiProcessSharedProvider = (PushMultiProcessSharedProvider) aRunnableS7S2100000_13.l2;
            pushMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(PushMultiProcessSharedProvider.LIZJ(pushMultiProcessSharedProvider.getContext(), aRunnableS7S2100000_13.s0, aRunnableS7S2100000_13.s1), null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushMultiProcessSharedProvider@62c6.createNotifyRunnable$3");
    }

    public static final void run$7(ARunnableS7S2100000_13 aRunnableS7S2100000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ResLoadUtilsNew@422c.getLatestChannelVersionWithDecompress$2");
        try {
            C1551330qTL c1551330qTL = C1551330qTL.LIZ;
            String str = aRunnableS7S2100000_13.s0;
            String str2 = aRunnableS7S2100000_13.s1;
            long j = CastLongProtector.parseLong(((C1550720qSM) aRunnableS7S2100000_13.l2).LIZLLL);
            EnumC797980VSa enumC797980VSa = EnumC797980VSa.GET_VERSION;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1551330qTL.getClass();
            C1551330qTL.LJIIIZ(str, str2, j, enumC797980VSa, true, jCurrentTimeMillis, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ResLoadUtilsNew@422c.getLatestChannelVersionWithDecompress$2");
    }

    public static final void run$8(ARunnableS7S2100000_13 aRunnableS7S2100000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ResLoadUtilsNew@422c.getChannelPath$4");
        try {
            C1551330qTL c1551330qTL = C1551330qTL.LIZ;
            String str = aRunnableS7S2100000_13.s0;
            String str2 = aRunnableS7S2100000_13.s1;
            long jLongValue = ((Long) aRunnableS7S2100000_13.l2).longValue();
            EnumC797980VSa enumC797980VSa = EnumC797980VSa.GET_PATH;
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1551330qTL.getClass();
            C1551330qTL.LJIIIZ(str, str2, jLongValue, enumC797980VSa, true, jCurrentTimeMillis, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ResLoadUtilsNew@422c.getChannelPath$4");
    }

    public ARunnableS7S2100000_13(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = obj;
    }
}
