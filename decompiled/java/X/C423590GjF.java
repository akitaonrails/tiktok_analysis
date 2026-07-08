package X;

import Y.ALAdapterS3S0200000_6;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0GjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423590GjF extends C423520Gj8 {
    public final CopyOnWriteArrayList<RecyclerView.ViewHolder> LLJJIJIL;
    public final CopyOnWriteArrayList<RecyclerView.ViewHolder> LLJJJ;
    public final CopyOnWriteArrayList<RecyclerView.ViewHolder> LLJJJIL;
    public final CopyOnWriteArrayList<RecyclerView.ViewHolder> LLJJJJ;

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIIL() {
        int size = this.LLJJJIL.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                RecyclerView.ViewHolder viewHolder = this.LLJJJIL.get(size);
                LJJIJL(viewHolder.itemView);
                LJIIIZ(viewHolder);
                this.LLJJJIL.remove(size);
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        int size2 = this.LLJJIJIL.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                RecyclerView.ViewHolder viewHolder2 = this.LLJJIJIL.get(size2);
                LJJIJL(viewHolder2.itemView);
                LJIIIZ(viewHolder2);
                this.LLJJIJIL.remove(size2);
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        Iterator<RecyclerView.ViewHolder> it2 = this.LLJJJ.iterator();
        while (it2.hasNext()) {
            it2.next().itemView.animate().cancel();
        }
        super.LJIIL();
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final boolean LJIIZILJ() {
        return (this.LLJJIJIL.isEmpty() ^ true) || (this.LLJJJIL.isEmpty() ^ true) || (this.LLJJJ.isEmpty() ^ true) || super.LJIIZILJ();
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIJI() {
        if (!this.LLJJIJIL.isEmpty()) {
            for (RecyclerView.ViewHolder viewHolder : this.LLJJIJIL) {
                LJJIJL(viewHolder.itemView);
                LJIIIZ(viewHolder);
                if (!LJIIZILJ()) {
                    LJIIJ();
                }
            }
            this.LLJJIJIL.clear();
        }
        if (!this.LLJJJIL.isEmpty()) {
            ArrayList<RecyclerView.ViewHolder> arrayList = new ArrayList(this.LLJJJIL);
            this.LLJJJJ.addAll(arrayList);
            this.LLJJJIL.clear();
            for (RecyclerView.ViewHolder viewHolder2 : arrayList) {
                this.LLJJJ.add(viewHolder2);
                viewHolder2.itemView.animate().translationX(0.0f).translationY(0.0f).setDuration(this.LLILZIL).setInterpolator(C1619980sG4.LIZLLL()).setListener(new ALAdapterS3S0200000_6(viewHolder2, this, 22)).start();
            }
            arrayList.clear();
            this.LLJJJJ.removeAll(arrayList);
        }
        super.LJIJI();
    }

    public C423590GjF() {
        this.LLILZ = 0L;
        this.LLILZIL = 300L;
        this.LLJJIJIL = new CopyOnWriteArrayList<>();
        this.LLJJJ = new CopyOnWriteArrayList<>();
        this.LLJJJIL = new CopyOnWriteArrayList<>();
        this.LLJJJJ = new CopyOnWriteArrayList<>();
    }

    public static final void LJJIJIL(C423590GjF c423590GjF) {
        if (!c423590GjF.LJIIZILJ()) {
            c423590GjF.LJIIJ();
        }
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
        viewHolder.itemView.animate().cancel();
        if (this.LLJJJIL.remove(viewHolder)) {
            LJJIJL(viewHolder.itemView);
            LJIIIZ(viewHolder);
        }
        if (this.LLJJIJIL.remove(viewHolder)) {
            LJJIJL(viewHolder.itemView);
            LJIIIZ(viewHolder);
        }
        super.LJIIJJI(viewHolder);
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        this.LLJJIJIL.add(viewHolder);
        return true;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        LJIIJJI(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                LJIIIZ(viewHolder);
                return false;
            }
        } else {
            C786410Ut5.Jc(view, -i5);
            if (i6 != 0) {
            }
            this.LLJJJIL.add(viewHolder);
            return true;
        }
        C786410Ut5.ed(view, -i6);
        this.LLJJJIL.add(viewHolder);
        return true;
    }
}
