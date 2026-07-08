package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600750rl3 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final AbstractC1569120qw2 LIZ(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1834114051:
                if (!str.equals("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW")) {
                    return null;
                }
                return C1569140qw4.LIZIZ;
            case -796330400:
                if (!str.equals("STORY_ENTRANCE_INBOX_TOP_LIST")) {
                    return null;
                }
                return C1569160qw6.LIZIZ;
            case 417626225:
                if (!str.equals("STORY_ENTRANCE_FRIENDS_TOP_LIST")) {
                    return null;
                }
                return C1569150qw5.LIZIZ;
            case 615467145:
                if (!str.equals("STORY_ENTRANCE_FYP_TOP_LIST")) {
                    return null;
                }
                return C1569130qw3.LIZIZ;
            case 1866617170:
                if (!str.equals("STORY_ENTRANCE_GUIDE_CARD")) {
                    return null;
                }
                return C1569170qw7.LIZIZ;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LIZIZ(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1834114051:
                    str.equals("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW");
                    return "undefine";
                case -796330400:
                    if (str.equals("STORY_ENTRANCE_INBOX_TOP_LIST")) {
                        return "notification_page";
                    }
                    break;
                case 417626225:
                    if (str.equals("STORY_ENTRANCE_FRIENDS_TOP_LIST")) {
                        return "homepage_friends";
                    }
                    break;
                case 615467145:
                    if (str.equals("STORY_ENTRANCE_FYP_TOP_LIST")) {
                        return "homepage_hot";
                    }
                    break;
            }
        }
        return "undefine";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int LIZJ(String str) {
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1834114051:
                if (!str.equals("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW")) {
                    return 0;
                }
                return 3;
            case -796330400:
                if (!str.equals("STORY_ENTRANCE_INBOX_TOP_LIST")) {
                    return 0;
                }
                return 1;
            case 417626225:
                if (!str.equals("STORY_ENTRANCE_FRIENDS_TOP_LIST")) {
                    return 0;
                }
                return 2;
            case 615467145:
                if (!str.equals("STORY_ENTRANCE_FYP_TOP_LIST")) {
                    return 0;
                }
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean LIZLLL(String str) {
        if (str == null) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "STORY_ENTRANCE_MINE") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_OTHER") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_AVATAR")) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(String str) {
        if (str == null) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "STORY_ENTRANCE_INBOX_TOP_LIST") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_FRIENDS_TOP_LIST") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_GUIDE_CARD") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_FYP_TOP_LIST") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_INBOX_GROUP_CHAT") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_HIGHLIGHTS") && (!Intrinsics.LJFF(str, "STORY_ENTRANCE_ARCHIVE") || !C1189504l3.LIZ())) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(String str) {
        if (!LJ(str) && !Intrinsics.LJFF(str, "STORY_ENTRANCE_MINE") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_OTHER") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_AVATAR") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_ARCHIVE") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_PREVIEW") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_DEFAULT") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_COMMON") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_WIDGET") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_GUIDE_CARD") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_OUT_PUSH") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_INNER_PUSH") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_NOTE") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_CELEBRATION") && !Intrinsics.LJFF(str, "STORY_ENTRANCE_MUSIC_COVER_AVATAR")) {
            return false;
        }
        return true;
    }
}
