package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* JADX INFO: renamed from: X.0PmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC654900PmS<T> extends AbstractC683560Qra<T> {
    public SearchResultParam LLILLL;
    public InterfaceC639130P5b LLILZ;
    public final C0PT5 LLILZIL;

    public AbstractC654900PmS() {
    }

    @Override // X.AbstractC683560Qra, X.AbstractC438050HFr
    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        super.onBindBasicViewHolder(viewHolder, i);
    }

    public AbstractC654900PmS(SearchResultParam searchResultParam, C0P9D c0p9d, InterfaceC645400PTe interfaceC645400PTe) {
        this.LLILZ = c0p9d;
        this.LLILLL = searchResultParam;
        this.LLILZIL = new C0PT5(interfaceC645400PTe);
    }
}
