package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01se, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C472201se {
    public static final C472201se LIZ = new C472201se();
    public static Pair<String, ? extends Keva> LIZIZ;

    public static Keva LIZ() {
        String uid;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        Pair<String, ? extends Keva> pair = LIZIZ;
        if (pair == null) {
            Keva repo = Keva.getRepo(C786410Ut5.j4("bulletin_board_pre_join_legal_tips_%s", Arrays.copyOf(new Object[]{uid}, 1)));
            LIZIZ = new Pair<>(uid, repo);
            return repo;
        }
        if (Intrinsics.LJFF(pair.getFirst(), uid)) {
            return pair.getSecond();
        }
        Keva repo2 = Keva.getRepo(C786410Ut5.j4("bulletin_board_pre_join_legal_tips_%s", Arrays.copyOf(new Object[]{uid}, 1)));
        LIZIZ = new Pair<>(uid, repo2);
        return repo2;
    }
}
