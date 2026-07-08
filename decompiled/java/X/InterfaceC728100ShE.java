package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ShE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC728100ShE {
    void LIZ(List list, String str, List list2, boolean z);

    void LIZIZ(Aweme aweme, String str, boolean z);

    void LIZJ(String str, String str2);

    C11NZ<Aweme> LIZLLL(String str, boolean z);

    void LJ(String str, UserStory userStory);

    void LJFF(FollowStatus followStatus);

    void LJI(String str);

    C11NZ<Pair<Aweme, Integer>> LJII(String str);

    Aweme LJIIIIZZ();

    Aweme LJIIIZ(String str);

    void clear();
}
