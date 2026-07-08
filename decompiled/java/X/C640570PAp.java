package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.List;

/* JADX INFO: renamed from: X.0PAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640570PAp implements C0NMS, InterfaceC640580PAq {
    public final C0NMS LIZ;
    public final InterfaceC640580PAq LIZIZ;

    @Override // X.C0NMS
    public final void LIZ(SearchMixFeedList searchMixFeedList) {
        this.LIZ.LIZ(searchMixFeedList);
    }

    @Override // X.InterfaceC640580PAq
    public final List<SearchMixFeed> LIZJ(List<? extends SearchMixFeed> list) {
        return this.LIZIZ.LIZJ(list);
    }

    @Override // X.InterfaceC640580PAq
    public final SearchMixFeed LIZLLL(SearchMixFeed searchMixFeed) {
        return this.LIZIZ.LIZLLL(searchMixFeed);
    }

    @Override // X.InterfaceC640580PAq
    public final AnonymousClass0957 LJ(C0PFL c0pfl) {
        return this.LIZIZ.LJ(c0pfl);
    }

    @Override // X.C0NMS
    public final List<SearchMixFeed> LIZIZ(List<? extends SearchMixFeed> list, boolean z) {
        List<SearchMixFeed> listLIZIZ = this.LIZ.LIZIZ(list, z);
        if (z) {
            return this.LIZIZ.LIZJ(listLIZIZ);
        }
        return listLIZIZ;
    }

    public C640570PAp(C0PN8 c0pn8, C0NMR c0nmr, C0PBJ c0pbj) {
        this.LIZ = c0nmr;
        this.LIZIZ = c0pbj;
        c0pn8.LLJLILLLLZIIL = this;
    }
}
