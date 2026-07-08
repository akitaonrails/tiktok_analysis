package com.bytedance.android.live.rank.impl.list.fragment.list;

import X.AbstractViewOnClickListenerC1105820esm;
import X.C16FS;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C786410Ut5;
import android.content.Context;
import android.util.SparseLongArray;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class ECListFragment extends RankListFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/HELIOSZiklOjt9LjctLiI2JjFiJSYgPGsJCgM6OzEKOy40JSAiPQ==";

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment
    public final void OR(C16FS c16fs, RankListV2Response.BottomBarButton bottomBarButton) {
        Boolean bool;
        C786410Ut5.LLJJJ(c16fs, 0);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            bool = (Boolean) dataChannelLJ.gg0(ECLiveStatusChangeChannel.class);
        } else {
            bool = null;
        }
        c16fs.setEnabled(C500260Jjc.LJJIJIL(bool));
        C786410Ut5.h8(c16fs, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xBn
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                String str;
                Room room;
                C1810410xDD c1810410xDD;
                RankTypeV2 rankTypeV2;
                Function0<Unit> function0 = this.LLILZIL.LLIZ;
                if (function0 != null) {
                    function0.invoke();
                }
                RankListController rankListController = this.LLILZIL.LLILZIL;
                if (rankListController == null || (c1810410xDD = rankListController.LLILLL) == null || (rankTypeV2 = c1810410xDD.LIZIZ) == null || (str = rankTypeV2.rankName) == null) {
                    str = RankTypeV2.LIZLLL.rankName;
                }
                IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                Context context = this.LLILZIL.getContext();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://ec/live_bag_list?room_id=");
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(this.LLILZIL);
                sbLIZ.append(dataChannelLJ2 != null ? Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannelLJ2)) : null);
                sbLIZ.append("&enter_from=");
                sbLIZ.append(str);
                iActionHandlerService.handle(context, C2188811AlT.LIZIZ(sbLIZ));
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                DataChannel dataChannelLJ3 = C475510Ikn.LJ(this.LLILZIL);
                C1810410xDD c1810410xDD2 = this.LLILZIL.LLILLL;
                c1810690xDf.getClass();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tiktokec_sale_rank_product_entrance_click");
                c474500IjALIZ.LJIJJLI(dataChannelLJ3);
                c474500IjALIZ.LJJII(C500260Jjc.LJIIZILJ(dataChannelLJ3) ? "1" : CardStruct.IStatusCode.DEFAULT, "is_self");
                SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                c474500IjALIZ.LJJII(Long.valueOf(C1810700xDg.LIZIZ(c1810410xDD2.LIZIZ.type, false)), "author_rank");
                c474500IjALIZ.LJJII(Long.valueOf((dataChannelLJ3 == null || (room = (Room) dataChannelLJ3.gg0(RoomChannel.class)) == null) ? 0L : room.getOwnerUserId()), "author_id");
                c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
                c474500IjALIZ.LJJII("live", "page_name");
                c474500IjALIZ.LJFF(C0IXW.LIZJ("user_live_duration"));
                c474500IjALIZ.LJJII(c1810410xDD2.LIZIZ.rankName, "rank_type");
                c474500IjALIZ.LIZ();
            }

            {
                super(1200L);
            }
        });
    }
}
