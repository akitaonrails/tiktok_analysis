package X;

import com.ss.android.ugc.aweme.relation.experiment.Config;

/* JADX INFO: renamed from: X.0if7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251110if7 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ() {
        Boolean bool;
        Config config = (Config) C1251140ifA.LIZIZ.getValue();
        return config == null || config.recommendFriendsInOthersSuggestedList != 1 || ((bool = C1251130if9.LIZ().disableOthersHomePageSuggestedList) != null && bool.booleanValue());
    }

    public static boolean LIZLLL() {
        Config config = (Config) C1251140ifA.LIZIZ.getValue();
        if (config == null || config.recommendFriendsInSelfFollowingList != 1) {
            return true;
        }
        Boolean bool = C1251130if9.LIZ().disablePersonalHomePageFollowing;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        C1250800iec.LIZ.getClass();
        return C1250800iec.LIZIZ(C1250800iec.LIZ().disableHomepageFollowing);
    }

    public static boolean LIZ() {
        Boolean bool = C1251130if9.LIZ().disableInboxActivities;
        if (bool == null || !bool.booleanValue()) {
            C1250800iec.LIZ.getClass();
            if (!C1250800iec.LIZIZ(C1250800iec.LIZ().disableInboxActivities)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ() {
        Boolean bool = C1251130if9.LIZ().disableInboxFirstPage;
        if (bool == null || !bool.booleanValue()) {
            C1250800iec.LIZ.getClass();
            if (!C1250800iec.LIZIZ(C1250800iec.LIZ().disableInboxFirstPage)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJ() {
        Boolean bool = C1251130if9.LIZ().disablePersonalHomePageFriends;
        if (bool == null || !bool.booleanValue()) {
            C1250800iec.LIZ.getClass();
            if (!C1250800iec.LIZIZ(C1250800iec.LIZ().disableHomepageFriends)) {
                return false;
            }
        }
        return true;
    }
}
