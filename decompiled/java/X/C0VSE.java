package X;

import Y.ARunnableS113S0100000_13;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VSE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VSE {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ = true;

    public static final boolean LIZ(Uri uri) {
        String path;
        if (uri == null || (path = uri.getPath()) == null) {
            return false;
        }
        return LIZIZ(path);
    }

    public static final boolean LIZIZ(String str) {
        if (str == null || !LJIIIIZZ) {
            return false;
        }
        if (!u.LJJIIJZLJL(str, "../", false) && !a0.LJJIIZI(str, "/../", false)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("child", str);
            jSONObject.put("parent", "");
            StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (i >= 3) {
                    if (stringBuffer.length() > 0) {
                        stringBuffer.append(System.getProperty("line.separator"));
                    }
                    stringBuffer.append(stackTraceElement.toString());
                } else {
                    i++;
                }
            }
            C0VSO c0vso = new C0VSO("path_traversal_string_arg1", System.currentTimeMillis(), C786410Ut5.J3(jSONObject), stringBuffer.toString());
            C0VJP.LIZ().execute(new ARunnableS113S0100000_13(c0vso, 42));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AOPReportEvent: ");
            sbLIZ.append(c0vso);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!TextUtils.isEmpty(strLIZIZ)) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("SecurityAOPCheck", strLIZIZ);
                return true;
            }
            return true;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("SecurityAOPCheck", Log.getStackTraceString(e));
            return true;
        }
    }
}
