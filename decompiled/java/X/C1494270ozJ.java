package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.0ozJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1494270ozJ {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final List<C1494350ozR> LIZJ;
    public final List<C1494350ozR> LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            try {
                if (C1494270ozJ.class == obj.getClass()) {
                    C1494270ozJ c1494270ozJ = (C1494270ozJ) obj;
                    if (this.LIZ == c1494270ozJ.LIZ && this.LIZIZ == c1494270ozJ.LIZIZ && Objects.equals(this.LIZJ, c1494270ozJ.LIZJ)) {
                        if (Objects.equals(this.LIZLLL, c1494270ozJ.LIZLLL)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public C1494270ozJ(boolean z, boolean z2, List<C1494350ozR> list, List<String> list2, List<C1494350ozR> list3, List<String> list4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = list;
        this.LIZLLL = list3;
        this.LJ = list2;
        this.LJFF = list4;
    }
}
