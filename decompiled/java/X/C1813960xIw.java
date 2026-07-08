package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel;
import com.bytedance.android.livesdk.model.Board;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.api.anchor.UpsertBoardResponse;

/* JADX INFO: renamed from: X.0xIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813960xIw extends C09AY implements Function1<C1158950gGT, Unit> {
    public final /* synthetic */ C470590Icr<UpsertBoardResponse.ResponseData> LL;
    public final /* synthetic */ LiveBoardUpsertViewModel LLILLJJLI;
    public final /* synthetic */ C1814370xJb LLILLL;
    public final /* synthetic */ Board LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813960xIw(C470590Icr<UpsertBoardResponse.ResponseData> c470590Icr, LiveBoardUpsertViewModel liveBoardUpsertViewModel, C1814370xJb c1814370xJb, Board board) {
        super(1);
        this.LL = c470590Icr;
        this.LLILLJJLI = liveBoardUpsertViewModel;
        this.LLILLL = c1814370xJb;
        this.LLILZ = board;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1158950gGT c1158950gGT) {
        UpsertBoardResponse.ResponseData responseData = this.LL.data;
        if (responseData != null) {
            UpsertBoardResponse.ResponseData responseData2 = responseData;
            C1814370xJb c1814370xJb = this.LLILLL;
            Board board = this.LLILZ;
            LiveBoardUpsertViewModel liveBoardUpsertViewModel = this.LLILLJJLI;
            Board board2 = c1814370xJb.LIZ;
            board2.id = responseData2.boardId;
            board2.status = responseData2.boardStatus;
            String strLIZ = C1812880xHC.LIZ(board);
            C20337914i1<List<String>> c20337914i1 = InterfaceC772190UQv.d4;
            List<String> listLIZIZ = c20337914i1.LIZIZ();
            listLIZIZ.add(strLIZ);
            c20337914i1.LJFF(listLIZIZ);
            liveBoardUpsertViewModel.setState(new C1814130xJD(c1814370xJb));
            C1790620whI.LJIIIZ();
        } else {
            this.LLILLJJLI.setState(new C1814080xJ8());
            C1790620whI.LJI("upsert_board");
            C1790620whI.LJIIIZ();
        }
        return Unit.LIZ;
    }
}
