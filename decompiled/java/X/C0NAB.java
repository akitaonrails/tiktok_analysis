package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0NAB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NAB {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJFF;
    public float LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public final String LJIIL;
    public final LinkedList<Float> LJ = new LinkedList<>();
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new C0NAC(this));

    public final Keva LIZ() {
        return (Keva) this.LJIIJJI.getValue();
    }

    public final void LIZIZ() {
        if (this.LJIIIIZZ) {
            return;
        }
        this.LIZ = LIZ().getFloat("instant_value", 0.0f);
        this.LJ.clear();
        String[] stringArray = LIZ().getStringArray("recently_pool", null);
        if (stringArray != null) {
            for (String str : stringArray) {
                try {
                    this.LJ.add(Float.valueOf(CastFloatProtector.parseFloat(str)));
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        this.LIZIZ = LIZ().getFloat("recently_value", 0.0f);
        float f = LIZ().getFloat("stable_value_v2", 0.0f);
        this.LJFF = f;
        this.LIZJ = f;
        this.LJI = LIZ().getFloat("old_stable_value_v2", 0.0f);
        this.LJII = LIZ().getInt("stable_combined_count_v2", 0);
        this.LJIIIIZZ = true;
    }

    public C0NAB(String str) {
        this.LJIIL = str;
    }
}
