package X;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0l3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1343310l3p extends C1351540lH6 {
    public final long LLJJJJJIL;
    public int LLJJJJLIIL;
    public long LLJJL;

    public C1343310l3p() {
        this(0);
    }

    public final boolean LJJIZ() {
        if (this.LLJJJJLIIL <= 0) {
            return false;
        }
        if (SystemClock.uptimeMillis() <= this.LLJJL) {
            return true;
        }
        this.LLJJJJLIIL = 0;
        return false;
    }

    @Override // X.C1351540lH6, X.C423520Gj8, X.AbstractC21673719rz
    public final void LJIJI() {
        super.LJIJI();
        int i = this.LLJJJJLIIL;
        if (i > 0) {
            this.LLJJJJLIIL = i - 1;
        }
    }

    public C1343310l3p(int i) {
        this.LLJJJJJIL = 500L;
    }

    @Override // X.C1351540lH6, X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJI(RecyclerView.ViewHolder viewHolder) {
        if (!LJJIZ()) {
            LJJIIJ(viewHolder);
            return false;
        }
        super.LJJI(viewHolder);
        return true;
    }

    @Override // X.C1351540lH6, X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJIII(RecyclerView.ViewHolder viewHolder) {
        if (!LJJIZ()) {
            LJIIIZ(viewHolder);
            return false;
        }
        super.LJJIII(viewHolder);
        return true;
    }

    @Override // X.C1351540lH6, X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJII(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        if (!LJJIZ()) {
            LJIIIZ(viewHolder);
            return false;
        }
        return super.LJJII(viewHolder, i, i2, i3, i4);
    }

    @Override // X.C423520Gj8, X.AbstractC21674919sB
    public final boolean LJJIFFI(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (!LJJIZ()) {
            LJIIIZ(viewHolder);
            if (viewHolder2 != viewHolder) {
                LJIIIZ(viewHolder2);
                return false;
            }
            return false;
        }
        return super.LJJIFFI(viewHolder, viewHolder2, i, i2, i3, i4);
    }
}
