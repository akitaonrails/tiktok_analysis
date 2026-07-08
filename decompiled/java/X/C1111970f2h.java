package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import webcast.data.UserIdentity;

/* JADX INFO: renamed from: X.0f2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111970f2h {
    public static final Set<Long> LIZ = new LinkedHashSet();
    public static final List<C1112660f3o> LIZIZ = new ArrayList();
    public static final Map<Integer, List<C1112660f3o>> LIZJ = new LinkedHashMap();

    public static long LIZIZ(AbstractC1110790f0n abstractC1110790f0n) {
        C1112240f38 c1112240f38LIZJ = LIZJ(abstractC1110790f0n);
        if (c1112240f38LIZJ != null) {
            long j = ((c1112240f38LIZJ.LIZ ? 1L : 0L) << 0) | ((c1112240f38LIZJ.LIZIZ ? 1L : 0L) << 1) | ((c1112240f38LIZJ.LIZJ ? 1L : 0L) << 2) | ((c1112240f38LIZJ.LIZLLL ? 1L : 0L) << 3) | ((c1112240f38LIZJ.LJ ? 1L : 0L) << 4);
            if (c1112240f38LIZJ.LJI > 50) {
                c1112240f38LIZJ.LJI = 50;
            }
            if (c1112240f38LIZJ.LJII > 50) {
                c1112240f38LIZJ.LJII = 50;
            }
            if (c1112240f38LIZJ.LJIIIIZZ > 63) {
                c1112240f38LIZJ.LJIIIIZZ = 63;
            }
            if (c1112240f38LIZJ.LJIIIZ > 15) {
                c1112240f38LIZJ.LJIIIZ = 15;
            }
            if (c1112240f38LIZJ.LJIIJ > 255) {
                c1112240f38LIZJ.LJIIJ = 255;
            }
            return j | (((long) c1112240f38LIZJ.LJI) << 6) | (((long) c1112240f38LIZJ.LJII) << 12) | (((long) c1112240f38LIZJ.LJIIIIZZ) << 18) | (((long) c1112240f38LIZJ.LJIIIZ) << 24) | (((long) c1112240f38LIZJ.LJIIJ) << 28);
        }
        return -1L;
    }

    public static C1112240f38 LIZJ(AbstractC1110790f0n abstractC1110790f0n) {
        C1142400fpm c1142400fpmLJ;
        boolean z;
        boolean z2;
        boolean zIsSubscribed;
        boolean z3;
        int i;
        int i2;
        PublicAreaMessageCommon.UserInteractionInfo userInteractionInfo;
        PublicAreaMessageCommon.UserInteractionInfo userInteractionInfo2;
        PublicAreaMessageCommon.UserInteractionInfo userInteractionInfo3;
        FollowInfo followInfo;
        FollowInfo followInfo2;
        FollowInfo followInfo3;
        Long lValueOf = null;
        if (!(abstractC1110790f0n instanceof C1110310f01) && !(abstractC1110790f0n instanceof C1111000f18) && !(abstractC1110790f0n instanceof C234500vP) && !(abstractC1110790f0n instanceof C180400mg) && !(abstractC1110790f0n instanceof C245000x6) && !(abstractC1110790f0n instanceof C239500wD)) {
            return null;
        }
        User user = abstractC1110790f0n.getUser();
        PublicAreaMessageCommon publicAreaMessageCommonLLIIII = abstractC1110790f0n.LLIIII();
        if (user == null && publicAreaMessageCommonLLIIII == null) {
            return null;
        }
        boolean z4 = true;
        int i3 = 0;
        if (abstractC1110790f0n.LJIILIIL != null) {
            c1142400fpmLJ = C1136820fgm.LJ(abstractC1110790f0n.LLIIIILZ().LJIIIZ);
        } else {
            c1142400fpmLJ = null;
        }
        C1112240f38 c1112240f38 = new C1112240f38();
        if (user != null && (followInfo3 = user.getFollowInfo()) != null && followInfo3.getFollowStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        c1112240f38.LIZ = z;
        if (user != null && (followInfo2 = user.getFollowInfo()) != null && followInfo2.getFollowStatus() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1112240f38.LIZIZ = z2;
        if (user == null || (followInfo = user.getFollowInfo()) == null || followInfo.getFollowStatus() != 3) {
            z4 = false;
        }
        c1112240f38.LIZJ = z4;
        if (user != null) {
            zIsSubscribed = user.isSubscribed();
        } else {
            zIsSubscribed = false;
        }
        c1112240f38.LIZLLL = zIsSubscribed;
        Set<Long> set = LIZ;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        }
        c1112240f38.LJ = C13LP.LJJJJ(lValueOf, set);
        AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) abstractC1110790f0n;
        UserIdentity userIdentityLLJJJJLIIL = abstractC1110800f0o.LLJJJJLIIL();
        if (userIdentityLLJJJJLIIL != null) {
            z3 = userIdentityLLJJJJLIIL.isGiftGiverOfAnchor;
        } else {
            z3 = false;
        }
        c1112240f38.LJFF = z3;
        c1112240f38.LJI = LIZ(user, 10, c1142400fpmLJ);
        c1112240f38.LJII = LIZ(user, 8, c1142400fpmLJ);
        if (publicAreaMessageCommonLLIIII != null && (userInteractionInfo3 = publicAreaMessageCommonLLIIII.userInteractionInfo) != null) {
            i = (int) userInteractionInfo3.commentCnt;
        } else {
            i = 0;
        }
        c1112240f38.LJIIIIZZ = i;
        if (publicAreaMessageCommonLLIIII != null && (userInteractionInfo2 = publicAreaMessageCommonLLIIII.userInteractionInfo) != null) {
            i2 = (int) userInteractionInfo2.shareCnt;
        } else {
            i2 = 0;
        }
        c1112240f38.LJIIIZ = i2;
        if (publicAreaMessageCommonLLIIII != null && (userInteractionInfo = publicAreaMessageCommonLLIIII.userInteractionInfo) != null) {
            i3 = (int) userInteractionInfo.likeCnt;
        }
        c1112240f38.LJIIJ = i3;
        c1112240f38.LJIIJJI = (int) (abstractC1110800f0o.getPriority() & 999999);
        return c1112240f38;
    }

    public static int LIZ(User user, int i, C1142400fpm c1142400fpm) {
        List<BadgeStruct> badgeList;
        PrivilegeLogExtra privilegeLogExtra;
        String str;
        Integer numLJJLIIJ;
        if ((c1142400fpm == null || (badgeList = c1142400fpm.LJII(user, null)) == null) && (user == null || (badgeList = user.getBadgeList()) == null || !(!badgeList.isEmpty()))) {
            badgeList = null;
        }
        if (badgeList == null || badgeList.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (BadgeStruct badgeStruct : badgeList) {
            BadgeStruct badgeStruct2 = badgeStruct;
            if (badgeStruct2 != null && badgeStruct2.badgeScene == i && badgeStruct2.logExtra != null) {
                arrayList.add(badgeStruct);
            }
        }
        BadgeStruct badgeStruct3 = (BadgeStruct) C13LP.LJJJLL(arrayList);
        if (badgeStruct3 == null || (privilegeLogExtra = badgeStruct3.logExtra) == null || (str = privilegeLogExtra.level) == null || (numLJJLIIJ = C500260Jjc.LJJLIIJ(str)) == null) {
            return 0;
        }
        return numLJJLIIJ.intValue();
    }
}
