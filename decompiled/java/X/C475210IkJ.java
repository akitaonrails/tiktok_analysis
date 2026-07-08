package X;

import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0IkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475210IkJ {
    public static final C475210IkJ LIZ = new C475210IkJ();

    public static void LIZIZ(InterfaceC475140IkC interfaceC475140IkC, String str, C19EG c19eg) {
        BaseListResponse<FeedItem, FeedExtra> baseListResponseLJIIIIZZ;
        if (interfaceC475140IkC != null && (baseListResponseLJIIIIZZ = interfaceC475140IkC.LJIIIIZZ()) != null && C500260Jjc.LJJIJIIJI(baseListResponseLJIIIIZZ.data)) {
            LIZJ(baseListResponseLJIIIIZZ, 0, str, c19eg);
        }
    }

    public static void LIZJ(BaseListResponse baseListResponse, int i, String str, C19EG c19eg) {
        EnterRoomConfig enterRoomConfigNY;
        if (C500260Jjc.LJJIJIIJI(baseListResponse.data)) {
            List<T> list = baseListResponse.data;
            FeedItem feedItem = (FeedItem) ListProtector.get(list, i);
            FeedExtra feedExtra = (FeedExtra) baseListResponse.extra;
            if (feedItem != null && (feedItem.item instanceof Room) && (enterRoomConfigNY = ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).nY(i, list, feedExtra)) != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfigNY.mRoomsData;
                roomsData.enterFromMerge = str;
                roomsData.enterMethod = "nearby_module";
                enterRoomConfigNY.mLogData.isNearby = 1;
                ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(c19eg, enterRoomConfigNY);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C19EG r12, X.InterfaceC475140IkC r13, boolean r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C475210IkJ.LIZ(X.19EG, X.0IkC, boolean, X.05Vn):java.lang.Object");
    }
}
