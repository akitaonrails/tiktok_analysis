package X;

import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Q1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663760Q1u {
    public static final Map<String, String> LIZ(Aweme aweme) {
        String strLJJLIIIJ;
        if (!LIZLLL(aweme) && !LIZJ(aweme)) {
            return null;
        }
        String str = "";
        if (LIZLLL(aweme)) {
            Pair[] pairArr = new Pair[3];
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            pairArr[0] = new Pair("mall_enter_context_video_id", aid);
            List<String> listLIZIZ = LIZIZ(aweme);
            if (listLIZIZ != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(listLIZIZ, ",", null, null, 0, null, null, 62)) != null) {
                str = strLJJLIIIJ;
            }
            pairArr[1] = new Pair("mall_enter_context_product_ids", str);
            pairArr[2] = new Pair("mall_enter_context_author_id", AwemeExtKt.getAuthorUid(aweme));
            return C2097608Jq.LJIIIIZZ(pairArr);
        }
        Pair[] pairArr2 = new Pair[2];
        String strLJ = LJ(aweme);
        if (strLJ != null) {
            str = strLJ;
        }
        pairArr2[0] = new Pair("mall_enter_context_room_id", str);
        pairArr2[1] = new Pair("mall_enter_context_author_id", AwemeExtKt.getAuthorUid(aweme));
        return C2097608Jq.LJIIIIZZ(pairArr2);
    }

    public static final List<String> LIZIZ(Aweme aweme) {
        C13LG<Long> c13lg;
        List listLJJJJI;
        RelatedProductInfo relatedProductInfoLJLLI = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLLI(aweme.getAid(), AwemeExtKt.getAuthorUid(aweme));
        if (relatedProductInfoLJLLI != null && (c13lg = relatedProductInfoLJLLI.productIdList) != null && (listLJJJJI = C13LP.LJJJJI(c13lg)) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJI, 10));
            Iterator it2 = listLJJJJI.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((Number) it2.next()).longValue()));
            }
            return arrayList;
        }
        return null;
    }

    public static final boolean LIZJ(Aweme aweme) {
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        if (aweme == null || (roomFeedCellStruct = aweme.getRoomFeedCellStruct()) == null || (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) == null || !newLiveRoomData.hasCommerceGoods || newLiveRoomData.commercePermission <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        return ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJJZ(aweme);
    }

    public static final String LJ(Aweme aweme) {
        RoomFeedCellStruct roomFeedCellStruct;
        boolean z = true;
        if (!AwemeSaaSExtKt.isLive(aweme)) {
            z = false;
        }
        if (!z) {
            return null;
        }
        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        if (newLiveRoomDataExt == null && ((roomFeedCellStruct = aweme.getRoomFeedCellStruct()) == null || (newLiveRoomDataExt = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
            return null;
        }
        return Long.valueOf(newLiveRoomDataExt.id).toString();
    }
}
