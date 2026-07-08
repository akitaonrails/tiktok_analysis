package X;

import Y.ALAdapterS3S0200000_6;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMarkDownContentCell;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseCell;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0GjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423630GjJ extends C423520Gj8 {
    public final List<RecyclerView.ViewHolder> LLJJIJIL = new ArrayList();
    public final List<RecyclerView.ViewHolder> LLJJJ = new ArrayList();
    public RecyclerView.ViewHolder LLJJJIL;

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIIL() {
        View view;
        int size = this.LLJJIJIL.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                LJJIIJ((RecyclerView.ViewHolder) ListProtector.get(this.LLJJIJIL, size));
                ListProtector.remove(this.LLJJIJIL, size);
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
                LJJIIJ((RecyclerView.ViewHolder) ListProtector.get(this.LLJJJ, size2));
                ListProtector.remove(this.LLJJJ, size2);
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        RecyclerView.ViewHolder viewHolder = this.LLJJJIL;
        if (viewHolder != null && (view = viewHolder.itemView) != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        this.LLJJJIL = null;
        super.LJIIL();
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final boolean LJIIZILJ() {
        return (this.LLJJIJIL.isEmpty() ^ true) || (this.LLJJJ.isEmpty() ^ true) || super.LJIIZILJ();
    }

    public C423630GjJ() {
        this.LLIZ = false;
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIJI() {
        int size;
        int size2;
        super.LJIJI();
        if ((!((ArrayList) this.LLJJIJIL).isEmpty()) && ((ArrayList) this.LLJJIJIL).size() - 1 >= 0) {
            while (true) {
                int i = size2 - 1;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LLJJIJIL, size2);
                viewHolder.itemView.animate().alpha(1.0f).setDuration(200L).setStartDelay(150L).setInterpolator(C1619980sG4.LJI()).setListener(new ALAdapterS3S0200000_6(this, viewHolder, 1)).start();
                if (i < 0) {
                    break;
                } else {
                    size2 = i;
                }
            }
        }
        if (!(!((ArrayList) this.LLJJJ).isEmpty()) || ((ArrayList) this.LLJJJ).size() - 1 < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) ListProtector.get(this.LLJJJ, size);
            viewHolder2.itemView.animate().alpha(0.0f).setDuration(200L).setInterpolator(C1619980sG4.LJI()).setListener(new ALAdapterS3S0200000_6(this, viewHolder2, 2)).start();
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIIJJI(RecyclerView.ViewHolder viewHolder) {
        if (!(viewHolder instanceof SearchMultiSummaryBaseCell) && !(viewHolder instanceof SearchMarkDownContentCell)) {
            super.LJIIJJI(viewHolder);
            return;
        }
        viewHolder.itemView.animate().cancel();
        if (((ArrayList) this.LLJJIJIL).remove(viewHolder)) {
            LJJIIJ(viewHolder);
        }
        if (!((ArrayList) this.LLJJJ).remove(viewHolder)) {
            return;
        }
        LJIIIZ(viewHolder);
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder != null && ((viewHolder instanceof SearchMultiSummaryBaseCell) || (viewHolder instanceof SearchMarkDownContentCell))) {
            C786410Ut5.T4(viewHolder.itemView, 0.0f);
            ((ArrayList) this.LLJJIJIL).add(viewHolder);
            return true;
        }
        super.LJJI(viewHolder);
        return true;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder != null && ((viewHolder instanceof SearchMultiSummaryBaseCell) || (viewHolder instanceof SearchMarkDownContentCell))) {
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            ((ArrayList) this.LLJJJ).add(viewHolder);
            return true;
        }
        super.LJJIII(viewHolder);
        return true;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        if (viewHolder != null) {
            LJIIIZ(viewHolder);
            return false;
        }
        return false;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJIFFI(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            if (viewHolder != null) {
                LJIIIZ(viewHolder);
                return false;
            }
            return false;
        }
        if (viewHolder != null) {
            LJIIIZ(viewHolder);
        }
        if (viewHolder2 == null) {
            return false;
        }
        LJIIIZ(viewHolder2);
        return false;
    }
}
