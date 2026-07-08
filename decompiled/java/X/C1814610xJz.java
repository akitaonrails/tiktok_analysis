package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;
import com.bytedance.android.livesdk.model.Board;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import tikcast.api.anchor.GetBoardResponse;

/* JADX INFO: renamed from: X.0xJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814610xJz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C470590Icr<GetBoardResponse.ResponseData> LL;
    public final /* synthetic */ LiveBoardsPageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814610xJz(C470590Icr<GetBoardResponse.ResponseData> c470590Icr, LiveBoardsPageViewModel liveBoardsPageViewModel) {
        super(0);
        this.LL = c470590Icr;
        this.LLILLJJLI = liveBoardsPageViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Board board;
        InterfaceC1891350zJl interfaceC1891350zJl;
        C1814780xKG c1814780xKG;
        GetBoardResponse.ResponseData responseData = this.LL.data;
        if (responseData != null && (board = responseData.board) != null) {
            Board boardLIZ = C125700dr.LIZ(board);
            LiveBoardsPageViewModel liveBoardsPageViewModel = this.LLILLJJLI;
            List<ITEM> listListGetAll = liveBoardsPageViewModel.listGetAll();
            int i = -1;
            if (listListGetAll != 0) {
                int i2 = 0;
                interfaceC1891350zJl = null;
                for (Object obj : listListGetAll) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) obj;
                    if ((interfaceC1891350zJl2 instanceof AbstractC1814790xKH) && ((AbstractC1814790xKH) interfaceC1891350zJl2).LIZ().id == boardLIZ.id) {
                        i = i2;
                        interfaceC1891350zJl = interfaceC1891350zJl2;
                    }
                    i2 = i3;
                }
            } else {
                interfaceC1891350zJl = null;
            }
            if ((interfaceC1891350zJl instanceof C1814780xKG) && (c1814780xKG = (C1814780xKG) interfaceC1891350zJl) != null) {
                liveBoardsPageViewModel.listSetItemAt(i, C1814780xKG.LIZLLL(c1814780xKG, boardLIZ, false, boardLIZ.status, 22));
            }
        }
        return Unit.LIZ;
    }
}
