package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.cell.LiveBoardBlankCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819500xRs extends C09AY implements Function2<C03H5, Integer, Unit> {
    public final /* synthetic */ LiveBoardBlankCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1819500xRs(LiveBoardBlankCell liveBoardBlankCell) {
        super(2);
        this.LL = liveBoardBlankCell;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    this.LL.I5().setEnabled(false);
                }
            } else {
                this.LL.I5().setEnabled(true);
            }
        } else {
            this.LL.I5().setEnabled(false);
        }
        return Unit.LIZ;
    }
}
