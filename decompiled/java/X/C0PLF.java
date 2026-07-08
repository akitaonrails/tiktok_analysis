package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Map;

/* JADX INFO: renamed from: X.0PLF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PLF extends C656300Poi {
    public final SearchMixFeed LLILZIL;
    public final Aweme LLILZLL;

    @Override // X.C656300Poi, X.InterfaceC435460H5s
    public final Aweme getAweme() {
        return this.LLILZLL;
    }

    public C0PLF(SearchMixFeed searchMixFeed, Aweme aweme, Map<String, String> map) {
        super(aweme, map);
        this.LLILZIL = searchMixFeed;
        this.LLILZLL = aweme;
    }
}
