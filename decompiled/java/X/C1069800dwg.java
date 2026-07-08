package X;

import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0dwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069800dwg extends AbstractC1906720ziY {
    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(PollCell.class);
    }

    public final void LJJ(C13BV c13bv) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13bv, 10));
        Iterator it2 = c13bv.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        this.LLILZLL.LJIILL(arrayList, null);
    }
}
