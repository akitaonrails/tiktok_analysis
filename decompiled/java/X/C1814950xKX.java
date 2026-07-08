package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xKX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1814950xKX extends C2217421BqW implements Function2<Integer, C1814980xKa, Unit> {
    public C1814950xKX(BoardsDisplayViewModel boardsDisplayViewModel) {
        super(2, boardsDisplayViewModel, BoardsDisplayViewModel.class, "onDeleteBoardItemOldId", "onDeleteBoardItemOldId(ILcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/base/BoardLogInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, C1814980xKa c1814980xKa) {
        int iIntValue = num.intValue();
        BoardsDisplayViewModel boardsDisplayViewModel = (BoardsDisplayViewModel) this.receiver;
        boardsDisplayViewModel.getClass();
        boardsDisplayViewModel.xQ2(new C1776560wKc(iIntValue), c1814980xKa);
        return Unit.LIZ;
    }
}
