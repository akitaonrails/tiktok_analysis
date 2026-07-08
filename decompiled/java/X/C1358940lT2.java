package X;

import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteInfo;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.experiment.RepostPublicInteractExp;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0lT2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358940lT2 {
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358940lT2.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static final UpvoteStruct LIZJ(UpvoteList upvoteList) {
        List<UpvoteStruct> list;
        UpvoteStruct upvoteStruct = null;
        if (upvoteList == null || (list = upvoteList.upvotes) == null) {
            return null;
        }
        Iterator<UpvoteStruct> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            UpvoteStruct next = it2.next();
            if (C10EU.LJIILLIIL(next.user)) {
                upvoteStruct = next;
                break;
            }
        }
        return upvoteStruct;
    }

    public static final boolean LIZLLL(Throwable th) {
        if ((th instanceof C23112093u) && ((C23112093u) th).getErrorCode() == 3002635) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(Throwable th) {
        if ((th instanceof C23112093u) && ((C23112093u) th).getErrorCode() == 2150) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(Throwable th) {
        if ((th instanceof C23112093u) && ((C23112093u) th).getErrorCode() == 7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final EnumC1359020lTA LJI(String str) {
        switch (str.hashCode()) {
            case -1271119582:
                if (str.equals("homepage_follow")) {
                    return EnumC1359020lTA.FOLLOWING_FEED;
                }
                break;
            case -1051643920:
                if (str.equals("homepage_nearby")) {
                    return EnumC1359020lTA.NEARBY_FEED;
                }
                break;
            case -667094460:
                if (str.equals("homepage_friends")) {
                    return EnumC1359020lTA.FRIENDS_FEED;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    return EnumC1359020lTA.IM_CHAT;
                }
                break;
            case 1691937916:
                if (str.equals("homepage_hot")) {
                    return EnumC1359020lTA.FOR_YOU_FEED;
                }
                break;
        }
        return EnumC1359020lTA.OTHERS;
    }

    public static final String LJII(Aweme aweme) {
        UpvoteInfo upvoteInfo;
        String str;
        if (aweme != null && aweme.getAid() != null && ((Number) C1359070lTF.LIZ.getValue()).intValue() > 0 && (upvoteInfo = aweme.getUpvoteInfo()) != null && (str = upvoteInfo.friendsRecallInfo) != null && str.length() > 0) {
            return C08JS.LIZLLL(C2097908Jt.LIZJ(new Pair(aweme.getAid(), str)));
        }
        return null;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        boolean z;
        boolean z2;
        List<UpvoteStruct> list;
        String uid;
        if (aweme == null) {
            return false;
        }
        C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        UpvoteList upvoteListLJIIIIZZ = c1360460lVU.LJIIIIZZ(aid);
        if (upvoteListLJIIIIZZ != null && (list = upvoteListLJIIIIZZ.upvotes) != null) {
            Iterator<UpvoteStruct> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                UpvoteStruct next = it2.next();
                IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
                User user = next.user;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                if (iAccountUserServiceLJFF.LIZJ(uid)) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
            z = false;
        } else {
            z = false;
        }
        InteractPermission interactPermission = aweme.getInteractPermission();
        if (interactPermission != null && interactPermission.getUpvote() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    public static final void LIZ(SpannableStringBuilder spannableStringBuilder, List list, int i, InterfaceC1358050lRb interfaceC1358050lRb) {
        if (!C298740BnM.LIZ()) {
            RepostPublicInteractExp.LIZ.getClass();
            RepostPublicInteractExp.RepostPublicInteractConfig repostPublicInteractConfigLIZIZ = RepostPublicInteractExp.LIZIZ();
            if (repostPublicInteractConfigLIZIZ == null || !repostPublicInteractConfigLIZIZ.replyMention) {
                return;
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TextExtraStruct textExtraStruct = (TextExtraStruct) it2.next();
                int start = textExtraStruct.getStart();
                int end = textExtraStruct.getEnd();
                C1358040lRa c1358040lRa = new C1358040lRa(interfaceC1358050lRb, i, textExtraStruct);
                int length = spannableStringBuilder.length();
                if (start >= 0 && end <= length && start <= end) {
                    C786410Ut5.q2(spannableStringBuilder, c1358040lRa, start, end, 33);
                    C786410Ut5.q2(spannableStringBuilder, new C444920HcY(52, false), start, end, 33);
                }
            }
        }
    }
}
