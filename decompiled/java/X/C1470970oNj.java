package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470970oNj {
    public final JSONObject LIZ = new JSONObject();
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public final CopyOnWriteArrayList<JSONObject> LJFF = new CopyOnWriteArrayList<>();
    public long LJI = -1;
    public int LJII = -5;
    public int LJIIIIZZ = -1;
    public boolean LJIIIZ = false;
    public final AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public final AtomicBoolean LJIIJJI = new AtomicBoolean(false);

    public final boolean LIZIZ() {
        return this.LJIIJ.get() && this.LJIIJJI.get();
    }

    public final void LIZ(int i, int i2, int i3, int i4) {
        if (LIZIZ() && this.LJI > 0 && !this.LJIIIZ) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJI;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("dur", jCurrentTimeMillis);
                jSONObject.put("p_n", i);
                jSONObject.put("w", i2);
                jSONObject.put("h", i3);
                jSONObject.put("ret", i4);
                this.LJFF.add(jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LJI = -1L;
            this.LJII = i4;
        }
    }
}
