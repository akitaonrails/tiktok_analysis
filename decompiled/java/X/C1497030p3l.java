package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497030p3l {
    public InterfaceC1489790os5 LIZ;
    public String LIZIZ;
    public final C1491280ouU LIZLLL;
    public C1497060p3o LJFF;
    public boolean LJI;
    public String LJIIIIZZ;
    public int LJII = LSPassThroughRecordSizeConfig.DEFAULT;
    public int LJIIIZ = LivePreCreateNextRoomPlayer.ENABLE;
    public final ReadWriteLock LJIIJ = new ReentrantReadWriteLock();
    public final Map<String, JSONObject> LJ = new HashMap();
    public final Queue<String> LIZJ = new ArrayDeque();

    public final void LJIIIIZZ() {
        synchronized (this) {
            try {
                try {
                    notify();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI() {
        ((ReentrantReadWriteLock) this.LJIIJ).readLock().lock();
        if (!this.LJI) {
            ((ReentrantReadWriteLock) this.LJIIJ).readLock().unlock();
            synchronized (this) {
                try {
                    this.LJFF = null;
                } finally {
                }
            }
            return;
        }
        ((ReentrantReadWriteLock) this.LJIIJ).readLock().unlock();
        if (this.LJFF == null) {
            synchronized (this) {
                try {
                    if (this.LJFF == null) {
                        this.LJFF = new C1497060p3o(this);
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ouU] */
    public C1497030p3l() {
        final int i = 100;
        this.LIZLLL = new LinkedHashMap<String, Boolean>(this, i) { // from class: X.0ouU
            public final int LL;

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
                if (size() > this.LL) {
                    return true;
                }
                return false;
            }

            {
                super(i, 0.75f, true);
                this.LL = i;
            }
        };
    }

    public static String LIZJ(C1496950p3d c1496950p3d) {
        Map<String, List<String>> map;
        if (c1496950p3d != null && (map = c1496950p3d.LIZJ) != null && !map.isEmpty()) {
            List<String> list = c1496950p3d.LIZJ.get("X-Tt-Logid");
            if (((list != null && !list.isEmpty()) || (list = c1496950p3d.LIZJ.get("X-Tt-Logid".toLowerCase())) != null) && !list.isEmpty()) {
                return (String) ListProtector.get(list, 0);
            }
            return null;
        }
        return null;
    }

    public final void LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strLIZ = C1934607hw.LIZ(str);
        if (!TextUtils.isEmpty(strLIZ)) {
            ((ReentrantReadWriteLock) this.LJIIJ).writeLock().lock();
            put(strLIZ, Boolean.TRUE);
            ((ReentrantReadWriteLock) this.LJIIJ).writeLock().unlock();
        }
    }

    public final boolean LIZIZ(String str) {
        boolean zContainsKey;
        synchronized (this) {
            try {
                zContainsKey = ((HashMap) this.LJ).containsKey(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zContainsKey;
    }

    public final JSONObject LIZLLL(String str) {
        JSONObject jSONObject;
        synchronized (this) {
            try {
                jSONObject = (JSONObject) ((HashMap) this.LJ).get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jSONObject;
    }

    public final void LJFF(String str) {
        synchronized (this) {
            try {
                ((HashMap) this.LJ).remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static JSONObject LJ(long j, C1496950p3d c1496950p3d) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", -1);
            jSONObject.put("message", "fail");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("label", "notice");
            jSONObject.put("data", jSONObject2);
            jSONObject.put("scc_reason", "timeout");
            jSONObject.put("scc_passed_time", j);
            String strLIZJ = LIZJ(c1496950p3d);
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            jSONObject.put("scc_logid", strLIZJ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cloud service onFail catch exception: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
    }

    public final void LJII(String str, JSONObject jSONObject) {
        synchronized (this) {
            try {
                ((HashMap) this.LJ).put(str, jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
