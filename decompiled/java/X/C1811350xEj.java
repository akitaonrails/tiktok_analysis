package X;

import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1811350xEj extends C2217421BqW implements Function1<RankListV2Response.RankInfo, Unit> {
    public C1811350xEj(Object obj) {
        super(1, obj, InterfaceC1811380xEm.class, "onItemClick", "onItemClick(Lcom/bytedance/android/livesdk/rank/list/model/RankListV2Response$RankInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RankListV2Response.RankInfo rankInfo) {
        ((InterfaceC1811380xEm) this.receiver).LIZIZ(rankInfo);
        return Unit.LIZ;
    }
}
