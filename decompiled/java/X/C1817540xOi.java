package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditNavigationViewModel;
import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817540xOi extends C09AY implements Function1<BoardItem, Unit> {
    public final /* synthetic */ DecorationEditAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817540xOi(DecorationEditAssem decorationEditAssem) {
        super(1);
        this.LL = decorationEditAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(BoardItem boardItem) {
        String str;
        BoardItem boardItem2 = boardItem;
        DecorationEditNavigationViewModel decorationEditNavigationViewModelIp = this.LL.ip();
        int i = boardItem2.boardItemType;
        if (i != 5) {
            if (i != 6) {
                str = "existed_secondary_board";
            } else {
                str = "existed_scenery";
            }
        } else {
            str = "existed_text";
        }
        decorationEditNavigationViewModelIp.yQ2(str);
        this.LL.kp(boardItem2, false);
        return Unit.LIZ;
    }
}
