package X;

import com.ss.android.ugc.aweme.bulletin.KeyValueHolder;
import com.ss.android.ugc.aweme.notification.aggregate.data.BulletinAggregateNotice;
import com.ss.android.ugc.aweme.notification.aggregate.data.BulletinChannelInfo;
import com.ss.android.ugc.aweme.notification.aggregate.view.BulletinInviteNoticeCell;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0y0H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840830y0H implements InterfaceC1840850y0J {
    public final /* synthetic */ BulletinInviteNoticeCell LIZ;

    @Override // X.InterfaceC1840850y0J
    public final void getEnterFrom() {
    }

    @Override // X.InterfaceC1840850y0J
    public final void getEnterMethod() {
    }

    @Override // X.InterfaceC1840850y0J
    public final EnumC1906770zid LJJLIIIJLJLI() {
        return EnumC1906770zid.THIRD_PAGE;
    }

    public C1840830y0H(BulletinInviteNoticeCell bulletinInviteNoticeCell) {
        this.LIZ = bulletinInviteNoticeCell;
    }

    @Override // X.InterfaceC1840850y0J
    public final void LJJLIIIJLLLLLLLZ(String str) {
        Long l;
        BulletinChannelInfo bulletinChannelInfo;
        List<KeyValueHolder> list;
        BulletinInviteNoticeCell bulletinInviteNoticeCell = this.LIZ;
        bulletinInviteNoticeCell.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BulletinAggregateNotice item = bulletinInviteNoticeCell.getItem();
        if (item != null && (list = item.eventTrackingExtra) != null) {
            for (KeyValueHolder keyValueHolder : list) {
                linkedHashMap.put(keyValueHolder.key, keyValueHolder.value);
            }
        }
        bulletinInviteNoticeCell.LL.getClass();
        linkedHashMap.put("enter_from", "activity_message_page");
        linkedHashMap.put("action_type", "click");
        linkedHashMap.put("click_type", "enter_cell");
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(linkedHashMap);
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        c2344009Gk.LJIIIIZZ("account_type", "invite_join_bulletin_board");
        C20684815ws.LJIILLIIL("notification_message_folded_message", c2344009Gk.LIZ);
        if (str != null && u.LJJIIJZLJL(str, "aweme://inbox/bulletin_board?", false)) {
            BulletinAggregateNotice item2 = bulletinInviteNoticeCell.getItem();
            if (item2 != null && (bulletinChannelInfo = item2.channelInfo) != null) {
                l = bulletinChannelInfo.bbId;
            } else {
                l = null;
            }
            C0OPQ c0opq = C0OPQ.LIZ;
            String strValueOf = String.valueOf(l);
            Boolean bool = Boolean.FALSE;
            c0opq.getClass();
            C0OPQ.LJ(bool, strValueOf, linkedHashMap);
        }
    }
}
