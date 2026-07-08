package X;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0m8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384800m8k {
    public final HashMap<Integer, AbstractC1384980m92> LIZ = new HashMap<>();
    public final HashMap<Integer, AbstractC1384990m93> LIZIZ = new HashMap<>();

    public final boolean LIZ(AbstractC1384320m7y abstractC1384320m7y, C1384750m8f c1384750m8f) {
        if (abstractC1384320m7y != null && abstractC1384320m7y.LJIIIIZZ != 0) {
            Iterator<AbstractC1384980m92> it2 = this.LIZ.values().iterator();
            while (it2.hasNext() && !it2.next().LIZ()) {
            }
            abstractC1384320m7y.LJIIIIZZ = 0;
        }
        return false;
    }

    public final boolean LIZIZ(AbstractC1384320m7y abstractC1384320m7y, int i, long j, C1384750m8f c1384750m8f) {
        if (abstractC1384320m7y != null) {
            if (abstractC1384320m7y.LJIIIIZZ != 0) {
                LIZ(abstractC1384320m7y, c1384750m8f);
            }
            if (abstractC1384320m7y.LJIIIZ != c1384750m8f.LJIIJ.LIZ) {
                Iterator<AbstractC1384990m93> it2 = this.LIZIZ.values().iterator();
                while (it2.hasNext() && !it2.next().LIZ()) {
                }
                abstractC1384320m7y.LJIIIZ = c1384750m8f.LJIIJ.LIZ;
            }
        }
        return false;
    }
}
