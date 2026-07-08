package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0lH6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1351540lH6 extends C423520Gj8 {
    public final CopyOnWriteArrayList<RecyclerView.ViewHolder> LLJJIJIL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<RecyclerView.ViewHolder> LLJJJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<RecyclerView.ViewHolder> LLJJJIL = new CopyOnWriteArrayList<>();
    public final HashMap<RecyclerView.ViewHolder, C21647019ng> LLJJJJ = new HashMap<>();

    public boolean LJJIL() {
        return false;
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public void LJIIL() {
        int size = this.LLJJIJIL.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                RecyclerView.ViewHolder viewHolder = this.LLJJIJIL.get(size);
                LJJIJL(viewHolder.itemView);
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
                LJJIJL(viewHolder2.itemView);
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
                LJJIJL(viewHolder3.itemView);
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
    public boolean LJIIZILJ() {
        return (this.LLJJIJIL.isEmpty() ^ true) || (this.LLJJJ.isEmpty() ^ true) || (this.LLJJJIL.isEmpty() ^ true) || super.LJIIZILJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // X.C423520Gj8, X.AbstractC21673719rz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJI() {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1351540lH6.LJIJI():void");
    }

    public static final void LJJIJIL(C1351540lH6 c1351540lH6) {
        if (!c1351540lH6.LJIIZILJ()) {
            c1351540lH6.LJIIJ();
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
    public void LJIIJJI(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.animate().cancel();
        if (this.LLJJIJIL.remove(viewHolder)) {
            LJJIJL(viewHolder.itemView);
            LJIIIZ(viewHolder);
        }
        if (this.LLJJJ.remove(viewHolder)) {
            LJJIJL(viewHolder.itemView);
            LJIIIZ(viewHolder);
        }
        if (this.LLJJJIL.remove(viewHolder)) {
            LJJIJL(viewHolder.itemView);
            LJJIIJ(viewHolder);
        }
        super.LJIIJJI(viewHolder);
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        C786410Ut5.T4(viewHolder.itemView, 0.0f);
        this.LLJJJIL.add(viewHolder);
        return true;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        this.LLJJIJIL.add(viewHolder);
        return true;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
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
