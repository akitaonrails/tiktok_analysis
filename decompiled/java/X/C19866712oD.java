package X;

import Y.ARunnableS99S0200000_30;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.12oD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19866712oD {
    public C19866812oE LIZ;
    public InterfaceC1041260dCe LIZIZ;
    public final String LIZJ;
    public final C19866912oF LIZLLL;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.12oC, X.12oF] */
    public C19866712oD(String str) {
        ?? r4 = new InterfaceC19866612oC() { // from class: X.12oF
        };
        this.LIZLLL = r4;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        String strLIZJ = C844470XAv.LIZJ();
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (!TextUtils.isEmpty(str)) {
            String strLIZIZ = C2222691Bz1.LIZIZ();
            String strSubstring = str.substring(str.lastIndexOf("/") + 1);
            this.LIZJ = strSubstring;
            C19866512oB c19866512oB = new C19866512oB(contextLIZ);
            c19866512oB.LIZIZ = strSubstring;
            c19866512oB.LJFF = new ArrayList();
            c19866512oB.LJII = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
            c19866512oB.LIZJ = strLIZJ;
            c19866512oB.LJIIIZ = TextUtils.isEmpty(strLIZIZ) ? "unknow" : strLIZIZ;
            C1553670qX7.LIZ.getClass();
            c19866512oB.LJIIIIZZ = C1553670qX7.LIZIZ();
            c19866512oB.LIZLLL = r4;
            c19866512oB.LJ = false;
            c19866512oB.LJI = Arrays.asList(Uri.fromFile(new C0VSJ(LIZ(C844470XAv.LIZ()), "offlineX")));
            this.LIZ = new C19866812oE(new C19866412oA(c19866512oB));
        }
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public final void LIZIZ(List list) {
        String strLIZIZ = C2222691Bz1.LIZIZ();
        C844470XAv.LIZ.getClass();
        C19866512oB c19866512oB = new C19866512oB(C844470XAv.LIZ());
        c19866512oB.LIZIZ = this.LIZJ;
        c19866512oB.LJFF = list;
        C1553670qX7.LIZ.getClass();
        c19866512oB.LJIIIIZZ = C1553670qX7.LIZIZ();
        c19866512oB.LIZLLL = this.LIZLLL;
        c19866512oB.LJ = false;
        c19866512oB.LJI = Arrays.asList(Uri.fromFile(new C0VSJ(LIZ(C844470XAv.LIZ()), "offlineX")));
        c19866512oB.LJII = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        c19866512oB.LIZJ = C844470XAv.LIZJ();
        if (TextUtils.isEmpty(strLIZIZ)) {
            strLIZIZ = "unknow";
        }
        c19866512oB.LJIIIZ = strLIZIZ;
        this.LIZ = new C19866812oE(new C19866412oA(c19866512oB));
    }

    public final synchronized WebResourceResponse LIZJ(WebView webView, String str) {
        WebResourceResponse webResourceResponseLIZ;
        InterfaceC1041260dCe interfaceC1041260dCe = this.LIZIZ;
        if (interfaceC1041260dCe == null || (webResourceResponseLIZ = interfaceC1041260dCe.LIZ(str)) == null) {
            webResourceResponseLIZ = null;
            try {
                C19866812oE c19866812oE = this.LIZ;
                if (c19866812oE != null && c19866812oE.LIZIZ) {
                    try {
                        c19866812oE.LIZ.getClass();
                        C19867112oH c19867112oH = c19866812oE.LIZJ;
                        c19867112oH.getClass();
                        try {
                            List<Pattern> list = c19867112oH.LIZ.LIZJ;
                            if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
                                InterceptorModel interceptorModel = new InterceptorModel();
                                interceptorModel.url = str;
                                WebResourceResponse webResourceResponseLIZ2 = c19867112oH.LIZ(webView, str, interceptorModel);
                                if (webResourceResponseLIZ2 == null && interceptorModel.offlineRule != null) {
                                    C786410Ut5.LJJZZIII(c19867112oH.LIZJ, new ARunnableS99S0200000_30(webView, interceptorModel, 26));
                                }
                                webResourceResponseLIZ = webResourceResponseLIZ2;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1553130qWF.LJ("WebOffline-falcon", "shouldInterceptRequest:", e);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1553130qWF.LJ("WebOffline-falcon", "shouldInterceptRequest:", th);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return webResourceResponseLIZ;
    }
}
