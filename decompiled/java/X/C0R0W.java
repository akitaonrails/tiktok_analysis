package X;

import Y.AsS37S0100000_10;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.react.bridge.JavaOnlyArray;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.SearchList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0R0W, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R0W implements InterfaceC688940R0q {
    public final SearchList LL;
    public final C0R0K LLILLJJLI;
    public float LLILLL = -1.0f;
    public float LLILZ = -1.0f;
    public final int LLILZIL;
    public int LLILZLL;
    public C0R0X LLIZ;

    @Override // X.InterfaceC688940R0q
    public final void destroy() {
    }

    public final C1318570kPv LIZ(RecyclerView recyclerView) {
        View childAt;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (childAt = layoutManager.getChildAt(layoutManager.getChildCount() - 1)) == null) {
            return null;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
        JavaOnlyArray javaOnlyArray = this.LLILLJJLI.LJIJ;
        if (javaOnlyArray == null || !javaOnlyArray.contains(Integer.valueOf(childAdapterPosition))) {
            return null;
        }
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(childAt);
        if (!(childViewHolder instanceof C1318570kPv)) {
            return null;
        }
        return (C1318570kPv) childViewHolder;
    }

    public final boolean LIZIZ(RecyclerView recyclerView) {
        View childAt;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (childAt = layoutManager.getChildAt(layoutManager.getChildCount() - 1)) == null) {
            return false;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
        JavaOnlyArray javaOnlyArray = this.LLILLJJLI.LJIJ;
        if (javaOnlyArray == null) {
            return false;
        }
        return javaOnlyArray.contains(Integer.valueOf(childAdapterPosition));
    }

    public final void LIZJ(boolean z) {
        if (z) {
            C0R0Y c0r0y = this.LLILLJJLI.LJIIZILJ;
            if (c0r0y != null) {
                C0R0Y.LIZ(c0r0y, "bounceViewStatus", C2097908Jt.LIZJ(new Pair("type", "show")));
                return;
            }
            return;
        }
        C0R0Y c0r0y2 = this.LLILLJJLI.LJIIZILJ;
        if (c0r0y2 == null) {
            return;
        }
        C0R0Y.LIZ(c0r0y2, "bounceViewStatus", C2097908Jt.LIZJ(new Pair("type", "hide")));
    }

    public C0R0W(SearchList searchList, C0R0K c0r0k) {
        this.LL = searchList;
        this.LLILLJJLI = c0r0k;
        this.LLILZIL = ViewConfiguration.get(searchList.mContext).getScaledTouchSlop();
        RecyclerView recyclerView = (RecyclerView) searchList.mView;
        c0r0k.LJIJJ = new C688800R0c(this, recyclerView);
        recyclerView.addOnScrollListener(new AsS37S0100000_10(this, 9));
    }
}
