package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS34S0101000_23;
import android.os.Handler;

/* JADX INFO: renamed from: X.0obn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1479690obn extends C1479400obK {
    public final Handler LIZLLL;

    @Override // X.C1479550obZ, X.InterfaceC1481730of5
    public final void LJJIIZ() {
        C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS123S0100000_23(this, 208));
    }

    @Override // X.C1479550obZ, X.InterfaceC1481730of5
    public final void LJJIIZI() {
        C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS123S0100000_23(this, 207));
    }

    public static void LJIIJJI(C1479690obn c1479690obn) {
        C1C7U.LIZ("TTAsyncVideoInfoProvider@b112.startSamplePlayProgress$1L");
        super.LJJIIZ();
        C1C7U.LIZIZ("TTAsyncVideoInfoProvider@b112.startSamplePlayProgress$1L");
    }

    public static void LJIILIIL(C1479690obn c1479690obn) {
        C1C7U.LIZ("TTAsyncVideoInfoProvider@b112.stopSamplePlayProgress$1L");
        super.LJJIIZI();
        C1C7U.LIZIZ("TTAsyncVideoInfoProvider@b112.stopSamplePlayProgress$1L");
    }

    @Override // X.C1479550obZ, X.InterfaceC1481730of5
    public final void LJJIJIIJI(int i) {
        C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS34S0101000_23(this, i, 16));
    }

    public static void LJIIL(C1479690obn c1479690obn, int i) {
        C1C7U.LIZ("TTAsyncVideoInfoProvider@b112.startSamplePlayProgress$2L");
        super.LJJIJIIJI(i);
        C1C7U.LIZIZ("TTAsyncVideoInfoProvider@b112.startSamplePlayProgress$2L");
    }

    public C1479690obn(InterfaceC1479560oba interfaceC1479560oba, C1480620odI c1480620odI, C1480040ocM c1480040ocM, Handler handler) {
        super(interfaceC1479560oba, c1480620odI, c1480040ocM);
        this.LIZLLL = handler;
    }
}
