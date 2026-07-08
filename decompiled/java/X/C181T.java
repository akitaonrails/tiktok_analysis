package X;

import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionUserInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.181T, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C181T {
    public static final C212167181d LIZIZ(AuctionUserInfo auctionUserInfo) {
        String str;
        Long l = auctionUserInfo.userId;
        String str2 = auctionUserInfo.nickName;
        ECImage eCImage = auctionUserInfo.avatar;
        if (eCImage != null) {
            str = eCImage.url;
        } else {
            str = null;
        }
        return new C212167181d(auctionUserInfo.isWinner, str2, str, l);
    }

    public static final String LIZ(C1743900vTw c1743900vTw, String str) {
        C1766270w41.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C1766270w41.LIZ(C1766270w41.LIZIZ, c1743900vTw.LJ()));
        linkedHashMap.put("product_id", str);
        String strLIZJ = c1743900vTw.LIZJ("request_id");
        String str2 = "";
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        String strLIZJ2 = c1743900vTw.LIZJ("room_id");
        if (strLIZJ2 != null) {
            str2 = strLIZJ2;
        }
        linkedHashMap.put("track_id", C03RE.LIZ(strLIZJ, str2, str));
        return C1741890vQh.LJIIIIZZ(linkedHashMap);
    }
}
