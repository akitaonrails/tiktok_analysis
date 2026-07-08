package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.applog.AppLog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210311Bf3 implements InterfaceC2211461Bgu {
    public static volatile boolean LIZIZ = false;
    public static volatile C2210081Beg LIZJ = null;
    public static volatile InterfaceC2210571BfT LIZLLL = null;
    public static volatile InterfaceC2206951BZd LJ = null;
    public static volatile String LJFF = null;
    public static volatile C1AF1 LJI = null;
    public static volatile String LJII = "";
    public static volatile int LJIIIIZZ;
    public static WeakReference<InterfaceC2211121BgM> LJIIIZ;
    public static volatile boolean LJIIJ;
    public static volatile boolean LJIIJJI;
    public static volatile C0XE6 LJIIL;
    public static long LJIILIIL;
    public static InterfaceC2211331Bgh LJIILJJIL;
    public static final Bundle LJIILL = new Bundle();
    public static final ConcurrentHashMap<InterfaceC2211071BgH, InterfaceC2211051BgF> LJIILLIIL = new ConcurrentHashMap<>();
    public InterfaceC2210921Bg2 LIZ;

    public static void LIZJ() {
        Object obj;
        Bundle bundle = LJIILL;
        if (bundle.size() > 0) {
            Bundle bundle2 = new Bundle();
            synchronized (bundle) {
                try {
                    C786410Ut5.LJJIIJZLJL(bundle2, bundle);
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                try {
                    obj = bundle2.get(str);
                } catch (Exception e) {
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                map.put(str, obj);
            }
            AppLog.setHeaderInfo(map);
        }
    }

    public C2210311Bf3() {
        new ArrayList();
        this.LIZ = null;
    }

    public static void LIZ(String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        boolean zEqualsIgnoreCase = "event_v3".equalsIgnoreCase(str);
        String strJ3 = null;
        if (!zEqualsIgnoreCase) {
            if (jSONObject2 != null) {
                if (jSONObject2.optInt("_event_v3") != 1) {
                    try {
                        strJ3 = C786410Ut5.J3(jSONObject2);
                    } catch (ConcurrentModificationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        try {
                            strJ3 = C786410Ut5.J3(AppLogNewUtils.LIZIZ(jSONObject2));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
            }
            AppLog.getInstance().LJJIJIIJIL(j, j2, str, str2, str3, strJ3);
            return;
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        jSONObject2.remove("_event_v3");
        jSONObject2.remove("event_v3_reserved_field_time_stamp");
        jSONObject2.remove("ab_sdk_version");
        if (jSONObject2.optInt("__applog_use_json_object") == 1) {
            jSONObject2.remove("__applog_use_json_object");
            if (jSONObject2.has("__applog_cp_ids")) {
                AppLog.getInstance().LJLJJI(jSONObject2, str2, true);
                return;
            } else {
                AppLog.getInstance().LJLJJI(jSONObject2, str2, false);
                return;
            }
        }
        try {
            strJ3 = C786410Ut5.J3(jSONObject2);
        } catch (ConcurrentModificationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            try {
                strJ3 = C786410Ut5.J3(AppLogNewUtils.LIZIZ(jSONObject2));
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
        }
        if (jSONObject2.has("__applog_cp_ids")) {
            AppLog.getInstance().LLILLL(str2, strJ3);
        } else {
            AppLog.getInstance().LJIIIZ(str2, strJ3);
        }
    }

    public final void LIZIZ(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        if ("event_v3".equals(str)) {
            C1904207d2.LIZ.LIZIZ(str2, jSONObject);
            if (((Boolean) C0VR7.LIZIZ(str2, jSONObject).getFirst()).booleanValue()) {
                LIZ(str, str2, str3, j, j2, jSONObject);
                return;
            }
            return;
        }
        LIZ(str, str2, str3, j, j2, jSONObject);
    }
}
