package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0hZQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1209140hZQ {
    public final List<Aweme> LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final List<Aweme> LIZLLL;
    public boolean LJ = true;
    public boolean LJFF;
    public boolean LJI;
    public final /* synthetic */ DetailFragmentPanel LJII;

    public final boolean LIZ() {
        boolean z = this.LJFF;
        if (z || !this.LJ) {
            return this.LJII.l0(this.LIZ, z);
        }
        if (this.LJII.LLJJIJI.getCurrentItem() != 0) {
            return false;
        }
        this.LJFF = true;
        ((ArrayList) this.LIZLLL).clear();
        ((ArrayList) this.LIZLLL).addAll(this.LJII.LLJL.LJJJLZIJ());
        ((ArrayList) this.LIZLLL).addAll(0, this.LIZ.subList(0, this.LIZJ));
        LIZJ(this.LIZLLL);
        return true;
    }

    public final boolean LIZIZ() {
        boolean z = this.LJI;
        if (z || !this.LJ) {
            return this.LJII.l0(this.LIZ, z);
        }
        if (this.LJII.LLJJIJI.getCurrentItem() != this.LJII.LLJL.getCount() - 1) {
            return false;
        }
        this.LJI = true;
        ((ArrayList) this.LIZLLL).clear();
        ((ArrayList) this.LIZLLL).addAll(this.LJII.LLJL.LJJJLZIJ());
        List<Aweme> list = this.LIZLLL;
        List<Aweme> list2 = this.LIZ;
        ((ArrayList) list).addAll(list2.subList(this.LIZJ + 1, list2.size()));
        LIZJ(this.LIZLLL);
        return true;
    }

    public final void LIZJ(List<Aweme> list) {
        boolean z = true;
        this.LJII.p0 = true;
        this.LJII.Pj(list, this.LIZIZ);
        this.LJII.p0 = false;
        if (this.LJFF && this.LJI) {
            z = false;
        }
        this.LJ = z;
    }

    public C1209140hZQ(DetailFragmentPanel detailFragmentPanel, List<Aweme> list, boolean z, int i) {
        this.LJII = detailFragmentPanel;
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = i;
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        this.LIZLLL = arrayList2;
        arrayList2.add(ListProtector.get(list, i));
        if (i == 0) {
            this.LJFF = true;
        }
        if (i == arrayList.size() - 1) {
            this.LJI = true;
        }
    }
}
