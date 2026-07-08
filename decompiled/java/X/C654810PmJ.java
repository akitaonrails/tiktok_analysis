package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.search.GeccContentSellingPoint;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.HashMap;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0PmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C654810PmJ extends C656300Poi implements InterfaceC655680Pni {
    public final SearchMixFeed LLILZIL;
    public final Aweme LLILZLL;
    public final C650430PfF LLIZ;

    @Override // X.InterfaceC655680Pni
    public final boolean LLJLIL() {
        return false;
    }

    @Override // X.InterfaceC655680Pni
    public final String LJLLL() {
        return C656400Pos.LIZ(this.LLILZLL);
    }

    @Override // X.InterfaceC655680Pni
    public final GeccContentSellingPoint LLJJIJI() {
        return new GeccContentSellingPoint(null, null, null);
    }

    @Override // X.C656300Poi, X.InterfaceC645880PVa
    public final C650430PfF LLIZLLLIL() {
        return this.LLIZ;
    }

    @Override // X.C656300Poi, X.InterfaceC435460H5s
    public final Aweme getAweme() {
        return this.LLILZLL;
    }

    public final void LIZIZ(C07XJ c07xj) {
        if (C0PI4.LJ(this.LLILZLL)) {
            LIZ(c07xj, this.LLILZLL, "is_inner");
            LIZ(c07xj, this.LLILZLL, "inner_search_id");
            LIZ(c07xj, this.LLILZLL, "rank_inner");
            c07xj.LIZ("is_slide", CardStruct.IStatusCode.DEFAULT);
            c07xj.LIZ("slide_rank", CardStruct.IStatusCode.DEFAULT);
        }
    }

    public C654810PmJ(Aweme aweme, SearchMixFeed searchMixFeed) {
        super(aweme, C2097608Jq.LJ());
        this.LLILZIL = searchMixFeed;
        this.LLILZLL = aweme;
        this.LLIZ = new C650430PfF(new AwS589S0100000_10(this, 383));
    }

    public static final void LIZ(C07XJ c07xj, Aweme aweme, String str) {
        String str2;
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams != null && (str2 = mobParams.get(str)) != null) {
            c07xj.LIZ(str, str2);
        }
    }
}
