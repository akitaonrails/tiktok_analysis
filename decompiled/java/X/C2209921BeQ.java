package X;

import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209921BeQ implements Handler.Callback {
    public static final List<String> LLJILJILJ = Collections.singletonList("MonitorV3Helper");
    public static final String LLJILLL = UUID.randomUUID().toString();
    public static int LLJJ = 3590;
    public final C2210031Beb LL;
    public final C830300Whg LLILLJJLI;
    public final C2176391AFp LLILLL;
    public final C830280Whe LLILZ;
    public final C0NBM LLILZIL;
    public final C830260Whc LLILZLL;
    public final JSONObject LLIZ;
    public BPEAHandler LLIZLLLIL;
    public C2210161Beo LLJ;
    public final C2192591ArZ LLJI;
    public final AtomicBoolean LLJIJIL;
    public final JSONObject LLJILJIL;

    public final boolean LJFF() {
        C2210031Beb c2210031Beb = this.LL;
        return c2210031Beb.LIZIZ && c2210031Beb.LJIIIZ;
    }

    public C2209921BeQ() {
        C2210031Beb c2210031Beb = new C2210031Beb();
        this.LL = c2210031Beb;
        this.LLILLJJLI = new C830300Whg();
        this.LLILLL = new C2176391AFp(c2210031Beb);
        this.LLILZ = new C830280Whe(c2210031Beb);
        this.LLILZIL = new C0NBM();
        this.LLILZLL = new C830260Whc(c2210031Beb);
        this.LLIZ = new JSONObject();
        this.LLJI = new C2192591ArZ();
        this.LLJIJIL = new AtomicBoolean(false);
        this.LLJILJIL = new JSONObject();
        LJIIJ("cold_start_id", LLJILLL);
    }

    public final void LIZJ(C2210161Beo c2210161Beo) {
        Map<String, Integer> map;
        C2209791BeD.LJIJJ().LJIIIZ(8, LLJILJILJ, "init monitor v3 helper with config: {}", c2210161Beo);
        if (!this.LLJIJIL.compareAndSet(false, true)) {
            return;
        }
        this.LLJ = c2210161Beo;
        C2210201Bes c2210201Bes = c2210161Beo.LIZIZ;
        if (this.LL.LIZIZ && c2210161Beo.LIZ != null && c2210201Bes != null) {
            LJIIJ("aid", String.valueOf(LLJJ));
            LJIIJ("host_aid", c2210201Bes.LIZ);
            LJIIJ("channel", c2210201Bes.LIZIZ);
            LJIIJ("cdid", c2210201Bes.LJIIJ);
            LJIIJ("sdk_version_v2", c2210201Bes.LJIIIZ);
            LJIIJ("os", "Android");
            LJIIJ("os_version", Build.VERSION.RELEASE);
            LJIIJ("app_name", c2210201Bes.LIZLLL);
            LJIIJ("app_version", c2210201Bes.LIZJ);
            LJIIJ("update_version_code", String.valueOf(c2210201Bes.LJ));
            if (c2210201Bes.LJFF) {
                LJII(1L, "log_enable");
            }
            if (c2210201Bes.LJIIJJI) {
                LJII(1L, "devtools_enable");
            }
            if (c2210201Bes.LJI) {
                LJII(1L, "tourist_mode");
            }
            if (c2210201Bes.LJII) {
                LJII(1L, "frequency_control_enable");
            }
            if (c2210201Bes.LJIIIIZZ) {
                LJII(1L, "log_event_filter_enable");
            }
            if (this.LL.LJIILJJIL) {
                LJII(1L, "debug_mode");
            }
            LJII(c2210161Beo.LIZJ, "report_interval");
            String str = c2210201Bes.LIZ;
            C2210031Beb c2210031Beb = this.LL;
            Context context = c2210161Beo.LIZ;
            c2210031Beb.getClass();
            if (context != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("@applog_monitor_config");
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ));
                c2210031Beb.LIZ = sharedPreferencesLIZJ;
                JSONObject jSONObject = c2210031Beb.LJIILIIL;
                if (jSONObject != null && sharedPreferencesLIZJ != null) {
                    c2210031Beb.LIZIZ(jSONObject);
                } else {
                    if (!sharedPreferencesLIZJ.contains("enabled")) {
                        c2210031Beb.LIZIZ = C2210031Beb.LJIILL;
                        c2210031Beb.LIZJ = 1048576;
                        c2210031Beb.LIZLLL = 10;
                        c2210031Beb.LJ = true;
                        c2210031Beb.LJFF = true;
                        c2210031Beb.LJI = C2210031Beb.LJIILLIIL;
                        c2210031Beb.LJII = C2210031Beb.LJIIZILJ;
                        c2210031Beb.LJIIIIZZ = 7;
                        c2210031Beb.LJIIIZ = C2210031Beb.LJIJ;
                        c2210031Beb.LJIIJ = C2210031Beb.LJIJI;
                        c2210031Beb.LJIIJJI = C2210031Beb.LJIJJ;
                        c2210031Beb.LJIIL = null;
                    } else {
                        c2210031Beb.LIZIZ = c2210031Beb.LIZ.getBoolean("enabled", C2210031Beb.LJIILL);
                        c2210031Beb.LIZJ = c2210031Beb.LIZ.getInt("max_request_body_size_kb", 1048576);
                        c2210031Beb.LIZLLL = c2210031Beb.LIZ.getInt("max_request_count", 10);
                        c2210031Beb.LJ = c2210031Beb.LIZ.getBoolean("error_report_enable", true);
                        c2210031Beb.LJFF = c2210031Beb.LIZ.getBoolean("latency_report_enable", true);
                        c2210031Beb.LJI = c2210031Beb.LIZ.getLong("report_interval_ms", C2210031Beb.LJIILLIIL);
                        c2210031Beb.LJII = c2210031Beb.LIZ.getLong("coldstart_report_delay_ms", C2210031Beb.LJIIZILJ);
                        c2210031Beb.LJIIIIZZ = c2210031Beb.LIZ.getInt("data_keep_alive_days", 7);
                        c2210031Beb.LJIIIZ = c2210031Beb.LIZ.getBoolean("sentry_enabled", C2210031Beb.LJIJ);
                        c2210031Beb.LJIIJ = c2210031Beb.LIZ.getInt("sentry_coldstart_sampling_rate", C2210031Beb.LJIJI);
                        c2210031Beb.LJIIJJI = c2210031Beb.LIZ.getInt("network_coldstart_sampling_rate", C2210031Beb.LJIJJ);
                        String string = c2210031Beb.LIZ.getString("sentry_events", null);
                        if (!TextUtils.isEmpty(string)) {
                            try {
                                c2210031Beb.LIZ(new JSONObject(string));
                            } catch (Throwable th) {
                            }
                        }
                    }
                    if (c2210031Beb.LJIILJJIL) {
                        c2210031Beb.LIZJ(true);
                    }
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c2210201Bes.LIZ);
            sbLIZ2.append("@applog_monitor_v3");
            HandlerThread handlerThread = new HandlerThread(C2188811AlT.LIZIZ(sbLIZ2));
            final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = handlerThread.getUncaughtExceptionHandler();
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.1Bey
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2;
                    C2209791BeD.LJIJJ().LJIILLIIL(8, C2209921BeQ.LLJILJILJ, "monitor thread crash!", th2, new Object[0]);
                    if (this.LIZIZ.LL.LJIILJJIL && (uncaughtExceptionHandler2 = uncaughtExceptionHandler) != null) {
                        uncaughtExceptionHandler2.uncaughtException(thread, th2);
                    }
                }
            });
            handlerThread.start();
            BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread), this);
            this.LLIZLLLIL = bPEAHandler;
            C786410Ut5.LJLJJI(1, this.LL.LJII, bPEAHandler);
            this.LLILLJJLI.getClass();
            C2176391AFp c2176391AFp = this.LLILLL;
            Context context2 = c2210161Beo.LIZ;
            c2176391AFp.getClass();
            InterfaceC2209561Bdq interfaceC2209561BdqLJIJJ = C2209791BeD.LJIJJ();
            List<String> list = C2176391AFp.LLIZLLLIL;
            interfaceC2209561BdqLJIJJ.LJIIIZ(8, list, "init with prefix sp: {}.", str);
            if (!c2176391AFp.LLIZ.compareAndSet(false, true)) {
                C2209791BeD.LJIJJ().LJIILJJIL(8, list, "init failed for already initialized with sp prefix:{}.", str);
            } else {
                C2210031Beb c2210031Beb2 = c2176391AFp.LLILZIL;
                if (!c2210031Beb2.LJIIIZ) {
                    C2209791BeD.LJIJJ().LJIIIZ(8, list, "init but disabled!!!", new Object[0]);
                    c2176391AFp.LLILZLL = false;
                    c2176391AFp.LL.clear();
                    c2176391AFp.LLILLJJLI = false;
                } else {
                    c2176391AFp.LLILZLL = C19865812o4.LIZ(c2210031Beb2.LJIIJ);
                    C2209791BeD.LJIJJ().LJIIIZ(8, list, "sentry acceptAllEvents = {}", Boolean.valueOf(c2176391AFp.LLILZLL));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append("@applog_monitor_sentry");
                    c2176391AFp.LLILZ = C810670Vr7.LIZJ(context2, 0, C2188811AlT.LIZIZ(sbLIZ3));
                    if (!c2176391AFp.LIZLLL() && !c2176391AFp.LL.isEmpty()) {
                        C2209791BeD.LJIJJ().LJIIIZ(8, list, "start reset cache map...", new Object[0]);
                        if (!c2176391AFp.LIZLLL() && ((map = c2176391AFp.LLILZIL.LJIIL) == null || map.isEmpty())) {
                            c2176391AFp.LL.clear();
                        } else {
                            synchronized (c2176391AFp.LL) {
                                try {
                                    for (Map.Entry<String, C21655019oy> entry : c2176391AFp.LL.entrySet()) {
                                        if (!c2176391AFp.LJ(entry.getValue().LIZ.LIZ)) {
                                            c2176391AFp.LL.remove(entry.getKey());
                                        }
                                    }
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                    }
                    BPEAHandler bPEAHandler2 = new BPEAHandler(C786410Ut5.W2(handlerThread), c2176391AFp);
                    c2176391AFp.LLILLL = bPEAHandler2;
                    bPEAHandler2.removeMessages(4);
                    C786410Ut5.LJLJJI(4, 500L, c2176391AFp.LLILLL);
                    C786410Ut5.LJLJJI(12, Math.max(10000L, c2176391AFp.LLILZIL.LJII - 10000) + ((long) new SecureRandom().nextInt(9000)), c2176391AFp.LLILLL);
                }
            }
            C830280Whe c830280Whe = this.LLILZ;
            Context context3 = c2210161Beo.LIZ;
            c830280Whe.getClass();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append("@applog_monitor_stats");
            c830280Whe.LLILZ = C810670Vr7.LIZJ(context3, 0, C2188811AlT.LIZIZ(sbLIZ4));
            BPEAHandler bPEAHandler3 = new BPEAHandler(C786410Ut5.W2(handlerThread), c830280Whe);
            c830280Whe.LLILLJJLI = bPEAHandler3;
            bPEAHandler3.removeMessages(8);
            C786410Ut5.LJLJJI(8, 500L, c830280Whe.LLILLJJLI);
            C786410Ut5.LJLJJI(24, Math.max(10000L, c830280Whe.LLILZIL.LJII - 10000) + ((long) new SecureRandom().nextInt(9000)), c830280Whe.LLILLJJLI);
            C830260Whc c830260Whc = this.LLILZLL;
            Context context4 = c2210161Beo.LIZ;
            c830260Whc.getClass();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str);
            sbLIZ5.append("@applog_monitor_network");
            c830260Whc.LLILZ = C810670Vr7.LIZJ(context4, 0, C2188811AlT.LIZIZ(sbLIZ5));
            c830260Whc.LL = C19865812o4.LIZ(c830260Whc.LLILZIL.LJIIJJI);
            BPEAHandler bPEAHandler4 = new BPEAHandler(C786410Ut5.W2(handlerThread), c830260Whc);
            c830260Whc.LLILLJJLI = bPEAHandler4;
            bPEAHandler4.removeMessages(8);
            C786410Ut5.LJLJJI(8, 500L, c830260Whc.LLILLJJLI);
            C786410Ut5.LJLJJI(24, Math.max(10000L, c830260Whc.LLILZIL.LJII - 10000) + ((long) new SecureRandom().nextInt(9000)), c830260Whc.LLILLJJLI);
            return;
        }
        this.LLILLJJLI.LIZIZ = 0;
        C2176391AFp c2176391AFp2 = this.LLILLL;
        c2176391AFp2.getClass();
        C2209791BeD.LJIJJ().LJIIIZ(8, C2176391AFp.LLIZLLLIL, "init with disabled", new Object[0]);
        c2176391AFp2.LLILLJJLI = false;
        c2176391AFp2.LL.clear();
        c2176391AFp2.LLIZ.set(true);
        C830280Whe c830280Whe2 = this.LLILZ;
        c830280Whe2.LL = false;
        ((ConcurrentHashMap) c830280Whe2.LLILLL).clear();
        this.LLILZIL.LIZ = false;
        C830260Whc c830260Whc2 = this.LLILZLL;
        c830260Whc2.LL = false;
        ((ConcurrentHashMap) c830260Whc2.LLILLL).clear();
    }

    public final boolean LIZLLL(String str) {
        Integer num;
        if (!LJFF()) {
            return false;
        }
        C2176391AFp c2176391AFp = this.LLILLL;
        if (!c2176391AFp.LIZLLL() && c2176391AFp.LLIZ.get()) {
            if (!c2176391AFp.LJ(str) || (num = c2176391AFp.LLILZIL.LJIIL.get(str)) == null || num.intValue() <= 0) {
                return false;
            }
            return C19865812o4.LIZ(num.intValue());
        }
        return true;
    }

    public final boolean LJ(String str) {
        if (!LJFF()) {
            return false;
        }
        return this.LLILLL.LJ(str);
    }

    public final void LJIIIZ(String str) {
        if (!this.LL.LIZIZ) {
            return;
        }
        C2209791BeD.LJIJJ().LJIIIZ(8, LLJILJILJ, "setHeader {} = {}", "device_id", str);
        try {
            this.LLIZ.put("device_id", str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C2210161Beo c2210161Beo;
        if (message.what == 1) {
            boolean zLJI = MethodIDManager.LJI(137210);
            if (this.LL.LIZIZ && (c2210161Beo = this.LLJ) != null && c2210161Beo.LIZLLL != null && c2210161Beo.LJ != null && !TextUtils.isEmpty(c2210161Beo.LJFF)) {
                C2209791BeD.LJIJJ().LJIIIZ(8, LLJILJILJ, "start doReport...", new Object[0]);
                C2210031Beb c2210031Beb = this.LL;
                final long j = c2210031Beb.LIZJ;
                final int i = c2210031Beb.LIZLLL;
                C2210161Beo c2210161Beo2 = this.LLJ;
                final InterfaceC23070092e interfaceC23070092e = c2210161Beo2.LIZLLL;
                final String str = c2210161Beo2.LJFF;
                c2210161Beo2.LJ.submit(new Runnable() { // from class: X.0X9g
                    public final void LIZ() {
                        JSONObject jSONObject;
                        JSONArray jSONArray;
                        Pair<Map<String, C21655019oy>, Long> pairLIZJ;
                        Pair<Map<String, Integer>, Long> pairLIZIZ;
                        Pair<Map<String, JSONObject>, Long> pairLIZ;
                        Pair<Map<String, JSONObject>, Long> pairLIZ2;
                        Pair<Map<String, C830250Whb>, Long> pairLIZIZ2;
                        int i2 = 0;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < i) {
                            if (i4 >= 2) {
                                C2209791BeD.LJIJJ().LJIIIZ(8, C2209921BeQ.LLJILJILJ, "report failed and break with try 2 times: {}.", new Object[i2]);
                                this.LLILZIL.LIZ(1, "monitor_report_failed_2_tries");
                                return;
                            }
                            try {
                                Thread.sleep(3000L);
                            } catch (InterruptedException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            long jLongValue = j;
                            try {
                                jSONObject = new JSONObject();
                                InterfaceC844070X9h interfaceC844070X9h = this.LLILZIL.LLJ.LJI;
                                if (interfaceC844070X9h != null) {
                                    try {
                                        JSONObject jSONObjectLIZ = ((C2210231Bev) interfaceC844070X9h).LIZ();
                                        if (jSONObjectLIZ != null && jSONObjectLIZ.length() > 0) {
                                            Iterator<String> itKeys = jSONObjectLIZ.keys();
                                            while (itKeys.hasNext()) {
                                                String next = itKeys.next();
                                                this.LLILZIL.LLIZ.put(next, jSONObjectLIZ.opt(next));
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        TryCatchGuardChecker.doCheck(th);
                                        C2209791BeD.LJIJJ().LJIILLIIL(8, C2209921BeQ.LLJILJILJ, "report to server failed!", th, new Object[0]);
                                        i4++;
                                        i3++;
                                        i2 = 0;
                                    }
                                }
                                C2209921BeQ c2209921BeQ = this.LLILZIL;
                                c2209921BeQ.LLIZ.put("feature_options", c2209921BeQ.LLJILJIL);
                                jSONObject.put("header", this.LLILZIL.LLIZ);
                                jSONArray = new JSONArray();
                                pairLIZJ = this.LLILZIL.LLILLL.LIZJ(jLongValue);
                                Object obj = pairLIZJ.first;
                                if (obj != null) {
                                    this.LLILZIL.LLILLL.getClass();
                                    C2176391AFp.LIZIZ((Map) obj, jSONArray);
                                    jLongValue = ((Long) pairLIZJ.second).longValue();
                                }
                                pairLIZIZ = this.LLILZIL.LLILZ.LIZIZ(jLongValue);
                                Object obj2 = pairLIZIZ.first;
                                if (obj2 != null) {
                                    this.LLILZIL.LLILZ.getClass();
                                    C830280Whe.LIZ((Map) obj2, jSONArray);
                                    jLongValue = ((Long) pairLIZIZ.second).longValue();
                                }
                                pairLIZ = this.LLILZIL.LLILLJJLI.LIZ(jLongValue);
                                Object obj3 = pairLIZ.first;
                                if (obj3 != null) {
                                    this.LLILZIL.LLILLJJLI.getClass();
                                    Iterator it2 = ((Map) obj3).values().iterator();
                                    while (it2.hasNext()) {
                                        jSONArray.put((JSONObject) it2.next());
                                    }
                                    jLongValue = ((Long) pairLIZ.second).longValue();
                                }
                                pairLIZ2 = this.LLILZIL.LLILZIL.LIZ(jLongValue);
                                Object obj4 = pairLIZ2.first;
                                if (obj4 != null) {
                                    this.LLILZIL.LLILZIL.getClass();
                                    Iterator it3 = ((Map) obj4).values().iterator();
                                    while (it3.hasNext()) {
                                        jSONArray.put((JSONObject) it3.next());
                                    }
                                    jLongValue = ((Long) pairLIZ2.second).longValue();
                                }
                                pairLIZIZ2 = this.LLILZIL.LLILZLL.LIZIZ(jLongValue);
                                Object obj5 = pairLIZIZ2.first;
                                if (obj5 != null) {
                                    this.LLILZIL.LLILZLL.getClass();
                                    C830260Whc.LIZ((Map) obj5, jSONArray);
                                    jLongValue = ((Long) pairLIZIZ2.second).longValue();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            if (jSONArray.length() == 0) {
                                C2209791BeD.LJIJJ().LJIIIZ(8, C2209921BeQ.LLJILJILJ, "report break for no any event!", new Object[i2]);
                                return;
                            }
                            jSONObject.put("event_v3", jSONArray);
                            byte[] bArrLIZ = C844080X9i.LIZ(C786410Ut5.J3(jSONObject).getBytes("UTF-8"));
                            HashMap map = new HashMap();
                            map.put("log-encode-type", "gzip");
                            map.put("Content-Encoding", "gzip");
                            map.put("Content-Type", "application/octet-stream;tt-data=b");
                            map.put("x-tt-request-tag", "t=0;n=0");
                            String strPost = interfaceC23070092e.post(str, map, bArrLIZ);
                            InterfaceC2209561Bdq interfaceC2209561BdqLJIJJ = C2209791BeD.LJIJJ();
                            List<String> list = C2209921BeQ.LLJILJILJ;
                            try {
                                interfaceC2209561BdqLJIJJ.LJIIIZ(8, list, "report with left body size left: {} and response: {}.", Long.valueOf(jLongValue), strPost);
                                if (TextUtils.isEmpty(strPost) || !"success".equals(JSONObjectProtectorUtils.getString(new JSONObject(strPost), "message"))) {
                                    i4++;
                                } else {
                                    C2209791BeD.LJIJJ().LJFF(8, list, "report to server success!", new Object[0]);
                                    this.LLILZIL.LLILLL.LJI((Map) pairLIZJ.first);
                                    this.LLILZIL.LLILZ.LJFF((Map) pairLIZIZ.first);
                                    C830300Whg c830300Whg = this.LLILZIL.LLILLJJLI;
                                    c830300Whg.getClass();
                                    C0NBM c0nbm = this.LLILZIL.LLILZIL;
                                    c0nbm.getClass();
                                    C830260Whc c830260Whc = this.LLILZIL.LLILZLL;
                                    Map map2 = (Map) pairLIZIZ2.first;
                                    c830260Whc.getClass();
                                    if (map2 != null && !map2.isEmpty()) {
                                        C786410Ut5.LJJZZIII(c830260Whc.LLILLJJLI, new ARunnableS81S0200000_12(map2, c830260Whc, 145));
                                    }
                                    if (jLongValue > 0) {
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                TryCatchGuardChecker.doCheck(th);
                                C2209791BeD.LJIJJ().LJIILLIIL(8, C2209921BeQ.LLJILJILJ, "report to server failed!", th, new Object[0]);
                                i4++;
                            }
                            i3++;
                            i2 = 0;
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("MonitorV3Helper@6dc4.doReport$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("MonitorV3Helper@6dc4.doReport$1");
                    }
                });
                this.LLIZLLLIL.removeMessages(1);
                C786410Ut5.LJLJJI(1, this.LL.LJI, this.LLIZLLLIL);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            } else if (zLJI) {
                MethodIDManager.LJ();
                return false;
            }
        }
        return false;
    }

    public final void LIZ(int i, String str) {
        if (!this.LL.LIZIZ) {
            return;
        }
        C2209791BeD.LJIJJ().LJIIIZ(8, LLJILJILJ, "increaseStats {} +{}", str, Integer.valueOf(i));
        this.LLILZ.LIZJ(i, str);
    }

    public final void LIZIZ(EnumC2210021Bea enumC2210021Bea, int i) {
        if (!this.LL.LIZIZ) {
            return;
        }
        C2209791BeD.LJIJJ().LJIIIZ(8, LLJILJILJ, "increaseStats {} +{}", enumC2210021Bea, Integer.valueOf(i));
        this.LLILZ.LIZJ(i, enumC2210021Bea.name());
    }

    public final void LJII(long j, String str) {
        if (!this.LL.LIZIZ) {
            return;
        }
        C2209791BeD.LJIJJ().LJIIIZ(8, LLJILJILJ, "setFeature int {} = {}", str, Long.valueOf(j));
        synchronized (this.LLJILJIL) {
            try {
                try {
                    this.LLJILJIL.put(str, j);
                } finally {
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIIIIZZ(String str, boolean z) {
        int i;
        if (!this.LL.LIZIZ) {
            return;
        }
        C2209791BeD.LJIJJ().LJIIIZ(8, LLJILJILJ, "setFeature boolean {} = {}", str, Boolean.valueOf(z));
        synchronized (this.LLJILJIL) {
            try {
                try {
                    JSONObject jSONObject = this.LLJILJIL;
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    jSONObject.put(str, i);
                } finally {
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIIJ(String str, String str2) {
        if (!this.LL.LIZIZ) {
            return;
        }
        C2209791BeD.LJIJJ().LJIIIZ(8, LLJILJILJ, "setStringHeader {}: {}", str, str2);
        try {
            this.LLIZ.put(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJI(String str, Throwable th, boolean z) {
        C2210031Beb c2210031Beb = this.LL;
        if (c2210031Beb.LIZIZ && c2210031Beb.LJ) {
            C2209791BeD.LJIJJ().LJIIIZ(8, LLJILJILJ, "sendError {} -> {}", str, th);
            C830300Whg c830300Whg = this.LLILLJJLI;
            if (C19865812o4.LIZ(c830300Whg.LIZIZ)) {
                if (th != null) {
                    List<C830310Whh> list = c830300Whg.LIZ;
                    String canonicalName = th.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder();
                    Throwable cause = th;
                    do {
                        sb.append(cause.toString());
                        for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                            sb.append("\n\tat ");
                            sb.append(stackTraceElement);
                        }
                        cause = cause.getCause();
                    } while (cause != null);
                    String strReplaceAll = sb.toString().replaceAll("[\\s|\\n]", "");
                    if (strReplaceAll.length() > 200) {
                        strReplaceAll = strReplaceAll.substring(0, 200);
                    }
                    ((CopyOnWriteArrayList) list).add(new C830310Whh(str, canonicalName, strReplaceAll));
                } else {
                    ((CopyOnWriteArrayList) c830300Whg.LIZ).add(new C830310Whh(str));
                }
                if (((CopyOnWriteArrayList) c830300Whg.LIZ).size() > 100) {
                    ListProtector.remove(c830300Whg.LIZ, 0);
                }
            }
            if (z) {
                C2210331Bf5 c2210331Bf5 = C2210331Bf5.LJ;
                if (c2210331Bf5.LIZ) {
                    HashMap map = new HashMap();
                    map.put("throwable", th);
                    c2210331Bf5.LIZJ(EnumC2210541BfQ.Common, EnumC2210371Bf9.CommonError, EnumC2210591BfV.Fatal, str, map);
                }
            }
        }
    }

    public final void LJIIL(EnumC21646419na enumC21646419na, String str, String str2, long j, EnumC2176421AFs enumC2176421AFs) {
        LJIIJJI(null, -1, enumC21646419na, str, str2, j, enumC2176421AFs);
    }

    public final void LJIIJJI(String str, int i, EnumC21646419na enumC21646419na, String str2, String str3, long j, EnumC2176421AFs enumC2176421AFs) {
        if (!LJFF()) {
            return;
        }
        C2192591ArZ c2192591ArZ = this.LLJI;
        if (!c2192591ArZ.LIZ.isEmpty()) {
            Iterator<InterfaceC2211311Bgf> it2 = c2192591ArZ.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
        C2209791BeD.LJIJJ().LJIIIZ(8, LLJILJILJ, "stageEvent {} -> event: {}, monitor_id: {}, ts: {}, type: {}, priority: {}-{}", enumC21646419na, str2, str3, Long.valueOf(j), enumC2176421AFs, str, Integer.valueOf(i));
        C2176391AFp c2176391AFp = this.LLILLL;
        if (c2176391AFp.LLILLJJLI && c2176391AFp.LLILZIL.LJIIIZ) {
            C21655119oz c21655119oz = new C21655119oz(str, i, str2, str3, j, enumC2176421AFs);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C21655019oy c21655019oy = new C21655019oy(enumC21646419na, c21655119oz);
            if (C21655019oy.LJ.contains(enumC21646419na)) {
                try {
                    String string = enumC21646419na.toString();
                    if (!c21655019oy.LIZLLL.has(string)) {
                        c21655019oy.LIZLLL.put(string, jCurrentTimeMillis);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (c2176391AFp.LLILLL != null && Looper.myLooper() == Looper.getMainLooper()) {
                BPEAHandler bPEAHandler = c2176391AFp.LLILLL;
                C786410Ut5.LJLJJL(bPEAHandler, bPEAHandler.obtainMessage(8, c21655019oy));
                return;
            } else {
                c2176391AFp.LIZ(c21655019oy);
                return;
            }
        }
        C2209791BeD.LJIJJ().LJIIIZ(8, C2176391AFp.LLIZLLLIL, "stage nothing for disabled!!!", new Object[0]);
    }
}
