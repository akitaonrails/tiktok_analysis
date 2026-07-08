package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ttkmedia.datacenter.api.DataCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309090kAd {
    public static C1309090kAd LJIILIIL;
    public final HashMap<String, C1309060kAa> LJ;
    public final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public final ArrayList<InterfaceC1309160kAk> LIZIZ = new ArrayList<>();
    public Context LIZJ = null;
    public InterfaceC1309140kAi LIZLLL = null;
    public boolean LJFF = true;
    public long LJI = 0;
    public int LJII = 600;
    public long LJIIIIZZ = 0;
    public int LJIIIZ = 100;
    public int LJIIJ = 0;
    public PthreadTimer LJIIJJI = null;
    public C1309110kAf LJIIL = null;

    public static synchronized C1309090kAd LJI() {
        if (LJIILIIL == null) {
            LJIILIIL = new C1309090kAd();
        }
        return LJIILIIL;
    }

    public C1309090kAd() {
        HashMap<String, C1309060kAa> map = new HashMap<>();
        this.LJ = map;
        map.put("vod", new C1309060kAa("vod", 3));
        map.put("playback", new C1309060kAa("playback", 3));
        map.put("mdl", new C1309060kAa("mdl", 3));
        map.put("upload", new C1309060kAa("upload", 3));
        map.put("portrait", new C1309060kAa("portrait", 3));
        map.put("common", new C1309060kAa("common", 2));
    }

    public final void LIZ(String str) {
        C1309060kAa c1309060kAa = this.LJ.get(str);
        if (c1309060kAa.LJI(C786410Ut5.N3(this.LIZJ))) {
            if (this.LJFF) {
                LIZIZ(str);
            } else {
                c1309060kAa.LJFF();
            }
        }
    }

    public final void LIZIZ(String str) {
        this.LIZ.readLock().lock();
        Iterator<InterfaceC1309160kAk> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(str);
        }
        this.LIZ.readLock().unlock();
    }

    public final synchronized void LIZJ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("smart schedule mAppBackGround:");
        sbLIZ.append(false);
        sbLIZ.append(", interval:");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        LIZLLL(j);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0kAf] */
    public final synchronized void LIZLLL(long j) {
        long j2 = j;
        synchronized (this) {
            C1309110kAf c1309110kAf = this.LJIIL;
            if (c1309110kAf != null) {
                c1309110kAf.cancel();
            }
            this.LJIIL = new C0W9W() { // from class: X.0kAf
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("SettingsManager@6c19._startScheduleEvent$1");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        InterfaceC1309140kAi interfaceC1309140kAi = this.LL.LIZLLL;
                        if (interfaceC1309140kAi != null) {
                            interfaceC1309140kAi.fetch("all", null, true);
                        }
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("SettingsManager@6c19._startScheduleEvent$1");
                }
            };
            PthreadTimer pthreadTimer = this.LJIIJJI;
            if (pthreadTimer != null) {
                pthreadTimer.purge();
            } else {
                this.LJIIJJI = new PthreadTimer("SettingsManager", true);
            }
            if (j2 * 1000 < 1000) {
                j2 = 86400;
            }
            try {
                long j3 = j2 * 1000;
                this.LJIIJJI.schedule(this.LJIIL, j3, j3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reset schedule fail. ");
                sbLIZ.append(th.toString());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public final JSONArray LJFF(String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        SharedPreferences sharedPreferences;
        C1309060kAa c1309060kAa = this.LJ.get(str);
        c1309060kAa.getClass();
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        c1309060kAa.LJI(c1309060kAa.LIZJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" get JsonArray, key: ");
        sbLIZ.append(str2);
        sbLIZ.append(", type: ");
        sbLIZ.append(c1309060kAa.LJ);
        sbLIZ.append(", settings: ");
        sbLIZ.append(C786410Ut5.J3(c1309060kAa.LIZIZ));
        C2188811AlT.LIZIZ(sbLIZ);
        if ((c1309060kAa.LJ & 1) > 0) {
            c1309060kAa.LIZ.readLock().lock();
            JSONObject jSONObject = c1309060kAa.LIZIZ;
            if (jSONObject != null && !jSONObject.isNull(str2)) {
                jSONArrayOptJSONArray = c1309060kAa.LIZIZ.optJSONArray(str2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" storage: ");
                sbLIZ2.append(c1309060kAa.LJI);
                sbLIZ2.append(", key: ");
                sbLIZ2.append(str2);
                sbLIZ2.append(", ret: ");
                sbLIZ2.append(jSONArrayOptJSONArray.toString());
                C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                jSONArrayOptJSONArray = null;
            }
            c1309060kAa.LIZ.readLock().unlock();
        } else {
            jSONArrayOptJSONArray = null;
        }
        if (jSONArrayOptJSONArray == null && (c1309060kAa.LJ & 2) > 0 && (sharedPreferences = c1309060kAa.LJFF) != null) {
            String string = sharedPreferences.getString(str2, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("get JSONArray from SP, key= ");
                    sbLIZ3.append(str2);
                    sbLIZ3.append(", retValue = ");
                    sbLIZ3.append(jSONArray);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    return jSONArray;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.toString();
                    return null;
                }
            }
        }
        return jSONArrayOptJSONArray;
    }

    public final void LJ(String str, String str2, JSONObject jSONObject) {
        boolean z;
        SharedPreferences sharedPreferences;
        if (jSONObject == null) {
            return;
        }
        C1309060kAa c1309060kAa = this.LJ.get(str);
        JSONObject jSONObjectLIZIZ = c1309060kAa.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("module = ");
        sbLIZ.append(str);
        sbLIZ.append(", s json = ");
        sbLIZ.append(jSONObjectLIZIZ);
        sbLIZ.append(", j json = ");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str.equals("portrait")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("set portrait label = ");
            sbLIZ2.append(C786410Ut5.J3(jSONObject));
            C2188811AlT.LIZIZ(sbLIZ2);
            DataCenter.getInstance().setStringValue(3401, C786410Ut5.J3(jSONObject));
        }
        if (jSONObjectLIZIZ == null || !C786410Ut5.J3(jSONObjectLIZIZ).equals(C786410Ut5.J3(jSONObject))) {
            if (str2 != null) {
                z = true;
            } else {
                z = false;
            }
            c1309060kAa.LJI(c1309060kAa.LIZJ);
            c1309060kAa.LIZ.writeLock().lock();
            try {
                try {
                    if (c1309060kAa.LIZIZ != null && z) {
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            c1309060kAa.LIZIZ.putOpt(next, jSONObject.opt(next));
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("update json, key = ");
                            sbLIZ3.append(next);
                            sbLIZ3.append(", value = ");
                            sbLIZ3.append(jSONObject.opt(next));
                            C2188811AlT.LIZIZ(sbLIZ3);
                        }
                    } else {
                        c1309060kAa.LIZIZ = jSONObject;
                    }
                    if ((c1309060kAa.LJ & 2) > 0 && (sharedPreferences = c1309060kAa.LJFF) != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(c1309060kAa.LJI);
                        sbLIZ4.append("_whole");
                        editorEdit.putString(C2188811AlT.LIZIZ(sbLIZ4), C786410Ut5.J3(c1309060kAa.LIZIZ));
                        editorEdit.apply();
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.toString();
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(" update setting info: ");
                sbLIZ5.append(C786410Ut5.J3(c1309060kAa.LIZIZ));
                C2188811AlT.LIZIZ(sbLIZ5);
                c1309060kAa.LIZ.writeLock().unlock();
                if (!str.equals("portrait")) {
                    LIZIZ(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(" update setting info: ");
                sbLIZ6.append(C786410Ut5.J3(c1309060kAa.LIZIZ));
                C2188811AlT.LIZIZ(sbLIZ6);
                c1309060kAa.LIZ.writeLock().unlock();
                throw th;
            }
        }
    }
}
