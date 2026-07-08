package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.chromium.CronetClient;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493630oyH extends AbstractC1493690oyN implements ICronetClient.ICronetBootFailureCheckerProvider, ICronetClient.ICronetThreadStackOptFailureCheckerProvider {
    public static volatile int LIZ = 0;
    public static Context LIZIZ = null;
    public static ICronetClient LIZJ = null;
    public static volatile C1493630oyH LIZLLL = null;
    public static volatile boolean LJ = true;
    public static volatile String LJFF;
    public static volatile String LJI;
    public static final ConcurrentHashMap<String, Integer> LJII = new ConcurrentHashMap<>();
    public static final Map<String, Integer> LJIIIIZZ = new ConcurrentHashMap();
    public static volatile ICronetAppProvider LJIIIZ;
    public static InterfaceC1493540oy8 LJIIJ;
    public static InterfaceC1493550oy9 LJIIJJI;
    public static InterfaceC1493560oyA LJIIL;
    public static InterfaceC1493570oyB LJIILIIL;

    public static void LIZIZ() {
        if (LIZJ == null) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
    }

    public static void LJI() {
        if (LIZJ == null) {
            if (C1494230ozF.LJIL) {
                LIZJ = new CronetClient();
                return;
            }
            try {
                Object objNewInstance = Class.forName(C2093608Ic.LJ("") ? "org.chromium.CronetClient" : "").newInstance();
                if (objNewInstance instanceof ICronetClient) {
                    LIZJ = (ICronetClient) objNewInstance;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetThreadStackOptFailureCheckerProvider
    public final String getThreadStackInitReason() {
        InterfaceC1493560oyA interfaceC1493560oyA = LJIIL;
        if (interfaceC1493560oyA == null) {
            return null;
        }
        return ((C1493650oyJ) interfaceC1493560oyA).LJIIJJI.toString();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetBootFailureCheckerProvider
    public final boolean isCronetBootFailureExpected() {
        InterfaceC1493540oy8 interfaceC1493540oy8 = LJIIJ;
        if (interfaceC1493540oy8 == null) {
            return false;
        }
        return interfaceC1493540oy8.isCronetBootFailureExpected();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetThreadStackOptFailureCheckerProvider
    public final boolean isCronetThreadStackOptFailureExpected() {
        InterfaceC1493560oyA interfaceC1493560oyA = LJIIL;
        if (interfaceC1493560oyA != null) {
            C1493650oyJ c1493650oyJ = (C1493650oyJ) interfaceC1493560oyA;
            c1493650oyJ.getClass();
            try {
                if (c1493650oyJ.LJIIIIZZ) {
                    c1493650oyJ.LJIIJJI = EnumC1493670oyL.CALLED_MULIT_TIMES;
                    return false;
                }
                String strLIZ = C2104008Mc.LIZ(c1493650oyJ.LJIIJ);
                c1493650oyJ.LJII = strLIZ;
                if (TextUtils.isEmpty(strLIZ)) {
                    c1493650oyJ.LJIIJJI = EnumC1493670oyL.PROCESS_NAME_NULL;
                    return false;
                }
                c1493650oyJ.LJIIIIZZ = true;
                c1493650oyJ.LIZIZ = c1493650oyJ.LJI.getBoolean("enable_stack_opt", false);
                c1493650oyJ.LIZJ = c1493650oyJ.LJI.getBoolean("enable_stack_opt_fallback_fix", true);
                c1493650oyJ.LJFF = c1493650oyJ.LJI.getLong("stack_opt_fallback_fix_interval_s", 10800L);
                c1493650oyJ.LIZLLL = c1493650oyJ.LJI.getInt(c1493650oyJ.LIZ("stack_opt_failures"), 0);
                c1493650oyJ.LJ = c1493650oyJ.LJI.getLong(c1493650oyJ.LIZ("stack_opt_failure_timestamp"), 0L);
                if (c1493650oyJ.LIZJ && c1493650oyJ.LIZLLL > 0 && System.currentTimeMillis() - c1493650oyJ.LJ > TimeUnit.SECONDS.toMillis(c1493650oyJ.LJFF)) {
                    c1493650oyJ.LJIIJJI = EnumC1493670oyL.FALLBACK_FIX;
                    c1493650oyJ.LIZLLL = 0;
                }
                if (!c1493650oyJ.LIZIZ || c1493650oyJ.LIZLLL != 0) {
                    if (c1493650oyJ.LIZIZ) {
                        c1493650oyJ.LJIIJJI = EnumC1493670oyL.CRASH_HAPPENED;
                        return false;
                    }
                    c1493650oyJ.LJIIJJI = EnumC1493670oyL.TNC_DISABLED;
                    return false;
                }
                c1493650oyJ.LJI.storeInt(c1493650oyJ.LIZ("stack_opt_failures"), c1493650oyJ.LIZLLL + 1);
                c1493650oyJ.LJI.storeLong(c1493650oyJ.LIZ("stack_opt_failure_timestamp"), System.currentTimeMillis());
                c1493650oyJ.LJIIIZ = true;
                if (c1493650oyJ.LJIIJJI == EnumC1493670oyL.FALLBACK_FIX) {
                    return true;
                }
                c1493650oyJ.LJIIJJI = EnumC1493670oyL.OPT_EFFECTIVE;
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c1493650oyJ.LJIIJJI = EnumC1493670oyL.HAS_EXCEPTION;
            }
        }
        return false;
    }

    public C1493630oyH(Context context) {
        LIZIZ = C786410Ut5.N3(context);
    }

    public static int LIZJ(String str) {
        Integer num;
        int iIntValue;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap = LJII;
        if (!concurrentHashMap.containsKey(str) || (num = concurrentHashMap.get(str)) == null || (iIntValue = num.intValue()) < 16384 || iIntValue > 10485760) {
            return 0;
        }
        return iIntValue;
    }

    public static C1493630oyH LIZLLL(Context context) {
        if (LIZLLL == null) {
            synchronized (C1493630oyH.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C1493630oyH(context);
                        LJI();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static void LJIIIIZZ(JSONObject jSONObject) {
        int iOptInt;
        ((ConcurrentHashMap) LJIIIIZZ).clear();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next) && (iOptInt = jSONObject.optInt(next)) > 0 && iOptInt <= 20971520) {
                ((ConcurrentHashMap) LJIIIIZZ).put(next, Integer.valueOf(iOptInt));
            }
        }
    }

    public static void LJIIIZ(JSONObject jSONObject) {
        LJII.clear();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            int iOptInt = jSONObject.optInt(next);
            if (!TextUtils.isEmpty(next) && iOptInt >= 16384 && iOptInt <= 10485760) {
                LJII.put(next, Integer.valueOf(iOptInt));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0095 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    @Override // X.InterfaceC1493760oyU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1494830p0D LIZ(final com.bytedance.retrofit2.client.Request r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1493630oyH.LIZ(com.bytedance.retrofit2.client.Request):X.0p0D");
    }

    public static HttpURLConnection LJ(String str, C1494600ozq c1494600ozq) {
        boolean zLIZJ;
        LJI();
        ICronetClient iCronetClient = LIZJ;
        if (iCronetClient != null) {
            iCronetClient.setCronetBootFailureCheckerProvider(LIZLLL);
            LIZJ.setCronetThreadStackOptFailureCheckerProvider(LIZLLL);
            ICronetClient iCronetClient2 = LIZJ;
            Context context = LIZIZ;
            InterfaceC1493550oy9 interfaceC1493550oy9 = LJIIJJI;
            if (interfaceC1493550oy9 == null) {
                zLIZJ = false;
            } else {
                zLIZJ = interfaceC1493550oy9.LIZJ();
            }
            return iCronetClient2.openConnection(context, str, zLIZJ, C1494230ozF.LJIILIIL, c1494600ozq, LJIIIZ);
        }
        throw new IllegalArgumentException("CronetClient is null");
    }

    public static void LJII(JSONObject jSONObject, SharedPreferences sharedPreferences) {
        if (jSONObject != null) {
            LIZ = jSONObject.optInt("cronet_inputstream_buff_size", 0);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("post_body_buffer_size");
                if (jSONObjectOptJSONObject != null) {
                    LJIIIZ(jSONObjectOptJSONObject);
                    LJFF = C786410Ut5.J3(jSONObjectOptJSONObject);
                } else {
                    LJII.clear();
                    LJFF = "";
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("path_cronet_inputstream_buff_size");
                if (jSONObjectOptJSONObject2 != null) {
                    String strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject2);
                    if (LJI != null && strJ3.equals(LJI)) {
                        return;
                    }
                    LJIIIIZZ(jSONObjectOptJSONObject2);
                    LJI = strJ3;
                } else {
                    ((ConcurrentHashMap) LJIIIIZZ).clear();
                    LJI = "";
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (sharedPreferences != null) {
            LIZ = sharedPreferences.getInt("cronet_inputstream_buff_size", 0);
            String string = sharedPreferences.getString("post_body_buffer_size", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    LJIIIZ(new JSONObject(string));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            String string2 = sharedPreferences.getString("path_cronet_inputstream_buff_size", "");
            if (!TextUtils.isEmpty(string2)) {
                try {
                    LJIIIIZZ(new JSONObject(string2));
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
        }
    }

    public final void LJFF(boolean z, boolean z2, boolean z3, ICronetAppProvider iCronetAppProvider) {
        LJI();
        ICronetClient iCronetClient = LIZJ;
        if (iCronetClient != null) {
            iCronetClient.setCronetBootFailureCheckerProvider(this);
            LIZJ.setCronetThreadStackOptFailureCheckerProvider(this);
            LIZJ.tryCreateCronetEngine(LIZIZ, false, z, false, z2, C1494230ozF.LJIILIIL, z3, iCronetAppProvider);
        }
    }
}
