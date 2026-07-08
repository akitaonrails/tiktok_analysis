package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0dJF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045350dJF implements InterfaceC2213031BjR {
    public C1045360dJG LIZ;
    public final Context LIZIZ;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public boolean LIZLLL = false;
    public boolean LJ = false;
    public boolean LJFF = true;

    @Override // X.InterfaceC2213031BjR
    public final void LIZ() {
        C1045770dJv c1045770dJv;
        C1045360dJG c1045360dJG = this.LIZ;
        if (c1045360dJG == null || c1045360dJG.LIZIZ == null || (c1045770dJv = c1045360dJG.LIZJ) == null) {
            return;
        }
        C1045780dJw.LIZJ(c1045770dJv.LIZ);
        c1045770dJv.LIZ.LJ.LIZ("thirdQuartile", null);
    }

    @Override // X.InterfaceC2213031BjR
    public final void LIZJ() {
        if (this.LIZ == null) {
            return;
        }
        int iLIZ = C2540709xV.LIZ();
        if (iLIZ <= 0) {
            C1045360dJG c1045360dJG = this.LIZ;
            C1BUP c1bup = c1045360dJG.LIZIZ;
            if (c1bup != null) {
                c1bup.LIZJ();
                c1045360dJG.LIZIZ = null;
            }
            this.LIZ = null;
            return;
        }
        if (!this.LIZLLL) {
            LJIIIIZZ();
        }
        if (!this.LJFF) {
            iLIZ = 0;
        }
        C786410Ut5.LJLIIL(iLIZ * LSPassThroughRecordSizeConfig.DEFAULT, this.LIZJ, new ARunnableS116S0100000_16(this, 118));
    }

    @Override // X.InterfaceC2213031BjR
    public final void LIZLLL() {
        C1045770dJv c1045770dJv;
        C1045360dJG c1045360dJG = this.LIZ;
        if (c1045360dJG == null || c1045360dJG.LIZIZ == null || (c1045770dJv = c1045360dJG.LIZJ) == null) {
            return;
        }
        C1045780dJw.LIZJ(c1045770dJv.LIZ);
        c1045770dJv.LIZ.LJ.LIZ("firstQuartile", null);
    }

    @Override // X.InterfaceC2213031BjR
    public final void LJ() {
        C1045770dJv c1045770dJv;
        C1045360dJG c1045360dJG = this.LIZ;
        if (c1045360dJG == null) {
            return;
        }
        this.LIZLLL = true;
        if (c1045360dJG.LIZIZ == null || (c1045770dJv = c1045360dJG.LIZJ) == null) {
            return;
        }
        c1045770dJv.LIZ(EnumC1999407sO.CLICK);
    }

    @Override // X.InterfaceC2213031BjR
    public final void LJFF() {
        C1045770dJv c1045770dJv;
        C1045360dJG c1045360dJG = this.LIZ;
        if (c1045360dJG == null || c1045360dJG.LIZIZ == null || (c1045770dJv = c1045360dJG.LIZJ) == null) {
            return;
        }
        C1045780dJw.LIZJ(c1045770dJv.LIZ);
        c1045770dJv.LIZ.LJ.LIZ("midpoint", null);
    }

    @Override // X.InterfaceC2213031BjR
    public final void LJII() {
        C1045770dJv c1045770dJv;
        C1045360dJG c1045360dJG = this.LIZ;
        if (c1045360dJG == null) {
            return;
        }
        if (c1045360dJG.LIZIZ != null && (c1045770dJv = c1045360dJG.LIZJ) != null) {
            C1045780dJw.LIZJ(c1045770dJv.LIZ);
            c1045770dJv.LIZ.LJ.LIZ("complete", null);
        }
        this.LIZLLL = true;
    }

    @Override // X.InterfaceC2213031BjR
    public final void LJIIIIZZ() {
        C1045770dJv c1045770dJv;
        C1045360dJG c1045360dJG = this.LIZ;
        if (c1045360dJG == null || this.LJ) {
            return;
        }
        if (c1045360dJG.LIZIZ != null && (c1045770dJv = c1045360dJG.LIZJ) != null) {
            C1045780dJw.LIZJ(c1045770dJv.LIZ);
            c1045770dJv.LIZ.LJ.LIZ("skipped", null);
        }
        this.LJ = true;
    }

    public C1045350dJF(Context context) {
        if (context != null) {
            this.LIZIZ = C786410Ut5.N3(context);
        }
    }

    @Override // X.InterfaceC2213031BjR
    public final void LJI(C2212201Bi6 c2212201Bi6) {
        Context context = this.LIZIZ;
        C1046020dKK c1046020dKK = C1BUQ.LIZ;
        if (!c1046020dKK.LIZ) {
            C1BUQ.LIZ(context);
            if (c1046020dKK.LIZ) {
                C1BUU.LJFF.LIZ();
            } else {
                throw new IllegalStateException("Method called before OM SDK activation");
            }
        }
        if (!c1046020dKK.LIZ) {
            return;
        }
        if (this.LIZ != null) {
            LIZJ();
        }
        this.LIZ = new C1045360dJG(c2212201Bi6);
        this.LJFF = c2212201Bi6.LJIIL();
        this.LIZLLL = false;
        this.LJ = false;
    }

    @Override // X.InterfaceC2213031BjR
    public final void LJIIIZ(long j) throws Throwable {
        C1045770dJv c1045770dJv;
        C1045360dJG c1045360dJG = this.LIZ;
        if (c1045360dJG != null && c1045360dJG.LIZIZ != null && (c1045770dJv = c1045360dJG.LIZJ) != null) {
            C2204961BRm.LLLLZIL(c1045770dJv, j, 0.0f, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMq3H0kSSIX/Yu3tCoB2JVr6ICJaybNJI4x3rH7FA=", null));
        }
    }

    @Override // X.InterfaceC2213031BjR
    public final void LIZIZ(View view, List<View> list) throws Throwable {
        C1BUP c1bup;
        C1045360dJG c1045360dJG = this.LIZ;
        if (c1045360dJG != null && (c1bup = c1045360dJG.LIZIZ) != null) {
            c1bup.LIZLLL(view);
            if (list != null) {
                Iterator<View> it2 = list.iterator();
                while (it2.hasNext()) {
                    c1045360dJG.LIZIZ.LIZ(it2.next(), EnumC1045490dJT.OTHER);
                }
            }
            if (c1045360dJG.LIZ) {
                c1045360dJG.LIZJ = C1045770dJv.LIZIZ(c1045360dJG.LIZIZ);
            }
            c1045360dJG.LIZIZ.LJI();
            C1045790dJx c1045790dJxLIZ = C1045790dJx.LIZ(c1045360dJG.LIZIZ);
            EnumC1045500dJU enumC1045500dJU = EnumC1045500dJU.STANDALONE;
            C1045780dJw.LIZ(enumC1045500dJU, "Position is null");
            C2204961BRm.LLLLZI(c1045790dJxLIZ, new C1045910dK9(enumC1045500dJU), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMq3H0kSSIX/Yu3tCoB2JVr6ICJaybNJI4x3rH7FA=", null));
            c1045790dJxLIZ.LIZIZ();
        }
    }
}
