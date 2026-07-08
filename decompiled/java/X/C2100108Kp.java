package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS189S0000000_3;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2100108Kp {
    public final String LIZ = "kCreationPerfFeatureCache_lastSessionValues";
    public final String LIZIZ;
    public Map<String, Number> LIZJ;
    public Map<String, ? extends Number> LIZLLL;
    public boolean LJ;
    public final ReentrantLock LJFF;
    public final boolean LJI;
    public final C01GW LJII;

    public final void LIZ() {
        ReentrantLock reentrantLock = this.LJFF;
        reentrantLock.lock();
        try {
            if (!this.LJ) {
                reentrantLock.unlock();
                return;
            }
            Map<String, ? extends Number> mapLJIIZILJ = C2097608Jq.LJIIZILJ(this.LIZJ);
            this.LIZLLL = mapLJIIZILJ;
            this.LIZJ = new LinkedHashMap();
            this.LJ = false;
            reentrantLock.unlock();
            if (this.LJI) {
                LIZLLL(this.LIZ, mapLJIIZILJ);
                try {
                    ((Keva) this.LJII.getValue()).storeString(this.LIZIZ, "");
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

    public final void LIZIZ() {
        ReentrantLock reentrantLock = this.LJFF;
        reentrantLock.lock();
        try {
            if (!this.LJ) {
                this.LIZJ = new LinkedHashMap();
                this.LJ = true;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public C2100108Kp() {
        Map<String, ? extends Number> mapLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kCreationPerfFeatureCache_lastSessionValues");
        sbLIZ.append(".currentTemp");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = strLIZIZ;
        this.LIZJ = new LinkedHashMap();
        this.LJFF = new ReentrantLock();
        this.LJI = true;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1660));
        this.LJII = c01gwLIZIZ;
        try {
            String string = ((Keva) c01gwLIZIZ.getValue()).getString(strLIZIZ, null);
            if (string == null || string.length() == 0) {
                String string2 = ((Keva) c01gwLIZIZ.getValue()).getString("kCreationPerfFeatureCache_lastSessionValues", null);
                mapLJ = (string2 == null || string2.length() == 0) ? C2097608Jq.LJ() : LIZJ(string2);
            } else {
                try {
                    ((Keva) c01gwLIZIZ.getValue()).storeString(strLIZIZ, "");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                mapLJ = LIZJ(string);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            mapLJ = C2097608Jq.LJ();
        }
        this.LIZLLL = mapLJ;
    }

    public static Map LIZJ(String str) {
        Double dLJII;
        try {
            JSONObject jSONObject = new JSONObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof Number) {
                    linkedHashMap.put(next, objOpt);
                } else if ((objOpt instanceof String) && (dLJII = C2327809Ae.LJII((String) objOpt)) != null) {
                    linkedHashMap.put(next, Double.valueOf(dLJII.doubleValue()));
                }
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }

    public final void LIZLLL(String str, Map<String, ? extends Number> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, ? extends Number> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            ((Keva) this.LJII.getValue()).storeString(str, C786410Ut5.J3(jSONObject));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJ(Number number, String str) {
        ReentrantLock reentrantLock = this.LJFF;
        reentrantLock.lock();
        try {
            this.LIZJ.put(str, number);
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJFF(Number number, String str) {
        ReentrantLock reentrantLock = this.LJFF;
        reentrantLock.lock();
        try {
            Number number2 = (Number) ((LinkedHashMap) this.LIZJ).get(str);
            if (number2 == null || number.doubleValue() > number2.doubleValue()) {
                this.LIZJ.put(str, number);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Number LJI(int i, String str) {
        Map map;
        ReentrantLock reentrantLock = this.LJFF;
        reentrantLock.lock();
        try {
            if (i != 0) {
                map = this.LIZLLL;
            } else {
                map = this.LIZJ;
            }
            Number number = (Number) map.get(str);
            reentrantLock.unlock();
            return number;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
