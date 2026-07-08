package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.feed.MGModuleInteraction;

/* JADX INFO: renamed from: X.0Ipj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478570Ipj extends C09AY implements Function1<BaseListResponse<FeedItem, FeedExtra>, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ MGModuleInteraction LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478570Ipj(String str, MGModuleInteraction mGModuleInteraction, long j) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = mGModuleInteraction;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BaseListResponse<FeedItem, FeedExtra> baseListResponse) {
        String str;
        BaseListResponse<FeedItem, FeedExtra> baseListResponse2 = baseListResponse;
        List<FeedItem> list = baseListResponse2.data;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopModuleTimerManager Successfully fetched ");
        sbLIZ.append(list.size());
        sbLIZ.append(" rooms for ");
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("MultiTopLiveTopModuleTimerManager", C2188811AlT.LIZIZ(sbLIZ));
        C478920IqI c478920IqI = C478920IqI.LIZ;
        MGModuleInteraction mGModuleInteraction = this.LLILLJJLI;
        c478920IqI.getClass();
        String strLJII = C478920IqI.LJII(mGModuleInteraction);
        C478920IqI.LJ.put(strLJII, new C00IB(new ArrayList(list), System.currentTimeMillis()));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MultiTopLiveDataCacheManager Cached roomList data for ");
        sbLIZ2.append(strLJII);
        sbLIZ2.append(" with ");
        sbLIZ2.append(list.size());
        sbLIZ2.append(" items (no timeout)");
        C20441214yg.LIZIZ("MultiTopLiveDataCacheManager", C2188811AlT.LIZIZ(sbLIZ2));
        C477500Io0 c477500Io0 = C477500Io0.LIZ;
        long j = this.LLILLL;
        c477500Io0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (!list.isEmpty()) {
            str = "success";
        } else {
            str = "empty";
        }
        C477860Ioa.LJIIL(new C477910Iof(96, jCurrentTimeMillis, "top_module_room_preload", "MultiTopLiveTopModuleTimerManager # fetchRoomDataForModule, onSuccess", str, baseListResponse2.LIZLLL, (String) null));
        C478580Ipk.LIZIZ.put(this.LL, Long.valueOf(System.currentTimeMillis()));
        return Unit.LIZ;
    }
}
