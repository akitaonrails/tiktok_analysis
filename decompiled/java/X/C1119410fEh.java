package X;

import com.bytedance.android.live.rank.impl.sticker.classrank.ClassRankStickerModel;
import com.bytedance.android.live.rank.impl.sticker.daily.DailyRankStickerModelChannel;
import com.bytedance.android.live.rank.impl.sticker.game.GameDailyRankStickerModel;
import com.bytedance.android.live.rank.impl.sticker.hourly.HourlyRankStickerModelChannel;
import com.bytedance.android.live.rank.impl.sticker.team.TeamRankStickerModelChannel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119410fEh {
    public static String LIZ = "";
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static String LJ = "";

    public static final Map<String, String> LIZIZ(RankTypeV2 rankTypeV2, C1119420fEi c1119420fEi, C1119420fEi c1119420fEi2) {
        C1119420fEi c1119420fEi3;
        int i;
        boolean z;
        long jLIZJ;
        long j;
        if (c1119420fEi == null) {
            c1119420fEi3 = c1119420fEi2;
        } else {
            c1119420fEi3 = c1119420fEi;
        }
        C1846810y9v c1846810y9v = c1119420fEi3.LJIIIIZZ;
        if (c1846810y9v != null && c1846810y9v.LIZ == 2) {
            i = 1;
        } else {
            i = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if ((Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIL) && C463680IGg.LIZ > 0) || !Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI)) {
            z = true;
        } else {
            z = false;
        }
        String str = c1119420fEi2.LIZ.rankName;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("rank_type", str);
        if (i > 0) {
            jLIZJ = 0;
        } else {
            jLIZJ = c1119420fEi2.LIZLLL - C158B.LIZJ();
        }
        linkedHashMap.put("end_time_diff", String.valueOf(jLIZJ));
        if (z) {
            if (c1119420fEi != null) {
                j = c1119420fEi.LJII;
            } else {
                j = c1119420fEi2.LIZIZ;
            }
            if (1 > j || j >= 100) {
                j = 0;
            }
            linkedHashMap.put("anchor_rank", String.valueOf(j));
            linkedHashMap.put("is_final_result", String.valueOf(i));
        } else {
            long j2 = c1119420fEi2.LIZIZ;
            if (1 > j2 || j2 >= 100) {
                j2 = 0;
            }
            linkedHashMap.put("anchor_rank", String.valueOf(j2));
            String str3 = c1119420fEi2.LJIIL;
            if (str3 != null) {
                str2 = str3;
            }
            linkedHashMap.put("comparison_rank", str2);
            linkedHashMap.put("score_diff", String.valueOf(c1119420fEi2.LJIILJJIL));
        }
        if (c1119420fEi == null) {
            c1119420fEi = c1119420fEi2;
        }
        Map<String, String> map = c1119420fEi.LJIIJ;
        if (map != null && (!map.isEmpty())) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public static final void LIZJ(C474500IjA c474500IjA, DataChannel dataChannel, RankTypeV2 rankTypeV2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String strLJJJJJL;
        int i6;
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIIL)) {
            if (dataChannel != null) {
                C1119420fEi c1119420fEi = (C1119420fEi) dataChannel.gg0(DailyRankStickerModelChannel.class);
                if (c1119420fEi != null) {
                    c474500IjA.LJJII(c1119420fEi.LIZ.rankName, "rank_type");
                    long j = c1119420fEi.LIZIZ;
                    if (1 <= j && j < 100) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    c474500IjA.LJJII(Integer.valueOf(i6), "is_daily_onrank");
                    long j2 = c1119420fEi.LIZIZ;
                    if (1 > j2 || j2 >= 100) {
                        j2 = 0;
                    }
                    c474500IjA.LJJII(Long.valueOf(j2), "rank_in_daily");
                    long j3 = c1119420fEi.LIZIZ;
                    if (1 > j3 || j3 >= 100) {
                        j3 = 0;
                    }
                    c474500IjA.LJJII(Long.valueOf(j3), "anchor_rank");
                }
                strLJJJJJL = C500260Jjc.LJJJJJL(dataChannel);
            }
            strLJJJJJL = null;
        } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI)) {
            if (dataChannel != null) {
                C1119430fEj c1119430fEj = (C1119430fEj) dataChannel.gg0(TeamRankStickerModelChannel.class);
                if (c1119430fEj != null) {
                    c474500IjA.LJJII(c1119430fEj.LIZ.rankName, "rank_type");
                    long j4 = c1119430fEj.LJIILL;
                    long j5 = c1119430fEj.LJIILLIIL;
                    long jLIZJ = C158B.LIZJ();
                    if (j4 <= jLIZJ && jLIZJ < j5) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    c474500IjA.LJJII(Integer.valueOf(i4), "is_bonus_time");
                    long j6 = c1119430fEj.LIZIZ;
                    if (1 <= j6 && j6 < 100) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    c474500IjA.LJJII(Integer.valueOf(i5), "is_daily_onrank");
                    long j7 = c1119430fEj.LIZIZ;
                    if (1 > j7 || j7 >= 100) {
                        j7 = 0;
                    }
                    c474500IjA.LJJII(Long.valueOf(j7), "rank_in_daily");
                    long j8 = c1119430fEj.LIZIZ;
                    if (1 > j8 || j8 >= 100) {
                        j8 = 0;
                    }
                    c474500IjA.LJJII(Long.valueOf(j8), "anchor_rank");
                }
                strLJJJJJL = C500260Jjc.LJJJJJL(dataChannel);
            }
            strLJJJJJL = null;
        } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LIZ)) {
            if (dataChannel != null) {
                C1119420fEi c1119420fEi2 = (C1119420fEi) dataChannel.gg0(HourlyRankStickerModelChannel.class);
                if (c1119420fEi2 != null) {
                    c474500IjA.LJJII(c1119420fEi2.LIZ.rankName, "rank_type");
                    long j9 = c1119420fEi2.LIZIZ;
                    if (1 <= j9 && j9 < 100) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    c474500IjA.LJJII(Integer.valueOf(i3), "is_daily_onrank");
                    long j10 = c1119420fEi2.LIZIZ;
                    if (1 > j10 || j10 >= 100) {
                        j10 = 0;
                    }
                    c474500IjA.LJJII(Long.valueOf(j10), "rank_in_daily");
                    long j11 = c1119420fEi2.LIZIZ;
                    if (1 > j11 || j11 >= 100) {
                        j11 = 0;
                    }
                    c474500IjA.LJJII(Long.valueOf(j11), "anchor_rank");
                }
                strLJJJJJL = C500260Jjc.LJJJJJL(dataChannel);
            }
            strLJJJJJL = null;
        } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIILJJIL)) {
            if (dataChannel != null) {
                C1119420fEi c1119420fEi3 = (C1119420fEi) dataChannel.gg0(GameDailyRankStickerModel.class);
                if (c1119420fEi3 != null) {
                    c474500IjA.LJJII(c1119420fEi3.LIZ.rankName, "rank_type");
                    long j12 = c1119420fEi3.LIZIZ;
                    if (1 <= j12 && j12 < 100) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    c474500IjA.LJJII(Integer.valueOf(i2), "is_daily_onrank");
                    long j13 = c1119420fEi3.LIZIZ;
                    if (1 > j13 || j13 >= 100) {
                        j13 = 0;
                    }
                    c474500IjA.LJJII(Long.valueOf(j13), "rank_in_daily");
                    long j14 = c1119420fEi3.LIZIZ;
                    if (1 > j14 || j14 >= 100) {
                        j14 = 0;
                    }
                    c474500IjA.LJJII(Long.valueOf(j14), "anchor_rank");
                }
                strLJJJJJL = C500260Jjc.LJJJJJL(dataChannel);
            }
            strLJJJJJL = null;
        } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIL)) {
            if (dataChannel != null) {
                C1119420fEi c1119420fEi4 = (C1119420fEi) dataChannel.gg0(ClassRankStickerModel.class);
                if (c1119420fEi4 != null) {
                    c474500IjA.LJJII(c1119420fEi4.LIZ.rankName, "rank_type");
                    long j15 = c1119420fEi4.LIZIZ;
                    if (1 <= j15 && j15 < 100) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c474500IjA.LJJII(Integer.valueOf(i), "is_daily_onrank");
                    long j16 = c1119420fEi4.LIZIZ;
                    if (1 > j16 || j16 >= 100) {
                        j16 = 0;
                    }
                    c474500IjA.LJJII(Long.valueOf(j16), "rank_in_daily");
                    long j17 = c1119420fEi4.LIZIZ;
                    if (1 > j17 || j17 >= 100) {
                        j17 = 0;
                    }
                    c474500IjA.LJJII(Long.valueOf(j17), "anchor_rank");
                }
                strLJJJJJL = C500260Jjc.LJJJJJL(dataChannel);
            }
            strLJJJJJL = null;
        } else if (dataChannel != null) {
            strLJJJJJL = C500260Jjc.LJJJJJL(dataChannel);
        } else {
            strLJJJJJL = null;
        }
        c474500IjA.LJJII(strLJJJJJL, "live_type");
    }

    public static final void LIZ(C474500IjA c474500IjA, DataChannel dataChannel, RankTypeV2 rankTypeV2, C1119420fEi c1119420fEi) {
        C1119420fEi c1119420fEi2;
        C1119420fEi c1119420fEi3;
        long j;
        int i;
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIIL)) {
            C1119420fEi c1119420fEi4 = (C1119420fEi) dataChannel.gg0(DailyRankStickerModelChannel.class);
            if (c1119420fEi4 != null) {
                c474500IjA.LJJIIZI(LIZIZ(rankTypeV2, c1119420fEi, c1119420fEi4));
            }
        } else {
            int i2 = 0;
            if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI)) {
                C1119430fEj c1119430fEj = (C1119430fEj) dataChannel.gg0(TeamRankStickerModelChannel.class);
                if (c1119430fEj != null) {
                    long j2 = c1119430fEj.LJIILL;
                    long j3 = c1119430fEj.LJIILLIIL;
                    long jLIZJ = C158B.LIZJ();
                    if (j2 <= jLIZJ && jLIZJ < j3) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c474500IjA.LJJII(Integer.valueOf(i), "is_bonus_time");
                    long j4 = c1119430fEj.LIZIZ;
                    if (1 <= j4 && j4 < 100) {
                        i2 = 1;
                    }
                    c474500IjA.LJJII(Integer.valueOf(i2), "is_daily_onrank");
                    c474500IjA.LJJIIZI(LIZIZ(rankTypeV2, c1119420fEi, c1119430fEj));
                }
            } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LIZ)) {
                C1119420fEi c1119420fEi5 = (C1119420fEi) dataChannel.gg0(HourlyRankStickerModelChannel.class);
                if (c1119420fEi5 != null) {
                    c474500IjA.LJJIIZI(LIZIZ(rankTypeV2, c1119420fEi, c1119420fEi5));
                }
            } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIILJJIL)) {
                C1119420fEi c1119420fEi6 = (C1119420fEi) dataChannel.gg0(GameDailyRankStickerModel.class);
                if (c1119420fEi6 != null) {
                    c474500IjA.LJJIIZI(LIZIZ(rankTypeV2, c1119420fEi, c1119420fEi6));
                }
            } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIL) && (c1119420fEi2 = (C1119420fEi) dataChannel.gg0(ClassRankStickerModel.class)) != null) {
                if (c1119420fEi == null) {
                    c1119420fEi3 = c1119420fEi2;
                } else {
                    c1119420fEi3 = c1119420fEi;
                }
                C1846930yA7 c1846930yA7LJIIIIZZ = C1846800y9u.LJIIIIZZ(c1119420fEi3);
                c474500IjA.LJJIIZI(LIZIZ(rankTypeV2, c1119420fEi, c1119420fEi2));
                boolean z = C1105900esu.LIZIZ;
                if (c1846930yA7LJIIIIZZ != null) {
                    i2 = c1846930yA7LJIIIIZZ.LIZ;
                }
                String strLIZJ = C1105900esu.LIZJ(i2);
                if (strLIZJ == null) {
                    strLIZJ = "unknow";
                }
                c474500IjA.LJJII(strLIZJ, "anchor_ranking_league_level");
                if (c1846930yA7LJIIIIZZ != null) {
                    j = c1846930yA7LJIIIIZZ.LIZIZ;
                } else {
                    j = 0;
                }
                c474500IjA.LJJII(Long.valueOf(j), "anchor_ranking_league_star");
            }
        }
        c474500IjA.LJJII(C500260Jjc.LJJJJJL(dataChannel), "live_type");
    }

    public static final void LIZLLL(DataChannel dataChannel, RankTypeV2 rankTypeV2, String str, C1119420fEi c1119420fEi) {
        String str2;
        C1846810y9v c1846810y9v;
        C1846810y9v c1846810y9v2;
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            boolean z = true;
            if (c1119420fEi == null || (((c1846810y9v = c1119420fEi.LJIIIIZZ) == null || c1846810y9v.LIZ != 1) && ((c1846810y9v2 = c1119420fEi.LJIIIIZZ) == null || c1846810y9v2.LIZ != 2))) {
                z = false;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_sticker_remove");
            c474500IjALIZ.LJIJJLI(dataChannel);
            LIZ(c474500IjALIZ, dataChannel, rankTypeV2, c1119420fEi);
            if (C500260Jjc.LJIIZILJ(dataChannel)) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            c474500IjALIZ.LJJII(str2, "user_type");
            c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            long j = 0;
            if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIIL)) {
                C1119420fEi c1119420fEi2 = (C1119420fEi) dataChannel.gg0(DailyRankStickerModelChannel.class);
                if (c1119420fEi2 != null) {
                    long jLIZJ = c1119420fEi2.LIZLLL - C158B.LIZJ();
                    if (!z && (!Intrinsics.LJFF(LIZ, "passive") || Math.abs(jLIZJ - c1119420fEi2.LJ) >= 5)) {
                        j = jLIZJ;
                    }
                    c474500IjALIZ.LJJII(Long.valueOf(j), "end_time_diff");
                }
                c474500IjALIZ.LJJII(LIZ, "remove_type");
            } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI)) {
                c474500IjALIZ.LJJII(LIZJ, "remove_type");
            } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LIZ)) {
                C1119420fEi c1119420fEi3 = (C1119420fEi) dataChannel.gg0(HourlyRankStickerModelChannel.class);
                if (c1119420fEi3 != null) {
                    long jLIZJ2 = c1119420fEi3.LIZLLL - C158B.LIZJ();
                    if (!z && (!Intrinsics.LJFF(LIZLLL, "passive") || Math.abs(jLIZJ2 - c1119420fEi3.LJ) >= 5)) {
                        j = jLIZJ2;
                    }
                    c474500IjALIZ.LJJII(Long.valueOf(j), "end_time_diff");
                }
                c474500IjALIZ.LJJII(LIZLLL, "remove_type");
            } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIILJJIL)) {
                c474500IjALIZ.LJJII(LIZIZ, "remove_type");
                C1119420fEi c1119420fEi4 = (C1119420fEi) dataChannel.gg0(GameDailyRankStickerModel.class);
                if (c1119420fEi4 != null) {
                    long jLIZJ3 = c1119420fEi4.LIZLLL - C158B.LIZJ();
                    if (!z && (!Intrinsics.LJFF(LIZIZ, "passive") || Math.abs(jLIZJ3 - c1119420fEi4.LJ) >= 5)) {
                        j = jLIZJ3;
                    }
                    c474500IjALIZ.LJJII(Long.valueOf(j), "end_time_diff");
                }
            } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIL)) {
                C1119420fEi c1119420fEi5 = (C1119420fEi) dataChannel.gg0(ClassRankStickerModel.class);
                if (c1119420fEi5 != null) {
                    long jLIZJ4 = c1119420fEi5.LIZLLL - C158B.LIZJ();
                    if (!z && (!Intrinsics.LJFF(LJ, "passive") || Math.abs(jLIZJ4 - c1119420fEi5.LJ) >= 5)) {
                        j = jLIZJ4;
                    }
                    c474500IjALIZ.LJJII(Long.valueOf(j), "end_time_diff");
                }
                c474500IjALIZ.LJJII(LJ, "remove_type");
            }
            c474500IjALIZ.LJJII(str, "show_type");
            c474500IjALIZ.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    public static final void LJ(DataChannel dataChannel, RankTypeV2 rankTypeV2, String str, C1119060fE8 c1119060fE8) {
        ?? BooleanValue;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_sticker_set_success");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZJ(c474500IjALIZ, dataChannel, rankTypeV2);
        c474500IjALIZ.LJJII(str, "enter_from");
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIIL)) {
            BooleanValue = InterfaceC1094280eaA.Md.LIZIZ().booleanValue();
        } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI)) {
            BooleanValue = InterfaceC1094280eaA.Od.LIZIZ().booleanValue();
        } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LIZ)) {
            BooleanValue = InterfaceC1094280eaA.Qd.LIZIZ().booleanValue();
        } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIILJJIL)) {
            BooleanValue = InterfaceC1094280eaA.Nd.LIZIZ().booleanValue();
        } else if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIL)) {
            BooleanValue = InterfaceC1106030et7.B9.LIZIZ().booleanValue();
        } else {
            BooleanValue = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf((int) BooleanValue), "is_auto_set");
        if (Intrinsics.LJFF(str, "full_screen")) {
            c474500IjALIZ.LJJII(c1119060fE8.LIZ, "tip_or_tag_id");
        }
        c474500IjALIZ.LIZ();
    }

    public static final void LJI(DataChannel dataChannel, RankTypeV2 rankTypeV2, RankTypeV2 rankTypeV22, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_sticker_set_popup_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(rankTypeV2.rankName, "from_rank_type");
        c474500IjALIZ.LJJII(rankTypeV22.rankName, "to_rank_type");
        c474500IjALIZ.LJJII(str, "switch_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LJII(DataChannel dataChannel, RankTypeV2 rankTypeV2, RankTypeV2 rankTypeV22, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_sticker_set_switch_tab");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(rankTypeV2.rankName, "from_rank_type");
        c474500IjALIZ.LJJII(rankTypeV22.rankName, "to_rank_type");
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LIZ();
    }

    public static final void LJIIIIZZ(DataChannel dataChannel, RankTypeV2 rankTypeV2, String str, C1119420fEi c1119420fEi) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_sticker_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        c474500IjALIZ.LJJII(str2, "user_type");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        LIZ(c474500IjALIZ, dataChannel, rankTypeV2, c1119420fEi);
        c474500IjALIZ.LJJII(str, "show_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LJFF(DataChannel dataChannel, RankTypeV2 rankTypeV2, RankTypeV2 rankTypeV22, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_sticker_set_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(rankTypeV2.rankName, "from_rank_type");
        c474500IjALIZ.LJJII(rankTypeV22.rankName, "to_rank_type");
        c474500IjALIZ.LJJII(str, "click_area");
        c474500IjALIZ.LJJII(str2, "switch_type");
        c474500IjALIZ.LIZ();
    }
}
