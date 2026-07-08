package X;

import com.bytedance.android.live.PreviewBoardRenderDoneEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView$renderDecorationToolBoard$2", f = "BoardsDisplayView.kt", l = {578}, m = "invokeSuspend")
public final class C1733880vDm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BoardsDisplayView LLILLJJLI;
    public final /* synthetic */ List<C1705720uUM> LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Board LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1733880vDm(BoardsDisplayView boardsDisplayView, List<C1705720uUM> list, Function1<? super Boolean, Unit> function1, boolean z, Board board, InterfaceC1364105Vn<? super C1733880vDm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = boardsDisplayView;
        this.LLILLL = list;
        this.LLILZ = function1;
        this.LLILZIL = z;
        this.LLILZLL = board;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1733880vDm(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        Room roomLJJLIIIIJ;
        C1C7U.LIZ("BoardsDisplayView@e00c.renderDecorationToolBoard$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            BoardsDisplayView boardsDisplayView = this.LLILLJJLI;
            List<C1705720uUM> list = this.LLILLL;
            C1733890vDn c1733890vDn = new C1733890vDn(boardsDisplayView);
            this.LL = 1;
            if (boardsDisplayView.LIZIZ(list, this, c1733890vDn) == objLJFF) {
                C1C7U.LIZIZ("BoardsDisplayView@e00c.renderDecorationToolBoard$2");
                return objLJFF;
            }
        }
        DataChannel dataChannel = this.LLILLJJLI.getDataChannel();
        if (dataChannel != null) {
            dataChannel.LC0(PreviewBoardRenderDoneEvent.class, true);
        }
        Function1<Boolean, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(true);
        }
        if (!this.LLILZIL) {
            BoardsDisplayViewModel viewModel = this.LLILLJJLI.getViewModel();
            Board board = this.LLILZLL;
            DataChannel dataChannel2 = this.LLILLJJLI.getDataChannel();
            if (dataChannel2 == null || (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel2)) == null || (string = C2286608xc.LJFF(roomLJJLIIIIJ.getId()).toString()) == null) {
                string = "";
            }
            viewModel.wQ2(board, string, 1);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BoardsDisplayView@e00c.renderDecorationToolBoard$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
