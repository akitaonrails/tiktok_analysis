package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.10x9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19412510x9 extends AbstractC19412410x8 {
    public TextView LLILLL;
    public RecyclerView LLILZIL;
    public C19412610xA LLILZLL;
    public C194324110w LLIZ;
    public int LLILLJJLI = -1;
    public long LLILZ = -1;

    @Override // X.AbstractC19412410x8, X.AbstractC21673619ry
    public final int getItemCount() {
        if (getBasicItemCount() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    @Override // X.AbstractC21673619ry
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILZIL = recyclerView;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.LJIJI(new C19773112Xx(this, gridLayoutManager, 0));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        super.onViewAttachedToWindow(viewHolder);
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof C21681819tI)) {
            C21681819tI c21681819tI = (C21681819tI) layoutParams;
            if (getItemViewType(viewHolder.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            c21681819tI.LLILLJJLI = z;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (this.LLILZ != -1 && !TextUtils.isEmpty(null)) {
            C0CHQ.LIZ().LIZJ().LIZIZ(System.currentTimeMillis() - this.LLILZ, "aweme_feed_load_more_duration", null);
            this.LLILZ = -1L;
        }
    }
}
