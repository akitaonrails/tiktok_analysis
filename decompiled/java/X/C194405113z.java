package X;

import Y.AAListenerS142S0300000_29;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS62S0300000_29;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.113z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194405113z extends C423520Gj8 {
    public boolean LLJJIJIL;
    public final List<RecyclerView.ViewHolder> LLJJJ;
    public final List<RecyclerView.ViewHolder> LLJJJIL;
    public final List<RecyclerView.ViewHolder> LLJJJJ;
    public final List<RecyclerView.ViewHolder> LLJJJJJIL;
    public final List<RecyclerView.ViewHolder> LLJJJJLIIL;
    public final List<RecyclerView.ViewHolder> LLJJL;
    public final List<RecyclerView.ViewHolder> LLJJLIIIJLLLLLLLZ;
    public final List<RecyclerView.ViewHolder> LLJL;

    @Override // X.AbstractC21673719rz
    public final long LJIILIIL() {
        return 300L;
    }

    @Override // X.AbstractC21673719rz
    public final long LJIILJJIL() {
        return 300L;
    }

    @Override // X.AbstractC21673719rz
    public final long LJIILL() {
        return 300L;
    }

    @Override // X.AbstractC21673719rz
    public final long LJIILLIIL() {
        return 300L;
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIIL() {
        for (RecyclerView.ViewHolder viewHolder : this.LLJJJIL) {
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            LJJIIJ(viewHolder);
        }
        ((ArrayList) this.LLJJJIL).clear();
        for (RecyclerView.ViewHolder viewHolder2 : this.LLJJJ) {
            C786410Ut5.T4(viewHolder2.itemView, 1.0f);
            C786410Ut5.Jc(viewHolder2.itemView, 0.0f);
            LJJIIJ(viewHolder2);
        }
        ((ArrayList) this.LLJJJ).clear();
        for (RecyclerView.ViewHolder viewHolder3 : this.LLJJJJJIL) {
            C786410Ut5.T4(viewHolder3.itemView, 1.0f);
            LJIIIZ(viewHolder3);
        }
        ((ArrayList) this.LLJJJJJIL).clear();
        for (RecyclerView.ViewHolder viewHolder4 : this.LLJJJJ) {
            C786410Ut5.T4(viewHolder4.itemView, 1.0f);
            C786410Ut5.Jc(viewHolder4.itemView, 0.0f);
            LJIIIZ(viewHolder4);
        }
        ((ArrayList) this.LLJJJJ).clear();
        Iterator it2 = new ArrayList(this.LLJJL).iterator();
        while (it2.hasNext()) {
            ((RecyclerView.ViewHolder) it2.next()).itemView.animate().cancel();
        }
        Iterator it3 = new ArrayList(this.LLJJJJLIIL).iterator();
        while (it3.hasNext()) {
            ((RecyclerView.ViewHolder) it3.next()).itemView.animate().cancel();
        }
        Iterator it4 = new ArrayList(this.LLJL).iterator();
        while (it4.hasNext()) {
            ((RecyclerView.ViewHolder) it4.next()).itemView.animate().cancel();
        }
        Iterator it5 = new ArrayList(this.LLJJLIIIJLLLLLLLZ).iterator();
        while (it5.hasNext()) {
            ((RecyclerView.ViewHolder) it5.next()).itemView.animate().cancel();
        }
        super.LJIIL();
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIJI() {
        if (this.LLJJIJIL) {
            this.LLJJIJIL = false;
            if (LJIIZILJ()) {
                return;
            }
            LJIIJ();
            return;
        }
        for (RecyclerView.ViewHolder viewHolder : (ArrayList) this.LLJJJ) {
            ((ArrayList) this.LLJJJJLIIL).add(viewHolder);
            ViewPropertyAnimator viewPropertyAnimatorAnimate = viewHolder.itemView.animate();
            viewPropertyAnimatorAnimate.translationX(0.0f);
            viewPropertyAnimatorAnimate.alpha(1.0f);
            viewPropertyAnimatorAnimate.setDuration(300L);
            viewPropertyAnimatorAnimate.withStartAction(new ARunnableS129S0100000_29(this, viewHolder, 161));
            viewPropertyAnimatorAnimate.withEndAction(new ARunnableS62S0300000_29(viewPropertyAnimatorAnimate, this, viewHolder, 5));
            viewPropertyAnimatorAnimate.setListener(new AAListenerS142S0300000_29(viewPropertyAnimatorAnimate, viewHolder, this, 1));
        }
        ((ArrayList) this.LLJJJ).clear();
        for (RecyclerView.ViewHolder viewHolder2 : (ArrayList) this.LLJJJIL) {
            ((ArrayList) this.LLJJL).add(viewHolder2);
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = viewHolder2.itemView.animate();
            viewPropertyAnimatorAnimate2.alpha(1.0f);
            viewPropertyAnimatorAnimate2.setDuration(300L);
            viewPropertyAnimatorAnimate2.withStartAction(new ARunnableS129S0100000_29(this, viewHolder2, 162));
            viewPropertyAnimatorAnimate2.withEndAction(new ARunnableS62S0300000_29(viewPropertyAnimatorAnimate2, this, viewHolder2, 6));
            viewPropertyAnimatorAnimate2.setListener(new AAListenerS142S0300000_29(viewPropertyAnimatorAnimate2, viewHolder2, this, 2));
        }
        ((ArrayList) this.LLJJJIL).clear();
        for (RecyclerView.ViewHolder viewHolder3 : (ArrayList) this.LLJJJJJIL) {
            ((ArrayList) this.LLJL).add(viewHolder3);
            ViewPropertyAnimator viewPropertyAnimatorAnimate3 = viewHolder3.itemView.animate();
            viewPropertyAnimatorAnimate3.alpha(0.0f);
            viewPropertyAnimatorAnimate3.setDuration(300L);
            viewPropertyAnimatorAnimate3.withStartAction(new ARunnableS129S0100000_29(this, viewHolder3, 163));
            viewPropertyAnimatorAnimate3.withEndAction(new ARunnableS62S0300000_29(viewPropertyAnimatorAnimate3, this, viewHolder3, 7));
            viewPropertyAnimatorAnimate3.setListener(new AAListenerS142S0300000_29(viewPropertyAnimatorAnimate3, viewHolder3, this, 3));
        }
        ((ArrayList) this.LLJJJJJIL).clear();
        for (RecyclerView.ViewHolder viewHolder4 : (ArrayList) this.LLJJJJ) {
            ((ArrayList) this.LLJJLIIIJLLLLLLLZ).add(viewHolder4);
            ViewPropertyAnimator viewPropertyAnimatorAnimate4 = viewHolder4.itemView.animate();
            viewPropertyAnimatorAnimate4.alpha(0.0f);
            viewPropertyAnimatorAnimate4.translationX(C426750GoL.LIZLLL(viewHolder4.itemView.getContext()) ? viewHolder4.itemView.getWidth() / 2.0f : -(viewHolder4.itemView.getWidth() / 2.0f));
            viewPropertyAnimatorAnimate4.withStartAction(new ARunnableS129S0100000_29(this, viewHolder4, 164));
            viewPropertyAnimatorAnimate4.withEndAction(new ARunnableS62S0300000_29(viewPropertyAnimatorAnimate4, this, viewHolder4, 8));
            viewPropertyAnimatorAnimate4.setListener(new AAListenerS142S0300000_29(viewPropertyAnimatorAnimate4, viewHolder4, this, 4));
        }
        ((ArrayList) this.LLJJJJ).clear();
        super.LJIJI();
    }

    public C194405113z() {
        this.LLIZ = false;
        this.LLJJIJIL = true;
        this.LLJJJ = new ArrayList();
        this.LLJJJIL = new ArrayList();
        this.LLJJJJ = new ArrayList();
        this.LLJJJJJIL = new ArrayList();
        this.LLJJJJLIIL = new ArrayList();
        this.LLJJL = new ArrayList();
        this.LLJJLIIIJLLLLLLLZ = new ArrayList();
        this.LLJL = new ArrayList();
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final boolean LJIIZILJ() {
        return super.LJIIZILJ() || (this.LLJJJIL.isEmpty() ^ true) || (this.LLJJJ.isEmpty() ^ true) || (this.LLJJJJJIL.isEmpty() ^ true) || (this.LLJJJJ.isEmpty() ^ true) || (this.LLJJJJLIIL.isEmpty() ^ true) || (this.LLJJL.isEmpty() ^ true) || (this.LLJL.isEmpty() ^ true) || (this.LLJJLIIIJLLLLLLLZ.isEmpty() ^ true);
    }

    public static final void LJJIJIL(C194405113z c194405113z) {
        if (!c194405113z.LJIIZILJ()) {
            c194405113z.LJIIJ();
        }
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIIJJI(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.animate().cancel();
        if (((ArrayList) this.LLJJJIL).remove(viewHolder)) {
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            LJJIIJ(viewHolder);
        }
        if (((ArrayList) this.LLJJJ).remove(viewHolder)) {
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            C786410Ut5.Jc(viewHolder.itemView, 0.0f);
            LJJIIJ(viewHolder);
        }
        if (((ArrayList) this.LLJJJJJIL).remove(viewHolder)) {
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            LJIIIZ(viewHolder);
        }
        if (((ArrayList) this.LLJJJJ).remove(viewHolder)) {
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            C786410Ut5.Jc(viewHolder.itemView, 0.0f);
            LJIIIZ(viewHolder);
        }
        super.LJIIJJI(viewHolder);
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        float width;
        if (viewHolder == null) {
            LJJIIJ(viewHolder);
            if (!LJIIZILJ()) {
                LJIIJ();
                return false;
            }
            return false;
        }
        if (this.LLJJIJIL) {
            LJJIIJ(viewHolder);
            return true;
        }
        if (viewHolder.getLayoutPosition() == 0) {
            ((ArrayList) this.LLJJJIL).add(viewHolder);
            C786410Ut5.T4(viewHolder.itemView, 0.0f);
            return true;
        }
        ((ArrayList) this.LLJJJ).add(viewHolder);
        C786410Ut5.T4(viewHolder.itemView, 0.0f);
        View view = viewHolder.itemView;
        if (C426750GoL.LIZLLL(view.getContext())) {
            width = viewHolder.itemView.getWidth() / 2.0f;
        } else {
            width = -(viewHolder.itemView.getWidth() / 2.0f);
        }
        C786410Ut5.Jc(view, width);
        return true;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            LJIIIZ(viewHolder);
            if (!LJIIZILJ()) {
                LJIIJ();
                return false;
            }
            return false;
        }
        if (this.LLJJIJIL) {
            LJIIIZ(viewHolder);
            return true;
        }
        LJIIJJI(viewHolder);
        ((ArrayList) this.LLJJJJ).add(viewHolder);
        return true;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        if (this.LLJJIJIL) {
            LJIIIZ(viewHolder);
            return true;
        }
        return super.LJJII(viewHolder, i, i2, i3, i4);
    }
}
