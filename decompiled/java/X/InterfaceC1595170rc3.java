package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.item.StoryCacheData;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1595170rc3 {
    List<Aweme> LIZ();

    Pair<InterfaceC1455405mq<InterfaceC1891350zJl>, Integer> LIZIZ();

    void LIZJ(String str);

    StoryCacheData LIZLLL(boolean z, C1598830rhx c1598830rhx);

    void LJ();

    Pair<List<InterfaceC1891350zJl>, Integer> LJFF();

    boolean LJI();

    void LJII();

    void LJIIIIZZ(List<? extends InterfaceC1891350zJl> list);

    void LJIIIZ(List<? extends InterfaceC1891350zJl> list);

    void LJIIJ();

    void LJIIJJI(StoryGetFeedByPageResponse storyGetFeedByPageResponse);

    void resetDataCenterStatus();
}
