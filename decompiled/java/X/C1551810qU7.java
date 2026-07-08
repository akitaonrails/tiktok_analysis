package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0qU7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551810qU7 {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;
    public long LJJI = System.currentTimeMillis();
    public boolean LJJIFFI = false;
    public boolean LJJII = false;
    public long LJJIII = 0;
    public int LJJIIJ = 0;
    public final Map<String, C1552790qVh> LJJIIJZLJL = new HashMap();

    public final C1552790qVh LIZ(String str, boolean z) {
        C1552790qVh c1552790qVh = (C1552790qVh) ((HashMap) this.LJJIIJZLJL).get(str);
        if (c1552790qVh == null) {
            c1552790qVh = new C1552790qVh(str);
            ((HashMap) this.LJJIIJZLJL).put(str, c1552790qVh);
            if (!z) {
                c1552790qVh.LJI = true;
                C1553130qWF.LIZLLL("gecko-debug-tag", "UpdateStatisticModel.getStageDataFromMap create by error");
            }
        }
        return c1552790qVh;
    }

    public final C1552790qVh LIZIZ(UpdatePackage updatePackage, boolean z) {
        if (updatePackage.getZstdFallback()) {
            return LIZ("fallback_", z);
        }
        if (updatePackage.getUpdateWithPatch()) {
            return LIZ("patch_", z);
        }
        return LIZ("full_", z);
    }
}
