package X;

import Y.ALAdapterS1S0300000_6;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0GjK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423640GjK extends C423520Gj8 {
    public final int LLJJIJIL;
    public boolean LLJJJ;
    public final List<RecyclerView.ViewHolder> LLJJJIL = new ArrayList();
    public final Set<RecyclerView.ViewHolder> LLJJJJ = new LinkedHashSet();
    public final PathInterpolator LLJJJJJIL = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIIL() {
        Iterator it2 = C13LP.LLIIII(this.LLJJJIL).iterator();
        while (it2.hasNext()) {
            LJIIJJI((RecyclerView.ViewHolder) it2.next());
        }
        Iterator it3 = C13LP.LLIIII(this.LLJJJJ).iterator();
        while (it3.hasNext()) {
            LJIIJJI((RecyclerView.ViewHolder) it3.next());
        }
        super.LJIIL();
        if (LJIIZILJ()) {
            return;
        }
        LJIIJ();
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final boolean LJIIZILJ() {
        return (this.LLJJJIL.isEmpty() ^ true) || (this.LLJJJJ.isEmpty() ^ true) || super.LJIIZILJ();
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIJI() {
        List<RecyclerView.ViewHolder> listLLIIII = C13LP.LLIIII(this.LLJJJIL);
        ((ArrayList) this.LLJJJIL).clear();
        super.LJIJI();
        for (RecyclerView.ViewHolder viewHolder : listLLIIII) {
            View view = viewHolder.itemView;
            this.LLJJJJ.add(viewHolder);
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-4));
            ViewPropertyAnimator viewPropertyAnimatorTranslationX = view.animate().translationX(this.LLJJIJIL == 1 ? 0.0f : fLIZIZ);
            if (this.LLJJIJIL != 1) {
                fLIZIZ = 0.0f;
            }
            viewPropertyAnimatorTranslationX.translationY(fLIZIZ).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(680L).setInterpolator(this.LLJJJJJIL).setListener(new ALAdapterS1S0300000_6(view, this, viewHolder, 9)).start();
        }
        if (LJIIZILJ()) {
            return;
        }
        LJIIJ();
    }

    public C423640GjK(int i) {
        this.LLJJIJIL = i;
        this.LLIZ = false;
    }

    public static final void LJJIJL(View view) {
        C786410Ut5.T4(view, 1.0f);
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.ed(view, 0.0f);
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIIJJI(RecyclerView.ViewHolder viewHolder) {
        if (((ArrayList) this.LLJJJIL).remove(viewHolder)) {
            LJJIJL(viewHolder.itemView);
            LJJIIJ(viewHolder);
        }
        if (this.LLJJJJ.remove(viewHolder)) {
            viewHolder.itemView.animate().cancel();
            LJJIJL(viewHolder.itemView);
            LJJIIJ(viewHolder);
            if (!LJIIZILJ()) {
                LJIIJ();
            }
        }
        super.LJIIJJI(viewHolder);
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.animate().cancel();
        if (!this.LLJJJ) {
            LJJIJL(viewHolder.itemView);
            LJJIIJ(viewHolder);
            return false;
        }
        View view = viewHolder.itemView;
        if (this.LLJJIJIL == 1) {
            C786410Ut5.ed(view, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(126)));
        } else {
            C786410Ut5.Jc(view, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(126)));
        }
        C786410Ut5.T4(view, 1.0f);
        C786410Ut5.Ob(view, 0.992f);
        C786410Ut5.pc(view, 0.992f);
        ((ArrayList) this.LLJJJIL).add(viewHolder);
        return true;
    }

    public final void LJJIJIL(RecyclerView.ViewHolder viewHolder) {
        if (!this.LLJJJJ.remove(viewHolder)) {
            return;
        }
        LJJIJL(viewHolder.itemView);
        LJJIIJ(viewHolder);
        if (!LJIIZILJ()) {
            LJIIJ();
        }
    }
}
