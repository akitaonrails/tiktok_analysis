package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0Qra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC683560Qra<DATA> extends AbstractC683590Qrd<DATA> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public View LL;

    public void LLLFZ(RecyclerView.ViewHolder viewHolder, int i) {
    }

    public RecyclerView.ViewHolder LLLI(ViewGroup viewGroup) {
        return null;
    }

    @Override // X.AbstractC683590Qrd, X.AbstractC438050HFr
    public int getBasicItemCount() {
        return super.getBasicItemCount() + (this.LL == null ? 0 : 1);
    }

    public AbstractC683560Qra() {
        this.spanSizeLookup = new AbstractC214823195h() { // from class: X.0Qrb
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                if (i == 0 && this.LJ.getBasicItemViewType(i) == 10000) {
                    return 2;
                }
                return 1;
            }
        };
        setLoadEmptyText(2131830409);
    }

    @Override // X.AbstractC438050HFr
    public int getBasicItemViewType(int i) {
        if (this.LL == null) {
            return 0;
        }
        if (i == 0) {
            return 10000;
        }
        if (!this.mShowFooter || i != getItemCount() - 1) {
            return 0;
        }
        return 20000;
    }

    @Override // X.AbstractC438050HFr
    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == 0) {
            if (this.LL != null && i != 0) {
                i--;
            }
            LLLFZ(viewHolder, i);
            return;
        }
        if (getItemViewType(i) != 20000 || !(viewHolder instanceof C683490QrT)) {
            return;
        }
        ((C683490QrT) viewHolder).I5();
    }

    @Override // X.AbstractC438050HFr
    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (this.LL != null && i == 10000) {
            final View view = this.LL;
            return new RecyclerView.ViewHolder(view) { // from class: X.0Qrc
            };
        }
        return LLLI(viewGroup);
    }
}
