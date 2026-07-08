package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ITn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467130ITn {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0ITP c0itp) {
        List<FeedItem> list;
        if (!C0IKQ.LIZ(c0itp.LIZ) && c0itp.LIZIZ != null && (list = c0itp.LIZ) != null) {
            for (FeedItem feedItem : list) {
                FeedExtra feedExtra = c0itp.LIZIZ;
                n logPb = null;
                if (feedExtra != null && feedExtra.getLogPb() != null) {
                    FeedExtra feedExtra2 = c0itp.LIZIZ;
                    if (feedExtra2 != null) {
                        logPb = feedExtra2.getLogPb();
                    }
                    feedItem.logPb = String.valueOf(logPb);
                }
            }
        }
    }

    public static void LIZIZ(FeedItem feedItem) {
        if (feedItem != null) {
            int i = feedItem.type;
            if (i == 1 || i == 2 || i == 19) {
                InterfaceC468260IXw interfaceC468260IXw = feedItem.item;
                if (interfaceC468260IXw instanceof Room) {
                    Room room = (Room) interfaceC468260IXw;
                    room.setLog_pb(feedItem.logPb);
                    if (room.getOwner() != null) {
                        room.getOwner().setLogPb(feedItem.logPb);
                    }
                    room.setRequestId(feedItem.resId);
                }
            }
        }
    }

    public static void LIZJ(List list) {
        if (C0IKQ.LIZ(list)) {
            return;
        }
        for (FeedItem feedItem : (ArrayList) list) {
            if (feedItem.item == null) {
                try {
                    feedItem.item = feedItem.getRoom();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }
}
