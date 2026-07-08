package X;

import Y.ARunnableS134S0100000_34;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.GraphRequest;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BJM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJM {
    public static final C1BJM LIZ = new C1BJM();
    public static final AtomicBoolean LIZIZ;
    public static final ConcurrentLinkedQueue<C1BKI> LIZJ;
    public static final Map<String, JSONObject> LIZLLL;
    public static Long LJ;
    public static C2189851An9 LJFF;

    static {
        C13LE.LIZ(C1BJM.class).LJI();
        LIZIZ = new AtomicBoolean(false);
        LIZJ = new ConcurrentLinkedQueue<>();
        LIZLLL = new ConcurrentHashMap();
    }

    public static JSONObject LIZ() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("platform", "android", bundle);
        C786410Ut5.E2();
        C786410Ut5.LJJJI("sdk_version", "17.0.0", bundle);
        C786410Ut5.LJJJI("fields", "gatekeepers", bundle);
        String str = GraphRequest.LJIIIIZZ;
        GraphRequest graphRequestLJFF = C1BJA.LJFF(null, C786410Ut5.j4("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1)), null);
        graphRequestLJFF.LIZLLL = bundle;
        JSONObject jSONObject = graphRequestLJFF.LIZJ().LIZLLL;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static void LIZLLL() {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<C1BKI> concurrentLinkedQueue = LIZJ;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            C1BKI c1bkiPoll = concurrentLinkedQueue.poll();
            if (c1bkiPoll != null) {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS134S0100000_34(c1bkiPoll, 71));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[Catch: all -> 0x0081, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0019, B:10:0x0029, B:12:0x0033, B:15:0x0038, B:17:0x005b, B:18:0x0060, B:21:0x0068, B:25:0x0076, B:20:0x0065), top: B:31:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void LIZIZ(X.C2202871BJl r9) {
        /*
            java.lang.Class<X.1BJM> r8 = X.C1BJM.class
            monitor-enter(r8)
            if (r9 == 0) goto La
            java.util.concurrent.ConcurrentLinkedQueue<X.1BKI> r0 = X.C1BJM.LIZJ     // Catch: java.lang.Throwable -> L81
            r0.add(r9)     // Catch: java.lang.Throwable -> L81
        La:
            java.lang.String r5 = com.facebook.FacebookSdk.LIZLLL()     // Catch: java.lang.Throwable -> L81
            X.1BJM r1 = X.C1BJM.LIZ     // Catch: java.lang.Throwable -> L81
            java.lang.Long r0 = X.C1BJM.LJ     // Catch: java.lang.Throwable -> L81
            r1.getClass()     // Catch: java.lang.Throwable -> L81
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L38
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L81
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L81
            long r3 = r3 - r0
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L38
            java.util.Map<java.lang.String, org.json.JSONObject> r0 = X.C1BJM.LIZLLL     // Catch: java.lang.Throwable -> L81
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch: java.lang.Throwable -> L81
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L38
            LIZLLL()     // Catch: java.lang.Throwable -> L81
            monitor-exit(r8)
            return
        L38:
            android.content.Context r4 = com.facebook.FacebookSdk.LIZJ()     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "com.facebook.internal.APP_GATEKEEPERS.%s"
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L81
            r0[r6] = r5     // Catch: java.lang.Throwable -> L81
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = X.C786410Ut5.j4(r1, r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "com.facebook.internal.preferences.APP_GATEKEEPERS"
            android.content.SharedPreferences r1 = X.C810670Vr7.LIZJ(r4, r6, r0)     // Catch: java.lang.Throwable -> L81
            r0 = 0
            java.lang.String r1 = r1.getString(r3, r0)     // Catch: java.lang.Throwable -> L81
            boolean r0 = X.C0W7Q.LJIILL(r1)     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L68
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L64 java.lang.Throwable -> L81
            r0.<init>(r1)     // Catch: org.json.JSONException -> L64 java.lang.Throwable -> L81
            LIZJ(r5, r0)     // Catch: java.lang.Throwable -> L81
            goto L68
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L81
        L68:
            java.util.concurrent.Executor r2 = com.facebook.FacebookSdk.LJ()     // Catch: java.lang.Throwable -> L81
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C1BJM.LIZIZ     // Catch: java.lang.Throwable -> L81
            boolean r0 = r0.compareAndSet(r6, r7)     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L76
            monitor-exit(r8)
            return
        L76:
            Y.ARunnableS15S2100000_34 r1 = new Y.ARunnableS15S2100000_34     // Catch: java.lang.Throwable -> L81
            r0 = 1
            r1.<init>(r4, r5, r3, r0)     // Catch: java.lang.Throwable -> L81
            r2.execute(r1)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r8)
            return
        L81:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BJM.LIZIZ(X.1BJl):void");
    }

    public static final synchronized JSONObject LIZJ(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObjectOptJSONObject;
        jSONObject2 = (JSONObject) ((ConcurrentHashMap) LIZLLL).get(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        int i = 0;
        if (jSONArrayOptJSONArray != null) {
            jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        } else {
            jSONObjectOptJSONObject = null;
        }
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = new JSONArray();
        }
        int length = jSONArrayOptJSONArray2.length();
        if (length > 0) {
            while (true) {
                int i2 = i + 1;
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                    jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
            ((ConcurrentHashMap) LIZLLL).put(str, jSONObject2);
        } else {
            ((ConcurrentHashMap) LIZLLL).put(str, jSONObject2);
        }
        return jSONObject2;
    }
}
