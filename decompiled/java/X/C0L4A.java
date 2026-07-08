package X;

import Y.ARunnableS108S0100000_8;
import android.os.Handler;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import kotlin.jvm.internal.AwS148S0101000_8;

/* JADX INFO: renamed from: X.0L4A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L4A {
    public CreativeDialogWrapper LIZ;
    public InterfaceC354490Dv5 LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public final ARunnableS108S0100000_8 LJ = new ARunnableS108S0100000_8(this, 125);
    public final /* synthetic */ C537830L7l LJFF;

    public C0L4A(C537830L7l c537830L7l) {
        this.LJFF = c537830L7l;
    }

    public final void LIZ(int i) {
        if (this.LIZJ < i && i <= 100) {
            C0CNO.LIZLLL(0L, new AwS148S0101000_8(this, i, 10));
            ARunnableS108S0100000_8 aRunnableS108S0100000_8 = this.LJ;
            C377010EqJ c377010EqJ = C536830L3p.LIZ;
            ((Handler) c377010EqJ.getValue()).removeCallbacks(aRunnableS108S0100000_8);
            C786410Ut5.LJLIIL(1000L, (Handler) c377010EqJ.getValue(), this.LJ);
        }
    }
}
