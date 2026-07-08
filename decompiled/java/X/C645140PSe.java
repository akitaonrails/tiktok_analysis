package X;

import Y.AObjectS113S0000000_10;
import Y.AObjectS385S0100000_10;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0PSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645140PSe extends AbstractC654930PmV {
    public final String LLILLL;
    public final InterfaceC659300PtY LLILZ;
    public final C643450PLr LLILZIL;
    public C0P7W LLILZLL;
    public final InterfaceC645470PTl LLIZ;
    public final int LLJ;
    public String LLJI;
    public final C653450Pk7<Aweme> LLJIJIL = new C653450Pk7<>(this);
    public final C0SZT LLJILJIL = new C0SZT(this);
    public final int LLIZLLLIL = 0;

    @Override // X.AbstractC683560Qra
    public final RecyclerView.ViewHolder LLLI(ViewGroup viewGroup) {
        int i;
        if (this.LLJ == 9) {
            if (C0PT9.LIZ()) {
                i = R.layout.f48;
            } else {
                i = R.layout.f47;
            }
            SearchVideoHolder searchVideoHolder = new SearchVideoHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false), this.LLILLL, this.LLILZ, this.LLJILJIL, this.LLILZIL.getFragment(), new AObjectS385S0100000_10(this, 1));
            searchVideoHolder.A5(this.LLILZLL);
            return searchVideoHolder;
        }
        if (this.LLIZLLLIL == 1) {
            return new SearchVideoHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ezp, viewGroup, false), this.LLILLL, this.LLILZ, this.LLJILJIL, this.LLILZIL.getFragment(), new AObjectS385S0100000_10(this, 2));
        }
        return null;
    }

    @Override // X.AbstractC654930PmV
    public final void LLLIILIL(FollowStatus followStatus) {
        User author;
        List<T> list = this.mmItems;
        if (list != 0 && !list.isEmpty() && followStatus != null && !TextUtils.isEmpty(followStatus.getUserId())) {
            for (T t : list) {
                if (t != null && (author = t.getAuthor()) != null && followStatus.getUserId().equals(author.getUid())) {
                    author.setFollowStatus(followStatus.getFollowStatus());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC654930PmV, X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C643450PLr c643450PLr;
        InterfaceC645470PTl interfaceC645470PTl;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C0PT8) {
            C660870Pw5.LIZIZ(viewHolder.itemView, ((C0PT8) viewHolder).l3());
        }
        if (viewHolder.getItemViewType() == 0 && (c643450PLr = this.LLILZIL) != null && c643450PLr.getUserVisibleHint() && (interfaceC645470PTl = this.LLIZ) != null) {
            interfaceC645470PTl.Tr(viewHolder);
        }
        if (viewHolder instanceof SearchVideoHolder) {
            SearchVideoHolder searchVideoHolder = (SearchVideoHolder) viewHolder;
            searchVideoHolder.z7("search_result");
            if (C291310BbN.LIZ()) {
                searchVideoHolder.onViewAttachedToWindow();
            }
        }
    }

    @Override // X.AbstractC654930PmV, X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C0PT8) {
            C660870Pw5.LIZJ(viewHolder.itemView);
        }
        if (C291310BbN.LIZ() && (viewHolder instanceof SearchVideoHolder)) {
            ((SearchVideoHolder) viewHolder).onViewDetachedFromWindow();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof SearchVideoHolder) {
            ((SearchVideoHolder) viewHolder).wY0();
        }
    }

    @Override // X.AbstractC683590Qrd
    public final void setData(List<Aweme> list) {
        super.setData(list);
        this.LLJIJIL.LIZJ(list, new AObjectS113S0000000_10(2));
    }

    @Override // X.AbstractC683590Qrd
    public final void setDataAfterLoadMore(List<Aweme> list) {
        super.setDataAfterLoadMore(list);
        this.LLJIJIL.LIZJ(list, new AObjectS113S0000000_10(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0268  */
    @Override // X.AbstractC683560Qra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLFZ(androidx.recyclerview.widget.RecyclerView.ViewHolder r28, int r29) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C645140PSe.LLLFZ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    public C645140PSe(C643450PLr c643450PLr, String str, InterfaceC659300PtY interfaceC659300PtY, InterfaceC645470PTl interfaceC645470PTl, int i) {
        this.LLILLL = str;
        this.LLILZ = interfaceC659300PtY;
        this.LLILZIL = c643450PLr;
        this.LLIZ = interfaceC645470PTl;
        this.LLJ = i;
    }
}
