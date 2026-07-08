package X;

import java.util.List;

/* JADX INFO: renamed from: X.10xD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19412910xD<T> extends AbstractC19412510x9 {
    public List<T> LLIZLLLIL;
    public int LLJ;

    @Override // X.AbstractC19412410x8
    public final int getBasicItemCount() {
        List<T> list = this.LLIZLLLIL;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public AbstractC19412910xD() {
        registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.10xE
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                AbstractC19412910xD abstractC19412910xD = this.LIZ;
                abstractC19412910xD.LLJ = abstractC19412910xD.getItemCount();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i, int i2) {
                AbstractC19412910xD abstractC19412910xD = this.LIZ;
                abstractC19412910xD.LLJ = abstractC19412910xD.getItemCount();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                AbstractC19412910xD abstractC19412910xD = this.LIZ;
                abstractC19412910xD.LLJ = abstractC19412910xD.getItemCount();
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                AbstractC19412910xD abstractC19412910xD = this.LIZ;
                abstractC19412910xD.LLJ = abstractC19412910xD.getItemCount();
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                AbstractC19412910xD abstractC19412910xD = this.LIZ;
                abstractC19412910xD.LLJ = abstractC19412910xD.getItemCount();
            }
        });
    }

    public final void onShowFooterChanged(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.LLJ = getItemCount();
    }

    public final void setDataAfterLoadMore(List<T> list) {
        this.LLIZLLLIL = list;
        if (this.LL) {
            notifyItemRangeInserted(this.LLJ - 1, getItemCount() - this.LLJ);
            notifyItemChanged(getItemCount() - 1);
        } else {
            notifyItemRangeInserted(this.LLJ, getItemCount() - this.LLJ);
        }
    }
}
