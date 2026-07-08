package X;

import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.01Gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C305601Gk implements InterfaceC305701Gl {
    public final String LIZ;

    @Override // X.InterfaceC305701Gl
    public final String getName() {
        return this.LIZ;
    }

    public C305601Gk(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC305701Gl
    public final List<C941840acI> LIZ(FanTicketRoomNoticeContent fanTicketRoomNoticeContent) {
        List<UserFanTicket> list = fanTicketRoomNoticeContent.userFanTicket;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (UserFanTicket userFanTicket : list) {
                arrayList.add(new C941840acI(userFanTicket.userId, LIZIZ(userFanTicket), userFanTicket.iconName, userFanTicket.animationName, userFanTicket.ticketUiStyle, userFanTicket.ticketUiStyleV2, userFanTicket.completionProgressPercent, userFanTicket.topGuestRank));
            }
            return arrayList;
        }
        return null;
    }

    public long LIZIZ(UserFanTicket userFanTicket) {
        UserPlayInfo userPlayInfo = userFanTicket.playInfo;
        if (userPlayInfo != null) {
            return userPlayInfo.score;
        }
        return 0L;
    }
}
