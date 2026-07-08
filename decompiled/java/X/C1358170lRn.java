package X;

import com.ss.android.ugc.aweme.feed.model.im.IMAIMojiSticker;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0lRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358170lRn {
    public static final int LIZLLL(User user) {
        if (C10EU.LJIILLIIL(user)) {
            return -1;
        }
        if (user.getFollowStatus() > 0) {
            return user.getFollowStatus();
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        return 0;
    }

    public static final int LJ(List<? extends TextExtraStruct> list) {
        Iterator<? extends TextExtraStruct> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (C10EU.LJIIZILJ(it2.next().getUserId())) {
                i = 1;
            } else {
                i = 2;
            }
        }
        return i;
    }

    public static final String LJFF(String str) {
        int iLIZLLL = C439870HMr.LIZLLL(str);
        if (str != null && str.length() != 0) {
            if (iLIZLLL <= 0) {
                return "text";
            }
            if (str.length() - (iLIZLLL * 2) <= 0) {
                return "emoji";
            }
            return "text_emoji";
        }
        return "";
    }

    public static final int LJI(String str) {
        int iLIZLLL = C439870HMr.LIZLLL(str);
        int i = 0;
        if (str != null && str.length() != 0 && iLIZLLL > 0) {
            i = 2;
            if (str.length() - (iLIZLLL * 2) > 0) {
                return 1;
            }
        }
        return i;
    }

    public static final void LIZIZ(C2344009Gk c2344009Gk, IMAIMojiSticker iMAIMojiSticker) {
        String str;
        if (C1359030lTB.LIZ() != 3) {
            if (iMAIMojiSticker == null) {
                c2344009Gk.LIZJ(0, "other_user_sa_reaction");
                return;
            }
            c2344009Gk.LIZJ(1, "other_user_sa_reaction");
            Set<String> set = iMAIMojiSticker.expressions;
            if (set != null) {
                str = (String) C13LP.LJJJLIIL(set);
            } else {
                str = null;
            }
            c2344009Gk.LJFF("avatar_expression", str);
        }
    }

    public static final void LIZJ(C2344009Gk c2344009Gk, UpvoteStruct upvoteStruct) {
        String strLIZLLL;
        int length;
        List<? extends TextExtraStruct> list;
        Integer numValueOf = null;
        if (upvoteStruct != null) {
            strLIZLLL = C1359720lUI.LIZLLL(upvoteStruct);
        } else {
            strLIZLLL = null;
        }
        int size = 0;
        if (strLIZLLL != null) {
            length = strLIZLLL.length();
        } else {
            length = 0;
        }
        c2344009Gk.LIZJ(length, "repost_length");
        c2344009Gk.LJFF("text_type", LJFF(strLIZLLL));
        if (C298740BnM.LIZ()) {
            if (upvoteStruct != null) {
                list = upvoteStruct.textExtra;
                if (list != null) {
                    size = list.size();
                }
            } else {
                list = null;
            }
            c2344009Gk.LIZJ(size, "mention_cnt");
            if (list != null) {
                numValueOf = Integer.valueOf(LJ(list));
            }
            c2344009Gk.LJ(numValueOf, "mention_type");
        }
    }

    public static final void LIZ(C2344009Gk c2344009Gk, String str, Object obj) {
        if (C703302op.LIZ(str) && obj != null) {
            c2344009Gk.LJFF(str, obj.toString());
        }
    }
}
