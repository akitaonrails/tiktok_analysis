package X;

import X.C1119670fF7;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0fF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1119670fF7<T extends C1119670fF7<T>> {
    public final Context LIZ;
    public final View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public View.OnClickListener LJ;
    public int LJI;
    public int LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public InterfaceC254600ye LJIILL;
    public InterfaceC254900yh LJIILLIIL;
    public boolean LJIJ;
    public AbstractC1119600fF0 LJIJI;
    public CharSequence LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public final int LJJ;
    public final int LJJI;
    public final int LJJIFFI;
    public final int LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public int LJFF = 48;
    public int LJIILJJIL = Integer.MAX_VALUE;
    public boolean LJIIZILJ = true;

    public C1119660fF6 LIZJ() {
        throw null;
    }

    public C1119670fF7(View view) {
        this.LIZIZ = view;
        if (view != null) {
            Context context = view.getContext();
            this.LIZ = context;
            this.LJIJJLI = C20736316Cj.LIZIZ(R.attr.fxy, context);
            this.LJIL = C20736316Cj.LIZIZ(R.attr.fxc, context);
            this.LJJ = context.getResources().getDimensionPixelSize(R.dimen.b0b);
            this.LJJI = context.getResources().getDimensionPixelSize(R.dimen.b0b);
            this.LJJIFFI = context.getResources().getDimensionPixelSize(R.dimen.b0b);
            this.LJJII = context.getResources().getDimensionPixelSize(R.dimen.b0b);
        }
    }

    public final void LIZ(final int i) {
        C1119810fFL c1119810fFLLJIIIIZZ = C011Z.LIZ.LJIIIIZZ();
        final Context context = this.LIZ;
        if (context != null && c1119810fFLLJIIIIZZ != null) {
            this.LJIJI = new AbstractC1119600fF0(context, i) { // from class: X.0fF1
                public final Context LIZIZ;
                public final int LIZJ;

                @Override // X.AbstractC1119600fF0
                public final void LIZJ() {
                }

                @Override // X.AbstractC1119600fF0
                public final EnumC1119730fFD LIZ() {
                    return EnumC1119730fFD.ATTR;
                }

                @Override // X.AbstractC1119600fF0
                public final void LIZIZ(C1119650fF5 c1119650fF5) {
                    C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(this.LIZJ, this.LIZIZ);
                    if (c20743516FdLIZLLL != null) {
                        c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.eyy, this.LIZIZ));
                        c1119650fF5.LIZ(c20743516FdLIZLLL);
                    } else {
                        new Throwable();
                        c1119650fF5.LIZIZ();
                    }
                }

                {
                    this.LIZIZ = context;
                    this.LIZJ = i;
                }
            };
        }
    }

    public final void LIZIZ(int i) {
        this.LJIJJLI = C20736316Cj.LIZIZ(i, this.LIZ);
    }

    public final void LIZLLL(int i) {
        Context context = this.LIZ;
        if (context != null) {
            this.LJIJJ = context.getResources().getString(i);
        }
    }

    public final void LJ(int i) {
        this.LJIL = C20736316Cj.LIZIZ(i, this.LIZ);
    }

    public final void LJFF(List list) {
        if (list != null && !list.isEmpty()) {
            C1119810fFL c1119810fFLLJIIIIZZ = C011Z.LIZ.LJIIIIZZ();
            Context context = this.LIZ;
            if (context != null && c1119810fFLLJIIIIZZ != null) {
                this.LJIJI = new C1119630fF3(context, list);
            }
        }
    }

    public C1119670fF7(int i, View view) {
        this.LIZIZ = view;
        if (view != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(view.getContext(), i);
            this.LIZ = contextThemeWrapper;
            this.LJIJJLI = C20736316Cj.LIZIZ(R.attr.fxy, contextThemeWrapper);
            this.LJIL = C20736316Cj.LIZIZ(R.attr.fxc, contextThemeWrapper);
            try {
                this.LJJ = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.b0b);
                this.LJJI = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.b0b);
                this.LJJIFFI = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.b0b);
                this.LJJII = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.b0b);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
