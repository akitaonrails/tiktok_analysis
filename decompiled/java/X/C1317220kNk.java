package X;

import Y.ARunnableS13S0301000_20;
import Y.ARunnableS6S0001000_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317220kNk implements InterfaceC1317290kNr {
    public static final Map<Integer, Runnable> LIZJ = new LinkedHashMap();
    public AbstractC1317090kNX LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC1317290kNr
    public final void LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
        this.LIZ = abstractC1317090kNX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.String] */
    @Override // X.InterfaceC1317290kNr
    public final void LIZ(int i, String str) {
        JSONObject jSONObject = new JSONObject(str);
        long jOptLong = jSONObject.optLong("timer");
        boolean zOptBoolean = jSONObject.optBoolean("immediate");
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = jSONObject.optString("name");
        C259800zU c259800zU2 = new C259800zU();
        ?? J3 = C786410Ut5.J3(jSONObject.optJSONObject("params"));
        c259800zU2.element = J3;
        int iHashCode = J3.hashCode();
        if (zOptBoolean) {
            Map<Integer, Runnable> map = LIZJ;
            if (map.containsKey(Integer.valueOf(iHashCode))) {
                return;
            }
            AbstractC1317090kNX abstractC1317090kNX = this.LIZ;
            if (abstractC1317090kNX == null) {
                abstractC1317090kNX = null;
            }
            abstractC1317090kNX.LLJILLL.LIZ(C1317210kNj.LIZJ, (String) c259800zU.element, (String) c259800zU2.element);
            ARunnableS6S0001000_20 aRunnableS6S0001000_20 = new ARunnableS6S0001000_20(iHashCode, 4);
            C786410Ut5.LJLIIL(jOptLong, this.LIZIZ, aRunnableS6S0001000_20);
            map.put(Integer.valueOf(iHashCode), aRunnableS6S0001000_20);
            return;
        }
        ARunnableS13S0301000_20 aRunnableS13S0301000_20 = new ARunnableS13S0301000_20(iHashCode, this, c259800zU, c259800zU2, 9);
        Map<Integer, Runnable> map2 = LIZJ;
        Runnable runnable = (Runnable) ((LinkedHashMap) map2).get(Integer.valueOf(iHashCode));
        if (runnable != null) {
            this.LIZIZ.removeCallbacks(runnable);
        }
        C786410Ut5.LJLIIL(jOptLong, this.LIZIZ, aRunnableS13S0301000_20);
        map2.put(Integer.valueOf(iHashCode), aRunnableS13S0301000_20);
    }
}
