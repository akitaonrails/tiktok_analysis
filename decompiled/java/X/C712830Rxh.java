package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712830Rxh {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LIZ(String str, String str2, String str3) {
        if (Intrinsics.LJFF(str, "homepage_friends") && !Intrinsics.LJFF(str2, "top_cell")) {
            if (str3 == null) {
                return "";
            }
            return str3;
        }
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -2034992411:
                    if (str2.equals("story_card_head")) {
                        return "social_story_avatar";
                    }
                    break;
                case -1884159807:
                    if (str2.equals("recommend_panel")) {
                        return "social_story_avatar";
                    }
                    break;
                case -1574554543:
                    if (str2.equals("story_card_bubble")) {
                        return "social_story_avatar";
                    }
                    break;
                case 3198432:
                    if (str2.equals("head")) {
                        return "social_story_avatar";
                    }
                    break;
                case 2059199895:
                    if (str2.equals("interaction_panel")) {
                        return "social_story_avatar";
                    }
                    break;
            }
        }
        if (Intrinsics.LJFF(str2, "top_cell")) {
            return "social_story_top_cell";
        }
        if (Intrinsics.LJFF(str, "homepage_hot") && Intrinsics.LJFF(str2, "story_card")) {
            return "social_story_card";
        }
        return "social_story_detail";
    }
}
