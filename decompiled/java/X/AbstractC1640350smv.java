package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0smv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1640350smv extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public int LLLFZ(int i, GridLayoutManager gridLayoutManager) {
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LJIJI(new C1698040uHy(this, layoutManager, 0));
        }
    }

    @Override // X.AbstractC21673619ry
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        super.onViewAttachedToWindow(viewHolder);
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof C21681819tI)) {
            C21681819tI c21681819tI = (C21681819tI) layoutParams;
            if (getItemViewType(viewHolder.getLayoutPosition()) == -2147483646) {
                z = true;
            } else {
                z = false;
            }
            c21681819tI.LLILLJJLI = z;
        }
    }
}
