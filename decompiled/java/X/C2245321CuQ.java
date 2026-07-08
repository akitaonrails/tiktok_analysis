package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.1CuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245321CuQ {
    public static final C2245321CuQ LIZ = new C2245321CuQ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2245561Cuo());

    public static boolean LIZIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static void LIZJ(C2344009Gk c2344009Gk, C2245131Cu7 c2245131Cu7) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[reportBasicLog] status=");
        sbLIZ.append(c2344009Gk.LJIIIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS));
        C1022620cia.LIZ("ReRankEvent", C2188811AlT.LIZIZ(sbLIZ));
        c2344009Gk.LIZJ(c2245131Cu7.LIZ, "trigger_source");
        C2245601Cus c2245601Cus = c2245131Cu7.LJII;
        if (c2245601Cus != null) {
            c2344009Gk.LIZJ(c2245601Cus.LIZ, "item_count");
            c2344009Gk.LIZJ(c2245601Cus.LIZLLL, "cur_index");
            LIZ.getClass();
            if (!LIZIZ()) {
                c2344009Gk.LJFF("cur_item_list", c2245601Cus.LIZJ);
            }
        }
        C20684815ws.LJIILLIIL("tt_ad_pitaya_rerank_trace", c2344009Gk.LIZ);
    }

    public static void LJ(int i, Integer num) {
        int iIntValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[reportStartTrigger] trigger=");
        sbLIZ.append(i);
        sbLIZ.append(", position=");
        sbLIZ.append(num);
        C1022620cia.LIZ("ReRankEvent", C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "start_trigger");
        c2344009Gk.LIZJ(i, "trigger_source");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c2344009Gk.LIZJ(iIntValue, "cur_index");
        C20684815ws.LJIILLIIL("tt_ad_pitaya_rerank_trace", c2344009Gk.LIZ);
    }

    public static void LIZ(StringBuilder sb, C2344009Gk c2344009Gk, String str) {
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        c2344009Gk.LJFF(str, sb.toString());
    }

    public static void LJFF(int i, Set set, int i2) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            InterfaceC2245651Cux interfaceC2245651Cux = (InterfaceC2245651Cux) it2.next();
            Aweme aweme = interfaceC2245651Cux.getAweme();
            if (aweme != null && aweme.isAd() && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null) {
                String aid = aweme.getAid();
                String requestId = aweme.getRequestId();
                if (interfaceC2245651Cux instanceof C2190051AnT) {
                    i3 = 0;
                    i4 = ((C2190051AnT) interfaceC2245651Cux).LIZ;
                    i6 = i4 + i2;
                    i5 = -1;
                } else {
                    if (interfaceC2245651Cux instanceof C2190061AnU) {
                        i3 = 1;
                    } else if (interfaceC2245651Cux instanceof C2190071AnV) {
                        i3 = 2;
                    } else {
                        throw new C1954807lC();
                    }
                    if (interfaceC2245651Cux instanceof C2190071AnV) {
                        C2190071AnV c2190071AnV = (C2190071AnV) interfaceC2245651Cux;
                        int i7 = c2190071AnV.LIZ;
                        i6 = i7 + i2;
                        int i8 = c2190071AnV.LIZJ;
                        i5 = i8 + i2;
                        i4 = i8 - i7;
                    } else if (interfaceC2245651Cux instanceof C2190061AnU) {
                        i4 = ((C2190061AnU) interfaceC2245651Cux).LIZ;
                        i5 = i4 + i2;
                        i6 = -1;
                    } else {
                        throw new C1954807lC();
                    }
                }
                String strT6 = interfaceC2245651Cux.T6();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[reportStepResultLog] rerankType=");
                sbLIZ.append(i3);
                sbLIZ.append(", step=");
                sbLIZ.append(i4);
                sbLIZ.append(", curIndex=");
                sbLIZ.append(i);
                sbLIZ.append(", offset=");
                sbLIZ.append(i2);
                sbLIZ.append(", aid=");
                sbLIZ.append(aid);
                sbLIZ.append(", debug_info=");
                sbLIZ.append(strT6);
                C1022620cia.LIZ("ReRankEvent", C2188811AlT.LIZIZ(sbLIZ));
                new C1AF2().logAd(C2246261Cvw.LIZ, awemeRawAdLJJIJLIJ, new C2246251Cvv(aid, requestId, i3, i4, strT6, i, interfaceC2245651Cux, i6 - i, i5 - i));
            }
        }
    }

    public static void LJI(int i, Integer num, String str) {
        int iIntValue;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("err_msg", str);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "trigger_failed");
        c2344009Gk.LIZJ(i, "trigger_source");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c2344009Gk.LIZJ(iIntValue, "cur_index");
        C20684815ws.LJIILLIIL("tt_ad_pitaya_rerank_trace", c2344009Gk.LIZ);
    }

    public static void LIZLLL(C2245321CuQ c2245321CuQ, C2245131Cu7 c2245131Cu7, boolean z, List list, String str, Set set, Aweme aweme, int i) {
        String str2;
        String requestId;
        String str3;
        String str4;
        String str5 = str;
        if ((i & 8) != 0) {
            str5 = "";
        }
        if ((i & 16) != 0) {
            set = C08CX.INSTANCE;
        }
        String aid = null;
        if ((i & 32) != 0) {
            aweme = null;
        }
        c2245321CuQ.getClass();
        if (z) {
            str2 = "rerank_success";
        } else {
            str2 = "rerank_failed";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        if (!LIZIZ()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((RankData) it2.next()).getOriginItem());
            }
            c2344009Gk.LJFF("return_item_list", C1617880sCg.LIZIZ(arrayList));
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (InterfaceC2245651Cux interfaceC2245651Cux : set) {
                if (interfaceC2245651Cux instanceof C2190051AnT) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(((C2190051AnT) interfaceC2245651Cux).LIZ);
                    sbLIZ.append(',');
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    z2 = true;
                } else if (interfaceC2245651Cux instanceof C2190071AnV) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    C2190071AnV c2190071AnV = (C2190071AnV) interfaceC2245651Cux;
                    sbLIZ2.append(c2190071AnV.LIZ);
                    sbLIZ2.append("->");
                    sbLIZ2.append(c2190071AnV.LIZJ);
                    sbLIZ2.append(',');
                    sb3.append(C2188811AlT.LIZIZ(sbLIZ2));
                    z4 = true;
                } else if (interfaceC2245651Cux instanceof C2190061AnU) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(((C2190061AnU) interfaceC2245651Cux).LIZ);
                    sbLIZ3.append(',');
                    sb2.append(C2188811AlT.LIZIZ(sbLIZ3));
                    z3 = true;
                } else {
                    throw new C1954807lC();
                }
            }
            String str6 = "1";
            if (z2) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("delete", str3);
            if (z3) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("insert", str4);
            if (!z4) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("move", str6);
            LIZ(sb, c2344009Gk, "delete_detail");
            LIZ(sb2, c2344009Gk, "insert_detail");
            LIZ(sb3, c2344009Gk, "move_detail");
        }
        if (z) {
            if (C2245351CuT.LIZLLL >= 0 && C2245351CuT.LJFF - C2245351CuT.LIZIZ >= 0 && C2245351CuT.LJIIJJI - C2245351CuT.LJFF >= 0 && C2245351CuT.LIZ() >= 0) {
                c2344009Gk.LIZLLL(C2245351CuT.LIZLLL, "duration");
                c2344009Gk.LIZLLL(C2245351CuT.LJFF - C2245351CuT.LIZIZ, "client_pre_dur");
                c2344009Gk.LIZLLL(C2245351CuT.LJ - C2245351CuT.LIZIZ, "create_task_dur");
                c2344009Gk.LIZLLL(C2245351CuT.LJFF - C2245351CuT.LJ, "data_concat_dur");
                c2344009Gk.LIZLLL(C2245351CuT.LJIIJJI - C2245351CuT.LJFF, "pitaya_dur");
                c2344009Gk.LIZLLL(C2245351CuT.LIZ(), "client_post_dur");
                c2344009Gk.LIZLLL(C2245351CuT.LJIIL - C2245351CuT.LJIIJJI, "result_parse_dur");
                c2344009Gk.LIZLLL(C2245351CuT.LJIIJ, "gen_feed_list_dur");
                c2344009Gk.LIZLLL(C2245351CuT.LJIILIIL - C2245351CuT.LJIIIIZZ, "thread_schedule_dur");
                c2344009Gk.LIZLLL(C2245351CuT.LJIILJJIL, "data_check_dur");
                c2344009Gk.LIZLLL(C2245351CuT.LJIJ, "update_feed_dur");
                c2344009Gk.LIZLLL(C2245351CuT.LJIL, "upload_event_dur");
            }
            if (aweme != null) {
                requestId = aweme.getRequestId();
            } else {
                requestId = null;
            }
            c2344009Gk.LJFF("req_id", requestId);
            if (aweme != null) {
                aid = aweme.getAid();
            }
            c2344009Gk.LJFF("item_id", aid);
        } else {
            c2344009Gk.LJFF("err_msg", str5);
        }
        LIZJ(c2344009Gk, c2245131Cu7);
    }
}
