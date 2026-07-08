package X;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bhr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212051Bhr {
    public static volatile C2212051Bhr LIZIZ;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static C2212051Bhr LIZJ() {
        if (LIZIZ == null) {
            synchronized (C2212051Bhr.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C2212051Bhr();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public C2212051Bhr() {
        new ArrayList();
    }

    public static long LIZLLL(C2212201Bi6 c2212201Bi6) {
        if (c2212201Bi6 != null) {
            try {
                return CastLongProtector.parseLong(c2212201Bi6.LLLFFI);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return 0L;
            }
        }
        return 0L;
    }

    public final void LJI(boolean z) {
        int i;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        int i2 = 0;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            jSONObject2.putOpt("is_empty_data", Integer.valueOf(i));
            if (C2212231Bi9.LJJIJIIJI == 1) {
                i2 = 1;
            }
            jSONObject2.put("is_cold_start", i2);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("log_extra", C2212061Bhs.LIZIZ().LIZJ());
            jSONObject.putOpt("is_ad_event", "1");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJFF("splash_ad", "parse_finished", jSONObject, 84378473382L);
    }

    public final void LJII(boolean z) {
        HashMap<String, Object> map = new HashMap<>();
        HashMap<String, Object> map2 = new HashMap<>();
        int i = 1;
        if (C2212231Bi9.LJJIJIIJI != 1) {
            i = 0;
        }
        map.put("is_cold_start", Integer.valueOf(i));
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(z ? 1 : 0));
        map2.put("log_extra", C2212061Bhs.LIZIZ().LIZJ());
        LJIIIIZZ(null, 84378473382L, "response", map2, map);
    }

    public final void LJIIJ(Runnable runnable) {
        if (C2212231Bi9.LJIIIIZZ().LJ) {
            C2212231Bi9.LJFF.execute(runnable);
        } else {
            C786410Ut5.LJJZZIII(this.LIZ, runnable);
        }
    }

    public static void LIZ(HashMap map, JSONObject jSONObject) throws JSONException {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(str) && value != null) {
                    jSONObject.putOpt(str, value);
                }
            }
        }
    }

    public final void LJIIIZ(C2212201Bi6 c2212201Bi6, String str) {
        if (c2212201Bi6 != null && !C1293990jmH.LIZ(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(c2212201Bi6.LLJJIJI)) {
                    jSONObject.put("log_extra", c2212201Bi6.LLJJIJI);
                }
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", c2212201Bi6.LLILLJJLI);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0VO0.LIZ("error in putting log_extra into json");
            }
            LJFF("splash_ad", str, jSONObject, c2212201Bi6.LLJI);
        }
    }

    public final void LJIIJJI(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("diff", Long.valueOf(C2212161Bi2.LJII() - System.currentTimeMillis()));
            jSONObject2.putOpt("server_time", Long.valueOf(C2212161Bi2.LJII()));
            jSONObject2.putOpt("device_time", Long.valueOf(System.currentTimeMillis()));
            int i3 = C2212231Bi9.LJJIJIIJI;
            if (i3 != -1) {
                jSONObject2.put("is_cold_start", i3);
            }
            jSONObject2.putOpt("is_time_valid", Integer.valueOf(i));
            jSONObject2.putOpt("invalid_reason", Integer.valueOf(i2));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.putOpt("log_extra", C2212061Bhs.LIZIZ().LIZJ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0VO0.LIZ("error in putting data into json");
        }
        LJFF("splash_ad", "valid_time", jSONObject, 84378473382L);
    }

    public final void LJFF(final String str, final String str2, final JSONObject jSONObject, final long j) {
        Runnable runnable = new Runnable() { // from class: X.1Bhj
            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject2 = jSONObject;
                String str3 = str;
                String str4 = str2;
                long j2 = j;
                C1C7U.LIZ("SplashAdEventLogManager@2beb.onEvent$2L");
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("ad_extra_data");
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                    }
                    long jOptLong = jSONObject2.optLong("ad_fetch_time", 0L);
                    if (jOptLong != 0) {
                        try {
                            jSONObjectOptJSONObject.putOpt("ad_fetch_time", Long.valueOf(jOptLong));
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C0VO0.LIZ("error in transferring ad fetch time");
                        }
                    }
                    jSONObjectOptJSONObject.putOpt("current_time", C2211531Bh1.LIZ(System.currentTimeMillis()));
                    jSONObject2.putOpt("ad_extra_data", jSONObjectOptJSONObject);
                    jSONObject2.put("is_ad_event", "1");
                }
                InterfaceC20685715x1 interfaceC20685715x1 = C2212231Bi9.LIZIZ;
                if (interfaceC20685715x1 != null) {
                    ((C20685515wz) interfaceC20685715x1).LIZ(str3, str4, j2, jSONObject2);
                }
                C1C7U.LIZIZ("SplashAdEventLogManager@2beb.onEvent$2L");
            }
        };
        if (C2212231Bi9.LJIIIIZZ().LJ) {
            C2212231Bi9.LJFF.execute(runnable);
        } else {
            C786410Ut5.LJJZZIII(this.LIZ, runnable);
        }
    }

    public final void LJ(int i, final long j, final String str, final String str2, final JSONObject jSONObject) {
        if (i > 5) {
            return;
        }
        if (C2212231Bi9.LJFF == null) {
            final int i2 = i + 1;
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LIZ, new Runnable() { // from class: X.0cwO
                @Override // java.lang.Runnable
                public final void run() {
                    C2212051Bhr c2212051Bhr = this.LL;
                    long j2 = j;
                    String str3 = str;
                    String str4 = str2;
                    JSONObject jSONObject2 = jSONObject;
                    int i3 = i2;
                    c2212051Bhr.getClass();
                    C1C7U.LIZ("SplashAdEventLogManager@2beb.onEvent$1L");
                    try {
                        c2212051Bhr.LJ(i3, j2, str3, str4, jSONObject2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    C1C7U.LIZIZ("SplashAdEventLogManager@2beb.onEvent$1L");
                }
            });
        } else {
            LJFF(str, str2, jSONObject, j);
        }
    }

    public final void LJIIIIZZ(C2212201Bi6 c2212201Bi6, long j, String str, HashMap<String, Object> map, HashMap<String, Object> map2) {
        String str2;
        long j2 = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            LIZ(map, jSONObject);
            LIZ(map2, jSONObject2);
            if (c2212201Bi6 != null) {
                if (!TextUtils.isEmpty(c2212201Bi6.LLJJIJI)) {
                    jSONObject.put("log_extra", c2212201Bi6.LLJJIJI);
                }
                jSONObject.put("ad_fetch_time", c2212201Bi6.LLILLJJLI);
                jSONObject2.putOpt("load_type", Integer.valueOf(c2212201Bi6.LLJLILLLLZIIL));
                if (c2212201Bi6.LJIIIIZZ()) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject2.putOpt("is_topview", str2);
            }
            jSONObject.put("is_ad_event", "1");
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            if (c2212201Bi6 != null) {
                j2 = c2212201Bi6.LLJI;
            }
            LJ(0, j2, "splash_ad", str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0VO0.LIZ("error in putting log_extra into json");
        }
    }

    public static JSONObject LIZIZ(C2212201Bi6 c2212201Bi6, long j, boolean z, long j2, int i, JSONObject jSONObject) {
        long jLJFF;
        String str;
        long jLJI;
        JSONObject jSONObject2 = new JSONObject();
        try {
            long j3 = C2212061Bhs.LIZIZ().LIZLLL;
            long j4 = C2212061Bhs.LIZIZ().LIZJ;
            long j5 = C2212061Bhs.LIZIZ().LJI;
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iLIZIZ = C2212141Bi0.LJIIIIZZ().LIZJ.LIZIZ("splash_ad_show_limit");
            int iLJIILIIL = C2212141Bi0.LJIIIIZZ().LJIILIIL();
            if (c2212201Bi6 != null) {
                jLJFF = c2212201Bi6.LJFF();
                jLJI = c2212201Bi6.LJI();
                str = c2212201Bi6.LLJJIJI;
            } else {
                jLJFF = 0;
                str = null;
                jLJI = 0;
            }
            jSONObject2.put("adId", LIZLLL(c2212201Bi6));
            jSONObject2.put("useTime", j);
            jSONObject2.put("showLimit", iLIZIZ);
            jSONObject2.put("showCount", iLJIILIIL);
            jSONObject2.put("clientTime", jCurrentTimeMillis);
            jSONObject2.put("isColdLaunch", z);
            jSONObject2.put("lashShowTime", j2);
            jSONObject2.put("leaveInterval", j3);
            jSONObject2.put("splashInterval", j4);
            jSONObject2.put("timeInvalidReason", i);
            jSONObject2.put("coldBootInterval", j5);
            jSONObject2.put("displayEnd", jLJFF);
            jSONObject2.put("displayStart", jLJI);
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("log_extra", str);
            }
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject2;
    }
}
