package X;

import X.AbstractC960470b6L;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0b6K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC960460b6K<D, VH extends AbstractC960470b6L<D>> extends C0J8P<D, VH> {
    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public void LJII(VH vh) {
        vh.LLIILZL();
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        AbstractC960470b6L abstractC960470b6L = (AbstractC960470b6L) viewHolder;
        abstractC960470b6L.I5(abstractC960470b6L.getAdapterPosition(), obj);
    }
}
