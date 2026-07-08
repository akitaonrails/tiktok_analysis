package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeTrackingSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ayB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955410ayB {
    public static final int LIZIZ() {
        if (C915980Zwa.LJI().LJIIJ().LIZ()) {
            return C915980Zwa.LJII().LLILZLL(true).size();
        }
        return 1;
    }

    public static final void LIZ(Map<String, String> map) {
        Map<String, String> trackInfo = C915980Zwa.LJI().LIZ().getTrackInfo();
        if (trackInfo != null && trackInfo.containsKey("rank_period")) {
            String str = trackInfo.get("rank_period");
            if (str == null) {
                str = "";
            }
            map.put("rank_period", str);
        }
    }

    public static final String LIZJ(C955540ayO c955540ayO) {
        Integer numValueOf;
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LIZJ)) {
            return "mutual_follow";
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LIZLLL)) {
            return "recommend";
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIILL)) {
            return EnumC955630ayX.WEEKLY_RANK.getRankName();
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIJI)) {
            return EnumC955630ayX.DAILY_RANK.getRankName();
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIJJ)) {
            return EnumC955630ayX.DAILY_RANK_HALL_OF_FAME.getRankName();
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIILLIIL)) {
            return EnumC955630ayX.HOURLY_RANK.getRankName();
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJ)) {
            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
            return RankTypeV2.LJIIZILJ.rankName;
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJI)) {
            RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
            return RankTypeV2.LJIJ.rankName;
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIFFI)) {
            RankTypeV2 rankTypeV23 = RankTypeV2.LIZ;
            return RankTypeV2.LJIJI.rankName;
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJII)) {
            RankTypeV2 rankTypeV24 = RankTypeV2.LIZ;
            return RankTypeV2.LJIJJ.rankName;
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIIJZLJL)) {
            RankTypeV2 rankTypeV25 = RankTypeV2.LIZ;
            return RankTypeV2.LJIJJLI.rankName;
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJ) || Intrinsics.LJFF(c955540ayO, C955540ayO.LJI) || Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIJIL) || Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJIL) || Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJ) || Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJI)) {
            return "random_match";
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIJ)) {
            return EnumC955630ayX.WEEKLY_ROOKIE_RANK.getRankName();
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIJIIJI)) {
            RankTypeV2 rankTypeV26 = RankTypeV2.LIZ;
            return RankTypeV2.LJIL.rankName;
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIJIIJIL)) {
            return "cohost_history";
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJLI)) {
            C973660bRc c973660bRc = C973660bRc.LIZ;
            return C973660bRc.LJJLJ;
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJLL)) {
            C973660bRc c973660bRc2 = C973660bRc.LIZ;
            return C973660bRc.LJJLJLI;
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJZ)) {
            C973660bRc c973660bRc3 = C973660bRc.LIZ;
            return C973660bRc.LJJLL;
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJLIIL)) {
            return "full_screen_friends";
        }
        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJLL)) {
            return "full_screen_quick_invite";
        }
        if (c955540ayO != null) {
            numValueOf = Integer.valueOf(c955540ayO.LIZ);
        } else {
            numValueOf = null;
        }
        if (C957990b2L.LIZLLL(numValueOf)) {
            return "random_match";
        }
        return "";
    }

    public static final void LJFF(Map map, C955540ayO c955540ayO) {
        String str;
        if (!Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJIL) && !Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJ) && !Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJI)) {
            String inviteeListValue = InteractionSourceTypeTrackingSetting.INSTANCE.getInviteeListValue(Integer.valueOf(c955540ayO.LIZ));
            if (C123100dR.LIZ(inviteeListValue)) {
                map.put("invitee_list", inviteeListValue);
            } else {
                map.put("invitee_list", "random_match");
            }
        } else {
            map.put("invitee_list", "league_match_quick_invite");
        }
        if (C915980Zwa.LJIIIZ().LJIIIIZZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_system_rematching", str);
        if (C957710b1t.LIZ || C915980Zwa.LJI().LIZ().LJJIJLIJ()) {
            map.put("is_change_pairing", CardStruct.IStatusCode.DEFAULT);
            C957710b1t.LIZ = false;
        }
    }

    public static final void LIZLLL(Map map, C955540ayO c955540ayO, boolean z) {
        String str;
        String str2 = "";
        if (!Intrinsics.LJFF(c955540ayO, C955540ayO.LIZJ) && !Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJIZL)) {
            if (!Intrinsics.LJFF(c955540ayO, C955540ayO.LIZLLL) && !Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIII)) {
                if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIILL)) {
                    map.put("invitee_list", EnumC955630ayX.WEEKLY_RANK.getRankName());
                    LIZ(map);
                } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIJI)) {
                    map.put("invitee_list", EnumC955630ayX.DAILY_RANK.getRankName());
                    LIZ(map);
                } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIJJ)) {
                    map.put("invitee_list", EnumC955630ayX.DAILY_RANK_HALL_OF_FAME.getRankName());
                    LIZ(map);
                } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIILLIIL)) {
                    map.put("invitee_list", EnumC955630ayX.HOURLY_RANK.getRankName());
                    LIZ(map);
                } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIJ)) {
                    map.put("invitee_list", EnumC955630ayX.WEEKLY_ROOKIE_RANK.getRankName());
                    LIZ(map);
                } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJ)) {
                    map.put("invitee_list", RankTypeV2.LJIIZILJ.rankName);
                    LIZ(map);
                } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJI)) {
                    map.put("invitee_list", RankTypeV2.LJIJ.rankName);
                    LIZ(map);
                } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIFFI)) {
                    map.put("invitee_list", RankTypeV2.LJIJI.rankName);
                    LIZ(map);
                } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJII)) {
                    map.put("invitee_list", RankTypeV2.LJIJJ.rankName);
                    LIZ(map);
                } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIIJZLJL)) {
                    map.put("invitee_list", RankTypeV2.LJIJJLI.rankName);
                    LIZ(map);
                } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIJIIJI)) {
                    map.put("invitee_list", RankTypeV2.LJIL.rankName);
                    LIZ(map);
                } else if (!Intrinsics.LJFF(c955540ayO, C955540ayO.LJ) && !Intrinsics.LJFF(c955540ayO, C955540ayO.LJI) && !Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIJIL) && !Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJIL) && !Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJ) && !Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJI)) {
                    if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJII)) {
                        map.put("invitee_list", "official_channel_allowlist");
                    } else if (!Intrinsics.LJFF(c955540ayO, C955540ayO.LJIIIZ) && !Intrinsics.LJFF(c955540ayO, C955540ayO.LJIJJLI)) {
                        if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIIJ) || Intrinsics.LJFF(c955540ayO, C955540ayO.LJIL) || Intrinsics.LJFF(c955540ayO, C955540ayO.LJIIJJI)) {
                            map.put("invitee_list", "scheduled");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIIZ)) {
                            map.put("invitee_list", "search");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIIZI)) {
                            map.put("invitee_list", "2023_eoy");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIJ)) {
                            map.put("invitee_list", "league_campaign_rank");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIJIIJIL)) {
                            map.put("invitee_list", "cohost_history");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIIL)) {
                            map.put("invitee_list", "online_friend_capsule");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIILIIL)) {
                            map.put("invitee_list", "nr_mywaste");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJIILJJIL)) {
                            map.put("invitee_list", "nr_yourwaste");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIJL)) {
                            map.put("invitee_list", "find_kings");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIJLIJ)) {
                            map.put("invitee_list", "find_knights");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIL)) {
                            map.put("invitee_list", "kings_ranking");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJIZ)) {
                            map.put("invitee_list", "knights_ranking");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJ)) {
                            map.put("invitee_list", "league_match_cohost_search");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJI)) {
                            map.put("invitee_list", "league_match_recommended");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJJ)) {
                            map.put("invitee_list", "available_friend_capsule");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJJL)) {
                            map.put("invitee_list", "recommend_capsule");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJL)) {
                            map.put("invitee_list", "suggest_creator");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJLI)) {
                            map.put("invitee_list", C973660bRc.LJJLJ);
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJLL)) {
                            map.put("invitee_list", C973660bRc.LJJLJLI);
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJJZ)) {
                            map.put("invitee_list", C973660bRc.LJJLL);
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJLIIL)) {
                            map.put("invitee_list", "full_screen_friends");
                        } else if (Intrinsics.LJFF(c955540ayO, C955540ayO.LJJJLL)) {
                            map.put("invitee_list", "full_screen_quick_invite");
                        } else if (C957990b2L.LIZLLL(Integer.valueOf(c955540ayO.LIZ))) {
                            LJFF(map, c955540ayO);
                        } else {
                            String inviteeListValue = InteractionSourceTypeTrackingSetting.INSTANCE.getInviteeListValue(Integer.valueOf(c955540ayO.LIZ));
                            if (inviteeListValue == null) {
                                inviteeListValue = "";
                            }
                            map.put("invitee_list", inviteeListValue);
                        }
                    } else {
                        map.put("invitee_list", "reservation_card");
                    }
                } else {
                    LJFF(map, c955540ayO);
                }
            } else {
                map.put("invitee_list", "recommend");
            }
        } else {
            map.put("invitee_list", "mutual_follow");
        }
        map.put("event_type", String.valueOf(c955540ayO.LIZ));
        int i = 1;
        if (!TextUtils.isEmpty(C915980Zwa.LJI().LIZ().LLL().rankType)) {
            map.put("rank_type", C915980Zwa.LJI().LIZ().LLL().rankType);
        }
        if (C915980Zwa.LJI().LIZ().LLL().topIndex <= 0) {
            i = 0;
        }
        map.put("is_ranking_opposite_anchor", String.valueOf(i));
        if (z) {
            C943870afZ enterFrom = C915980Zwa.LJI().LIZ().getEnterFrom();
            if (enterFrom != null && (str = enterFrom.LIZ) != null) {
                str2 = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                map.put("enter_from", str2);
            }
        }
    }

    public static final void LJI(long j, String str, String str2) {
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cancel_connection_popup_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "waiting_time");
        c474500IjALIZ.LJJII("connection_icon", "enter_from");
        c474500IjALIZ.LJJII(LIZJ(C955540ayO.LJ), "invitee_list");
        c474500IjALIZ.LJJII(String.valueOf(LIZIZ()), "current_connection_cnts");
        c474500IjALIZ.LJJII(str, "click_position");
        c474500IjALIZ.LJJII(str2, "withdraw_type");
        c474500IjALIZ.LJJII(Long.valueOf(C915980Zwa.LJII().getChannelId()), "channel_id");
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList arrayList = new ArrayList();
        for (C954460awe c954460awe : listLJIJJ) {
            C954460awe c954460awe2 = c954460awe;
            if (!c954460awe2.LJI() && c954460awe2.LJIIJ()) {
                arrayList.add(c954460awe);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C954460awe) it2.next()).LJ));
        }
        c474500IjALIZ.LJJII(arrayList2, "uid_list");
        List listLIZ = C960270b61.LIZ();
        if (!listLIZ.isEmpty()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str3, "is_tag");
        c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(listLIZ, null, null, null, 0, null, AFwS250S0000000_15.get$arr$(265), 31), "interest_tag");
        c474500IjALIZ.LIZ();
    }
}
