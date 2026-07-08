package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS189S0000000_3;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08kU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2205208kU {
    public final C01GW LIZ;
    public final boolean LIZIZ;
    public final ReentrantLock LIZJ;
    public final SimpleDateFormat LIZLLL;
    public final int LJ;
    public Map<String, Map<String, Integer>> LJFF;

    public C2205208kU() {
        this(0);
    }

    public final Map<String, Map<String, Integer>> LIZJ() {
        LinkedHashMap linkedHashMap;
        Map<String, Map<String, Integer>> map = this.LJFF;
        if (map != null) {
            return map;
        }
        if (this.LIZIZ) {
            linkedHashMap = new LinkedHashMap();
            try {
                String string = ((Keva) this.LIZ.getValue()).getString("creation_daily_counter_v1", null);
                if (string != null) {
                    JSONObject jSONObject = new JSONObject(string);
                    int i = -this.LJ;
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(6, i);
                    String str = this.LIZLLL.format(calendar.getTime());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        if (jSONObjectOptJSONObject != null) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                if (next2.compareTo(str) >= 0) {
                                    linkedHashMap2.put(next2, Integer.valueOf(jSONObjectOptJSONObject.optInt(next2, 0)));
                                }
                            }
                            if (!linkedHashMap2.isEmpty()) {
                                linkedHashMap.put(next, linkedHashMap2);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.LJFF = linkedHashMap;
        return linkedHashMap;
    }

    public C2205208kU(int i) {
        this.LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1662));
        this.LIZIZ = true;
        this.LIZJ = new ReentrantLock();
        this.LIZLLL = new SimpleDateFormat("yyyyMMdd", Locale.US);
        this.LJ = 15;
    }

    public final void LIZIZ(Map<String, Map<String, Integer>> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
                String key = entry.getKey();
                Map<String, Integer> value = entry.getValue();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Integer> entry2 : value.entrySet()) {
                    jSONObject2.put(entry2.getKey(), entry2.getValue().intValue());
                }
                jSONObject.put(key, jSONObject2);
            }
            ((Keva) this.LIZ.getValue()).storeString("creation_daily_counter_v1", C786410Ut5.J3(jSONObject));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final int LIZ(int i, String str) {
        ReentrantLock reentrantLock = this.LIZJ;
        reentrantLock.lock();
        try {
            Map<String, Integer> map = LIZJ().get(str);
            int iIntValue = 0;
            if (map != null && i > 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(6, -(i - 1));
                String str2 = this.LIZLLL.format(calendar.getTime());
                Set<Map.Entry<String, Integer>> setEntrySet = map.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setEntrySet) {
                    if (((String) ((Map.Entry) obj).getKey()).compareTo(str2) >= 0) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    iIntValue += ((Number) ((Map.Entry) it2.next()).getValue()).intValue();
                }
            }
            reentrantLock.unlock();
            return iIntValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
