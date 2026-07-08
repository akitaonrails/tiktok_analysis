package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeBackground;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.00Uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C087800Uq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC2262081DgM interfaceC2262081DgM) {
        User user;
        List<BadgeStruct> badgeList;
        if ((interfaceC2262081DgM instanceof User) && (user = (User) interfaceC2262081DgM) != null && (badgeList = user.getBadgeList()) != null) {
            Iterator<BadgeStruct> it2 = badgeList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (it2.next().badgeScene == 10) {
                    if (i >= 0) {
                        ListProtector.remove(badgeList, i);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    public static User LIZIZ(int i, BadgeStruct badgeStruct, User user) {
        User.EnigmaInfo enigmaInfo;
        List<BadgeStruct> list;
        CombineBadgeStruct combineBadgeStruct;
        CombineBadgeBackground combineBadgeBackground;
        CombineBadgeStruct combineBadgeStruct2;
        if (badgeStruct == null || ((enigmaInfo = user.enigmaInfo) != null && enigmaInfo.isEnigmaMaskOn)) {
            return user;
        }
        List<BadgeStruct> badgeList = user.getBadgeList();
        if (badgeList != null && !badgeList.isEmpty()) {
            int size = badgeList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                BadgeStruct badgeStruct2 = (BadgeStruct) ListProtector.get(badgeList, i2);
                if (badgeStruct2 != null && badgeStruct2.badgeScene == i) {
                    if (i2 >= 0) {
                        BadgeStruct badgeStruct3 = (BadgeStruct) ListProtector.get(badgeList, i2);
                        CombineBadgeBackground combineBadgeBackground2 = null;
                        if (badgeStruct3 != null && (combineBadgeStruct = badgeStruct3.combineBadgeStruct) != null && (combineBadgeBackground = combineBadgeStruct.background) != null && combineBadgeBackground.stretchableBackgroundImage != null && (combineBadgeStruct2 = badgeStruct.combineBadgeStruct) != null) {
                            CombineBadgeStruct combineBadgeStruct3 = badgeStruct3.combineBadgeStruct;
                            if (combineBadgeStruct3 != null) {
                                combineBadgeBackground2 = combineBadgeStruct3.background;
                            }
                            combineBadgeStruct2.background = combineBadgeBackground2;
                        }
                        ListProtector.set(badgeList, i2, badgeStruct);
                        list = badgeList;
                    }
                } else {
                    i2++;
                }
            }
            badgeList.add(badgeStruct);
            list = badgeList;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(badgeStruct);
            list = arrayList;
        }
        user.setBadgeList(list);
        return user;
    }
}
