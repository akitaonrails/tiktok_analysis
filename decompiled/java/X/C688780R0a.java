package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.SearchList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0R0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688780R0a implements InterfaceC688940R0q {
    public final C0R0K LL;

    @Override // X.InterfaceC688940R0q
    public final void destroy() {
    }

    public C688780R0a(SearchList searchList, C0R0K c0r0k) {
        this.LL = c0r0k;
        ((RecyclerView) searchList.mView).addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0R0Z
            public int LL;
            public int LLILLJJLI;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                C0R0K c0r0k2 = this.LLILLL.LL;
                if (c0r0k2.LJJ) {
                    return;
                }
                int i3 = this.LL + i;
                this.LL = i3;
                if (i3 != this.LLILLJJLI) {
                    C0R0Y c0r0y = c0r0k2.LJIIZILJ;
                    if (c0r0y != null) {
                        C0R0Y.LIZ(c0r0y, "scroll", C2097908Jt.LIZJ(new Pair("scrollLeft", Integer.valueOf(i3))));
                    }
                    this.LLILLJJLI = this.LL;
                }
            }
        });
    }
}
