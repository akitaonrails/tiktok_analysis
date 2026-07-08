package X;

import Y.ALAdapterS3S0200000_6;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0GjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423610GjH extends C423520Gj8 {
    public final List<RecyclerView.ViewHolder> LLJJIJIL = new ArrayList();
    public final List<RecyclerView.ViewHolder> LLJJJ = new ArrayList();

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIIL() {
        int size = this.LLJJIJIL.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LLJJIJIL, size);
                LJJIJIL(viewHolder.itemView);
                LJJIIJ(viewHolder);
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
                RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) ListProtector.get(this.LLJJJ, size2);
                LJJIJIL(viewHolder2.itemView);
                LJJIIJ(viewHolder2);
                ListProtector.remove(this.LLJJJ, size2);
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        super.LJIIL();
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final boolean LJIIZILJ() {
        return (((ArrayList) this.LLJJIJIL).isEmpty() && ((ArrayList) this.LLJJJ).isEmpty() && !super.LJIIZILJ()) ? false : true;
    }

    public C423610GjH() {
        this.LLILLL = 300L;
        this.LLILZ = 300L;
        this.LLILZIL = 300L;
    }

    @Override // X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIJI() {
        int size;
        int size2;
        super.LJIJI();
        if (!((ArrayList) this.LLJJIJIL).isEmpty() && this.LLJJIJIL.size() - 1 >= 0) {
            while (true) {
                int i = size2 - 1;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LLJJIJIL, size2);
                viewHolder.itemView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(this.LLILLL).setListener(new ALAdapterS3S0200000_6(viewHolder, this, 15)).setInterpolator(new C12DN());
                ListProtector.remove(this.LLJJIJIL, size2);
                if (i < 0) {
                    break;
                } else {
                    size2 = i;
                }
            }
        }
        if (((ArrayList) this.LLJJJ).isEmpty() || this.LLJJJ.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) ListProtector.get(this.LLJJJ, size);
            viewHolder2.itemView.animate().alpha(0.0f).translationX(-viewHolder2.itemView.getWidth()).setDuration(this.LLILZ).setListener(new ALAdapterS3S0200000_6(viewHolder2, this, 16)).setInterpolator(new C12DN());
            ListProtector.remove(this.LLJJJ, size);
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
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
        if (((ArrayList) this.LLJJIJIL).remove(viewHolder)) {
            LJJIIJ(viewHolder);
            LJJIJIL(viewHolder.itemView);
        }
        if (((ArrayList) this.LLJJJ).remove(viewHolder)) {
            LJIIIZ(viewHolder);
            LJJIJIL(viewHolder.itemView);
        }
        super.LJIIJJI(viewHolder);
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        super.LJJI(viewHolder);
        return true;
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C11EV) {
            C786410Ut5.T4(viewHolder.itemView, 1.0f);
            C786410Ut5.Jc(viewHolder.itemView, 0.0f);
            ((ArrayList) this.LLJJJ).add(viewHolder);
            return true;
        }
        super.LJJIII(viewHolder);
        return true;
    }
}
