package X;

import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.149f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202185149f implements C14A3 {
    public static int LIZIZ;
    public static BPEAHandler LIZLLL;
    public static InterfaceC202184149e LJ;
    public static boolean LJIIIZ;
    public static final C202185149f LIZ = new C202185149f();
    public static JSONObject LIZJ = C202156148c.LIZIZ;
    public static final List<C14A3> LJFF = new LinkedList();
    public static final List<C14A3> LJI = new LinkedList();
    public static final RunnableC202186149g LJII = new RunnableC202186149g();
    public static final RunnableC202187149h LJIIIIZZ = new RunnableC202187149h();
    public static int LJIIJ = -1;

    @Override // X.C14A3
    public final void LIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
    }

    public static void LIZJ() {
        C202188149i c202188149i = C202205149z.LIZ;
        List<C14A3> list = LJFF;
        synchronized (list) {
            try {
                ((LinkedList) list).add(c202188149i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LIZLLL(String str) {
        boolean z;
        String strEncode;
        String strEncode2;
        StringBuilder sb = new StringBuilder(str);
        try {
            if (a0.LJJIZ(str, '?', 0, false, 6) >= 0) {
                sb.append("&");
            } else {
                sb.append("?");
            }
            HashMap map = new HashMap();
            InterfaceC202184149e interfaceC202184149e = LJ;
            if (interfaceC202184149e == null) {
                interfaceC202184149e = null;
            }
            Pair pair = new Pair("aid", C202190149k.LIZ());
            map.put(pair.getFirst(), pair.getSecond());
            InterfaceC202184149e interfaceC202184149e2 = LJ;
            if (interfaceC202184149e2 == null) {
                interfaceC202184149e2 = null;
            }
            ((C202190149k) interfaceC202184149e2).getClass();
            Pair pair2 = new Pair("app_name", BdTuring.getInstance().getConfig().getAppName());
            map.put(pair2.getFirst(), pair2.getSecond());
            InterfaceC202184149e interfaceC202184149e3 = LJ;
            if (interfaceC202184149e3 == null) {
                interfaceC202184149e3 = null;
            }
            Pair pair3 = new Pair("app_version", C202190149k.LIZIZ());
            map.put(pair3.getFirst(), pair3.getSecond());
            InterfaceC202184149e interfaceC202184149e4 = LJ;
            if (interfaceC202184149e4 == null) {
                interfaceC202184149e4 = null;
            }
            ((C202190149k) interfaceC202184149e4).getClass();
            Pair pair4 = new Pair("channel", BdTuring.getInstance().getConfig().getChannel());
            map.put(pair4.getFirst(), pair4.getSecond());
            InterfaceC202184149e interfaceC202184149e5 = LJ;
            if (interfaceC202184149e5 == null) {
                interfaceC202184149e5 = null;
            }
            ((C202190149k) interfaceC202184149e5).getClass();
            Pair pair5 = new Pair("lang", BdTuring.getInstance().getConfig().getLanguage());
            map.put(pair5.getFirst(), pair5.getSecond());
            InterfaceC202184149e interfaceC202184149e6 = LJ;
            if (interfaceC202184149e6 == null) {
                interfaceC202184149e6 = null;
            }
            interfaceC202184149e6.getClass();
            Pair pair6 = new Pair("sdk_version", "3.2.3.i18n");
            map.put(pair6.getFirst(), pair6.getSecond());
            InterfaceC202184149e interfaceC202184149e7 = LJ;
            if (interfaceC202184149e7 == null) {
                interfaceC202184149e7 = null;
            }
            Pair pair7 = new Pair("version_code", C202190149k.LIZIZ());
            map.put(pair7.getFirst(), pair7.getSecond());
            for (String str2 : map.keySet()) {
                if (sb.length() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    sb.append("&");
                }
                try {
                    strEncode = URLEncoder.encode(str2, "UTF-8");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strEncode = "";
                }
                String str3 = (String) map.get(str2);
                if (str3 == null) {
                    strEncode2 = null;
                } else {
                    try {
                        strEncode2 = URLEncoder.encode(str3, "UTF-8");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        strEncode2 = "";
                    }
                }
                sb.append(strEncode);
                sb.append("=");
                sb.append(strEncode2);
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        return sb.toString();
    }

    public static String LJI(String str) {
        return LJFF(str, Intrinsics.LJIIJJI("host", ""));
    }

    public static JSONObject LJII(String str) {
        JSONObject jSONObjectOptJSONObject = LIZJ.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = C202156148c.LIZIZ.optJSONObject(str);
        }
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        try {
            if (LJ != null) {
                BdTuring.getInstance().getConfig().getServiceInterceptor();
                return jSONObjectOptJSONObject;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObjectOptJSONObject;
    }

    public static void LJIIJJI(String str) {
        try {
            LIZJ = new JSONObject(str);
            LIZJ.put("available_time", System.currentTimeMillis() + LJII("common").optLong("period", 30000L));
            C20188713z3 c20188713z3 = C20188713z3.LIZ;
            if (str != null) {
                c20188713z3.LIZIZ("settings", str);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C14A6.LIZIZ();
        }
    }

    public static String LJ(String str, String str2) {
        if (u.LJIIZILJ(str, "/", false)) {
            return Intrinsics.LJIIJJI(str2, str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('/');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJFF(String str, String str2) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = LJII(str).optJSONObject(str2);
        if (jSONObjectOptJSONObject2 == null) {
            strOptString = null;
        } else {
            InterfaceC202184149e interfaceC202184149e = LJ;
            strOptString = jSONObjectOptJSONObject2.optString(C202190149k.LIZJ());
        }
        if (!TextUtils.isEmpty(strOptString)) {
            return strOptString;
        }
        JSONObject jSONObjectOptJSONObject3 = C202156148c.LIZIZ.optJSONObject(str);
        if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject(str2)) == null) {
            return null;
        }
        InterfaceC202184149e interfaceC202184149e2 = LJ;
        return jSONObjectOptJSONObject.optString(C202190149k.LIZJ());
    }

    public static void LJIIIZ(long j, String str, String str2, String str3) {
        RunnableC202186149g runnableC202186149g = LJII;
        int i = LIZIZ;
        synchronized (runnableC202186149g) {
            runnableC202186149g.LL = str;
            runnableC202186149g.LLILLJJLI = i;
            runnableC202186149g.LLILLL = str2;
        }
        BPEAHandler bPEAHandler = LIZLLL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(runnableC202186149g);
        }
        BPEAHandler bPEAHandler2 = LIZLLL;
        if (bPEAHandler2 != null) {
            C786410Ut5.LJLIIL(j, bPEAHandler2, runnableC202186149g);
        }
    }

    public static void LJIIIIZZ(C14A3 c14a3, String str, int i, String str2, String str3, String str4) {
        RunnableC202187149h runnableC202187149h = LJIIIIZZ;
        synchronized (runnableC202187149h) {
            runnableC202187149h.LL = c14a3;
            runnableC202187149h.LLILLJJLI = str;
            runnableC202187149h.LLILLL = i;
            runnableC202187149h.LLILZ = str2;
            runnableC202187149h.LLILZIL = str3;
            runnableC202187149h.LLILZLL = str4;
        }
        BPEAHandler bPEAHandler = LIZLLL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(runnableC202187149h);
        }
        BPEAHandler bPEAHandler2 = LIZLLL;
        if (bPEAHandler2 != null) {
            C786410Ut5.LJLIIL(0L, bPEAHandler2, runnableC202187149h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[LOOP:0: B:10:0x0023->B:12:0x0033, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.C14A3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r20, int r21, long r22, java.lang.String r24, java.lang.String r25, int r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202185149f.LIZIZ(java.lang.String, int, long, java.lang.String, java.lang.String, int, java.lang.String):void");
    }
}
