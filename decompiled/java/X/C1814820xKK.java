package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsFunctionsViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.util.BoardsPageDialogActionChannel;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xKK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814820xKK extends C09AY implements Function2<C03H5, C291001Au<? extends Pair<? extends AbstractC1814790xKH, ? extends Integer>>, Unit> {
    public final /* synthetic */ LiveBoardsPageDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814820xKK(LiveBoardsPageDialogFragment liveBoardsPageDialogFragment) {
        super(2);
        this.LL = liveBoardsPageDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Pair<? extends AbstractC1814790xKH, ? extends Integer>> c291001Au) {
        final EnumC994410bz5 enumC994410bz5;
        Pair<? extends AbstractC1814790xKH, ? extends Integer> pairLIZ = c291001Au.LIZ();
        if (pairLIZ != null) {
            LiveBoardsPageDialogFragment liveBoardsPageDialogFragment = this.LL;
            AbstractC1814790xKH first = pairLIZ.getFirst();
            int iIntValue = pairLIZ.getSecond().intValue();
            if (first != null) {
                DataChannel dataChannel = liveBoardsPageDialogFragment.dataChannel;
                if (dataChannel != null) {
                    if (iIntValue == 0) {
                        enumC994410bz5 = EnumC994410bz5.HIDE;
                    } else {
                        enumC994410bz5 = EnumC994410bz5.USE;
                    }
                    dataChannel.zW(BoardsPageDialogActionChannel.class, new AbstractC758480Tp8(enumC994410bz5) { // from class: X.0TpA
                        public final EnumC994410bz5 LIZ;

                        {
                            this.LIZ = enumC994410bz5;
                        }
                    });
                }
                AssemVMLazy assemVMLazy = liveBoardsPageDialogFragment.LLJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveBoardsPageDialogFragment.LLJILLL;
                LiveBoardsFunctionsViewModel liveBoardsFunctionsViewModel = (LiveBoardsFunctionsViewModel) assemVMLazy.getValue();
                Iterator<BoardItem> it2 = first.LIZ().boardItemList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    BoardItem next = it2.next();
                    if (C1697810uHb.LJIIJJI(4, 2).contains(Integer.valueOf(next.boardItemType))) {
                        if (next != null) {
                            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).updateContentBrandBoards(liveBoardsFunctionsViewModel.LL, iIntValue);
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
