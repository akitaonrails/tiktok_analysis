package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.ConstraintFloatWindowLayout;

/* JADX INFO: renamed from: X.0UhO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C779160UhO extends AbstractC779180UhQ implements InterfaceC779170UhP {
    public final Context LIZ;
    public final WindowManager LIZIZ;
    public final ConstraintFloatWindowLayout.LayoutParams LIZJ;
    public View LIZLLL;
    public boolean LJ = true;
    public InterfaceC779170UhP LJFF;

    public void LJI() {
        if (this.LJ) {
            return;
        }
        this.LIZIZ.removeView(this.LIZLLL);
        this.LJ = true;
    }

    public void LJIIIIZZ() {
        C786410Ut5.LJLLLLLL(4, this.LIZLLL);
    }

    public final void LJIIIZ() {
        LJIIJ(new ARunnableS112S0100000_12(this, 12));
    }

    public void LJIIJJI() {
        C786410Ut5.LJLLLLLL(0, this.LIZLLL);
    }

    @Override // X.InterfaceC779170UhP
    public int getResId() {
        InterfaceC779170UhP interfaceC779170UhP = this.LJFF;
        if (interfaceC779170UhP != null) {
            return interfaceC779170UhP.getResId();
        }
        return -1;
    }

    public C779160UhO(Context context) {
        this.LIZ = context;
        this.LIZIZ = (WindowManager) C786410Ut5.H2(context, "window");
        ConstraintFloatWindowLayout.LayoutParams layoutParams = new ConstraintFloatWindowLayout.LayoutParams();
        this.LIZJ = layoutParams;
        ((WindowManager.LayoutParams) layoutParams).format = 1;
        ((WindowManager.LayoutParams) layoutParams).flags = 552;
        ((WindowManager.LayoutParams) layoutParams).windowAnimations = 0;
    }

    public static void LJIIJ(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(C473410IhP.LIZ(), runnable);
        }
    }

    @Override // X.InterfaceC779170UhP
    public void LJ(ConstraintFloatWindowLayout constraintFloatWindowLayout) {
        InterfaceC779170UhP interfaceC779170UhP = this.LJFF;
        if (interfaceC779170UhP != null) {
            interfaceC779170UhP.LJ(constraintFloatWindowLayout);
        }
    }

    public final void LJIILJJIL(int i) {
        if (this.LJ) {
            return;
        }
        ((WindowManager.LayoutParams) this.LIZJ).x = i;
        LJIIJ(new ARunnableS112S0100000_12(this, 13));
    }

    public final void LJII(int i, int i2) {
        ConstraintFloatWindowLayout.LayoutParams layoutParams = this.LIZJ;
        ((WindowManager.LayoutParams) layoutParams).gravity = 8388659;
        ((WindowManager.LayoutParams) layoutParams).x = i;
        ((WindowManager.LayoutParams) layoutParams).y = i2;
    }

    public final void LJIIL(int i, int i2) {
        ConstraintFloatWindowLayout.LayoutParams layoutParams = this.LIZJ;
        ((WindowManager.LayoutParams) layoutParams).width = i;
        ((WindowManager.LayoutParams) layoutParams).height = i2;
        LJIIJ(new ARunnableS112S0100000_12(this, 13));
    }

    public final void LJIILIIL(int i, int i2) {
        if (this.LJ) {
            return;
        }
        ConstraintFloatWindowLayout.LayoutParams layoutParams = this.LIZJ;
        ((WindowManager.LayoutParams) layoutParams).x = i;
        ((WindowManager.LayoutParams) layoutParams).y = i2;
        LJIIJ(new ARunnableS112S0100000_12(this, 13));
    }

    @Override // X.InterfaceC779170UhP
    public final void LJFF(int i, int i2, View view) {
        InterfaceC779170UhP interfaceC779170UhP = this.LJFF;
        if (interfaceC779170UhP != null) {
            interfaceC779170UhP.LJFF(i, i2, view);
        }
    }
}
