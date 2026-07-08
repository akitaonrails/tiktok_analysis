package X;

import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641210PDb<T extends InterfaceC594520NTm> implements C0PBX {
    public static final C641210PDb<T> LIZ = new C641210PDb<>();

    public static final C0PBZ LIZIZ(InterfaceC594520NTm interfaceC594520NTm, Aweme aweme) {
        boolean z;
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        if ((searchMixFeed.getFeedType() == 41 && Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "search_music_creation_aggregated_video")) || (searchMixFeed.getFeedType() == 42 && Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "search_music_aggregated_video"))) {
            z = true;
        } else {
            z = false;
        }
        if (!z || aweme == null) {
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
