package X;

import Y.AfS176S0100000_7;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendAckReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.model.FeedItem;
import com.ss.android.ugc.aweme.hangout.container.model.IMultiTopLivePageApi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.MGModulePlay;
import webcast.api.feed.MGModuleTab;

/* JADX INFO: renamed from: X.0Iph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478550Iph {
    public static final C478550Iph LIZ = new C478550Iph();
    public static final List<MGModulePlay> LIZIZ = new ArrayList();
    public static final List<RecommendItem> LIZJ = new ArrayList();
    public static final List<MGModuleInteraction> LIZLLL = new ArrayList();
    public static final List<MGModuleTab> LJ = new ArrayList();
    public static final ConcurrentHashMap<List<String>, Object> LJFF = new ConcurrentHashMap<>();

    public static Object LIZJ(RecommendAckReq recommendAckReq, InterfaceC1364105Vn interfaceC1364105Vn) {
        C480460Ism.LIZ().getClass();
        return ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).recommendAck(recommendAckReq, interfaceC1364105Vn);
    }

    public static void LIZIZ(String str, long j, Function1 function1, Function1 function12) {
        C11NZ<BaseListResponse<FeedItem, FeedExtra>> roomList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_merge_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        LiveFeedDraw.Companion.getClass();
        sbLIZ2.append(C0ISY.LIZIZ(strLIZIZ));
        sbLIZ2.append("_refresh");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (j > 0) {
            C480460Ism.LIZ().getClass();
            roomList = ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).getRoomListWithAggID(strLIZIZ2, String.valueOf(j));
        } else {
            C480460Ism.LIZ().getClass();
            roomList = ((IMultiTopLivePageApi) C480460Ism.LIZLLL(IMultiTopLivePageApi.class)).getRoomList(strLIZIZ2);
        }
        roomList.LJIILIIL(new C0UO0()).LJJLL(new AfS176S0100000_7(function1, 274), new AfS176S0100000_7(function12, 275));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r30, java.lang.String r32, X.InterfaceC1364105Vn r33, webcast.api.feed.MGModuleTab r34) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C478550Iph.LIZ(long, java.lang.String, X.05Vn, webcast.api.feed.MGModuleTab):java.lang.Object");
    }
}
