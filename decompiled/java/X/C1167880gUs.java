package X;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: X.0gUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167880gUs extends AbstractC21688119uJ {
    public final ViewOnAttachStateChangeListenerC20604515jv LIZJ;
    public final InterfaceC1167890gUt LIZLLL;
    public boolean LJ;

    @Override // X.AbstractC21688119uJ
    public final boolean LJII() {
        return false;
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIILL() {
    }

    @Override // X.AbstractC21688119uJ
    public final boolean LJIIIIZZ() {
        return this.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21688119uJ
    public final void LIZJ(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.LIZJ(recyclerView, viewHolder);
        C786410Ut5.T4(viewHolder.itemView, 1.0f);
        if (viewHolder instanceof InterfaceC1167900gUu) {
            ((InterfaceC1167900gUu) viewHolder).LJIIJ();
        }
    }

    @Override // X.AbstractC21688119uJ
    public final int LJFF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            return AbstractC21688119uJ.LJIIIZ(15, 0);
        }
        return AbstractC21688119uJ.LJIIIZ(3, 48);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21688119uJ
    public final void LJIILJJIL(RecyclerView.ViewHolder viewHolder, int i) {
        if (i != 0 && (viewHolder instanceof InterfaceC1167900gUu)) {
            ((InterfaceC1167900gUu) viewHolder).LJIIZILJ();
        }
    }

    public C1167880gUs(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, InterfaceC1167890gUt interfaceC1167890gUt, boolean z) {
        this.LIZJ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZLLL = interfaceC1167890gUt;
        this.LJ = z;
    }

    @Override // X.AbstractC21688119uJ
    public final boolean LJIIL(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
            return false;
        }
        int headerCount = this.LIZJ.getHeaderCount();
        int adapterPosition = viewHolder.getAdapterPosition() - headerCount;
        int adapterPosition2 = viewHolder2.getAdapterPosition() - headerCount;
        this.LIZLLL.FP0(adapterPosition, adapterPosition2);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZJ.getState().LJII());
        Integer num = ((C1166800gT8) ListProtector.get(arrayList, adapterPosition)).LLIZ;
        Integer num2 = ((C1166800gT8) ListProtector.get(arrayList, adapterPosition2)).LLIZ;
        Collections.swap(arrayList, adapterPosition, adapterPosition2);
        C20600815jK.LJIIJ(this.LIZJ.getState(), arrayList);
        AbstractC21673619ry adapter = this.LIZJ.getAdapter();
        if (adapter != null) {
            adapter.notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
        }
        AbstractC21673619ry adapter2 = this.LIZJ.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyItemChanged(viewHolder.getAdapterPosition(), num2);
        }
        AbstractC21673619ry adapter3 = this.LIZJ.getAdapter();
        if (adapter3 != null) {
            adapter3.notifyItemChanged(viewHolder2.getAdapterPosition(), num);
        }
        C1169160gWw c1169160gWw = C1169160gWw.LIZ;
        String strJv1 = this.LIZLLL.jv1();
        String strTs0 = this.LIZLLL.ts0();
        c1169160gWw.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", strJv1);
        c2344009Gk.LJIIIIZZ("enter_method", strTs0);
        C20684815ws.LJIILLIIL("reorder_playlist", c2344009Gk.LIZ);
        return true;
    }

    @Override // X.AbstractC21688119uJ
    public final void LJIIJ(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        if (i == 1) {
            C786410Ut5.T4(viewHolder.itemView, 1.0f - (Math.abs(f) / viewHolder.itemView.getWidth()));
            C786410Ut5.Jc(viewHolder.itemView, f);
            return;
        }
        super.LJIIJ(canvas, recyclerView, viewHolder, f, f2, i, z);
    }
}
