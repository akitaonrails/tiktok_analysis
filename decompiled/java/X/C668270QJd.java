package X;

import Y.ARunnableS79S0200000_10;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;

/* JADX INFO: renamed from: X.0QJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668270QJd implements C0QKU {
    public final /* synthetic */ C0QJX LIZ;

    public C668270QJd(C0QJX c0qjx) {
        this.LIZ = c0qjx;
    }

    public final void LIZ(SearchSugResponse searchSugResponse) {
        if (searchSugResponse != null) {
            C0QJX c0qjx = this.LIZ;
            if (c0qjx.LLILLJJLI != 0) {
                C786410Ut5.LJJZZIII(c0qjx.LLILZ, new ARunnableS79S0200000_10(this, searchSugResponse, 59));
            }
        }
    }
}
