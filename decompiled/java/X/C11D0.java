package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11D0, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11D0 extends C11D3 {
    public final C11D3 LIZLLL;
    public final C11D3 LJ;
    public Function1<? super ViewGroup, ? extends C11D9> LJI;
    public C11D9 LJIIIIZZ;
    public int LJIIIZ;
    public int LJFF = 15990784;
    public final C01GW LJII = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(404));
    public int LJIIJ = 241;

    @Override // X.C11D3
    public final int LIZJ() {
        int iLIZJ = (this.LJIIJ == 241 || (this.LJIIIZ & 1) != 1) ? 0 : 1;
        if (this.LIZLLL.isEnable() && (this.LJIIIZ & 2) == 2) {
            iLIZJ += this.LIZLLL.LIZJ();
        }
        return (this.LJ.isEnable() && (this.LJIIIZ & 4) == 4) ? iLIZJ + this.LJ.LIZJ() : iLIZJ;
    }

    @Override // X.C11D7
    public final boolean isEnable() {
        return this.LJIIIZ != 0;
    }

    @Override // X.C11D7
    public final int getViewType() {
        return this.LJFF;
    }

    @Override // X.C11D7
    public final RecyclerView.ViewHolder LIZ(ViewGroup viewGroup) {
        final View view;
        C11D9 c11d9 = this.LJIIIIZZ;
        if (c11d9 == null || (view = c11d9.getView()) == null) {
            Function1<? super ViewGroup, ? extends C11D9> function1 = this.LJI;
            if (function1 == null) {
                function1 = (Function1) this.LJII.getValue();
            }
            C11D9 c11d9Invoke = function1.invoke(viewGroup);
            this.LJIIIIZZ = c11d9Invoke;
            view = c11d9Invoke.getView();
        }
        C11DG c11dg = new C11DG(view) { // from class: X.11DF
        };
        int i = this.LJIIJ;
        C11D9 c11d92 = this.LJIIIIZZ;
        if (c11d92 != null) {
            c11d92.LIZ(i);
        }
        LIZLLL(c11dg);
        return c11dg;
    }

    @Override // X.C11D7
    public final void LIZIZ(int i) {
        this.LJFF = i;
    }

    public C11D0(C11D5 c11d5, C11D4 c11d4) {
        this.LIZLLL = c11d5;
        this.LJ = c11d4;
    }
}
