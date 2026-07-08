package X;

import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0wHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774740wHg {
    public final List<Float> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1239));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1237));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1236));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1238));

    public final float LIZ() {
        return ((Number) this.LIZLLL.getValue()).floatValue();
    }

    public final float LIZIZ() {
        return ((Number) this.LIZJ.getValue()).floatValue();
    }

    public final float LIZJ() {
        return ((Number) this.LJ.getValue()).floatValue();
    }

    public final float LIZLLL() {
        return ((Number) this.LIZIZ.getValue()).floatValue();
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(LIZLLL()) * 31) + Float.floatToIntBits(LIZIZ())) * 31) + Float.floatToIntBits(LIZ())) * 31) + Float.floatToIntBits(LIZJ());
    }

    public C1774740wHg(List<Float> list) {
        this.LIZ = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1774740wHg) {
            C1774740wHg c1774740wHg = (C1774740wHg) obj;
            if (LIZLLL() == c1774740wHg.LIZLLL() && LIZIZ() == c1774740wHg.LIZIZ() && LIZJ() == c1774740wHg.LIZJ() && LIZ() == c1774740wHg.LIZ()) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }
}
