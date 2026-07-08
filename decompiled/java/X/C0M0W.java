package X;

import Y.ARunnableS108S0100000_8;
import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0M0W, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M0W implements C0M1L {
    public static final /* synthetic */ int LIZLLL = 0;
    public C1749280vcc LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(641));
    public ARunnableS108S0100000_8 LIZJ;

    @Override // X.C0M1L
    public final void onDestroy() {
    }

    public final void LIZIZ() {
        ARunnableS108S0100000_8 aRunnableS108S0100000_8 = this.LIZJ;
        if (aRunnableS108S0100000_8 != null) {
            ((Handler) this.LIZIZ.getValue()).removeCallbacks(aRunnableS108S0100000_8);
        }
        C1749280vcc c1749280vcc = this.LIZ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
    }

    public final void LIZJ(long j) {
        ARunnableS108S0100000_8 aRunnableS108S0100000_8 = this.LIZJ;
        if (aRunnableS108S0100000_8 != null) {
            ((Handler) this.LIZIZ.getValue()).removeCallbacks(aRunnableS108S0100000_8);
        }
        ARunnableS108S0100000_8 aRunnableS108S0100000_82 = new ARunnableS108S0100000_8(this, 151);
        this.LIZJ = aRunnableS108S0100000_82;
        C786410Ut5.LJLIIL(j, (Handler) this.LIZIZ.getValue(), aRunnableS108S0100000_82);
    }

    @Override // X.C0M1L
    public final void LIZ(View view, DraftBoxPageViewModel draftBoxPageViewModel, InterfaceC561590M0v interfaceC561590M0v) {
        C1749280vcc c1749280vcc;
        if (view instanceof C1749280vcc) {
            c1749280vcc = (C1749280vcc) view;
        } else {
            c1749280vcc = null;
        }
        this.LIZ = c1749280vcc;
    }
}
