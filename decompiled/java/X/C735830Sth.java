package X;

/* JADX INFO: renamed from: X.0Sth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735830Sth {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZ(String str, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1271119582:
                    if (str.equals("homepage_follow")) {
                        if (z2) {
                            return 2627;
                        }
                        return 27;
                    }
                    break;
                case -1051643920:
                    if (str.equals("homepage_nearby")) {
                        if (z2) {
                            return 2615;
                        }
                        return 15;
                    }
                    break;
                case -667094460:
                    if (str.equals("homepage_friends")) {
                        if (z2) {
                            return 2630;
                        }
                        if (z) {
                            return 2030;
                        }
                        return 30;
                    }
                    break;
                case -562830579:
                    if (str.equals("personal_homepage")) {
                        if (z2) {
                            return 2631;
                        }
                        return 31;
                    }
                    break;
                case -196922769:
                    if (!str.equals("share_user_info_popup")) {
                        return 0;
                    }
                    return 21;
                case -182649969:
                    if (str.equals("other_fans")) {
                        if (z3) {
                            return 1114;
                        }
                        return 11;
                    }
                    break;
                case -6753043:
                    if (!str.equals("share_user_info_card")) {
                        return 0;
                    }
                    return 21;
                case 3135424:
                    if (str.equals("fans")) {
                        if (z3) {
                            return 914;
                        }
                        return 9;
                    }
                    break;
                case 3524221:
                    if (str.equals("scan")) {
                        return 17;
                    }
                    break;
                case 109400031:
                    if (!str.equals("share")) {
                        return 0;
                    }
                    return 21;
                case 640525578:
                    if (str.equals("repost_feed")) {
                        if (z2) {
                            return 2642;
                        }
                        return 42;
                    }
                    break;
                case 673697727:
                    if (str.equals("find_friends_page")) {
                        return 3;
                    }
                    break;
                case 809483594:
                    if (str.equals("others_homepage")) {
                        if (z2) {
                            return 2619;
                        }
                        return 19;
                    }
                    break;
                case 998835423:
                    if (!str.equals("general_search")) {
                        return 0;
                    }
                    return 14;
                case 1425879700:
                    if (!str.equals("search_result")) {
                        return 0;
                    }
                    return 14;
                case 1605556258:
                    if (str.equals("other_following")) {
                        if (z3) {
                            return 1014;
                        }
                        return 10;
                    }
                    break;
                case 1691937916:
                    if (str.equals("homepage_hot")) {
                        if (z2) {
                            return 2613;
                        }
                        if (z) {
                            return 2013;
                        }
                        return 13;
                    }
                    break;
                case 1989451056:
                    if (str.equals("share_profile_link")) {
                        return 50;
                    }
                    break;
            }
        }
        return 0;
    }
}
