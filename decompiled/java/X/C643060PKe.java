package X;

import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643060PKe<T extends InterfaceC594520NTm> implements C0PBX {
    public static final C643060PKe<T> LIZ = new C643060PKe<>();

    public static final C0PBZ LIZIZ(InterfaceC594520NTm interfaceC594520NTm, Aweme aweme) {
        List<Aweme> awemeList;
        C0PHQ c0phq = C0PHQ.LIZ;
        AIAdCardStruct aiAdCard = ((SearchMixFeed) interfaceC594520NTm).getAiAdCard();
        if (aiAdCard != null && (awemeList = aiAdCard.getAwemeList()) != null && !awemeList.isEmpty()) {
            Iterator<Aweme> it2 = awemeList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), aweme)) {
                    return c0phq;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.C0PBX
    public final C0PBZ LIZ(SearchMixFeed searchMixFeed, Aweme aweme, C0PHW c0phw) {
        return LIZIZ(searchMixFeed, aweme);
    }
}
