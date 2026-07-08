package X;

import android.util.Pair;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.09ZI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09ZI extends AbstractC1552040qUU {
    public final C09ZL LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    @Override // X.AbstractC1552040qUU
    public final void LJIILLIIL(LocalPackageModel localPackageModel) {
        if (!this.LIZJ) {
            this.LIZ.LJ();
        }
    }

    @Override // X.AbstractC1552040qUU
    public final void LJII(Throwable th, Map map) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C09ZH(this, null), 2);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C09ZK(this, map2, map, null), 2);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C09ZD(this, updatePackage, true, th, null), 2);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIL(long j, UpdatePackage updatePackage) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C09ZD(this, updatePackage, false, null, null), 2);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIIZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2, C1551680qTu c1551680qTu) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C09ZJ(this, map2, map, null), 2);
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIILIIL(UpdatePackage updatePackage, long j, long j2) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C09ZF(this, updatePackage, j, j2, null), 2);
    }

    public C09ZI(C09ZL c09zl, String str, boolean z, String str2) {
        this.LIZ = c09zl;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = str2;
    }
}
