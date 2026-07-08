package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TJX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJX extends C09AY implements Function2<C03H5, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ LiveBoardsPageDialogFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TJX(LiveBoardsPageDialogFragment liveBoardsPageDialogFragment) {
        super(2);
        this.LL = liveBoardsPageDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Boolean> c291001Au) {
        if (Intrinsics.LJFF(c291001Au.LIZ(), Boolean.TRUE)) {
            View view = this.LL.LL;
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
        } else {
            View view2 = this.LL.LL;
            if (view2 != null) {
                C439101nJ.LJI(view2);
            }
        }
        return Unit.LIZ;
    }
}
