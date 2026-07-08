package X;

import X.AbstractC960440b6I;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0b6H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC960430b6H<D, VH extends AbstractC960440b6I<D>> extends C0J8P<D, VH> {
    @Override // X.C0J8P
    public final void LJI(RecyclerView.ViewHolder viewHolder) {
        ((AbstractC960440b6I) viewHolder).onViewDetachedFromWindow();
    }

    @Override // X.C0J8P
    public final void LJII(RecyclerView.ViewHolder viewHolder) {
        ((AbstractC960440b6I) viewHolder).LLIILZL();
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        AbstractC960440b6I abstractC960440b6I = (AbstractC960440b6I) viewHolder;
        abstractC960440b6I.I5(abstractC960440b6I.getAdapterPosition(), obj);
    }
}
