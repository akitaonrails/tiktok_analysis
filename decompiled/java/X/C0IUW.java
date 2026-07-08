package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.chatroom.bl.enterroomboost.LiveEnterRoomUpdateSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FeedRequestParamsSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0IUW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IUW {
    public static InterfaceC467290IUd LIZ;
    public static C11JF LIZIZ;
    public static boolean LIZJ;
    public static C0ITP LIZLLL;
    public static String LJFF;
    public static C0IUY LJII;
    public static long LJ = -1;
    public static long LJI = -1;

    public static String LIZJ() {
        Map<String, Object> mapUx;
        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
        if (iLiveFeedApiService == null || (mapUx = iLiveFeedApiService.ux(-1L)) == null) {
            return null;
        }
        Object obj = mapUx.get("feed_url");
        return C0IUV.LIZ(obj instanceof String ? (String) obj : null);
    }

    public static C0ITP LIZIZ() {
        List<FeedItem> list;
        List<FeedItem> list2;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C0ITP c0itp = LIZLLL;
        if (c0itp != null && (list2 = c0itp.LIZ) != null && list2.size() > 0 && jUptimeMillis - LJ <= 10000) {
            return LIZLLL;
        }
        C0ITP c0itpLIZ = C467450IUt.LJIIL.getValue().LIZ();
        if (c0itpLIZ == null || (list = c0itpLIZ.LIZ) == null || list.size() <= 0) {
            return null;
        }
        return c0itpLIZ;
    }

    public static void LIZ(boolean z) {
        C11JF c11jf;
        LIZ = null;
        LIZJ = false;
        if (z && (c11jf = LIZIZ) != null && !c11jf.isDisposed()) {
            C11JF c11jf2 = LIZIZ;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            LIZIZ = null;
        }
    }

    public static boolean LJ(String str) {
        Object obj;
        if (LIZJ) {
            return false;
        }
        LIZJ = true;
        String strLIZJ = LIZJ();
        LJFF = strLIZJ;
        if (TextUtils.isEmpty(strLIZJ)) {
            return false;
        }
        HashMap map = new HashMap();
        if (C469460Ib2.LIZJ()) {
            map.put("is_non_personalized", "1");
        }
        if (LiveEnterRoomUpdateSetting.INSTANCE.enableForInnerFlow()) {
            map.put("need_enter_room_boost", "1");
            if (((IHostCommerce) C1161920gLG.LIZJ(IHostCommerce.class)).Wh()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("need_prefetch_pin", obj);
            map.put("need_enter_room_boost", "1");
        }
        map.put("feed_index", CardStruct.IStatusCode.DEFAULT);
        String str2 = C0IRZ.LIZ;
        map.put("need_req_feed_third_ver", String.valueOf(FeedRequestParamsSetting.INSTANCE.reqFeedV3(str)));
        map.put("req_session", C0IRZ.LIZ);
        C0IUY c0iuy = new C0IUY();
        LJII = c0iuy;
        LIZIZ = C467110ITl.LIZIZ(LJFF, str, c0iuy, map);
        return true;
    }

    public static void LIZLLL(int i, long j) {
        if (LJI <= 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("toplive_prefetch_onTouch_data");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "state");
        c474500IjALIZ.LJJII(Long.valueOf(j - LJI), "pre_fetch_time");
        c474500IjALIZ.LIZ();
    }
}
