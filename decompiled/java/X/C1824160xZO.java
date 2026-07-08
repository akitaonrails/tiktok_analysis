package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xZO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824160xZO extends RecyclerView.ViewHolder {
    public final AbstractC1824180xZQ LL;

    public C1824160xZO(AbstractC1824180xZQ abstractC1824180xZQ) {
        super(abstractC1824180xZQ.LLILZ);
        this.LL = abstractC1824180xZQ;
    }

    public final void I5(C1783010wV1 c1783010wV1) {
        Integer numLIZJ;
        Integer numLIZJ2;
        if (this.itemView.isSelected()) {
            if (c1783010wV1.LIZJ != null) {
                Context context = this.itemView.getContext();
                if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ezs, context)) != null) {
                    this.LL.LLJJJJ.setTextColor(numLIZJ2.intValue());
                }
                this.LL.LLJJJJ.setText(c1783010wV1.LIZJ);
                C786410Ut5.LLLLZLL(this.LL.LLJJJJ, 0);
                return;
            }
            C786410Ut5.LLLLZLL(this.LL.LLJJJJ, 8);
            return;
        }
        if (c1783010wV1.LIZLLL != null) {
            Context context2 = this.itemView.getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ezx, context2)) != null) {
                this.LL.LLJJJJ.setTextColor(numLIZJ.intValue());
            }
            this.LL.LLJJJJ.setText(c1783010wV1.LIZLLL);
            C786410Ut5.LLLLZLL(this.LL.LLJJJJ, 0);
            return;
        }
        C786410Ut5.LLLLZLL(this.LL.LLJJJJ, 8);
    }
}
