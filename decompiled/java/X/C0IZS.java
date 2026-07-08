package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePaidEventSchema;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0IZS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IZS {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, Room room, String str) {
        int iYy2;
        Long l;
        C495520Jby c495520Jby = new C495520Jby(LivePaidEventSchema.INSTANCE.getValue());
        c495520Jby.LIZIZ(room.getId(), "room_id");
        c495520Jby.LIZJ("request_id", room.getRequestId());
        c495520Jby.LIZIZ(room.getOwnerUserId(), "author_id");
        LiveEventInfo liveEventInfo = room.liveEventInfo;
        if (liveEventInfo != null && (l = liveEventInfo.eventId) != null) {
            c495520Jby.LIZIZ(l.longValue(), "live_event_id");
        }
        IRankService iRankService = (IRankService) C1161920gLG.LIZJ(IRankService.class);
        if (iRankService != null) {
            iYy2 = iRankService.yy2();
        } else {
            iYy2 = 0;
        }
        c495520Jby.LIZ(iYy2, "room_user_count");
        c495520Jby.LIZJ("enter_from", str);
        c495520Jby.LIZ(1, "paid_event_preview");
        Uri uri = UriProtector.parse(c495520Jby.LIZLLL());
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService != null) {
            iHybridContainerService.YC1(context, uri.toString(), new C0IZT(room));
        }
    }
}
