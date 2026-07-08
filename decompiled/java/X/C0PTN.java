package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;

/* JADX INFO: renamed from: X.0PTN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0PTN extends AbstractViewOnAttachStateChangeListenerC654600Ply {
    public SearchMixFeed LLIZ;

    public abstract void R5(SearchMixFeed searchMixFeed);

    public C0PTN(View view) {
        super(view);
    }

    public final void P5(SearchMixFeed searchMixFeed) {
        if (searchMixFeed == this.LLIZ) {
            return;
        }
        this.LLIZ = searchMixFeed;
        R5(searchMixFeed);
    }
}
