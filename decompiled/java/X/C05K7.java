package X;

import Y.AfS171S0100000_2;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05K7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05K7 implements C05K8 {
    public static volatile AnonymousClass0956 LJ;
    public static volatile AnonymousClass0956 LJFF;
    public static final C05K7 LIZ = new C05K7();
    public static final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static volatile long LJI = 300000;
    public static volatile Function0<Unit> LJII = AFwS187S0000000_2.get$arr$(1050);
    public static final Object LJIIIIZZ = new Object();
    public static final Object LJIIIZ = new Object();
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public static final AtomicLong LJIIJJI = new AtomicLong(0);
    public static final Object LJIIL = new Object();
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1051));

    public static JSONObject LJI() {
        Object c098200Yq;
        try {
            c098200Yq = LJFF().getString("combined_features", null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str = (String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (str == null || a0.LJJJIL(str)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public static void LIZJ() {
        synchronized (LJIIIIZZ) {
            try {
                AnonymousClass0956 anonymousClass0956 = LJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                LJ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJ() {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        FeatureServiceManager.Companion.getClass();
        FeatureServiceManager featureServiceManagerLIZ = C1510050pOl.LIZ();
        try {
            c098200Yq = FeatureServiceManager.getFeatureSetFromDataSet$default(featureServiceManagerLIZ, "real_time_features", null, 2, null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        try {
            c098200Yq2 = FeatureServiceManager.getFeatureSetFromDataSet$default(featureServiceManagerLIZ, "video_features", null, 2, null);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        Object obj = C189200o6.m7isFailureimpl(c098200Yq2) ? null : c098200Yq2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectLJIIIIZZ = LJIIIIZZ(jSONObject, jCurrentTimeMillis);
        JSONObject jSONObjectLJIIIIZZ2 = LJIIIIZZ((JSONObject) obj, jCurrentTimeMillis);
        if (jSONObjectLJIIIIZZ == null && jSONObjectLJIIIIZZ2 == null) {
            return;
        }
        synchronized (LJIIL) {
            try {
                LIZ.getClass();
                JSONObject jSONObjectLJI = LJI();
                if (jSONObjectLJIIIIZZ != null) {
                    JSONArray jSONArrayOptJSONArray = jSONObjectLJI.optJSONArray("real_time");
                    if (jSONArrayOptJSONArray == null) {
                        jSONArrayOptJSONArray = new JSONArray();
                    }
                    jSONArrayOptJSONArray.put(jSONObjectLJIIIIZZ);
                    int iLJ = C13LZ.LJ(C117600cY.LIZ().maxRealTimeHistory, 1, 20);
                    if (jSONArrayOptJSONArray.length() > iLJ) {
                        JSONArray jSONArray = new JSONArray();
                        int length = jSONArrayOptJSONArray.length();
                        for (int length2 = jSONArrayOptJSONArray.length() - iLJ; length2 < length; length2++) {
                            jSONArray.put(jSONArrayOptJSONArray.opt(length2));
                        }
                        jSONArrayOptJSONArray = jSONArray;
                    }
                    jSONObjectLJI.put("real_time", jSONArrayOptJSONArray);
                }
                if (jSONObjectLJIIIIZZ2 != null) {
                    jSONObjectLJI.put("video", jSONObjectLJIIIIZZ2);
                }
                jSONObjectLJI.put("updated_at", jCurrentTimeMillis);
                String strJ3 = C786410Ut5.J3(jSONObjectLJI);
                try {
                    LIZ.getClass();
                    LJFF().storeString("combined_features", strJ3);
                    c098200Yq3 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq3 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq3);
                if (C189200o6.m8isSuccessimpl(c098200Yq3)) {
                    LIZ.getClass();
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectLJI.optJSONArray("real_time");
                    if (jSONArrayOptJSONArray2 != null) {
                        jSONArrayOptJSONArray2.length();
                    }
                }
                LIZ.getClass();
                LJIIJ(jSONObjectLJIIIIZZ, jSONObjectLJIIIIZZ2, jCurrentTimeMillis);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
    }

    public static Keva LJFF() {
        return (Keva) LJIILIIL.getValue();
    }

    public static void LJIIIZ() {
        AnonymousClass0956 anonymousClass0956;
        synchronized (LJIIIIZZ) {
            try {
                if (LIZJ.get() && !LJIIJ.get() && ((anonymousClass0956 = LJ) == null || !anonymousClass0956.isActive())) {
                    LJ = C23250099c.LIZLLL(LIZIZ, null, null, new C05I9(LJI, LJII, null), 3);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZLLL() {
        Object c098200Yq;
        try {
            LJFF().erase("combined_features");
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static void LIZIZ(JSONObject jSONObject) throws JSONException {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            c098200Yq = LJFF().getString("baseline_stats", null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        try {
            c098200Yq2 = C08LJ.LIZLLL(System.currentTimeMillis(), (String) c098200Yq);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (!C189200o6.m7isFailureimpl(c098200Yq2) && c098200Yq2 != null) {
            jSONObject.put("baseline", c098200Yq2);
        }
    }

    public static void LJII(long j) {
        long j2 = C117600cY.LIZ().bgUploadThresholdMs;
        if (j2 < 60000) {
            j2 = 60000;
        }
        synchronized (LJIIIZ) {
            try {
                AnonymousClass0956 anonymousClass0956 = LJFF;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                LJFF = C23250099c.LIZLLL(LIZIZ, null, null, new C05ID(j2, j, null), 3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIJJI(String str) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        synchronized (LJIIL) {
            try {
                Object obj = null;
                try {
                    LIZ.getClass();
                    c098200Yq = LJFF().getString("combined_features", null);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                String str2 = (String) c098200Yq;
                if (str2 != null && !a0.LJJJIL(str2)) {
                    try {
                        c098200Yq2 = new JSONObject(str2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                    if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                        obj = c098200Yq2;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject == null) {
                        LIZ.getClass();
                        LIZLLL();
                        return;
                    }
                    if (!jSONObject.has("real_time") && !jSONObject.has("video")) {
                        LIZ.getClass();
                        LIZLLL();
                        return;
                    }
                    LIZ.getClass();
                    LIZIZ(jSONObject);
                    jSONObject.put("upload_reason", str);
                    try {
                        AppLogNewUtils.onEventV3("exit_reason_features", jSONObject);
                        c098200Yq3 = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq3);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        c098200Yq3 = new C098200Yq(th3);
                        C189200o6.m2constructorimpl(c098200Yq3);
                    }
                    C189200o6.m5exceptionOrNullimpl(c098200Yq3);
                    if (C189200o6.m8isSuccessimpl(c098200Yq3)) {
                    }
                    LIZ.getClass();
                    LIZLLL();
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
    }

    public static JSONObject LJIIIIZZ(JSONObject jSONObject, long j) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.opt(next));
                }
                jSONObject2.put("ts", j);
                return jSONObject2;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // X.C05K8
    public final void LIZ(long j, Function0<Unit> function0) {
        Object c098200Yq;
        if (!LIZJ.compareAndSet(false, true)) {
            return;
        }
        if (j <= 0) {
            j = 300000;
        }
        LJI = j;
        LJII = function0;
        C23250099c.LIZLLL(LIZIZ, null, null, new C05IC(null), 3);
        if (LIZLLL.compareAndSet(false, true)) {
            try {
                c098200Yq = C1906580ziK.LIZJ().LIZJ().LJLLLLLL(new AfS171S0100000_2(this, 50));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        LJIIIZ();
    }

    public static void LJIIJ(JSONObject jSONObject, JSONObject jSONObject2, long j) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object obj = null;
        try {
            c098200Yq = LJFF().getString("baseline_stats", null);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        try {
            c098200Yq2 = C08LJ.LJIIJ((String) c098200Yq, j, jSONObject, jSONObject2);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj = c098200Yq2;
        }
        String str = (String) obj;
        if (str == null) {
            return;
        }
        try {
            LJFF().storeString("baseline_stats", str);
            c098200Yq3 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq3);
        C189200o6.m8isSuccessimpl(c098200Yq3);
    }
}
