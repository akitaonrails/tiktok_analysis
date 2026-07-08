package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceExposedInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0zaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901570zaF {
    public static final C1901570zaF LIZ = new C1901570zaF();

    public static final void LIZ(InboxEntranceResponse inboxEntranceResponse) {
        List<InboxEntranceCell> entranceCells;
        InboxEntranceCell next;
        List<? extends MusNotice> list;
        NoticeItems noticeItems;
        List<? extends MusNotice> list2;
        if (inboxEntranceResponse != null && (entranceCells = inboxEntranceResponse.getEntranceCells()) != null) {
            Iterator<InboxEntranceCell> it2 = entranceCells.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.isActivity()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InboxEntranceCell inboxEntranceCell = next;
            if (inboxEntranceCell != null) {
                InboxEntranceExposedInfo inboxEntranceExposedInfo = inboxEntranceCell.exposedInfo;
                if (inboxEntranceExposedInfo != null && (noticeItems = inboxEntranceExposedInfo.notices) != null && (list2 = noticeItems.items) != null) {
                    Iterator<? extends MusNotice> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        it3.next().dataSourceInterfaceName = "entrance_list";
                    }
                }
                NoticeItems noticeItems2 = inboxEntranceCell.noticePreloadItem;
                if (noticeItems2 != null && (list = noticeItems2.items) != null) {
                    Iterator<? extends MusNotice> it4 = list.iterator();
                    while (it4.hasNext()) {
                        it4.next().dataSourceInterfaceName = "entrance_list";
                    }
                }
            }
        }
    }

    public static void LIZIZ(n nVar, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("outreach_type", "inbox_banner");
        c2344009Gk.LJIIIIZZ("dynamic_reach_timing", str);
        if (nVar != null) {
            c2344009Gk.LJ(nVar, "dynamic_reach_resp_json");
        }
        C20684815ws.LJIILLIIL("dynamic_reach_parse_fail", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("dynamic_reach_show_time", str);
        C20684815ws.LJIILLIIL("dynamic_reach_record", c2344009Gk.LIZ);
    }

    public static void LIZLLL(EnumC637460OzQ enumC637460OzQ, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        int i = C637450OzP.LIZ[enumC637460OzQ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                } else {
                    c2344009Gk.LJFF("outreach_click_type", "click_outreach");
                }
            } else {
                c2344009Gk.LJFF("outreach_click_type", "click_open_button");
            }
        } else {
            c2344009Gk.LJFF("outreach_click_type", "close_x");
        }
        C20684815ws.LJIILLIIL("guide_user_m2_click", c2344009Gk.LIZ);
    }

    public static void LJFF(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        c2344009Gk.LJIIIIZZ("position", str);
        if (str2 != null) {
            c2344009Gk.LJFF("tab_name", str2);
        }
        C20684815ws.LJIILLIIL("inbox_pull_down_refresh", c2344009Gk.LIZ);
    }

    public static void LJ(String str, String str2, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(map);
        c2344009Gk.LJIIIIZZ("outreach_block_strategy_type", str);
        c2344009Gk.LJIIIIZZ("outreach_block_strategy_detail", str2);
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        C20684815ws.LJIILLIIL("guide_user_m2_block_detail", c2344009Gk.LIZ);
    }
}
