package X;

import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;

/* JADX INFO: renamed from: X.0PDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641220PDc<T extends InterfaceC594520NTm> implements C0PBX {
    public static final C641220PDc<T> LIZ = new C641220PDc<>();

    public static final C0PBZ LIZIZ(InterfaceC594520NTm interfaceC594520NTm, Aweme aweme) {
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        if (!C641200PDa.LIZIZ(aweme) || aweme == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(C641200PDa.LIZ(aweme, searchMixFeed));
        if (numValueOf.intValue() < 0) {
            return null;
        }
        return new C640750PBh(numValueOf.intValue(), null, false, 0, 14);
    }

    @Override // X.C0PBX
    public final C0PBZ LIZ(SearchMixFeed searchMixFeed, Aweme aweme, C0PHW c0phw) {
        return LIZIZ(searchMixFeed, aweme);
    }
}
