package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799090VWh extends C09AY implements Function0<C0W92> {
    public C799090VWh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0W92] */
    @Override // kotlin.jvm.functions.Function0
    public final C0W92 invoke() {
        return new InterfaceC799110VWj() { // from class: X.0W92
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC799110VWj
            public final String LIZ(String str) {
                switch (str.hashCode()) {
                    case -2050191939:
                        if (str.equals("detail_page")) {
                            return "jank_feed_detail";
                        }
                        break;
                    case -1849961962:
                        if (str.equals("my_profile")) {
                            return "jank_personal_profile";
                        }
                        break;
                    case -1731750228:
                        if (str.equals("single_song")) {
                            return "jank_music_detail";
                        }
                        break;
                    case -1617968008:
                        if (str.equals("video_play")) {
                            return "jank_video_play";
                        }
                        break;
                    case -1286318634:
                        if (str.equals("message_list")) {
                            return "jank_message";
                        }
                        break;
                    case -1271119582:
                        if (str.equals("homepage_follow")) {
                            return "jank_follow";
                        }
                        break;
                    case -790819753:
                        if (str.equals("profile_output")) {
                            return "jank_other_profile";
                        }
                        break;
                    case -667094460:
                        if (str.equals("homepage_friends")) {
                            return "jank_friends";
                        }
                        break;
                    case -321984987:
                        if (str.equals("search_mix_feed_list")) {
                            return "jank_search_mix_feed_list";
                        }
                        break;
                    case 795385470:
                        if (str.equals("comment_list")) {
                            return "jank_comment";
                        }
                        break;
                    case 1691937916:
                        if (str.equals("homepage_hot")) {
                            C1602860roS.LIZ.getClass();
                            if (C1602860roS.LJ()) {
                                return "jank_homepage_hot_newuser";
                            }
                            return "jank_homepage_hot_olduser";
                        }
                        break;
                    case 1841470632:
                        if (str.equals("inbox_page")) {
                            return "jank_inbox";
                        }
                        break;
                    case 1962912707:
                        if (str.equals("system_launch")) {
                            return "jank_system_launch";
                        }
                        break;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("jank_others_");
                sbLIZ.append(str);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
    }
}
