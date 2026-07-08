package X;

import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: X.0its, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1260260its extends AbstractC1585810rMx {
    public int LL;
    public int LLILLJJLI;
    public final int[] LLILLL = new int[2];
    public final int LLILZ;
    public C1260270itt LLILZIL;

    public C1260260its() {
        C844470XAv.LIZ.getClass();
        this.LLILZ = ViewConfiguration.get(C844470XAv.LIZ()).getScaledTouchSlop();
    }

    public static boolean LJJIJIIJIL(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).getOrientation() != 1) {
                return false;
            }
            return true;
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || ((StaggeredGridLayoutManager) layoutManager).LLILZIL != 1) {
            return false;
        }
        return true;
    }

    public boolean LJJIL(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            LJJIZ(recyclerView, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIZ(androidx.recyclerview.widget.RecyclerView r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1260260its.LJJIZ(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        int scrollState = recyclerView.getScrollState();
        if (this.LLILZIL == null) {
            this.LLILZIL = new C1260270itt();
        }
        if (scrollState == 0) {
            C1260270itt c1260270itt = this.LLILZIL;
            if (c1260270itt.LIZ != scrollState || c1260270itt.LIZIZ != i || c1260270itt.LIZJ != i2) {
                c1260270itt.LIZ = scrollState;
                c1260270itt.LIZIZ = i;
                c1260270itt.LIZJ = i2;
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
                if (C1620190sGP.LIZ()) {
                    if (LJJIJIIJIL(recyclerView)) {
                        i = i2;
                    }
                    if (Math.abs(i) <= this.LLILZ) {
                        LJJIZ(recyclerView, false);
                    }
                }
            }
        }
    }
}
