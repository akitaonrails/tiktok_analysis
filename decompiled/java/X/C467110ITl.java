package X;

import Y.AfS176S0100000_7;
import Y.AfS3S0100100_7;
import Y.AkS40S1000000_7;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.Map;

/* JADX INFO: renamed from: X.0ITl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467110ITl {
    public static final /* synthetic */ int LIZ = 0;

    public static C11JF LIZIZ(String str, String str2, InterfaceC466760ISc interfaceC466760ISc, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C480460Ism.LIZ().getClass();
        C11NZ<BaseListResponse<FeedItem, FeedExtra>> c11nzFeed = ((FeedApi) C480460Ism.LIZIZ(FeedApi.class)).feed(str, 0L, str2, 0L, -1L, -1L, map);
        boolean zLJI = MethodIDManager.LJI(137970);
        InterfaceC420801kM interfaceC420801kMLJJLL = c11nzFeed.LJJJJZI(new AkS40S1000000_7(str2, 0)).LJJIJIIJIL(new C09JN() { // from class: X.0ITm
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FeedApiManager@9905.fetchData$2");
                C467130ITn.LIZ((C0ITP) ((C0ITM) obj).LIZ);
                C1C7U.LIZIZ("FeedApiManager@9905.fetchData$2");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS3S0100100_7(jCurrentTimeMillis, interfaceC466760ISc, 8), new AfS176S0100000_7(interfaceC466760ISc, 189));
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return (C11JF) interfaceC420801kMLJJLL;
    }

    public static void LIZ(Integer num, String str, String str2, String str3, Map map) {
        Object obj;
        Object obj2;
        String string;
        Object obj3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_live_bottom_banner_request_error");
        c474500IjALIZ.LJJII(str, "enter_from");
        Object obj4 = null;
        if (map != null) {
            obj = map.get("draw_video_id");
        } else {
            obj = null;
        }
        c474500IjALIZ.LJJII(obj, "group_id");
        if (map != null) {
            obj2 = map.get("draw_author_id");
        } else {
            obj2 = null;
        }
        c474500IjALIZ.LJJII(obj2, "author_id");
        if (num != null) {
            string = num.toString();
        } else {
            string = null;
        }
        c474500IjALIZ.LJJII(string, "error_code");
        if (map != null) {
            obj3 = map.get("related_live_tag");
        } else {
            obj3 = null;
        }
        c474500IjALIZ.LJJII(obj3, "game_related_tag");
        if (map != null) {
            obj4 = map.get("tag_name");
        }
        c474500IjALIZ.LJJII(obj4, "game_name");
        c474500IjALIZ.LJJII(str2, "log_id");
        c474500IjALIZ.LJJII(str3, "error_msg");
        c474500IjALIZ.LIZ();
    }
}
