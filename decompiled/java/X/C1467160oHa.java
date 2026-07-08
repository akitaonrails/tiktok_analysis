package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oHa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1467160oHa {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final ArrayList<String> LJ = new ArrayList<>();

    public final void LIZ(int i, int i2) {
        if (i > 0 && i2 > 0) {
            HashMap map = new HashMap();
            map.put("w", Integer.valueOf(i));
            map.put("h", Integer.valueOf(i2));
            map.put("t", Long.valueOf(System.currentTimeMillis()));
            try {
                C790040Uyw.LIZJ(C786410Ut5.J3(new JSONObject(map)), this.LJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZ = 0;
            this.LIZIZ = 0;
        }
    }
}
