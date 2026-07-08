package X;

import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0Isf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C480390Isf {
    public C521620Kcy LIZ;
    public C480410Ish LIZIZ;
    public LifecycleEventObserver LIZJ;
    public C20632315oP LIZLLL;
    public long LJ = -1;
    public final /* synthetic */ AbstractC480380Ise LJFF;

    public C480390Isf(AbstractC480380Ise abstractC480380Ise) {
        this.LJFF = abstractC480380Ise;
    }

    public static C20632315oP LIZ(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof C20632315oP) {
            return (C20632315oP) parent;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ViewPager2 instance. Got: ");
        sbLIZ.append(parent);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(boolean z) {
        int currentItem;
        Fragment fragmentLJ;
        boolean z2;
        if (this.LJFF.LLILLJJLI.LJLJJI() || this.LIZLLL.getScrollState() != 0 || this.LJFF.LLILLL.LJII() || this.LJFF.getItemCount() == 0 || (currentItem = this.LIZLLL.getCurrentItem()) >= this.LJFF.getItemCount()) {
            return;
        }
        this.LJFF.getClass();
        long j = currentItem;
        if ((j != this.LJ || z) && (fragmentLJ = this.LJFF.LLILLL.LJ(j)) != null && fragmentLJ.isAdded()) {
            this.LJ = j;
            C19EH c19ehLJIIJ = this.LJFF.LLILLJJLI.LJIIJ();
            ArrayList<List> arrayList = new ArrayList();
            Fragment fragment = null;
            for (int i = 0; i < this.LJFF.LLILLL.LJIIJJI(); i++) {
                long jLJIIIIZZ = this.LJFF.LLILLL.LJIIIIZZ(i);
                Fragment fragmentLJIIL = this.LJFF.LLILLL.LJIIL(i);
                if (fragmentLJIIL.isAdded()) {
                    if (jLJIIIIZZ != this.LJ) {
                        c19ehLJIIJ.LJIL(fragmentLJIIL, Lifecycle.State.STARTED);
                        arrayList.add(this.LJFF.LLIZ.LIZ());
                    } else {
                        fragment = fragmentLJIIL;
                    }
                    if (jLJIIIIZZ == this.LJ) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    fragmentLJIIL.setMenuVisibility(z2);
                }
            }
            if (fragment != null) {
                c19ehLJIIJ.LJIL(fragment, Lifecycle.State.RESUMED);
                arrayList.add(this.LJFF.LLIZ.LIZ());
            }
            if (!c19ehLJIIJ.LJIILLIIL()) {
                c19ehLJIIJ.LJIIJJI();
                Collections.reverse(arrayList);
                for (List list : arrayList) {
                    this.LJFF.LLIZ.getClass();
                    C480340Isa.LIZIZ(list);
                }
            }
        }
    }
}
