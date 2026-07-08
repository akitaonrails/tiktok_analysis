package X;

import Y.ALAdapterS0S0400000_6;
import Y.ALAdapterS3S0200000_6;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0GjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423580GjE extends C423520Gj8 {
    public final CopyOnWriteArrayList<RecyclerView.ViewHolder> LLJJIJIL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<RecyclerView.ViewHolder> LLJJJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<RecyclerView.ViewHolder> LLJJJIL = new CopyOnWriteArrayList<>();

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIJI() {
        if (!this.LLJJJ.isEmpty()) {
            ArrayList<RecyclerView.ViewHolder> arrayList = new ArrayList(this.LLJJJ);
            this.LLJJJ.clear();
            for (RecyclerView.ViewHolder viewHolder : arrayList) {
                viewHolder.itemView.animate().translationX(0.0f).translationY(0.0f).setDuration(this.LLILZIL).setInterpolator(C1619980sG4.LIZLLL()).setListener(new ALAdapterS3S0200000_6(viewHolder, this, 31)).start();
            }
            arrayList.clear();
        }
        if (!this.LLJJJIL.isEmpty()) {
            ArrayList<RecyclerView.ViewHolder> arrayList2 = new ArrayList(this.LLJJJIL);
            this.LLJJJIL.clear();
            for (RecyclerView.ViewHolder viewHolder2 : arrayList2) {
                View view = viewHolder2.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(this.LLILLL).setListener(new ALAdapterS0S0400000_6(this, viewHolder2, view, viewPropertyAnimatorAnimate, 5)).start();
            }
            arrayList2.clear();
        }
        super.LJIJI();
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIIL() {
        int size = this.LLJJIJIL.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                RecyclerView.ViewHolder viewHolder = this.LLJJIJIL.get(size);
                LJJIJIL(viewHolder.itemView);
                LJIIIZ(viewHolder);
                this.LLJJIJIL.remove(size);
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        int size2 = this.LLJJJ.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                RecyclerView.ViewHolder viewHolder2 = this.LLJJJ.get(size2);
                LJJIJIL(viewHolder2.itemView);
                LJIIIZ(viewHolder2);
                this.LLJJJ.remove(size2);
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = this.LLJJJIL.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                RecyclerView.ViewHolder viewHolder3 = this.LLJJJIL.get(size3);
                LJJIJIL(viewHolder3.itemView);
                LJJIIJ(viewHolder3);
                this.LLJJJIL.remove(size3);
                if (i3 < 0) {
                    break;
                } else {
                    size3 = i3;
                }
            }
        }
        super.LJIIL();
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final boolean LJIIZILJ() {
        return (this.LLJJIJIL.isEmpty() ^ true) || (this.LLJJJ.isEmpty() ^ true) || (this.LLJJJIL.isEmpty() ^ true) || super.LJIIZILJ();
    }

    public static final void LJJIJIL(View view) {
        C786410Ut5.T4(view, 1.0f);
        C786410Ut5.Jc(view, 0.0f);
        C786410Ut5.ed(view, 0.0f);
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIIJJI(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.animate().cancel();
        if (this.LLJJIJIL.remove(viewHolder)) {
            LJJIJIL(viewHolder.itemView);
            LJIIIZ(viewHolder);
        }
        if (this.LLJJJ.remove(viewHolder)) {
            LJJIJIL(viewHolder.itemView);
            LJIIIZ(viewHolder);
        }
        if (this.LLJJJIL.remove(viewHolder)) {
            LJJIJIL(viewHolder.itemView);
            LJJIIJ(viewHolder);
        }
        super.LJIIJJI(viewHolder);
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        C786410Ut5.T4(viewHolder.itemView, 0.0f);
        this.LLJJJIL.add(viewHolder);
        return true;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        this.LLJJIJIL.add(viewHolder);
        return true;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i3 - (i + ((int) view.getTranslationX()));
        int translationY = i4 - (i2 + ((int) viewHolder.itemView.getTranslationY()));
        if (translationX == 0) {
            if (translationY == 0) {
                LJIIIZ(viewHolder);
                return false;
            }
        } else {
            C786410Ut5.Jc(view, -translationX);
            if (translationY != 0) {
            }
            this.LLJJJ.add(viewHolder);
            return true;
        }
        C786410Ut5.ed(view, -translationY);
        this.LLJJJ.add(viewHolder);
        return true;
    }
}
