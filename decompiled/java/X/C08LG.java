package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS189S0000000_3;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08LG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LG {
    public final C01GW LIZ;
    public final ReentrantLock LIZIZ;
    public final boolean LIZJ;
    public Map<String, Integer> LIZLLL;
    public Map<String, Integer> LJ;
    public boolean LJFF;

    public C08LG() {
        this(0);
    }

    public final void LIZJ() {
        ReentrantLock reentrantLock = this.LIZIZ;
        reentrantLock.lock();
        try {
            if (!this.LJFF) {
                reentrantLock.unlock();
                return;
            }
            Map<String, Integer> mapLJIIZILJ = C2097608Jq.LJIIZILJ(this.LIZLLL);
            this.LJ = mapLJIIZILJ;
            ((LinkedHashMap) this.LIZLLL).clear();
            this.LJFF = false;
            reentrantLock.unlock();
            if (this.LIZJ) {
                LJFF("creation_session_counter_last", mapLJIIZILJ);
                try {
                    ((Keva) this.LIZ.getValue()).storeString("creation_session_counter_temp", "");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public C08LG(int i) {
        Map<String, Integer> mapLJ;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1663));
        this.LIZ = c01gwLIZIZ;
        this.LIZIZ = new ReentrantLock();
        this.LIZJ = true;
        this.LIZLLL = new LinkedHashMap();
        try {
            String string = ((Keva) c01gwLIZIZ.getValue()).getString("creation_session_counter_temp", null);
            if (string != null && string.length() != 0) {
                try {
                    ((Keva) c01gwLIZIZ.getValue()).storeString("creation_session_counter_temp", "");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                mapLJ = LIZLLL(string);
            } else {
                String string2 = ((Keva) c01gwLIZIZ.getValue()).getString("creation_session_counter_last", null);
                if (string2 != null && string2.length() != 0) {
                    mapLJ = LIZLLL(string2);
                } else {
                    mapLJ = C2097608Jq.LJ();
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            mapLJ = C2097608Jq.LJ();
        }
        this.LJ = mapLJ;
    }

    public static Map LIZLLL(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, Integer.valueOf(jSONObject.optInt(next, 0)));
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }

    public final int LIZ(String str) {
        int iIntValue;
        ReentrantLock reentrantLock = this.LIZIZ;
        reentrantLock.lock();
        try {
            Integer num = this.LIZLLL.get(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            reentrantLock.unlock();
            return iIntValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final int LIZIZ(String str) {
        int iIntValue;
        ReentrantLock reentrantLock = this.LIZIZ;
        reentrantLock.lock();
        try {
            Integer num = this.LJ.get(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            reentrantLock.unlock();
            return iIntValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJ(String str) {
        int iIntValue;
        ReentrantLock reentrantLock = this.LIZIZ;
        reentrantLock.lock();
        try {
            if (!this.LJFF) {
                reentrantLock.unlock();
                return;
            }
            Map<String, Integer> map = this.LIZLLL;
            Integer num = map.get(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            map.put(str, Integer.valueOf(iIntValue + 1));
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJFF(String str, Map<String, Integer> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue().intValue());
            }
            ((Keva) this.LIZ.getValue()).storeString(str, C786410Ut5.J3(jSONObject));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
