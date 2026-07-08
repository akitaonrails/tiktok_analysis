package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItemPosition;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xKQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814880xKQ extends C09AY implements InterfaceC1631630sYr<Boolean, Long, BoardItemPosition, C1814980xKa, Unit> {
    public final /* synthetic */ BoardsDisplayView LL;
    public final /* synthetic */ Board LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814880xKQ(BoardsDisplayView boardsDisplayView, Board board) {
        super(4);
        this.LL = boardsDisplayView;
        this.LLILLJJLI = board;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Boolean bool, Long l, BoardItemPosition boardItemPosition, C1814980xKa c1814980xKa) {
        String string;
        Room roomLJJLIIIIJ;
        boolean zBooleanValue = bool.booleanValue();
        long jLongValue = l.longValue();
        BoardsDisplayViewModel viewModel = this.LL.getViewModel();
        viewModel.getClass();
        viewModel.yQ2(zBooleanValue, new C1776890wL9(jLongValue), boardItemPosition, c1814980xKa);
        if (!zBooleanValue) {
            BoardsDisplayViewModel viewModel2 = this.LL.getViewModel();
            Board board = this.LLILLJJLI;
            DataChannel dataChannel = this.LL.getDataChannel();
            if (dataChannel == null || (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) == null || (string = Long.valueOf(roomLJJLIIIIJ.getId()).toString()) == null) {
                string = "";
            }
            viewModel2.wQ2(board, string, 2);
        }
        return Unit.LIZ;
    }
}
