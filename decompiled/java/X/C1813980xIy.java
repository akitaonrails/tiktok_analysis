package X;

import com.bytedance.android.live.BoardSaveEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.LiveIntelligentBoardUpsertViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.api.anchor.UpsertBoardResponse;

/* JADX INFO: renamed from: X.0xIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1813980xIy extends C09AY implements Function1<C1159750gHl, Unit> {
    public final /* synthetic */ C470590Icr<UpsertBoardResponse.ResponseData> LL;
    public final /* synthetic */ LiveIntelligentBoardUpsertViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1814370xJb LLILZ;
    public final /* synthetic */ Board LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813980xIy(C470590Icr<UpsertBoardResponse.ResponseData> c470590Icr, LiveIntelligentBoardUpsertViewModel liveIntelligentBoardUpsertViewModel, int i, C1814370xJb c1814370xJb, Board board, boolean z) {
        super(1);
        this.LL = c470590Icr;
        this.LLILLJJLI = liveIntelligentBoardUpsertViewModel;
        this.LLILLL = i;
        this.LLILZ = c1814370xJb;
        this.LLILZIL = board;
        this.LLILZLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1159750gHl c1159750gHl) {
        C291301Ax c291301AxVQ2;
        DataChannel dataChannel;
        C291301Ax c291301AxVQ22;
        DataChannel dataChannel2;
        UpsertBoardResponse.ResponseData responseData = this.LL.data;
        boolean z = false;
        if (responseData != null) {
            UpsertBoardResponse.ResponseData responseData2 = responseData;
            C1814370xJb c1814370xJb = this.LLILZ;
            Board board = this.LLILZIL;
            LiveIntelligentBoardUpsertViewModel liveIntelligentBoardUpsertViewModel = this.LLILLJJLI;
            int i = this.LLILLL;
            boolean z2 = this.LLILZLL;
            Board board2 = c1814370xJb.LIZ;
            board2.id = responseData2.boardId;
            board2.status = responseData2.boardStatus;
            String strLIZ = C1812880xHC.LIZ(board);
            C20337914i1<List<String>> c20337914i1 = InterfaceC772190UQv.d4;
            List<String> listLIZIZ = c20337914i1.LIZIZ();
            listLIZIZ.add(strLIZ);
            c20337914i1.LJFF(listLIZIZ);
            liveIntelligentBoardUpsertViewModel.setState(new C1814050xJ5(c1814370xJb));
            if (i != 0 && (c291301AxVQ22 = liveIntelligentBoardUpsertViewModel.vQ2()) != null && (dataChannel2 = c291301AxVQ22.LLILLJJLI) != null) {
                dataChannel2.LC0(BoardSaveEvent.class, new Pair(c1814370xJb, Boolean.TRUE));
            }
            Board board3 = c1814370xJb.LIZ;
            if (responseData2.boardStatus == 2) {
                z = true;
            }
            liveIntelligentBoardUpsertViewModel.wQ2(board3, z, z2, i);
        } else {
            this.LLILLJJLI.setState(new C1814030xJ3());
            if (this.LLILLL == 2 && (c291301AxVQ2 = this.LLILLJJLI.vQ2()) != null && (dataChannel = c291301AxVQ2.LLILLJJLI) != null) {
                dataChannel.LC0(BoardSaveEvent.class, new Pair(this.LLILZ, Boolean.FALSE));
            }
            this.LLILLJJLI.wQ2(this.LLILZ.LIZ, false, false, this.LLILLL);
        }
        return Unit.LIZ;
    }
}
