package X;

import com.bytedance.android.live.rank.impl.list.OfflineRankListFragment;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xDI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1810460xDI extends C2217421BqW implements Function2<RankListV2Response.Data, String, Unit> {
    public C1810460xDI(OfflineRankListFragment offlineRankListFragment) {
        super(2, offlineRankListFragment, OfflineRankListFragment.class, "initRank", "initRank(Lcom/bytedance/android/livesdk/rank/list/model/RankListV2Response$Data;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(RankListV2Response.Data data, String str) {
        ((OfflineRankListFragment) this.receiver).PR(data, str);
        return Unit.LIZ;
    }
}
