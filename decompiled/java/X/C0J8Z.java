package X;

import Y.ARunnableS107S0100000_7;
import Y.AfS140S0200000_4;
import Y.AfS27S0301000_7;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0J8Z, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0J8Z {
    boolean LIZ(String str);

    void LIZIZ(long j);

    boolean LIZJ();

    void LIZLLL(User user, C09JN c09jn, String str);

    void LJ(Runnable runnable, String str);

    void LJFF(List<Aweme> list);

    void LJI(List<FollowFeed> list);

    boolean LJII(Aweme aweme, User user);

    void LJIIIIZZ(User user, List list, AfS27S0301000_7 afS27S0301000_7, String str);

    void LJIIIZ(List list, AfS140S0200000_4 afS140S0200000_4, String str);

    void LJIIJ(List list, Map map, ARunnableS107S0100000_7 aRunnableS107S0100000_7, String str);
}
