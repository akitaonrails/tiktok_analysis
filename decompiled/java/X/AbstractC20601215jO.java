package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.15jO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20601215jO<ITEM> extends AbstractC21673619ry<AbstractC1579890rDP<ITEM>> {
    public final ArrayList<ITEM> LL = new ArrayList<>();

    public abstract boolean LLLFZ(ITEM item, ITEM item2);

    public abstract boolean LLLI(ITEM item, ITEM item2);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public final void setData(final List<? extends ITEM> list) {
        final List listLLIIII = C13LP.LLIIII(this.LL);
        this.LL.clear();
        this.LL.addAll(list);
        C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.15jP
            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return list.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return listLLIIII.size();
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                return this.LLLFZ((ITEM) C13LP.LJJJLZIJ(i, listLLIIII), (ITEM) C13LP.LJJJLZIJ(i2, list));
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                return this.LLLI((ITEM) C13LP.LJJJLZIJ(i, listLLIIII), (ITEM) C13LP.LJJJLZIJ(i2, list));
            }
        }, false).LIZJ(this);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC1579890rDP) viewHolder).I5(i, C13LP.LJJJLZIJ(i, this.LL));
    }
}
