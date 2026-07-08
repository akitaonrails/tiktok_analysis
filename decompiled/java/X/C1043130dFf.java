package X;

import android.util.LruCache;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0dFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043130dFf {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1043180dFk());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1043160dFi(this));
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1043150dFh(this));
    public final LruCache<String, List<SSPResponse.Rule>> LIZLLL = new LruCache<>(10);

    public final Keva LIZ() {
        return (Keva) this.LIZ.getValue();
    }

    public final List<SSPResponse.Rule> LIZIZ(String str) {
        List<SSPResponse.Rule> list;
        synchronized (this) {
            try {
                C1043140dFg c1043140dFg = new C1043140dFg(this, str);
                list = this.LIZLLL.get(str);
                if (list == null) {
                    list = (List) c1043140dFg.invoke();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return list;
    }

    public final void LIZJ(String str, Map map, Map map2, long j) {
        synchronized (this) {
            try {
                LIZ().clear();
                this.LIZLLL.evictAll();
                ((ArrayList) this.LIZIZ.getValue()).clear();
                ((Map) this.LIZJ.getValue()).clear();
                LIZ().storeLong("version", j);
                LIZ().storeString("url", str);
                for (Map.Entry entry : map.entrySet()) {
                    LIZ().storeString((String) entry.getKey(), C1058250de3.LIZLLL(entry.getValue()));
                    ((ArrayList) this.LIZIZ.getValue()).add(entry.getKey());
                }
                LIZ().storeStringArray("ruleDomains", (String[]) ((ArrayList) this.LIZIZ.getValue()).toArray(new String[0]));
                if (map2 != null) {
                    LIZ().storeString("generalDomains", C1058250de3.LIZLLL(map2));
                    ((Map) this.LIZJ.getValue()).putAll(map2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
