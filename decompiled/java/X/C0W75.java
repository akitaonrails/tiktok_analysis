package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0W75, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W75 {
    public static final String[] LIZIZ;
    public static final String[] LIZJ;
    public static volatile C0W75 LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();

    static {
        C2213981Bky.LIZIZ.isDebug();
        LIZIZ = new String[]{"uid", "user_id", "author_id", "target_user_ud", "to_user_id", "from_user_id", "push_user_id", "share_user_id", "star_uid"};
        LIZJ = new String[]{"com.tellh.me.ele.", "com.ixigua.", "com.ss.", "com.bytedance."};
    }

    public static C0W75 LIZ() {
        if (LIZLLL == null) {
            synchronized (C0W75.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C0W75();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static boolean LIZJ() {
        return LJ || LJFF || LJI;
    }

    public C0W75() {
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        String channel = c2213981Bky.getChannel();
        LJFF = TextUtils.isEmpty(channel) ? false : channel.equalsIgnoreCase("local_test");
        String channel2 = c2213981Bky.getChannel();
        LJI = TextUtils.isEmpty(channel2) ? false : channel2.equalsIgnoreCase("lark_inhouse");
        LJ = c2213981Bky.isDebug();
        Keva repo = Keva.getRepo("aweme_network");
        repo.getBoolean("strict_mode", LJ);
        repo.getBoolean("request_with_compile_mode", LJ);
        repo.getString("lastInputEmailPrefix", "");
        if (LIZJ()) {
            new LinkedList();
        }
    }

    public final String LIZIZ(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(CardStruct.IStatusCode.DEFAULT, str) && !TextUtils.equals("-1", str)) {
            return this.LIZ.get(str);
        }
        return null;
    }

    public static void LJ(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && jSONObject.length() > 0) {
            try {
                for (String str2 : LIZIZ) {
                    String strOptString = jSONObject.optString(str2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sec_");
                    sbLIZ.append(str2);
                    String strOptString2 = jSONObject.optString(C2188811AlT.LIZIZ(sbLIZ));
                    if (!TextUtils.isEmpty(strOptString) && !"null".equalsIgnoreCase(strOptString) && (TextUtils.isEmpty(strOptString2) || "null".equalsIgnoreCase(strOptString2))) {
                        LJFF(str, LIZJ());
                        return;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJFF(String str, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", str);
        jSONObject.put("pages", C0W76.LIZ());
        if (z) {
            String[] strArr = LIZJ;
            StringBuilder sb = new StringBuilder();
            C089E c089e = new C089E(ThreadMethodProxy.getStackTrace(C786410Ut5.u3()));
            while (c089e.hasNext()) {
                StackTraceElement stackTraceElement = (StackTraceElement) c089e.next();
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (u.LJJIIJZLJL(stackTraceElement.getClassName(), strArr[i], false)) {
                            if (!a0.LJJJIL(sb)) {
                                sb.append("\n");
                            }
                            sb.append(stackTraceElement.getClassName());
                            sb.append(e3.h);
                            sb.append(stackTraceElement.getMethodName());
                            sb.append(":");
                            sb.append(stackTraceElement.getLineNumber());
                            sb.append(")");
                        } else {
                            i++;
                        }
                    }
                }
            }
            jSONObject.put("backtrace", sb.toString());
        }
        C794240VDq.LIZJ("log_miss_sec_uid", jSONObject);
    }

    public final void LJI(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(CardStruct.IStatusCode.DEFAULT, str) && !TextUtils.equals("-1", str) && !TextUtils.isEmpty(str2)) {
            this.LIZ.put(str, str2);
        }
    }

    public static void LIZLLL(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            try {
                LJFF(str, LIZJ());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
