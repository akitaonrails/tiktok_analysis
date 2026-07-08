package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel;
import com.bytedance.android.livesdk.model.BoardItemPosition;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0xKU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1814920xKU extends C2217421BqW implements InterfaceC1631630sYr<Boolean, Integer, BoardItemPosition, C1814980xKa, Unit> {
    public C1814920xKU(BoardsDisplayViewModel boardsDisplayViewModel) {
        super(4, boardsDisplayViewModel, BoardsDisplayViewModel.class, "onMoveBoardItemOldId", "onMoveBoardItemOldId(ZILcom/bytedance/android/livesdk/model/BoardItemPosition;Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/base/BoardLogInfo;)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Boolean bool, Integer num, BoardItemPosition boardItemPosition, C1814980xKa c1814980xKa) {
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        BoardsDisplayViewModel boardsDisplayViewModel = (BoardsDisplayViewModel) this.receiver;
        boardsDisplayViewModel.getClass();
        boardsDisplayViewModel.yQ2(zBooleanValue, new C1776560wKc(iIntValue), boardItemPosition, c1814980xKa);
        return Unit.LIZ;
    }
}
