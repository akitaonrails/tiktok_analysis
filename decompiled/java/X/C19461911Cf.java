package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11Cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19461911Cf extends C11D3 {
    public Function1<? super ViewGroup, ? extends C11DA> LJ;
    public C11DA LJI;
    public boolean LJIIIZ;
    public Function0<Unit> LJIIJ;
    public int LIZLLL = 16056320;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS573S0100000_29(this, 980));
    public int LJII = 241;
    public int LJIIIIZZ = 241;
    public final C11D1 LJIIJJI = new C11D1(this);

    @Override // X.C11D7
    public final boolean isEnable() {
        return (this.LJIIIIZZ == 241 || this.LJIIJ == null) ? false : true;
    }

    @Override // X.C11D7
    public final int getViewType() {
        return this.LIZLLL;
    }

    @Override // X.C11D7
    public final RecyclerView.ViewHolder LIZ(ViewGroup viewGroup) {
        final View view;
        C11DA c11da = this.LJI;
        if (c11da == null || (view = c11da.getView()) == null) {
            Function1<? super ViewGroup, ? extends C11DA> function1 = this.LJ;
            if (function1 == null) {
                function1 = (Function1) this.LJFF.getValue();
            }
            C11DA c11daInvoke = function1.invoke(viewGroup);
            this.LJI = c11daInvoke;
            view = c11daInvoke.getView();
        }
        C11DG c11dg = new C11DG(view) { // from class: X.11DH
        };
        int i = this.LJII;
        C11DA c11da2 = this.LJI;
        if (c11da2 != null) {
            c11da2.LIZIZ(i);
        }
        LIZLLL(c11dg);
        return c11dg;
    }

    @Override // X.C11D7
    public final void LIZIZ(int i) {
        this.LIZLLL = i;
    }

    public final void LJFF(int i) {
        if (this.LJII == i && !this.LJIIIZ) {
            this.LJIIIZ = true;
            LJI(242);
            Function0<Unit> function0 = this.LJIIJ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void LJI(int i) {
        boolean z;
        if (this.LJII == i) {
            return;
        }
        this.LJII = i;
        if (i == 242) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIZ = z;
        C11DA c11da = this.LJI;
        if (c11da != null) {
            c11da.LIZIZ(i);
        }
    }
}
