package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.experiment.RecUserReverseMUFConfig;
import com.ss.android.ugc.aweme.relation.experiment.ReverseMufConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0iec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250800iec {
    public static final C1250800iec LIZ = new C1250800iec();
    public static final RecUserReverseMUFConfig LIZIZ = new RecUserReverseMUFConfig(new ReverseMufConfig(new boolean[]{false, false}, new int[]{20, 10000}), new ReverseMufConfig(new boolean[]{false, false}, new int[]{20, 10000}), new ReverseMufConfig(new boolean[]{false, false}, new int[]{20, 10000}), new ReverseMufConfig(new boolean[]{false, false}, new int[]{20, 10000}), new ReverseMufConfig(new boolean[]{true, true}, new int[]{20, 10000}));

    public static RecUserReverseMUFConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        RecUserReverseMUFConfig recUserReverseMUFConfig = LIZIZ;
        RecUserReverseMUFConfig recUserReverseMUFConfig2 = (RecUserReverseMUFConfig) c0c64LJIILLIIL.LJJII(RecUserReverseMUFConfig.class, recUserReverseMUFConfig, "disable_user_recommend_muf", false);
        return recUserReverseMUFConfig2 != null ? recUserReverseMUFConfig2 : recUserReverseMUFConfig;
    }

    public static boolean LIZIZ(ReverseMufConfig reverseMufConfig) {
        Object next;
        int friendCount;
        if (reverseMufConfig == null) {
            return false;
        }
        List<Boolean> listLJJZ = C13LQ.LJJZ(reverseMufConfig.disable);
        List<Integer> listLJJLJ = C13LQ.LJJLJ(reverseMufConfig.mufUpperBounds);
        if (listLJJZ.size() != listLJJLJ.size()) {
            return false;
        }
        Iterator it2 = ((ArrayList) C13LP.LLIILII(listLJJZ, listLJJLJ)).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Pair pair = (Pair) next;
                LIZ.getClass();
                User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                if (curUser != null) {
                    friendCount = curUser.getFriendCount();
                } else {
                    friendCount = 0;
                }
                if (friendCount <= ((Number) pair.getSecond()).intValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Pair pair2 = (Pair) next;
        if (pair2 == null) {
            return false;
        }
        return ((Boolean) pair2.getFirst()).booleanValue();
    }
}
