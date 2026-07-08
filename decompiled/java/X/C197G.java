package X;

import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.CachePoweredTexts;
import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.PoweredTextItem;
import java.util.List;

/* JADX INFO: renamed from: X.197G, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C197G {
    public final C197M LIZ;
    public final InterfaceC1406060mh2 LIZIZ;
    public final C197K LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ = C197H.ENHANCE.getCode();

    public final void LIZJ() {
        this.LJFF = false;
        if (!this.LIZJ.LJFF() || this.LJI) {
            return;
        }
        this.LIZJ.LIZ();
    }

    public final void LIZLLL() {
        this.LJI = false;
        if (!this.LIZJ.LJFF() || this.LJFF) {
            return;
        }
        this.LIZJ.LIZ();
    }

    public final void LIZ(int i, List<PoweredTextItem> list) {
        if (list.isEmpty()) {
            return;
        }
        this.LIZ.LIZ(i).poweredTextList.addAll(list);
        if (this.LIZJ.LJI()) {
            this.LIZIZ.LIZ(this.LIZ.snapshot());
        }
    }

    public final void LJ(int i, boolean z) {
        this.LIZJ.Tq(true, true);
        this.LIZLLL = z;
        if (!this.LIZJ.LJ(z)) {
            if (LIZIZ(i, true, false)) {
                return;
            }
            if ((this.LJI || this.LJFF) && i == this.LJIIIIZZ) {
                return;
            }
        }
        this.LJIIIIZZ = i;
        this.LIZ.clear();
        this.LJFF = true;
        this.LJI = true;
        this.LJII = false;
        this.LIZJ.LIZIZ(i);
    }

    public C197G(C197M c197m, InterfaceC1406060mh2 interfaceC1406060mh2, C197K c197k) {
        this.LIZ = c197m;
        this.LIZIZ = interfaceC1406060mh2;
        this.LIZJ = c197k;
    }

    public final boolean LIZIZ(int i, boolean z, boolean z2) {
        CachePoweredTexts cachePoweredTexts;
        if (!this.LIZJ.LJFF() || (cachePoweredTexts = this.LIZ.get(i)) == null) {
            return false;
        }
        List<PoweredTextItem> list = cachePoweredTexts.poweredTextList;
        if (list.isEmpty()) {
            return false;
        }
        if (z2 && !this.LIZJ.isResumed()) {
            this.LJII = true;
            return false;
        }
        if (cachePoweredTexts.currentIndex == list.size() && list.size() == 1) {
            return false;
        }
        int size = cachePoweredTexts.currentIndex % list.size();
        PoweredTextItem poweredTextItem = (PoweredTextItem) C13LP.LJJJLZIJ(size, list);
        if (poweredTextItem == null) {
            return false;
        }
        if (z) {
            this.LJ = false;
            this.LIZJ.LJII(new C197L(this, cachePoweredTexts, size, poweredTextItem));
            return true;
        }
        cachePoweredTexts.currentIndex = size + 1;
        this.LJII = false;
        this.LIZJ.LIZJ(poweredTextItem, this.LIZLLL);
        return true;
    }
}
