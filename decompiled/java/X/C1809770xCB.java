package X;

import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0xCB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809770xCB implements InterfaceC1809830xCH {
    public final DataChannel LIZ;
    public final String LIZIZ;
    public RankListV2Response.GapTileExtra LIZJ;

    @Override // X.InterfaceC1809830xCH
    public final void LIZ() {
        this.LIZJ = null;
    }

    @Override // X.InterfaceC1809830xCH
    public final RankListV2Response.GapTileExtra LIZIZ() {
        return this.LIZJ;
    }

    public C1809770xCB(DataChannel dataChannel, RankListController rankListController) {
        C1810410xDD c1810410xDD;
        RankTypeV2 rankTypeV2;
        String string;
        this.LIZ = dataChannel;
        this.LIZIZ = (rankListController == null || (c1810410xDD = rankListController.LLILLL) == null || (rankTypeV2 = c1810410xDD.LIZIZ) == null || (string = Integer.valueOf(rankTypeV2.type).toString()) == null) ? String.valueOf(RankTypeV2.LJJIJIIJI.type) : string;
    }
}
