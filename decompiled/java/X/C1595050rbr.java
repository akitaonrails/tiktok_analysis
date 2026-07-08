package X;

import android.content.Context;
import com.ss.android.ugc.aweme.experiment.FollowingSkylightAbilityExperienceExp;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.model.SkylightFollowingUserItem;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595050rbr {
    public static int LIZJ(InterfaceC1595030rbp interfaceC1595030rbp) {
        T t;
        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcCLJIJI = interfaceC1595030rbp.LJIJI();
        if (c1595260rcCLJIJI != null && (t = c1595260rcCLJIJI.LIZIZ) != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : t) {
                if (obj instanceof SkylightFollowingUserItem) {
                    arrayList.add(obj);
                }
            }
            return arrayList.size();
        }
        return 0;
    }

    public static int LIZLLL(InterfaceC1595030rbp interfaceC1595030rbp) {
        T t;
        Integer num;
        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcCLJIJI = interfaceC1595030rbp.LJIJI();
        if (c1595260rcCLJIJI == null || (t = c1595260rcCLJIJI.LIZIZ) == 0) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : t) {
            if (obj instanceof SkylightFollowingUserItem) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            SkylightFollowingUserRedDot skylightFollowingUserRedDot = ((SkylightFollowingUserItem) obj2).redDot;
            if (skylightFollowingUserRedDot != null && (num = skylightFollowingUserRedDot.status) != null && num.intValue() == 1) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2.size();
    }

    public static int LJ(InterfaceC1595030rbp interfaceC1595030rbp) {
        T t;
        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcCLJIJI = interfaceC1595030rbp.LJIJI();
        if (c1595260rcCLJIJI != null && (t = c1595260rcCLJIJI.LIZIZ) != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : t) {
                if (obj instanceof InterfaceC1595940rdI) {
                    arrayList.add(obj);
                }
            }
            return arrayList.size();
        }
        return 0;
    }

    public static int LJFF(InterfaceC1595030rbp interfaceC1595030rbp) {
        T t;
        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcCLJIJI = interfaceC1595030rbp.LJIJI();
        if (c1595260rcCLJIJI == null || (t = c1595260rcCLJIJI.LIZIZ) == 0) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : t) {
            if (obj instanceof C1596360rdy) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C1596360rdy c1596360rdy = (C1596360rdy) obj2;
            UserStory userStory = c1596360rdy.LLILLJJLI.getUserStory();
            if (userStory == null || !userStory.getAllViewed()) {
                if (!C729510SjV.LJJII(c1596360rdy.LLILLJJLI)) {
                    arrayList2.add(obj2);
                }
            }
        }
        return arrayList2.size();
    }

    public static int LJI(InterfaceC1595030rbp interfaceC1595030rbp) {
        T t;
        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcCLJIJI = interfaceC1595030rbp.LJIJI();
        if (c1595260rcCLJIJI != null && (t = c1595260rcCLJIJI.LIZIZ) != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : t) {
                if (obj instanceof C1596360rdy) {
                    arrayList.add(obj);
                }
            }
            return arrayList.size();
        }
        return 0;
    }

    public static int LIZ(InterfaceC1595030rbp interfaceC1595030rbp, String str) {
        T t;
        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcCLJIJI = interfaceC1595030rbp.LJIJI();
        if (c1595260rcCLJIJI != null && (t = c1595260rcCLJIJI.LIZIZ) != 0) {
            int i = 0;
            for (Object obj : t) {
                int i2 = i + 1;
                String uid = null;
                if (i >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
                    if (interfaceC1891350zJl instanceof SkylightFollowingUserItem) {
                        User user = ((SkylightFollowingUserItem) interfaceC1891350zJl).followingUser;
                        if (user != null) {
                            uid = user.getUid();
                        }
                        if (Intrinsics.LJFF(uid, str)) {
                            return i;
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return -1;
        }
        return -1;
    }

    public static String LIZIZ(InterfaceC1595030rbp interfaceC1595030rbp, Context context, boolean z) {
        int iLJII = interfaceC1595030rbp.LJII();
        int iLJ = interfaceC1595030rbp.LJ();
        int iLIZJ = interfaceC1595030rbp.LIZJ();
        int i = iLJII + iLJ + iLIZJ;
        if (iLJII <= 0 && iLJ <= 0 && iLIZJ <= 0) {
            return context.getString(2131838821);
        }
        if (z) {
            return context.getResources().getString(2131838822, Integer.valueOf(i));
        }
        if (FollowingSkylightAbilityExperienceExp.LIZIZ()) {
            if (!interfaceC1595030rbp.LJIILL()) {
                return context.getResources().getString(2131838822, Integer.valueOf(i));
            }
            return context.getResources().getQuantityString(2131755449, i, Integer.valueOf(i));
        }
        return context.getResources().getQuantityString(2131755449, i, Integer.valueOf(i));
    }
}
