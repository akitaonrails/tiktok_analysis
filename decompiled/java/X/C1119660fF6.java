package X;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.other.LiveBubbleColorOptSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1119660fF6 {
    public final Context LIZ;
    public View LIZIZ;
    public View LIZJ;
    public final View LIZLLL;
    public View.OnClickListener LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public final int LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final AbstractC1119600fF0 LJIILIIL;
    public CharSequence LJIILJJIL;
    public C1119750fFF LJIILL;
    public InterfaceC254600ye LJIILLIIL;
    public InterfaceC254900yh LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public boolean LJJ;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;
    public Object LJJIII;

    public boolean LIZLLL() {
        return true;
    }

    public void LJIIIIZZ() {
        this.LJIIL = true;
    }

    public final boolean LIZJ() {
        View view = this.LIZIZ;
        return view != null && view.getRootView() != null && (this.LIZIZ.getRootView().getLayoutParams() instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) this.LIZIZ.getRootView().getLayoutParams()).type == 2;
    }

    public final void LJ() {
        AbstractC1119600fF0 abstractC1119600fF0 = this.LJIILIIL;
        if (abstractC1119600fF0 != null) {
            abstractC1119600fF0.LIZJ();
        }
    }

    public CharSequence LIZ() {
        return this.LJIILJJIL;
    }

    public InterfaceC254900yh LIZIZ() {
        return this.LJIIZILJ;
    }

    public C1119660fF6(C1119670fF7<?> c1119670fF7) {
        Context context = c1119670fF7.LIZ;
        this.LIZ = context;
        if (context != null) {
            if (!c1119670fF7.LJIIIZ) {
                this.LJIIIIZZ = context.getResources().getInteger(R.integer.ch);
            } else {
                this.LJIIIIZZ = c1119670fF7.LJIIIIZZ;
            }
            if (!c1119670fF7.LJIIJJI) {
                this.LJIIIZ = context.getResources().getDimensionPixelSize(R.dimen.b0c);
            } else {
                this.LJIIIZ = c1119670fF7.LJIIJ;
            }
            if (!c1119670fF7.LJIILIIL) {
                this.LJIIJ = context.getResources().getDimensionPixelSize(R.dimen.b0f);
            } else {
                this.LJIIJ = c1119670fF7.LJIIL;
            }
        }
        this.LIZIZ = c1119670fF7.LIZIZ;
        this.LIZJ = c1119670fF7.LIZJ;
        View view = c1119670fF7.LIZLLL;
        this.LIZLLL = view;
        this.LJ = c1119670fF7.LJ;
        this.LJFF = c1119670fF7.LJFF;
        this.LJI = c1119670fF7.LJI;
        this.LJII = c1119670fF7.LJII;
        this.LJIIJJI = c1119670fF7.LJIIZILJ;
        this.LJIIL = c1119670fF7.LJIJ;
        this.LJIILLIIL = c1119670fF7.LJIILL;
        this.LJIIZILJ = c1119670fF7.LJIILLIIL;
        this.LJIILJJIL = c1119670fF7.LJIJJ;
        this.LJIILIIL = c1119670fF7.LJIJI;
        this.LJIJ = c1119670fF7.LJIJJLI;
        int i = c1119670fF7.LJIL;
        this.LJIJI = c1119670fF7.LJJ;
        this.LJIJJ = c1119670fF7.LJJI;
        this.LJIJJLI = c1119670fF7.LJJIFFI;
        this.LJIL = c1119670fF7.LJJII;
        this.LJJ = false;
        this.LJJI = c1119670fF7.LJJIII;
        this.LJJIFFI = c1119670fF7.LJJIIJ;
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.fxy, context);
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.fxc, context);
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (c1119850fFP.LJJI != null) {
            c1119850fFP.LJJI.getClass();
            if (LiveBubbleColorOptSetting.INSTANCE.getValue() && !LIZJ()) {
                if (((this instanceof C1119590fEz) || (this instanceof C785270UrF)) && this.LIZJ == null && view == null && iLIZIZ == this.LJIJ && iLIZIZ2 == i) {
                    this.LJJII = true;
                }
            }
        }
    }

    public void LJFF(long j) {
        this.LJIIIIZZ = j;
    }

    public void LJI(InterfaceC254900yh interfaceC254900yh) {
        this.LJIIZILJ = interfaceC254900yh;
    }

    public void LJII(boolean z) {
        this.LJIIJJI = z;
    }
}
