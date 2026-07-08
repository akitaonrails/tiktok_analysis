package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12ZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C12ZJ {
    public C12ZD LIZ;
    public List<Long> LIZIZ;
    public List<C12ZI> LIZJ;
    public long LIZLLL;
    public final /* synthetic */ C12Z4 LJ;

    public C12ZJ(C12Z4 c12z4) {
        this.LJ = c12z4;
    }

    public final void LIZ(C12ZD c12zd) {
        this.LIZ = c12zd;
    }

    public final boolean LIZIZ(long j, C12ZI c12zi) {
        if (this.LIZJ == null) {
            this.LIZJ = new ArrayList();
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new ArrayList();
        }
        if (!((ArrayList) this.LIZJ).isEmpty() && ((((C12ZI) ListProtector.get(this.LIZJ, 0)).zzh / 1000) / 60) / 60 != ((c12zi.zzh / 1000) / 60) / 60) {
            return false;
        }
        long jLJFF = this.LIZLLL + ((long) c12zi.LJFF(null));
        this.LJ.LJJJJ();
        if (jLJFF >= Math.max(0, C19817012gC.LJIIIZ.LIZ(null).intValue())) {
            return false;
        }
        this.LIZLLL = jLJFF;
        ((ArrayList) this.LIZJ).add(c12zi);
        ((ArrayList) this.LIZIZ).add(Long.valueOf(j));
        int size = ((ArrayList) this.LIZJ).size();
        this.LJ.LJJJJ();
        if (size >= Math.max(1, C19817012gC.LJIIJ.LIZ(null).intValue())) {
            return false;
        }
        return true;
    }
}
