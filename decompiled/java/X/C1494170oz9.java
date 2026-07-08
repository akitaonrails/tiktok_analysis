package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.EnumSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494170oz9 {
    public static C1494170oz9 LJFF;
    public final ConcurrentHashMap<C1490370ot1, C1494200ozC> LIZ = new ConcurrentHashMap<>();
    public volatile EnumC1494180ozA LIZIZ = EnumC1494180ozA.NO_CALLBACK;
    public volatile long LIZJ = -1;
    public volatile long LIZLLL = -1;
    public volatile EnumSet<EnumC1490340osy> LJ = EnumSet.noneOf(EnumC1490340osy.class);

    public static C1494170oz9 LIZIZ() {
        if (LJFF == null) {
            LJFF = new C1494170oz9();
        }
        return LJFF;
    }

    public final C1494200ozC LIZ(int i) {
        return this.LIZ.get(new C1490370ot1(i));
    }

    public final boolean LIZJ(int i, JSONObject jSONObject) {
        try {
            if (this.LIZLLL < 0) {
                this.LIZLLL = (SystemClock.uptimeMillis() - this.LIZJ) / 1000;
            }
            C1494200ozC c1494200ozCLIZ = C1494190ozB.LIZ(i, jSONObject);
            if (c1494200ozCLIZ == null) {
                return false;
            }
            this.LIZIZ = EnumC1494180ozA.NONE;
            if (c1494200ozCLIZ.LJ == null) {
                c1494200ozCLIZ.LJ = new C1490370ot1(c1494200ozCLIZ.LIZIZ);
            }
            C1490370ot1 c1490370ot1 = c1494200ozCLIZ.LJ;
            C1494200ozC c1494200ozC = this.LIZ.get(c1490370ot1);
            if (c1494200ozC != null && c1494200ozC.equals(c1494200ozCLIZ)) {
                return false;
            }
            this.LIZ.put(c1490370ot1, c1494200ozCLIZ);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
