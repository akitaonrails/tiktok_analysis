package X;

import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PKR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PKR<T extends InterfaceC594520NTm> implements C0PBX {
    public static final C0PKR<T> LIZ = new C0PKR<>();

    public static final C0PBZ LIZIZ(InterfaceC594520NTm interfaceC594520NTm, Aweme aweme) {
        List<? extends Aweme> list;
        C0PHQ c0phq = C0PHQ.LIZ;
        SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct = ((SearchMixFeedBase) interfaceC594520NTm).multiAdCard;
        if (searchInflowMultiAdCardStruct != null && (list = searchInflowMultiAdCardStruct.awemeList) != null && !list.isEmpty()) {
            Iterator<? extends Aweme> it2 = list.iterator();
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
