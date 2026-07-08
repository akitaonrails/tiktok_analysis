package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;

/* JADX INFO: renamed from: X.01v4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C487201v4 extends C2217421BqW implements InterfaceC1631620sYq<Board, BoardItem, Boolean, C1814980xKa> {
    public C487201v4(Object obj) {
        super(3, obj, BoardsDisplayView.class, "buildBoardsLogInfo", "buildBoardsLogInfo(Lcom/bytedance/android/livesdk/model/Board;Lcom/bytedance/android/livesdk/model/BoardItem;Z)Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/base/BoardLogInfo;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C1814980xKa invoke(Board board, BoardItem boardItem, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        return ((BoardsDisplayView) this.receiver).LIZJ(board, boardItem, zBooleanValue);
    }
}
