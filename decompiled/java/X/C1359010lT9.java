package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359010lT9 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1359020lTA LIZ(C2189821An6 c2189821An6) {
        boolean z;
        if (c2189821An6 == null) {
            return EnumC1359020lTA.OTHERS;
        }
        Integer upvoteScene = c2189821An6.getUpvoteScene();
        if (upvoteScene != null && EnumC1359020lTA.OUT_APP_PUSH_UPVOTE_POST.getValue() == upvoteScene.intValue()) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            c2189821An6.setUpvoteScene(null);
            return EnumC1359020lTA.OUT_APP_PUSH_UPVOTE_POST;
        }
        String eventType = c2189821An6.getEventType();
        if (eventType != null) {
            switch (eventType.hashCode()) {
                case -1572049565:
                    if (eventType.equals("notification_page")) {
                        HashMap<String, String> inboxLogExtra = c2189821An6.getInboxLogExtra();
                        if (inboxLogExtra != null) {
                            str = inboxLogExtra.get("notice_message_type");
                        }
                        if (Intrinsics.LJFF(str, "261")) {
                            return EnumC1359020lTA.NOTICE_LIKE_THE_VIDEO_YOU_UPVOTE;
                        }
                        return EnumC1359020lTA.NOTICE;
                    }
                    break;
                case -1271119582:
                    if (eventType.equals("homepage_follow")) {
                        return EnumC1359020lTA.FOLLOWING_FEED;
                    }
                    break;
                case -1051643920:
                    if (eventType.equals("homepage_nearby")) {
                        return EnumC1359020lTA.NEARBY_FEED;
                    }
                    break;
                case -667094460:
                    if (eventType.equals("homepage_friends")) {
                        return EnumC1359020lTA.FRIENDS_FEED;
                    }
                    break;
                case -562830579:
                    if (eventType.equals("personal_homepage")) {
                        if (Intrinsics.LJFF(c2189821An6.getFrom(), "REPOSTED_LIST_ENTRANCE")) {
                            return EnumC1359020lTA.MY_UPVOTE_TAB;
                        }
                        return EnumC1359020lTA.MY_PROFILE;
                    }
                    break;
                case 3052376:
                    if (eventType.equals("chat")) {
                        return EnumC1359020lTA.IM_CHAT;
                    }
                    break;
                case 809483594:
                    if (eventType.equals("others_homepage")) {
                        if (Intrinsics.LJFF(c2189821An6.getFrom(), "REPOSTED_LIST_ENTRANCE")) {
                            return EnumC1359020lTA.OTHERS_UPVOTE_TAB;
                        }
                        return EnumC1359020lTA.OTHERS_PROFILE;
                    }
                    break;
                case 1691937916:
                    if (eventType.equals("homepage_hot")) {
                        return EnumC1359020lTA.FOR_YOU_FEED;
                    }
                    break;
            }
        }
        return EnumC1359020lTA.OTHERS;
    }
}
