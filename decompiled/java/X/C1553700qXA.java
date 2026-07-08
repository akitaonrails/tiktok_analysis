package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS18S0200100_23;
import Y.ARunnableS27S1200000_23;
import Y.ARunnableS56S0300000_23;
import Y.ARunnableS92S0200000_23;
import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0qXA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553700qXA extends AbstractC1552040qUU {
    public final AbstractC1552040qUU LIZ;

    @Override // X.AbstractC1552040qUU
    public final void LJIJJ() {
        C0M66.LIZ(new ARunnableS123S0100000_23(this, 7));
    }

    public C1553700qXA(AbstractC1552040qUU abstractC1552040qUU) {
        if (abstractC1552040qUU != null) {
            this.LIZ = abstractC1552040qUU;
            return;
        }
        throw new NullPointerException("listener == null");
    }

    @Override // X.AbstractC1552040qUU
    public final void LJFF(UpdatePackage updatePackage) {
        C0M66.LIZ(new ARunnableS92S0200000_23(updatePackage, this, 4));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIILL(UpdatePackage updatePackage) {
        C0M66.LIZ(new ARunnableS92S0200000_23(updatePackage, this, 5));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJJLI(UpdatePackage updatePackage) {
        C0M66.LIZ(new ARunnableS92S0200000_23(updatePackage, this, 6));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJ(UpdatePackage updatePackage, Throwable th) {
        C0M66.LIZ(new ARunnableS56S0300000_23(this, updatePackage, th, 2));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJII(Throwable th, Map map) {
        C0M66.LIZ(new ARunnableS56S0300000_23(this, map, th, 4));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIIIZZ(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
        C0M66.LIZ(new ARunnableS56S0300000_23(this, map, map2, 1));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
        C0M66.LIZ(new ARunnableS56S0300000_23(this, updatePackage, th, 3));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJ(UpdatePackage updatePackage, Throwable th) {
        C0M66.LIZ(new ARunnableS56S0300000_23(this, updatePackage, th, 0));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIJI(String str, Throwable th) {
        C0M66.LIZ(new ARunnableS27S1200000_23(th, this, str, 2));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJIL(long j, UpdatePackage updatePackage) {
        C0M66.LIZ(new ARunnableS18S0200100_23(this, updatePackage, j, 0));
    }

    @Override // X.AbstractC1552040qUU
    public final void LJJ(final long j, final String str) {
        C0M66.LIZ(new Runnable() { // from class: X.0qX9
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UIThreadGeckoUpdateListener@bac8.onUpdateSuccess$2");
                try {
                    this.LLILLL.LIZ.LJJ(j, str);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UIThreadGeckoUpdateListener@bac8.onUpdateSuccess$2");
            }
        });
    }
}
