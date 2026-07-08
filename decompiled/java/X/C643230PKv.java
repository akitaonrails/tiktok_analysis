package X;

import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643230PKv<T extends InterfaceC594520NTm> implements C0PBX {
    public static final C643230PKv<T> LIZ = new C643230PKv<>();

    public static final C0PBZ LIZIZ(InterfaceC594520NTm interfaceC594520NTm, Aweme aweme) {
        List<Aweme> awemeList;
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        if (!Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "SearchBotFeed") || aweme == null || (awemeList = searchMixFeed.getBot().getAwemeList()) == null) {
            return null;
        }
        Iterator<Aweme> it2 = awemeList.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getAid(), aweme.getAid())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return new C640750PBh(i, null, false, 0, 14);
    }

    @Override // X.C0PBX
    public final C0PBZ LIZ(SearchMixFeed searchMixFeed, Aweme aweme, C0PHW c0phw) {
        return LIZIZ(searchMixFeed, aweme);
    }
}
