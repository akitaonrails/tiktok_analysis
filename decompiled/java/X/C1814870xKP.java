package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.EnableDoneEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xKP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814870xKP extends C09AY implements Function2<Long, C1814980xKa, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ BoardsDisplayView LLILLJJLI;
    public final /* synthetic */ Board LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814870xKP(boolean z, BoardsDisplayView boardsDisplayView, Board board) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = boardsDisplayView;
        this.LLILLL = board;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Long l, C1814980xKa c1814980xKa) {
        String string;
        Room roomLJJLIIIIJ;
        long jLongValue = l.longValue();
        C1814980xKa c1814980xKa2 = c1814980xKa;
        if (this.LL) {
            BoardsDisplayViewModel viewModel = this.LLILLJJLI.getViewModel();
            viewModel.getClass();
            viewModel.xQ2(new C1776890wL9(jLongValue), c1814980xKa2);
            DataChannel dataChannel = this.LLILLJJLI.getDataChannel();
            if (dataChannel != null) {
                dataChannel.LC0(EnableDoneEvent.class, Boolean.valueOf(!this.LLILLL.boardItemList.isEmpty()));
            }
        } else {
            BoardsDisplayViewModel viewModel2 = this.LLILLJJLI.getViewModel();
            viewModel2.getClass();
            viewModel2.xQ2(new C1776890wL9(jLongValue), c1814980xKa2);
            BoardsDisplayViewModel viewModel3 = this.LLILLJJLI.getViewModel();
            Board board = this.LLILLL;
            DataChannel dataChannel2 = this.LLILLJJLI.getDataChannel();
            if (dataChannel2 == null || (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) == null || (string = Long.valueOf(roomLJJLIIIIJ.getId()).toString()) == null) {
                string = "";
            }
            viewModel3.wQ2(board, string, 2);
        }
        return Unit.LIZ;
    }
}
