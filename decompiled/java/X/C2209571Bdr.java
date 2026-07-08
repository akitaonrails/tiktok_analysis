package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bdr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209571Bdr {
    public static final List<String> LJIJJLI = Collections.singletonList("ConfigManager");
    public final Context LIZ;
    public final C2210081Beg LIZIZ;
    public final SharedPreferences LIZJ;
    public final SharedPreferences LIZLLL;
    public final SharedPreferences LJ;
    public volatile String LJFF;
    public volatile JSONObject LJI;
    public volatile HashSet<String> LJIIIZ;
    public long LJIIJ;
    public volatile C2209621Bdw LJIIJJI;
    public final C2209641Bdy LJIIL;
    public final C2209901BeO LJIILIIL;
    public volatile C2201441BDy LJIILJJIL;
    public C2209911BeP LJIILL;
    public volatile String LJIILLIIL;
    public volatile String LJIIZILJ;
    public volatile boolean LJIJ = true;
    public final Map<String, List<String>> LJIJI = new ConcurrentHashMap();
    public List<String> LJIJJ = null;
    public final HashSet<String> LJII = new HashSet<>();
    public final HashSet<String> LJIIIIZZ = new HashSet<>();

    public final String LIZ() {
        String string = this.LIZIZ.LIZJ;
        if (TextUtils.isEmpty(string)) {
            string = this.LIZIZ.LJIILIIL;
        }
        if (TextUtils.isEmpty(string)) {
            try {
                Bundle bundle = C786410Ut5.V3(this.LIZ.getPackageManager(), this.LIZ.getPackageName(), 128).metaData;
                if (!TextUtils.isEmpty("")) {
                    string = bundle.getString("");
                    return string;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJIILIIL.LJJZZI.LJIIZILJ(LJIJJLI, "getChannel failed", th, new Object[0]);
            }
        }
        return string;
    }

    public final long LIZIZ() {
        long j = this.LJIIJ;
        return (j < 10000 || j > 300000) ? this.LJ.getLong("batch_event_interval", 60000L) : j;
    }

    public final String LIZJ() {
        String string;
        String str = this.LJFF;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        synchronized (this) {
            try {
                string = this.LIZJ.getString("external_ab_version", "");
                this.LJFF = string;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return string;
    }

    public final JSONObject LIZLLL() {
        String string = this.LJ.getString("log_back", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIILIIL.LJJZZI.LJIIZILJ(null, "json parse to logback failed", th, new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|(3:45|7|(2:8|(2:10|(1:47)(1:48))(0)))|39|15|41|16|(5:17|(1:19)(1:49)|43|26|29)|20|43|26|29) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        X.C2200271B9l.LIZ = r1.processName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ() {
        /*
            r9 = this;
            X.1Beg r4 = r9.LIZIZ
            int r0 = r4.LJIIIIZZ
            r8 = 0
            r3 = 1
            if (r0 != 0) goto Lb7
            android.content.Context r2 = r9.LIZ
            java.lang.String r1 = X.C2200271B9l.LIZ
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Laa
            r5 = 0
            int r6 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = "activity"
            java.lang.Object r2 = X.C786410Ut5.H2(r2, r0)     // Catch: java.lang.Exception -> L43
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Exception -> L43
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Exception -> L43
            java.lang.String r0 = "dzBzEgAjS8/YVFkiQFyFdga89NXg4RujRFsMKm6Dbg=="
            r1.<init>(r0, r5)     // Catch: java.lang.Exception -> L43
            java.util.List r0 = X.C2204961BRm.LJII(r2, r1)     // Catch: java.lang.Exception -> L43
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L43
        L2e:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L43
            if (r0 == 0) goto L47
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L43
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch: java.lang.Exception -> L43
            int r0 = r1.pid     // Catch: java.lang.Exception -> L43
            if (r0 != r6) goto L2e
            java.lang.String r0 = r1.processName     // Catch: java.lang.Exception -> L43
            X.C2200271B9l.LIZ = r0     // Catch: java.lang.Exception -> L43
            goto L47
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L47:
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L86
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L86
            X.0VSP r2 = new X.0VSP     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L86
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L86
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "iso-8859-1"
            r7.<init>(r2, r0)     // Catch: java.lang.Throwable -> L86
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89
            r1.<init>()     // Catch: java.lang.Throwable -> L89
        L76:
            int r0 = r6.read()     // Catch: java.lang.Throwable -> L89
            if (r0 <= 0) goto L81
            char r0 = (char) r0     // Catch: java.lang.Throwable -> L89
            r1.append(r0)     // Catch: java.lang.Throwable -> L89
            goto L76
        L81:
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L89
            goto L8f
        L86:
            r0 = move-exception
            r6 = r5
            goto L8a
        L89:
            r0 = move-exception
        L8a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            if (r6 == 0) goto L97
        L8f:
            r6.close()     // Catch: java.lang.Exception -> L93
            goto L97
        L93:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L97:
            X.C2200271B9l.LIZ = r5
            X.1Bdq r2 = X.C2209791BeD.LJIJJ()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = X.C2200271B9l.LIZ
            r1[r8] = r0
            java.lang.String r0 = "getProcessName: {}"
            r2.LJIIIIZZ(r0, r1)
            java.lang.String r1 = X.C2200271B9l.LIZ
        Laa:
            java.lang.String r0 = ":"
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto Lbf
            r0 = 1
        Lb5:
            r4.LJIIIIZZ = r0
        Lb7:
            X.1Beg r0 = r9.LIZIZ
            int r0 = r0.LJIIIIZZ
            if (r0 != r3) goto Lbe
            r8 = 1
        Lbe:
            return r8
        Lbf:
            r0 = 2
            goto Lb5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209571Bdr.LJ():boolean");
    }

    public final HashSet<String> LJFF(JSONArray jSONArray) {
        HashSet<String> hashSet = new HashSet<>();
        if (jSONArray == null) {
            try {
                jSONArray = new JSONArray(this.LJ.getString("real_time_events", "[]"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = JSONArrayProtectorUtils.getString(jSONArray, i);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        return hashSet;
    }

    public final void LJI(JSONObject jSONObject) {
        boolean z;
        boolean z2 = true;
        this.LJIILIIL.LJJZZI.LJIIIZ(0, LJIJJLI, "setConfig: {}", jSONObject);
        this.LJI = jSONObject;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.LJ.edit();
        long jOptInt = jSONObject.optInt("session_interval", 0);
        if (jOptInt > 0 && jOptInt <= 604800) {
            editorEdit.putLong("session_interval", jOptInt * 1000);
        } else {
            editorEdit.remove("session_interval");
        }
        long jOptInt2 = ((long) jSONObject.optInt("batch_event_interval", 60)) * 1000;
        if (jOptInt2 >= 10000 && jOptInt2 <= 300000) {
            editorEdit.putLong("batch_event_interval", jOptInt2);
        } else {
            editorEdit.remove("batch_event_interval");
        }
        int iOptInt = jSONObject.optInt("send_launch_timely", 0);
        if (iOptInt > 0 && iOptInt <= 604800) {
            editorEdit.putInt("send_launch_timely", iOptInt);
        } else {
            editorEdit.remove("send_launch_timely");
        }
        long jOptInt3 = jSONObject.optInt("abtest_fetch_interval", 0);
        if (jOptInt3 > 20 && jOptInt3 <= 604800) {
            editorEdit.putLong("abtest_fetch_interval", jOptInt3 * 1000);
        } else {
            editorEdit.remove("abtest_fetch_interval");
        }
        if (jSONObject.optBoolean("bav_ab_config", false)) {
            editorEdit.putBoolean("bav_ab_config", true);
        } else {
            editorEdit.remove("bav_ab_config");
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("real_time_events");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            this.LJIIIZ = LJFF(jSONArrayOptJSONArray);
            editorEdit.putString("real_time_events", jSONArrayOptJSONArray.toString());
        } else {
            this.LJIIIZ = new HashSet<>();
            editorEdit.remove("real_time_events");
        }
        int iOptInt2 = jSONObject.optInt("http_monitor_port", 0);
        if (iOptInt2 > 0) {
            editorEdit.putInt("http_monitor_port", iOptInt2);
        }
        editorEdit.putLong("app_log_last_config_time", jCurrentTimeMillis);
        int iOptInt3 = jSONObject.optInt("forbid_report_phone_detail_info", -1);
        if (iOptInt3 >= 0) {
            if (iOptInt3 > 0) {
                z = true;
            } else {
                z = false;
            }
            editorEdit.putBoolean("forbid_report_phone_detail_info", z);
        }
        long jOptLong = jSONObject.optLong("fetch_interval", 21600L) * 1000;
        if (jOptLong < 1800000 || jOptLong > 172800000) {
            jOptLong = 21600000;
        }
        editorEdit.putLong("fetch_interval", jOptLong);
        editorEdit.putInt("content_encode_method", jSONObject.optInt("content_encode_method", 0));
        editorEdit.putLong("max_pack_size", jSONObject.optLong("max_pack_size", 0L));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("log_back");
        if (jSONObjectOptJSONObject != null) {
            LJIIJJI(editorEdit, jSONObjectOptJSONObject);
        }
        if (jSONObject.optInt("ignore_event_priority", 0) != 1) {
            z2 = false;
        }
        editorEdit.putBoolean("ignore_event_priority", z2);
        if (this.LJIILIIL.LJJLIIIJJIZ) {
            LJIIJ(editorEdit, jSONObject.optJSONObject("params_block"));
        }
        if (this.LJIILIIL.LJJLIIIJL) {
            LJIIIZ(editorEdit, jSONObject.optJSONArray("header_custom_allow"));
        }
        editorEdit.apply();
        if (jSONObject.has("monitor_config")) {
            this.LJIILIIL.LJJJJLI.LL.LIZIZ(jSONObject.optJSONObject("monitor_config"));
        }
        if (!C2210111Bej.LIZIZ()) {
            C2210111Bej.LIZJ("remote_settings", new C2209581Bds(this));
        }
    }

    public final void LJII(C2201441BDy c2201441BDy) {
        C2209911BeP c2209911BeP;
        if (c2201441BDy != null && c2201441BDy.equals(this.LJIILJJIL)) {
            return;
        }
        this.LJIILJJIL = c2201441BDy;
        if (this.LJIILJJIL != null && (c2209911BeP = this.LJIILL) != null && c2209911BeP.LLJ != null) {
            C786410Ut5.LJLILLLLZI(c2209911BeP.LLJ, 17);
        }
        if (this.LJIILJJIL != null && !C2210111Bej.LIZIZ()) {
            C2210111Bej.LIZJ("forward_config", new InterfaceC800590Var() { // from class: X.1Bdu
                @Override // X.InterfaceC800590Var
                public final Object LIZ() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("appId", this.LIZ.LJIILIIL.LJIIIZ);
                        jSONObject.put("config", this.LIZ.LJIILJJIL.LIZ());
                        return jSONObject;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return jSONObject;
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(final X.C2209621Bdw r9) {
        /*
            r8 = this;
            android.content.SharedPreferences r1 = r8.LJ
            java.lang.String r0 = "ignore_event_priority"
            r7 = 0
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 == 0) goto Lc
            return
        Lc:
            if (r9 == 0) goto L62
            X.1Bdw r3 = r8.LJIIJJI
            if (r3 == 0) goto L62
            int r1 = r3.LIZIZ
            int r0 = r9.LIZIZ
            if (r1 != r0) goto L62
            java.util.Map<java.lang.Integer, X.1Bdx> r2 = r9.LIZLLL
            java.util.Map<java.lang.Integer, X.1Bdx> r6 = r3.LIZLLL
            if (r2 == 0) goto L62
            if (r6 == 0) goto L62
            int r1 = r2.size()
            int r0 = r6.size()
            if (r1 != r0) goto L62
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L32:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            X.1Bdx r1 = (X.C2209631Bdx) r1
            if (r2 == 0) goto L62
            if (r1 == 0) goto L62
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L62
            java.lang.Object r0 = r6.get(r2)
            X.1Bdx r0 = (X.C2209631Bdx) r0
            if (r0 == 0) goto L62
            long r3 = r1.LIZLLL
            long r1 = r0.LIZLLL
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L32
        L62:
            r7 = 1
        L63:
            r8.LJIIJJI = r9
            if (r7 == 0) goto L76
            X.1BeP r1 = r8.LJIILL
            if (r1 == 0) goto L76
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r1.LLJ
            if (r0 == 0) goto L76
            com.bytedance.bpea.transmit.delegate.BPEAHandler r1 = r1.LLJ
            r0 = 17
            X.C786410Ut5.LJLILLLLZI(r1, r0)
        L76:
            boolean r0 = X.C2210111Bej.LIZIZ()
            if (r0 != 0) goto L88
            if (r9 == 0) goto L88
            X.1Bdt r1 = new X.1Bdt
            r1.<init>()
            java.lang.String r0 = "priority_config"
            X.C2210111Bej.LIZJ(r0, r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209571Bdr.LJIIIIZZ(X.1Bdw):void");
    }

    public final void LJIIIZ(SharedPreferences.Editor editor, JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            this.LJIJJ = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String strOptString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.LJIJJ.add(strOptString);
                }
            }
            C2209911BeP c2209911BeP = this.LJIILL;
            if (c2209911BeP != null) {
                C2209771BeB c2209771BeB = c2209911BeP.LLIZLLLIL;
                c2209771BeB.LJII(c2209771BeB.LJ);
            }
            if (editor != null) {
                editor.putString("header_custom_allow", jSONArray.toString());
                return;
            }
            return;
        }
        this.LJIJJ = null;
        if (editor != null) {
            editor.remove("header_custom_allow");
        }
    }

    public final void LJIIJ(SharedPreferences.Editor editor, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (!this.LJIJI.isEmpty()) {
            this.LJIJI.clear();
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(next)) != null && jSONArrayOptJSONArray.length() != 0) {
                    HashSet hashSet = new HashSet();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (!TextUtils.isEmpty(strOptString)) {
                            hashSet.add(strOptString);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        this.LJIJI.put(next, new ArrayList(hashSet));
                    }
                }
            }
        }
        if (editor != null) {
            if (this.LJIJI.isEmpty()) {
                editor.remove("params_block");
            } else {
                editor.putString("params_block", C786410Ut5.J3(jSONObject));
            }
        }
    }

    public final void LJIIJJI(SharedPreferences.Editor editor, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectLIZLLL = LIZLLL();
        if (jSONObjectLIZLLL != null) {
            C0VS7.LIZIZ(jSONObject, jSONObjectLIZLLL);
            jSONObject = jSONObjectLIZLLL;
        }
        if (editor != null) {
            editor.putString("log_back", C786410Ut5.J3(jSONObject));
        } else {
            this.LJ.edit().putString("log_back", C786410Ut5.J3(jSONObject)).apply();
        }
    }

    public C2209571Bdr(C2209901BeO c2209901BeO, Context context, C2210081Beg c2210081Beg) {
        String strOptString;
        C2209621Bdw c2209621Bdw;
        C2201441BDy c2201441BDy = null;
        this.LJIILIIL = c2209901BeO;
        this.LIZ = context;
        this.LIZIZ = c2210081Beg;
        this.LJ = C810670Vr7.LIZJ(context, 0, c2210081Beg.LJJI);
        this.LIZJ = C810670Vr7.LIZJ(context, 0, C1BF5.LIZIZ(c2209901BeO, "header_custom"));
        this.LIZLLL = C810670Vr7.LIZJ(context, 0, C1BF5.LIZIZ(c2209901BeO, "last_sp_session"));
        this.LJIIL = new C2209641Bdy(c2209901BeO, this, LIZIZ());
        if (c2209901BeO.LJJIIJZLJL) {
            List<String> list = C2209611Bdv.LIZ;
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, C1BF5.LIZIZ(c2209901BeO, "priority_list"));
            int i = sharedPreferencesLIZJ.getInt("priority_version", -1);
            if (i == -1) {
                c2209621Bdw = null;
            } else {
                c2209621Bdw = new C2209621Bdw();
                c2209621Bdw.LIZ = i;
                c2209621Bdw.LIZIZ = sharedPreferencesLIZJ.getInt("base_interval", 5);
                String string = sharedPreferencesLIZJ.getString("priorities", null);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        C2209611Bdv.LIZ(c2209901BeO, this, c2209621Bdw, new JSONArray(string));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        c2209901BeO.LJJZZI.LJIIZILJ(C2209611Bdv.LIZ, "parseEventPriorityFromLocal failed", e, new Object[0]);
                    }
                }
            }
            LJIIIIZZ(c2209621Bdw);
        }
        if (c2209901BeO.LJJLIIIJILLIZJL) {
            C2201441BDy c2201441BDy2 = new C2201441BDy();
            SharedPreferences sharedPreferencesLIZJ2 = C810670Vr7.LIZJ(c2209901BeO.LJIIJ, 0, C1BF5.LIZIZ(c2209901BeO, "applog_forward"));
            int i2 = sharedPreferencesLIZJ2.getInt("version", -1);
            if (i2 != -1) {
                c2201441BDy2.LIZ = i2;
                c2201441BDy2.LIZIZ = sharedPreferencesLIZJ2.getLong("interval", 60000L);
                c2201441BDy2.LIZJ.addAll(sharedPreferencesLIZJ2.getStringSet("events", new HashSet()));
                c2201441BDy2.LJ = sharedPreferencesLIZJ2.getString("forward_report_path", "");
                c2201441BDy2.LJII = null;
                c2201441BDy2.LIZLLL = sharedPreferencesLIZJ2.getString("forward_report_host", "");
                c2201441BDy2.LJII = null;
                String string2 = sharedPreferencesLIZJ2.getString("forward_list", null);
                if (!TextUtils.isEmpty(string2)) {
                    try {
                        JSONArray jSONArray = new JSONArray(string2);
                        if (jSONArray.length() > 0) {
                            ArrayList arrayList = new ArrayList();
                            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                Object objOpt = jSONArray.opt(i3);
                                if (objOpt instanceof JSONObject) {
                                    strOptString = ((JSONObject) objOpt).optString("forward_report_url");
                                } else if (objOpt instanceof String) {
                                    strOptString = (String) objOpt;
                                } else {
                                    strOptString = null;
                                }
                                if (!TextUtils.isEmpty(strOptString)) {
                                    arrayList.add(strOptString);
                                }
                            }
                            ((ArrayList) c2201441BDy2.LJI).clear();
                            if (!arrayList.isEmpty()) {
                                ((ArrayList) c2201441BDy2.LJI).addAll(arrayList);
                            }
                            c2201441BDy2.LJII = null;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                c2201441BDy2.LJFF = sharedPreferencesLIZJ2.getInt("forward_open", 0);
                c2201441BDy2.LJII = null;
                c2201441BDy = c2201441BDy2;
            }
            LJII(c2201441BDy);
        }
    }
}
