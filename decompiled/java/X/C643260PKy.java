package X;

import X.InterfaceC594520NTm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.viralsong.ViralSongCard;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643260PKy<T extends InterfaceC594520NTm> implements C0PBX {
    public static final C643260PKy<T> LIZ = new C643260PKy<>();

    public static final C0PBZ LIZIZ(InterfaceC594520NTm interfaceC594520NTm, Aweme aweme) {
        ViralSongCard viralSongCard;
        List<Aweme> list;
        SearchMixFeed searchMixFeed = (SearchMixFeed) interfaceC594520NTm;
        if (!Intrinsics.LJFF(AwemeBizExtKt.getSearchFeedType(aweme), "SearchViralSong") || aweme == null || (viralSongCard = searchMixFeed.getViralSongCard()) == null || (list = viralSongCard.videos) == null) {
            return null;
        }
        Iterator<Aweme> it2 = list.iterator();
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
