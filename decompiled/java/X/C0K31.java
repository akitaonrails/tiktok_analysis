package X;

import Y.AsS34S0100000_7;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0K31, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K31 {
    public boolean LIZIZ;
    public AbstractC511100K2q LIZJ;
    public C0K3N LIZLLL;
    public final C0K2S LIZ = new AbstractC511160K2w() { // from class: X.0K2S
        @Override // X.AbstractC511160K2w
        public final C0K2L LIZJ() {
            return C0K2L.LOAD_MORE;
        }
    };
    public final AsS34S0100000_7 LJ = new AsS34S0100000_7(this, 14);

    public final void LIZIZ() {
        ArrayList<AbstractC511160K2w> arrayList;
        int iIndexOf;
        AbstractC511100K2q abstractC511100K2q = this.LIZJ;
        if (abstractC511100K2q == null || (arrayList = abstractC511100K2q.LL) == null || (iIndexOf = arrayList.indexOf(this.LIZ)) <= 0) {
            return;
        }
        ListProtector.remove(arrayList, iIndexOf);
        AbstractC511100K2q abstractC511100K2q2 = this.LIZJ;
        if (abstractC511100K2q2 != null) {
            abstractC511100K2q2.notifyItemRemoved(iIndexOf);
        }
    }

    public final void LIZ(RecyclerView recyclerView) {
        AbstractC511100K2q abstractC511100K2q;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter instanceof AbstractC511100K2q) {
            abstractC511100K2q = (AbstractC511100K2q) adapter;
        } else {
            abstractC511100K2q = null;
        }
        this.LIZJ = abstractC511100K2q;
        recyclerView.addOnScrollListener(this.LJ);
    }
}
