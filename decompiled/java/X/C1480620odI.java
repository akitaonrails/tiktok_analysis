package X;

import Y.AObjectS397S0100000_23;
import Y.AObjectS66S0000000_13;
import Y.AObjectS73S0000000_23;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS23S0210000_23;
import Y.ARunnableS8S0100001_23;
import Y.ARunnableS92S0200000_23;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: renamed from: X.0odI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1480620odI extends C1479300obA {
    public final C01GW LJJIIJ;
    public final C01GW LJJIIJZLJL;
    public final C01GW LJJIIZ;
    public final C01GW LJJIIZI;
    public final C01GW LJJIJ;

    public final boolean LJLILLLLZI() {
        return (((Boolean) this.LJJIIZ.getValue()).booleanValue() && C1474930oU7.LJFF) ? false : true;
    }

    public final Handler LJLJI() {
        return (Handler) this.LJJIIJZLJL.getValue();
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final InterfaceC1481730of5 LJIIIZ() {
        return LJLILLLLZI() ? (InterfaceC1481730of5) this.LJJIJ.getValue() : this.LJIIIZ;
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final InterfaceC1483810oiR LJIILIIL() {
        return LJLILLLLZI() ? (C1482320og2) this.LJJIIZI.getValue() : this.LJIIJ;
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final void LJJJ() {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS123S0100000_23(this, 201));
        } else {
            super.LJJJ();
        }
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final void pause() {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS123S0100000_23(this, 206));
        } else {
            super.pause();
        }
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final void release() {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS123S0100000_23(this, 202));
        } else {
            super.release();
        }
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final void reset() {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS123S0100000_23(this, 205));
        } else {
            super.reset();
        }
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final void resume() {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS123S0100000_23(this, 204));
        } else {
            super.resume();
        }
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final void stop() {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS123S0100000_23(this, 203));
        } else {
            super.stop();
        }
    }

    public static void LJLJJI(C1480620odI c1480620odI) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.pause$1L");
        super.pause();
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.pause$1L");
    }

    public static void LJLJLJ(C1480620odI c1480620odI) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.release$1L");
        super.release();
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.release$1L");
    }

    public static void LJLJLLL(C1480620odI c1480620odI) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.reset$1L");
        super.reset();
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.reset$1L");
    }

    public static void LJLL(C1480620odI c1480620odI) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.resume$1L");
        super.resume();
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.resume$1L");
    }

    public static void LJLLL(C1480620odI c1480620odI) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.sleep$1L");
        super.LJJJ();
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.sleep$1L");
    }

    public static void LJLLLL(C1480620odI c1480620odI) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.stop$1L");
        super.stop();
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.stop$1L");
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final void LJJJJJL(C1479530obX c1479530obX) {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS92S0200000_23(this, c1479530obX, 137));
        } else {
            super.LJJJJJL(c1479530obX);
        }
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final void LJJJLZIJ(C1479530obX c1479530obX) {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS92S0200000_23(this, c1479530obX, 138));
        } else {
            super.LJJJLZIJ(c1479530obX);
        }
    }

    @Override // X.AbstractC1479520obW
    public final void LJL(C1479510obV c1479510obV) {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS92S0200000_23(this, c1479510obV, 139));
        } else {
            super.LJL(c1479510obV);
        }
    }

    @Override // X.C1479300obA, X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final void seek(float f) {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS8S0100001_23(this, f, 3));
        } else {
            super.seek(f);
        }
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final void setSurface(Surface surface) {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS92S0200000_23(this, surface, 136));
        } else {
            super.setSurface(surface);
        }
    }

    public C1480620odI(C1476550oWj c1476550oWj, C1476570oWl c1476570oWl) {
        super(c1476550oWj, c1476570oWl);
        this.LJJIIJ = C452501pT.LIZIZ(new AObjectS73S0000000_23(17));
        this.LJJIIJZLJL = C452501pT.LIZIZ(new AObjectS397S0100000_23(this, 16));
        this.LJJIIZ = C452501pT.LIZIZ(new AObjectS66S0000000_13(9));
        this.LJJIIZI = C452501pT.LIZIZ(new AObjectS397S0100000_23(this, 17));
        this.LJJIJ = C452501pT.LIZIZ(new AObjectS397S0100000_23(this, 18));
    }

    public static void LJLJJL(C1480620odI c1480620odI, C1479530obX c1479530obX) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.prepare$2L");
        super.LJJJJJL(c1479530obX);
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.prepare$2L");
    }

    public static void LJLJJLL(C1480620odI c1480620odI, C1479510obV c1479510obV) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.prepareNext$1L");
        super.LJL(c1479510obV);
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.prepareNext$1L");
    }

    public static void LJLJL(C1480620odI c1480620odI, C1479530obX c1479530obX) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.prepareNext$2L");
        super.LJJJLZIJ(c1479530obX);
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.prepareNext$2L");
    }

    public static void LJLLI(C1480620odI c1480620odI, float f) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.seek$1L");
        super.seek(f);
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.seek$1L");
    }

    public static void LJLLILLLL(C1480620odI c1480620odI, Surface surface) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.setSurface$1L");
        super.setSurface(surface);
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.setSurface$1L");
    }

    @Override // X.AbstractC1479520obW, X.InterfaceC1483670oiD
    public final void LJIJJLI(Surface surface, boolean z) {
        if (LJLILLLLZI()) {
            C786410Ut5.LJJZZIII(LJLJI(), new ARunnableS23S0210000_23(this, surface, 3));
        } else {
            super.LJIJJLI(surface, true);
        }
    }

    public static void LJLLJ(C1480620odI c1480620odI, Surface surface, boolean z) {
        C1C7U.LIZ("TTAsyncSimPlayer@f66a.setSurface$2L");
        super.LJIJJLI(surface, z);
        C1C7U.LIZIZ("TTAsyncSimPlayer@f66a.setSurface$2L");
    }
}
