package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes36.dex */
public final class GuestShowDownConfig_OptTypeAdapter extends TypeAdapter<GuestShowDownConfig> {
    public final Gson LIZ;

    public GuestShowDownConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final GuestShowDownConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("winner", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/mg_rank_winner.png~0x0.png");
        linkedHashMap.put("loser", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/mg_rank_loser.png~0x0.png");
        linkedHashMap.put("loser_phase1", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/multi_guest_guest_showdown_panel_emoji_1@3x.png~0x0.png");
        linkedHashMap.put("loser_phase2", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/multi_guest_guest_showdown_panel_emoji_2@3x.png~0x0.png");
        linkedHashMap.put("loser_phase3", "https://p16-webcast-row-useast5.tiktokcdn-us.com/img/webcast-sg/multi_guest_guest_showdown_panel_emoji_3@3x.png~0x0.png");
        GuestShowDownConfig guestShowDownConfig = new GuestShowDownConfig("sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Fguest-showdown-faq%2Ftemplate.js&height=70%25&gravity=bottom&radius=12&landscape_height=100%25&landscape_width=390&gecko_url_redirection=1&use_forest=1&bdhm_bid=tiktok_live_interaction_multi_guest", 1, 0, 1, 9, 600L, 59940L, 7, linkedHashMap);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2094259758:
                        if (strLJJJJ.equals("default_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guestShowDownConfig.defaultDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1913364412:
                        if (strLJJJJ.equals("default_winner_num")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guestShowDownConfig.defaultWinnerNum = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1023968542:
                        if (strLJJJJ.equals("default_max_position")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guestShowDownConfig.defaultMaxPosition = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -822641411:
                        if (strLJJJJ.equals("tech_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guestShowDownConfig.techSwitch = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -381229475:
                        if (strLJJJJ.equals("dialog_icon_url_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guestShowDownConfig.dialogIconUrlMap = C473040Igo.LIZIZ(this.LIZ, c09cu, String.class);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -360605530:
                        if (strLJJJJ.equals("FAQ_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guestShowDownConfig.faqUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -129440983:
                        if (strLJJJJ.equals("max_loser_num")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guestShowDownConfig.maxLoserNum = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1355637702:
                        if (strLJJJJ.equals("default_loser_num")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guestShowDownConfig.defaultLoserNum = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1549029701:
                        if (strLJJJJ.equals("max_punishment_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                guestShowDownConfig.maxPunishmentDuration = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return guestShowDownConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, GuestShowDownConfig guestShowDownConfig) throws IOException {
        GuestShowDownConfig guestShowDownConfig2 = guestShowDownConfig;
        if (guestShowDownConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("FAQ_url");
        c09dl.LJJJJJ(guestShowDownConfig2.faqUrl);
        c09dl.LJIILLIIL("tech_switch");
        c09dl.LJJJJ(Integer.valueOf(guestShowDownConfig2.techSwitch));
        c09dl.LJIILLIIL("default_loser_num");
        c09dl.LJJJJ(Integer.valueOf(guestShowDownConfig2.defaultLoserNum));
        c09dl.LJIILLIIL("default_winner_num");
        c09dl.LJJJJ(Integer.valueOf(guestShowDownConfig2.defaultWinnerNum));
        c09dl.LJIILLIIL("default_max_position");
        c09dl.LJJJJ(Integer.valueOf(guestShowDownConfig2.defaultMaxPosition));
        c09dl.LJIILLIIL("default_duration");
        c09dl.LJJIZ(guestShowDownConfig2.defaultDuration);
        c09dl.LJIILLIIL("max_punishment_duration");
        c09dl.LJJIZ(guestShowDownConfig2.maxPunishmentDuration);
        c09dl.LJIILLIIL("max_loser_num");
        c09dl.LJJJJ(Integer.valueOf(guestShowDownConfig2.maxLoserNum));
        c09dl.LJIILLIIL("dialog_icon_url_map");
        C473040Igo.LJ(this.LIZ, c09dl, guestShowDownConfig2.dialogIconUrlMap, String.class);
        c09dl.LJII();
    }
}
