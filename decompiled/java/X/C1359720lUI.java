package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.im.IMAIMojiSticker;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.experiment.FifaAnchorIdsConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lUI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359720lUI {
    public static final IMAIMojiSticker LIZJ(UpvoteStruct upvoteStruct) {
        if (LJI(upvoteStruct.user)) {
            return upvoteStruct.aiMojiSticker;
        }
        return null;
    }

    public static final String LIZLLL(UpvoteStruct upvoteStruct) {
        if (LJII(upvoteStruct.user)) {
            return upvoteStruct.text;
        }
        return null;
    }

    public static final boolean LJ(UpvoteStruct upvoteStruct) {
        boolean z = false;
        if (upvoteStruct == null) {
            return false;
        }
        String strLIZLLL = LIZLLL(upvoteStruct);
        if (strLIZLLL == null || strLIZLLL.length() == 0) {
            z = true;
        }
        return !z;
    }

    public static final boolean LJFF(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        List list;
        if (!C07NU.LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "social_repost_fifa_easter_egg", true, false) && aweme != null && (anchors = aweme.getAnchors()) != null && !anchors.isEmpty()) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (it2.hasNext()) {
                String id = it2.next().getId();
                if (id != null && id.length() != 0) {
                    FifaAnchorIdsConfig fifaAnchorIdsConfig = (FifaAnchorIdsConfig) C00Z9.LIZ.getValue();
                    if (fifaAnchorIdsConfig == null || (list = fifaAnchorIdsConfig.ids) == null) {
                        list = C13BV.INSTANCE;
                    }
                    if (list.contains(id)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJI(User user) {
        if ((user != null && user.getFollowStatus() == 2) || C10EU.LJIILLIIL(user)) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(User user) {
        if (user == null) {
            return false;
        }
        C01GW c01gw = C0B12.LIZ;
        if (2 != ((Number) c01gw.getValue()).intValue()) {
            if (1 == ((Number) c01gw.getValue()).intValue()) {
                if (!LJI(user) && user.getFollowStatus() != 1) {
                    return false;
                }
            } else {
                return LJI(user);
            }
        }
        return true;
    }

    public static final <T> Pair<Integer, T> LIZ(List<? extends T> list, int i, Function1<? super T, Boolean> function1) {
        if (i >= list.size() - 1) {
            return new Pair<>(-1, C13LP.LJJLIIIJJI(list));
        }
        do {
            i++;
            if (i >= list.size()) {
                return new Pair<>(-1, C13LP.LJJLIIIJJI(list));
            }
        } while (!function1.invoke((Object) ListProtector.get(list, i)).booleanValue());
        return new Pair<>(Integer.valueOf(i), ListProtector.get(list, i));
    }

    public static final <K, V> V LIZIZ(Map<K, ? extends V> map, K k, V v) {
        V v2 = map.get(k);
        if (v2 != null) {
            return v2;
        }
        return v;
    }
}
